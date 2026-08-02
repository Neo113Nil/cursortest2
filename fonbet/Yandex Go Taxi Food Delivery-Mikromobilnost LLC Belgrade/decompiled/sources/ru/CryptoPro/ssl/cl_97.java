package ru.CryptoPro.ssl;

import java.security.PrivilegedAction;
import javax.net.ssl.HandshakeCompletedListener;

/* loaded from: classes4.dex */
class cl_97 implements PrivilegedAction {
    public final /* synthetic */ HandshakeCompletedListener a;
    public final /* synthetic */ cl_96 b;

    public cl_97(cl_96 cl_96Var, HandshakeCompletedListener handshakeCompletedListener) {
        this.b = cl_96Var;
        this.a = handshakeCompletedListener;
    }

    @Override // java.security.PrivilegedAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void run() {
        this.a.handshakeCompleted(this.b.b);
        return null;
    }
}
