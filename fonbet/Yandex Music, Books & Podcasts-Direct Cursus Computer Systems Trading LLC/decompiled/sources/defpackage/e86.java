package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes5.dex */
public final class e86 implements ru7 {
    @Override // defpackage.ru7
    public final boolean b(SSLSocket sSLSocket) {
        return d86.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.ru7
    public final y2r t(SSLSocket sSLSocket) {
        return new f86();
    }
}
