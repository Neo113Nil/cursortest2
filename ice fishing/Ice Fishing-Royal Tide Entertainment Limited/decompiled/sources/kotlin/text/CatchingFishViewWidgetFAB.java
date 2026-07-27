package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishViewWidgetFAB extends CatchingFishRetrofitPayPal implements Parcelable, CatchingFishMVVMRedux, CatchingFishMockkManifest, CatchingFishLayoutMoshi {
    public static final Parcelable.Creator<CatchingFishViewWidgetFAB> CREATOR = new CatchingFishSnackbarPayPal(16);
    public CatchingFishViewJUnitMVP CatchingFishDaggerWebsocket;

    public CatchingFishViewWidgetFAB(int i) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
        CatchingFishViewJUnitMVP catchingFishViewJUnitMVP = new CatchingFishViewJUnitMVP(i, CatchingFishCloudMessaging.CatchingFishViewModelScope());
        if (!(CatchingFishCloudMessaging instanceof CatchingFishXMLLayoutKtor)) {
            catchingFishViewJUnitMVP.CatchingFishSnackbar = new CatchingFishViewJUnitMVP(i, 1);
        }
        this.CatchingFishDaggerWebsocket = catchingFishViewJUnitMVP;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishCoroutine(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB2, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB3) {
        if (((CatchingFishViewJUnitMVP) catchingFishGraphQLMVIFAB2).CatchingFishCoroutine == ((CatchingFishViewJUnitMVP) catchingFishGraphQLMVIFAB3).CatchingFishCoroutine) {
            return catchingFishGraphQLMVIFAB2;
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishParcelableFAB() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishMVVMRedux
    public final CatchingFishWidgetViewPager CatchingFishReduxKtor() {
        return CatchingFishGradleMVVM.CatchingFishJetpackCompose;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final void CatchingFishSnackbar(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.CatchingFishDaggerWebsocket = (CatchingFishViewJUnitMVP) catchingFishGraphQLMVIFAB;
    }

    public final void CatchingFishViewModelFAB(int i) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging;
        CatchingFishViewJUnitMVP catchingFishViewJUnitMVP = (CatchingFishViewJUnitMVP) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishDaggerWebsocket);
        if (catchingFishViewJUnitMVP.CatchingFishCoroutine != i) {
            CatchingFishViewJUnitMVP catchingFishViewJUnitMVP2 = this.CatchingFishDaggerWebsocket;
            synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                ((CatchingFishViewJUnitMVP) CatchingFishIntentBundle.CatchingFishAnimationMockk(catchingFishViewJUnitMVP2, this, CatchingFishCloudMessaging, catchingFishViewJUnitMVP)).CatchingFishCoroutine = i;
            }
            CatchingFishIntentBundle.CatchingFishUnitTesting(CatchingFishCloudMessaging, this);
        }
    }

    public final int CatchingFishViewModelScope() {
        return ((CatchingFishViewJUnitMVP) CatchingFishIntentBundle.CatchingFishJetpackCompose(this.CatchingFishDaggerWebsocket, this)).CatchingFishCoroutine;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishLayoutMoshi
    public Object getValue() {
        return Integer.valueOf(CatchingFishViewModelScope());
    }

    @Override // kotlin.text.CatchingFishMockkManifest
    public void setValue(Object obj) {
        CatchingFishViewModelFAB(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((CatchingFishViewJUnitMVP) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishDaggerWebsocket)).CatchingFishCoroutine + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(CatchingFishViewModelScope());
    }
}
