package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.LifecycleEventObserver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt$awaitResumed$1;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public abstract class zzki {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        if (r11.await(r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$awaitResumed(ComponentActivity componentActivity, ContinuationImpl continuationImpl) {
        PaymentNextActionHandlerKt$awaitResumed$1 paymentNextActionHandlerKt$awaitResumed$1;
        int i;
        CompletableDeferredImpl completableDeferredImpl;
        CompletableDeferredImpl completableDeferredImpl2;
        if (continuationImpl instanceof PaymentNextActionHandlerKt$awaitResumed$1) {
            paymentNextActionHandlerKt$awaitResumed$1 = (PaymentNextActionHandlerKt$awaitResumed$1) continuationImpl;
            int i2 = paymentNextActionHandlerKt$awaitResumed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentNextActionHandlerKt$awaitResumed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentNextActionHandlerKt$awaitResumed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentNextActionHandlerKt$awaitResumed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    completableDeferredImpl = new CompletableDeferredImpl();
                    final Lifecycle lifecycle = componentActivity.getLifecycle();
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    final HandlerContext handlerContext = MainDispatcherLoader.dispatcher.immediate;
                    boolean isDispatchNeeded = handlerContext.isDispatchNeeded(paymentNextActionHandlerKt$awaitResumed$1.getContext());
                    if (!isDispatchNeeded) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            throw new LifecycleDestroyedException(null);
                        }
                        if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                            completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
                            paymentNextActionHandlerKt$awaitResumed$1.L$1 = null;
                            paymentNextActionHandlerKt$awaitResumed$1.label = 2;
                        }
                    }
                    final PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1 paymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1 = new PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1(completableDeferredImpl);
                    paymentNextActionHandlerKt$awaitResumed$1.L$1 = completableDeferredImpl;
                    paymentNextActionHandlerKt$awaitResumed$1.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(paymentNextActionHandlerKt$awaitResumed$1));
                    cancellableContinuationImpl.initCancellability();
                    final ?? r4 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
                        {
                            Lifecycle.State state2 = Lifecycle.State.DESTROYED;
                        }

                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            Object failure;
                            Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                            Lifecycle.State state2 = Lifecycle.State.RESUMED;
                            companion.getClass();
                            Lifecycle.Event upTo = Lifecycle.Event.Companion.upTo(state2);
                            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                            Lifecycle lifecycle2 = lifecycle;
                            if (event != upTo) {
                                if (event == Lifecycle.Event.ON_DESTROY) {
                                    lifecycle2.removeObserver(this);
                                    Result.Companion companion2 = Result.Companion;
                                    cancellableContinuationImpl2.resumeWith(new Result.Failure(new LifecycleDestroyedException(null)));
                                    return;
                                }
                                return;
                            }
                            lifecycle2.removeObserver(this);
                            PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1 paymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$12 = paymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1;
                            try {
                                Result.Companion companion3 = Result.Companion;
                                failure = paymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$12.invoke();
                            } catch (Throwable th) {
                                Result.Companion companion4 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            cancellableContinuationImpl2.resumeWith(failure);
                        }
                    };
                    if (isDispatchNeeded) {
                        handlerContext.dispatch(EmptyCoroutineContext.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Lifecycle.this.addObserver(r4);
                            }
                        });
                    } else {
                        lifecycle.addObserver(r4);
                    }
                    cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                            CoroutineDispatcher coroutineDispatcher = handlerContext;
                            boolean isDispatchNeeded2 = coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext);
                            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r4;
                            Lifecycle lifecycle2 = lifecycle;
                            if (isDispatchNeeded2) {
                                coroutineDispatcher.dispatch(emptyCoroutineContext, new Client.AnonymousClass4(6, lifecycle2, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
                            } else {
                                lifecycle2.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    if (cancellableContinuationImpl.getResult() != coroutineSingletons) {
                        completableDeferredImpl2 = completableDeferredImpl;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                completableDeferredImpl2 = paymentNextActionHandlerKt$awaitResumed$1.L$1;
                SafeTrace.throwOnFailure(obj);
                completableDeferredImpl = completableDeferredImpl2;
                paymentNextActionHandlerKt$awaitResumed$1.L$1 = null;
                paymentNextActionHandlerKt$awaitResumed$1.label = 2;
            }
        }
        paymentNextActionHandlerKt$awaitResumed$1 = new PaymentNextActionHandlerKt$awaitResumed$1(continuationImpl);
        Object obj2 = paymentNextActionHandlerKt$awaitResumed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentNextActionHandlerKt$awaitResumed$1.label;
        if (i != 0) {
        }
        completableDeferredImpl = completableDeferredImpl2;
        paymentNextActionHandlerKt$awaitResumed$1.L$1 = null;
        paymentNextActionHandlerKt$awaitResumed$1.label = 2;
    }

    public static final boolean enabled(DependentControlStatus dependentControlStatus) {
        dependentControlStatus.getClass();
        DependentControlStatus.Loaded loaded = dependentControlStatus instanceof DependentControlStatus.Loaded ? (DependentControlStatus.Loaded) dependentControlStatus : null;
        return loaded != null && loaded.getControlEnabled();
    }

    public static final boolean isLoading(DependentControlStatus dependentControlStatus) {
        dependentControlStatus.getClass();
        return (dependentControlStatus instanceof DependentControlStatus.InitialLoading) || (dependentControlStatus instanceof DependentControlStatus.Updating);
    }

    public static zzkl zzc(Exception exc) {
        zzkl zzklVar = new zzkl();
        zzklVar.zzm(exc);
        return zzklVar;
    }

    public static zzkm zzd(Object obj) {
        return obj == null ? zzkm.zza : new zzkm(obj);
    }

    public static zzjk zzg(ListenableFuture listenableFuture, zzhp zzhpVar, Executor executor) {
        int i = zzjl.$r8$clinit;
        zzjk zzjkVar = new zzjk(listenableFuture, zzhpVar);
        executor.getClass();
        if (executor != zzjx.zza) {
            executor = new zzkt(executor, zzjkVar);
        }
        listenableFuture.addListener(zzjkVar, executor);
        return zzjkVar;
    }

    public static zzjj zzh(ListenableFuture listenableFuture, zzjt zzjtVar, Executor executor) {
        int i = zzjl.$r8$clinit;
        zzjj zzjjVar = new zzjj(listenableFuture, zzjtVar);
        executor.getClass();
        if (executor != zzjx.zza) {
            executor = new zzkt(executor, zzjjVar);
        }
        listenableFuture.addListener(zzjjVar, executor);
        return zzjjVar;
    }

    public static Object zzi(Future future) {
        Object obj;
        if (!future.isDone()) {
            a$$ExternalSyntheticBUOutline0.m$1(zzhx.zzb("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
