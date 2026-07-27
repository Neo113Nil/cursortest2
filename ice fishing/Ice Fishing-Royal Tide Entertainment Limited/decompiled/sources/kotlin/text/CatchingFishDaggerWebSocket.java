package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishDaggerWebSocket implements Cloneable {
    public CatchingFishDaggerHiltRedux CatchingFishDaggerWebsocket;
    public final CatchingFishMoshiMVP CatchingFishReduxKtor;
    public boolean CatchingFishViewModelScope;
    public final CatchingFishReduxBundleMVP CatchingFishWorkManager;

    public CatchingFishDaggerWebSocket(CatchingFishMoshiMVP catchingFishMoshiMVP, CatchingFishReduxBundleMVP catchingFishReduxBundleMVP) {
        this.CatchingFishReduxKtor = catchingFishMoshiMVP;
        this.CatchingFishWorkManager = catchingFishReduxBundleMVP;
    }

    public final CatchingFishLayoutRedux CatchingFishParcelableFAB() {
        ArrayList arrayList = new ArrayList();
        CatchingFishMoshiMVP catchingFishMoshiMVP = this.CatchingFishReduxKtor;
        arrayList.addAll(catchingFishMoshiMVP.CatchingFishViewModelScope);
        arrayList.add(new CatchingFishAsyncTaskJUnit(1, catchingFishMoshiMVP));
        arrayList.add(new CatchingFishAsyncTaskJUnit(0, catchingFishMoshiMVP.CatchingFishCloudMessaging));
        arrayList.add(new CatchingFishMVIWidgetBundle(0));
        arrayList.add(new CatchingFishMVIWidgetBundle(2));
        arrayList.add(new CatchingFishMVIWidgetBundle(1));
        CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux = this.CatchingFishDaggerWebsocket;
        int i = catchingFishMoshiMVP.CatchingFishParcelableFlux;
        int i2 = catchingFishMoshiMVP.CatchingFishGsonAppCompat;
        int i3 = catchingFishMoshiMVP.CatchingFishCardViewRealm;
        CatchingFishReduxBundleMVP catchingFishReduxBundleMVP = this.CatchingFishWorkManager;
        CatchingFishBiometricDagger catchingFishBiometricDagger = new CatchingFishBiometricDagger(arrayList, catchingFishDaggerHiltRedux, null, 0, catchingFishReduxBundleMVP, this, i, i2, i3);
        boolean z = false;
        try {
            try {
                CatchingFishLayoutRedux CatchingFishParcelableFAB = catchingFishBiometricDagger.CatchingFishParcelableFAB(catchingFishReduxBundleMVP);
                if (this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor()) {
                    CatchingFishEspressoDagger.CatchingFishSnackbar(CatchingFishParcelableFAB);
                    throw new IOException("Canceled");
                }
                this.CatchingFishDaggerWebsocket.CatchingFishWorkManager(null);
                return CatchingFishParcelableFAB;
            } catch (IOException e) {
                z = true;
                throw this.CatchingFishDaggerWebsocket.CatchingFishWorkManager(e);
            }
        } catch (Throwable th) {
            if (!z) {
                this.CatchingFishDaggerWebsocket.CatchingFishWorkManager(null);
            }
            throw th;
        }
    }

    public final String CatchingFishSnackbar() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor() ? "canceled " : "");
        sb.append("web socket");
        sb.append(" to ");
        sb.append(this.CatchingFishWorkManager.CatchingFishParcelableFAB.CatchingFishCloudMessaging());
        return sb.toString();
    }

    public final Object clone() {
        CatchingFishMoshiMVP catchingFishMoshiMVP = this.CatchingFishReduxKtor;
        CatchingFishDaggerWebSocket catchingFishDaggerWebSocket = new CatchingFishDaggerWebSocket(catchingFishMoshiMVP, this.CatchingFishWorkManager);
        catchingFishDaggerWebSocket.CatchingFishDaggerWebsocket = new CatchingFishDaggerHiltRedux(catchingFishMoshiMVP, catchingFishDaggerWebSocket);
        return catchingFishDaggerWebSocket;
    }
}
