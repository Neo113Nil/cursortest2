package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishReduxHilt implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishReduxHilt(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public static CatchingFishAsyncTaskIntent CatchingFishParcelableFAB(Parcel parcel, ClassLoader classLoader) {
        CatchingFishWidgetViewPager catchingFishWidgetViewPager;
        if (classLoader == null) {
            classLoader = CatchingFishReduxHilt.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            catchingFishWidgetViewPager = CatchingFishMVPExoPlayer.CatchingFishFragmentHandler;
        } else if (readInt == 1) {
            catchingFishWidgetViewPager = CatchingFishGradleMVVM.CatchingFishJetpackCompose;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            catchingFishWidgetViewPager = CatchingFishMVPExoPlayer.CatchingFishCloudMessaging;
        }
        return new CatchingFishAsyncTaskIntent(readValue, catchingFishWidgetViewPager);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishParcelableFAB(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return CatchingFishDaggerHilt.CatchingFishDaggerWebsocket;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new CatchingFishGraphQLView(parcel, classLoader);
            case 3:
                return new CatchingFishKtorToast(parcel, classLoader);
            case 4:
                return new CatchingFishLayoutManifest(parcel, classLoader);
            default:
                return new CatchingFishMVPMockkLayout(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishAsyncTaskIntent[i];
            case 1:
                return new CatchingFishDaggerHilt[i];
            case 2:
                return new CatchingFishGraphQLView[i];
            case 3:
                return new CatchingFishKtorToast[i];
            case 4:
                return new CatchingFishLayoutManifest[i];
            default:
                return new CatchingFishMVPMockkLayout[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishParcelableFAB(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return CatchingFishDaggerHilt.CatchingFishDaggerWebsocket;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new CatchingFishGraphQLView(parcel, null);
            case 3:
                return new CatchingFishKtorToast(parcel, null);
            case 4:
                return new CatchingFishLayoutManifest(parcel, null);
            default:
                return new CatchingFishMVPMockkLayout(parcel, null);
        }
    }
}
