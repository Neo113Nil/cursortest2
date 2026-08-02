package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0171e implements ProtobufConverter {
    public final C a = new C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(IdSyncConfig idSyncConfig) {
        m mVar = new m();
        mVar.a = idSyncConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String();
        l lVar = new l();
        lVar.a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        k[] kVarArr = new k[size];
        for (int i = 0; i < size; i++) {
            kVarArr[i] = this.a.fromModel(idSyncConfig.getRequests().get(i));
        }
        lVar.b = kVarArr;
        mVar.b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(m mVar) {
        l lVar = mVar.b;
        if (lVar == null) {
            lVar = new l();
        }
        boolean z = mVar.a;
        long j = lVar.a;
        k[] kVarArr = lVar.b;
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(this.a.toModel(kVar));
        }
        return new IdSyncConfig(z, j, arrayList);
    }
}
