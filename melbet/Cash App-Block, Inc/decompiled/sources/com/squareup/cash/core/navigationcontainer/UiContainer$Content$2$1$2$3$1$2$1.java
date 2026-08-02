package com.squareup.cash.core.navigationcontainer;

import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class UiContainer$Content$2$1$2$3$1$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $isReadyForFullDraw;
    public final /* synthetic */ NavigationModel.Ready.FullScreenLocation $location;
    public final /* synthetic */ UiContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiContainer$Content$2$1$2$3$1$2$1(boolean z, UiContainer uiContainer, NavigationModel.Ready.FullScreenLocation fullScreenLocation, Continuation continuation) {
        super(2, continuation);
        this.$isReadyForFullDraw = z;
        this.this$0 = uiContainer;
        this.$location = fullScreenLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UiContainer$Content$2$1$2$3$1$2$1(this.$isReadyForFullDraw, this.this$0, this.$location, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UiContainer$Content$2$1$2$3$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (this.$isReadyForFullDraw) {
            Iterator it = this.this$0.eventListeners.iterator();
            while (it.hasNext()) {
                ((EventListener) it.next()).appFullyDrawn(this.$location.screen);
            }
        }
        return Unit.INSTANCE;
    }
}
