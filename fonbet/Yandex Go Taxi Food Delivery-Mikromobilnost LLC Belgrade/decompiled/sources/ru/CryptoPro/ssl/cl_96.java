package ru.CryptoPro.ssl;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

/* loaded from: classes4.dex */
class cl_96 extends Thread {
    public HashSet a;
    public HandshakeCompletedEvent b;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HandshakeCompletedListener handshakeCompletedListener = (HandshakeCompletedListener) entry.getKey();
            AccessController.doPrivileged(new cl_97(this, handshakeCompletedListener), (AccessControlContext) entry.getValue());
        }
    }
}
