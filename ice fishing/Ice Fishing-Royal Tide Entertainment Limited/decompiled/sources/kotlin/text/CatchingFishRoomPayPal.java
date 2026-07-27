package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishRoomPayPal extends CatchingFishRetrofitPayPal implements Parcelable, CatchingFishMVVMRedux, CatchingFishMockkManifest, CatchingFishLayoutMoshi {
    public static final Parcelable.Creator<CatchingFishRoomPayPal> CREATOR = new CatchingFishSnackbarPayPal(15);
    public CatchingFishStateFlowMoshi CatchingFishDaggerWebsocket;

    public CatchingFishRoomPayPal(float f) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
        CatchingFishStateFlowMoshi catchingFishStateFlowMoshi = new CatchingFishStateFlowMoshi(CatchingFishCloudMessaging.CatchingFishViewModelScope(), f);
        if (!(CatchingFishCloudMessaging instanceof CatchingFishXMLLayoutKtor)) {
            catchingFishStateFlowMoshi.CatchingFishSnackbar = new CatchingFishStateFlowMoshi(1, f);
        }
        this.CatchingFishDaggerWebsocket = catchingFishStateFlowMoshi;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishCoroutine(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB2, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB3) {
        if (((CatchingFishStateFlowMoshi) catchingFishGraphQLMVIFAB2).CatchingFishCoroutine == ((CatchingFishStateFlowMoshi) catchingFishGraphQLMVIFAB3).CatchingFishCoroutine) {
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
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.CatchingFishDaggerWebsocket = (CatchingFishStateFlowMoshi) catchingFishGraphQLMVIFAB;
    }

    public final void CatchingFishViewModelScope(float f) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging;
        CatchingFishStateFlowMoshi catchingFishStateFlowMoshi = (CatchingFishStateFlowMoshi) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishDaggerWebsocket);
        if (catchingFishStateFlowMoshi.CatchingFishCoroutine == f) {
            return;
        }
        CatchingFishStateFlowMoshi catchingFishStateFlowMoshi2 = this.CatchingFishDaggerWebsocket;
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
            ((CatchingFishStateFlowMoshi) CatchingFishIntentBundle.CatchingFishAnimationMockk(catchingFishStateFlowMoshi2, this, CatchingFishCloudMessaging, catchingFishStateFlowMoshi)).CatchingFishCoroutine = f;
        }
        CatchingFishIntentBundle.CatchingFishUnitTesting(CatchingFishCloudMessaging, this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishLayoutMoshi
    public Object getValue() {
        return Float.valueOf(((CatchingFishStateFlowMoshi) CatchingFishIntentBundle.CatchingFishJetpackCompose(this.CatchingFishDaggerWebsocket, this)).CatchingFishCoroutine);
    }

    @Override // kotlin.text.CatchingFishMockkManifest
    public void setValue(Object obj) {
        CatchingFishViewModelScope(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((CatchingFishStateFlowMoshi) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishDaggerWebsocket)).CatchingFishCoroutine + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(((CatchingFishStateFlowMoshi) CatchingFishIntentBundle.CatchingFishJetpackCompose(this.CatchingFishDaggerWebsocket, this)).CatchingFishCoroutine);
    }
}
