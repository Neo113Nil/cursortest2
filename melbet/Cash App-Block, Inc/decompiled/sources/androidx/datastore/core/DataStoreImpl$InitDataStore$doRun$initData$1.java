package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends SuspendLambda implements Function1 {
    public int I$0;
    public Object L$0;
    public Serializable L$1;
    public Object L$2;
    public Object L$3;
    public Iterator L$4;
    public int label;
    public final /* synthetic */ DataStoreImpl this$0;
    public final /* synthetic */ SimpleActor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl dataStoreImpl, SimpleActor simpleActor, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutexImpl;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Mutex mutex;
        Iterator it;
        Mutex mutex2;
        Ref$BooleanRef ref$BooleanRef2;
        Ref$ObjectRef ref$ObjectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$BooleanRef ref$BooleanRef3;
        Integer version;
        Object obj2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        SimpleActor simpleActor = this.this$1;
        DataStoreImpl dataStoreImpl = this.this$0;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            mutexImpl = new MutexImpl();
            ref$BooleanRef = new Ref$BooleanRef();
            ref$ObjectRef = new Ref$ObjectRef();
            this.L$0 = mutexImpl;
            this.L$1 = ref$BooleanRef;
            this.L$2 = ref$ObjectRef;
            this.L$3 = ref$ObjectRef;
            this.label = 1;
            obj = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl, true, this);
            if (obj != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$0;
                    obj2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    return new Data(obj2, i, ((Number) obj).intValue());
                }
                mutex = (Mutex) this.L$2;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
                ref$BooleanRef3 = (Ref$BooleanRef) this.L$0;
                SafeTrace.throwOnFailure(obj);
                try {
                    ref$BooleanRef3.element = true;
                    mutex.unlock(null);
                    Object obj3 = ref$ObjectRef4.element;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = hashCode;
                    this.label = 4;
                    version = coordinator.getVersion();
                    if (version != coroutineSingletons) {
                        obj = version;
                        obj2 = obj3;
                        i = hashCode;
                        return new Data(obj2, i, ((Number) obj).intValue());
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    mutex.unlock(null);
                    throw th;
                }
            }
            it = this.L$4;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
            ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
            ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
            mutex2 = (Mutex) this.L$0;
            SafeTrace.throwOnFailure(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.L$0 = mutex2;
                this.L$1 = ref$BooleanRef2;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutineSingletons) {
                    break;
                }
            }
            ref$ObjectRef2 = ref$ObjectRef3;
            ref$BooleanRef = ref$BooleanRef2;
            mutex = mutex2;
            simpleActor.messageQueue = null;
            this.L$0 = ref$BooleanRef;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = mutex;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (mutex.lock(this) != coroutineSingletons) {
                ref$ObjectRef4 = ref$ObjectRef2;
                ref$BooleanRef3 = ref$BooleanRef;
                ref$BooleanRef3.element = true;
                mutex.unlock(null);
                Object obj32 = ref$ObjectRef4.element;
                if (obj32 == null) {
                }
                SingleProcessCoordinator coordinator2 = dataStoreImpl.getCoordinator();
                this.L$0 = obj32;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = hashCode;
                this.label = 4;
                version = coordinator2.getVersion();
                if (version != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$3;
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
        ref$BooleanRef = (Ref$BooleanRef) this.L$1;
        mutexImpl = (Mutex) this.L$0;
        SafeTrace.throwOnFailure(obj);
        ref$ObjectRef.element = ((Data) obj).value;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$12 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(mutexImpl, ref$BooleanRef, ref$ObjectRef2, dataStoreImpl);
        List list = (List) simpleActor.messageQueue;
        if (list == null) {
            mutex = mutexImpl;
            simpleActor.messageQueue = null;
            this.L$0 = ref$BooleanRef;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = mutex;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (mutex.lock(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        it = list.iterator();
        mutex2 = mutexImpl;
        ref$BooleanRef2 = ref$BooleanRef;
        ref$ObjectRef3 = ref$ObjectRef2;
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$12;
        while (it.hasNext()) {
        }
        ref$ObjectRef2 = ref$ObjectRef3;
        ref$BooleanRef = ref$BooleanRef2;
        mutex = mutex2;
        simpleActor.messageQueue = null;
        this.L$0 = ref$BooleanRef;
        this.L$1 = ref$ObjectRef2;
        this.L$2 = mutex;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (mutex.lock(this) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
