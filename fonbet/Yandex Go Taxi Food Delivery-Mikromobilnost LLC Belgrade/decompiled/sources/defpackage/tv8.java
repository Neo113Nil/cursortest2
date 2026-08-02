package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.cv8;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.fw8;
import defpackage.gq1;
import defpackage.hh8;
import defpackage.hw8;
import defpackage.j2m0;
import defpackage.lv8;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qkg;
import defpackage.qoi0;
import defpackage.rhd;
import defpackage.rs31;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.wls;
import defpackage.zi8;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class tv8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ cv8 c;

    public /* synthetic */ tv8(cv8 cv8Var, c cVar) {
        this.a = 2;
        this.c = cv8Var;
        this.b = cVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final c cVar = this.b;
        final cv8 cv8Var = this.c;
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
                    cVar.C.c(new Permission[]{Permission.CAMERA, Permission.NOTIFICATION, Permission.READ_CONTACTS}, btsVar, 0);
                    sb2.c(new vvf0[]{nnm.f(cVar.c, btsVar, qti.e), ua3.a.a(cVar.y), ib51.a.a(cVar.D)}, wwg.S(-74303468, true, new tv8(cVar, cv8Var, i2), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.b(cVar.c, (ThemeStyle) f.b(cVar.z.a, btsVar2).getValue(), wwg.S(-1644734900, true, new tv8(cv8Var, cVar), btsVar2), btsVar2, 392);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1816255293, true, new wls() { // from class: ru.yandex.logistics.sdk.cargo_form.impl.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                c cVar2 = cVar;
                                hw8 hw8Var = cVar2.x;
                                j2m0 j2m0Var = (j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                                cv8 cv8Var2 = cv8.this;
                                fw8 fw8Var = new fw8(j2m0Var, hw8Var, cv8Var2);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                h hVar = (h) ooc.G(qoi0.a(h.class), a, null, fw8Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                boolean e = btsVar4.e(hVar);
                                Object Q = btsVar4.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    Q = new hh8(5, hVar);
                                    btsVar4.o0(Q);
                                }
                                rhd.a(null, (wls) Q, btsVar4, 0);
                                oz40 b = androidx.compose.runtime.f.b(hVar.G, btsVar4);
                                oz40 b2 = androidx.compose.runtime.f.b(hVar.H, btsVar4);
                                oz40 b3 = androidx.compose.runtime.f.b(hVar.I, btsVar4);
                                oz40 b4 = androidx.compose.runtime.f.b(hVar.K, btsVar4);
                                oz40 b5 = androidx.compose.runtime.f.b(hVar.J, btsVar4);
                                qkg qkgVar = (qkg) b.getValue();
                                qkg qkgVar2 = (qkg) b2.getValue();
                                qkg qkgVar3 = (qkg) b3.getValue();
                                gq1 gq1Var = (gq1) b4.getValue();
                                lv8 lv8Var = (lv8) b5.getValue();
                                zi8 zi8Var = cv8Var2.w;
                                boolean e2 = btsVar4.e(hVar);
                                Object Q2 = btsVar4.Q();
                                if (e2 || Q2 == o430Var) {
                                    CargoFormScreen$getView$1$1$1$1$1$2$1 cargoFormScreen$getView$1$1$1$1$1$2$1 = new CargoFormScreen$getView$1$1$1$1$1$2$1(1, hVar, h.class, "onAiWidgetClick", "onAiWidgetClick(Lru/yandex/logistics/sdk/cargo_form/impl/data/ActionWithAnalyticsData;)V", 0);
                                    btsVar4.o0(cargoFormScreen$getView$1$1$1$1$1$2$1);
                                    Q2 = cargoFormScreen$getView$1$1$1$1$1$2$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q2);
                                boolean e3 = btsVar4.e(hVar);
                                Object Q3 = btsVar4.Q();
                                if (e3 || Q3 == o430Var) {
                                    CargoFormScreen$getView$1$1$1$1$1$3$1 cargoFormScreen$getView$1$1$1$1$1$3$1 = new CargoFormScreen$getView$1$1$1$1$1$3$1(1, hVar, h.class, "onAiWidgetShown", "onAiWidgetShown(Lru/yandex/logistics/sdk/cargo_form/core/api/models/FormAnalyticsData;)V", 0);
                                    btsVar4.o0(cargoFormScreen$getView$1$1$1$1$1$3$1);
                                    Q3 = cargoFormScreen$getView$1$1$1$1$1$3$1;
                                }
                                cVar2.b(qkgVar, qkgVar2, qkgVar3, gq1Var, lv8Var, zi8Var, tlsVar, (tls) ((tfx) Q3), btsVar4, 0);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar3), btsVar3, 6);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ tv8(c cVar, cv8 cv8Var, int i) {
        this.a = i;
        this.b = cVar;
        this.c = cv8Var;
    }
}
