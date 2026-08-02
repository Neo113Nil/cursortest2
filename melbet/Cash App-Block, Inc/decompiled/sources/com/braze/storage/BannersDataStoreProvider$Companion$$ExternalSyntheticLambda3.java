package com.braze.storage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migrateBannerStorageToJson$lambda$2$0;
        String migrateContentCardsStorageToJson$lambda$2$0;
        String migrateTriggersStorageToJson$lambda$3$0;
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        switch (i) {
            case 0:
                migrateBannerStorageToJson$lambda$2$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$2$0(arrayList);
                return migrateBannerStorageToJson$lambda$2$0;
            case 1:
                migrateContentCardsStorageToJson$lambda$2$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$2$0(arrayList);
                return migrateContentCardsStorageToJson$lambda$2$0;
            default:
                migrateTriggersStorageToJson$lambda$3$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$3$0(arrayList);
                return migrateTriggersStorageToJson$lambda$3$0;
        }
    }
}
