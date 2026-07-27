package kotlin.text;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class CatchingFishMVPGsonRealm extends CatchingFishAnimationGlide {
    @Override // kotlin.text.CatchingFishAnimationGlide, kotlin.text.CatchingFishCoroutineRoom
    public final String CatchingFishFragmentHandler(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // kotlin.text.CatchingFishAnimationGlide, kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishViewModelScope(SSLSocket sSLSocket, String str, List list) {
        boolean isSupportedSocket;
        try {
            isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
            if (isSupportedSocket) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) CatchingFishCoroutineRoom.CatchingFishSnackbar(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
