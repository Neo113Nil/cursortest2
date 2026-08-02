package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class zv5 implements pyc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zv5(ew5 ew5Var, tnb tnbVar, nsh nshVar, boolean z, fvf fvfVar) {
        this.c = ew5Var;
        this.d = tnbVar;
        this.e = nshVar;
        this.b = z;
        this.f = fvfVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        oq5 oq5Var;
        boolean z;
        njt njtVar;
        int i = this.a;
        kjn kjnVar = gq5.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                ew5 ew5Var = (ew5) obj7;
                tnb tnbVar = (tnb) obj6;
                nsh nshVar = (nsh) obj5;
                fvf fvfVar = (fvf) obj4;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var;
                boolean h = oq5Var3.h(tnbVar) | oq5Var3.h(nshVar);
                Object K = oq5Var3.K();
                if (h || K == kjnVar) {
                    K = new aw5(0, tnbVar, nshVar);
                    oq5Var3.k0(K);
                }
                n7w.l(ew5Var, (Function0) K, this.b, null, fvfVar, oq5Var3, 8);
                return Unit.a;
            case 1:
                t16 t16Var = (t16) obj7;
                Function0 function02 = (Function0) obj6;
                String str = (String) obj5;
                Function0 function03 = (Function0) obj4;
                c cVar = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                iz2 iz2Var = b2c.c;
                cVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                vci vciVar = vci.a;
                boolean z2 = this.b;
                b bVar = b.a;
                if (z2) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(-2078965455);
                    ges j = nu0.j();
                    jx7 jx7Var = (jx7) oq5Var5.j(es5.h);
                    function0 = function03;
                    long j2 = j.a.b;
                    float p = !kes.a(j2, kes.c) ? jx7Var.p(j2) : 16;
                    if (t16Var.equals(r16.a) || t16Var.equals(q16.a)) {
                        oq5Var5.Z(-2078696282);
                        float f = 16;
                        ivf.l(t16Var instanceof r16, d.r(a.q(bVar.a(vciVar, iz2Var), f, f, f, 0.0f, 8), 148), j, oq5Var5, 0, 0);
                        oq5Var = oq5Var5;
                        z = false;
                        oq5Var.p(false);
                    } else if (t16Var.equals(p16.a)) {
                        oq5Var = oq5Var5;
                        oq5Var.Z(-2078134903);
                        yd5.l(rvf.M(R.string.concert_tab_top_bar_default_title, oq5Var), j, p, function02, bVar.a(vciVar, iz2Var), null, oq5Var5, 0, 32);
                        oq5Var.p(false);
                        z = false;
                    } else {
                        if (!(t16Var instanceof s16)) {
                            throw vz1.i(oq5Var5, -1313984139, false);
                        }
                        oq5Var5.Z(-2077576128);
                        String n = ouj.n(rvf.M(R.string.concert_tab_top_bar_title, oq5Var5), " • ");
                        int K2 = ff7.K(48 * 2, oq5Var5);
                        int K3 = ff7.K(p, oq5Var5);
                        String str2 = ((s16) t16Var).a.b;
                        String concat = n.concat(str2);
                        int i2 = (ga6.i(cVar.b) - (K2 * 2)) - (K3 / 2);
                        ids O = o5g.O(0, 1, oq5Var5);
                        boolean f2 = oq5Var5.f(concat) | oq5Var5.d(i2) | oq5Var5.f(j);
                        Object K4 = oq5Var5.K();
                        if (f2 || K4 == kjnVar) {
                            if (i2 < 0) {
                                ume.a("width must be >= 0");
                            }
                            K4 = ids.a(O, concat, j, 1, false, 1, ia6.h(i2, i2, 0, Integer.MAX_VALUE), 968);
                            oq5Var5.k0(K4);
                        }
                        yd5.l(str2, j, p, function02, bVar.a(vciVar, iz2Var), !((cds) K4).c() ? n : null, oq5Var5, 0, 0);
                        z = false;
                        oq5Var5.p(false);
                        oq5Var = oq5Var5;
                    }
                    oq5Var.p(z);
                } else {
                    function0 = function03;
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(-2076321186);
                    float f3 = 16;
                    xv7.j(str, a.q(bVar.a(vciVar, b2c.b), f3, f3, 100, 0.0f, 8), ((dq0) oq5Var6.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.g(), oq5Var6, 0, 3120, 55288);
                    oq5Var6.p(false);
                }
                t7g.h(null, null, function0, null, hq5Var2, 3120, 1);
                return Unit.a;
            case 2:
                oti otiVar = (oti) obj7;
                fvf fvfVar2 = (fvf) obj4;
                lti ltiVar = (lti) obj6;
                tmb tmbVar = (tmb) obj5;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var7 = (oq5) hq5Var3;
                if (!oq5Var7.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    oq5Var7.S();
                } else if (otiVar instanceof mti) {
                    oq5Var7.Z(-461433113);
                    dag.c(o0kVar, null, oq5Var7, intValue3 & 14);
                    oq5Var7.p(false);
                } else {
                    if (!(otiVar instanceof nti)) {
                        throw vz1.i(oq5Var7, -1954549420, false);
                    }
                    oq5Var7.Z(-461290296);
                    o8g.b(((nti) otiVar).b, fvfVar2, o0kVar, this.b, ltiVar, tmbVar, oq5Var7, ((intValue3 << 6) & 896) | SQLiteDatabase.OPEN_PRIVATECACHE);
                    oq5Var7.p(false);
                }
                return Unit.a;
            default:
                njt njtVar2 = (njt) obj7;
                sjt sjtVar = (sjt) obj6;
                tmb tmbVar2 = (tmb) obj5;
                wn5 wn5Var = (wn5) obj4;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var8 = (oq5) hq5Var4;
                if (oq5Var8.P(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean h2 = oq5Var8.h(njtVar2);
                    Object K5 = oq5Var8.K();
                    if (h2 || K5 == kjnVar) {
                        njtVar = njtVar2;
                        zhs zhsVar = new zhs(0, njtVar, njt.class, "onRefresh", "onRefresh()V", 0, 21);
                        oq5Var8.k0(zhsVar);
                        K5 = zhsVar;
                    } else {
                        njtVar = njtVar2;
                    }
                    bfg.f(this.b, (Function0) ((h9f) K5), o0kVar2, null, false, ild.C(88125303, new pli(sjtVar, njtVar, tmbVar2, o0kVar2, wn5Var, 21), oq5Var8), oq5Var8, ((intValue4 << 6) & 896) | 196608, 24);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ zv5(oti otiVar, fvf fvfVar, boolean z, lti ltiVar, tmb tmbVar) {
        this.c = otiVar;
        this.f = fvfVar;
        this.b = z;
        this.d = ltiVar;
        this.e = tmbVar;
    }

    public /* synthetic */ zv5(njt njtVar, boolean z, sjt sjtVar, tmb tmbVar, wn5 wn5Var) {
        this.c = njtVar;
        this.b = z;
        this.d = sjtVar;
        this.e = tmbVar;
        this.f = wn5Var;
    }

    public /* synthetic */ zv5(boolean z, t16 t16Var, Function0 function0, String str, Function0 function02) {
        this.b = z;
        this.c = t16Var;
        this.d = function0;
        this.e = str;
        this.f = function02;
    }
}
