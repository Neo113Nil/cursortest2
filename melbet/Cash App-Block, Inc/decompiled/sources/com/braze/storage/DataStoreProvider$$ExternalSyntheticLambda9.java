package com.braze.storage;

import com.braze.storage.DataStoreProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda9(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migrateBannerStorageToJson$lambda$1$0;
        String migrateContentCardsStorageToJson$lambda$1$0;
        String migrateFeatureFlagStorageToJson$lambda$1$0;
        String migrateFeatureFlagStorageToJson$lambda$2$1;
        String migrateSealedSessionsMapToJson$lambda$1$0;
        String migrateTriggersReeligibilityToJson$lambda$2$0;
        String migrateTriggersStorageToJson$lambda$2$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return DataStoreProvider.readData$lambda$0(str);
            case 1:
                return DataStoreProvider.b.a(str);
            case 2:
                return DataStoreProvider.b.a.a(str);
            case 3:
                return DataStoreProvider.c.a(str);
            case 4:
                return DataStoreProvider.e.a(str);
            case 5:
                return DataStoreProvider.g.a(str);
            case 6:
                migrateBannerStorageToJson$lambda$1$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$1$0(str);
                return migrateBannerStorageToJson$lambda$1$0;
            case 7:
                migrateContentCardsStorageToJson$lambda$1$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$1$0(str);
                return migrateContentCardsStorageToJson$lambda$1$0;
            case 8:
                return DataStoreProvider.createOrGetDataStore$lambda$0$1$0(str);
            case 9:
                migrateFeatureFlagStorageToJson$lambda$1$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$1$0(str);
                return migrateFeatureFlagStorageToJson$lambda$1$0;
            case 10:
                migrateFeatureFlagStorageToJson$lambda$2$1 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$1(str);
                return migrateFeatureFlagStorageToJson$lambda$2$1;
            case 11:
                migrateSealedSessionsMapToJson$lambda$1$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$1$0(str);
                return migrateSealedSessionsMapToJson$lambda$1$0;
            case 12:
                migrateTriggersReeligibilityToJson$lambda$2$0 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$2$0(str);
                return migrateTriggersReeligibilityToJson$lambda$2$0;
            default:
                migrateTriggersStorageToJson$lambda$2$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$2$0(str);
                return migrateTriggersStorageToJson$lambda$2$0;
        }
    }
}
