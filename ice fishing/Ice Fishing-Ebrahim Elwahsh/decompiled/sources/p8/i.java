package p8;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes2.dex */
public final class i implements l {
    @Override // p8.l
    public final boolean a(SSLSocket sSLSocket) {
        return k.f39848b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p8.l
    public final n k(SSLSocket sSLSocket) {
        return new k();
    }
}
