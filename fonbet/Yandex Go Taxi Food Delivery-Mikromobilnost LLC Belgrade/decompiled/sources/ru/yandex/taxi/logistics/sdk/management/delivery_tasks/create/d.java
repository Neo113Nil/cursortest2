package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import defpackage.bvf0;
import defpackage.f6i;
import defpackage.jgz;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.management.k;

/* loaded from: classes9.dex */
public final class d {
    public final ru.yandex.taxi.logistics.sdk.management.deliveries.d a;
    public final k b;
    public final c c;
    public final ru.yandex.taxi.logistics.sdk.management.localstate.e d;
    public final ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.a e;

    public d(ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar, k kVar, c cVar, ru.yandex.taxi.logistics.sdk.management.localstate.e eVar, ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.a aVar) {
        this.a = dVar;
        this.b = kVar;
        this.c = cVar;
        this.d = eVar;
        this.e = aVar;
    }

    public static final void a(d dVar, String str) {
        dVar.getClass();
        jgz.a.h("d");
        jgz.a(str, new Object[0]);
    }

    public final Object b(f6i f6iVar, List list, boolean z, ContinuationImpl continuationImpl) {
        return bvf0.n(new CreateDeliveryTask$execute$2(list, this, f6iVar, z, null), continuationImpl);
    }
}
