package com.anythink.basead.exoplayer.k;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9168a = "rgb";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9169b = "rgba";

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f9170c = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f9171d = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f9172e = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f9173f;

    static {
        HashMap hashMap = new HashMap();
        f9173f = hashMap;
        hashMap.put("aliceblue", -984833);
        hashMap.put("antiquewhite", -332841);
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        com.IceFishing.LiveIceFishing.k.u(-983041, hashMap, "azure", -657956, "beige");
        com.IceFishing.LiveIceFishing.k.u(-6972, hashMap, "bisque", -16777216, "black");
        com.IceFishing.LiveIceFishing.k.u(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        com.IceFishing.LiveIceFishing.k.u(-7722014, hashMap, "blueviolet", -5952982, "brown");
        com.IceFishing.LiveIceFishing.k.u(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        com.IceFishing.LiveIceFishing.k.u(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        com.IceFishing.LiveIceFishing.k.u(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        com.IceFishing.LiveIceFishing.k.u(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        com.IceFishing.LiveIceFishing.k.u(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        com.IceFishing.LiveIceFishing.k.u(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        com.IceFishing.LiveIceFishing.k.u(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        com.IceFishing.LiveIceFishing.k.u(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        com.IceFishing.LiveIceFishing.k.u(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        com.IceFishing.LiveIceFishing.k.u(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        com.IceFishing.LiveIceFishing.k.u(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        com.IceFishing.LiveIceFishing.k.u(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        com.IceFishing.LiveIceFishing.k.u(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        com.IceFishing.LiveIceFishing.k.u(-38476, hashMap, "hotpink", -3318692, "indianred");
        com.IceFishing.LiveIceFishing.k.u(-11861886, hashMap, "indigo", -16, "ivory");
        com.IceFishing.LiveIceFishing.k.u(-989556, hashMap, "khaki", -1644806, "lavender");
        com.IceFishing.LiveIceFishing.k.u(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        com.IceFishing.LiveIceFishing.k.u(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        com.IceFishing.LiveIceFishing.k.u(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        com.IceFishing.LiveIceFishing.k.u(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        com.IceFishing.LiveIceFishing.k.u(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        com.IceFishing.LiveIceFishing.k.u(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        com.IceFishing.LiveIceFishing.k.u(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        com.IceFishing.LiveIceFishing.k.u(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        com.IceFishing.LiveIceFishing.k.u(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        com.IceFishing.LiveIceFishing.k.u(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        com.IceFishing.LiveIceFishing.k.u(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        com.IceFishing.LiveIceFishing.k.u(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        com.IceFishing.LiveIceFishing.k.u(-6943, hashMap, "mistyrose", -6987, "moccasin");
        com.IceFishing.LiveIceFishing.k.u(-8531, hashMap, "navajowhite", -16777088, "navy");
        com.IceFishing.LiveIceFishing.k.u(-133658, hashMap, "oldlace", -8355840, "olive");
        com.IceFishing.LiveIceFishing.k.u(-9728477, hashMap, "olivedrab", -23296, "orange");
        com.IceFishing.LiveIceFishing.k.u(-47872, hashMap, "orangered", -2461482, "orchid");
        com.IceFishing.LiveIceFishing.k.u(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        com.IceFishing.LiveIceFishing.k.u(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        com.IceFishing.LiveIceFishing.k.u(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        com.IceFishing.LiveIceFishing.k.u(-3308225, hashMap, "peru", -16181, "pink");
        com.IceFishing.LiveIceFishing.k.u(-2252579, hashMap, "plum", -5185306, "powderblue");
        com.IceFishing.LiveIceFishing.k.u(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        com.IceFishing.LiveIceFishing.k.u(-65536, hashMap, "red", -4419697, "rosybrown");
        com.IceFishing.LiveIceFishing.k.u(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        com.IceFishing.LiveIceFishing.k.u(-360334, hashMap, "salmon", -744352, "sandybrown");
        com.IceFishing.LiveIceFishing.k.u(-13726889, hashMap, "seagreen", -2578, "seashell");
        com.IceFishing.LiveIceFishing.k.u(-6270419, hashMap, "sienna", -4144960, "silver");
        com.IceFishing.LiveIceFishing.k.u(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        com.IceFishing.LiveIceFishing.k.u(-12156236, hashMap, "steelblue", -2968436, "tan");
        com.IceFishing.LiveIceFishing.k.u(-16744320, hashMap, "teal", -2572328, "thistle");
        com.IceFishing.LiveIceFishing.k.u(-40121, hashMap, "tomato", 0, "transparent");
        com.IceFishing.LiveIceFishing.k.u(-12525360, hashMap, "turquoise", -1146130, "violet");
        com.IceFishing.LiveIceFishing.k.u(-663885, hashMap, "wheat", -1, "white");
        com.IceFishing.LiveIceFishing.k.u(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private e() {
    }

    private static int a(int i, int i4, int i6, int i9) {
        return (i << 24) | (i4 << 16) | (i6 << 8) | i9;
    }

    private static int b(String str) {
        return a(str, true);
    }

    private static int a(String str) {
        return a(str, false);
    }

    private static int a(String str, boolean z6) {
        int parseInt;
        a.a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & p.f9259b) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith(f9169b)) {
            Matcher matcher = (z6 ? f9172e : f9171d).matcher(replace);
            if (matcher.matches()) {
                if (z6) {
                    parseInt = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    parseInt = Integer.parseInt(matcher.group(4), 10);
                }
                return a(parseInt, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith(f9168a)) {
            Matcher matcher2 = f9170c.matcher(replace);
            if (matcher2.matches()) {
                return a(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = f9173f.get(af.d(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    private static int a(int i, int i4, int i6) {
        return a(p.f9259b, i, i4, i6);
    }
}
