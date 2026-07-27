package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskIntent extends CatchingFishRetrofitPayPal implements Parcelable, CatchingFishMVVMRedux {
    public static final Parcelable.Creator<CatchingFishAsyncTaskIntent> CREATOR = new CatchingFishReduxHilt(0);
    public final CatchingFishWidgetViewPager CatchingFishDaggerWebsocket;
    public CatchingFishBundleExoPlayer CatchingFishWorkManager;

    public CatchingFishAsyncTaskIntent(Object obj, CatchingFishWidgetViewPager catchingFishWidgetViewPager) {
        this.CatchingFishDaggerWebsocket = catchingFishWidgetViewPager;
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
        CatchingFishBundleExoPlayer catchingFishBundleExoPlayer = new CatchingFishBundleExoPlayer(CatchingFishCloudMessaging.CatchingFishViewModelScope(), obj);
        if (!(CatchingFishCloudMessaging instanceof CatchingFishXMLLayoutKtor)) {
            catchingFishBundleExoPlayer.CatchingFishSnackbar = new CatchingFishBundleExoPlayer(1, obj);
        }
        this.CatchingFishWorkManager = catchingFishBundleExoPlayer;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishCoroutine(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB2, CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB3) {
        if (this.CatchingFishDaggerWebsocket.CatchingFishSnackbar(((CatchingFishBundleExoPlayer) catchingFishGraphQLMVIFAB2).CatchingFishCoroutine, ((CatchingFishBundleExoPlayer) catchingFishGraphQLMVIFAB3).CatchingFishCoroutine)) {
            return catchingFishGraphQLMVIFAB2;
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishMVVMRedux
    public final CatchingFishWidgetViewPager CatchingFishReduxKtor() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final void CatchingFishSnackbar(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.CatchingFishWorkManager = (CatchingFishBundleExoPlayer) catchingFishGraphQLMVIFAB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishLayoutMoshi
    public final Object getValue() {
        return ((CatchingFishBundleExoPlayer) CatchingFishIntentBundle.CatchingFishJetpackCompose(this.CatchingFishWorkManager, this)).CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishMockkManifest
    public final void setValue(Object obj) {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging;
        CatchingFishBundleExoPlayer catchingFishBundleExoPlayer = (CatchingFishBundleExoPlayer) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishWorkManager);
        if (this.CatchingFishDaggerWebsocket.CatchingFishSnackbar(catchingFishBundleExoPlayer.CatchingFishCoroutine, obj)) {
            return;
        }
        CatchingFishBundleExoPlayer catchingFishBundleExoPlayer2 = this.CatchingFishWorkManager;
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
            ((CatchingFishBundleExoPlayer) CatchingFishIntentBundle.CatchingFishAnimationMockk(catchingFishBundleExoPlayer2, this, CatchingFishCloudMessaging, catchingFishBundleExoPlayer)).CatchingFishCoroutine = obj;
        }
        CatchingFishIntentBundle.CatchingFishUnitTesting(CatchingFishCloudMessaging, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((CatchingFishBundleExoPlayer) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishWorkManager)).CatchingFishCoroutine + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = CatchingFishMVPExoPlayer.CatchingFishFragmentHandler;
        CatchingFishWidgetViewPager catchingFishWidgetViewPager = this.CatchingFishDaggerWebsocket;
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishWidgetViewPager, catchingFishMVPExoPlayer)) {
            i2 = 0;
        } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishWidgetViewPager, CatchingFishGradleMVVM.CatchingFishJetpackCompose)) {
            i2 = 1;
        } else {
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishWidgetViewPager, CatchingFishMVPExoPlayer.CatchingFishCloudMessaging)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
