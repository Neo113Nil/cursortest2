package ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network;

import defpackage.h3y;
import defpackage.k360;
import defpackage.rol0;

/* loaded from: classes5.dex */
public final class a {
    public final h3y a;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e b;
    public final k360 c;

    public a(h3y h3yVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, k360 k360Var) {
        this.a = h3yVar;
        this.b = eVar;
        this.c = k360Var;
    }

    public final rol0 a(String str, String str2) {
        return new rol0(new NeuroPostcardAddSignatureTask$execute$1(this, str, str2, null));
    }
}
