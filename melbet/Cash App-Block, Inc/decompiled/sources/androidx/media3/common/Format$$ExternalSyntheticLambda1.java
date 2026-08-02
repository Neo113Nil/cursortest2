package androidx.media3.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CustomSpanBundler;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.text.VoiceSpan;
import androidx.media3.common.util.SystemClock;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final /* synthetic */ class Format$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0316  */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.common.base.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        boolean containsKey;
        float f;
        int i;
        String str;
        float f2;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4 = 3;
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                Label label = (Label) obj;
                return label.language + ": " + label.value;
            case 1:
                return Integer.valueOf(((Cue) obj).zIndex);
            case 2:
                return new DefaultAnalyticsCollector((SystemClock) obj);
            case 3:
                Extractor extractor = (Extractor) obj;
                extractor.getClass();
                return extractor.getClass().getSimpleName();
            case 4:
                return ImmutableList.copyOf((Collection) Maps.transform(((MediaPeriod) obj).getTrackGroups().trackGroups, new Format$$ExternalSyntheticLambda1(5)));
            case 5:
                return Integer.valueOf(((TrackGroup) obj).f871type);
            case 6:
                return Long.valueOf(((CuesWithTiming) obj).startTimeUs);
            case 7:
                return Long.valueOf(((CuesWithTiming) obj).durationUs);
            case 8:
                return (Track) obj;
            case 9:
                return (Track) obj;
            case 10:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(Cue.FIELD_TEXT);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(Cue.FIELD_CUSTOM_SPANS);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            Bundle bundle2 = (Bundle) it.next();
                            int i5 = bundle2.getInt(CustomSpanBundler.FIELD_START_INDEX);
                            int i6 = bundle2.getInt(CustomSpanBundler.FIELD_END_INDEX);
                            int i7 = bundle2.getInt(CustomSpanBundler.FIELD_FLAGS);
                            int i8 = bundle2.getInt(CustomSpanBundler.FIELD_TYPE, -1);
                            Bundle bundle3 = bundle2.getBundle(CustomSpanBundler.FIELD_PARAMS);
                            if (i8 == 1) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(RubySpan.FIELD_TEXT);
                                string2.getClass();
                                charSequence2.setSpan(new RubySpan(string2, bundle3.getInt(RubySpan.FIELD_POSITION)), i5, i6, i7);
                            } else if (i8 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new TextEmphasisSpan(bundle3.getInt(TextEmphasisSpan.FIELD_MARK_SHAPE), bundle3.getInt(TextEmphasisSpan.FIELD_MARK_FILL), bundle3.getInt(TextEmphasisSpan.FIELD_POSITION)), i5, i6, i7);
                            } else if (i8 == i4) {
                                charSequence2.setSpan(new HorizontalTextInVerticalContextSpan(), i5, i6, i7);
                            } else if (i8 == 4) {
                                bundle3.getClass();
                                String string3 = bundle3.getString(VoiceSpan.FIELD_NAME);
                                string3.getClass();
                                charSequence2.setSpan(new VoiceSpan(string3), i5, i6, i7);
                            }
                            i4 = 3;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Cue.FIELD_TEXT_ALIGNMENT);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Cue.FIELD_MULTI_ROW_ALIGNMENT);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(Cue.FIELD_BITMAP_PARCELABLE);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle.getByteArray(Cue.FIELD_BITMAP_BYTES);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str4 = Cue.FIELD_LINE;
                        containsKey = bundle.containsKey(str4);
                        int i9 = PKIFailureInfo.systemUnavail;
                        if (containsKey) {
                            String str5 = Cue.FIELD_LINE_TYPE;
                            if (bundle.containsKey(str5)) {
                                f = bundle.getFloat(str4);
                                i = bundle.getInt(str5);
                                String str6 = Cue.FIELD_LINE_ANCHOR;
                                int i10 = bundle.containsKey(str6) ? bundle.getInt(str6) : Integer.MIN_VALUE;
                                String str7 = Cue.FIELD_POSITION;
                                float f3 = bundle.containsKey(str7) ? bundle.getFloat(str7) : -3.4028235E38f;
                                String str8 = Cue.FIELD_POSITION_ANCHOR;
                                int i11 = bundle.containsKey(str8) ? bundle.getInt(str8) : Integer.MIN_VALUE;
                                str = Cue.FIELD_TEXT_SIZE;
                                if (bundle.containsKey(str)) {
                                    String str9 = Cue.FIELD_TEXT_SIZE_TYPE;
                                    if (bundle.containsKey(str9)) {
                                        f2 = bundle.getFloat(str);
                                        i2 = bundle.getInt(str9);
                                        String str10 = Cue.FIELD_SIZE;
                                        float f4 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        String str11 = Cue.FIELD_BITMAP_HEIGHT;
                                        float f5 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                                        str2 = Cue.FIELD_WINDOW_COLOR;
                                        if (bundle.containsKey(str2)) {
                                            i3 = -16777216;
                                            z = false;
                                        } else {
                                            i3 = bundle.getInt(str2);
                                        }
                                        int i12 = i3;
                                        boolean z2 = bundle.getBoolean(Cue.FIELD_WINDOW_COLOR_SET, false) ? false : z;
                                        str3 = Cue.FIELD_VERTICAL_TYPE;
                                        if (bundle.containsKey(str3)) {
                                            i9 = bundle.getInt(str3);
                                        }
                                        int i13 = i9;
                                        String str12 = Cue.FIELD_SHEAR_DEGREES;
                                        float f6 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : RecyclerView.DECELERATION_RATE;
                                        String str13 = Cue.FIELD_Z_INDEX;
                                        return new Cue(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f5, z2, i12, i13, f6, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f2 = -3.4028235E38f;
                                i2 = Integer.MIN_VALUE;
                                String str102 = Cue.FIELD_SIZE;
                                if (!bundle.containsKey(str102)) {
                                }
                                String str112 = Cue.FIELD_BITMAP_HEIGHT;
                                float f52 = bundle.containsKey(str112) ? bundle.getFloat(str112) : -3.4028235E38f;
                                str2 = Cue.FIELD_WINDOW_COLOR;
                                if (bundle.containsKey(str2)) {
                                }
                                int i122 = i3;
                                if (bundle.getBoolean(Cue.FIELD_WINDOW_COLOR_SET, false)) {
                                }
                                str3 = Cue.FIELD_VERTICAL_TYPE;
                                if (bundle.containsKey(str3)) {
                                }
                                int i132 = i9;
                                String str122 = Cue.FIELD_SHEAR_DEGREES;
                                float f62 = !bundle.containsKey(str122) ? bundle.getFloat(str122) : RecyclerView.DECELERATION_RATE;
                                String str132 = Cue.FIELD_Z_INDEX;
                                return new Cue(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f52, z2, i122, i132, f62, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                        String str62 = Cue.FIELD_LINE_ANCHOR;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = Cue.FIELD_POSITION;
                        if (bundle.containsKey(str72)) {
                        }
                        String str82 = Cue.FIELD_POSITION_ANCHOR;
                        if (bundle.containsKey(str82)) {
                        }
                        str = Cue.FIELD_TEXT_SIZE;
                        if (bundle.containsKey(str)) {
                        }
                        f2 = -3.4028235E38f;
                        i2 = Integer.MIN_VALUE;
                        String str1022 = Cue.FIELD_SIZE;
                        if (!bundle.containsKey(str1022)) {
                        }
                        String str1122 = Cue.FIELD_BITMAP_HEIGHT;
                        float f522 = bundle.containsKey(str1122) ? bundle.getFloat(str1122) : -3.4028235E38f;
                        str2 = Cue.FIELD_WINDOW_COLOR;
                        if (bundle.containsKey(str2)) {
                        }
                        int i1222 = i3;
                        if (bundle.getBoolean(Cue.FIELD_WINDOW_COLOR_SET, false)) {
                        }
                        str3 = Cue.FIELD_VERTICAL_TYPE;
                        if (bundle.containsKey(str3)) {
                        }
                        int i1322 = i9;
                        String str1222 = Cue.FIELD_SHEAR_DEGREES;
                        float f622 = !bundle.containsKey(str1222) ? bundle.getFloat(str1222) : RecyclerView.DECELERATION_RATE;
                        String str1322 = Cue.FIELD_Z_INDEX;
                        return new Cue(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f522, z2, i1222, i1322, f622, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                String str42 = Cue.FIELD_LINE;
                containsKey = bundle.containsKey(str42);
                int i92 = PKIFailureInfo.systemUnavail;
                if (containsKey) {
                }
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
                String str622 = Cue.FIELD_LINE_ANCHOR;
                if (bundle.containsKey(str622)) {
                }
                String str722 = Cue.FIELD_POSITION;
                if (bundle.containsKey(str722)) {
                }
                String str822 = Cue.FIELD_POSITION_ANCHOR;
                if (bundle.containsKey(str822)) {
                }
                str = Cue.FIELD_TEXT_SIZE;
                if (bundle.containsKey(str)) {
                }
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
                String str10222 = Cue.FIELD_SIZE;
                if (!bundle.containsKey(str10222)) {
                }
                String str11222 = Cue.FIELD_BITMAP_HEIGHT;
                float f5222 = bundle.containsKey(str11222) ? bundle.getFloat(str11222) : -3.4028235E38f;
                str2 = Cue.FIELD_WINDOW_COLOR;
                if (bundle.containsKey(str2)) {
                }
                int i12222 = i3;
                if (bundle.getBoolean(Cue.FIELD_WINDOW_COLOR_SET, false)) {
                }
                str3 = Cue.FIELD_VERTICAL_TYPE;
                if (bundle.containsKey(str3)) {
                }
                int i13222 = i92;
                String str12222 = Cue.FIELD_SHEAR_DEGREES;
                float f6222 = !bundle.containsKey(str12222) ? bundle.getFloat(str12222) : RecyclerView.DECELERATION_RATE;
                String str13222 = Cue.FIELD_Z_INDEX;
                return new Cue(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f5222, z2, i12222, i13222, f6222, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 11:
                Cue cue = (Cue) obj;
                Bitmap bitmap3 = cue.bitmap;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence3 = cue.text;
                if (charSequence3 != null) {
                    bundle4.putCharSequence(Cue.FIELD_TEXT, charSequence3);
                    if (charSequence3 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence3;
                        String str14 = CustomSpanBundler.FIELD_START_INDEX;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (RubySpan rubySpan : (RubySpan[]) spanned.getSpans(0, spanned.length(), RubySpan.class)) {
                            rubySpan.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(RubySpan.FIELD_TEXT, rubySpan.rubyText);
                            bundle5.putInt(RubySpan.FIELD_POSITION, rubySpan.position);
                            arrayList.add(CustomSpanBundler.spanToBundle(spanned, rubySpan, 1, bundle5));
                        }
                        for (TextEmphasisSpan textEmphasisSpan : (TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), TextEmphasisSpan.class)) {
                            textEmphasisSpan.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(TextEmphasisSpan.FIELD_MARK_SHAPE, textEmphasisSpan.markShape);
                            bundle6.putInt(TextEmphasisSpan.FIELD_MARK_FILL, textEmphasisSpan.markFill);
                            bundle6.putInt(TextEmphasisSpan.FIELD_POSITION, textEmphasisSpan.position);
                            arrayList.add(CustomSpanBundler.spanToBundle(spanned, textEmphasisSpan, 2, bundle6));
                        }
                        for (HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), HorizontalTextInVerticalContextSpan.class)) {
                            arrayList.add(CustomSpanBundler.spanToBundle(spanned, horizontalTextInVerticalContextSpan, 3, null));
                        }
                        for (VoiceSpan voiceSpan : (VoiceSpan[]) spanned.getSpans(0, spanned.length(), VoiceSpan.class)) {
                            voiceSpan.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(VoiceSpan.FIELD_NAME, voiceSpan.name);
                            arrayList.add(CustomSpanBundler.spanToBundle(spanned, voiceSpan, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(Cue.FIELD_CUSTOM_SPANS, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(Cue.FIELD_TEXT_ALIGNMENT, cue.textAlignment);
                bundle4.putSerializable(Cue.FIELD_MULTI_ROW_ALIGNMENT, cue.multiRowAlignment);
                bundle4.putFloat(Cue.FIELD_LINE, cue.line);
                bundle4.putInt(Cue.FIELD_LINE_TYPE, cue.lineType);
                bundle4.putInt(Cue.FIELD_LINE_ANCHOR, cue.lineAnchor);
                bundle4.putFloat(Cue.FIELD_POSITION, cue.position);
                bundle4.putInt(Cue.FIELD_POSITION_ANCHOR, cue.positionAnchor);
                bundle4.putInt(Cue.FIELD_TEXT_SIZE_TYPE, cue.textSizeType);
                bundle4.putFloat(Cue.FIELD_TEXT_SIZE, cue.textSize);
                bundle4.putFloat(Cue.FIELD_SIZE, cue.size);
                bundle4.putFloat(Cue.FIELD_BITMAP_HEIGHT, cue.bitmapHeight);
                bundle4.putBoolean(Cue.FIELD_WINDOW_COLOR_SET, cue.windowColorSet);
                bundle4.putInt(Cue.FIELD_WINDOW_COLOR, cue.windowColor);
                bundle4.putInt(Cue.FIELD_VERTICAL_TYPE, cue.verticalType);
                bundle4.putFloat(Cue.FIELD_SHEAR_DEGREES, cue.shearDegrees);
                bundle4.putInt(Cue.FIELD_Z_INDEX, cue.zIndex);
                if (bitmap3 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Trace.checkState(bitmap3.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(Cue.FIELD_BITMAP_BYTES, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            default:
                long j = ((CuesWithTiming) obj).startTimeUs;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    public /* synthetic */ Format$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
