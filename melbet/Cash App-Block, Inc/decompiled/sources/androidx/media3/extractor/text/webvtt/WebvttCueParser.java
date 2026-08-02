package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.VoiceSpan;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class WebvttCueParser {
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map DEFAULT_BACKGROUND_COLORS;
    public static final Map DEFAULT_TEXT_COLORS;

    public final class Element {
        public static final ng$$ExternalSyntheticLambda0 BY_START_POSITION_ASC = new ng$$ExternalSyntheticLambda0(18);
        public final int endPosition;
        public final StartTag startTag;

        public Element(StartTag startTag, int i) {
            this.startTag = startTag;
            this.endPosition = i;
        }
    }

    public final class StartTag {
        public final Set classes;
        public final String name;
        public final int position;
        public final String voice;

        public StartTag(String str, int i, String str2, Set set) {
            this.position = i;
            this.name = str;
            this.voice = str2;
            this.classes = set;
        }
    }

    public final class StyleMatch implements Comparable {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
            this.score = i;
            this.style = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return Integer.compare(this.score, ((StyleMatch) obj).score);
        }
    }

    public final class WebvttCueInfoBuilder {
        public CharSequence text;
        public long startTimeUs = 0;
        public long endTimeUs = 0;
        public int textAlignment = 2;
        public float line = -3.4028235E38f;
        public int lineType = 1;
        public int lineAnchor = 0;
        public float position = -3.4028235E38f;
        public int positionAnchor = PKIFailureInfo.systemUnavail;
        public float size = 1.0f;
        public int verticalType = PKIFailureInfo.systemUnavail;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
        
            if (r7 == 0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Cue.Builder toCueBuilder() {
            Layout.Alignment alignment;
            float f;
            CharSequence charSequence;
            float f2 = this.position;
            float f3 = -3.4028235E38f;
            if (f2 == -3.4028235E38f) {
                int i = this.textAlignment;
                f2 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
            }
            int i2 = this.positionAnchor;
            if (i2 == Integer.MIN_VALUE) {
                int i3 = this.textAlignment;
                if (i3 != 1) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                i2 = 1;
                            }
                        }
                    }
                    i2 = 2;
                }
                i2 = 0;
            }
            Cue.Builder builder = new Cue.Builder();
            int i4 = this.textAlignment;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                Fragment$5$$ExternalSyntheticOutline0.m(i4, "Unknown textAlignment: ", "WebvttCueParser");
                                alignment = null;
                            }
                        }
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                builder.textAlignment = alignment;
                f = this.line;
                int i5 = this.lineType;
                if (f != -3.4028235E38f || i5 != 0 || (f >= RecyclerView.DECELERATION_RATE && f <= 1.0f)) {
                    if (f == -3.4028235E38f) {
                        f3 = f;
                    }
                    builder.line = f3;
                    builder.lineType = i5;
                    builder.lineAnchor = this.lineAnchor;
                    builder.position = f2;
                    builder.positionAnchor = i2;
                    float f4 = this.size;
                    if (i2 == 0) {
                        f2 = 1.0f - f2;
                    } else if (i2 == 1) {
                        f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                    } else if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1(String.valueOf(i2));
                        return null;
                    }
                    builder.size = Math.min(f4, f2);
                    builder.verticalType = this.verticalType;
                    charSequence = this.text;
                    if (charSequence != null) {
                        builder.text = charSequence;
                        builder.bitmap = null;
                    }
                    return builder;
                }
                f3 = 1.0f;
                builder.line = f3;
                builder.lineType = i5;
                builder.lineAnchor = this.lineAnchor;
                builder.position = f2;
                builder.positionAnchor = i2;
                float f42 = this.size;
                if (i2 == 0) {
                }
                builder.size = Math.min(f42, f2);
                builder.verticalType = this.verticalType;
                charSequence = this.text;
                if (charSequence != null) {
                }
                return builder;
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            builder.textAlignment = alignment;
            f = this.line;
            int i52 = this.lineType;
            if (f != -3.4028235E38f) {
            }
            if (f == -3.4028235E38f) {
            }
            builder.line = f3;
            builder.lineType = i52;
            builder.lineAnchor = this.lineAnchor;
            builder.position = f2;
            builder.positionAnchor = i2;
            float f422 = this.size;
            if (i2 == 0) {
            }
            builder.size = Math.min(f422, f2);
            builder.verticalType = this.verticalType;
            charSequence = this.text;
            if (charSequence != null) {
            }
            return builder;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void applySpansForTag(String str, StartTag startTag, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        int i;
        int i2;
        int i3;
        int i4 = startTag.position;
        int length = spannableStringBuilder.length();
        String str2 = startTag.name;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : startTag.classes) {
                    Map map = DEFAULT_TEXT_COLORS;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = DEFAULT_BACKGROUND_COLORS;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new VoiceSpan(startTag.voice), i4, length, 33);
                break;
            case 7:
                int rubyPosition = getRubyPosition(list2, str, startTag);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, Element.BY_START_POSITION_ASC);
                int i6 = startTag.position;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((Element) arrayList.get(i7)).startTag.name)) {
                        Element element = (Element) arrayList.get(i7);
                        int rubyPosition2 = getRubyPosition(list2, str, element.startTag);
                        if (rubyPosition2 == i5) {
                            rubyPosition2 = rubyPosition != i5 ? rubyPosition : 1;
                        }
                        int i9 = element.startTag.position - i8;
                        int i10 = element.endPosition - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new RubySpan(subSequence.toString(), rubyPosition2), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList applicableStyles = getApplicableStyles(list2, str, startTag);
        for (int i11 = 0; i11 < applicableStyles.size(); i11++) {
            WebvttCssStyle webvttCssStyle = ((StyleMatch) applicableStyles.get(i11)).style;
            int i12 = webvttCssStyle.bold;
            if (i12 == -1 && webvttCssStyle.italic == -1) {
                i = -1;
            } else {
                i = (webvttCssStyle.italic == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = webvttCssStyle.bold;
                if (i13 == -1 && webvttCssStyle.italic == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (webvttCssStyle.italic == 1 ? 2 : 0);
                }
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (webvttCssStyle.linethrough == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (webvttCssStyle.underline == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (webvttCssStyle.hasFontColor) {
                if (!webvttCssStyle.hasFontColor) {
                    a$$ExternalSyntheticBUOutline0.m$1("Font color not defined");
                    return;
                }
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.fontColor), i4, length);
            }
            if (webvttCssStyle.hasBackgroundColor) {
                if (!webvttCssStyle.hasBackgroundColor) {
                    a$$ExternalSyntheticBUOutline0.m$1("Background color not defined.");
                    return;
                }
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.backgroundColor), i4, length);
            }
            if (webvttCssStyle.fontFamily != null) {
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.fontFamily), i4, length);
            }
            int i14 = webvttCssStyle.fontSizeUnit;
            if (i14 == 1) {
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.fontSize, true), i4, length);
            } else if (i14 == 2) {
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.fontSize), i4, length);
            } else if (i14 == 3) {
                SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.fontSize / 100.0f), i4, length);
            }
            if (webvttCssStyle.combineUpright) {
                spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList getApplicableStyles(List list, String str, StartTag startTag) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i);
            String str2 = startTag.name;
            Set set = startTag.classes;
            String str3 = startTag.voice;
            if (webvttCssStyle.targetId.isEmpty() && webvttCssStyle.targetTag.isEmpty() && webvttCssStyle.targetClasses.isEmpty() && webvttCssStyle.targetVoice.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int updateScoreForMatch = WebvttCssStyle.updateScoreForMatch(webvttCssStyle.targetVoice, WebvttCssStyle.updateScoreForMatch(webvttCssStyle.targetTag, WebvttCssStyle.updateScoreForMatch(webvttCssStyle.targetId, 0, 1073741824, str), 2, str2), 4, str3);
                size = (updateScoreForMatch == -1 || !set.containsAll(webvttCssStyle.targetClasses)) ? 0 : updateScoreForMatch + (webvttCssStyle.targetClasses.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new StyleMatch(size, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int getRubyPosition(List list, String str, StartTag startTag) {
        ArrayList applicableStyles = getApplicableStyles(list, str, startTag);
        for (int i = 0; i < applicableStyles.size(); i++) {
            int i2 = ((StyleMatch) applicableStyles.get(i)).style.rubyPosition;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static WebvttCueInfo parseCue(String str, Matcher matcher, ParsableByteArray parsableByteArray, ArrayList arrayList) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            String group = matcher.group(1);
            group.getClass();
            webvttCueInfoBuilder.startTimeUs = WebvttParserUtil.parseTimestampUs(group);
            String group2 = matcher.group(2);
            group2.getClass();
            webvttCueInfoBuilder.endTimeUs = WebvttParserUtil.parseTimestampUs(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            parseCueSettingsList(group3, webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            parsableByteArray.getClass();
            String readLine = parsableByteArray.readLine(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(readLine)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(readLine.trim());
                readLine = parsableByteArray.readLine(StandardCharsets.UTF_8);
            }
            webvttCueInfoBuilder.text = parseCueText(str, sb.toString(), arrayList);
            return new WebvttCueInfo(webvttCueInfoBuilder.toCueBuilder().build(), webvttCueInfoBuilder.startTimeUs, webvttCueInfoBuilder.endTimeUs);
        } catch (IllegalArgumentException unused) {
            Log.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0086, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseCueSettingsList(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int i;
        int i2;
        int i3;
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    parseLineAttribute(group2, webvttCueInfoBuilder);
                } else {
                    char c = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            case false:
                            case true:
                                i = 2;
                                break;
                            case true:
                                i = 3;
                                break;
                            case true:
                                i = 4;
                                break;
                            case true:
                                i = 5;
                                break;
                            case true:
                                i = 1;
                                break;
                            default:
                                Log.w("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        webvttCueInfoBuilder.textAlignment = i;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                case 5:
                                    i2 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i2 = 1;
                                    break;
                                case 2:
                                case 4:
                                    i2 = 2;
                                    break;
                                default:
                                    Log.w("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            webvttCueInfoBuilder.positionAnchor = i2;
                            group2 = group2.substring(0, indexOf);
                        }
                        webvttCueInfoBuilder.position = WebvttParserUtil.parsePercentage(group2);
                    } else if ("size".equals(group)) {
                        webvttCueInfoBuilder.size = WebvttParserUtil.parsePercentage(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i3 = 2;
                        } else if (group2.equals("rl")) {
                            i3 = 1;
                        } else {
                            Log.w("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i3 = Integer.MIN_VALUE;
                        }
                        webvttCueInfoBuilder.verticalType = i3;
                    } else {
                        Log.w("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                Log.w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString parseCueText(String str, String str2, List list) {
        char c;
        char c2;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    applySpansForTag(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                applySpansForTag(str, new StartTag("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.w("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        Trace.checkArgument(!trim.isEmpty());
                        String str4 = Util.DEVICE_DEBUG_INFO;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 98:
                                if (str5.equals("b")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 99:
                                if (str5.equals("c")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 117:
                                if (str5.equals("u")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 118:
                                if (str5.equals("v")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        StartTag startTag = (StartTag) arrayDeque.pop();
                                        applySpansForTag(str, startTag, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new Element(startTag, spannableStringBuilder.length()));
                                        }
                                        if (startTag.name.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    Trace.checkArgument(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c2 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < split.length; i5++) {
                                        hashSet.add(split[i5]);
                                    }
                                    arrayDeque.push(new StartTag(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            }
        }
    }

    public static void parseLineAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = PKIFailureInfo.systemUnavail;
                    break;
            }
            webvttCueInfoBuilder.lineAnchor = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.line = WebvttParserUtil.parsePercentage(str);
            webvttCueInfoBuilder.lineType = 0;
        } else {
            webvttCueInfoBuilder.line = Integer.parseInt(str);
            webvttCueInfoBuilder.lineType = 1;
        }
    }
}
