package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes5.dex */
public final class f86 implements y2r {
    public static final e86 a = new e86();

    @Override // defpackage.y2r
    public final boolean a() {
        boolean z = d86.d;
        return d86.d;
    }

    @Override // defpackage.y2r
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.y2r
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.y2r
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            otk otkVar = otk.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) itk.b(list).toArray(new String[0]));
        }
    }
}
