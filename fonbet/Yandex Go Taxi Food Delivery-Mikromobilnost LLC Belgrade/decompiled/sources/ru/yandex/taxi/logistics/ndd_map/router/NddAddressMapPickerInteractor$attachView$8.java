package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.models.Address;
import defpackage.gh00;
import defpackage.li50;
import defpackage.nh50;
import defpackage.pzt0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class NddAddressMapPickerInteractor$attachView$8 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        e eVar = (e) this.receiver;
        eVar.N = false;
        eVar.O = false;
        eVar.P = false;
        if (((nh50) obj).a) {
            eVar.g();
            eVar.f(((gh00) eVar.B).e.b());
        } else {
            li50 li50Var = eVar.h;
            Address address = (Address) eVar.I.a.getValue();
            if (address != null) {
                pzt0 pzt0Var = eVar.K;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                eVar.j();
                eVar.k.a();
                li50Var.b(address, address.B());
                li50Var.a(address.B());
                eVar.e.b(AddressResolveRepository.State.LOADED);
                r0 r0Var = eVar.R;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, address.B()));
                eVar.i(address.B(), e.S);
            } else {
                eVar.g();
            }
        }
        return zy11.a;
    }
}
