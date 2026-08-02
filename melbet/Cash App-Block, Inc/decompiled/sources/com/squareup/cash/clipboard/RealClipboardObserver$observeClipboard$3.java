package com.squareup.cash.clipboard;

import android.content.ClipboardManager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealClipboardObserver$observeClipboard$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealClipboardObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealClipboardObserver$observeClipboard$3(RealClipboardObserver realClipboardObserver, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realClipboardObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealClipboardObserver realClipboardObserver = this.this$0;
        switch (i) {
            case 0:
                RealClipboardObserver$observeClipboard$3 realClipboardObserver$observeClipboard$3 = new RealClipboardObserver$observeClipboard$3(realClipboardObserver, continuation, 0);
                realClipboardObserver$observeClipboard$3.L$0 = obj;
                return realClipboardObserver$observeClipboard$3;
            default:
                RealClipboardObserver$observeClipboard$3 realClipboardObserver$observeClipboard$32 = new RealClipboardObserver$observeClipboard$3(realClipboardObserver, continuation, 1);
                realClipboardObserver$observeClipboard$32.L$0 = obj;
                return realClipboardObserver$observeClipboard$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealClipboardObserver$observeClipboard$3) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealClipboardObserver$observeClipboard$3) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final RealClipboardObserver realClipboardObserver = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List currentClipboardItems = realClipboardObserver.currentClipboardItems();
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(currentClipboardItems, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: com.squareup.cash.clipboard.RealClipboardObserver$clipboardManagerChanges$1$$ExternalSyntheticLambda0
                        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                        public final void onPrimaryClipChanged() {
                            ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(RealClipboardObserver.this.currentClipboardItems());
                        }
                    };
                    realClipboardObserver.clipboard.clipboard.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
                    ArcadeModal2Kt$$ExternalSyntheticLambda2 arcadeModal2Kt$$ExternalSyntheticLambda2 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(6, realClipboardObserver, onPrimaryClipChangedListener);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, arcadeModal2Kt$$ExternalSyntheticLambda2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
