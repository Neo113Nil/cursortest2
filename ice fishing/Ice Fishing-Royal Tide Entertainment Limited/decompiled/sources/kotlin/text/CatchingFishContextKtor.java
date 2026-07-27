package kotlin.text;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class CatchingFishContextKtor extends CatchingFishCoroutineRoom {
    public static CatchingFishContextKtor CatchingFishAnimationMockk() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new CatchingFishContextKtor();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider CatchingFishStateLiveData() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final String CatchingFishFragmentHandler(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final SSLContext CatchingFishLayout() {
        try {
            return SSLContext.getInstance("TLSv1.3", CatchingFishStateLiveData());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", CatchingFishStateLiveData());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishViewModelScope(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) CatchingFishCoroutineRoom.CatchingFishSnackbar(list).toArray(new String[0]));
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishWorkManager(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
