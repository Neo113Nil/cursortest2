package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXHilt extends CatchingFishRetrofitPayPal implements Parcelable, CatchingFishMVVMRedux, CatchingFishLayoutMoshi, CatchingFishMockkManifest {
    public static final Parcelable.Creator<CatchingFishAndroidXHilt> CREATOR = new CatchingFishSnackbarPayPal(17);
    public CatchingFishOkHttpLifecycle CatchingFishDaggerWebsocket;

    public CatchingFishAndroidXHilt(long j) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
        CatchingFishOkHttpLifecycle catchingFishOkHttpLifecycle = new CatchingFishOkHttpLifecycle(CatchingFishCloudMessaging.CatchingFishViewModelScope(), j);
        if (!(CatchingFishCloudMessaging instanceof CatchingFishXMLLayoutKtor)) {
            catchingFishOkHttpLifecycle.CatchingFishSnackbar = new CatchingFishOkHttpLifecycle(1, j);
        }
        this.CatchingFishDaggerWebsocket = catchingFishOkHttpLifecycle;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishCoroutine(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB2, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB3) {
        if (((CatchingFishOkHttpLifecycle) catchingFishGraphQLMVIFAB2).CatchingFishCoroutine == ((CatchingFishOkHttpLifecycle) catchingFishGraphQLMVIFAB3).CatchingFishCoroutine) {
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
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.CatchingFishDaggerWebsocket = (CatchingFishOkHttpLifecycle) catchingFishGraphQLMVIFAB;
    }

    public final void CatchingFishViewModelScope(long j) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging;
        CatchingFishOkHttpLifecycle catchingFishOkHttpLifecycle = (CatchingFishOkHttpLifecycle) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishDaggerWebsocket);
        if (catchingFishOkHttpLifecycle.CatchingFishCoroutine != j) {
            CatchingFishOkHttpLifecycle catchingFishOkHttpLifecycle2 = this.CatchingFishDaggerWebsocket;
            synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                ((CatchingFishOkHttpLifecycle) CatchingFishIntentBundle.CatchingFishAnimationMockk(catchingFishOkHttpLifecycle2, this, CatchingFishCloudMessaging, catchingFishOkHttpLifecycle)).CatchingFishCoroutine = j;
            }
            CatchingFishIntentBundle.CatchingFishUnitTesting(CatchingFishCloudMessaging, this);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishLayoutMoshi
    public Object getValue() {
        return Long.valueOf(((CatchingFishOkHttpLifecycle) CatchingFishIntentBundle.CatchingFishJetpackCompose(this.CatchingFishDaggerWebsocket, this)).CatchingFishCoroutine);
    }

    @Override // kotlin.text.CatchingFishMockkManifest
    public void setValue(Object obj) {
        CatchingFishViewModelScope(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((CatchingFishOkHttpLifecycle) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishDaggerWebsocket)).CatchingFishCoroutine + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((CatchingFishOkHttpLifecycle) CatchingFishIntentBundle.CatchingFishJetpackCompose(this.CatchingFishDaggerWebsocket, this)).CatchingFishCoroutine);
    }
}
