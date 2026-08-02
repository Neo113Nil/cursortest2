package ru.yandex.taxi.contacts;

import defpackage.gcn;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes5.dex */
public final class h {
    public final a a;
    public final tse b;

    public h(a aVar, tse tseVar) {
        this.a = aVar;
        this.b = tseVar;
    }

    public final void a(gcn gcnVar) {
        tje.N(this.b, null, null, new SuperAppContactChooserDelegate$requestContact$1(this, gcnVar, null), 3);
    }
}
