package com.squareup.cash.featureflags;

import com.squareup.cash.api.ApiResultCallAdapterFactory$get$resultType$1;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.protos.franklin.common.SyncValueType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class JsonFeatureFlags$MigratedSyncValuesFlag extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$MigratedSyncValuesFlag INSTANCE = new JsonFeatureFlags$MigratedSyncValuesFlag(new ApiResultCallAdapterFactory$get$resultType$1(new Type[]{SyncValueType.class}, 2), new FeatureFlag$JsonFeatureFlag.Options("default", MigrationPhases.PHASE_4.values), "cashclient/migrated_sync_values");

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public final class MigrationPhases {
        public static final /* synthetic */ MigrationPhases[] $VALUES;
        public static final MigrationPhases PHASE_4;
        public final List values;

        /* JADX INFO: Fake field, exist only in values array */
        MigrationPhases EF0;

        static {
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(SyncValueType.ACCESS);
            MigrationPhases migrationPhases = new MigrationPhases("PHASE_1", listOf, 0);
            ArrayList plus = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new SyncValueType[]{SyncValueType.INSTRUMENT, SyncValueType.INSTRUMENT_LINKING_OPTIONS}), (Collection) listOf);
            MigrationPhases migrationPhases2 = new MigrationPhases("PHASE_2", plus, 1);
            ArrayList plus2 = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(SyncValueType.BALANCE_SNAPSHOT), (Collection) plus);
            MigrationPhases migrationPhases3 = new MigrationPhases("PHASE_3", plus2, 2);
            MigrationPhases migrationPhases4 = new MigrationPhases("PHASE_4", CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new SyncValueType[]{SyncValueType.CRYPTO_WALLET, SyncValueType.CRYPTOCURRENCY_PROFILE}), (Collection) plus2), 3);
            PHASE_4 = migrationPhases4;
            $VALUES = new MigrationPhases[]{migrationPhases, migrationPhases2, migrationPhases3, migrationPhases4};
        }

        public MigrationPhases(String str, List list, int i) {
            this.values = list;
        }

        public static MigrationPhases valueOf(String str) {
            return (MigrationPhases) Enum.valueOf(MigrationPhases.class, str);
        }

        public static MigrationPhases[] values() {
            return (MigrationPhases[]) $VALUES.clone();
        }
    }
}
