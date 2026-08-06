package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C f4011a = new C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(IdSyncConfig idSyncConfig) {
        m mVar = new m();
        mVar.f4042a = idSyncConfig.getEnabled();
        l lVar = new l();
        lVar.f4037a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        k[] kVarArr = new k[size];
        for (int i2 = 0; i2 < size; i2++) {
            kVarArr[i2] = this.f4011a.fromModel(idSyncConfig.getRequests().get(i2));
        }
        lVar.f4038b = kVarArr;
        mVar.f4043b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(m mVar) {
        l lVar = mVar.f4043b;
        if (lVar == null) {
            lVar = new l();
        }
        boolean z2 = mVar.f4042a;
        long j2 = lVar.f4037a;
        k[] kVarArr = lVar.f4038b;
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(this.f4011a.toModel(kVar));
        }
        return new IdSyncConfig(z2, j2, arrayList);
    }
}
