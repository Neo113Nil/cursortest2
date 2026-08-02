package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ColorParser {
    public static final HashMap COLOR_MAP;
    public static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap hashMap = new HashMap();
        COLOR_MAP = hashMap;
        Fragment$5$$ExternalSyntheticOutline0.m(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        Fragment$5$$ExternalSyntheticOutline0.m(-8388652, (Integer) (-16711681), "aqua", "aquamarine", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-983041, hashMap, "azure", -657956, "beige");
        Fragment$5$$ExternalSyntheticOutline0.m(-6972, hashMap, "bisque", -16777216, "black");
        Fragment$5$$ExternalSyntheticOutline0.m(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        Fragment$5$$ExternalSyntheticOutline0.m(-7722014, hashMap, "blueviolet", -5952982, "brown");
        Fragment$5$$ExternalSyntheticOutline0.m(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        Fragment$5$$ExternalSyntheticOutline0.m(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        Fragment$5$$ExternalSyntheticOutline0.m(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        Fragment$5$$ExternalSyntheticOutline0.m(-1828, hashMap, "cornsilk", -2354116, "crimson");
        Fragment$5$$ExternalSyntheticOutline0.m(-16777077, (Integer) (-16711681), "cyan", "darkblue", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        Fragment$5$$ExternalSyntheticOutline0.m(-16751616, (Integer) (-5658199), "darkgray", "darkgreen", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-4343957, (Integer) (-5658199), "darkgrey", "darkkhaki", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        Fragment$5$$ExternalSyntheticOutline0.m(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        Fragment$5$$ExternalSyntheticOutline0.m(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        Fragment$5$$ExternalSyntheticOutline0.m(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        Fragment$5$$ExternalSyntheticOutline0.m(-7077677, (Integer) (-16724271), "darkturquoise", "darkviolet", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        Fragment$5$$ExternalSyntheticOutline0.m(-5103070, (Integer) (-14774017), "dodgerblue", "firebrick", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        Fragment$5$$ExternalSyntheticOutline0.m(-2302756, (Integer) (-65281), "fuchsia", "gainsboro", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        Fragment$5$$ExternalSyntheticOutline0.m(-16744448, hashMap, "green", -5374161, "greenyellow");
        Fragment$5$$ExternalSyntheticOutline0.m(-983056, (Integer) (-8355712), "grey", "honeydew", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-38476, hashMap, "hotpink", -3318692, "indianred");
        Fragment$5$$ExternalSyntheticOutline0.m(-11861886, hashMap, "indigo", -16, "ivory");
        Fragment$5$$ExternalSyntheticOutline0.m(-989556, hashMap, "khaki", -1644806, "lavender");
        Fragment$5$$ExternalSyntheticOutline0.m(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        Fragment$5$$ExternalSyntheticOutline0.m(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        Fragment$5$$ExternalSyntheticOutline0.m(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        Fragment$5$$ExternalSyntheticOutline0.m(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        Fragment$5$$ExternalSyntheticOutline0.m(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        Fragment$5$$ExternalSyntheticOutline0.m(-32, (Integer) (-5192482), "lightsteelblue", "lightyellow", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        Fragment$5$$ExternalSyntheticOutline0.m(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        Fragment$5$$ExternalSyntheticOutline0.m(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        Fragment$5$$ExternalSyntheticOutline0.m(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        Fragment$5$$ExternalSyntheticOutline0.m(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        Fragment$5$$ExternalSyntheticOutline0.m(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        Fragment$5$$ExternalSyntheticOutline0.m(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        Fragment$5$$ExternalSyntheticOutline0.m(-6943, hashMap, "mistyrose", -6987, "moccasin");
        Fragment$5$$ExternalSyntheticOutline0.m(-8531, hashMap, "navajowhite", -16777088, "navy");
        Fragment$5$$ExternalSyntheticOutline0.m(-133658, hashMap, "oldlace", -8355840, "olive");
        Fragment$5$$ExternalSyntheticOutline0.m(-9728477, hashMap, "olivedrab", -23296, "orange");
        Fragment$5$$ExternalSyntheticOutline0.m(-47872, hashMap, "orangered", -2461482, "orchid");
        Fragment$5$$ExternalSyntheticOutline0.m(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        Fragment$5$$ExternalSyntheticOutline0.m(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        Fragment$5$$ExternalSyntheticOutline0.m(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        Fragment$5$$ExternalSyntheticOutline0.m(-3308225, hashMap, "peru", -16181, "pink");
        Fragment$5$$ExternalSyntheticOutline0.m(-2252579, hashMap, "plum", -5185306, "powderblue");
        Fragment$5$$ExternalSyntheticOutline0.m(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        Fragment$5$$ExternalSyntheticOutline0.m(-65536, hashMap, "red", -4419697, "rosybrown");
        Fragment$5$$ExternalSyntheticOutline0.m(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        Fragment$5$$ExternalSyntheticOutline0.m(-360334, hashMap, "salmon", -744352, "sandybrown");
        Fragment$5$$ExternalSyntheticOutline0.m(-13726889, hashMap, "seagreen", -2578, "seashell");
        Fragment$5$$ExternalSyntheticOutline0.m(-6270419, hashMap, "sienna", -4144960, "silver");
        Fragment$5$$ExternalSyntheticOutline0.m(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        Fragment$5$$ExternalSyntheticOutline0.m(-16711809, (Integer) (-1286), "snow", "springgreen", hashMap);
        Fragment$5$$ExternalSyntheticOutline0.m(-12156236, hashMap, "steelblue", -2968436, "tan");
        Fragment$5$$ExternalSyntheticOutline0.m(-16744320, hashMap, "teal", -2572328, "thistle");
        Fragment$5$$ExternalSyntheticOutline0.m(-40121, hashMap, "tomato", 0, "transparent");
        Fragment$5$$ExternalSyntheticOutline0.m(-12525360, hashMap, "turquoise", -1146130, "violet");
        Fragment$5$$ExternalSyntheticOutline0.m(-663885, hashMap, "wheat", -1, "white");
        Fragment$5$$ExternalSyntheticOutline0.m(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int parseColorInternal(String str, boolean z) {
        int parseInt;
        Trace.checkArgument(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            Path$$ExternalSyntheticBUOutline0.m$3();
            return 0;
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = RGB_PATTERN.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) COLOR_MAP.get(Ascii.toLowerCase(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return 0;
    }
}
