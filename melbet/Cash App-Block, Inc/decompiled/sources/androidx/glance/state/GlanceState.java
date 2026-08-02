package androidx.glance.state;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.glance.appwidget.LayoutStateDefinition;
import app.cash.badging.backend.RealBadger2$clear$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class GlanceState {
    public static final GlanceState INSTANCE = new GlanceState();
    public static final MutexImpl mutex = new MutexImpl();
    public static final LinkedHashMap dataStores = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteStore(Context context, GlanceStateDefinition glanceStateDefinition, String str, ContinuationImpl continuationImpl) {
        GlanceState$deleteStore$1 glanceState$deleteStore$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof GlanceState$deleteStore$1) {
                glanceState$deleteStore$1 = (GlanceState$deleteStore$1) continuationImpl;
                int i2 = glanceState$deleteStore$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    glanceState$deleteStore$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = glanceState$deleteStore$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = glanceState$deleteStore$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        glanceState$deleteStore$1.L$0 = context;
                        glanceState$deleteStore$1.L$1 = glanceStateDefinition;
                        glanceState$deleteStore$1.L$2 = str;
                        mutexImpl = mutex;
                        glanceState$deleteStore$1.L$3 = mutexImpl;
                        glanceState$deleteStore$1.label = 1;
                        if (mutexImpl.lock(glanceState$deleteStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = glanceState$deleteStore$1.L$3;
                        str = glanceState$deleteStore$1.L$2;
                        glanceStateDefinition = glanceState$deleteStore$1.L$1;
                        Context context2 = glanceState$deleteStore$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        context = context2;
                    }
                    dataStores.remove(str);
                    glanceStateDefinition.getLocation(context, str).delete();
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            dataStores.remove(str);
            glanceStateDefinition.getLocation(context, str).delete();
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        glanceState$deleteStore$1 = new GlanceState$deleteStore$1(this, continuationImpl);
        Object obj2 = glanceState$deleteStore$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceState$deleteStore$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        if (r5.lock(r0) == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:26:0x006b, B:28:0x0073), top: B:25:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDataStore(Context context, GlanceStateDefinition glanceStateDefinition, String str, ContinuationImpl continuationImpl) {
        GlanceState$getDataStore$1 glanceState$getDataStore$1;
        int i;
        MutexImpl mutexImpl;
        Mutex mutex2;
        Throwable th;
        Object obj;
        Map map;
        try {
            if (continuationImpl instanceof GlanceState$getDataStore$1) {
                glanceState$getDataStore$1 = (GlanceState$getDataStore$1) continuationImpl;
                int i2 = glanceState$getDataStore$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    glanceState$getDataStore$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = glanceState$getDataStore$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = glanceState$getDataStore$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        glanceState$getDataStore$1.L$0 = context;
                        glanceState$getDataStore$1.L$1 = glanceStateDefinition;
                        glanceState$getDataStore$1.L$2 = str;
                        mutexImpl = mutex;
                        glanceState$getDataStore$1.L$3 = mutexImpl;
                        glanceState$getDataStore$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map = (Map) glanceState$getDataStore$1.L$2;
                            mutex2 = (Mutex) glanceState$getDataStore$1.L$1;
                            str = (String) glanceState$getDataStore$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                obj = (DataStore) obj2;
                                map.put(str, obj);
                                obj.getClass();
                                DataStore dataStore = (DataStore) obj;
                                mutex2.unlock(null);
                                return dataStore;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        MutexImpl mutexImpl2 = glanceState$getDataStore$1.L$3;
                        str = (String) glanceState$getDataStore$1.L$2;
                        glanceStateDefinition = (GlanceStateDefinition) glanceState$getDataStore$1.L$1;
                        Context context2 = (Context) glanceState$getDataStore$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = mutexImpl2;
                        context = context2;
                    }
                    LinkedHashMap linkedHashMap = dataStores;
                    obj = linkedHashMap.get(str);
                    if (obj == null) {
                        mutex2 = mutexImpl;
                        obj.getClass();
                        DataStore dataStore2 = (DataStore) obj;
                        mutex2.unlock(null);
                        return dataStore2;
                    }
                    glanceState$getDataStore$1.L$0 = str;
                    glanceState$getDataStore$1.L$1 = mutexImpl;
                    glanceState$getDataStore$1.L$2 = linkedHashMap;
                    glanceState$getDataStore$1.L$3 = null;
                    glanceState$getDataStore$1.label = 2;
                    Object dataStore3 = glanceStateDefinition.getDataStore(context, str);
                    if (dataStore3 != coroutineSingletons) {
                        mutex2 = mutexImpl;
                        obj2 = dataStore3;
                        map = linkedHashMap;
                        obj = (DataStore) obj2;
                        map.put(str, obj);
                        obj.getClass();
                        DataStore dataStore22 = (DataStore) obj;
                        mutex2.unlock(null);
                        return dataStore22;
                    }
                    return coroutineSingletons;
                }
            }
            LinkedHashMap linkedHashMap2 = dataStores;
            obj = linkedHashMap2.get(str);
            if (obj == null) {
            }
        } catch (Throwable th3) {
            mutex2 = mutexImpl;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        glanceState$getDataStore$1 = new GlanceState$getDataStore$1(this, continuationImpl);
        Object obj22 = glanceState$getDataStore$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceState$getDataStore$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getValue(Context context, GlanceStateDefinition glanceStateDefinition, String str, ContinuationImpl continuationImpl) {
        GlanceState$getValue$1 glanceState$getValue$1;
        int i;
        if (continuationImpl instanceof GlanceState$getValue$1) {
            glanceState$getValue$1 = (GlanceState$getValue$1) continuationImpl;
            int i2 = glanceState$getValue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                glanceState$getValue$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = glanceState$getValue$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glanceState$getValue$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    glanceState$getValue$1.label = 1;
                    obj = getDataStore(context, glanceStateDefinition, str, glanceState$getValue$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Flow data = ((DataStore) obj).getData();
                glanceState$getValue$1.label = 2;
                Object first = FlowKt.first(data, glanceState$getValue$1);
                return first != obj2 ? obj2 : first;
            }
        }
        glanceState$getValue$1 = new GlanceState$getValue$1(this, continuationImpl);
        Object obj3 = glanceState$getValue$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceState$getValue$1.label;
        if (i != 0) {
        }
        Flow data2 = ((DataStore) obj3).getData();
        glanceState$getValue$1.label = 2;
        Object first2 = FlowKt.first(data2, glanceState$getValue$1);
        if (first2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateValue(Context context, LayoutStateDefinition layoutStateDefinition, String str, RealBadger2$clear$2 realBadger2$clear$2, ContinuationImpl continuationImpl) {
        GlanceState$updateValue$1 glanceState$updateValue$1;
        int i;
        if (continuationImpl instanceof GlanceState$updateValue$1) {
            glanceState$updateValue$1 = (GlanceState$updateValue$1) continuationImpl;
            int i2 = glanceState$updateValue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                glanceState$updateValue$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = glanceState$updateValue$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glanceState$updateValue$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    glanceState$updateValue$1.L$0 = realBadger2$clear$2;
                    glanceState$updateValue$1.label = 1;
                    obj = getDataStore(context, layoutStateDefinition, str, glanceState$updateValue$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realBadger2$clear$2 = glanceState$updateValue$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                glanceState$updateValue$1.L$0 = null;
                glanceState$updateValue$1.label = 2;
                Object updateData = ((DataStore) obj).updateData(realBadger2$clear$2, glanceState$updateValue$1);
                return updateData != obj2 ? obj2 : updateData;
            }
        }
        glanceState$updateValue$1 = new GlanceState$updateValue$1(this, continuationImpl);
        Object obj3 = glanceState$updateValue$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceState$updateValue$1.label;
        if (i != 0) {
        }
        glanceState$updateValue$1.L$0 = null;
        glanceState$updateValue$1.label = 2;
        Object updateData2 = ((DataStore) obj3).updateData(realBadger2$clear$2, glanceState$updateValue$1);
        if (updateData2 != obj22) {
        }
    }
}
