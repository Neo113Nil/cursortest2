package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b'R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R/\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "()V", "compositionDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/airbnb/lottie/LottieComposition;", "<set-?>", "", BreadcrumbHelper.Category.ERROR, "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "error$delegate", "Landroidx/compose/runtime/MutableState;", "isComplete", "", "()Z", "isComplete$delegate", "Landroidx/compose/runtime/State;", "isFailure", "isFailure$delegate", "isLoading", "isLoading$delegate", "isSuccess", "isSuccess$delegate", "value", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", "(Lcom/airbnb/lottie/LottieComposition;)V", "value$delegate", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "composition", "complete$lottie_compose_release", "completeExceptionally", "completeExceptionally$lottie_compose_release", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieCompositionResultImpl implements LottieCompositionResult {
    public static final int $stable = 0;
    private final CompletableDeferred compositionDeferred = new CompletableDeferredImpl();

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value = Updater.mutableStateOf$default(null);

    /* renamed from: error$delegate, reason: from kotlin metadata */
    private final MutableState error = Updater.mutableStateOf$default(null);

    /* renamed from: isLoading$delegate, reason: from kotlin metadata */
    private final State isLoading = Updater.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.getError() == null);
        }
    });

    /* renamed from: isComplete$delegate, reason: from kotlin metadata */
    private final State isComplete = Updater.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf((LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.getError() == null) ? false : true);
        }
    });

    /* renamed from: isFailure$delegate, reason: from kotlin metadata */
    private final State isFailure = Updater.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getError() != null);
        }
    });

    /* renamed from: isSuccess$delegate, reason: from kotlin metadata */
    private final State isSuccess = Updater.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() != null);
        }
    });

    private void setError(Throwable th) {
        this.error.setValue(th);
    }

    private void setValue(LottieComposition lottieComposition) {
        this.value.setValue(lottieComposition);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public Object await(Continuation<? super LottieComposition> continuation) {
        return this.compositionDeferred.await(continuation);
    }

    public final synchronized void complete$lottie_compose_release(LottieComposition composition) {
        composition.getClass();
        if (isComplete()) {
            return;
        }
        setValue(composition);
        this.compositionDeferred.complete(composition);
    }

    public final synchronized void completeExceptionally$lottie_compose_release(Throwable error) {
        error.getClass();
        if (isComplete()) {
            return;
        }
        setError(error);
        this.compositionDeferred.completeExceptionally(error);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public Throwable getError() {
        return (Throwable) this.error.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult, androidx.compose.runtime.State
    public LottieComposition getValue() {
        return (LottieComposition) this.value.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isComplete() {
        return ((Boolean) this.isComplete.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isFailure() {
        return ((Boolean) this.isFailure.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isLoading() {
        return ((Boolean) this.isLoading.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isSuccess() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }
}
