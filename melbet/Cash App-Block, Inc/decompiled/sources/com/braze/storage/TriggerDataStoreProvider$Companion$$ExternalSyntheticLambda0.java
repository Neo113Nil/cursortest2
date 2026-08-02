package com.braze.storage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String migrateTriggersReeligibilityToJson$lambda$0;
        String migrateBlocklistedLists$lambda$0;
        String migrateBlocklistedLists$lambda$2;
        String migrateBlocklistedLists$lambda$3;
        String migrateBlocklistedLists$lambda$1;
        String migrateSealedSessionsMapToJson$lambda$0;
        String migrateSealedSessionsMapToJson$lambda$3;
        String migrateTriggersStorageToJson$lambda$4;
        String migrateTriggersReeligibilityToJson$lambda$1;
        String migrateTriggersReeligibilityToJson$lambda$3$0;
        String migrateTriggersReeligibilityToJson$lambda$4;
        String migrateTriggersStorageToJson$lambda$0;
        String migrateTriggersStorageToJson$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                migrateTriggersReeligibilityToJson$lambda$0 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$0();
                return migrateTriggersReeligibilityToJson$lambda$0;
            case 1:
                migrateBlocklistedLists$lambda$0 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$0();
                return migrateBlocklistedLists$lambda$0;
            case 2:
                migrateBlocklistedLists$lambda$2 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$2();
                return migrateBlocklistedLists$lambda$2;
            case 3:
                migrateBlocklistedLists$lambda$3 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$3();
                return migrateBlocklistedLists$lambda$3;
            case 4:
                migrateBlocklistedLists$lambda$1 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$1();
                return migrateBlocklistedLists$lambda$1;
            case 5:
                migrateSealedSessionsMapToJson$lambda$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$0();
                return migrateSealedSessionsMapToJson$lambda$0;
            case 6:
                migrateSealedSessionsMapToJson$lambda$3 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$3();
                return migrateSealedSessionsMapToJson$lambda$3;
            case 7:
                migrateTriggersStorageToJson$lambda$4 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4();
                return migrateTriggersStorageToJson$lambda$4;
            case 8:
                migrateTriggersReeligibilityToJson$lambda$1 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$1();
                return migrateTriggersReeligibilityToJson$lambda$1;
            case 9:
                migrateTriggersReeligibilityToJson$lambda$3$0 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$3$0();
                return migrateTriggersReeligibilityToJson$lambda$3$0;
            case 10:
                migrateTriggersReeligibilityToJson$lambda$4 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$4();
                return migrateTriggersReeligibilityToJson$lambda$4;
            case 11:
                migrateTriggersStorageToJson$lambda$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$0();
                return migrateTriggersStorageToJson$lambda$0;
            default:
                migrateTriggersStorageToJson$lambda$1 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$1();
                return migrateTriggersStorageToJson$lambda$1;
        }
    }
}
