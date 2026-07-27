package com.zennvvarroo.pealkkk;

import androidx.compose.material3.SnackbarHostState;
import androidx.core.view.MotionEventCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ZenvaroPeakApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1", f = "ZenvaroPeakApp.kt", i = {}, l = {MotionEventCompat.AXIS_GENERIC_15}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1(SnackbarHostState snackbarHostState, String str, Continuation<? super ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1(this.$snackbarHostState, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (SnackbarHostState.showSnackbar$default(this.$snackbarHostState, this.$message, null, false, null, this, 14, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
