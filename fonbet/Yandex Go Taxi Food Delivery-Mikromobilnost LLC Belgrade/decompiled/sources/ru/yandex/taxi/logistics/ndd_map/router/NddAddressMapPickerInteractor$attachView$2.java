package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.layers.api.model.Action;
import defpackage.nm00;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uud0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.common_models.net.map_object.h0;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.common_models.net.map_object.u0;
import ru.yandex.taxi.common_models.net.map_object.z;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class NddAddressMapPickerInteractor$attachView$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        nm00 nm00Var = (nm00) obj;
        e eVar = (e) this.receiver;
        eVar.getClass();
        tse tseVar = eVar.A;
        List list = nm00Var.c;
        Action action = nm00Var.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z = false;
            h0 h0Var = null;
            for (z zVar : ((uud0) it.next()).a) {
                if (zVar instanceof h0) {
                    h0Var = (h0) zVar;
                } else if (zVar instanceof s) {
                    z = true;
                } else if (zVar instanceof u0) {
                    if (action == Action.TAP) {
                        pzt0 pzt0Var = eVar.L;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        eVar.L = tje.N(tseVar, null, null, new NddAddressMapPickerInteractor$launchWalkRouteRouter$1(eVar, nm00Var, null), 3);
                    } else if (action == Action.SERVER_SELECTION && !eVar.O) {
                        eVar.O = true;
                        pzt0 pzt0Var2 = eVar.L;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        eVar.L = tje.N(tseVar, null, null, new NddAddressMapPickerInteractor$launchWalkRouteRouter$1(eVar, nm00Var, null), 3);
                    }
                }
            }
            if (h0Var != null) {
                if (action == Action.TAP) {
                    eVar.a(h0Var);
                } else if (action == Action.SERVER_SELECTION && !eVar.P) {
                    eVar.P = true;
                    eVar.a(h0Var);
                }
            } else if (z) {
                zzs zzsVar = nm00Var.b;
                if (action == Action.TAP) {
                    eVar.f(zzsVar);
                } else if (action == Action.SERVER_SELECTION && !eVar.N) {
                    eVar.N = true;
                    eVar.f(zzsVar);
                }
            }
        }
        return zy11.a;
    }
}
