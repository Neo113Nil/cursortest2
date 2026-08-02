package com.squareup.cash.shopping.views;

import androidx.compose.material.SliderKt$Slider$2$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebContainerViewKt$Content$initializeShoppingWebBridge$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ WebAppBridge $shoppingWebBridge;
    public final /* synthetic */ SliderKt$Slider$2$2$1 $updateProgress;
    public int I$0;
    public int I$1;
    public int I$2;
    public Function1 L$1;
    public Function1 L$2;
    public ReceiveChannel L$3;
    public BufferedChannel.BufferedChannelIterator L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebContainerViewKt$Content$initializeShoppingWebBridge$1$1(WebAppBridge webAppBridge, SliderKt$Slider$2$2$1 sliderKt$Slider$2$2$1, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$shoppingWebBridge = webAppBridge;
        this.$updateProgress = sliderKt$Slider$2$2$1;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingWebContainerViewKt$Content$initializeShoppingWebBridge$1$1(this.$shoppingWebBridge, this.$updateProgress, this.$onEvent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingWebContainerViewKt$Content$initializeShoppingWebBridge$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:7:0x0052, B:9:0x005a, B:10:0x003b, B:20:0x002d), top: B:2:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004f -> B:7:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReceiveChannel webEvents;
        int i;
        BufferedChannel.BufferedChannelIterator it;
        Function1 function1;
        Function1 function12;
        int i2;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        try {
            if (i4 == 0) {
                SafeTrace.throwOnFailure(obj);
                webEvents = this.$shoppingWebBridge.getWebEvents();
                i = 0;
                it = webEvents.iterator();
                function1 = this.$updateProgress;
                function12 = this.$onEvent;
                i2 = 0;
                i3 = 0;
                this.L$1 = function1;
                this.L$2 = function12;
                this.L$3 = webEvents;
                this.L$5 = it;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$2;
                i2 = this.I$1;
                i3 = this.I$0;
                it = this.L$5;
                webEvents = this.L$3;
                function12 = this.L$2;
                function1 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    ShoppingWebContainerViewKt.access$Content$handleWebEvents(function12, (ShoppingWebBridgeEvent) it.next(), function1);
                    this.L$1 = function1;
                    this.L$2 = function12;
                    this.L$3 = webEvents;
                    this.L$5 = it;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        webEvents.cancel(null);
                        return Unit.INSTANCE;
                    }
                }
            }
        } finally {
        }
    }
}
