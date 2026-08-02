package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.models.Address;
import defpackage.li50;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class NddAddressMapPickerInteractor$attachView$4 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e eVar = (e) this.receiver;
        li50 li50Var = eVar.h;
        eVar.N = false;
        eVar.O = false;
        eVar.P = false;
        if (!booleanValue) {
            li50Var.a(null);
        }
        Address address = li50Var.b.c;
        r0 r0Var = eVar.R;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, address != null ? address.B() : null));
        return zy11.a;
    }
}
