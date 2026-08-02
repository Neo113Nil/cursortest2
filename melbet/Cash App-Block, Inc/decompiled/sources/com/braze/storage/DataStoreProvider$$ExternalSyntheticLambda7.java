package com.braze.storage;

import com.braze.storage.DataStoreProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String publishException$lambda$0;
        String a;
        String a2;
        String a3;
        String a4;
        String migrateBannerStorageToJson$lambda$0;
        String migrateBannerStorageToJson$lambda$3;
        String migrateBannerImpressionMapToJson$lambda$0;
        String migrateBannerImpressionMapToJson$lambda$2$0;
        String migrateBannerImpressionMapToJson$lambda$3;
        String migrateContentCardsStorageToJson$lambda$0;
        String migrateContentCardsStorageToJson$lambda$3;
        String migrateContentCardsMetadataToJson$lambda$0;
        String migrateContentCardsMetadataToJson$lambda$1;
        String migrateContentCardsMetadataToJson$lambda$2;
        String migrateEventDuplicationMap$lambda$0;
        String migrateEventDuplicationMap$lambda$3;
        String migrateFeatureFlagStorageToJson$lambda$0;
        String migrateFeatureFlagStorageToJson$lambda$3$0;
        String migrateFeatureFlagStorageToJson$lambda$4;
        String migrateFeatureFlagImpressionMapToJson$lambda$0;
        String migrateFeatureFlagImpressionMapToJson$lambda$2$0;
        String migrateFeatureFlagImpressionMapToJson$lambda$3;
        String migratePushDeliveryEventsToJson$lambda$0;
        String migratePushDeliveryEventsToJson$lambda$3;
        String migratePushMaxStorageToJson$lambda$0;
        String migratePushMaxStorageToJson$lambda$3;
        String migrateMetadataToJson$lambda$0;
        String migrateMetadataToJson$lambda$1;
        String migrateMetadataToJson$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                publishException$lambda$0 = DataStoreProvider.publishException$lambda$0();
                return publishException$lambda$0;
            case 1:
                a = DataStoreProvider.d.a();
                return a;
            case 2:
                a2 = DataStoreProvider.d.a("Failed to clear all data in file.");
                return a2;
            case 3:
                a3 = DataStoreProvider.h.a();
                return a3;
            case 4:
                a4 = DataStoreProvider.h.a("Failed to read all data from DataStore");
                return a4;
            case 5:
                migrateBannerStorageToJson$lambda$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$0();
                return migrateBannerStorageToJson$lambda$0;
            case 6:
                migrateBannerStorageToJson$lambda$3 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3();
                return migrateBannerStorageToJson$lambda$3;
            case 7:
                migrateBannerImpressionMapToJson$lambda$0 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$0();
                return migrateBannerImpressionMapToJson$lambda$0;
            case 8:
                migrateBannerImpressionMapToJson$lambda$2$0 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$2$0();
                return migrateBannerImpressionMapToJson$lambda$2$0;
            case 9:
                migrateBannerImpressionMapToJson$lambda$3 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$3();
                return migrateBannerImpressionMapToJson$lambda$3;
            case 10:
                migrateContentCardsStorageToJson$lambda$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$0();
                return migrateContentCardsStorageToJson$lambda$0;
            case 11:
                migrateContentCardsStorageToJson$lambda$3 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3();
                return migrateContentCardsStorageToJson$lambda$3;
            case 12:
                migrateContentCardsMetadataToJson$lambda$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$0();
                return migrateContentCardsMetadataToJson$lambda$0;
            case 13:
                migrateContentCardsMetadataToJson$lambda$1 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$1();
                return migrateContentCardsMetadataToJson$lambda$1;
            case 14:
                migrateContentCardsMetadataToJson$lambda$2 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$2();
                return migrateContentCardsMetadataToJson$lambda$2;
            case 15:
                migrateEventDuplicationMap$lambda$0 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$0();
                return migrateEventDuplicationMap$lambda$0;
            case 16:
                migrateEventDuplicationMap$lambda$3 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$3();
                return migrateEventDuplicationMap$lambda$3;
            case 17:
                migrateFeatureFlagStorageToJson$lambda$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$0();
                return migrateFeatureFlagStorageToJson$lambda$0;
            case 18:
                migrateFeatureFlagStorageToJson$lambda$3$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$3$0();
                return migrateFeatureFlagStorageToJson$lambda$3$0;
            case 19:
                migrateFeatureFlagStorageToJson$lambda$4 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$4();
                return migrateFeatureFlagStorageToJson$lambda$4;
            case 20:
                migrateFeatureFlagImpressionMapToJson$lambda$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$0();
                return migrateFeatureFlagImpressionMapToJson$lambda$0;
            case 21:
                migrateFeatureFlagImpressionMapToJson$lambda$2$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$2$0();
                return migrateFeatureFlagImpressionMapToJson$lambda$2$0;
            case 22:
                migrateFeatureFlagImpressionMapToJson$lambda$3 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$3();
                return migrateFeatureFlagImpressionMapToJson$lambda$3;
            case 23:
                migratePushDeliveryEventsToJson$lambda$0 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$0();
                return migratePushDeliveryEventsToJson$lambda$0;
            case 24:
                migratePushDeliveryEventsToJson$lambda$3 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$3();
                return migratePushDeliveryEventsToJson$lambda$3;
            case 25:
                migratePushMaxStorageToJson$lambda$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$0();
                return migratePushMaxStorageToJson$lambda$0;
            case 26:
                migratePushMaxStorageToJson$lambda$3 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3();
                return migratePushMaxStorageToJson$lambda$3;
            case 27:
                migrateMetadataToJson$lambda$0 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$0();
                return migrateMetadataToJson$lambda$0;
            case 28:
                migrateMetadataToJson$lambda$1 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$1();
                return migrateMetadataToJson$lambda$1;
            default:
                migrateMetadataToJson$lambda$4 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$4();
                return migrateMetadataToJson$lambda$4;
        }
    }
}
