package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class TtmlNode {
    public ArrayList children;
    public final long endTimeUs;
    public final String imageId;
    public final boolean isTextNode;
    public final HashMap nodeEndsByRegion;
    public final HashMap nodeStartsByRegion;
    public final TtmlNode parent;
    public final String regionId;
    public final long startTimeUs;
    public final TtmlStyle style;
    public final String[] styleIds;
    public final String tag;
    public final String text;

    public TtmlNode(String str, String str2, long j, long j2, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, TtmlNode ttmlNode) {
        this.tag = str;
        this.text = str2;
        this.imageId = str4;
        this.style = ttmlStyle;
        this.styleIds = strArr;
        this.isTextNode = str2 != null;
        this.startTimeUs = j;
        this.endTimeUs = j2;
        str3.getClass();
        this.regionId = str3;
        this.parent = ttmlNode;
        this.nodeStartsByRegion = new HashMap();
        this.nodeEndsByRegion = new HashMap();
    }

    public static TtmlNode buildTextNode(String str) {
        return new TtmlNode(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder getRegionOutputText(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.text = new SpannableStringBuilder();
            builder.bitmap = null;
            treeMap.put(str, builder);
        }
        CharSequence charSequence = ((Cue.Builder) treeMap.get(str)).text;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final TtmlNode getChild(int i) {
        ArrayList arrayList = this.children;
        if (arrayList != null) {
            return (TtmlNode) arrayList.get(i);
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
        return null;
    }

    public final int getChildCount() {
        ArrayList arrayList = this.children;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void getEventTimes(TreeSet treeSet, boolean z) {
        String str = this.tag;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.imageId != null)) {
            long j = this.startTimeUs;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.endTimeUs;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.children == null) {
            return;
        }
        for (int i = 0; i < this.children.size(); i++) {
            ((TtmlNode) this.children.get(i)).getEventTimes(treeSet, z || equals);
        }
    }

    public final boolean isActive(long j) {
        long j2 = this.startTimeUs;
        long j3 = this.endTimeUs;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void traverseForImage(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.regionId;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (isActive(j) && "div".equals(this.tag) && (str2 = this.imageId) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChild(i).traverseForImage(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void traverseForStyle(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        TtmlNode ttmlNode;
        int i2;
        TtmlStyle resolveStyle;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        Map map2 = map;
        if (isActive(j)) {
            String str2 = this.regionId;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.nodeEndsByRegion.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.nodeStartsByRegion;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    Cue.Builder builder = (Cue.Builder) treeMap.get(str4);
                    builder.getClass();
                    TtmlRegion ttmlRegion = (TtmlRegion) hashMap.get(str3);
                    ttmlRegion.getClass();
                    int i7 = ttmlRegion.verticalType;
                    TtmlStyle resolveStyle2 = TtmlRenderUtil.resolveStyle(this.style, this.styleIds, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) builder.text;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        builder.text = spannableStringBuilder;
                        builder.bitmap = null;
                    }
                    if (resolveStyle2 != null) {
                        int i8 = resolveStyle2.bold;
                        int i9 = 1;
                        if (((i8 == -1 && resolveStyle2.italic == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (resolveStyle2.italic == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i10 = resolveStyle2.bold;
                            if (i10 == -1) {
                                if (resolveStyle2.italic == -1) {
                                    i6 = -1;
                                    i9 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i6);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i9 = 1;
                                }
                            }
                            i6 = (i10 == i9 ? i9 : 0) | (resolveStyle2.italic == i9 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i6);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (resolveStyle2.linethrough == i9) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (resolveStyle2.underline == i9) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (resolveStyle2.hasFontColor) {
                            if (!resolveStyle2.hasFontColor) {
                                a$$ExternalSyntheticBUOutline0.m$1("Font color has not been defined.");
                                return;
                            }
                            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(resolveStyle2.fontColor), intValue, intValue2);
                        }
                        if (resolveStyle2.hasBackgroundColor) {
                            if (!resolveStyle2.hasBackgroundColor) {
                                a$$ExternalSyntheticBUOutline0.m$1("Background color has not been defined.");
                                return;
                            }
                            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(resolveStyle2.backgroundColor), intValue, intValue2);
                        }
                        if (resolveStyle2.fontFamily != null) {
                            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(resolveStyle2.fontFamily), intValue, intValue2);
                        }
                        TextEmphasis textEmphasis = resolveStyle2.textEmphasis;
                        if (textEmphasis != null) {
                            int i11 = textEmphasis.markShape;
                            if (i11 == -1) {
                                i11 = (i7 == 2 || i7 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = textEmphasis.markFill;
                            }
                            int i12 = textEmphasis.position;
                            if (i12 == -2) {
                                i12 = 1;
                            }
                            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TextEmphasisSpan(i11, i5, i12), intValue, intValue2);
                        }
                        int i13 = resolveStyle2.rubyType;
                        if (i13 == 2) {
                            TtmlNode ttmlNode2 = this.parent;
                            while (true) {
                                if (ttmlNode2 == null) {
                                    ttmlNode2 = null;
                                    break;
                                }
                                TtmlStyle resolveStyle3 = TtmlRenderUtil.resolveStyle(ttmlNode2.style, ttmlNode2.styleIds, map2);
                                if (resolveStyle3 != null && resolveStyle3.rubyType == 1) {
                                    break;
                                } else {
                                    ttmlNode2 = ttmlNode2.parent;
                                }
                            }
                            if (ttmlNode2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ttmlNode2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ttmlNode = null;
                                        break;
                                    }
                                    TtmlNode ttmlNode3 = (TtmlNode) arrayDeque.pop();
                                    TtmlStyle resolveStyle4 = TtmlRenderUtil.resolveStyle(ttmlNode3.style, ttmlNode3.styleIds, map2);
                                    if (resolveStyle4 != null && resolveStyle4.rubyType == 3) {
                                        ttmlNode = ttmlNode3;
                                        break;
                                    }
                                    for (int childCount = ttmlNode3.getChildCount() - 1; childCount >= 0; childCount--) {
                                        arrayDeque.push(ttmlNode3.getChild(childCount));
                                    }
                                }
                                if (ttmlNode != null) {
                                    if (ttmlNode.getChildCount() == 1) {
                                        i2 = 0;
                                        if (ttmlNode.getChild(0).text != null) {
                                            String str5 = ttmlNode.getChild(0).text;
                                            String str6 = Util.DEVICE_DEBUG_INFO;
                                            TtmlStyle resolveStyle5 = TtmlRenderUtil.resolveStyle(ttmlNode.style, ttmlNode.styleIds, map2);
                                            int i14 = resolveStyle5 != null ? resolveStyle5.rubyPosition : -1;
                                            if (i14 == -1 && (resolveStyle = TtmlRenderUtil.resolveStyle(ttmlNode2.style, ttmlNode2.styleIds, map2)) != null) {
                                                i14 = resolveStyle.rubyPosition;
                                            }
                                            spannableStringBuilder.setSpan(new RubySpan(str5, i14), intValue, intValue2, 33);
                                            if (resolveStyle2.textCombine == 1) {
                                                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), intValue, intValue2);
                                            }
                                            i3 = resolveStyle2.fontSizeUnit;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) resolveStyle2.fontSize, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(resolveStyle2.fontSize), intValue, intValue2);
                                            } else if (i3 != 3) {
                                                it = it2;
                                                f = 100.0f;
                                            } else {
                                                float f3 = resolveStyle2.fontSize / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i15 = i2;
                                                float f4 = f3;
                                                int i16 = i15;
                                                while (i16 < length) {
                                                    float f5 = f2;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i16];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f4 = relativeSizeSpan.getSizeChange() * f4;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i4 = i16;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i4 = i16;
                                                    }
                                                    i16 = i4 + 1;
                                                    f2 = f5;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f = f2;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                            }
                                            if ("p".equals(this.tag)) {
                                                float f6 = resolveStyle2.shearPercentage;
                                                if (f6 != Float.MAX_VALUE) {
                                                    builder.shearDegrees = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = resolveStyle2.textAlign;
                                                if (alignment != null) {
                                                    builder.textAlignment = alignment;
                                                }
                                                Layout.Alignment alignment2 = resolveStyle2.multiRowAlign;
                                                if (alignment2 != null) {
                                                    builder.multiRowAlignment = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (resolveStyle2.textCombine == 1) {
                                    }
                                    i3 = resolveStyle2.fontSizeUnit;
                                    float f22 = 100.0f;
                                    if (i3 == 1) {
                                    }
                                    if ("p".equals(this.tag)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i13 == 3 || i13 == 4) {
                            spannableStringBuilder.setSpan(new DeleteTextSpan(), intValue, intValue2, 33);
                        }
                        i2 = 0;
                        if (resolveStyle2.textCombine == 1) {
                        }
                        i3 = resolveStyle2.fontSizeUnit;
                        float f222 = 100.0f;
                        if (i3 == 1) {
                        }
                        if ("p".equals(this.tag)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i17 = 0;
            while (i17 < getChildCount()) {
                getChild(i17).traverseForStyle(j, map2, hashMap, str3, treeMap);
                i17++;
                map2 = map;
            }
        }
    }

    public final void traverseForText(long j, boolean z, String str, TreeMap treeMap) {
        HashMap hashMap = this.nodeStartsByRegion;
        hashMap.clear();
        HashMap hashMap2 = this.nodeEndsByRegion;
        hashMap2.clear();
        String str2 = this.tag;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.regionId;
        String str4 = "".equals(str3) ? str : str3;
        if (this.isTextNode && z) {
            SpannableStringBuilder regionOutputText = getRegionOutputText(str4, treeMap);
            String str5 = this.text;
            str5.getClass();
            regionOutputText.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            getRegionOutputText(str4, treeMap).append('\n');
            return;
        }
        if (isActive(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((Cue.Builder) entry.getValue()).text;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < getChildCount(); i++) {
                getChild(i).traverseForText(j, z || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder regionOutputText2 = getRegionOutputText(str4, treeMap);
                int length = regionOutputText2.length() - 1;
                while (length >= 0 && regionOutputText2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && regionOutputText2.charAt(length) != '\n') {
                    regionOutputText2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((Cue.Builder) entry2.getValue()).text;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
