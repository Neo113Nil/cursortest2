package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ak20;
import defpackage.bk20;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.m2i;
import defpackage.ny61;
import defpackage.o430;
import defpackage.omb1;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.wjm;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class vj20 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wjm b;
    public final /* synthetic */ uj20 c;
    public final /* synthetic */ wj20 w;

    public /* synthetic */ vj20(wjm wjmVar, uj20 uj20Var, wj20 wj20Var, int i) {
        this.a = i;
        this.b = wjmVar;
        this.c = uj20Var;
        this.w = wj20Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final wj20 wj20Var = this.w;
        final uj20 uj20Var = this.c;
        final wjm wjmVar = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a((hwy0) wjmVar.c, wwg.S(-486188129, true, new vj20(wjmVar, uj20Var, wj20Var, i2), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(111929046, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.mission_details.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            bk20 bk20Var = (bk20) wjm.this.w;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String obj5 = bk20Var.toString();
                                m2i m2iVar = new m2i((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), bk20Var, uj20Var, wj20Var, 2);
                                rs31 a = f5z.a(btsVar3);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                b bVar = (b) ooc.G(qoi0.a(b.class), a, obj5, m2iVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                                ak20 ak20Var = (ak20) f.b(bVar.B, btsVar3).getValue();
                                boolean e = btsVar3.e(bVar);
                                Object Q = btsVar3.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    MissionDetailsScreen$getView$1$1$1$1$1$1$1 missionDetailsScreen$getView$1$1$1$1$1$1$1 = new MissionDetailsScreen$getView$1$1$1$1$1$1$1(0, bVar, b.class, "onConfirmButtonClick", "onConfirmButtonClick()V", 0);
                                    btsVar3.o0(missionDetailsScreen$getView$1$1$1$1$1$1$1);
                                    Q = missionDetailsScreen$getView$1$1$1$1$1$1$1;
                                }
                                sls slsVar = (sls) ((tfx) Q);
                                boolean e2 = btsVar3.e(bVar);
                                Object Q2 = btsVar3.Q();
                                if (e2 || Q2 == o430Var) {
                                    Q2 = new MissionDetailsScreen$getView$1$1$1$1$1$2$1(1, bVar, b.class, "onListItemClick", "onListItemClick(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(Q2);
                                }
                                tls tlsVar = (tls) ((tfx) Q2);
                                boolean e3 = btsVar3.e(bVar);
                                Object Q3 = btsVar3.Q();
                                if (e3 || Q3 == o430Var) {
                                    MissionDetailsScreen$getView$1$1$1$1$1$3$1 missionDetailsScreen$getView$1$1$1$1$1$3$1 = new MissionDetailsScreen$getView$1$1$1$1$1$3$1(1, bVar, b.class, "startConfettiAnimation", "startConfettiAnimation(I)V", 0);
                                    btsVar3.o0(missionDetailsScreen$getView$1$1$1$1$1$3$1);
                                    Q3 = missionDetailsScreen$getView$1$1$1$1$1$3$1;
                                }
                                tls tlsVar2 = (tls) ((tfx) Q3);
                                boolean e4 = btsVar3.e(bVar);
                                Object Q4 = btsVar3.Q();
                                if (e4 || Q4 == o430Var) {
                                    MissionDetailsScreen$getView$1$1$1$1$1$4$1 missionDetailsScreen$getView$1$1$1$1$1$4$1 = new MissionDetailsScreen$getView$1$1$1$1$1$4$1(0, bVar, b.class, "stopConfettiAnimation", "stopConfettiAnimation()V", 0);
                                    btsVar3.o0(missionDetailsScreen$getView$1$1$1$1$1$4$1);
                                    Q4 = missionDetailsScreen$getView$1$1$1$1$1$4$1;
                                }
                                omb1.a(ak20Var, slsVar, tlsVar, tlsVar2, (sls) ((tfx) Q4), btsVar3, 0);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, 6);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f((hwy0) wjmVar.c, btsVar3, qti.e), ua3.a.a((dci) wjmVar.x)}, wwg.S(835218792, true, new vj20(wjmVar, uj20Var, wj20Var, r6 ? 1 : 0), btsVar3), btsVar3, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
