package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.apf;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.vh91;
import defpackage.w8f;
import defpackage.wtj;
import defpackage.yt0;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class ttj implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ apf b;

    public /* synthetic */ ttj(apf apfVar, int i) {
        this.a = i;
        this.b = apfVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final apf apfVar = this.b;
        int i2 = 2;
        int i3 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f((hwy0) apfVar.c, btsVar, qti.e), ua3.a.a((dci) apfVar.x)}, wwg.S(720725290, true, new ttj(apfVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a((hwy0) apfVar.c, wwg.S(1451580449, true, new ttj(apfVar, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(560934936, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.discovery_map.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            ru.yandex.taxi.logistics.sdk.discovery_map.ui.a aVar = (ru.yandex.taxi.logistics.sdk.discovery_map.ui.a) apf.this.w;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String obj5 = aVar.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), aVar, 11);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                ru.yandex.taxi.logistics.sdk.discovery_map.ui.a aVar2 = (ru.yandex.taxi.logistics.sdk.discovery_map.ui.a) ooc.G(qoi0.a(ru.yandex.taxi.logistics.sdk.discovery_map.ui.a.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                wtj wtjVar = (wtj) f.b(aVar2.w, btsVar4).getValue();
                                if (wtjVar == null) {
                                    btsVar4.e0(-904500951);
                                    btsVar4.t(false);
                                } else {
                                    btsVar4.e0(-904500950);
                                    boolean e = btsVar4.e(aVar2);
                                    Object Q = btsVar4.Q();
                                    if (e || Q == did.a) {
                                        DiscoveryMapScreen$getView$1$1$1$1$1$1$1$1 discoveryMapScreen$getView$1$1$1$1$1$1$1$1 = new DiscoveryMapScreen$getView$1$1$1$1$1$1$1$1(0, aVar2, ru.yandex.taxi.logistics.sdk.discovery_map.ui.a.class, "onSearchFieldClick", "onSearchFieldClick()V", 0);
                                        btsVar4.o0(discoveryMapScreen$getView$1$1$1$1$1$1$1$1);
                                        Q = discoveryMapScreen$getView$1$1$1$1$1$1$1$1;
                                    }
                                    vh91.b(wtjVar, (sls) ((tfx) Q), btsVar4, 0);
                                    btsVar4.t(false);
                                }
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
}
