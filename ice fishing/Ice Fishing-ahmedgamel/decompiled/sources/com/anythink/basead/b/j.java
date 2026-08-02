package com.anythink.basead.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010d A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x0018, B:15:0x0105, B:17:0x010d, B:19:0x0115, B:25:0x00fc, B:67:0x0022, B:68:0x0027, B:69:0x002c, B:70:0x0031, B:73:0x003b, B:74:0x004b, B:75:0x0050, B:76:0x0055, B:77:0x005a, B:78:0x005f, B:79:0x0064, B:80:0x0069, B:81:0x006e, B:82:0x0073, B:83:0x0078, B:84:0x007d, B:85:0x0082, B:86:0x0087, B:87:0x008c, B:88:0x0091, B:89:0x0096, B:90:0x009b, B:91:0x00a1, B:92:0x00a7, B:93:0x00ad, B:94:0x00b3, B:95:0x00b9, B:96:0x00bf, B:97:0x00c5, B:98:0x00cb, B:99:0x00d1, B:100:0x00d7, B:101:0x00dd, B:102:0x00e3, B:103:0x00e9), top: B:4:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(int i, bj bjVar, com.anythink.basead.d.j jVar) {
        String D8;
        String[] strArr;
        String[] h3;
        boolean ag;
        bl aH = bjVar.aH();
        if (aH == null) {
            return;
        }
        Map<String, Object> c9 = q.c(aH.c());
        try {
            switch (i) {
                case 1:
                    h3 = aH.h();
                    strArr = h3;
                    break;
                case 2:
                    h3 = aH.i();
                    strArr = h3;
                    break;
                case 3:
                    h3 = aH.j();
                    strArr = h3;
                    break;
                case 4:
                    h3 = aH.k();
                    strArr = h3;
                    break;
                case 5:
                    h3 = aH.l();
                    strArr = h3;
                    break;
                case 6:
                    h3 = aH.q();
                    strArr = h3;
                    break;
                case 7:
                    h3 = aH.r();
                    strArr = h3;
                    break;
                case 8:
                    h3 = aH.f();
                    strArr = h3;
                    break;
                case 9:
                    h3 = aH.g();
                    strArr = h3;
                    break;
                case 10:
                    h3 = aH.d();
                    strArr = h3;
                    break;
                case 11:
                    h3 = aH.m();
                    strArr = h3;
                    break;
                case 12:
                    h3 = aH.o();
                    strArr = h3;
                    break;
                case 13:
                    h3 = aH.p();
                    strArr = h3;
                    break;
                case 14:
                    h3 = aH.n();
                    strArr = h3;
                    break;
                case 15:
                    h3 = aH.R();
                    strArr = h3;
                    break;
                case 16:
                    h3 = aH.S();
                    strArr = h3;
                    break;
                case 17:
                    h3 = aH.T();
                    strArr = h3;
                    break;
                case 18:
                    h3 = aH.s();
                    strArr = h3;
                    break;
                case 19:
                    h3 = aH.t();
                    strArr = h3;
                    break;
                case 20:
                    h3 = aH.U();
                    strArr = h3;
                    break;
                case 21:
                    h3 = aH.u();
                    strArr = h3;
                    break;
                case 22:
                default:
                    strArr = null;
                    break;
                case 23:
                    h3 = aH.V();
                    strArr = h3;
                    break;
                case 24:
                    h3 = aH.W();
                    strArr = h3;
                    break;
                case 25:
                    h3 = aH.X();
                    strArr = h3;
                    break;
                case 26:
                    h3 = aH.Y();
                    strArr = h3;
                    break;
                case 27:
                    h3 = aH.Z();
                    strArr = h3;
                    break;
                case 28:
                    h3 = aH.w();
                    strArr = h3;
                    break;
                case 29:
                    h3 = aH.v();
                    strArr = h3;
                    break;
                case 30:
                    h3 = aH.x();
                    strArr = h3;
                    break;
                case 31:
                    h3 = aH.y();
                    strArr = h3;
                    break;
                case 32:
                    com.anythink.basead.d.k kVar = jVar.f7000j;
                    Map<Integer, String[]> z6 = aH.z();
                    if (kVar != null && z6 != null) {
                        h3 = z6.get(Integer.valueOf(kVar.i));
                        strArr = h3;
                        break;
                    }
                    strArr = null;
                    break;
                case 33:
                    h3 = aH.a();
                    strArr = h3;
                    break;
                case 34:
                    h3 = aH.b();
                    strArr = h3;
                    break;
                case 35:
                    h3 = aH.ap();
                    strArr = h3;
                    break;
                case 36:
                    h3 = aH.e();
                    strArr = h3;
                    break;
            }
            if (strArr != null) {
                if (i != 8 && i != 9) {
                    ag = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            com.anythink.basead.i.e eVar = new com.anythink.basead.i.e(i, a(str, jVar, currentTimeMillis, (w) bjVar, false), bjVar, c9);
                            eVar.a(ag);
                            eVar.a(0, (com.anythink.core.common.m.q) null);
                        }
                    }
                }
                ag = bjVar.r().ag();
                long currentTimeMillis2 = System.currentTimeMillis();
                while (r13 < r12) {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        switch (i) {
            case 1:
                D8 = aH.D();
                break;
            case 2:
                D8 = aH.E();
                break;
            case 3:
                D8 = aH.F();
                break;
            case 4:
                D8 = aH.G();
                break;
            case 5:
                D8 = aH.H();
                break;
            case 6:
                D8 = aH.M();
                break;
            case 7:
                D8 = aH.N();
                break;
            case 8:
                D8 = aH.B();
                break;
            case 9:
                D8 = aH.C();
                break;
            case 10:
                D8 = aH.A();
                break;
            case 11:
                D8 = aH.I();
                break;
            case 12:
                D8 = aH.K();
                break;
            case 13:
                D8 = aH.L();
                break;
            case 14:
                D8 = aH.J();
                break;
            case 15:
                D8 = aH.aa();
                break;
            case 16:
                D8 = aH.ab();
                break;
            case 17:
                D8 = aH.ac();
                break;
            case 18:
                D8 = aH.O();
                break;
            case 19:
                D8 = aH.P();
                break;
            case 20:
                D8 = aH.ad();
                break;
            case 21:
                D8 = aH.Q();
                break;
            case 22:
            case 32:
            default:
                D8 = "";
                break;
            case 23:
                D8 = aH.ae();
                break;
            case 24:
                D8 = aH.af();
                break;
            case 25:
                D8 = aH.ag();
                break;
            case 26:
                D8 = aH.ah();
                break;
            case 27:
                D8 = aH.ai();
                break;
            case 28:
                D8 = aH.ak();
                break;
            case 29:
                D8 = aH.aj();
                break;
            case 30:
                D8 = aH.al();
                break;
            case 31:
                D8 = aH.am();
                break;
            case 33:
                D8 = aH.an();
                break;
            case 34:
                D8 = aH.ao();
                break;
            case 35:
                D8 = aH.aq();
                break;
        }
        if (a(D8)) {
            return;
        }
        com.anythink.basead.i.f fVar = new com.anythink.basead.i.f(i, bjVar, D8, c9);
        fVar.a(jVar.f6995d);
        fVar.a(0, (com.anythink.core.common.m.q) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f6 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:4:0x0005, B:12:0x00ee, B:14:0x00f6, B:16:0x00fe, B:25:0x00e6, B:27:0x000b, B:28:0x0011, B:29:0x0017, B:30:0x001d, B:33:0x0027, B:34:0x0038, B:35:0x003e, B:36:0x0044, B:37:0x004a, B:38:0x0050, B:39:0x0056, B:40:0x005c, B:41:0x0062, B:42:0x0068, B:43:0x006e, B:44:0x0074, B:45:0x007a, B:46:0x007f, B:47:0x0084, B:48:0x0089, B:49:0x008e, B:50:0x0093, B:51:0x0098, B:52:0x009d, B:53:0x00a2, B:54:0x00a7, B:55:0x00ac, B:56:0x00b1, B:57:0x00b6, B:58:0x00bb, B:59:0x00c0, B:60:0x00c5, B:61:0x00ca, B:62:0x00cf, B:63:0x00d4), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, bj bjVar, bl blVar, Map<String, Object> map, com.anythink.basead.d.j jVar) {
        String[] strArr;
        boolean ag;
        int length;
        int i4;
        bj bjVar2;
        com.anythink.basead.d.j jVar2;
        try {
            switch (i) {
                case 1:
                    strArr = blVar.h();
                    break;
                case 2:
                    strArr = blVar.i();
                    break;
                case 3:
                    strArr = blVar.j();
                    break;
                case 4:
                    strArr = blVar.k();
                    break;
                case 5:
                    strArr = blVar.l();
                    break;
                case 6:
                    strArr = blVar.q();
                    break;
                case 7:
                    strArr = blVar.r();
                    break;
                case 8:
                    strArr = blVar.f();
                    break;
                case 9:
                    strArr = blVar.g();
                    break;
                case 10:
                    strArr = blVar.d();
                    break;
                case 11:
                    strArr = blVar.m();
                    break;
                case 12:
                    strArr = blVar.o();
                    break;
                case 13:
                    strArr = blVar.p();
                    break;
                case 14:
                    strArr = blVar.n();
                    break;
                case 15:
                    strArr = blVar.R();
                    break;
                case 16:
                    strArr = blVar.S();
                    break;
                case 17:
                    strArr = blVar.T();
                    break;
                case 18:
                    strArr = blVar.s();
                    break;
                case 19:
                    strArr = blVar.t();
                    break;
                case 20:
                    strArr = blVar.U();
                    break;
                case 21:
                    strArr = blVar.u();
                    break;
                case 22:
                default:
                    strArr = null;
                    break;
                case 23:
                    strArr = blVar.V();
                    break;
                case 24:
                    strArr = blVar.W();
                    break;
                case 25:
                    strArr = blVar.X();
                    break;
                case 26:
                    strArr = blVar.Y();
                    break;
                case 27:
                    strArr = blVar.Z();
                    break;
                case 28:
                    strArr = blVar.w();
                    break;
                case 29:
                    strArr = blVar.v();
                    break;
                case 30:
                    strArr = blVar.x();
                    break;
                case 31:
                    strArr = blVar.y();
                    break;
                case 32:
                    com.anythink.basead.d.k kVar = jVar.f7000j;
                    Map<Integer, String[]> z6 = blVar.z();
                    if (kVar != null && z6 != null) {
                        strArr = z6.get(Integer.valueOf(kVar.i));
                        break;
                    }
                    strArr = null;
                    break;
                case 33:
                    strArr = blVar.a();
                    break;
                case 34:
                    strArr = blVar.b();
                    break;
                case 35:
                    strArr = blVar.ap();
                    break;
                case 36:
                    strArr = blVar.e();
                    break;
            }
            if (strArr != null) {
                if (i != 8 && i != 9) {
                    ag = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    length = strArr.length;
                    i4 = 0;
                    while (i4 < length) {
                        String str = strArr[i4];
                        if (TextUtils.isEmpty(str)) {
                            bjVar2 = bjVar;
                            jVar2 = jVar;
                        } else {
                            bjVar2 = bjVar;
                            jVar2 = jVar;
                            com.anythink.basead.i.e eVar = new com.anythink.basead.i.e(i, a(str, jVar2, currentTimeMillis, (w) bjVar2, false), bjVar2, map);
                            eVar.a(ag);
                            eVar.a(0, (com.anythink.core.common.m.q) null);
                        }
                        i4++;
                        jVar = jVar2;
                        bjVar = bjVar2;
                    }
                }
                ag = bjVar.r().ag();
                long currentTimeMillis2 = System.currentTimeMillis();
                length = strArr.length;
                i4 = 0;
                while (i4 < length) {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(int i, com.anythink.basead.d.j jVar, bj bjVar, bl blVar, Map<String, Object> map) {
        String D8;
        switch (i) {
            case 1:
                D8 = blVar.D();
                break;
            case 2:
                D8 = blVar.E();
                break;
            case 3:
                D8 = blVar.F();
                break;
            case 4:
                D8 = blVar.G();
                break;
            case 5:
                D8 = blVar.H();
                break;
            case 6:
                D8 = blVar.M();
                break;
            case 7:
                D8 = blVar.N();
                break;
            case 8:
                D8 = blVar.B();
                break;
            case 9:
                D8 = blVar.C();
                break;
            case 10:
                D8 = blVar.A();
                break;
            case 11:
                D8 = blVar.I();
                break;
            case 12:
                D8 = blVar.K();
                break;
            case 13:
                D8 = blVar.L();
                break;
            case 14:
                D8 = blVar.J();
                break;
            case 15:
                D8 = blVar.aa();
                break;
            case 16:
                D8 = blVar.ab();
                break;
            case 17:
                D8 = blVar.ac();
                break;
            case 18:
                D8 = blVar.O();
                break;
            case 19:
                D8 = blVar.P();
                break;
            case 20:
                D8 = blVar.ad();
                break;
            case 21:
                D8 = blVar.Q();
                break;
            case 22:
            case 32:
            default:
                D8 = "";
                break;
            case 23:
                D8 = blVar.ae();
                break;
            case 24:
                D8 = blVar.af();
                break;
            case 25:
                D8 = blVar.ag();
                break;
            case 26:
                D8 = blVar.ah();
                break;
            case 27:
                D8 = blVar.ai();
                break;
            case 28:
                D8 = blVar.ak();
                break;
            case 29:
                D8 = blVar.aj();
                break;
            case 30:
                D8 = blVar.al();
                break;
            case 31:
                D8 = blVar.am();
                break;
            case 33:
                D8 = blVar.an();
                break;
            case 34:
                D8 = blVar.ao();
                break;
            case 35:
                D8 = blVar.aq();
                break;
        }
        if (a(D8)) {
            return;
        }
        com.anythink.basead.i.f fVar = new com.anythink.basead.i.f(i, bjVar, D8, map);
        fVar.a(jVar.f6995d);
        fVar.a(0, (com.anythink.core.common.m.q) null);
    }

    private static String a(String str, com.anythink.basead.d.j jVar, long j6, w wVar) {
        return a(str, jVar, j6, wVar, false);
    }

    public static String a(String str, com.anythink.basead.d.j jVar, long j6, w wVar, boolean z6) {
        String sb;
        String sb2;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (jVar.i != null) {
            str = a(str, jVar, wVar, z6);
        }
        com.anythink.basead.d.k kVar = jVar.f7000j;
        if (kVar != null) {
            str = a(str, kVar);
        }
        com.anythink.basead.d.b bVar = jVar.f7001k;
        if (bVar != null) {
            str = a(str, bVar);
        }
        Map<String, Object> map = jVar.f7008r;
        if (map != null) {
            str = a(str, map);
        }
        long j9 = j6 / 1000;
        if (jVar.f6996e == 0) {
            sb = "__REQ_WIDTH__";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(jVar.f6996e);
            sb = sb3.toString();
        }
        String replaceAll = str.replaceAll("\\{__REQ_WIDTH__\\}", sb);
        if (jVar.f6997f == 0) {
            sb2 = "__REQ_HEIGHT__";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(jVar.f6997f);
            sb2 = sb4.toString();
        }
        String p9 = com.IceFishing.LiveIceFishing.k.p(jVar.f7005o, com.IceFishing.LiveIceFishing.k.p(jVar.f7004n, com.IceFishing.LiveIceFishing.k.p(jVar.f6999h, com.IceFishing.LiveIceFishing.k.p(jVar.f6998g, replaceAll.replaceAll("\\{__REQ_HEIGHT__\\}", sb2), "__WIDTH__", new StringBuilder()), "__HEIGHT__", new StringBuilder()).replaceAll("\\{__PLAY_SEC__\\}", "0"), "__S_SCREEN_X__", new StringBuilder()), "__S_SCREEN_Y__", new StringBuilder());
        Context g9 = t.b().g();
        if (g9 != null) {
            p9 = com.IceFishing.LiveIceFishing.k.q(g9, jVar.f7005o, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(g9, jVar.f7004n, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(g9, jVar.f6999h, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(g9, jVar.f6998g, new StringBuilder(), p9, "__WIDTH_DT__"), "__HEIGHT_DT__"), "__S_SCREEN_X_DT__"), "__S_SCREEN_Y_DT__");
        }
        if (jVar.i == null) {
            p9 = p9.replaceAll("__TS__", String.valueOf(j9)).replaceAll("__TS_MSEC__", String.valueOf(j6)).replaceAll("__END_TS__", String.valueOf(j9)).replaceAll("__END_TS_MSEC__", String.valueOf(j6));
        }
        long j10 = jVar.f7007q;
        if (j10 == 0) {
            j10 = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - j10;
        if (currentTimeMillis < 500) {
            currentTimeMillis = new Random().nextInt(500) + 500;
        }
        String replaceAll2 = p9.replaceAll("__SHOW_T__", String.valueOf(currentTimeMillis));
        int i = jVar.f7006p;
        if (i <= 0 || i > 100) {
            str2 = "__M_SHOW_RATIO__";
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(jVar.f7006p);
            str2 = sb5.toString();
        }
        return replaceAll2.replaceAll("__M_SHOW_RATIO__", str2).replaceAll("__DENSITY__", m.q(t.b().g())).replaceAll("\\{", "").replaceAll("\\}", "");
    }

    private static String a(String str, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                str = str.replace(entry.getKey(), entry.getValue().toString());
            } catch (Throwable th) {
                th.getMessage();
                th.printStackTrace();
            }
        }
        return str;
    }

    private static String a(String str, com.anythink.basead.d.k kVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.f7017a);
        String replaceAll = str.replaceAll("\\{__VIDEO_TIME__\\}", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar.f7018b);
        String replaceAll2 = replaceAll.replaceAll("\\{__BEGIN_TIME__\\}", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(kVar.f7019c);
        String p9 = com.IceFishing.LiveIceFishing.k.p(kVar.f7028u, com.IceFishing.LiveIceFishing.k.p(kVar.f7027r, com.IceFishing.LiveIceFishing.k.p(kVar.f7026o, com.IceFishing.LiveIceFishing.k.p(kVar.f7025l, com.IceFishing.LiveIceFishing.k.p(kVar.f7021e, com.IceFishing.LiveIceFishing.k.p(kVar.f7020d, replaceAll2.replaceAll("\\{__END_TIME__\\}", sb3.toString()), "\\{__PLAY_FIRST_FRAME__\\}", new StringBuilder()), "\\{__PLAY_LAST_FRAME__\\}", new StringBuilder()), "\\{__SCENE__\\}", new StringBuilder()), "\\{__TYPE__\\}", new StringBuilder()), "\\{__BEHAVIOR__\\}", new StringBuilder()), "\\{__STATUS__\\}", new StringBuilder());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(kVar.f7022f / 1000);
        String replaceAll3 = p9.replaceAll("__TS__", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(kVar.f7022f);
        String replaceAll4 = replaceAll3.replaceAll("__TS_MSEC__", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(kVar.f7023g / 1000);
        String replaceAll5 = replaceAll4.replaceAll("__END_TS__", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(kVar.f7023g);
        String replaceAll6 = replaceAll5.replaceAll("__END_TS_MSEC__", sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(kVar.f7024h / 1000);
        String replaceAll7 = replaceAll6.replaceAll("\\{__PLAY_SEC__\\}", sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(kVar.f7024h);
        return replaceAll7.replaceAll("\\{__PLAY_MSEC__\\}", sb9.toString());
    }

    private static String a(String str, com.anythink.basead.d.b bVar) {
        String str2 = bVar.f6917a;
        if (str2 == null) {
            str2 = "";
        }
        String replaceAll = str.replaceAll("\\{__CLICK_ID__\\}", str2);
        int i = bVar.f6918b;
        return i > 0 ? str.replaceAll("__DP_APP_INSTALL__", String.valueOf(i)) : replaceAll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str, com.anythink.basead.d.j jVar, w wVar, boolean z6) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z9;
        String str7;
        String sb;
        String replaceAll;
        String replaceAll2;
        int i;
        int i4;
        String str8;
        String str9;
        String str10;
        String str11;
        Context context;
        int i6;
        String str12;
        com.anythink.basead.b.e.b bVar;
        String str13;
        String str14;
        String str15;
        String replaceAll3;
        String str16;
        String str17;
        boolean z10;
        int i9;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i10;
        com.anythink.basead.b.e.b bVar2;
        com.anythink.basead.d.a aVar;
        String sb2;
        String sb3;
        String p9;
        String str24;
        String str25;
        boolean z11;
        int i11;
        String replaceAll4;
        long j6;
        long j9;
        com.anythink.basead.b.e.b bVar3;
        int i12;
        String a9;
        String a10;
        String a11;
        String replaceAll5;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        int i13;
        com.anythink.basead.b.e.b bVar4;
        String str31;
        String str32;
        com.anythink.basead.d.a aVar2 = jVar.i;
        int i14 = jVar.f6998g;
        int i15 = jVar.f6999h;
        Context g9 = t.b().g();
        if (wVar instanceof r) {
            str2 = ((r) wVar).aD();
        } else {
            str2 = "";
        }
        com.anythink.basead.b.e.b a12 = com.anythink.basead.b.e.a.a().a(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            com.anythink.basead.d.a aVar3 = aVar2.f6908p;
            if (aVar3 != null) {
                jSONObject.put("down_x", aVar3.f6898e);
                jSONObject.put("down_y", aVar2.f6908p.f6899f);
                jSONObject.put("up_x", aVar2.f6908p.f6900g);
                jSONObject.put("up_y", aVar2.f6908p.f6901h);
            } else {
                jSONObject.put("down_x", aVar2.f6898e);
                jSONObject.put("down_y", aVar2.f6899f);
                jSONObject.put("up_x", aVar2.f6900g);
                jSONObject.put("up_y", aVar2.f6901h);
            }
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (aVar2.f6908p != null) {
                float f2 = i14;
                jSONObject2.put("down_x", (int) ((r10.f6898e / f2) * 1000.0f));
                float f9 = i15;
                jSONObject2.put("down_y", (int) ((aVar2.f6908p.f6899f / f9) * 1000.0f));
                jSONObject2.put("up_x", (int) ((aVar2.f6908p.f6900g / f2) * 1000.0f));
                jSONObject2.put("up_y", (int) ((aVar2.f6908p.f6901h / f9) * 1000.0f));
            } else {
                float f10 = i14;
                jSONObject2.put("down_x", (int) ((aVar2.f6898e / f10) * 1000.0f));
                float f11 = i15;
                jSONObject2.put("down_y", (int) ((aVar2.f6899f / f11) * 1000.0f));
                jSONObject2.put("up_x", (int) ((aVar2.f6900g / f10) * 1000.0f));
                jSONObject2.put("up_y", (int) ((aVar2.f6901h / f11) * 1000.0f));
            }
        } catch (Throwable unused2) {
        }
        try {
            str3 = URLEncoder.encode(jSONObject.toString(), com.anythink.expressad.foundation.g.a.bR);
        } catch (Throwable th) {
            th.printStackTrace();
            str3 = "{}";
        }
        String str33 = str3;
        try {
            str4 = URLEncoder.encode(jSONObject2.toString(), com.anythink.expressad.foundation.g.a.bR);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str4 = "{}";
        }
        boolean z12 = str.contains("__SLD__") || str.contains("__DOWN_X__") || str.contains("__RE_DOWN_X__") || str.contains("__DOWN_Y__") || str.contains("__RE_DOWN_Y__") || str.contains("__UP_X__") || str.contains("__RE_UP_X__") || str.contains("__UP_Y__") || str.contains("__RE_UP_Y__") || str.contains("__DOWN_X_DT__") || str.contains("__RE_DOWN_X_DT__") || str.contains("__DOWN_Y_DT__") || str.contains("__RE_DOWN_Y_DT__") || str.contains("__UP_X_DT__") || str.contains("__RE_UP_X_DT__") || str.contains("__UP_Y_DT__") || str.contains("__RE_UP_Y_DT__");
        String str34 = str4;
        if (str.contains("__C_SLD__") || str.contains("__C_DOWN_X__") || str.contains("__RE_C_DOWN_X__") || str.contains("__C_DOWN_Y__") || str.contains("__RE_C_DOWN_Y__") || str.contains("__C_UP_X__") || str.contains("__RE_C_UP_X__") || str.contains("__C_UP_Y__") || str.contains("__RE_C_UP_Y__") || str.contains("__C_DOWN_X_DT__") || str.contains("__RE_C_DOWN_X_DT__") || str.contains("__C_DOWN_Y_DT__") || str.contains("__RE_C_DOWN_Y_DT__") || str.contains("__C_UP_X_DT__") || str.contains("__RE_C_UP_X_DT__") || str.contains("__C_UP_Y_DT__")) {
            str5 = "__RE_C_UP_X_DT__";
            str6 = "__RE_C_UP_Y_DT__";
        } else {
            str5 = "__RE_C_UP_X_DT__";
            str6 = "__RE_C_UP_Y_DT__";
            if (!str.contains(str6)) {
                z9 = false;
                boolean z13 = !z12 && z9;
                String str35 = str6;
                if (aVar2.f6908p == null && !z13) {
                    StringBuilder sb4 = new StringBuilder();
                    str7 = "__RE_C_DOWN_X_DT__";
                    sb4.append(aVar2.f6908p.f6906n);
                    sb = sb4.toString();
                    replaceAll = str.replaceAll("__SLD__", sb);
                } else {
                    str7 = "__RE_C_DOWN_X_DT__";
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(aVar2.f6906n);
                    sb = sb5.toString();
                    replaceAll = str.replaceAll("__SLD__", sb);
                }
                StringBuilder sb6 = new StringBuilder();
                String str36 = sb;
                sb6.append(aVar2.f6906n);
                String sb7 = sb6.toString();
                replaceAll2 = replaceAll.replaceAll("__C_SLD__", sb7);
                i = !aVar2.i ? 1 : 2;
                boolean z14 = aVar2.f6894a <= 0 || aVar2.f6895b > 0 || aVar2.f6896c > 0 || aVar2.f6897d > 0;
                if (aVar2.f6908p == null && !z13) {
                    int i16 = i;
                    StringBuilder sb8 = new StringBuilder();
                    str10 = "__C_UP_Y_DT__";
                    sb8.append(aVar2.f6908p.f6894a);
                    String sb9 = sb8.toString();
                    StringBuilder sb10 = new StringBuilder();
                    str11 = "__C_UP_X_DT__";
                    sb10.append(aVar2.f6908p.f6895b);
                    String sb11 = sb10.toString();
                    StringBuilder sb12 = new StringBuilder();
                    str8 = "__C_DOWN_Y_DT__";
                    sb12.append(aVar2.f6908p.f6896c);
                    String sb13 = sb12.toString();
                    StringBuilder sb14 = new StringBuilder();
                    str9 = "__C_DOWN_X_DT__";
                    sb14.append(aVar2.f6908p.f6897d);
                    String sb15 = sb14.toString();
                    replaceAll3 = com.IceFishing.LiveIceFishing.k.p(aVar2.f6908p.f6901h, com.IceFishing.LiveIceFishing.k.p(aVar2.f6908p.f6900g, com.IceFishing.LiveIceFishing.k.p(aVar2.f6908p.f6899f, com.IceFishing.LiveIceFishing.k.p(aVar2.f6908p.f6898e, replaceAll2.replaceAll("__DOWN_X__", sb9).replaceAll("__DOWN_Y__", sb11).replaceAll("__UP_X__", sb13).replaceAll("__UP_Y__", sb15), "__RE_DOWN_X__", new StringBuilder()), "__RE_DOWN_Y__", new StringBuilder()), "__RE_UP_X__", new StringBuilder()), "__RE_UP_Y__", new StringBuilder()).replaceAll("\\{ABSOLUTE_COORD\\}", str33).replaceAll("\\{RELATIVE_COORD\\}", str34);
                    if (g9 != null) {
                        str32 = sb15;
                        context = g9;
                        replaceAll3 = com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6901h, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6900g, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6899f, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6898e, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6897d, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6896c, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6895b, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6908p.f6894a, new StringBuilder(), replaceAll3, "__DOWN_X_DT__"), "__DOWN_Y_DT__"), "__UP_X_DT__"), "__UP_Y_DT__"), "__RE_DOWN_X_DT__"), "__RE_DOWN_Y_DT__"), "__RE_UP_X_DT__"), "__RE_UP_Y_DT__");
                    } else {
                        str32 = sb15;
                        context = g9;
                    }
                    str15 = "__RE_C_DOWN_Y__";
                    str12 = "__RE_C_UP_X__";
                    z10 = false;
                    i9 = i16;
                    str18 = str32;
                    str17 = sb9;
                    str16 = sb13;
                    str14 = "-999";
                    str19 = sb11;
                    bVar = a12;
                    str13 = "__RE_C_UP_Y__";
                } else {
                    i4 = i;
                    str8 = "__C_DOWN_Y_DT__";
                    str9 = "__C_DOWN_X_DT__";
                    str10 = "__C_UP_Y_DT__";
                    str11 = "__C_UP_X_DT__";
                    context = g9;
                    i6 = aVar2.f6906n;
                    if ((i6 == 0 && i6 != 1) || !z14) {
                        bVar = a12;
                        String a13 = a(bVar, "__DOWN_X__", "-999");
                        String a14 = a(bVar, "__DOWN_Y__", "-999");
                        String a15 = a(bVar, "__UP_X__", "-999");
                        str13 = "__RE_C_UP_Y__";
                        String a16 = a(bVar, "__UP_Y__", "-999");
                        str12 = "__RE_C_UP_X__";
                        String replaceAll6 = replaceAll2.replaceAll("__DOWN_X__", a13).replaceAll("__DOWN_Y__", a14).replaceAll("__UP_X__", a15).replaceAll("__UP_Y__", a16).replaceAll("__RE_DOWN_X__", a(bVar, "__RE_DOWN_X__", "-999")).replaceAll("__RE_DOWN_Y__", a(bVar, "__RE_DOWN_Y__", "-999")).replaceAll("__RE_UP_X__", a(bVar, "__RE_UP_X__", "-999")).replaceAll("__RE_UP_Y__", a(bVar, "__RE_UP_Y__", "-999"));
                        try {
                            str20 = replaceAll6;
                        } catch (Throwable unused3) {
                            str20 = replaceAll6;
                        }
                        try {
                            str21 = replaceAll6.replaceAll("\\{ABSOLUTE_COORD\\}", URLEncoder.encode("{}", com.anythink.expressad.foundation.g.a.bR)).replaceAll("\\{RELATIVE_COORD\\}", URLEncoder.encode("{}", com.anythink.expressad.foundation.g.a.bR));
                        } catch (Throwable unused4) {
                            str21 = str20;
                            replaceAll3 = str21.replaceAll("__DOWN_X_DT__", a(bVar, "__DOWN_X_DT__", "-999")).replaceAll("__DOWN_Y_DT__", a(bVar, "__DOWN_Y_DT__", "-999")).replaceAll("__UP_X_DT__", a(bVar, "__UP_X_DT__", "-999")).replaceAll("__UP_Y_DT__", a(bVar, "__UP_Y_DT__", "-999")).replaceAll("__RE_DOWN_X_DT__", a(bVar, "__RE_DOWN_X_DT__", "-999")).replaceAll("__RE_DOWN_Y_DT__", a(bVar, "__RE_DOWN_Y_DT__", "-999")).replaceAll("__RE_UP_X_DT__", a(bVar, "__RE_UP_X_DT__", "-999")).replaceAll("__RE_UP_Y_DT__", a(bVar, "__RE_UP_Y_DT__", "-999"));
                            str15 = "__RE_C_DOWN_Y__";
                            z10 = false;
                            str19 = a14;
                            str16 = a15;
                            str17 = a13;
                            i9 = i4;
                            str18 = a16;
                            str14 = "-999";
                            if (aVar2.f6906n == 2) {
                            }
                            String replaceAll7 = p9.replaceAll("\\{__DPLINK_TYPE__\\}", String.valueOf(i10));
                            if (aVar.i) {
                            }
                            i11 = aVar.f6902j;
                            if (i11 == -1) {
                            }
                            String replaceAll8 = replaceAll4.replaceAll("\\{opdptype\\}", aVar.i ? "1" : "0");
                            j6 = aVar.f6903k;
                            j9 = aVar.f6904l;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (j6 <= 0) {
                            }
                            if (j9 <= 0) {
                            }
                            if (j9 <= j6 - 5) {
                            }
                            String valueOf = String.valueOf(j6);
                            String valueOf2 = String.valueOf(j9);
                            StringBuilder sb16 = new StringBuilder();
                            sb16.append(j6 / 1000);
                            String replaceAll9 = replaceAll8.replaceAll("__TS__", sb16.toString()).replaceAll("__TS_MSEC__", String.valueOf(j6));
                            StringBuilder sb17 = new StringBuilder();
                            sb17.append(j9 / 1000);
                            String replaceAll10 = replaceAll9.replaceAll("__END_TS__", sb17.toString()).replaceAll("__END_TS_MSEC__", String.valueOf(j9));
                            if (aVar.f6906n == 2) {
                            }
                            str26 = replaceAll5;
                            str28 = a10;
                            str29 = str23;
                            str27 = a11;
                            String str37 = "";
                            if (wVar == null) {
                            }
                            String str38 = str30;
                            String str39 = str37;
                            String str40 = jVar.f6993b;
                            bVar4 = bVar3;
                            String str41 = jVar.f6994c;
                            x xVar = jVar.f6992a;
                            boolean z15 = z11;
                            if (bVar4 != null) {
                            }
                            com.anythink.core.common.u.e.a(str40, str41, xVar, str39, str38, i13, str, sb7, str24, sb2, sb3, str25, valueOf, valueOf2, str36, str29, str19, str22, str18, z15, z6, a9, str28, str27);
                            return str26;
                        }
                        replaceAll3 = str21.replaceAll("__DOWN_X_DT__", a(bVar, "__DOWN_X_DT__", "-999")).replaceAll("__DOWN_Y_DT__", a(bVar, "__DOWN_Y_DT__", "-999")).replaceAll("__UP_X_DT__", a(bVar, "__UP_X_DT__", "-999")).replaceAll("__UP_Y_DT__", a(bVar, "__UP_Y_DT__", "-999")).replaceAll("__RE_DOWN_X_DT__", a(bVar, "__RE_DOWN_X_DT__", "-999")).replaceAll("__RE_DOWN_Y_DT__", a(bVar, "__RE_DOWN_Y_DT__", "-999")).replaceAll("__RE_UP_X_DT__", a(bVar, "__RE_UP_X_DT__", "-999")).replaceAll("__RE_UP_Y_DT__", a(bVar, "__RE_UP_Y_DT__", "-999"));
                        str15 = "__RE_C_DOWN_Y__";
                        z10 = false;
                        str19 = a14;
                        str16 = a15;
                        str17 = a13;
                        i9 = i4;
                        str18 = a16;
                        str14 = "-999";
                    } else {
                        str12 = "__RE_C_UP_X__";
                        bVar = a12;
                        str13 = "__RE_C_UP_Y__";
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append(aVar2.f6894a);
                        String sb19 = sb18.toString();
                        StringBuilder sb20 = new StringBuilder();
                        sb20.append(aVar2.f6895b);
                        String sb21 = sb20.toString();
                        StringBuilder sb22 = new StringBuilder();
                        str14 = "-999";
                        sb22.append(aVar2.f6896c);
                        String sb23 = sb22.toString();
                        StringBuilder sb24 = new StringBuilder();
                        str15 = "__RE_C_DOWN_Y__";
                        sb24.append(aVar2.f6897d);
                        String sb25 = sb24.toString();
                        replaceAll3 = com.IceFishing.LiveIceFishing.k.p(aVar2.f6901h, com.IceFishing.LiveIceFishing.k.p(aVar2.f6900g, com.IceFishing.LiveIceFishing.k.p(aVar2.f6899f, com.IceFishing.LiveIceFishing.k.p(aVar2.f6898e, replaceAll2.replaceAll("__DOWN_X__", sb19).replaceAll("__DOWN_Y__", sb21).replaceAll("__UP_X__", sb23).replaceAll("__UP_Y__", sb25), "__RE_DOWN_X__", new StringBuilder()), "__RE_DOWN_Y__", new StringBuilder()), "__RE_UP_X__", new StringBuilder()), "__RE_UP_Y__", new StringBuilder()).replaceAll("\\{ABSOLUTE_COORD\\}", str33).replaceAll("\\{RELATIVE_COORD\\}", str34);
                        if (context != null) {
                            replaceAll3 = com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6901h, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6900g, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6899f, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6898e, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6897d, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6896c, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6895b, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context, aVar2.f6894a, new StringBuilder(), replaceAll3, "__DOWN_X_DT__"), "__DOWN_Y_DT__"), "__UP_X_DT__"), "__UP_Y_DT__"), "__RE_DOWN_X_DT__"), "__RE_DOWN_Y_DT__"), "__RE_UP_X_DT__"), "__RE_UP_Y_DT__");
                        }
                        str16 = sb23;
                        str17 = sb19;
                        z10 = false;
                        i9 = i4;
                        str18 = sb25;
                        str19 = sb21;
                    }
                }
                if (aVar2.f6906n == 2) {
                    String a17 = a(bVar, "__C_DOWN_X__", "__C_DOWN_X__");
                    sb2 = a(bVar, "__C_DOWN_Y__", "__C_DOWN_Y__");
                    String a18 = a(bVar, "__C_UP_X__", "__C_UP_X__");
                    str25 = a(bVar, "__C_UP_Y__", "__C_UP_Y__");
                    String str42 = str15;
                    String replaceAll11 = replaceAll3.replaceAll("__C_DOWN_X__", a17).replaceAll("__C_DOWN_Y__", sb2).replaceAll("__C_UP_X__", a18).replaceAll("__C_UP_Y__", str25).replaceAll("__RE_C_DOWN_X__", a(bVar, "__RE_C_DOWN_X__", "__RE_C_DOWN_X__")).replaceAll(str42, a(bVar, str42, str42));
                    String str43 = str12;
                    String replaceAll12 = replaceAll11.replaceAll(str43, a(bVar, str43, str43));
                    String str44 = str13;
                    String replaceAll13 = replaceAll12.replaceAll(str44, a(bVar, str44, str44));
                    String str45 = str9;
                    String replaceAll14 = replaceAll13.replaceAll(str45, a(bVar, str45, str45));
                    String str46 = str8;
                    String replaceAll15 = replaceAll14.replaceAll(str46, a(bVar, str46, str46));
                    String str47 = str11;
                    String replaceAll16 = replaceAll15.replaceAll(str47, a(bVar, str47, str47));
                    String str48 = str10;
                    String replaceAll17 = replaceAll16.replaceAll(str48, a(bVar, str48, str48));
                    String str49 = str7;
                    String replaceAll18 = replaceAll17.replaceAll(str49, a(bVar, str49, str49)).replaceAll("__RE_C_DOWN_Y_DT__", a(bVar, "__RE_C_DOWN_Y_DT__", "__RE_C_DOWN_Y_DT__"));
                    String str50 = str5;
                    p9 = replaceAll18.replaceAll(str50, a(bVar, str50, str50)).replaceAll(str35, a(bVar, str35, str35));
                    z11 = z10;
                    str24 = a17;
                    i10 = i9;
                    str22 = str16;
                    bVar2 = bVar;
                    aVar = aVar2;
                    str23 = str17;
                    sb3 = a18;
                } else {
                    String str51 = str12;
                    String str52 = str15;
                    String str53 = str10;
                    str22 = str16;
                    str23 = str17;
                    String str54 = str5;
                    String str55 = str7;
                    String str56 = str8;
                    boolean z16 = z10;
                    String str57 = str11;
                    String str58 = str13;
                    i10 = i9;
                    Context context2 = context;
                    String str59 = str9;
                    if (!z14) {
                        String str60 = str14;
                        String a19 = a(bVar, "__C_DOWN_X__", str60);
                        sb2 = a(bVar, "__C_DOWN_Y__", str60);
                        String a20 = a(bVar, "__C_UP_X__", str60);
                        String a21 = a(bVar, "__C_UP_Y__", str60);
                        p9 = replaceAll3.replaceAll("__C_DOWN_X__", a19).replaceAll("__C_DOWN_Y__", sb2).replaceAll("__C_UP_X__", a20).replaceAll("__C_UP_Y__", a21).replaceAll("__RE_C_DOWN_X__", a(bVar, "__RE_C_DOWN_X__", str60)).replaceAll(str52, a(bVar, str52, str60)).replaceAll(str51, a(bVar, str51, str60)).replaceAll(str58, a(bVar, str58, str60)).replaceAll(str59, a(bVar, str59, str60)).replaceAll(str56, a(bVar, str56, str60)).replaceAll(str57, a(bVar, str57, str60)).replaceAll(str53, a(bVar, str53, str60)).replaceAll(str55, a(bVar, str55, str60)).replaceAll("__RE_C_DOWN_Y_DT__", a(bVar, "__RE_C_DOWN_Y_DT__", str60)).replaceAll(str54, a(bVar, str54, str60)).replaceAll(str35, a(bVar, str35, str60));
                        str14 = str60;
                        str25 = a21;
                        bVar2 = bVar;
                        str24 = a19;
                        aVar = aVar2;
                        sb3 = a20;
                        z11 = z16;
                    } else {
                        bVar2 = bVar;
                        StringBuilder sb26 = new StringBuilder();
                        aVar = aVar2;
                        sb26.append(aVar.f6894a);
                        String sb27 = sb26.toString();
                        StringBuilder sb28 = new StringBuilder();
                        sb28.append(aVar.f6895b);
                        sb2 = sb28.toString();
                        StringBuilder sb29 = new StringBuilder();
                        sb29.append(aVar.f6896c);
                        sb3 = sb29.toString();
                        StringBuilder sb30 = new StringBuilder();
                        sb30.append(aVar.f6897d);
                        String sb31 = sb30.toString();
                        p9 = com.IceFishing.LiveIceFishing.k.p(aVar.f6901h, com.IceFishing.LiveIceFishing.k.p(aVar.f6900g, com.IceFishing.LiveIceFishing.k.p(aVar.f6899f, com.IceFishing.LiveIceFishing.k.p(aVar.f6898e, replaceAll3.replaceAll("__C_DOWN_X__", sb27).replaceAll("__C_DOWN_Y__", sb2).replaceAll("__C_UP_X__", sb3).replaceAll("__C_UP_Y__", sb31), "__RE_C_DOWN_X__", new StringBuilder()), str52, new StringBuilder()), str51, new StringBuilder()), str58, new StringBuilder());
                        if (context2 != null) {
                            p9 = com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6901h, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6900g, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6899f, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6898e, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6897d, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6896c, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6895b, new StringBuilder(), com.IceFishing.LiveIceFishing.k.q(context2, aVar.f6894a, new StringBuilder(), p9, str59), str56), str57), str53), str55), "__RE_C_DOWN_Y_DT__"), str54), str35);
                        }
                        str24 = sb27;
                        str25 = sb31;
                        z11 = z16;
                    }
                }
                String replaceAll72 = p9.replaceAll("\\{__DPLINK_TYPE__\\}", String.valueOf(i10));
                if (aVar.i) {
                    replaceAll72 = replaceAll72.replaceAll("&apk_ptype=\\{apk_ptype\\}", "");
                }
                i11 = aVar.f6902j;
                if (i11 == -1) {
                    replaceAll4 = replaceAll72.replaceAll("&apk_ptype=\\{apk_ptype\\}", "");
                } else {
                    replaceAll4 = replaceAll72.replaceAll("\\{apk_ptype\\}", String.valueOf(i11));
                }
                String replaceAll82 = replaceAll4.replaceAll("\\{opdptype\\}", aVar.i ? "1" : "0");
                j6 = aVar.f6903k;
                j9 = aVar.f6904l;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (j6 <= 0) {
                    j6 = currentTimeMillis2;
                }
                if (j9 <= 0) {
                    j9 = currentTimeMillis2;
                }
                if (j9 <= j6 - 5) {
                    j9 = 50 + j6 + new Random().nextInt(150);
                }
                String valueOf3 = String.valueOf(j6);
                String valueOf22 = String.valueOf(j9);
                StringBuilder sb162 = new StringBuilder();
                sb162.append(j6 / 1000);
                String replaceAll92 = replaceAll82.replaceAll("__TS__", sb162.toString()).replaceAll("__TS_MSEC__", String.valueOf(j6));
                StringBuilder sb172 = new StringBuilder();
                sb172.append(j9 / 1000);
                String replaceAll102 = replaceAll92.replaceAll("__END_TS__", sb172.toString()).replaceAll("__END_TS_MSEC__", String.valueOf(j9));
                if (aVar.f6906n == 2) {
                    float[] fArr = aVar.f6905m;
                    if (fArr == null || fArr.length != 3) {
                        i12 = 1;
                        str31 = str14;
                        bVar3 = bVar2;
                    } else {
                        if (fArr[z11 ? 1 : 0] > 0.0f || fArr[1] > 0.0f || fArr[2] > 0.0f) {
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append((int) (fArr[z11 ? 1 : 0] * 100.0f));
                            a9 = sb32.toString();
                            StringBuilder sb33 = new StringBuilder();
                            i12 = 1;
                            sb33.append((int) (fArr[1] * 100.0f));
                            String sb34 = sb33.toString();
                            StringBuilder sb35 = new StringBuilder();
                            sb35.append((int) (fArr[2] * 100.0f));
                            String sb36 = sb35.toString();
                            str26 = replaceAll102.replaceAll("__M_X_ACC__", a9).replaceAll("__M_Y_ACC__", sb34).replaceAll("__M_Z_ACC__", sb36);
                            str28 = sb34;
                            str29 = str23;
                            str27 = sb36;
                            bVar3 = bVar2;
                            String str372 = "";
                            if (wVar == null) {
                                str30 = wVar.v();
                                if (wVar instanceof bj) {
                                    str372 = ((bj) wVar).aD();
                                }
                                i13 = wVar.ai();
                            } else {
                                str30 = "";
                                i13 = i12;
                            }
                            String str382 = str30;
                            String str392 = str372;
                            String str402 = jVar.f6993b;
                            bVar4 = bVar3;
                            String str412 = jVar.f6994c;
                            x xVar2 = jVar.f6992a;
                            boolean z152 = z11;
                            if (bVar4 != null) {
                                z152 = i12;
                            }
                            com.anythink.core.common.u.e.a(str402, str412, xVar2, str392, str382, i13, str, sb7, str24, sb2, sb3, str25, valueOf3, valueOf22, str36, str29, str19, str22, str18, z152, z6, a9, str28, str27);
                            return str26;
                        }
                        str31 = str14;
                        bVar3 = bVar2;
                        i12 = 1;
                    }
                    a9 = a(bVar3, "__M_X_ACC__", str31);
                    a10 = a(bVar3, "__M_Y_ACC__", str31);
                    a11 = a(bVar3, "__M_Z_ACC__", str31);
                    replaceAll5 = replaceAll102.replaceAll("__M_X_ACC__", a9).replaceAll("__M_Y_ACC__", a10).replaceAll("__M_Z_ACC__", a11);
                } else {
                    bVar3 = bVar2;
                    i12 = 1;
                    a9 = a(bVar3, "__M_X_ACC__", "__M_X_ACC__");
                    a10 = a(bVar3, "__M_Y_ACC__", "__M_Y_ACC__");
                    a11 = a(bVar3, "__M_Z_ACC__", "__M_Z_ACC__");
                    replaceAll5 = replaceAll102.replaceAll("__M_X_ACC__", a9).replaceAll("__M_Y_ACC__", a10).replaceAll("__M_Z_ACC__", a11);
                }
                str26 = replaceAll5;
                str28 = a10;
                str29 = str23;
                str27 = a11;
                String str3722 = "";
                if (wVar == null) {
                }
                String str3822 = str30;
                String str3922 = str3722;
                String str4022 = jVar.f6993b;
                bVar4 = bVar3;
                String str4122 = jVar.f6994c;
                x xVar22 = jVar.f6992a;
                boolean z1522 = z11;
                if (bVar4 != null) {
                }
                com.anythink.core.common.u.e.a(str4022, str4122, xVar22, str3922, str3822, i13, str, sb7, str24, sb2, sb3, str25, valueOf3, valueOf22, str36, str29, str19, str22, str18, z1522, z6, a9, str28, str27);
                return str26;
            }
        }
        z9 = true;
        if (z12) {
        }
        String str352 = str6;
        if (aVar2.f6908p == null) {
        }
        str7 = "__RE_C_DOWN_X_DT__";
        StringBuilder sb52 = new StringBuilder();
        sb52.append(aVar2.f6906n);
        sb = sb52.toString();
        replaceAll = str.replaceAll("__SLD__", sb);
        StringBuilder sb62 = new StringBuilder();
        String str362 = sb;
        sb62.append(aVar2.f6906n);
        String sb72 = sb62.toString();
        replaceAll2 = replaceAll.replaceAll("__C_SLD__", sb72);
        if (!aVar2.i) {
        }
        if (aVar2.f6894a <= 0) {
        }
        if (aVar2.f6908p == null) {
        }
        i4 = i;
        str8 = "__C_DOWN_Y_DT__";
        str9 = "__C_DOWN_X_DT__";
        str10 = "__C_UP_Y_DT__";
        str11 = "__C_UP_X_DT__";
        context = g9;
        i6 = aVar2.f6906n;
        if (i6 == 0) {
        }
        str12 = "__RE_C_UP_X__";
        bVar = a12;
        str13 = "__RE_C_UP_Y__";
        StringBuilder sb182 = new StringBuilder();
        sb182.append(aVar2.f6894a);
        String sb192 = sb182.toString();
        StringBuilder sb202 = new StringBuilder();
        sb202.append(aVar2.f6895b);
        String sb212 = sb202.toString();
        StringBuilder sb222 = new StringBuilder();
        str14 = "-999";
        sb222.append(aVar2.f6896c);
        String sb232 = sb222.toString();
        StringBuilder sb242 = new StringBuilder();
        str15 = "__RE_C_DOWN_Y__";
        sb242.append(aVar2.f6897d);
        String sb252 = sb242.toString();
        replaceAll3 = com.IceFishing.LiveIceFishing.k.p(aVar2.f6901h, com.IceFishing.LiveIceFishing.k.p(aVar2.f6900g, com.IceFishing.LiveIceFishing.k.p(aVar2.f6899f, com.IceFishing.LiveIceFishing.k.p(aVar2.f6898e, replaceAll2.replaceAll("__DOWN_X__", sb192).replaceAll("__DOWN_Y__", sb212).replaceAll("__UP_X__", sb232).replaceAll("__UP_Y__", sb252), "__RE_DOWN_X__", new StringBuilder()), "__RE_DOWN_Y__", new StringBuilder()), "__RE_UP_X__", new StringBuilder()), "__RE_UP_Y__", new StringBuilder()).replaceAll("\\{ABSOLUTE_COORD\\}", str33).replaceAll("\\{RELATIVE_COORD\\}", str34);
        if (context != null) {
        }
        str16 = sb232;
        str17 = sb192;
        z10 = false;
        i9 = i4;
        str18 = sb252;
        str19 = sb212;
        if (aVar2.f6906n == 2) {
        }
        String replaceAll722 = p9.replaceAll("\\{__DPLINK_TYPE__\\}", String.valueOf(i10));
        if (aVar.i) {
        }
        i11 = aVar.f6902j;
        if (i11 == -1) {
        }
        String replaceAll822 = replaceAll4.replaceAll("\\{opdptype\\}", aVar.i ? "1" : "0");
        j6 = aVar.f6903k;
        j9 = aVar.f6904l;
        long currentTimeMillis22 = System.currentTimeMillis();
        if (j6 <= 0) {
        }
        if (j9 <= 0) {
        }
        if (j9 <= j6 - 5) {
        }
        String valueOf32 = String.valueOf(j6);
        String valueOf222 = String.valueOf(j9);
        StringBuilder sb1622 = new StringBuilder();
        sb1622.append(j6 / 1000);
        String replaceAll922 = replaceAll822.replaceAll("__TS__", sb1622.toString()).replaceAll("__TS_MSEC__", String.valueOf(j6));
        StringBuilder sb1722 = new StringBuilder();
        sb1722.append(j9 / 1000);
        String replaceAll1022 = replaceAll922.replaceAll("__END_TS__", sb1722.toString()).replaceAll("__END_TS_MSEC__", String.valueOf(j9));
        if (aVar.f6906n == 2) {
        }
        str26 = replaceAll5;
        str28 = a10;
        str29 = str23;
        str27 = a11;
        String str37222 = "";
        if (wVar == null) {
        }
        String str38222 = str30;
        String str39222 = str37222;
        String str40222 = jVar.f6993b;
        bVar4 = bVar3;
        String str41222 = jVar.f6994c;
        x xVar222 = jVar.f6992a;
        boolean z15222 = z11;
        if (bVar4 != null) {
        }
        com.anythink.core.common.u.e.a(str40222, str41222, xVar222, str39222, str38222, i13, str, sb72, str24, sb2, sb3, str25, valueOf32, valueOf222, str362, str29, str19, str22, str18, z15222, z6, a9, str28, str27);
        return str26;
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return new JSONObject(str).length() <= 0;
    }

    private static String a(com.anythink.basead.b.e.b bVar, String str, String str2) {
        return bVar != null ? bVar.a(str, str2) : str2;
    }
}
