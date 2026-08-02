package defpackage;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Locale;

/* loaded from: classes.dex */
public final class eft implements bio {
    public final dft a = new dft(zc4.s(8000));
    public eft b;

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        this.a.a(nb7Var);
        return -1L;
    }

    @Override // defpackage.db7
    public final void close() {
        this.a.close();
        eft eftVar = this.b;
        if (eftVar != null) {
            eftVar.close();
        }
    }

    @Override // defpackage.bio
    public final String e() {
        int h = h();
        vq1.A(h != -1);
        int i = dvt.a;
        Locale locale = Locale.US;
        return f1d.e(h, h + 1, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.h;
    }

    @Override // defpackage.bio
    public final int h() {
        DatagramSocket datagramSocket = this.a.i;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        this.a.q(t6tVar);
    }

    @Override // defpackage.bio
    public final boolean r() {
        return true;
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.a.read(bArr, i, i2);
        } catch (cft e) {
            if (e.a == 2002) {
                return -1;
            }
            throw e;
        }
    }

    @Override // defpackage.bio
    public final v6t t() {
        return null;
    }
}
