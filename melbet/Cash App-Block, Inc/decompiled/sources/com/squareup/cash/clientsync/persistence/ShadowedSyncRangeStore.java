package com.squareup.cash.clientsync.persistence;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.SyncRangeShadowDivergence;
import com.squareup.cash.clientsync.errors.SyncRangeShadowException;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes6.dex */
public final class ShadowedSyncRangeStore implements SyncRangeStore {
    public final KeysetHandle auditLog;
    public final RealClientSyncErrorReporter errorReporter;
    public final SyncRangeStore mainStore;
    public int operationIdGenerator;
    public final SyncRangeStore shadowStore;
    public final ClientSyncTransactor transactor;

    public ShadowedSyncRangeStore(SyncRangeStore syncRangeStore, SyncRangeStore syncRangeStore2, KeysetHandle keysetHandle, RealClientSyncErrorReporter realClientSyncErrorReporter, ClientSyncTransactor clientSyncTransactor) {
        syncRangeStore.getClass();
        syncRangeStore2.getClass();
        keysetHandle.getClass();
        realClientSyncErrorReporter.getClass();
        clientSyncTransactor.getClass();
        this.mainStore = syncRangeStore;
        this.shadowStore = syncRangeStore2;
        this.auditLog = keysetHandle;
        this.errorReporter = realClientSyncErrorReporter;
        this.transactor = clientSyncTransactor;
        if (Intrinsics.areEqual(syncRangeStore, syncRangeStore2)) {
            a$$ExternalSyntheticBUOutline0.m$3("The main store and the shadow store must be different.");
            throw null;
        }
    }

    public final Set audit(int i, String str) {
        Set set = CollectionsKt.toSet(this.mainStore.getAllRanges());
        try {
            Set set2 = CollectionsKt.toSet(this.shadowStore.getAllRanges());
            boolean areEqual = Intrinsics.areEqual(set, set2);
            this.auditLog.appendMessage(str.concat(" {") + CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("operationId", Integer.valueOf(i)), new Pair("isHealthy", Boolean.valueOf(areEqual)), new Pair("mainRangeCount", Integer.valueOf(set.size())), new Pair("shadowRangeCount", Integer.valueOf(set2.size()))}), null, null, null, 0, null, new SyncRangeQueries$$ExternalSyntheticLambda1(17), 31) + "}");
            if (areEqual) {
                return set;
            }
            reportDivergence(set, set2);
            return set;
        } catch (Throwable th) {
            reportError("There was an error while trying to perform an audit for: ".concat(str), th);
            return set;
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final long deleteAllRanges() {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        this.transactor.transaction(new BadgedBoxKt$$ExternalSyntheticLambda0(9, this, ref$LongRef));
        return ref$LongRef.element;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final List getAllRanges() {
        return (List) this.transactor.transactionWithResult(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 20));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final void replaceRanges(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.transactor.transaction(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(17, this, list, list2));
    }

    public final void reportDivergence(Set set, Set set2) {
        int i = SyncRangeShadowDivergence.$r8$clinit;
        Class<?> cls = this.mainStore.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls);
        KClass orCreateKotlinClass2 = reflectionFactory.getOrCreateKotlinClass(this.shadowStore.getClass());
        ArrayList entries = this.auditLog.getEntries();
        Set set3 = set;
        int i2 = 0;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                if (set2.contains((SyncRange) it.next()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw null;
                }
            }
        }
        int i3 = i2;
        this.errorReporter.reportNonFatal(new SyncRangeShadowDivergence(new SyncRangeShadowDivergence.Metadata(orCreateKotlinClass, orCreateKotlinClass2, entries, set.size(), set2.size(), i3, set.size() - i3, set2.size() - i3)));
    }

    public final void reportError(String str, Throwable th) {
        int i = SyncRangeShadowException.$r8$clinit;
        Class<?> cls = this.mainStore.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.errorReporter.reportNonFatal(new SyncRangeShadowException(str, th, new SyncRangeShadowException.Metadata(reflectionFactory.getOrCreateKotlinClass(cls), reflectionFactory.getOrCreateKotlinClass(this.shadowStore.getClass()), this.auditLog.getEntries())));
    }
}
