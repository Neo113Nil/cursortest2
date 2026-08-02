package androidx.paging;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes3.dex */
public final class SimpleProducerScopeImpl implements CoroutineScope, SendChannel {
    public final /* synthetic */ CoroutineScope $$delegate_0;
    public final BufferedChannel channel;

    public SimpleProducerScopeImpl(CoroutineScope coroutineScope, BufferedChannel bufferedChannel) {
        coroutineScope.getClass();
        this.$$delegate_0 = coroutineScope;
        this.channel = bufferedChannel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(Throwable th) {
        return this.channel.closeOrCancelImpl(th, false);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(Function1 function1) {
        this.channel.invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object obj) {
        return this.channel.offer(obj);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object send(Object obj, Continuation continuation) {
        return this.channel.send(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final Object mo1159trySendJP2dKIU(Object obj) {
        return this.channel.mo1159trySendJP2dKIU(obj);
    }
}
