package com.braze.storage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Boolean f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6(int i, Boolean bool, String str) {
        this.$r8$classId = i;
        this.f$0 = bool;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migrateFeatureFlagImpressionMapToJson$lambda$1$0;
        int i = this.$r8$classId;
        String str = this.f$1;
        Boolean bool = this.f$0;
        switch (i) {
            case 0:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$1$0(bool, str);
            default:
                migrateFeatureFlagImpressionMapToJson$lambda$1$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$1$0(bool, str);
                return migrateFeatureFlagImpressionMapToJson$lambda$1$0;
        }
    }
}
