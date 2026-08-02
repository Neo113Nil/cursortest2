package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes7.dex */
public abstract class y291 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        gia1.b(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        gia1.b(-16711681, hashMap, "aqua", -8388652, "aquamarine");
        gia1.b(-983041, hashMap, "azure", -657956, "beige");
        gia1.b(-6972, hashMap, "bisque", ModalContentViewContainer.BASE_SHADOW_COLOR, "black");
        gia1.b(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        gia1.b(-7722014, hashMap, "blueviolet", -5952982, "brown");
        gia1.b(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        gia1.b(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        gia1.b(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        gia1.b(-1828, hashMap, "cornsilk", -2354116, "crimson");
        gia1.b(-16711681, hashMap, "cyan", -16777077, "darkblue");
        gia1.b(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        gia1.b(-5658199, hashMap, "darkgray", -16751616, "darkgreen");
        gia1.b(-5658199, hashMap, "darkgrey", -4343957, "darkkhaki");
        gia1.b(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        gia1.b(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        gia1.b(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        gia1.b(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        gia1.b(-13676721, hashMap, "darkslategray", -13676721, "darkslategrey");
        gia1.b(-16724271, hashMap, "darkturquoise", -7077677, "darkviolet");
        gia1.b(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        gia1.b(-9868951, hashMap, "dimgray", -9868951, "dimgrey");
        gia1.b(-14774017, hashMap, "dodgerblue", -5103070, "firebrick");
        gia1.b(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        gia1.b(-65281, hashMap, "fuchsia", -2302756, "gainsboro");
        gia1.b(-460545, hashMap, "ghostwhite", -10496, "gold");
        gia1.b(-2448096, hashMap, "goldenrod", -8355712, "gray");
        gia1.b(-16744448, hashMap, "green", -5374161, "greenyellow");
        gia1.b(-8355712, hashMap, "grey", -983056, "honeydew");
        gia1.b(-38476, hashMap, "hotpink", -3318692, "indianred");
        gia1.b(-11861886, hashMap, "indigo", -16, "ivory");
        gia1.b(-989556, hashMap, "khaki", -1644806, "lavender");
        gia1.b(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        gia1.b(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        gia1.b(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        gia1.b(-329006, hashMap, "lightgoldenrodyellow", -2894893, "lightgray");
        gia1.b(-7278960, hashMap, "lightgreen", -2894893, "lightgrey");
        gia1.b(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        gia1.b(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        gia1.b(-8943463, hashMap, "lightslategray", -8943463, "lightslategrey");
        gia1.b(-5192482, hashMap, "lightsteelblue", -32, "lightyellow");
        gia1.b(DebugGraphView.DEFAULT_GRAPH_COLOR, hashMap, "lime", -13447886, "limegreen");
        gia1.b(-331546, hashMap, "linen", -65281, "magenta");
        gia1.b(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        gia1.b(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        gia1.b(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        gia1.b(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        gia1.b(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        gia1.b(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        gia1.b(-6943, hashMap, "mistyrose", -6987, "moccasin");
        gia1.b(-8531, hashMap, "navajowhite", -16777088, "navy");
        gia1.b(-133658, hashMap, "oldlace", -8355840, "olive");
        gia1.b(-9728477, hashMap, "olivedrab", -23296, "orange");
        gia1.b(-47872, hashMap, "orangered", -2461482, "orchid");
        gia1.b(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        gia1.b(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        gia1.b(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        gia1.b(-3308225, hashMap, "peru", -16181, "pink");
        gia1.b(-2252579, hashMap, "plum", -5185306, "powderblue");
        gia1.b(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        gia1.b(-65536, hashMap, "red", -4419697, "rosybrown");
        gia1.b(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        gia1.b(-360334, hashMap, "salmon", -744352, "sandybrown");
        gia1.b(-13726889, hashMap, "seagreen", -2578, "seashell");
        gia1.b(-6270419, hashMap, "sienna", -4144960, "silver");
        gia1.b(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        gia1.b(-9404272, hashMap, "slategray", -9404272, "slategrey");
        gia1.b(-1286, hashMap, "snow", -16711809, "springgreen");
        gia1.b(-12156236, hashMap, "steelblue", -2968436, "tan");
        gia1.b(-16744320, hashMap, "teal", -2572328, "thistle");
        gia1.b(-40121, hashMap, "tomato", 0, "transparent");
        gia1.b(-12525360, hashMap, "turquoise", -1146130, "violet");
        gia1.b(-663885, hashMap, "wheat", -1, "white");
        gia1.b(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            w511.q();
            return 0;
        }
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            w511.q();
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
            Integer num = (Integer) d.get(tea1.a(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        w511.q();
        return 0;
    }
}
