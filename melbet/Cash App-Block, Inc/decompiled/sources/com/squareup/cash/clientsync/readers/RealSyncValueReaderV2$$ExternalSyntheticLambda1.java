package com.squareup.cash.clientsync.readers;

import com.squareup.cash.clientsync.errors.IllegalSyncValueCardinality;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.util.MathsKt;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealSyncValueReaderV2$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ RealSyncValueReaderV2 f$2;
    public final /* synthetic */ SyncValueSpec f$3;

    public /* synthetic */ RealSyncValueReaderV2$$ExternalSyntheticLambda1(Object obj, Function1 function1, RealSyncValueReaderV2 realSyncValueReaderV2, SyncValueSpec syncValueSpec, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = function1;
        this.f$2 = realSyncValueReaderV2;
        this.f$3 = syncValueSpec;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SyncValueSpec syncValueSpec = this.f$3;
        RealSyncValueReaderV2 realSyncValueReaderV2 = this.f$2;
        Function1 function1 = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                int size = list.size();
                if (size == 0) {
                    return obj2;
                }
                if (size == 1) {
                    return function1.invoke(syncValueSpec.getPayload(realSyncValueReaderV2.entityDecryptor.decryptEntity((SyncEntity) list.get(0)).entityProto));
                }
                int i2 = IllegalSyncValueCardinality.$r8$clinit;
                realSyncValueReaderV2.errorReporter.reportFatal(MathsKt.create((String) syncValueSpec.valueName, list));
                throw null;
            default:
                RealClientSyncEntityDecryptor realClientSyncEntityDecryptor = realSyncValueReaderV2.entityDecryptor;
                List list2 = (List) obj;
                list2.getClass();
                int size2 = list2.size();
                if (size2 == 0) {
                    return obj2;
                }
                if (size2 == 1) {
                    return function1.invoke(syncValueSpec.getPayload(realClientSyncEntityDecryptor.decryptEntity((SyncEntity) list2.get(0)).entityProto));
                }
                int i3 = IllegalSyncValueCardinality.$r8$clinit;
                realSyncValueReaderV2.errorReporter.reportNonFatal(MathsKt.create((String) syncValueSpec.valueName, list2));
                return function1.invoke(syncValueSpec.getPayload(realClientSyncEntityDecryptor.decryptEntity((SyncEntity) list2.get(0)).entityProto));
        }
    }
}
