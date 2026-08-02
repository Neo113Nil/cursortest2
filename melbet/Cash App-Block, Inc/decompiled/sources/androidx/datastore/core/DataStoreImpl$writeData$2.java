package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DataStoreImpl$writeData$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $newData;
    public final /* synthetic */ Ref$IntRef $newVersion;
    public final /* synthetic */ boolean $updateCache;
    public /* synthetic */ Object L$0;
    public Ref$IntRef L$1;
    public int label;
    public final /* synthetic */ DataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref$IntRef ref$IntRef, DataStoreImpl dataStoreImpl, Object obj, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$newVersion = ref$IntRef;
        this.this$0 = dataStoreImpl;
        this.$newData = obj;
        this.$updateCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, continuation);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$writeData$2) create((FileWriteScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.writeData(r3, r8) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FileWriteScope fileWriteScope;
        Ref$IntRef ref$IntRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = this.$newData;
        DataStoreImpl dataStoreImpl = this.this$0;
        Ref$IntRef ref$IntRef2 = this.$newVersion;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FileWriteScope fileWriteScope2 = (FileWriteScope) this.L$0;
            SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
            this.L$0 = fileWriteScope2;
            this.L$1 = ref$IntRef2;
            this.label = 1;
            Integer num = new Integer(((AtomicInteger) coordinator.version.imageLoader).incrementAndGet());
            if (num != coroutineSingletons) {
                fileWriteScope = fileWriteScope2;
                obj = num;
                ref$IntRef = ref$IntRef2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            if (this.$updateCache) {
                dataStoreImpl.inMemoryCache.tryUpdate(new Data(obj2, obj2 != null ? obj2.hashCode() : 0, ref$IntRef2.element));
            }
            return Unit.INSTANCE;
        }
        ref$IntRef = this.L$1;
        fileWriteScope = (FileWriteScope) this.L$0;
        SafeTrace.throwOnFailure(obj);
        ref$IntRef.element = ((Number) obj).intValue();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
