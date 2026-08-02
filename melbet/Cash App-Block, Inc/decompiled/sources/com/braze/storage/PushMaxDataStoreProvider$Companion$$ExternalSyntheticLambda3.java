package com.braze.storage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkedHashMap f$0;

    public /* synthetic */ PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3(LinkedHashMap linkedHashMap, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migratePushMaxStorageToJson$lambda$2$0;
        String migratePushDeliveryEventsToJson$lambda$2$0;
        String migrateSealedSessionsMapToJson$lambda$2$0;
        int i = this.$r8$classId;
        LinkedHashMap linkedHashMap = this.f$0;
        switch (i) {
            case 0:
                migratePushMaxStorageToJson$lambda$2$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$2$0(linkedHashMap);
                return migratePushMaxStorageToJson$lambda$2$0;
            case 1:
                migratePushDeliveryEventsToJson$lambda$2$0 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$2$0(linkedHashMap);
                return migratePushDeliveryEventsToJson$lambda$2$0;
            default:
                migrateSealedSessionsMapToJson$lambda$2$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$2$0(linkedHashMap);
                return migrateSealedSessionsMapToJson$lambda$2$0;
        }
    }
}
