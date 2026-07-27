package kotlin.text;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishContextPicasso implements CatchingFishJUnitBiometric {
    public final Parcelable CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishContextPicasso(CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI, Bundle bundle) {
        this.CatchingFishReduxKtor = catchingFishGlideAdMobMVI;
        this.CatchingFishDaggerWebsocket = bundle;
    }

    @Override // kotlin.text.CatchingFishJUnitBiometric
    public Object CatchingFishFragmentHandler(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI = (CatchingFishGlideAdMobMVI) this.CatchingFishReduxKtor;
        Bundle bundle = (Bundle) this.CatchingFishDaggerWebsocket;
        catchingFishGlideAdMobMVI.getClass();
        if (!catchingFishWorkManagerMVP.CatchingFishViewModelFAB()) {
            return catchingFishWorkManagerMVP;
        }
        Bundle bundle2 = (Bundle) catchingFishWorkManagerMVP.CatchingFishWorkManager();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? catchingFishWorkManagerMVP : catchingFishGlideAdMobMVI.CatchingFishParcelableFAB(bundle).CatchingFishLayout(CatchingFishToastGraphQLMVP.CatchingFishWorkManager, CatchingFishGradleMVVM.CatchingFishDaggerHiltFAB);
    }

    public CatchingFishContextPicasso(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.CatchingFishReduxKtor = new Messenger(iBinder);
            this.CatchingFishDaggerWebsocket = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.CatchingFishDaggerWebsocket = new CatchingFishDaggerGraphQL(iBinder);
            this.CatchingFishReduxKtor = null;
        }
    }
}
