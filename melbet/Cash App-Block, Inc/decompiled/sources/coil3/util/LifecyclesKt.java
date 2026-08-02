package coil3.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class LifecyclesKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitStarted(Lifecycle lifecycle, ContinuationImpl continuationImpl) {
        LifecyclesKt$awaitStarted$1 lifecyclesKt$awaitStarted$1;
        int i;
        Lifecycle lifecycle2;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuationImpl instanceof LifecyclesKt$awaitStarted$1) {
            lifecyclesKt$awaitStarted$1 = (LifecyclesKt$awaitStarted$1) continuationImpl;
            int i2 = lifecyclesKt$awaitStarted$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                lifecyclesKt$awaitStarted$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = lifecyclesKt$awaitStarted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lifecyclesKt$awaitStarted$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        return Unit.INSTANCE;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        lifecyclesKt$awaitStarted$1.L$0 = lifecycle;
                        lifecyclesKt$awaitStarted$1.L$1 = ref$ObjectRef2;
                        lifecyclesKt$awaitStarted$1.label = 1;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(lifecyclesKt$awaitStarted$1));
                        cancellableContinuationImpl.initCancellability();
                        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: coil3.util.LifecyclesKt$awaitStarted$2$1
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public final void onStart(LifecycleOwner lifecycleOwner) {
                                Result.Companion companion = Result.Companion;
                                CancellableContinuationImpl.this.resumeWith(Unit.INSTANCE);
                            }
                        };
                        ref$ObjectRef2.element = defaultLifecycleObserver;
                        lifecycle.addObserver(defaultLifecycleObserver);
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lifecycle2 = lifecycle;
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (Throwable th2) {
                        lifecycle2 = lifecycle;
                        ref$ObjectRef = ref$ObjectRef2;
                        th = th2;
                        lifecycleObserver = (LifecycleObserver) ref$ObjectRef.element;
                        if (lifecycleObserver != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = lifecyclesKt$awaitStarted$1.L$1;
                    lifecycle2 = lifecyclesKt$awaitStarted$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        lifecycleObserver = (LifecycleObserver) ref$ObjectRef.element;
                        if (lifecycleObserver != null) {
                            lifecycle2.removeObserver(lifecycleObserver);
                        }
                        throw th;
                    }
                }
                lifecycleObserver2 = (LifecycleObserver) ref$ObjectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            }
        }
        lifecyclesKt$awaitStarted$1 = new LifecyclesKt$awaitStarted$1(continuationImpl);
        Object obj2 = lifecyclesKt$awaitStarted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lifecyclesKt$awaitStarted$1.label;
        if (i != 0) {
        }
        lifecycleObserver2 = (LifecycleObserver) ref$ObjectRef.element;
        if (lifecycleObserver2 != null) {
        }
        return Unit.INSTANCE;
    }
}
