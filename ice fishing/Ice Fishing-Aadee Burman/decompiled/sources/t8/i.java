package t8;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes2.dex */
public final class i implements l {
    @Override // t8.l
    public final boolean a(SSLSocket sSLSocket) {
        return k.f40935b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // t8.l
    public final n l(SSLSocket sSLSocket) {
        return new k();
    }
}
