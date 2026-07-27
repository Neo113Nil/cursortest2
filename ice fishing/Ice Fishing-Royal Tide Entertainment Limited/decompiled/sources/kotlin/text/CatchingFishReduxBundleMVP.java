package kotlin.text;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishReduxBundleMVP {
    public final CatchingFishKtorStripeAPI CatchingFishCoroutine;
    public volatile CatchingFishToastToolbar CatchingFishDaggerWebsocket;
    public final CatchingFishBundleView CatchingFishParcelableFAB;
    public final Map CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishReduxBundleMVP(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        this.CatchingFishParcelableFAB = (CatchingFishBundleView) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        this.CatchingFishSnackbar = (String) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) catchingFishFluxFluxBundle.CatchingFishWorkManager;
        catchingFishViewPagerMockk.getClass();
        this.CatchingFishCoroutine = new CatchingFishKtorStripeAPI(catchingFishViewPagerMockk);
        Map map = (Map) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        this.CatchingFishReduxKtor = map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final CatchingFishFluxFluxBundle CatchingFishParcelableFAB() {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
        Object obj = Collections.EMPTY_MAP;
        catchingFishFluxFluxBundle.CatchingFishViewModelScope = obj;
        catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = this.CatchingFishParcelableFAB;
        catchingFishFluxFluxBundle.CatchingFishReduxKtor = this.CatchingFishSnackbar;
        Map map = this.CatchingFishReduxKtor;
        if (!map.isEmpty()) {
            obj = new LinkedHashMap(map);
        }
        catchingFishFluxFluxBundle.CatchingFishViewModelScope = obj;
        catchingFishFluxFluxBundle.CatchingFishWorkManager = this.CatchingFishCoroutine.CatchingFishDaggerWebsocket();
        return catchingFishFluxFluxBundle;
    }

    public final String toString() {
        return "Request{method=" + this.CatchingFishSnackbar + ", url=" + this.CatchingFishParcelableFAB + ", tags=" + this.CatchingFishReduxKtor + '}';
    }
}
