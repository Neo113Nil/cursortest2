package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.rida.bids.ui.b;
import kotlin.time.DurationUnit;

/* loaded from: classes11.dex */
public final /* synthetic */ class tp5 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cms c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tp5(boolean z, cms cmsVar, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = cmsVar;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.w;
        cms cmsVar = this.c;
        boolean z = this.b;
        c530 c530Var = c530.a;
        switch (i) {
            case 0:
                sls slsVar = (sls) cmsVar;
                sls slsVar2 = (sls) obj6;
                sls slsVar3 = (sls) obj5;
                eq5 eq5Var = (eq5) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    if (z) {
                        btsVar.e0(-1729770778);
                        Object Q = btsVar.Q();
                        if (Q == o430Var) {
                            o430 o430Var2 = e3n.b;
                            b bVar = new b(com.yandex.go.coroutines.b.m(kp50.U(1, DurationUnit.SECONDS), 0L), eq5Var);
                            btsVar.o0(bVar);
                            Q = bVar;
                        }
                        jeb1.f(t7s.d(((Number) f.a((tpr) Q, 0L, null, btsVar, 48, 2).getValue()).longValue(), "%1$d:%2$02d", "%1$d:%2$02d:%3$02d"), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.b, btsVar, 0, 0, 16382);
                        btsVar = btsVar;
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1729387339);
                        btsVar.t(false);
                    }
                    if (slsVar == null || slsVar2 == null) {
                        btsVar.e0(-1728608619);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1729297656);
                        ButtonSize buttonSize = ButtonSize.M;
                        gz6 gz6Var = new gz6(new up2(rzo.d(536805376)), AppColor$Palette.Error);
                        ButtonForm buttonForm = ButtonForm.Circle;
                        j3d.a.getClass();
                        d17.d(null, false, buttonSize, gz6Var, buttonForm, slsVar, j3d.c, btsVar, 1600896, 3);
                        oeb1.c(btsVar, ljs0.q(c530Var, 4.0f));
                        d17.d(null, false, buttonSize, new gz6(AppColor$Palette.BgMinor, AppColor$Palette.Text), buttonForm, slsVar2, j3d.d, btsVar, 1600896, 3);
                        btsVar.t(false);
                    }
                    if (slsVar3 != null) {
                        btsVar.e0(-1728551269);
                        ButtonSize buttonSize2 = ButtonSize.M;
                        gz6 gz6Var2 = new gz6(AppColor$Palette.BgMinor, AppColor$Palette.Text);
                        ButtonForm buttonForm2 = ButtonForm.Circle;
                        j3d.a.getClass();
                        d17.d(null, false, buttonSize2, gz6Var2, buttonForm2, slsVar3, j3d.e, btsVar, 1600896, 3);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1728241579);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                zls zlsVar = (zls) cmsVar;
                f530 f530Var = (f530) obj6;
                f530 f530Var2 = (f530) obj5;
                a aVar = (a) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V = btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16);
                dmw0 dmw0Var = btsVar2.a;
                if (V) {
                    f530 f = z ? i9a1.f(c530Var) : c530Var;
                    f530 c = z ? i9a1.c(i9a1.d(c530Var)) : c530Var;
                    f530 c2 = ljs0.c(f, 1.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = androidx.compose.ui.b.d(btsVar2, c2);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar4);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar2, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar2, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar2, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar2, tlsVar);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar2, wlsVar4, d);
                    zlsVar.invoke(uic.a, btsVar2, 6);
                    f530 k = hbb1.c(ljs0.c(c530Var, 1.0f), dbb1.b(btsVar2), false, 24.0f, null, 10).k(f530Var).k(f530Var2);
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = a12.h;
                        btsVar2.o0(Q2);
                    }
                    f530 k2 = exw0.a(k, zy11Var, (PointerInputEventHandler) Q2).k(c);
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar2, k2);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar4);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar, d2);
                    qje.W(btsVar2, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
                    qje.W(btsVar2, wlsVar4, d3);
                    aVar.invoke(cj6.a, btsVar2, 6);
                    btsVar2.t(true);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
