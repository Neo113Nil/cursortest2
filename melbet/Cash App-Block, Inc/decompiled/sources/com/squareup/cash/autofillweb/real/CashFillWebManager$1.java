package com.squareup.cash.autofillweb.real;

import androidx.media3.common.util.StuckPlayerDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.json.JSONException;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class CashFillWebManager$1 extends SuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public int I$2;
    public ReceiveChannel L$1;
    public BufferedChannel.BufferedChannelIterator L$3;
    public int label;
    public final /* synthetic */ StuckPlayerDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashFillWebManager$1(StuckPlayerDetector stuckPlayerDetector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stuckPlayerDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CashFillWebManager$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CashFillWebManager$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #2 {all -> 0x0018, blocks: (B:6:0x0014, B:7:0x004a, B:9:0x0052, B:11:0x006e, B:13:0x0037, B:17:0x0083, B:19:0x0089, B:26:0x002b), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0047 -> B:7:0x004a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        int i2;
        int i3;
        BufferedChannel bufferedChannel;
        BufferedChannel bufferedChannel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        try {
            if (i4 == 0) {
                SafeTrace.throwOnFailure(obj);
                BufferedChannel bufferedChannel3 = (BufferedChannel) this.this$0.stuckSuppressedDetector;
                bufferedChannel3.getClass();
                i = 0;
                bufferedChannelIterator = bufferedChannel3.new BufferedChannelIterator();
                i2 = 0;
                i3 = 0;
                bufferedChannel = bufferedChannel3;
                this.L$1 = bufferedChannel;
                this.L$3 = bufferedChannelIterator;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 1;
                obj = bufferedChannelIterator.hasNext(this);
                bufferedChannel2 = bufferedChannel;
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
                bufferedChannelIterator = this.L$3;
                ?? r7 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                bufferedChannel2 = r7;
                if (((Boolean) obj).booleanValue()) {
                    CashFillJsonEvents cashFillJsonEvents = (CashFillJsonEvents) bufferedChannelIterator.next();
                    System.out.println((Object) ("CashFill have event " + cashFillJsonEvents));
                    try {
                    } catch (JSONException unused) {
                        System.out.println((Object) "Error parsing cash fill event");
                        bufferedChannel = bufferedChannel2;
                    }
                    String string2 = new JSONObject(cashFillJsonEvents.data).getString("type");
                    bufferedChannel = bufferedChannel2;
                    if (!Intrinsics.areEqual(string2, "CASH_FILL_NOTIFIER")) {
                        Intrinsics.areEqual(string2, "CASH_FILL_DETECTED_MAPPINGS");
                        bufferedChannel = bufferedChannel2;
                    }
                    this.L$1 = bufferedChannel;
                    this.L$3 = bufferedChannelIterator;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 1;
                    obj = bufferedChannelIterator.hasNext(this);
                    bufferedChannel2 = bufferedChannel;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        bufferedChannel2.cancel(null);
                        return Unit.INSTANCE;
                    }
                }
            }
        } finally {
        }
    }
}
