package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishFABFABGradle extends CatchingFishHiltRetrofit implements Iterator, CatchingFishCardViewFAB {
    public final /* synthetic */ int CatchingFishViewModelFAB;

    public CatchingFishFABFABGradle(CatchingFishToastView catchingFishToastView, int i) {
        this.CatchingFishViewModelFAB = i;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToastView, "map");
        this.CatchingFishViewModelScope = catchingFishToastView;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = catchingFishToastView.CatchingFishCloudMessaging;
        CatchingFishDaggerWebsocket();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSnackbar();
                int i = this.CatchingFishReduxKtor;
                CatchingFishToastView catchingFishToastView = (CatchingFishToastView) this.CatchingFishViewModelScope;
                if (i >= catchingFishToastView.CatchingFishLayout) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishReduxKtor = i + 1;
                this.CatchingFishDaggerWebsocket = i;
                CatchingFishBundleGraphQL catchingFishBundleGraphQL = new CatchingFishBundleGraphQL(catchingFishToastView, i);
                CatchingFishDaggerWebsocket();
                return catchingFishBundleGraphQL;
            case 1:
                CatchingFishSnackbar();
                int i2 = this.CatchingFishReduxKtor;
                CatchingFishToastView catchingFishToastView2 = (CatchingFishToastView) this.CatchingFishViewModelScope;
                if (i2 >= catchingFishToastView2.CatchingFishLayout) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishReduxKtor = i2 + 1;
                this.CatchingFishDaggerWebsocket = i2;
                Object obj = catchingFishToastView2.CatchingFishReduxKtor[i2];
                CatchingFishDaggerWebsocket();
                return obj;
            default:
                CatchingFishSnackbar();
                int i3 = this.CatchingFishReduxKtor;
                CatchingFishToastView catchingFishToastView3 = (CatchingFishToastView) this.CatchingFishViewModelScope;
                if (i3 >= catchingFishToastView3.CatchingFishLayout) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishReduxKtor = i3 + 1;
                this.CatchingFishDaggerWebsocket = i3;
                Object[] objArr = catchingFishToastView3.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
                Object obj2 = objArr[this.CatchingFishDaggerWebsocket];
                CatchingFishDaggerWebsocket();
                return obj2;
        }
    }
}
