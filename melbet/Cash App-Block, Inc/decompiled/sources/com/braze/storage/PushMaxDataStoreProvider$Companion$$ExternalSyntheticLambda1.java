package com.braze.storage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Long f$1;

    public /* synthetic */ PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda1(int i, Long l, String str) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migratePushMaxStorageToJson$lambda$1$0;
        String migratePushDeliveryEventsToJson$lambda$1$0;
        int i = this.$r8$classId;
        Long l = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                migratePushMaxStorageToJson$lambda$1$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$1$0(str, l);
                return migratePushMaxStorageToJson$lambda$1$0;
            default:
                migratePushDeliveryEventsToJson$lambda$1$0 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$1$0(str, l);
                return migratePushDeliveryEventsToJson$lambda$1$0;
        }
    }
}
