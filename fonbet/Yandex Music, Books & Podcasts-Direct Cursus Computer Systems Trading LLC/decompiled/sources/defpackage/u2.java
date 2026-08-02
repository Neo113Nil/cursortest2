package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(zl zlVar, qnq qnqVar) {
        this.a = 7;
        this.b = qnqVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        jz4 jz4Var = (jz4) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            boolean h = oq5Var.h(jz4Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new ub4(0, jz4Var, jz4.class, "onProfileClick", "onProfileClick()V", 0, 22);
                oq5Var.k0(K);
            }
            f8g.c((Function0) ((h9f) K), new kv4(2, jz4Var), null, oq5Var, 0);
            boolean h2 = oq5Var.h(jz4Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new ub4(0, jz4Var, jz4.class, "onSettingsClick", "onSettingsClick()V", 0, 23);
                oq5Var.k0(K2);
            }
            rzf.i((Function0) ((h9f) K2), null, oq5Var, 0);
            boolean h3 = oq5Var.h(jz4Var);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new ub4(0, jz4Var, jz4.class, "onSearchClick", "onSearchClick()V", 0, 24);
                oq5Var.k0(K3);
            }
            a0g.o(0, 6, 0L, oq5Var, null, (Function0) ((h9f) K3));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        j25 j25Var = (j25) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            boolean h = oq5Var.h(j25Var);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new r93(29, j25Var);
                oq5Var.k0(K);
            }
            u2x.j((Function0) K, null, null, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        v25 v25Var = (v25) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            boolean h = oq5Var.h(v25Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new ub4(0, v25Var, v25.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 25);
                oq5Var.k0(K);
            }
            a0g.q((Function0) ((h9f) K), null, oq5Var, 0);
            boolean h2 = oq5Var.h(v25Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new ub4(0, v25Var, v25.class, "onClickSearch", "onClickSearch()V", 0, 26);
                oq5Var.k0(K2);
            }
            aae.a((Function0) ((h9f) K2), null, false, vq1.e, oq5Var, 24576, 14);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        k65 k65Var = (k65) this.b;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            boolean h = oq5Var.h(k65Var);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                e65 e65Var = new e65(0, k65Var, k65.class, "onSearchClick", "onSearchClick()V", 0, 1);
                oq5Var.k0(e65Var);
                K = e65Var;
            }
            a0g.o(48, 4, 0L, oq5Var, androidx.compose.ui.platform.a.a(vci.a, "search_toolbar"), (Function0) ((h9f) K));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        rd5 rd5Var = (rd5) this.b;
        xd5 xd5Var = (xd5) obj;
        hq5 hq5Var = (hq5) obj2;
        ((Integer) obj3).getClass();
        xd5Var.getClass();
        if (xd5Var instanceof vd5) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-485262795);
            vut.p(((vd5) xd5Var).a, oq5Var, 0);
            oq5Var.p(false);
        } else {
            if (!(xd5Var instanceof wd5)) {
                throw vz1.i((oq5) hq5Var, -485264333, false);
            }
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(2136874317);
            wd5 wd5Var = (wd5) xd5Var;
            sdl sdlVar = wd5Var.e;
            boolean h = oq5Var2.h(rd5Var) | oq5Var2.h(xd5Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new qi(rd5Var, xd5Var, (Continuation) null, 28);
                oq5Var2.k0(K);
            }
            gld.w(oq5Var2, sdlVar, (Function2) K);
            String str = wd5Var.a;
            String str2 = wd5Var.b;
            boolean z = wd5Var.d;
            long F = nt0.F(wd5Var.c, oq5Var2, 2);
            obh g0 = hdg.g0("common: " + sdlVar.b.a, oq5Var2);
            boolean h2 = oq5Var2.h(rd5Var) | oq5Var2.h(xd5Var);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new ap1(23, rd5Var, xd5Var);
                oq5Var2.k0(K2);
            }
            lg3.l(str2, str, z, F, g0, (Function0) K2, null, oq5Var2, SQLiteDatabase.OPEN_NOMUTEX);
            oq5Var2.p(false);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x0a31 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0a85 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0ac9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b0d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0b51 A[ADDED_TO_REGION] */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        yci layoutWeightElement;
        htr htrVar;
        boolean f2;
        Object K;
        Object K2;
        boolean f3;
        Object K3;
        boolean f4;
        Object K4;
        boolean f5;
        Object K5;
        boolean f6;
        Object K6;
        oq5 oq5Var;
        int i;
        int i2;
        int i3 = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                r2 r2Var = (r2) obj;
                j1g j1gVar = (j1g) obj2;
                ((Boolean) obj3).getClass();
                r2Var.getClass();
                j1gVar.getClass();
                ((e3) ((v2) obj4).b.d.getValue()).getClass();
                return jbj.d(r2Var.a, r2Var.b, null, null, j1gVar == j1g.a);
            case 1:
                l3 l3Var = (l3) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                a63 a63Var = (a63) obj3;
                str.getClass();
                l3Var.getClass();
                if (a63Var != null) {
                    l3Var.d.b(booleanValue, str, a63Var, "");
                }
                return Unit.a;
            case 2:
                b4 b4Var = (b4) obj4;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                a63 a63Var2 = (a63) obj3;
                str2.getClass();
                b4Var.getClass();
                if (a63Var2 != null) {
                    b4Var.b.b(booleanValue2, str2, a63Var2, "");
                }
                return Unit.a;
            case 3:
                p4 p4Var = (p4) obj;
                j1g j1gVar2 = (j1g) obj2;
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                p4Var.getClass();
                j1gVar2.getClass();
                ((e3) ((v2) obj4).b.d.getValue()).getClass();
                boolean z = j1gVar2 == j1g.a;
                int i4 = p4Var.b;
                if (!z || !booleanValue3) {
                    if (z && !booleanValue3) {
                        i4++;
                    } else if (!z && booleanValue3) {
                        i4--;
                    }
                }
                return jbj.d(p4Var.a, null, Integer.valueOf(i4), null, z);
            case 4:
                s4 s4Var = (s4) obj4;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                    vci vciVar2 = vci.a;
                    yci l = androidx.compose.foundation.layout.a.l(bfg.Q(d.c(vciVar2, 1.0f), bfg.C(oq5Var2), false, 14), o0kVar);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    int i5 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, l);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a, wp5.f);
                    g0g.U(oq5Var2, l2, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var2, i5, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
                    qs5Var.getClass();
                    if (asq.I((Configuration) oq5Var2.j(qs5Var))) {
                        layoutWeightElement = androidx.compose.foundation.layout.a.m(vciVar2, 16);
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                    }
                    u1g.l(oq5Var2, d.d(layoutWeightElement, f));
                    s4Var.getClass();
                    Context context = s4Var.a;
                    quk qukVar = htr.f;
                    String language = swf.I().getLanguage();
                    language.getClass();
                    qukVar.getClass();
                    int hashCode = language.hashCode();
                    if (hashCode == 3424) {
                        if (language.equals("kk")) {
                            htrVar = htr.j;
                            String string = context.getString(R.string.about_version, "2026.07.4 #157gpr", 24026391, DateFormat.getDateInstance(1, htrVar.c).format(new Date(1784764800000L)));
                            string.getClass();
                            float f7 = 16;
                            yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, f7, 0.0f, f7, f7, 2), "version_info");
                            f2 = oq5Var2.f(s4Var);
                            K = oq5Var2.K();
                            if (!f2) {
                            }
                            K = new z4(s4Var, r13);
                            oq5Var2.k0(K);
                            Function0 S = irf.S((Function0) K, oq5Var2, 0);
                            K2 = oq5Var2.K();
                            if (K2 == kjnVar) {
                            }
                            etn.u(0, oq5Var2, androidx.compose.foundation.a.j(a2, null, S, (Function0) K2, 111), string);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a3 = androidx.compose.ui.platform.a.a(vciVar2, "btn_license");
                            String M = rvf.M(R.string.eula, oq5Var2);
                            f3 = oq5Var2.f(s4Var);
                            K3 = oq5Var2.K();
                            if (!f3) {
                            }
                            K3 = new z4(s4Var, 2);
                            oq5Var2.k0(K3);
                            kg5.b(3456, oq5Var2, a3, M, (Function0) K3, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a4 = androidx.compose.ui.platform.a.a(vciVar2, "btn_components");
                            String M2 = rvf.M(R.string.about_components, oq5Var2);
                            f4 = oq5Var2.f(s4Var);
                            K4 = oq5Var2.K();
                            if (!f4) {
                            }
                            K4 = new z4(s4Var, 3);
                            oq5Var2.k0(K4);
                            kg5.b(3456, oq5Var2, a4, M2, (Function0) K4, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "privacy_policy");
                            String M3 = rvf.M(R.string.privacy_policy, oq5Var2);
                            f5 = oq5Var2.f(s4Var);
                            K5 = oq5Var2.K();
                            if (!f5) {
                            }
                            K5 = new z4(s4Var, 4);
                            oq5Var2.k0(K5);
                            kg5.b(3456, oq5Var2, a5, M3, (Function0) K5, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "rules_of_recommendations");
                            String M4 = rvf.M(R.string.rules_of_recommendations, oq5Var2);
                            f6 = oq5Var2.f(s4Var);
                            K6 = oq5Var2.K();
                            if (!f6) {
                            }
                            K6 = new z4(s4Var, 5);
                            oq5Var2.k0(K6);
                            kg5.b(3456, oq5Var2, a6, M4, (Function0) K6, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.m(vciVar2, f7), rvf.M(R.string.content_minors, oq5Var2));
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            etn.u(0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f7, f7, f7, 0.0f, 8), rvf.M(R.string.project_of_yandex, oq5Var2));
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(1784764800000L);
                            String string2 = context.getString(R.string.copyright, Integer.valueOf(calendar.get(1)));
                            string2.getClass();
                            etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f7, 0.0f, f7, f7, 2), string2);
                            oq5Var2.p(true);
                        }
                        htrVar = htr.g;
                        String string3 = context.getString(R.string.about_version, "2026.07.4 #157gpr", 24026391, DateFormat.getDateInstance(1, htrVar.c).format(new Date(1784764800000L)));
                        string3.getClass();
                        float f72 = 16;
                        yci a22 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, f72, 0.0f, f72, f72, 2), "version_info");
                        f2 = oq5Var2.f(s4Var);
                        K = oq5Var2.K();
                        if (!f2) {
                        }
                        K = new z4(s4Var, r13);
                        oq5Var2.k0(K);
                        Function0 S2 = irf.S((Function0) K, oq5Var2, 0);
                        K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                        }
                        etn.u(0, oq5Var2, androidx.compose.foundation.a.j(a22, null, S2, (Function0) K2, 111), string3);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a32 = androidx.compose.ui.platform.a.a(vciVar2, "btn_license");
                        String M5 = rvf.M(R.string.eula, oq5Var2);
                        f3 = oq5Var2.f(s4Var);
                        K3 = oq5Var2.K();
                        if (!f3) {
                        }
                        K3 = new z4(s4Var, 2);
                        oq5Var2.k0(K3);
                        kg5.b(3456, oq5Var2, a32, M5, (Function0) K3, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a42 = androidx.compose.ui.platform.a.a(vciVar2, "btn_components");
                        String M22 = rvf.M(R.string.about_components, oq5Var2);
                        f4 = oq5Var2.f(s4Var);
                        K4 = oq5Var2.K();
                        if (!f4) {
                        }
                        K4 = new z4(s4Var, 3);
                        oq5Var2.k0(K4);
                        kg5.b(3456, oq5Var2, a42, M22, (Function0) K4, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a52 = androidx.compose.ui.platform.a.a(vciVar2, "privacy_policy");
                        String M32 = rvf.M(R.string.privacy_policy, oq5Var2);
                        f5 = oq5Var2.f(s4Var);
                        K5 = oq5Var2.K();
                        if (!f5) {
                        }
                        K5 = new z4(s4Var, 4);
                        oq5Var2.k0(K5);
                        kg5.b(3456, oq5Var2, a52, M32, (Function0) K5, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a62 = androidx.compose.ui.platform.a.a(vciVar2, "rules_of_recommendations");
                        String M42 = rvf.M(R.string.rules_of_recommendations, oq5Var2);
                        f6 = oq5Var2.f(s4Var);
                        K6 = oq5Var2.K();
                        if (!f6) {
                        }
                        K6 = new z4(s4Var, 5);
                        oq5Var2.k0(K6);
                        kg5.b(3456, oq5Var2, a62, M42, (Function0) K6, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.m(vciVar2, f72), rvf.M(R.string.content_minors, oq5Var2));
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        etn.u(0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f72, f72, f72, 0.0f, 8), rvf.M(R.string.project_of_yandex, oq5Var2));
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(1784764800000L);
                        String string22 = context.getString(R.string.copyright, Integer.valueOf(calendar2.get(1)));
                        string22.getClass();
                        etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f72, 0.0f, f72, f72, 2), string22);
                        oq5Var2.p(true);
                    } else if (hashCode != 3651) {
                        if (hashCode == 3749 && language.equals("uz")) {
                            htrVar = htr.i;
                            String string32 = context.getString(R.string.about_version, "2026.07.4 #157gpr", 24026391, DateFormat.getDateInstance(1, htrVar.c).format(new Date(1784764800000L)));
                            string32.getClass();
                            float f722 = 16;
                            yci a222 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, f722, 0.0f, f722, f722, 2), "version_info");
                            f2 = oq5Var2.f(s4Var);
                            K = oq5Var2.K();
                            if (!f2 || K == kjnVar) {
                                K = new z4(s4Var, r13);
                                oq5Var2.k0(K);
                            }
                            Function0 S22 = irf.S((Function0) K, oq5Var2, 0);
                            K2 = oq5Var2.K();
                            if (K2 == kjnVar) {
                                K2 = new s2(6);
                                oq5Var2.k0(K2);
                            }
                            etn.u(0, oq5Var2, androidx.compose.foundation.a.j(a222, null, S22, (Function0) K2, 111), string32);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a322 = androidx.compose.ui.platform.a.a(vciVar2, "btn_license");
                            String M52 = rvf.M(R.string.eula, oq5Var2);
                            f3 = oq5Var2.f(s4Var);
                            K3 = oq5Var2.K();
                            if (!f3 || K3 == kjnVar) {
                                K3 = new z4(s4Var, 2);
                                oq5Var2.k0(K3);
                            }
                            kg5.b(3456, oq5Var2, a322, M52, (Function0) K3, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a422 = androidx.compose.ui.platform.a.a(vciVar2, "btn_components");
                            String M222 = rvf.M(R.string.about_components, oq5Var2);
                            f4 = oq5Var2.f(s4Var);
                            K4 = oq5Var2.K();
                            if (!f4 || K4 == kjnVar) {
                                K4 = new z4(s4Var, 3);
                                oq5Var2.k0(K4);
                            }
                            kg5.b(3456, oq5Var2, a422, M222, (Function0) K4, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a522 = androidx.compose.ui.platform.a.a(vciVar2, "privacy_policy");
                            String M322 = rvf.M(R.string.privacy_policy, oq5Var2);
                            f5 = oq5Var2.f(s4Var);
                            K5 = oq5Var2.K();
                            if (!f5 || K5 == kjnVar) {
                                K5 = new z4(s4Var, 4);
                                oq5Var2.k0(K5);
                            }
                            kg5.b(3456, oq5Var2, a522, M322, (Function0) K5, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a622 = androidx.compose.ui.platform.a.a(vciVar2, "rules_of_recommendations");
                            String M422 = rvf.M(R.string.rules_of_recommendations, oq5Var2);
                            f6 = oq5Var2.f(s4Var);
                            K6 = oq5Var2.K();
                            if (!f6 || K6 == kjnVar) {
                                K6 = new z4(s4Var, 5);
                                oq5Var2.k0(K6);
                            }
                            kg5.b(3456, oq5Var2, a622, M422, (Function0) K6, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.m(vciVar2, f722), rvf.M(R.string.content_minors, oq5Var2));
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            etn.u(0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f722, f722, f722, 0.0f, 8), rvf.M(R.string.project_of_yandex, oq5Var2));
                            Calendar calendar22 = Calendar.getInstance();
                            calendar22.setTimeInMillis(1784764800000L);
                            String string222 = context.getString(R.string.copyright, Integer.valueOf(calendar22.get(1)));
                            string222.getClass();
                            etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f722, 0.0f, f722, f722, 2), string222);
                            oq5Var2.p(true);
                        }
                        htrVar = htr.g;
                        String string322 = context.getString(R.string.about_version, "2026.07.4 #157gpr", 24026391, DateFormat.getDateInstance(1, htrVar.c).format(new Date(1784764800000L)));
                        string322.getClass();
                        float f7222 = 16;
                        yci a2222 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, f7222, 0.0f, f7222, f7222, 2), "version_info");
                        f2 = oq5Var2.f(s4Var);
                        K = oq5Var2.K();
                        if (!f2) {
                        }
                        K = new z4(s4Var, r13);
                        oq5Var2.k0(K);
                        Function0 S222 = irf.S((Function0) K, oq5Var2, 0);
                        K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                        }
                        etn.u(0, oq5Var2, androidx.compose.foundation.a.j(a2222, null, S222, (Function0) K2, 111), string322);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a3222 = androidx.compose.ui.platform.a.a(vciVar2, "btn_license");
                        String M522 = rvf.M(R.string.eula, oq5Var2);
                        f3 = oq5Var2.f(s4Var);
                        K3 = oq5Var2.K();
                        if (!f3) {
                        }
                        K3 = new z4(s4Var, 2);
                        oq5Var2.k0(K3);
                        kg5.b(3456, oq5Var2, a3222, M522, (Function0) K3, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a4222 = androidx.compose.ui.platform.a.a(vciVar2, "btn_components");
                        String M2222 = rvf.M(R.string.about_components, oq5Var2);
                        f4 = oq5Var2.f(s4Var);
                        K4 = oq5Var2.K();
                        if (!f4) {
                        }
                        K4 = new z4(s4Var, 3);
                        oq5Var2.k0(K4);
                        kg5.b(3456, oq5Var2, a4222, M2222, (Function0) K4, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a5222 = androidx.compose.ui.platform.a.a(vciVar2, "privacy_policy");
                        String M3222 = rvf.M(R.string.privacy_policy, oq5Var2);
                        f5 = oq5Var2.f(s4Var);
                        K5 = oq5Var2.K();
                        if (!f5) {
                        }
                        K5 = new z4(s4Var, 4);
                        oq5Var2.k0(K5);
                        kg5.b(3456, oq5Var2, a5222, M3222, (Function0) K5, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a6222 = androidx.compose.ui.platform.a.a(vciVar2, "rules_of_recommendations");
                        String M4222 = rvf.M(R.string.rules_of_recommendations, oq5Var2);
                        f6 = oq5Var2.f(s4Var);
                        K6 = oq5Var2.K();
                        if (!f6) {
                        }
                        K6 = new z4(s4Var, 5);
                        oq5Var2.k0(K6);
                        kg5.b(3456, oq5Var2, a6222, M4222, (Function0) K6, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.m(vciVar2, f7222), rvf.M(R.string.content_minors, oq5Var2));
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        etn.u(0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f7222, f7222, f7222, 0.0f, 8), rvf.M(R.string.project_of_yandex, oq5Var2));
                        Calendar calendar222 = Calendar.getInstance();
                        calendar222.setTimeInMillis(1784764800000L);
                        String string2222 = context.getString(R.string.copyright, Integer.valueOf(calendar222.get(1)));
                        string2222.getClass();
                        etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f7222, 0.0f, f7222, f7222, 2), string2222);
                        oq5Var2.p(true);
                    } else {
                        if (language.equals("ru")) {
                            htrVar = htr.h;
                            String string3222 = context.getString(R.string.about_version, "2026.07.4 #157gpr", 24026391, DateFormat.getDateInstance(1, htrVar.c).format(new Date(1784764800000L)));
                            string3222.getClass();
                            float f72222 = 16;
                            yci a22222 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, f72222, 0.0f, f72222, f72222, 2), "version_info");
                            f2 = oq5Var2.f(s4Var);
                            K = oq5Var2.K();
                            if (!f2) {
                            }
                            K = new z4(s4Var, r13);
                            oq5Var2.k0(K);
                            Function0 S2222 = irf.S((Function0) K, oq5Var2, 0);
                            K2 = oq5Var2.K();
                            if (K2 == kjnVar) {
                            }
                            etn.u(0, oq5Var2, androidx.compose.foundation.a.j(a22222, null, S2222, (Function0) K2, 111), string3222);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a32222 = androidx.compose.ui.platform.a.a(vciVar2, "btn_license");
                            String M5222 = rvf.M(R.string.eula, oq5Var2);
                            f3 = oq5Var2.f(s4Var);
                            K3 = oq5Var2.K();
                            if (!f3) {
                            }
                            K3 = new z4(s4Var, 2);
                            oq5Var2.k0(K3);
                            kg5.b(3456, oq5Var2, a32222, M5222, (Function0) K3, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a42222 = androidx.compose.ui.platform.a.a(vciVar2, "btn_components");
                            String M22222 = rvf.M(R.string.about_components, oq5Var2);
                            f4 = oq5Var2.f(s4Var);
                            K4 = oq5Var2.K();
                            if (!f4) {
                            }
                            K4 = new z4(s4Var, 3);
                            oq5Var2.k0(K4);
                            kg5.b(3456, oq5Var2, a42222, M22222, (Function0) K4, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a52222 = androidx.compose.ui.platform.a.a(vciVar2, "privacy_policy");
                            String M32222 = rvf.M(R.string.privacy_policy, oq5Var2);
                            f5 = oq5Var2.f(s4Var);
                            K5 = oq5Var2.K();
                            if (!f5) {
                            }
                            K5 = new z4(s4Var, 4);
                            oq5Var2.k0(K5);
                            kg5.b(3456, oq5Var2, a52222, M32222, (Function0) K5, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            yci a62222 = androidx.compose.ui.platform.a.a(vciVar2, "rules_of_recommendations");
                            String M42222 = rvf.M(R.string.rules_of_recommendations, oq5Var2);
                            f6 = oq5Var2.f(s4Var);
                            K6 = oq5Var2.K();
                            if (!f6) {
                            }
                            K6 = new z4(s4Var, 5);
                            oq5Var2.k0(K6);
                            kg5.b(3456, oq5Var2, a62222, M42222, (Function0) K6, true);
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.m(vciVar2, f72222), rvf.M(R.string.content_minors, oq5Var2));
                            xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                            etn.u(0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f72222, f72222, f72222, 0.0f, 8), rvf.M(R.string.project_of_yandex, oq5Var2));
                            Calendar calendar2222 = Calendar.getInstance();
                            calendar2222.setTimeInMillis(1784764800000L);
                            String string22222 = context.getString(R.string.copyright, Integer.valueOf(calendar2222.get(1)));
                            string22222.getClass();
                            etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f72222, 0.0f, f72222, f72222, 2), string22222);
                            oq5Var2.p(true);
                        }
                        htrVar = htr.g;
                        String string32222 = context.getString(R.string.about_version, "2026.07.4 #157gpr", 24026391, DateFormat.getDateInstance(1, htrVar.c).format(new Date(1784764800000L)));
                        string32222.getClass();
                        float f722222 = 16;
                        yci a222222 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, f722222, 0.0f, f722222, f722222, 2), "version_info");
                        f2 = oq5Var2.f(s4Var);
                        K = oq5Var2.K();
                        if (!f2) {
                        }
                        K = new z4(s4Var, r13);
                        oq5Var2.k0(K);
                        Function0 S22222 = irf.S((Function0) K, oq5Var2, 0);
                        K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                        }
                        etn.u(0, oq5Var2, androidx.compose.foundation.a.j(a222222, null, S22222, (Function0) K2, 111), string32222);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a322222 = androidx.compose.ui.platform.a.a(vciVar2, "btn_license");
                        String M52222 = rvf.M(R.string.eula, oq5Var2);
                        f3 = oq5Var2.f(s4Var);
                        K3 = oq5Var2.K();
                        if (!f3) {
                        }
                        K3 = new z4(s4Var, 2);
                        oq5Var2.k0(K3);
                        kg5.b(3456, oq5Var2, a322222, M52222, (Function0) K3, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a422222 = androidx.compose.ui.platform.a.a(vciVar2, "btn_components");
                        String M222222 = rvf.M(R.string.about_components, oq5Var2);
                        f4 = oq5Var2.f(s4Var);
                        K4 = oq5Var2.K();
                        if (!f4) {
                        }
                        K4 = new z4(s4Var, 3);
                        oq5Var2.k0(K4);
                        kg5.b(3456, oq5Var2, a422222, M222222, (Function0) K4, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a522222 = androidx.compose.ui.platform.a.a(vciVar2, "privacy_policy");
                        String M322222 = rvf.M(R.string.privacy_policy, oq5Var2);
                        f5 = oq5Var2.f(s4Var);
                        K5 = oq5Var2.K();
                        if (!f5) {
                        }
                        K5 = new z4(s4Var, 4);
                        oq5Var2.k0(K5);
                        kg5.b(3456, oq5Var2, a522222, M322222, (Function0) K5, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        yci a622222 = androidx.compose.ui.platform.a.a(vciVar2, "rules_of_recommendations");
                        String M422222 = rvf.M(R.string.rules_of_recommendations, oq5Var2);
                        f6 = oq5Var2.f(s4Var);
                        K6 = oq5Var2.K();
                        if (!f6) {
                        }
                        K6 = new z4(s4Var, 5);
                        oq5Var2.k0(K6);
                        kg5.b(3456, oq5Var2, a622222, M422222, (Function0) K6, true);
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.m(vciVar2, f722222), rvf.M(R.string.content_minors, oq5Var2));
                        xv7.k(null, zsd.n0(oq5Var2), 0.0f, 0.0f, oq5Var2, 0, 13);
                        etn.u(0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f722222, f722222, f722222, 0.0f, 8), rvf.M(R.string.project_of_yandex, oq5Var2));
                        Calendar calendar22222 = Calendar.getInstance();
                        calendar22222.setTimeInMillis(1784764800000L);
                        String string222222 = context.getString(R.string.copyright, Integer.valueOf(calendar22222.get(1)));
                        string222222.getClass();
                        etn.u(48, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar2, f722222, 0.0f, f722222, f722222, 2), string222222);
                        oq5Var2.p(true);
                    }
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 5:
                il ilVar = (il) obj4;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean h = oq5Var4.h(ilVar);
                Object K7 = oq5Var4.K();
                if (h || K7 == kjnVar) {
                    K7 = new c3(0, ilVar, il.class, "onCreateNewPlaylistClick", "onCreateNewPlaylistClick()V", 0, 7);
                    oq5Var4.k0(K7);
                }
                j66.l((Function0) ((h9f) K7), oq5Var4, 0);
                return Unit.a;
            case 6:
                am amVar = (am) obj4;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                qkl qklVar = (qkl) obj3;
                str3.getClass();
                amVar.getClass();
                if (qklVar != null) {
                    hjl hjlVar = amVar.d;
                    thj thjVar = qklVar.b;
                    gjl gjlVar = qklVar.a;
                    hjlVar.e(booleanValue4, str3, thjVar, gjlVar.b, gjlVar.a, null);
                }
                return Unit.a;
            case 7:
                qnq qnqVar = (qnq) obj4;
                am amVar2 = (am) obj;
                int intValue3 = ((Integer) obj3).intValue();
                amVar2.getClass();
                oq5 oq5Var5 = (oq5) ((hq5) obj2);
                boolean h2 = oq5Var5.h(amVar2);
                Object K8 = oq5Var5.K();
                if (h2 || K8 == kjnVar) {
                    K8 = new v5(4, amVar2);
                    oq5Var5.k0(K8);
                }
                gld.k(amVar2, (Function1) K8, oq5Var5);
                etn.j.invoke(amVar2, qnqVar, oq5Var5, Integer.valueOf((intValue3 & 14) | 64));
                return Unit.a;
            case 8:
                a60 a60Var = (a60) obj4;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var3;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean h3 = oq5Var6.h(a60Var);
                    Object K9 = oq5Var6.K();
                    if (h3 || K9 == kjnVar) {
                        zy zyVar = new zy(0, a60Var, a60.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 8);
                        oq5Var6.k0(zyVar);
                        K9 = zyVar;
                    }
                    a0g.q((Function0) ((h9f) K9), null, oq5Var6, 0);
                    boolean h4 = oq5Var6.h(a60Var);
                    Object K10 = oq5Var6.K();
                    if (h4 || K10 == kjnVar) {
                        zy zyVar2 = new zy(0, a60Var, a60.class, "onSearchClicked", "onSearchClicked()V", 0, 9);
                        oq5Var6.k0(zyVar2);
                        K10 = zyVar2;
                    }
                    a0g.o(48, 4, 0L, oq5Var6, androidx.compose.ui.platform.a.a(vciVar, "toolbar_search_button"), (Function0) ((h9f) K10));
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 9:
                b91 b91Var = (b91) obj4;
                oho ohoVar = (oho) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ohoVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var4).f(ohoVar) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                yci m = d.m(vciVar, 88);
                kfh d = ug3.d(b2c.f, false);
                oq5 oq5Var8 = (oq5) hq5Var4;
                int i6 = oq5Var8.P;
                androidx.compose.runtime.internal.a l3 = oq5Var8.l();
                yci H2 = vnj.H(hq5Var4, m);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar2);
                } else {
                    oq5Var8.n0();
                }
                kb5 kb5Var2 = wp5.f;
                g0g.U(hq5Var4, d, kb5Var2);
                kb5 kb5Var3 = wp5.e;
                g0g.U(hq5Var4, l3, kb5Var3);
                kb5 kb5Var4 = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var8, i6, kb5Var4);
                }
                kb5 kb5Var5 = wp5.d;
                g0g.U(hq5Var4, H2, kb5Var5);
                ivf.k(0, 0, hq5Var4, xp3.u(d.m(vciVar, 68), o5g.F(hq5Var4)), b91Var.a);
                oq5Var8.p(true);
                yci a7 = ohoVar.a(1.0f, vciVar, true);
                ta5 a8 = sa5.a(qx0.c, b2c.n, hq5Var4, 0);
                int i7 = oq5Var8.P;
                androidx.compose.runtime.internal.a l4 = oq5Var8.l();
                yci H3 = vnj.H(hq5Var4, a7);
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar2);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(hq5Var4, a8, kb5Var2);
                g0g.U(hq5Var4, l4, kb5Var3);
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var8, i7, kb5Var4);
                }
                g0g.U(hq5Var4, H3, kb5Var5);
                ivf.l(b91Var.a, d.r(vciVar, 180), nu0.c(), hq5Var4, 48, 0);
                u1g.l(hq5Var4, d.e(vciVar, 4));
                ivf.l(b91Var.a, d.r(vciVar, 100), nu0.j(), hq5Var4, 48, 0);
                oq5Var8.p(true);
                return Unit.a;
            case 10:
                c81 c81Var = (c81) obj4;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var9 = (oq5) hq5Var5;
                if (oq5Var9.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                    u1g.l(oq5Var9, d.e(vciVar, !c81Var.b.isEmpty() ? 24 : 8));
                    xcs.b(rvf.M(R.string.albums, oq5Var9), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), "familiar_albums_collection_title"), ((dq0) oq5Var9.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var9, 48, 0, 65528);
                    u1g.l(oq5Var9, d.e(vciVar, 8));
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 11:
                hq5 hq5Var6 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                int ordinal = ((b81) obj4).ordinal();
                if (ordinal == 0) {
                    oq5Var = (oq5) hq5Var6;
                    i = R.string.artist_familiar_collection_tab;
                    i2 = -83364969;
                } else {
                    if (ordinal != 1) {
                        throw vz1.i((oq5) hq5Var6, -83366995, false);
                    }
                    oq5Var = (oq5) hq5Var6;
                    i = R.string.artist_familiar_wave_tab;
                    i2 = -83361615;
                }
                String n = vz1.n(oq5Var, i2, i, oq5Var, false);
                float f8 = 16;
                xcs.b(n, androidx.compose.foundation.layout.a.p(vciVar, f8, 24, f8, f8), ((dq0) ((oq5) hq5Var6).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.d(), hq5Var6, 0, 0, 65528);
                return Unit.a;
            case 12:
                xbb xbbVar = (xbb) obj4;
                c cVar = (c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(cVar) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar = xbbVar.d;
                r13 = jzbVar == null ? 0 : 1;
                xme E = ox6.E(jzbVar, 0L, hq5Var7, 6);
                xv7.i(new mn0(6, xbbVar.b, (ArrayList) null), androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "artist_bottom_sheet_dialog_header_title"), ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 4, 0, bow.l(E), null, nu0.b(), r13 != 0 ? bow.k(cVar, new xme[]{E}) : null, null, hq5Var7, 48, 134220848, 612344);
                return Unit.a;
            case 13:
                String str4 = (String) obj2;
                str4.getClass();
                ((vm1) obj4).e(((Boolean) obj).booleanValue(), str4, (qkl) obj3);
                return Unit.a;
            case 14:
                sp1 sp1Var = (sp1) obj4;
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                String str5 = (String) obj2;
                qkl qklVar2 = (qkl) obj3;
                str5.getClass();
                sp1Var.getClass();
                if (qklVar2 != null) {
                    hjl hjlVar2 = sp1Var.b;
                    gjl gjlVar2 = qklVar2.a;
                    hjlVar2.e(booleanValue5, str5, qklVar2.b, gjlVar2.b, gjlVar2.a, gjlVar2.c);
                }
                return Unit.a;
            case 15:
                sp1 sp1Var2 = (sp1) obj;
                int intValue8 = ((Integer) obj3).intValue();
                sp1Var2.getClass();
                ((wn5) ((y3) obj4).c).invoke(sp1Var2, (hq5) obj2, Integer.valueOf(intValue8 & 14));
                return Unit.a;
            case 16:
                qm2 qm2Var = (qm2) obj4;
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                String str6 = (String) obj2;
                ugt ugtVar = (ugt) obj3;
                str6.getClass();
                ugtVar.getClass();
                qm2Var.d.h(new d70(qm2Var.f.c, c70.c, ugtVar.a, 0, str6), booleanValue6);
                return Unit.a;
            case 17:
                pyc pycVar = (pyc) obj4;
                oho ohoVar2 = (oho) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ohoVar2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var8).f(ohoVar2) ? 4 : 2;
                }
                oq5 oq5Var11 = (oq5) hq5Var8;
                if (oq5Var11.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    xcs.a(nu0.j(), ild.C(-484021916, new m32(9, pycVar, ohoVar2), oq5Var11), oq5Var11, 48);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 18:
                ((s8i) obj4).invoke((Throwable) obj);
                return Unit.a;
            case 19:
                se4 se4Var = (se4) obj4;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var12 = (oq5) hq5Var9;
                if (oq5Var12.P(intValue10 & 1, (intValue10 & 17) != 16)) {
                    vci vciVar3 = vci.a;
                    yci q = androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, 0.0f, 4, 0.0f, 11);
                    gz2 gz2Var = b2c.o;
                    ta5 a9 = sa5.a(qx0.c, gz2Var, oq5Var12, 48);
                    int i8 = oq5Var12.P;
                    androidx.compose.runtime.internal.a l5 = oq5Var12.l();
                    yci H4 = vnj.H(oq5Var12, q);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(grbVar3);
                    } else {
                        oq5Var12.n0();
                    }
                    g0g.U(oq5Var12, a9, wp5.f);
                    g0g.U(oq5Var12, l5, wp5.e);
                    kb5 kb5Var6 = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var12, i8, kb5Var6);
                    }
                    g0g.U(oq5Var12, H4, wp5.d);
                    String str7 = se4Var.b;
                    kf4 kf4Var = se4Var.c;
                    float f9 = upd.a;
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    xcs.b(str7, androidx.compose.ui.platform.a.a(new HorizontalAlignElement(gz2Var), "chart_album_item_position"), ((dq0) oq5Var12.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var12, 0, 0, 65016);
                    leu.e(kf4Var, b.c(androidx.compose.ui.platform.a.a(vciVar3, "chart_album_item_progress"), "chart_album_item_progress_state", kf4Var), oq5Var12, 0);
                    oq5Var12.p(true);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 20:
                kf4 kf4Var2 = (kf4) obj4;
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var10).f(ua5Var) ? 4 : 2;
                }
                oq5 oq5Var13 = (oq5) hq5Var10;
                if (oq5Var13.P(intValue11 & 1, (intValue11 & 19) != 18)) {
                    if (kf4Var2 != null) {
                        oq5Var13.Z(2037663811);
                        leu.e(kf4Var2, b.c(androidx.compose.ui.platform.a.a(d.m(((wa5) ua5Var).a(vciVar, b2c.o), 20), "chart_state"), "chart_state_progress", kf4Var2), oq5Var13, 0);
                    } else {
                        oq5Var13.Z(2027336874);
                    }
                    oq5Var13.p(false);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 21:
                jht jhtVar = (jht) obj4;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((Unit) obj).getClass();
                oq5 oq5Var14 = (oq5) hq5Var11;
                if (oq5Var14.P(intValue12 & 1, (intValue12 & 17) != 16)) {
                    sk3.o(0, oq5Var14, null, ((jgt) jhtVar).a);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 22:
                pu4 pu4Var = (pu4) obj4;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var15 = (oq5) hq5Var12;
                if (oq5Var15.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    boolean h5 = oq5Var15.h(pu4Var);
                    Object K11 = oq5Var15.K();
                    if (h5 || K11 == kjnVar) {
                        ub4 ub4Var = new ub4(0, pu4Var, pu4.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 12);
                        oq5Var15.k0(ub4Var);
                        K11 = ub4Var;
                    }
                    a0g.q((Function0) ((h9f) K11), null, oq5Var15, 0);
                    boolean h6 = oq5Var15.h(pu4Var);
                    Object K12 = oq5Var15.K();
                    if (h6 || K12 == kjnVar) {
                        ub4 ub4Var2 = new ub4(0, pu4Var, pu4.class, "onSearchClick", "onSearchClick()V", 0, 13);
                        oq5Var15.k0(ub4Var2);
                        K12 = ub4Var2;
                    }
                    a0g.o(48, 4, 0L, oq5Var15, androidx.compose.ui.platform.a.a(vciVar, "search_toolbar"), (Function0) ((h9f) K12));
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 23:
                tv4 tv4Var = (tv4) obj4;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var16 = (oq5) hq5Var13;
                if (oq5Var16.P(intValue14 & 1, (intValue14 & 17) != 16)) {
                    boolean h7 = oq5Var16.h(tv4Var);
                    Object K13 = oq5Var16.K();
                    if (h7 || K13 == kjnVar) {
                        ub4 ub4Var3 = new ub4(0, tv4Var, tv4.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 16);
                        oq5Var16.k0(ub4Var3);
                        K13 = ub4Var3;
                    }
                    a0g.q((Function0) ((h9f) K13), null, oq5Var16, 0);
                    boolean h8 = oq5Var16.h(tv4Var);
                    Object K14 = oq5Var16.K();
                    if (h8 || K14 == kjnVar) {
                        ub4 ub4Var4 = new ub4(0, tv4Var, tv4.class, "onSearchClicked", "onSearchClicked()V", 0, 17);
                        oq5Var16.k0(ub4Var4);
                        K14 = ub4Var4;
                    }
                    a0g.o(48, 4, 0L, oq5Var16, androidx.compose.ui.platform.a.a(vciVar, "search_toolbar"), (Function0) ((h9f) K14));
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 24:
                return a(obj, obj2, obj3);
            case 25:
                return d(obj, obj2, obj3);
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return h(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return j(obj, obj2, obj3);
            default:
                zkn zknVar = (zkn) obj4;
                bs1 bs1Var = (bs1) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bs1Var.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= (intValue15 & 8) == 0 ? ((oq5) hq5Var14).f(bs1Var) : ((oq5) hq5Var14).h(bs1Var) ? 4 : 2;
                }
                if ((intValue15 & 19) == 18) {
                    oq5 oq5Var17 = (oq5) hq5Var14;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                if (bs1Var.equals(xr1.a) || (bs1Var instanceof yr1)) {
                    oq5 oq5Var18 = (oq5) hq5Var14;
                    oq5Var18.Z(215026967);
                    swf.d(qo6.d, gce.b, d.c(vciVar, 1.0f), null, 0L, d85.m, false, oq5Var18, 197046, 88);
                    oq5Var18.p(false);
                } else if (bs1Var instanceof as1) {
                    oq5 oq5Var19 = (oq5) hq5Var14;
                    oq5Var19.Z(215412018);
                    irf.r(((as1) bs1Var).a, zknVar.c, d.c(vciVar, 1.0f), null, zknVar.e, 0.0f, null, oq5Var19, 384, 104);
                    oq5Var19.p(false);
                } else {
                    if (!(bs1Var instanceof zr1)) {
                        throw vz1.i((oq5) hq5Var14, 1392406564, false);
                    }
                    oq5 oq5Var20 = (oq5) hq5Var14;
                    oq5Var20.Z(1392432311);
                    oq5Var20.p(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ u2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
