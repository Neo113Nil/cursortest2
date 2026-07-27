package kotlin.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class CatchingFishMVIAsyncTask extends CatchingFishCoroutineRoom {
    public final Method CatchingFishCoroutine;
    public final Method CatchingFishDaggerWebsocket;
    public final Method CatchingFishReduxKtor;
    public final Class CatchingFishViewModelScope;
    public final Class CatchingFishWorkManager;

    public CatchingFishMVIAsyncTask(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.CatchingFishCoroutine = method;
        this.CatchingFishReduxKtor = method2;
        this.CatchingFishDaggerWebsocket = method3;
        this.CatchingFishWorkManager = cls;
        this.CatchingFishViewModelScope = cls2;
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final String CatchingFishFragmentHandler(SSLSocket sSLSocket) {
        try {
            CatchingFishViewJUnit catchingFishViewJUnit = (CatchingFishViewJUnit) Proxy.getInvocationHandler(this.CatchingFishReduxKtor.invoke(null, sSLSocket));
            boolean z = catchingFishViewJUnit.CatchingFishSnackbar;
            if (!z && catchingFishViewJUnit.CatchingFishCoroutine == null) {
                CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishOkHttp(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return catchingFishViewJUnit.CatchingFishCoroutine;
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishParcelableFAB(SSLSocket sSLSocket) {
        try {
            this.CatchingFishDaggerWebsocket.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishViewModelScope(SSLSocket sSLSocket, String str, List list) {
        try {
            this.CatchingFishCoroutine.invoke(null, sSLSocket, Proxy.newProxyInstance(CatchingFishCoroutineRoom.class.getClassLoader(), new Class[]{this.CatchingFishWorkManager, this.CatchingFishViewModelScope}, new CatchingFishViewJUnit(CatchingFishCoroutineRoom.CatchingFishSnackbar(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }
}
