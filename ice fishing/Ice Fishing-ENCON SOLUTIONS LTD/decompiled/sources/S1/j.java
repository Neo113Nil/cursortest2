package S1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // S1.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = R1.h.f1751d;
        return R1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // S1.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
