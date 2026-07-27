package kotlin.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class CatchingFishHiltOkHttpGlide extends CatchingFishCoroutineRoom {
    public final Method CatchingFishCoroutine;
    public final Method CatchingFishReduxKtor;

    public CatchingFishHiltOkHttpGlide(Method method, Method method2) {
        this.CatchingFishCoroutine = method;
        this.CatchingFishReduxKtor = method2;
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final String CatchingFishFragmentHandler(SSLSocket sSLSocket) {
        try {
            String str = (String) this.CatchingFishReduxKtor.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw new AssertionError("failed to get ALPN selected protocol", e2);
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishViewModelScope(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList CatchingFishSnackbar = CatchingFishCoroutineRoom.CatchingFishSnackbar(list);
            this.CatchingFishCoroutine.invoke(sSLParameters, CatchingFishSnackbar.toArray(new String[CatchingFishSnackbar.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }
}
