package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "()V", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "", "<set-?>", "", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/MutableState;", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieRetrySignal {
    public static final int $stable = 0;
    private final Channel channel = PapaEvent.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4);

    /* renamed from: isAwaitingRetry$delegate, reason: from kotlin metadata */
    private final MutableState isAwaitingRetry = Updater.mutableStateOf$default(Boolean.FALSE);

    private final void setAwaitingRetry(boolean z) {
        this.isAwaitingRetry.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitRetry(Continuation<? super Unit> continuation) {
        LottieRetrySignal$awaitRetry$1 lottieRetrySignal$awaitRetry$1;
        int i;
        ?? r5;
        try {
            if (continuation instanceof LottieRetrySignal$awaitRetry$1) {
                lottieRetrySignal$awaitRetry$1 = (LottieRetrySignal$awaitRetry$1) continuation;
                int i2 = lottieRetrySignal$awaitRetry$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    lottieRetrySignal$awaitRetry$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = lottieRetrySignal$awaitRetry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieRetrySignal$awaitRetry$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        setAwaitingRetry(true);
                        Channel channel = this.channel;
                        lottieRetrySignal$awaitRetry$1.L$0 = this;
                        lottieRetrySignal$awaitRetry$1.label = 1;
                        this = this;
                        if (channel.receive(lottieRetrySignal$awaitRetry$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        LottieRetrySignal lottieRetrySignal = (LottieRetrySignal) lottieRetrySignal$awaitRetry$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        r5 = lottieRetrySignal;
                    }
                    r5.setAwaitingRetry(false);
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i != 0) {
            }
            r5.setAwaitingRetry(false);
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.setAwaitingRetry(false);
            throw th;
        }
        lottieRetrySignal$awaitRetry$1 = new LottieRetrySignal$awaitRetry$1(this, continuation);
        Object obj2 = lottieRetrySignal$awaitRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieRetrySignal$awaitRetry$1.label;
    }

    public final boolean isAwaitingRetry() {
        return ((Boolean) this.isAwaitingRetry.getValue()).booleanValue();
    }

    public final void retry() {
        ChannelsKt__ChannelsKt.trySendBlocking(Unit.INSTANCE, this.channel);
    }
}
