package ru.cprocsp.NGate.tls;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import ru.cprocsp.NGate.tls.SecureTLSContext;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements HandshakeCompletedListener {
    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
        SecureTLSContext.AnonymousClass1.lambda$parametrize$0(handshakeCompletedEvent);
    }
}
