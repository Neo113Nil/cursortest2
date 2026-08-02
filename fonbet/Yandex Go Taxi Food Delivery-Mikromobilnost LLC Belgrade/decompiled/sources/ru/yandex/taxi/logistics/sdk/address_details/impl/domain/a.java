package ru.yandex.taxi.logistics.sdk.address_details.impl.domain;

import defpackage.dci;
import defpackage.fj00;
import defpackage.rol0;

/* loaded from: classes5.dex */
public final class a {
    public final dci a;

    public a(dci dciVar) {
        this.a = dciVar;
    }

    public final rol0 a(fj00 fj00Var) {
        return new rol0(new AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1(fj00Var, this, null));
    }
}
