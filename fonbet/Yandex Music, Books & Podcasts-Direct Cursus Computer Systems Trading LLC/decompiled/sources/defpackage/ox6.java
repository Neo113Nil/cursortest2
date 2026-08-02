package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.data.DelegatePrepareParams;

/* loaded from: classes.dex */
public abstract class ox6 {
    public static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final ei3 b = new ei3();
    public static final wn5 c = new wn5(new fo5(3), -335132569, false);
    public static final wn5 d = new wn5(new jo5(23), -347315134, false);
    public static final wn5 e;
    public static final wn5 f;
    public static final dl4 g;
    public static final bs4 h;
    public static final byte[] i;

    static {
        new wn5(new lo5(11), 1883337271, false);
        new wn5(new lo5(12), -465103392, false);
        e = new wn5(new po5(25), -500652636, false);
        f = new wn5(new wo5(14), -856011165, false);
        new wn5(new wo5(15), -62308304, false);
        new wn5(new wo5(16), -1681740548, false);
        new wn5(new wo5(17), -1836122116, false);
        g = new dl4(18);
        h = new bs4(26);
        i = new byte[0];
    }

    public static final void A(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder l = tlm.l(j, "size=", " offset=");
            l.append(j2);
            l.append(" byteCount=");
            l.append(j3);
            throw new ArrayIndexOutOfBoundsException(l.toString());
        }
    }

    public static final rar B(pjc pjcVar, mm6 mm6Var, rjc rjcVar) {
        pjcVar.getClass();
        mm6Var.getClass();
        rjcVar.getClass();
        return x97.y(mm6Var, null, null, new fzb(pjcVar, rjcVar, (Continuation) null, 10), 3);
    }

    public static pjc C(pjc pjcVar, long j, Function1 function1) {
        pjcVar.getClass();
        TimeUnit.MILLISECONDS.getClass();
        return j == 0 ? pjcVar : zsd.M0(pjcVar, new ekc(function1, j, (Continuation) null));
    }

    public static final void D(ConstraintLayout constraintLayout) {
        int generateViewId;
        constraintLayout.getClass();
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() == -1) {
                if (dgs.a == Thread.currentThread()) {
                    generateViewId = kg5.k;
                    kg5.k = (generateViewId == 1 ? 16777215 : generateViewId) - 1;
                } else {
                    generateViewId = View.generateViewId();
                }
                childAt.setId(generateViewId);
            }
        }
    }

    public static xme E(jzb jzbVar, long j, hq5 hq5Var, int i2) {
        yci k;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(721862181);
        du0 du0Var = du0.c;
        long j2 = (i2 & 4) != 0 ? ((dq0) oq5Var.j(eq0.a)).b.a : j;
        if (jzbVar == null) {
            oq5Var.p(false);
            return null;
        }
        agr agrVar = es5.h;
        jx7 jx7Var = (jx7) oq5Var.j(agrVar);
        long D = v7g.D(jx7Var.p(du0Var.a) / jx7Var.i0(), 4294967296L);
        jx7 jx7Var2 = (jx7) oq5Var.j(agrVar);
        long D2 = v7g.D(jx7Var2.p(du0Var.b) / jx7Var2.i0(), 4294967296L);
        int ordinal = jzbVar.ordinal();
        vci vciVar = vci.a;
        if (ordinal == 0) {
            oq5Var.Z(-2075126706);
            k = a.k(d.c(vciVar, 1.0f), 0.0f, ff7.P(v7g.z(2), oq5Var), 1);
            oq5Var.p(false);
        } else if (ordinal == 1) {
            oq5Var.Z(-2075122418);
            k = a.k(d.c(vciVar, 1.0f), 0.0f, ff7.P(v7g.z(2), oq5Var), 1);
            oq5Var.p(false);
        } else {
            if (ordinal != 2) {
                throw vz1.i(oq5Var, -2075130018, false);
            }
            oq5Var.Z(-2075117938);
            k = a.k(d.c(vciVar, 1.0f), 0.0f, ff7.P(v7g.z(2), oq5Var), 1);
            oq5Var.p(false);
        }
        xme xmeVar = new xme("explicit", D, D2, ild.C(1868250309, new dj(1, j2, jzbVar, k), oq5Var));
        oq5Var.p(false);
        return xmeVar;
    }

    public static final String F() {
        if (!bp6.a.contains(ox6.class)) {
            try {
                Context b2 = j3c.b();
                List<ResolveInfo> queryIntentServices = b2.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices != null) {
                    String[] strArr = a;
                    HashSet hashSet = new HashSet(tah.a(3));
                    xz0.U(strArr, hashSet);
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        ServiceInfo serviceInfo = it.next().serviceInfo;
                        if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                            return serviceInfo.packageName;
                        }
                    }
                }
            } catch (Throwable th) {
                bp6.a(ox6.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String G() {
        if (bp6.a.contains(ox6.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + j3c.b().getPackageName();
        } catch (Throwable th) {
            bp6.a(ox6.class, th);
            return null;
        }
    }

    public static final String H(String str) {
        if (bp6.a.contains(ox6.class)) {
            return null;
        }
        try {
            return wxf.z(j3c.b(), str) ? str : wxf.z(j3c.b(), G()) ? G() : "";
        } catch (Throwable th) {
            bp6.a(ox6.class, th);
            return null;
        }
    }

    public static final dpe I(File file) {
        file.getClass();
        dpe dpeVar = new dpe();
        String name = file.getName();
        name.getClass();
        dpeVar.a = name;
        dpeVar.b = c.v(name, "crash_log_", false) ? cpe.d : c.v(name, "shield_log_", false) ? cpe.e : c.v(name, "thread_check_log_", false) ? cpe.f : c.v(name, "analysis_log_", false) ? cpe.b : c.v(name, "anr_log_", false) ? cpe.c : cpe.a;
        JSONObject y0 = zsd.y0(name);
        if (y0 != null) {
            dpeVar.g = Long.valueOf(y0.optLong("timestamp", 0L));
            dpeVar.d = y0.optString("app_version", null);
            dpeVar.e = y0.optString("reason", null);
            dpeVar.f = y0.optString("callstack", null);
            dpeVar.c = y0.optJSONArray("feature_names");
        }
        return dpeVar;
    }

    public static ewe J(xzi xziVar, Context context, tc9 tc9Var) {
        Object obj = ((lwj) xziVar.a).a;
        if (obj != null) {
            return (ewe) obj;
        }
        en9 en9Var = new en9(0, tc9Var);
        dn9 dn9Var = new dn9(context, new y19(18));
        v8a v8aVar = new v8a(1, new vm9(en9Var, 1));
        klx klxVar = new klx(24);
        new CopyOnWriteArraySet();
        gy2 gy2Var = y7k.a;
        new e3s(new sml(dn9Var, gy2Var, klxVar, v8aVar), gy2Var);
        new LinkedHashMap();
        e5b.a.getClass();
        return new ewe(new rin(dn9Var));
    }

    public static final eno K(pjc pjcVar, long j) {
        pjcVar.getClass();
        msa msaVar = nsa.b;
        return new eno(new gkc(pjcVar, yd5.N(j, ssa.MILLISECONDS), null, 0));
    }

    public static tc4 L(pjc pjcVar, long j) {
        return zsd.K(new n5(pjcVar, new rea(11), j, (Continuation) null, 2));
    }

    public static final d70 M(aab aabVar, int i2, String str) {
        aabVar.getClass();
        str.getClass();
        if (aabVar instanceof lt) {
            lt ltVar = (lt) aabVar;
            return new d70(ltVar.a, c70.a, ltVar.c, i2, i2 == -1 ? -1 : 0, str);
        }
        if (aabVar instanceof u51) {
            u51 u51Var = (u51) aabVar;
            return new d70(u51Var.a, c70.b, u51Var.b, i2, i2 == -1 ? -1 : 0, str);
        }
        if (!(aabVar instanceof eul)) {
            b6e.s();
            return null;
        }
        eul eulVar = (eul) aabVar;
        return new d70(eulVar.f, c70.d, eulVar.c, i2, i2 == -1 ? -1 : 0, str);
    }

    public static final d5d N(StationId stationId) {
        stationId.getClass();
        String p = stationId.p();
        p.getClass();
        String n = stationId.n();
        n.getClass();
        return new d5d(p, n);
    }

    public static final String O(byte b2) {
        char[] cArr = kg5.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String P(int i2) {
        if (i2 == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        char[] cArr = kg5.b;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return c.l(cArr2, i3, 8);
    }

    public static xme Q(long j, hq5 hq5Var, int i2) {
        du0 du0Var = du0.c;
        if ((i2 & 2) != 0) {
            j = ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a;
        }
        agr agrVar = es5.h;
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(agrVar);
        long D = v7g.D(jx7Var.p(du0Var.a) / jx7Var.i0(), 4294967296L);
        jx7 jx7Var2 = (jx7) oq5Var.j(agrVar);
        return new xme("videoicon", D, v7g.D(jx7Var2.p(du0Var.b) / jx7Var2.i0(), 4294967296L), ild.C(-551915448, new bu0(j, 1), oq5Var));
    }

    public static final eno R(pjc pjcVar, Object obj) {
        pjcVar.getClass();
        return new eno(new lkc(obj, pjcVar, (Continuation) null));
    }

    public static final eno S(vdr vdrVar) {
        vdrVar.getClass();
        return new eno(new nkc(vdrVar, null, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static final void a(final be beVar, hq5 hq5Var, final int i2) {
        boolean z;
        boolean z2;
        oq5 oq5Var;
        final int i3;
        final be beVar2 = beVar;
        beVar2.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1584718319);
        int i4 = 2;
        int i5 = 1;
        if ((((i2 & 6) == 0 ? i2 | (oq5Var2.h(beVar2) ? 4 : 2) : i2) & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            i3 = 1;
            oq5Var = oq5Var2;
        } else {
            ynn i6 = irv.i(oq5Var2);
            String M = rvf.M(R.string.has_notification, oq5Var2);
            vci vciVar = vci.a;
            final boolean z3 = 0;
            float f2 = 0.0f;
            yci o = a.o(bfg.x(d.d(vciVar, 1.0f), bfg.C(oq5Var2), false, 14), 16, 0.0f, 2);
            nho a2 = lho.a(qx0.g, b2c.k, oq5Var2, 6);
            int i7 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            List list = (List) gld.O(beVar2.c, oq5Var2).getValue();
            oq5Var2.Z(-1808168016);
            final int i8 = 0;
            ?? r10 = oq5Var2;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    u75.n();
                    throw null;
                }
                ie ieVar = (ie) obj;
                yci u = xp3.u(d.t(vciVar, 72, f2, i4), o5g.G(r10));
                boolean h2 = r10.h(beVar2) | r10.h(ieVar) | r10.d(i8);
                Object K = r10.K();
                Object obj2 = gq5.a;
                if (h2 || K == obj2) {
                    K = new de((Object) beVar2, (Object) ieVar, i8, (int) z3);
                    r10.k0(K);
                }
                yci e2 = androidx.compose.foundation.a.e(u, false, null, null, (Function0) K, 7);
                boolean h3 = r10.h(beVar2) | r10.d(i8);
                Object K2 = r10.K();
                if (h3 || K2 == obj2) {
                    K2 = new Function2() { // from class: ee
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (z3) {
                                case 0:
                                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                                    String str = (String) obj4;
                                    str.getClass();
                                    int i10 = i8 + 1;
                                    be beVar3 = beVar2;
                                    beVar3.getClass();
                                    pkb pkbVar = pkb.NonApplicable;
                                    ge geVar = beVar3.a;
                                    String str2 = geVar.c.c.a;
                                    str2.getClass();
                                    weo.H(geVar.b, new thj(pkbVar, str2, i10, 1, ""), booleanValue, str, null);
                                    break;
                                default:
                                    ((Integer) obj4).intValue();
                                    int R = rvf.R(i8 | 1);
                                    ox6.a(beVar2, (hq5) obj3, R);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r10.k0(K2);
                }
                yci b2 = com.yandex.music.core.ui.compose.a.b(e2, i6, 0L, 0.0f, null, (Function2) K2, 14);
                ynn ynnVar = i6;
                boolean h4 = r10.h(ieVar) | r10.f(M);
                Object K3 = r10.K();
                if (h4 || K3 == obj2) {
                    K3 = new kc(i5, ieVar, M);
                    r10.k0(K3);
                }
                yci a3 = nfp.a(b2, (Function1) K3);
                ta5 a4 = sa5.a(qx0.c, b2c.o, r10, 48);
                int i10 = r10.P;
                androidx.compose.runtime.internal.a l2 = r10.l();
                yci H2 = vnj.H(r10, a3);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                r10.d0();
                if (r10.O) {
                    r10.k(grbVar2);
                } else {
                    r10.n0();
                }
                kb5 kb5Var2 = wp5.f;
                g0g.U(r10, a4, kb5Var2);
                kb5 kb5Var3 = wp5.e;
                g0g.U(r10, l2, kb5Var3);
                kb5 kb5Var4 = wp5.g;
                if (r10.O || !Intrinsics.d(r10.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, r10, i10, kb5Var4);
                }
                kb5 kb5Var5 = wp5.d;
                g0g.U(r10, H2, kb5Var5);
                String str = M;
                int i11 = i8;
                vci vciVar2 = vciVar;
                ltg.e(qo6.m, ieVar.c, d.m(vciVar, 60), null, null, null, null, null, r10, 390, 248);
                u1g.l(r10, d.e(vciVar2, i4));
                float f3 = 4;
                nho a5 = lho.a(qx0.g(f3), b2c.l, r10, 54);
                int i12 = r10.P;
                androidx.compose.runtime.internal.a l3 = r10.l();
                yci H3 = vnj.H(r10, vciVar2);
                r10.d0();
                if (r10.O) {
                    r10.k(grbVar2);
                } else {
                    r10.n0();
                }
                g0g.U(r10, a5, kb5Var2);
                g0g.U(r10, l3, kb5Var3);
                if (r10.O || !Intrinsics.d(r10.K(), Integer.valueOf(i12))) {
                    ouj.x(i12, r10, i12, kb5Var4);
                }
                g0g.U(r10, H3, kb5Var5);
                if (ieVar.f) {
                    r10.Z(-1936676620);
                    z = false;
                    ug3.a(androidx.compose.foundation.a.b(d.m(vciVar2, 8), ((dq0) r10.j(eq0.a)).a.a, ugo.a), r10, 0);
                } else {
                    z = false;
                    r10.Z(-1940761521);
                }
                r10.p(z);
                String str2 = ieVar.b;
                ges j = nu0.j();
                long j2 = ((dq0) r10.j(eq0.a)).b.a;
                yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "title");
                oq5 oq5Var3 = r10;
                int i13 = i4;
                xv7.j(str2, a6, j2, 0L, 0L, 0, 0L, 2, false, 1, 1, null, j, oq5Var3, 48, 27696, 38904);
                oq5 oq5Var4 = oq5Var3;
                oq5Var4.p(true);
                oq5Var4.p(true);
                if (u75.g(list) != i11) {
                    oq5Var4.Z(-387437255);
                    u1g.l(oq5Var4, d.r(vciVar2, f3));
                    z2 = false;
                } else {
                    z2 = false;
                    oq5Var4.Z(-392385227);
                }
                oq5Var4.p(z2);
                i5 = 1;
                vciVar = vciVar2;
                z3 = z2;
                i6 = ynnVar;
                i8 = i9;
                M = str;
                f2 = 0.0f;
                i4 = i13;
                beVar2 = beVar;
                r10 = oq5Var4;
            }
            ?? r0 = i5;
            r10.p(z3);
            r10.p(r0);
            i3 = r0;
            oq5Var = r10;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: ee
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    switch (i3) {
                        case 0:
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            String str3 = (String) obj4;
                            str3.getClass();
                            int i102 = i2 + 1;
                            be beVar3 = beVar;
                            beVar3.getClass();
                            pkb pkbVar = pkb.NonApplicable;
                            ge geVar = beVar3.a;
                            String str22 = geVar.c.c.a;
                            str22.getClass();
                            weo.H(geVar.b, new thj(pkbVar, str22, i102, 1, ""), booleanValue, str3, null);
                            break;
                        default:
                            ((Integer) obj4).intValue();
                            int R = rvf.R(i2 | 1);
                            ox6.a(beVar, (hq5) obj3, R);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(List list, v40 v40Var, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        list.getClass();
        v40Var.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1869938482);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(v40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, list, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            vm C = ghh.C(o0kVar, a.a(0.0f, 16, 1));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "audiobooks_list");
            boolean h2 = oq5Var.h(list) | oq5Var.h(v40Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new kc(10, list, v40Var);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(i2, 1, list, v40Var, fvfVar, o0kVar);
        }
    }

    public static final void c(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1587062183);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i4 = i3 & 14;
            yci q = a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            men.i(i4, oq5Var2, null, z);
            oq5Var = oq5Var2;
            jf0.e(z, null, null, false, false, null, oq5Var, i4, 62);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i2, 1);
        }
    }

    public static final void d(aki akiVar, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        akiVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1509445469);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(akiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci q = a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.h(R.string.listening_history_context_artist, 0, 2, oq5Var, null);
            jd1 jd1Var = akiVar.a;
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new hb(17, function1, akiVar);
                oq5Var.k0(K);
            }
            jf0.b((Function0) K, jd1Var, null, null, null, null, oq5Var, 0, 60);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(akiVar, function1, yciVar, i2, 10);
        }
    }

    public static final void e(final yci yciVar, final o0k o0kVar, float f2, final long j, final Function2 function2, wn5 wn5Var, hq5 hq5Var, final int i2) {
        float f3;
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1413614900);
        int i3 = 2;
        if (((i2 | (oq5Var.f(yciVar) ? 4 : 2) | (oq5Var.f(o0kVar) ? 32 : 16) | (oq5Var.e(j) ? 2048 : 1024) | 24576) & 599187) == 599186 && oq5Var.z()) {
            oq5Var.S();
            f3 = f2;
            wn5Var2 = wn5Var;
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            hz2 hz2Var = b2c.l;
            yci u = xp3.u(yciVar, ugo.a(52));
            vci vciVar = vci.a;
            yci l = a.l(androidx.compose.foundation.a.b(u.f(vciVar), j, vnj.i), o0kVar);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, l);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (function2 == null) {
                oq5Var.Z(-238134547);
                oq5Var.p(false);
                f3 = f2;
            } else {
                oq5Var.Z(-238134546);
                zwf.i(((dq0) oq5Var.j(eq0.a)).a.c, ild.C(613760579, new im0(function2, 3), oq5Var), oq5Var, 48);
                f3 = f2;
                vz1.B(vciVar, f3, oq5Var, false);
            }
            qzm a3 = sb6.a.a(new d85(((dq0) oq5Var.j(eq0.a)).b.a));
            qs5 qs5Var = xcs.a;
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            wn5Var2 = wn5Var;
            etn.m(new qzm[]{a3, qs5Var.a(nu0.i())}, ild.C(1656828200, new y61(wn5Var2, i3), oq5Var), oq5Var, 56);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final float f4 = f3;
            final wn5 wn5Var3 = wn5Var2;
            r.d = new Function2(o0kVar, f4, j, function2, wn5Var3, i2) { // from class: wj4
                public final /* synthetic */ o0k b;
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ wn5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1769857);
                    ox6.e(yci.this, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i2, hq5 hq5Var, yci yciVar, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1373490000);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.f(str) ? 32 : 16) | (oq5Var.f(str2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            g(z, ild.C(-1423823625, new da1(str, 3), oq5Var), ild.C(-1254679850, new da1(str2, 4), oq5Var), ild.C(-1085536075, new sm(17, z), oq5Var), yciVar, oq5Var, (i3 & 14) | 3504 | ((i3 << 3) & 57344));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(z, str, str2, yciVar, i2, 5);
        }
    }

    public static final void g(boolean z, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(997730155);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            yci d2 = d.d(yciVar, 1.0f);
            boolean z2 = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new i32(1, z);
                oq5Var.k0(K);
            }
            yci m = a.m(nfp.b(d2, false, (Function1) K), 16);
            nho a2 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(oq5Var, Integer.valueOf((i3 >> 3) & 14));
            eta.l((i3 >> 6) & 14, wn5Var2, oq5Var, true);
            eta.l((i3 >> 9) & 14, wn5Var3, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k95(z, wn5Var, wn5Var2, wn5Var3, yciVar, i2, 0);
        }
    }

    public static final void h(lx5 lx5Var, ww5 ww5Var, vm vmVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        vm vmVar2 = vmVar;
        ww5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1364351195);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(lx5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(ww5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(vmVar2) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            boolean z = lx5Var instanceof gx5;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-2110592527);
                boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new ny2(7, lx5Var, ww5Var);
                    oq5Var.k0(K);
                }
                weo.g(vciVar, null, vmVar, null, null, null, false, (Function1) K, oq5Var, ((i4 >> 9) & 14) | (i4 & 896), 250);
                vmVar2 = vmVar;
                oq5Var.p(false);
            } else {
                if (!lx5Var.equals(hx5.a)) {
                    throw vz1.i(oq5Var, -1176464443, false);
                }
                oq5Var.Z(-2109465026);
                m(bfg.Q(a.o(a.l(d.c(vciVar, 1.0f), vmVar2), 16, 0.0f, 2), bfg.C(oq5Var), false, 14), oq5Var, 0);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(lx5Var, ww5Var, false, vmVar2, yciVar2, i2, 24);
        }
    }

    public static final void i(n9b n9bVar, final nt6 nt6Var) {
        n9bVar.getClass();
        nt6Var.getClass();
        lg3.D(n9bVar, 8);
        final int i2 = 0;
        wn5 wn5Var = new wn5(new Function2() { // from class: xt6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String N;
                switch (i2) {
                    case 0:
                        hq5 hq5Var = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var = (oq5) hq5Var;
                            if (oq5Var.z()) {
                                oq5Var.S();
                                break;
                            }
                        }
                        oq5 oq5Var2 = (oq5) hq5Var;
                        Object K = oq5Var2.K();
                        if (K == gq5.a) {
                            K = new rn6(8);
                            oq5Var2.k0(K);
                        }
                        bg3.a(nfp.b(vci.a, true, (Function1) K), null, false, ild.C(-1117040640, new tt5(5, nt6Var), oq5Var2), oq5Var2, 3072, 6);
                    default:
                        hq5 hq5Var2 = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                break;
                            }
                        }
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(-1912828928);
                        StringBuilder sb = new StringBuilder();
                        nt6 nt6Var2 = nt6Var;
                        CharSequence charSequence = nt6Var2.c;
                        Long l = nt6Var2.d;
                        sb.append(charSequence);
                        if (l == null) {
                            oq5Var4.Z(1244153750);
                            oq5Var4.p(false);
                            N = null;
                        } else {
                            oq5Var4.Z(-929697333);
                            N = xee.N(l.longValue(), oq5Var4);
                            oq5Var4.p(false);
                        }
                        sb.append(N);
                        String sb2 = sb.toString();
                        oq5Var4.p(false);
                        kn0 kn0Var = new kn0();
                        kn0Var.c(nt6Var2.c);
                        kn0Var.d(" • ");
                        kn0Var.c(l != null ? lxe.K(l.longValue()) : null);
                        mn0 h2 = kn0Var.h();
                        ges j = nu0.j();
                        long j2 = ((dq0) oq5Var4.j(eq0.a)).b.b;
                        yci o = a.o(d.d(vci.a, 1.0f), 24, 0.0f, 2);
                        boolean f2 = oq5Var4.f(sb2);
                        Object K2 = oq5Var4.K();
                        if (f2 || K2 == gq5.a) {
                            K2 = new wq(sb2, 17);
                            oq5Var4.k0(K2);
                        }
                        xv7.i(h2, androidx.compose.ui.platform.a.a(nfp.b(o, false, (Function1) K2), "credentials_bottom_sheet_subtitle"), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, null, j, null, null, oq5Var4, 0, 0, 917240);
                        break;
                }
                return Unit.a;
            }
        }, 938565270, true);
        ubi ubiVar = n9bVar.a;
        ubiVar.a(wn5Var);
        lg3.D(n9bVar, 6);
        if (nt6Var.c != null) {
            final int i3 = 1;
            ubiVar.a(new wn5(new Function2() { // from class: xt6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String N;
                    switch (i3) {
                        case 0:
                            hq5 hq5Var = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var = (oq5) hq5Var;
                                if (oq5Var.z()) {
                                    oq5Var.S();
                                    break;
                                }
                            }
                            oq5 oq5Var2 = (oq5) hq5Var;
                            Object K = oq5Var2.K();
                            if (K == gq5.a) {
                                K = new rn6(8);
                                oq5Var2.k0(K);
                            }
                            bg3.a(nfp.b(vci.a, true, (Function1) K), null, false, ild.C(-1117040640, new tt5(5, nt6Var), oq5Var2), oq5Var2, 3072, 6);
                        default:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            oq5Var4.Z(-1912828928);
                            StringBuilder sb = new StringBuilder();
                            nt6 nt6Var2 = nt6Var;
                            CharSequence charSequence = nt6Var2.c;
                            Long l = nt6Var2.d;
                            sb.append(charSequence);
                            if (l == null) {
                                oq5Var4.Z(1244153750);
                                oq5Var4.p(false);
                                N = null;
                            } else {
                                oq5Var4.Z(-929697333);
                                N = xee.N(l.longValue(), oq5Var4);
                                oq5Var4.p(false);
                            }
                            sb.append(N);
                            String sb2 = sb.toString();
                            oq5Var4.p(false);
                            kn0 kn0Var = new kn0();
                            kn0Var.c(nt6Var2.c);
                            kn0Var.d(" • ");
                            kn0Var.c(l != null ? lxe.K(l.longValue()) : null);
                            mn0 h2 = kn0Var.h();
                            ges j = nu0.j();
                            long j2 = ((dq0) oq5Var4.j(eq0.a)).b.b;
                            yci o = a.o(d.d(vci.a, 1.0f), 24, 0.0f, 2);
                            boolean f2 = oq5Var4.f(sb2);
                            Object K2 = oq5Var4.K();
                            if (f2 || K2 == gq5.a) {
                                K2 = new wq(sb2, 17);
                                oq5Var4.k0(K2);
                            }
                            xv7.i(h2, androidx.compose.ui.platform.a.a(nfp.b(o, false, (Function1) K2), "credentials_bottom_sheet_subtitle"), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, null, j, null, null, oq5Var4, 0, 0, 917240);
                            break;
                    }
                    return Unit.a;
                }
            }, -1092492040, true));
        }
        lg3.D(n9bVar, 32);
    }

    public static final void j(ks6 ks6Var, hq5 hq5Var, int i2) {
        ks6 ks6Var2;
        ks6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1572224193);
        if (((i2 | (oq5Var.h(ks6Var) ? 4 : 2)) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            ks6Var2 = ks6Var;
        } else {
            vci vciVar = vci.a;
            yci d2 = d.d(vciVar, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new rn6(7);
                oq5Var.k0(K);
            }
            yci a2 = androidx.compose.ui.platform.a.a(nfp.b(d2, true, (Function1) K), "credentials_bottom_sheet_item");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String upperCase = ks6Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            ges i4 = nu0.i();
            agr agrVar = eq0.a;
            xcs.b(upperCase, androidx.compose.ui.platform.a.a(vciVar, "credentials_bottom_sheet_item_title"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, i4, oq5Var, 48, 0, 65528);
            u1g.l(oq5Var, d.e(vciVar, 4));
            ks6Var2 = ks6Var;
            xcs.b(ks6Var2.b, androidx.compose.ui.platform.a.a(vciVar, "credentials_bottom_sheet_item_subtitle"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
            oq5Var = oq5Var;
            eta.p(vciVar, 16, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(ks6Var2, i2, 18);
        }
    }

    public static final DelegatePrepareParams k(Function1 function1) {
        function1.getClass();
        zv7 zv7Var = new zv7();
        function1.invoke(zv7Var);
        Boolean bool = zv7Var.a;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = zv7Var.b;
        return new DelegatePrepareParams(booleanValue, bool2 != null ? bool2.booleanValue() : false, zv7Var.c, zv7Var.d, zv7Var.e, zv7Var.f, null);
    }

    public static final void l(rja rjaVar, hq5 hq5Var, int i2) {
        rjaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-823380389);
        int i3 = (oq5Var.f(rjaVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            wja wjaVar = (wja) gld.O(rjaVar.f, oq5Var).getValue();
            if (wjaVar instanceof uja) {
                oq5Var.Z(-766734781);
                zsd.m((uja) wjaVar, rjaVar, oq5Var, (i3 << 3) & 112);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(wjaVar, vja.a)) {
                    throw vz1.i(oq5Var, -994568420, false);
                }
                oq5Var.Z(-766557988);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(rjaVar, i2, 2);
        }
    }

    public static final void m(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1726708340);
        if (((i2 | (oq5Var.f(yciVar) ? 4 : 2)) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String M = rvf.M(R.string.concert_location_selector_empty_search_title, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            xcs.b(M, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var, 0, 0, 65018);
            xcs.b(vz1.o(vci.a, 8, oq5Var, R.string.concert_location_selector_empty_search_description, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65018);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 18);
        }
    }

    public static final erb n(Function1 function1) {
        function1.getClass();
        drb drbVar = new drb();
        function1.invoke(drbVar);
        dw1 dw1Var = drbVar.a;
        if (dw1Var == null) {
            dw1Var = new dw1(true);
        }
        dw1 dw1Var2 = dw1Var;
        lqa lqaVar = new lqa();
        xqr xqrVar = drbVar.b;
        if (xqrVar == null) {
            xqrVar = new xqr(false, false, false);
        }
        return new erb(dw1Var2, lqaVar, xqrVar, drbVar.c, drbVar.d, drbVar.e);
    }

    public static final void o(j2e j2eVar, qnq qnqVar, List list, fvf fvfVar, vm vmVar, q0k q0kVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1614300619);
        int i3 = i2 | (oq5Var2.h(j2eVar) ? 4 : 2) | (oq5Var2.h(qnqVar) ? 32 : 16) | (oq5Var2.f(list) ? 256 : 128) | (oq5Var2.f(fvfVar) ? 2048 : 1024) | (oq5Var2.f(vmVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(q0kVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            boolean booleanValue = ((Boolean) gld.M(j2eVar.i, oq5Var2).getValue()).booleanValue();
            boolean h2 = oq5Var2.h(j2eVar);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                v2d v2dVar = new v2d(0, j2eVar, j2e.class, "onRefresh", "onRefresh()V", 0, 8);
                oq5Var2.k0(v2dVar);
                K = v2dVar;
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), vmVar, null, false, ild.C(2090339765, new k2e(list, qnqVar, fvfVar, vmVar, q0kVar, j2eVar, 0), oq5Var2), oq5Var, ((i3 >> 6) & 896) | 196608, 24);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k2e(j2eVar, qnqVar, list, fvfVar, vmVar, q0kVar, i2);
        }
    }

    public static final void p(j2e j2eVar, qnq qnqVar, nnq nnqVar, tmb tmbVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        fvf fvfVar;
        j2eVar.getClass();
        nnqVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1738291228);
        int i3 = i2 | (oq5Var2.h(j2eVar) ? 32 : 16) | (oq5Var2.h(qnqVar) ? 256 : 128) | (oq5Var2.f(nnqVar) ? 2048 : 1024) | (oq5Var2.h(tmbVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            aqi O = gld.O(j2eVar.f, oq5Var2);
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            aqi O2 = gld.O(j2eVar.g, oq5Var2);
            aqi O3 = gld.O(j2eVar.h, oq5Var2);
            k2s k2sVar = (k2s) O2.getValue();
            String str = (String) O3.getValue();
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K);
            }
            aqi aqiVar = (aqi) K;
            aqi o0 = szf.o0(k2sVar, oq5Var2);
            aqi o02 = szf.o0(str, oq5Var2);
            Unit unit = Unit.a;
            boolean f2 = oq5Var2.f(o0) | oq5Var2.f(o02) | oq5Var2.f(a2);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == kjnVar) {
                fvfVar = a2;
                d57 d57Var = new d57(o0, o02, fvfVar, aqiVar, (Continuation) null, 26);
                oq5Var2.k0(d57Var);
                K2 = d57Var;
            } else {
                fvfVar = a2;
            }
            gld.w(oq5Var2, unit, (Function2) K2);
            u7g.a(((ma5) oq5Var2.j(pa5.a)).g(), oq5Var2, 0);
            cpq cpqVar = (cpq) gld.M(j2eVar.e, oq5Var2).getValue();
            oq5Var = oq5Var2;
            ogp.g.e(cpqVar instanceof zoq, cpqVar instanceof apq, null, oq5Var, 4096, 4);
            q7g.r(3078, 6, ild.C(-598002230, new bj(O2, fvfVar, j2eVar, O, aqiVar, 21), oq5Var), ild.C(1494088336, new kt4(cpqVar, j2eVar, tmbVar, qnqVar, nnqVar, fvfVar, 1), oq5Var), oq5Var, null, false);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(i2, 12, j2eVar, qnqVar, nnqVar, tmbVar);
        }
    }

    public static final void q(List list, bdf bdfVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        list.getClass();
        bdfVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1193361769);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(bdfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, list, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            vm C = ghh.C(o0kVar, a.c(0.0f, 24, 0.0f, 16, 5));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "albums_list");
            boolean h2 = oq5Var.h(list) | oq5Var.h(bdfVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dae(4, list, bdfVar);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 12, list, bdfVar, fvfVar, o0kVar);
        }
    }

    public static final void r(kx5 kx5Var, Function0 function0, Function2 function2, yci yciVar, hq5 hq5Var, int i2) {
        String str;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2077025050);
        int i3 = i2 | (oq5Var.f(kx5Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | 3072;
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (kx5Var instanceof ix5) {
                str = vz1.n(oq5Var, 940814847, R.string.concert_location_selector_auto_detect, oq5Var, false);
            } else {
                if (!(kx5Var instanceof jx5)) {
                    throw vz1.i(oq5Var, 1138725992, false);
                }
                oq5Var.Z(940938258);
                oq5Var.p(false);
                str = ((jx5) kx5Var).a.b;
            }
            boolean a2 = kx5Var.a();
            boolean z = (i3 & 896) == 256;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new im0(function2, 5);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            s((i3 << 3) & 896, oq5Var, com.yandex.music.core.ui.compose.a.b(vciVar, null, 0L, 0.0f, null, (Function2) K, 15), str, function0, a2);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(kx5Var, function0, function2, yciVar2, i2, 2);
        }
    }

    public static final void s(int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2096722710);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hz2 hz2Var = b2c.l;
            float f2 = 24;
            yci g2 = d.g(yciVar, f2, 0.0f, 2);
            boolean z2 = (i3 & 896) == 256;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new or(11, function0);
                oq5Var.k0(K);
            }
            yci n = a.n(androidx.compose.foundation.a.e(g2, false, null, null, (Function0) K, 7), 16, 22);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, n);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).b.a;
            ges j2 = nu0.j();
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(str, new LayoutWeightElement(true, 1.0f), j, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, j2, oq5Var, i3 & 14, 3120, 55288);
            oq5Var = oq5Var;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-7977467);
                gae.b(a0g.E(R.drawable.ic_check_24, 0, oq5Var), null, d.m(vciVar, f2), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 432, 0);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-7722399);
                u1g.l(oq5Var, d.e(vciVar, f2));
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iw5(str, z, function0, yciVar, i2);
        }
    }

    public static final String t(String str, List list) {
        str.getClass();
        list.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue() + i2;
            if (intValue < str.length()) {
                str = ouj.o(up6.S(0, Integer.valueOf(intValue), str), StringUtil.SPACE, up6.S(intValue, Integer.valueOf(str.length()), str));
                i2++;
            }
        }
        return str;
    }

    public static final boolean u(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final Object v(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? c5b.a : new gh2((mu7[]) collection.toArray(new mu7[0])).a(continuation);
    }

    public static final Object w(mu7[] mu7VarArr, cg6 cg6Var) {
        return mu7VarArr.length == 0 ? c5b.a : new gh2(mu7VarArr).a(cg6Var);
    }

    public static xme x(String str, hq5 hq5Var, int i2) {
        long z = v7g.z(24);
        long j = ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a;
        String str2 = (i2 & 4) != 0 ? null : str;
        agr agrVar = es5.h;
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(agrVar);
        long D = v7g.D(jx7Var.p(z) / jx7Var.i0(), 4294967296L);
        jx7 jx7Var2 = (jx7) oq5Var.j(agrVar);
        return new xme("block_header_arrow", D, v7g.D(jx7Var2.p(z) / jx7Var2.i0(), 4294967296L), ild.C(-791620433, new cu0(str2, j, 0), oq5Var));
    }

    public static final dpe y(String str, String str2) {
        dpe dpeVar = new dpe();
        dpeVar.b = cpe.c;
        Context b2 = j3c.b();
        String str3 = null;
        if (b2 != null) {
            try {
                PackageInfo packageInfo = b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0);
                if (packageInfo != null) {
                    str3 = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        dpeVar.d = str3;
        dpeVar.e = str;
        dpeVar.f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        dpeVar.g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        dpeVar.a = stringBuffer2;
        return dpeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dpe z(Throwable th, cpe cpeVar) {
        String str;
        PackageInfo packageInfo;
        dpe dpeVar = new dpe();
        dpeVar.b = cpeVar;
        Context b2 = j3c.b();
        String str2 = null;
        Throwable th2 = null;
        if (b2 != null) {
            try {
                packageInfo = b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionName;
                dpeVar.d = str;
                dpeVar.e = th != null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
                if (th != null) {
                    JSONArray jSONArray = new JSONArray();
                    while (th != null && th != th2) {
                        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        th2 = th;
                        th = th.getCause();
                    }
                    str2 = jSONArray.toString();
                }
                dpeVar.f = str2;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                dpeVar.g = valueOf;
                StringBuffer stringBuffer = new StringBuffer();
                int ordinal = cpeVar.ordinal();
                stringBuffer.append(ordinal == 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
                stringBuffer.append(String.valueOf(valueOf));
                stringBuffer.append(".json");
                String stringBuffer2 = stringBuffer.toString();
                stringBuffer2.getClass();
                dpeVar.a = stringBuffer2;
                return dpeVar;
            }
        }
        str = null;
        dpeVar.d = str;
        dpeVar.e = th != null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
        if (th != null) {
        }
        dpeVar.f = str2;
        Long valueOf2 = Long.valueOf(System.currentTimeMillis() / 1000);
        dpeVar.g = valueOf2;
        StringBuffer stringBuffer3 = new StringBuffer();
        int ordinal2 = cpeVar.ordinal();
        stringBuffer3.append(ordinal2 == 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
        stringBuffer3.append(String.valueOf(valueOf2));
        stringBuffer3.append(".json");
        String stringBuffer22 = stringBuffer3.toString();
        stringBuffer22.getClass();
        dpeVar.a = stringBuffer22;
        return dpeVar;
    }
}
