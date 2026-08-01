package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class H4 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f25213a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f25214b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return com.anythink.basead.exoplayer.k.o.f8445b.equals(j(str));
    }

    public static boolean b(String str) {
        return com.anythink.basead.exoplayer.k.o.f8444a.equals(j(str));
    }

    public static boolean c(String str) {
        return d.c.f18635e.equals(j(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean d(String str, String str2) {
        char c9;
        N6.i i;
        int c10;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8421B)) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    c9 = 16;
                    break;
                }
                c9 = 65535;
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c9 = 15;
                    break;
                }
                c9 = 65535;
                break;
            case -1265048566:
                if (str.equals(com.anythink.basead.exoplayer.k.o.ah)) {
                    c9 = 19;
                    break;
                }
                c9 = 65535;
                break;
            case -1248341703:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8440V)) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            case -432837260:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8463u)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -432837259:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8464v)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -53558318:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8460r)) {
                    c9 = 20;
                    break;
                }
                c9 = 65535;
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c9 = 17;
                    break;
                }
                c9 = 65535;
                break;
            case 187078296:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8468z)) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 187094639:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8465w)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c9 = 18;
                    break;
                }
                c9 = 65535;
                break;
            case 1154383568:
                if (str.equals(com.anythink.basead.exoplayer.k.o.ai)) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1504578661:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8420A)) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 1504619009:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8429K)) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1504831518:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8462t)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1652648887:
                if (str.equals(com.anythink.basead.exoplayer.k.o.ag)) {
                    c9 = 14;
                    break;
                }
                c9 = 65535;
                break;
            case 1903231877:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8466x)) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 1903589369:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8467y)) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 20:
                if (str2 != null && (i = i(str2)) != null && (c10 = i.c()) != 0 && c10 != 16) {
                }
                break;
        }
        return false;
    }

    public static String e(int i) {
        if (i == 32) {
            return com.anythink.basead.exoplayer.k.o.f8454l;
        }
        if (i == 33) {
            return com.anythink.basead.exoplayer.k.o.f8451h;
        }
        if (i == 35) {
            return com.anythink.basead.exoplayer.k.o.i;
        }
        if (i == 64) {
            return com.anythink.basead.exoplayer.k.o.f8460r;
        }
        if (i == 163) {
            return com.anythink.basead.exoplayer.k.o.f8457o;
        }
        if (i == 177) {
            return com.anythink.basead.exoplayer.k.o.f8453k;
        }
        if (i == 221) {
            return com.anythink.basead.exoplayer.k.o.f8426G;
        }
        if (i == 165) {
            return com.anythink.basead.exoplayer.k.o.f8468z;
        }
        if (i == 166) {
            return com.anythink.basead.exoplayer.k.o.f8420A;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return com.anythink.basead.exoplayer.k.o.f8456n;
            case 102:
            case 103:
            case 104:
                return com.anythink.basead.exoplayer.k.o.f8460r;
            case 105:
            case 107:
                return com.anythink.basead.exoplayer.k.o.f8462t;
            case 106:
                return com.anythink.basead.exoplayer.k.o.f8455m;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return com.anythink.basead.exoplayer.k.o.f8423D;
                    case 170:
                    case 171:
                        return com.anythink.basead.exoplayer.k.o.f8424E;
                    case 173:
                        return com.anythink.basead.exoplayer.k.o.f8427H;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (com.anythink.basead.exoplayer.k.o.f8446c.equals(j(str)) || "application/x-media3-cues".equals(str) || com.anythink.basead.exoplayer.k.o.f8441W.equals(str) || com.anythink.basead.exoplayer.k.o.f8442X.equals(str) || com.anythink.basead.exoplayer.k.o.ac.equals(str) || com.anythink.basead.exoplayer.k.o.Y.equals(str) || com.anythink.basead.exoplayer.k.o.f8443Z.equals(str) || com.anythink.basead.exoplayer.k.o.aa.equals(str) || com.anythink.basead.exoplayer.k.o.ab.equals(str) || com.anythink.basead.exoplayer.k.o.ad.equals(str) || com.anythink.basead.exoplayer.k.o.ae.equals(str) || com.anythink.basead.exoplayer.k.o.af.equals(str) || com.anythink.basead.exoplayer.k.o.aj.equals(str)) {
            return 3;
        }
        if (c(str)) {
            return 4;
        }
        if (com.anythink.basead.exoplayer.k.o.f8440V.equals(str) || com.anythink.basead.exoplayer.k.o.ai.equals(str) || com.anythink.basead.exoplayer.k.o.ag.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if (com.anythink.basead.exoplayer.k.o.ah.equals(str)) {
            return 6;
        }
        ArrayList arrayList = f25213a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(String str, String str2) {
        char c9;
        N6.i i;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8421B)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -1365340241:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8425F)) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case -1095064472:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8423D)) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case -53558318:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8460r)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 187078296:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8468z)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 1504578661:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8420A)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1504831518:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8462t)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1504891608:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8427H)) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case 1505942594:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8424E)) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1556697186:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8422C)) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (i = i(str2)) == null) {
                    return 0;
                }
                return i.c();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            case '\f':
                return 31;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String h(String str) {
        char c9;
        if (str == null) {
            return null;
        }
        String f3 = AbstractC3043cl.f(str);
        switch (f3.hashCode()) {
            case -1833600100:
                if (f3.equals("video/x-mvhevc")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -1007807498:
                if (f3.equals("audio/x-flac")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -979095690:
                if (f3.equals("application/x-mpegurl")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -586683234:
                if (f3.equals("audio/x-wav")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -432836268:
                if (f3.equals("audio/mpeg-l1")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -432836267:
                if (f3.equals("audio/mpeg-l2")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 187090231:
                if (f3.equals("audio/mp3")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return com.anythink.basead.exoplayer.k.o.f8429K;
            case 2:
                return com.anythink.basead.exoplayer.k.o.f8462t;
            case 3:
                return "audio/wav";
            case 4:
                return com.anythink.basead.exoplayer.k.o.f8438T;
            case 5:
                return com.anythink.basead.exoplayer.k.o.f8463u;
            case 6:
                return com.anythink.basead.exoplayer.k.o.f8464v;
            default:
                return f3;
        }
    }

    public static N6.i i(String str) {
        Matcher matcher = f25214b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new N6.i(group2 != null ? Integer.parseInt(group2) : 0, 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
