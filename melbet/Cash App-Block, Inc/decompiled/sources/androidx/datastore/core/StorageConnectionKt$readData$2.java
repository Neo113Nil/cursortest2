package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class StorageConnectionKt$readData$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StorageConnectionKt$readData$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                ((Boolean) obj2).getClass();
                StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(3, (Continuation) obj3, 0);
                storageConnectionKt$readData$2.L$0 = (FileReadScope) obj;
                return storageConnectionKt$readData$2.invokeSuspend(Unit.INSTANCE);
            default:
                StorageConnectionKt$readData$2 storageConnectionKt$readData$22 = new StorageConnectionKt$readData$2(3, (Continuation) obj3, 1);
                storageConnectionKt$readData$22.L$0 = (FlowCollector) obj;
                return storageConnectionKt$readData$22.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FileReadScope fileReadScope = (FileReadScope) this.L$0;
                this.label = 1;
                fileReadScope.getClass();
                Object readData$suspendImpl = FileReadScope.readData$suspendImpl(fileReadScope, this);
                return readData$suspendImpl == coroutineSingletons ? coroutineSingletons : readData$suspendImpl;
            default:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(unit, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
