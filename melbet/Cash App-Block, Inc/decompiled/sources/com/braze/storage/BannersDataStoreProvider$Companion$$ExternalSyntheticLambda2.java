package com.braze.storage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migrateBannerStorageToJson$lambda$1$1;
        String migrateContentCardsStorageToJson$lambda$1$1;
        String migratePushMaxStorageToJson$lambda$1$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                migrateBannerStorageToJson$lambda$1$1 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$1$1(obj);
                return migrateBannerStorageToJson$lambda$1$1;
            case 1:
                migrateContentCardsStorageToJson$lambda$1$1 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$1$1(obj);
                return migrateContentCardsStorageToJson$lambda$1$1;
            default:
                migratePushMaxStorageToJson$lambda$1$1 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$1$1(obj);
                return migratePushMaxStorageToJson$lambda$1$1;
        }
    }
}
