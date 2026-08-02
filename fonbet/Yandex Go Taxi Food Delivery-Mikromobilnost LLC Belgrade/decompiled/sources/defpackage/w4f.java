package defpackage;

import android.view.View;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.scooters.parking.c;
import com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment;
import com.yandex.messaging.ui.folders.e;
import com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment;
import com.yx360.design.compose.atoms.DsAlert$ButtonsOrientation;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class w4f implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ w4f(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        hs31 createAddChatViewModelFactory;
        int i = this.a;
        o430 o430Var = did.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                e eVar = (e) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                b5f b5fVar = (b5f) eVar.C.getValue();
                ec0 ec0Var = b5fVar != null ? new ec0(b5fVar.d, b5fVar.b) : new ec0(i2);
                qwd qwdVar = e5z.a;
                createAddChatViewModelFactory = ((CreateEditFolderDialogFragment) obj5).createAddChatViewModelFactory(eVar, ec0Var);
                sb2.b(e5z.a.a(createAddChatViewModelFactory), wwg.S(-802889073, true, new ut9(18, eVar, (oz40) obj3), fidVar), fidVar, 56);
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                vnm vnmVar = (vnm) obj3;
                vnm vnmVar2 = (vnm) obj5;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                }
                int i3 = xnm.a[((DsAlert$ButtonsOrientation) obj4).ordinal()];
                if (i3 == 1) {
                    bts btsVar3 = (bts) fidVar2;
                    btsVar3.e0(-1153446760);
                    qn91.c(vnmVar2, vnmVar, btsVar3, 0);
                    btsVar3.t(false);
                } else {
                    if (i3 != 2) {
                        throw unr0.y(-2115420269, (bts) fidVar2, false);
                    }
                    bts btsVar4 = (bts) fidVar2;
                    btsVar4.e0(-1153202201);
                    qn91.f(vnmVar2, vnmVar, btsVar4, 0);
                    btsVar4.t(false);
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar5 = (bts) fidVar3;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        return zy11Var;
                    }
                }
                wls wlsVar = (wls) obj4;
                bts btsVar6 = (bts) fidVar3;
                btsVar6.e0(-1601981144);
                if (wlsVar != null) {
                    wlsVar.invoke(btsVar6, 0);
                }
                btsVar6.t(false);
                a aVar = (a) obj3;
                sic a = qic.a(lr20.c, x4c.G, btsVar6, 0);
                int hashCode = Long.hashCode(btsVar6.T);
                r1b0 o = btsVar6.o();
                f530 d = b.d(btsVar6, c530.a);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar6.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar6.i0();
                if (btsVar6.S) {
                    btsVar6.n(slsVar);
                } else {
                    btsVar6.r0();
                }
                qje.W(btsVar6, d.f, a);
                qje.W(btsVar6, d.e, o);
                wls wlsVar2 = d.g;
                if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar6, hashCode, wlsVar2);
                }
                qje.W(btsVar6, d.d, d);
                aVar.invoke(uic.a, Boolean.TRUE, btsVar6, 54);
                btsVar6.t(true);
                wls wlsVar3 = (wls) obj5;
                if (wlsVar3 != null) {
                    wlsVar3.invoke(btsVar6, 0);
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar7 = (bts) fidVar4;
                    if (btsVar7.E()) {
                        btsVar7.Y();
                        return zy11Var;
                    }
                }
                yrm.e((String) obj4, (wls) obj5, (xjg) obj3, null, fidVar4, 6);
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar8 = (bts) fidVar5;
                    if (btsVar8.E()) {
                        btsVar8.Y();
                        return zy11Var;
                    }
                }
                ltm.a((qom) obj4, (xtm) obj5, (wls) obj3, fidVar5, 0);
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                xd40 xd40Var = (xd40) obj4;
                tls tlsVar = (tls) obj5;
                bts btsVar9 = (bts) fidVar6;
                if (btsVar9.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar9.e0(1152288056);
                    if (xd40Var instanceof wd40) {
                        btsVar9.e0(1152309600);
                        ed40.m((wd40) xd40Var, tlsVar, btsVar9, 0);
                        btsVar9.t(false);
                    } else if (xd40Var instanceof ud40) {
                        btsVar9.e0(1152456633);
                        ed40.l((ud40) xd40Var, (aj31) obj3, tlsVar, btsVar9, 0);
                        btsVar9.t(false);
                    } else {
                        if (!(xd40Var instanceof vd40)) {
                            throw unr0.y(729907243, btsVar9, false);
                        }
                        btsVar9.e0(1152672207);
                        p6o p6oVar = ((vd40) xd40Var).a;
                        boolean k = btsVar9.k(tlsVar);
                        Object Q = btsVar9.Q();
                        if (k || Q == o430Var) {
                            Q = new q940(1, tlsVar);
                            btsVar9.o0(Q);
                        }
                        sls slsVar2 = (sls) Q;
                        boolean k2 = btsVar9.k(tlsVar);
                        Object Q2 = btsVar9.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new gm5(3, tlsVar);
                            btsVar9.o0(Q2);
                        }
                        jh91.a(null, p6oVar, slsVar2, (tls) Q2, btsVar9, 0, 1);
                        btsVar9.t(false);
                    }
                    btsVar9.t(false);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar7 = (fid) obj;
                int intValue2 = ((Number) obj2).intValue();
                bts btsVar10 = (bts) fidVar7;
                if (btsVar10.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar10.e0(-1399959188);
                    mcd.a.getClass();
                    cx20.a(null, null, null, null, null, false, false, mcd.b, wwg.S(659833999, true, new c((tls) obj4, (eco0) obj5, (dqt) obj3), btsVar10), btsVar10, 113246208, HProv.PP_VERSION_TIMESTAMP);
                    btsVar10.t(false);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar8 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar11 = (bts) fidVar8;
                    if (btsVar11.E()) {
                        btsVar11.Y();
                        return zy11Var;
                    }
                }
                TeleMessengerMainFragment.access$getRouter((TeleMessengerMainFragment) obj4, (rwi) obj5, (View) obj3);
                throw null;
            default:
                fid fidVar9 = (fid) obj;
                int intValue3 = ((Number) obj2).intValue();
                tls tlsVar2 = (tls) obj5;
                nc01 nc01Var = (nc01) obj4;
                bts btsVar12 = (bts) fidVar9;
                if (btsVar12.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar12.e0(-638753896);
                    if (nc01Var.h != null) {
                        btsVar12.e0(-638709257);
                        p6o p6oVar2 = nc01Var.h;
                        boolean k3 = btsVar12.k(tlsVar2);
                        Object Q3 = btsVar12.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new q940(12, tlsVar2);
                            btsVar12.o0(Q3);
                        }
                        jh91.a(null, p6oVar2, (sls) Q3, (tls) obj5, btsVar12, 0, 1);
                        btsVar12.t(false);
                    } else {
                        btsVar12.e0(-638468728);
                        ru.yandex.taxi.masstransit.trains.search.b.a(nc01Var, (tpr) obj3, tlsVar2, btsVar12, 0);
                        btsVar12.t(false);
                    }
                    btsVar12.t(false);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
        }
    }
}
