package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishAnimationLayout extends CatchingFishPicassoMockk implements Iterator {
    public CatchingFishPayPalGraphQL CatchingFishDaggerWebsocket;
    public CatchingFishPayPalGraphQL CatchingFishReduxKtor;
    public final /* synthetic */ int CatchingFishWorkManager;

    public CatchingFishAnimationLayout(CatchingFishPayPalGraphQL catchingFishPayPalGraphQL, CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2, int i) {
        this.CatchingFishWorkManager = i;
        this.CatchingFishReduxKtor = catchingFishPayPalGraphQL2;
        this.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL;
    }

    @Override // kotlin.text.CatchingFishPicassoMockk
    public final void CatchingFishParcelableFAB(CatchingFishPayPalGraphQL catchingFishPayPalGraphQL) {
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2;
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL3 = null;
        if (this.CatchingFishReduxKtor == catchingFishPayPalGraphQL && catchingFishPayPalGraphQL == this.CatchingFishDaggerWebsocket) {
            this.CatchingFishDaggerWebsocket = null;
            this.CatchingFishReduxKtor = null;
        }
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL4 = this.CatchingFishReduxKtor;
        if (catchingFishPayPalGraphQL4 == catchingFishPayPalGraphQL) {
            switch (this.CatchingFishWorkManager) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    catchingFishPayPalGraphQL2 = catchingFishPayPalGraphQL4.CatchingFishViewModelScope;
                    break;
                default:
                    catchingFishPayPalGraphQL2 = catchingFishPayPalGraphQL4.CatchingFishWorkManager;
                    break;
            }
            this.CatchingFishReduxKtor = catchingFishPayPalGraphQL2;
        }
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL5 = this.CatchingFishDaggerWebsocket;
        if (catchingFishPayPalGraphQL5 == catchingFishPayPalGraphQL) {
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL6 = this.CatchingFishReduxKtor;
            if (catchingFishPayPalGraphQL5 != catchingFishPayPalGraphQL6 && catchingFishPayPalGraphQL6 != null) {
                catchingFishPayPalGraphQL3 = CatchingFishSnackbar(catchingFishPayPalGraphQL5);
            }
            this.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL3;
        }
    }

    public final CatchingFishPayPalGraphQL CatchingFishSnackbar(CatchingFishPayPalGraphQL catchingFishPayPalGraphQL) {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return catchingFishPayPalGraphQL.CatchingFishWorkManager;
            default:
                return catchingFishPayPalGraphQL.CatchingFishViewModelScope;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishDaggerWebsocket != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = this.CatchingFishDaggerWebsocket;
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2 = this.CatchingFishReduxKtor;
        this.CatchingFishDaggerWebsocket = (catchingFishPayPalGraphQL == catchingFishPayPalGraphQL2 || catchingFishPayPalGraphQL2 == null) ? null : CatchingFishSnackbar(catchingFishPayPalGraphQL);
        return catchingFishPayPalGraphQL;
    }
}
