package app.cash.zipline;

import app.cash.zipline.internal.bridge.CallChannel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class Zipline$endpoint$1 implements CallChannel {
    public final Lazy jsInboundBridge$delegate;
    public final /* synthetic */ Zipline this$0;

    public Zipline$endpoint$1(Zipline zipline) {
        this.this$0 = zipline;
        this.jsInboundBridge$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Zipline$$ExternalSyntheticLambda0(zipline, 1));
    }

    @Override // app.cash.zipline.internal.bridge.CallChannel
    public final String call(String str) {
        str.getClass();
        if (JobKt.isActive(this.this$0.scope)) {
            return ((CallChannel) this.jsInboundBridge$delegate.getValue()).call(str);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Zipline closed");
        return null;
    }

    @Override // app.cash.zipline.internal.bridge.CallChannel
    public final boolean disconnect(String str) {
        str.getClass();
        return ((CallChannel) this.jsInboundBridge$delegate.getValue()).disconnect(str);
    }
}
