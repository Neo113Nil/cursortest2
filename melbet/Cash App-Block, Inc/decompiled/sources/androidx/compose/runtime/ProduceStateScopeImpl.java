package androidx.compose.runtime;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ProduceStateScopeImpl implements ProduceStateScope, MutableState {
    public final /* synthetic */ MutableState $$delegate_0;
    public final CoroutineContext coroutineContext;

    public ProduceStateScopeImpl(MutableState mutableState, CoroutineContext coroutineContext) {
        this.$$delegate_0 = mutableState;
        this.coroutineContext = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void awaitDispose(Function0 function0, ContinuationImpl continuationImpl) {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        int i;
        try {
            if (continuationImpl instanceof ProduceStateScopeImpl$awaitDispose$1) {
                produceStateScopeImpl$awaitDispose$1 = (ProduceStateScopeImpl$awaitDispose$1) continuationImpl;
                int i2 = produceStateScopeImpl$awaitDispose$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    produceStateScopeImpl$awaitDispose$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = produceStateScopeImpl$awaitDispose$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = produceStateScopeImpl$awaitDispose$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        produceStateScopeImpl$awaitDispose$1.L$0 = function0;
                        produceStateScopeImpl$awaitDispose$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(produceStateScopeImpl$awaitDispose$1));
                        cancellableContinuationImpl.initCancellability();
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                            return;
                        }
                    } else if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        function0 = produceStateScopeImpl$awaitDispose$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, continuationImpl);
        Object obj2 = produceStateScopeImpl$awaitDispose$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = produceStateScopeImpl$awaitDispose$1.label;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        this.$$delegate_0.setValue(obj);
    }
}
