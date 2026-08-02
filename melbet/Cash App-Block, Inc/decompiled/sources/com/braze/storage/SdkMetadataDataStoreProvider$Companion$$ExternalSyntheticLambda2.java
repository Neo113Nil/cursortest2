package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import com.braze.models.FeatureFlag;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migrateMetadataToJson$lambda$2;
        String migrateEventDuplicationMap$lambda$2$0;
        String migrateFeatureFlagStorageToJson$lambda$2$0;
        String migrateMetadataToJson$lambda$3$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                migrateMetadataToJson$lambda$2 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$2((Set) obj);
                return migrateMetadataToJson$lambda$2;
            case 1:
                migrateEventDuplicationMap$lambda$2$0 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$2$0((SharedPreferencesView) obj);
                return migrateEventDuplicationMap$lambda$2$0;
            case 2:
                migrateFeatureFlagStorageToJson$lambda$2$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$0((FeatureFlag) obj);
                return migrateFeatureFlagStorageToJson$lambda$2$0;
            default:
                migrateMetadataToJson$lambda$3$0 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$3$0((List) obj);
                return migrateMetadataToJson$lambda$3$0;
        }
    }
}
