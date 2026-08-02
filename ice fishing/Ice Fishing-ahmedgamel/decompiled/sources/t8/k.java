package t8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes2.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final i f40899a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f40900b;

    static {
        boolean z6 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z6 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f40900b = z6;
    }

    @Override // t8.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // t8.n
    public final boolean b() {
        return f40900b;
    }

    @Override // t8.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // t8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            s8.f fVar = s8.f.f40554a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) c4.e.n(protocols).toArray(new String[0]));
        }
    }
}
