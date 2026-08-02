package com.squareup.cash.clientsync.persistence;

import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.SyncEntityShadowDivergence;
import com.squareup.cash.clientsync.errors.SyncEntityShadowException;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.util.android.Intents;
import com.squareup.util.android.Keyboards;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShadowedSyncEntityStore$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ShadowedSyncEntityStore f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ SyncEntityType f$2;

    public /* synthetic */ ShadowedSyncEntityStore$$ExternalSyntheticLambda1(ShadowedSyncEntityStore shadowedSyncEntityStore, String str, SyncEntityType syncEntityType, int i) {
        this.$r8$classId = i;
        this.f$0 = shadowedSyncEntityStore;
        this.f$1 = str;
        this.f$2 = syncEntityType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SyncEntityType syncEntityType = this.f$2;
        String str = this.f$1;
        ShadowedSyncEntityStore shadowedSyncEntityStore = this.f$0;
        switch (i) {
            case 0:
                SyncEntityStore syncEntityStore = shadowedSyncEntityStore.mainStore;
                RealClientSyncErrorReporter realClientSyncErrorReporter = shadowedSyncEntityStore.errorReporter;
                SyncEntityStore syncEntityStore2 = shadowedSyncEntityStore.shadowStore;
                SyncEntity entity = syncEntityStore.getEntity(str, syncEntityType);
                try {
                    SyncEntity entity2 = syncEntityStore2.getEntity(str, syncEntityType);
                    if (!Intrinsics.areEqual(entity, entity2)) {
                        int i2 = SyncEntityShadowDivergence.$r8$clinit;
                        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("entityId", str), new Pair("entityType", String.valueOf(syncEntityType.value)));
                        Class<?> cls = syncEntityStore.getClass();
                        ReflectionFactory reflectionFactory = Reflection.factory;
                        realClientSyncErrorReporter.reportNonFatal(Intents.create("getEntity", mapOf, reflectionFactory.getOrCreateKotlinClass(cls), reflectionFactory.getOrCreateKotlinClass(syncEntityStore2.getClass()), entity != null ? SetsKt__SetsJVMKt.setOf(entity) : EmptySet.INSTANCE, entity2 != null ? SetsKt__SetsJVMKt.setOf(entity2) : EmptySet.INSTANCE));
                    }
                } catch (Throwable th) {
                    int i3 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls2 = syncEntityStore.getClass();
                    ReflectionFactory reflectionFactory2 = Reflection.factory;
                    realClientSyncErrorReporter.reportNonFatal(Keyboards.create("There was an exception in getEntity", th, reflectionFactory2.getOrCreateKotlinClass(cls2), reflectionFactory2.getOrCreateKotlinClass(syncEntityStore2.getClass())));
                }
                return entity;
            default:
                SyncEntityStore syncEntityStore3 = shadowedSyncEntityStore.mainStore;
                SyncEntityStore syncEntityStore4 = shadowedSyncEntityStore.shadowStore;
                syncEntityStore3.deleteEntity(str, syncEntityType);
                try {
                    syncEntityStore4.deleteEntity(str, syncEntityType);
                } catch (Throwable th2) {
                    RealClientSyncErrorReporter realClientSyncErrorReporter2 = shadowedSyncEntityStore.errorReporter;
                    int i4 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls3 = syncEntityStore3.getClass();
                    ReflectionFactory reflectionFactory3 = Reflection.factory;
                    realClientSyncErrorReporter2.reportNonFatal(Keyboards.create("There was an exception in deleteEntity", th2, reflectionFactory3.getOrCreateKotlinClass(cls3), reflectionFactory3.getOrCreateKotlinClass(syncEntityStore4.getClass())));
                }
                return Unit.INSTANCE;
        }
    }
}
