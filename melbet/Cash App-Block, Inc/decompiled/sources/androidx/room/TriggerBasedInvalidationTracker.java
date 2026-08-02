package androidx.room;

import androidx.compose.runtime.Latch;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.concurrent.CloseBarrier;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.storage.RealStorage$temp$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker {
    public static final String[] TRIGGERS = {"INSERT", "UPDATE", "DELETE"};
    public final RoomDatabase database;
    public final Latch observedTableStates;
    public final ObservedTableVersions observedTableVersions;
    public final RealStorage$temp$1 onInvalidatedTablesIds;
    public final HashMap shadowTablesMap;
    public final String[] tablesNames;
    public final boolean useTempTable;
    public final HashMap viewTables;
    public final AtomicBoolean pendingRefresh = new AtomicBoolean(false);
    public Function0 onAllowRefresh = new InvalidationTracker$$ExternalSyntheticLambda0(23);
    public final LinkedHashMap tableIdLookup = new LinkedHashMap();

    public TriggerBasedInvalidationTracker(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z, RealStorage$temp$1 realStorage$temp$1) {
        String str;
        this.database = roomDatabase;
        this.shadowTablesMap = hashMap;
        this.viewTables = hashMap2;
        this.useTempTable = z;
        this.onInvalidatedTablesIds = realStorage$temp$1;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.shadowTablesMap.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.tablesNames = strArr2;
        for (Map.Entry entry : this.shadowTablesMap.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = this.tableIdLookup;
                linkedHashMap.put(lowerCase3, MapsKt__MapsKt.getValue(linkedHashMap, lowerCase2));
            }
        }
        this.observedTableStates = new Latch(this.tablesNames.length);
        this.observedTableVersions = new ObservedTableVersions(this.tablesNames.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$checkInvalidatedTables(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, PooledConnection pooledConnection, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$checkInvalidatedTables$1 triggerBasedInvalidationTracker$checkInvalidatedTables$1;
        int i;
        Set set;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$checkInvalidatedTables$1) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = (TriggerBasedInvalidationTracker$checkInvalidatedTables$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = triggerBasedInvalidationTracker$checkInvalidatedTables$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$checkInvalidatedTables$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransactorKt$$ExternalSyntheticLambda0 transactorKt$$ExternalSyntheticLambda0 = new TransactorKt$$ExternalSyntheticLambda0(17);
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0 = pooledConnection;
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.label = 1;
                    obj = pooledConnection.usePrepared("SELECT * FROM room_table_modification_log WHERE invalidated = 1", transactorKt$$ExternalSyntheticLambda0, triggerBasedInvalidationTracker$checkInvalidatedTables$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        return set2;
                    }
                    pooledConnection = (PooledConnection) triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0 = set;
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.label = 2;
                    if (TransactorKt.execSQL(pooledConnection, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", triggerBasedInvalidationTracker$checkInvalidatedTables$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return set;
            }
        }
        triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(triggerBasedInvalidationTracker, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$checkInvalidatedTables$1.label;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:13:0x0084, B:15:0x008f, B:18:0x00c8, B:19:0x009e, B:20:0x00a0, B:22:0x00ad, B:24:0x00b7, B:26:0x00bd, B:27:0x00bb, B:30:0x00c2, B:48:0x0049, B:50:0x0051, B:53:0x005d, B:55:0x006b, B:58:0x0071), top: B:47:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$notifyInvalidation(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$notifyInvalidation$1 triggerBasedInvalidationTracker$notifyInvalidation$1;
        int i;
        CloseBarrier closeBarrier$room_runtime_release;
        Throwable th;
        CloseBarrier closeBarrier;
        Object useConnection$room_runtime_release;
        Set set;
        Object value;
        int[] iArr;
        RoomDatabase roomDatabase = triggerBasedInvalidationTracker.database;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$notifyInvalidation$1) {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = (TriggerBasedInvalidationTracker$notifyInvalidation$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$notifyInvalidation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                triggerBasedInvalidationTracker$notifyInvalidation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = triggerBasedInvalidationTracker$notifyInvalidation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$notifyInvalidation$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    closeBarrier$room_runtime_release = roomDatabase.getCloseBarrier$room_runtime_release();
                    if (!closeBarrier$room_runtime_release.block$room_runtime_release()) {
                        return EmptySet.INSTANCE;
                    }
                    try {
                        if (!triggerBasedInvalidationTracker.pendingRefresh.compareAndSet(true, false)) {
                            EmptySet emptySet = EmptySet.INSTANCE;
                            closeBarrier$room_runtime_release.unblock$room_runtime_release();
                            return emptySet;
                        }
                        if (!((Boolean) triggerBasedInvalidationTracker.onAllowRefresh.invoke()).booleanValue()) {
                            EmptySet emptySet2 = EmptySet.INSTANCE;
                            closeBarrier$room_runtime_release.unblock$room_runtime_release();
                            return emptySet2;
                        }
                        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(triggerBasedInvalidationTracker, continuation, 2);
                        triggerBasedInvalidationTracker$notifyInvalidation$1.L$0 = triggerBasedInvalidationTracker;
                        triggerBasedInvalidationTracker$notifyInvalidation$1.L$1 = closeBarrier$room_runtime_release;
                        triggerBasedInvalidationTracker$notifyInvalidation$1.label = 1;
                        useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$notifyInvalidation$1);
                        if (useConnection$room_runtime_release == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeBarrier = closeBarrier$room_runtime_release;
                        closeBarrier.unblock$room_runtime_release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    closeBarrier = triggerBasedInvalidationTracker$notifyInvalidation$1.L$1;
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2 = triggerBasedInvalidationTracker$notifyInvalidation$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        closeBarrier$room_runtime_release = closeBarrier;
                        triggerBasedInvalidationTracker = triggerBasedInvalidationTracker2;
                        useConnection$room_runtime_release = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        closeBarrier.unblock$room_runtime_release();
                        throw th;
                    }
                }
                set = (Set) useConnection$room_runtime_release;
                if (!set.isEmpty()) {
                    ObservedTableVersions observedTableVersions = triggerBasedInvalidationTracker.observedTableVersions;
                    observedTableVersions.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        StateFlowImpl stateFlowImpl = observedTableVersions.versions;
                        do {
                            value = stateFlowImpl.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                            }
                        } while (!stateFlowImpl.compareAndSet(value, iArr));
                    }
                    triggerBasedInvalidationTracker.onInvalidatedTablesIds.invoke(set);
                }
                closeBarrier$room_runtime_release.unblock$room_runtime_release();
                return set;
            }
        }
        triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(triggerBasedInvalidationTracker, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$notifyInvalidation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$notifyInvalidation$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        set = (Set) useConnection$room_runtime_release;
        if (!set.isEmpty()) {
        }
        closeBarrier$room_runtime_release.unblock$room_runtime_release();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00df, code lost:
    
        if (androidx.room.TransactorKt.execSQL(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (androidx.room.TransactorKt.execSQL(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00df -> B:11:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$startTrackingTable(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Transactor transactor, int i, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$startTrackingTable$1 triggerBasedInvalidationTracker$startTrackingTable$1;
        int i2;
        String[] strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2;
        int i3;
        PooledConnection pooledConnection;
        int i4;
        String str;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker3 = triggerBasedInvalidationTracker;
        PooledConnection pooledConnection2 = transactor;
        int i5 = i;
        triggerBasedInvalidationTracker3.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$startTrackingTable$1) {
            triggerBasedInvalidationTracker$startTrackingTable$1 = (TriggerBasedInvalidationTracker$startTrackingTable$1) continuationImpl;
            int i6 = triggerBasedInvalidationTracker$startTrackingTable$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                triggerBasedInvalidationTracker$startTrackingTable$1.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj = triggerBasedInvalidationTracker$startTrackingTable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = triggerBasedInvalidationTracker$startTrackingTable$1.label;
                boolean z = true;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)";
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$0 = triggerBasedInvalidationTracker3;
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$1 = pooledConnection2;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$0 = i5;
                    triggerBasedInvalidationTracker$startTrackingTable$1.label = 1;
                } else if (i2 == 1) {
                    int i7 = triggerBasedInvalidationTracker$startTrackingTable$1.I$0;
                    pooledConnection2 = triggerBasedInvalidationTracker$startTrackingTable$1.L$1;
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker4 = triggerBasedInvalidationTracker$startTrackingTable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i5 = i7;
                    triggerBasedInvalidationTracker3 = triggerBasedInvalidationTracker4;
                } else {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = triggerBasedInvalidationTracker$startTrackingTable$1.I$2;
                    i4 = triggerBasedInvalidationTracker$startTrackingTable$1.I$1;
                    i5 = triggerBasedInvalidationTracker$startTrackingTable$1.I$0;
                    strArr = triggerBasedInvalidationTracker$startTrackingTable$1.L$3;
                    str = triggerBasedInvalidationTracker$startTrackingTable$1.L$2;
                    pooledConnection = triggerBasedInvalidationTracker$startTrackingTable$1.L$1;
                    triggerBasedInvalidationTracker2 = triggerBasedInvalidationTracker$startTrackingTable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    boolean z2 = true;
                    i4++;
                    z = z2;
                    if (i4 >= i3) {
                        return Unit.INSTANCE;
                    }
                    String str3 = strArr[i4];
                    z2 = z;
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CREATE ", triggerBasedInvalidationTracker2.useTempTable ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                    Boxes$$ExternalSyntheticOutline1.m(m, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, " AND invalidated = 0; END", m);
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$0 = triggerBasedInvalidationTracker2;
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$1 = pooledConnection;
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$2 = str;
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$3 = strArr;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$0 = i5;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$1 = i4;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$2 = i3;
                    triggerBasedInvalidationTracker$startTrackingTable$1.label = 2;
                }
                String str4 = triggerBasedInvalidationTracker3.tablesNames[i5];
                strArr = TRIGGERS;
                triggerBasedInvalidationTracker2 = triggerBasedInvalidationTracker3;
                i3 = 3;
                pooledConnection = pooledConnection2;
                i4 = 0;
                str = str4;
                if (i4 >= i3) {
                }
            }
        }
        triggerBasedInvalidationTracker$startTrackingTable$1 = new TriggerBasedInvalidationTracker$startTrackingTable$1(triggerBasedInvalidationTracker3, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$startTrackingTable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = triggerBasedInvalidationTracker$startTrackingTable$1.label;
        boolean z3 = true;
        if (i2 != 0) {
        }
        String str42 = triggerBasedInvalidationTracker3.tablesNames[i5];
        strArr = TRIGGERS;
        triggerBasedInvalidationTracker2 = triggerBasedInvalidationTracker3;
        i3 = 3;
        pooledConnection = pooledConnection2;
        i4 = 0;
        str = str42;
        if (i4 >= i3) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.room.PooledConnection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0082 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$stopTrackingTable(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Transactor transactor, int i, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$stopTrackingTable$1 triggerBasedInvalidationTracker$stopTrackingTable$1;
        int i2;
        String str;
        int i3;
        Transactor transactor2;
        int i4;
        String[] strArr;
        triggerBasedInvalidationTracker.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$stopTrackingTable$1) {
            triggerBasedInvalidationTracker$stopTrackingTable$1 = (TriggerBasedInvalidationTracker$stopTrackingTable$1) continuationImpl;
            int i5 = triggerBasedInvalidationTracker$stopTrackingTable$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                triggerBasedInvalidationTracker$stopTrackingTable$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj = triggerBasedInvalidationTracker$stopTrackingTable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = triggerBasedInvalidationTracker$stopTrackingTable$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str = triggerBasedInvalidationTracker.tablesNames[i];
                    i3 = 3;
                    transactor2 = transactor;
                    i4 = 0;
                    strArr = TRIGGERS;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = triggerBasedInvalidationTracker$stopTrackingTable$1.I$1;
                    i4 = triggerBasedInvalidationTracker$stopTrackingTable$1.I$0;
                    String[] strArr2 = triggerBasedInvalidationTracker$stopTrackingTable$1.L$2;
                    str = triggerBasedInvalidationTracker$stopTrackingTable$1.L$1;
                    ?? r4 = triggerBasedInvalidationTracker$stopTrackingTable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    strArr = strArr2;
                    transactor2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                        triggerBasedInvalidationTracker$stopTrackingTable$1.L$0 = transactor2;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.L$1 = str;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.L$2 = strArr;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.I$0 = i4;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.I$1 = i3;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.label = 1;
                        if (TransactorKt.execSQL(transactor2, m, triggerBasedInvalidationTracker$stopTrackingTable$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i4++;
                        if (i4 < i3) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        triggerBasedInvalidationTracker$stopTrackingTable$1 = new TriggerBasedInvalidationTracker$stopTrackingTable$1(triggerBasedInvalidationTracker, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$stopTrackingTable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = triggerBasedInvalidationTracker$stopTrackingTable$1.label;
        if (i2 != 0) {
        }
    }

    public final void refreshInvalidationAsync$room_runtime_release(Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        if (this.pendingRefresh.compareAndSet(false, true)) {
            function0.invoke();
            JobKt.launch$default(this.database.getCoroutineScope(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new GatedFrameClock.AnonymousClass1(this, function02, null, 16), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncTriggers$room_runtime_release(ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$syncTriggers$1 triggerBasedInvalidationTracker$syncTriggers$1;
        int i;
        CloseBarrier closeBarrier;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$syncTriggers$1) {
            triggerBasedInvalidationTracker$syncTriggers$1 = (TriggerBasedInvalidationTracker$syncTriggers$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$syncTriggers$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                triggerBasedInvalidationTracker$syncTriggers$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = triggerBasedInvalidationTracker$syncTriggers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$syncTriggers$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RoomDatabase roomDatabase = this.database;
                    CloseBarrier closeBarrier$room_runtime_release = roomDatabase.getCloseBarrier$room_runtime_release();
                    if (closeBarrier$room_runtime_release.block$room_runtime_release()) {
                        try {
                            TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this, continuation, 0);
                            triggerBasedInvalidationTracker$syncTriggers$1.L$0 = closeBarrier$room_runtime_release;
                            triggerBasedInvalidationTracker$syncTriggers$1.label = 1;
                            if (roomDatabase.useConnection$room_runtime_release(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$syncTriggers$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            closeBarrier = closeBarrier$room_runtime_release;
                        } catch (Throwable th) {
                            th = th;
                            closeBarrier = closeBarrier$room_runtime_release;
                            closeBarrier.unblock$room_runtime_release();
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeBarrier = triggerBasedInvalidationTracker$syncTriggers$1.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    closeBarrier.unblock$room_runtime_release();
                    throw th;
                }
                closeBarrier.unblock$room_runtime_release();
                return Unit.INSTANCE;
            }
        }
        triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$syncTriggers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$syncTriggers$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        closeBarrier.unblock$room_runtime_release();
        return Unit.INSTANCE;
    }

    public final Pair validateTableNames$room_runtime_release(String[] strArr) {
        strArr.getClass();
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.viewTables.get(lowerCase);
            if (set != null) {
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        String[] strArr2 = (String[]) SetsKt__SetsJVMKt.build(setBuilder).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.tableIdLookup.get(lowerCase2);
            if (num == null) {
                a$$ExternalSyntheticBUOutline0.m$3("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }
}
