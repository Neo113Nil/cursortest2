package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f3559a;

    /* renamed from: b, reason: collision with root package name */
    public C0254a f3560b;

    public k(ProtobufStateStorage<C0254a> protobufStateStorage) {
        this.f3559a = protobufStateStorage;
        this.f3560b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f3560b.f3540a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f3560b.f3541b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<? extends BillingInfo> list, boolean z2) {
        for (BillingInfo billingInfo : list) {
        }
        C0254a c0254a = new C0254a(list, z2);
        this.f3560b = c0254a;
        this.f3559a.save(c0254a);
    }
}
