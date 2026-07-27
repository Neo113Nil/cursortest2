package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishDatabindingFlux implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishDatabindingFlux(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public static CatchingFishViewPagerIntent CatchingFishParcelableFAB(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = CatchingFishDatabindingFlux.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new CatchingFishViewPagerIntent();
        }
        CatchingFishMVPMoshi CatchingFishWorkManager = CatchingFishFluxMoshiBundle.CatchingFishDaggerWebsocket.CatchingFishWorkManager();
        for (int i = 0; i < readInt; i++) {
            CatchingFishWorkManager.add(parcel.readValue(classLoader));
        }
        return new CatchingFishViewPagerIntent(CatchingFishWorkManager.CatchingFishCoroutine());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishParcelableFAB(parcel, classLoader);
            case 1:
                return new CatchingFishHiltLayout(parcel, classLoader);
            case 2:
                return new CatchingFishPayPalRetrofit(parcel, classLoader);
            case 3:
                return new CatchingFishRoomDataStore(parcel, classLoader);
            default:
                return new CatchingFishToastNavigation(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishViewPagerIntent[i];
            case 1:
                return new CatchingFishHiltLayout[i];
            case 2:
                return new CatchingFishPayPalRetrofit[i];
            case 3:
                return new CatchingFishRoomDataStore[i];
            default:
                return new CatchingFishToastNavigation[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishParcelableFAB(parcel, null);
            case 1:
                return new CatchingFishHiltLayout(parcel, null);
            case 2:
                return new CatchingFishPayPalRetrofit(parcel, null);
            case 3:
                return new CatchingFishRoomDataStore(parcel, null);
            default:
                return new CatchingFishToastNavigation(parcel, null);
        }
    }
}
