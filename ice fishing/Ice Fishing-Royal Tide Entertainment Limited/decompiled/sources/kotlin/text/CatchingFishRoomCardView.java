package kotlin.text;

import com.adjust.sdk.Constants;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class CatchingFishRoomCardView {
    public final SocketFactory CatchingFishCoroutine;
    public final List CatchingFishDaggerWebsocket;
    public final CatchingFishCameraXHilt CatchingFishFragmentHandler;
    public final HostnameVerifier CatchingFishLayout;
    public final CatchingFishBundleView CatchingFishParcelableFAB;
    public final CatchingFishLayoutLayout CatchingFishReduxKtor;
    public final CatchingFishLayoutLayout CatchingFishSnackbar;
    public final SSLSocketFactory CatchingFishViewModelFAB;
    public final ProxySelector CatchingFishViewModelScope;
    public final List CatchingFishWorkManager;

    public CatchingFishRoomCardView(String str, int i, CatchingFishLayoutLayout catchingFishLayoutLayout, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CatchingFishCameraXHilt catchingFishCameraXHilt, CatchingFishLayoutLayout catchingFishLayoutLayout2, List list, List list2, ProxySelector proxySelector) {
        CatchingFishViewHilt catchingFishViewHilt = new CatchingFishViewHilt(0);
        String str2 = sSLSocketFactory != null ? Constants.SCHEME : "http";
        if (str2.equalsIgnoreCase("http")) {
            catchingFishViewHilt.CatchingFishCoroutine = "http";
        } else {
            if (!str2.equalsIgnoreCase(Constants.SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            catchingFishViewHilt.CatchingFishCoroutine = Constants.SCHEME;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String CatchingFishParcelableFAB = CatchingFishEspressoDagger.CatchingFishParcelableFAB(CatchingFishBundleView.CatchingFishViewModelScope(str, 0, str.length(), false));
        if (CatchingFishParcelableFAB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        catchingFishViewHilt.CatchingFishWorkManager = CatchingFishParcelableFAB;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("unexpected port: ", i));
        }
        catchingFishViewHilt.CatchingFishSnackbar = i;
        this.CatchingFishParcelableFAB = catchingFishViewHilt.CatchingFishSnackbar();
        if (catchingFishLayoutLayout == null) {
            throw new NullPointerException("dns == null");
        }
        this.CatchingFishSnackbar = catchingFishLayoutLayout;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.CatchingFishCoroutine = socketFactory;
        if (catchingFishLayoutLayout2 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.CatchingFishReduxKtor = catchingFishLayoutLayout2;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.CatchingFishDaggerWebsocket = Collections.unmodifiableList(new ArrayList(list));
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.CatchingFishWorkManager = Collections.unmodifiableList(new ArrayList(list2));
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.CatchingFishViewModelScope = proxySelector;
        this.CatchingFishViewModelFAB = sSLSocketFactory;
        this.CatchingFishLayout = hostnameVerifier;
        this.CatchingFishFragmentHandler = catchingFishCameraXHilt;
    }

    public final boolean CatchingFishParcelableFAB(CatchingFishRoomCardView catchingFishRoomCardView) {
        return this.CatchingFishSnackbar.equals(catchingFishRoomCardView.CatchingFishSnackbar) && this.CatchingFishReduxKtor.equals(catchingFishRoomCardView.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket.equals(catchingFishRoomCardView.CatchingFishDaggerWebsocket) && this.CatchingFishWorkManager.equals(catchingFishRoomCardView.CatchingFishWorkManager) && this.CatchingFishViewModelScope.equals(catchingFishRoomCardView.CatchingFishViewModelScope) && Objects.equals(this.CatchingFishViewModelFAB, catchingFishRoomCardView.CatchingFishViewModelFAB) && Objects.equals(this.CatchingFishLayout, catchingFishRoomCardView.CatchingFishLayout) && Objects.equals(this.CatchingFishFragmentHandler, catchingFishRoomCardView.CatchingFishFragmentHandler) && this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket == catchingFishRoomCardView.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishRoomCardView)) {
            return false;
        }
        CatchingFishRoomCardView catchingFishRoomCardView = (CatchingFishRoomCardView) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishRoomCardView.CatchingFishParcelableFAB) && CatchingFishParcelableFAB(catchingFishRoomCardView);
    }

    public final int hashCode() {
        return Objects.hashCode(this.CatchingFishFragmentHandler) + ((Objects.hashCode(this.CatchingFishLayout) + ((Objects.hashCode(this.CatchingFishViewModelFAB) + ((this.CatchingFishViewModelScope.hashCode() + ((this.CatchingFishWorkManager.hashCode() + ((this.CatchingFishDaggerWebsocket.hashCode() + ((this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishSnackbar.hashCode() + ((this.CatchingFishParcelableFAB.CatchingFishViewModelFAB.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        CatchingFishBundleView catchingFishBundleView = this.CatchingFishParcelableFAB;
        sb.append(catchingFishBundleView.CatchingFishReduxKtor);
        sb.append(":");
        sb.append(catchingFishBundleView.CatchingFishDaggerWebsocket);
        sb.append(", proxySelector=");
        sb.append(this.CatchingFishViewModelScope);
        sb.append("}");
        return sb.toString();
    }
}
