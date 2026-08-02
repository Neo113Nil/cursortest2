package androidx.datastore.core;

import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DataStoreImpl$transformAndWrite$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ CoroutineContext $callerContext;
    public final /* synthetic */ Function2 $transform;
    public Object L$0;
    public int label;
    public final /* synthetic */ DataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2(DataStoreImpl dataStoreImpl, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.$callerContext = coroutineContext;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$transformAndWrite$2(this.this$0, this.$callerContext, this.$transform, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$transformAndWrite$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        if (r10 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Data data;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        DataStoreImpl dataStoreImpl = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            obj = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl, true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    return obj2;
                }
                data = (Data) this.L$0;
                SafeTrace.throwOnFailure(obj);
                Object obj3 = data.value;
                if ((obj3 != null ? obj3.hashCode() : 0) != data.hashCode) {
                    a$$ExternalSyntheticBUOutline0.m$1("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!Intrinsics.areEqual(data.value, obj)) {
                    this.L$0 = obj;
                    this.label = 3;
                    if (dataStoreImpl.writeData$datastore_core_release(obj, true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
            SafeTrace.throwOnFailure(obj);
        }
        data = (Data) obj;
        GatedFrameClock.AnonymousClass1 anonymousClass1 = new GatedFrameClock.AnonymousClass1(this.$transform, data, null, 13);
        this.L$0 = data;
        this.label = 2;
        obj = JobKt.withContext(this.$callerContext, anonymousClass1, this);
    }
}
