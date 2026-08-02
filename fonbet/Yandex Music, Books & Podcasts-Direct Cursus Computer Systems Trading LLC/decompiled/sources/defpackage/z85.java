package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class z85 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        su4.u(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        su4.w(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        su4.u(-983041, hashMap, "azure", -657956, "beige");
        su4.u(-6972, hashMap, "bisque", -16777216, "black");
        su4.u(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        su4.u(-7722014, hashMap, "blueviolet", -5952982, "brown");
        su4.u(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        su4.u(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        su4.u(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        su4.u(-1828, hashMap, "cornsilk", -2354116, "crimson");
        su4.w(hashMap, "cyan", -16711681, -16777077, "darkblue");
        su4.u(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        su4.w(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        su4.w(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        su4.u(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        su4.u(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        su4.u(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        su4.u(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        su4.w(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        su4.u(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        su4.w(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        su4.u(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        su4.w(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        su4.u(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        su4.u(-16744448, hashMap, "green", -5374161, "greenyellow");
        su4.w(hashMap, "grey", -8355712, -983056, "honeydew");
        su4.u(-38476, hashMap, "hotpink", -3318692, "indianred");
        su4.u(-11861886, hashMap, "indigo", -16, "ivory");
        su4.u(-989556, hashMap, "khaki", -1644806, "lavender");
        su4.u(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        su4.u(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        su4.u(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        su4.u(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        su4.u(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        su4.w(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        su4.u(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        su4.u(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        su4.u(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        su4.u(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        su4.u(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        su4.u(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        su4.u(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        su4.u(-6943, hashMap, "mistyrose", -6987, "moccasin");
        su4.u(-8531, hashMap, "navajowhite", -16777088, "navy");
        su4.u(-133658, hashMap, "oldlace", -8355840, "olive");
        su4.u(-9728477, hashMap, "olivedrab", -23296, "orange");
        su4.u(-47872, hashMap, "orangered", -2461482, "orchid");
        su4.u(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        su4.u(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        su4.u(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        su4.u(-3308225, hashMap, "peru", -16181, "pink");
        su4.u(-2252579, hashMap, "plum", -5185306, "powderblue");
        su4.u(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        su4.u(-65536, hashMap, "red", -4419697, "rosybrown");
        su4.u(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        su4.u(-360334, hashMap, "salmon", -744352, "sandybrown");
        su4.u(-13726889, hashMap, "seagreen", -2578, "seashell");
        su4.u(-6270419, hashMap, "sienna", -4144960, "silver");
        su4.u(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        su4.w(hashMap, "snow", -1286, -16711809, "springgreen");
        su4.u(-12156236, hashMap, "steelblue", -2968436, "tan");
        su4.u(-16744320, hashMap, "teal", -2572328, "thistle");
        su4.u(-40121, hashMap, "tomato", 0, "transparent");
        su4.u(-12525360, hashMap, "turquoise", -1146130, "violet");
        su4.u(-663885, hashMap, "wheat", -1, "white");
        su4.u(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int parseInt;
        vq1.v(!TextUtils.isEmpty(str));
        String replace = str.replace(StringUtil.SPACE, "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (parseLong >>> 8);
            }
            e7o.e();
            return 0;
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(replace);
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
            Matcher matcher2 = a.matcher(replace);
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
            Integer num = (Integer) d.get(ltg.M(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        e7o.e();
        return 0;
    }
}
