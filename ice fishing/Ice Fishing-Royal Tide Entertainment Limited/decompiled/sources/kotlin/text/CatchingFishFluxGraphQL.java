package kotlin.text;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishFluxGraphQL {
    public boolean CatchingFishCoroutine;
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final Object CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public CatchingFishFluxGraphQL(Context context) {
        this.CatchingFishParcelableFAB = 1;
        this.CatchingFishReduxKtor = context;
        this.CatchingFishCoroutine = true;
    }

    public void CatchingFishParcelableFAB(int i) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.CatchingFishDaggerWebsocket;
                WeakReference weakReference = bottomSheetBehavior.CatchingFishJUnitRealm;
                if (weakReference != null && weakReference.get() != null) {
                    this.CatchingFishSnackbar = i;
                    if (!this.CatchingFishCoroutine) {
                        ((View) bottomSheetBehavior.CatchingFishJUnitRealm.get()).postOnAnimation((CatchingFishGsonRealm) this.CatchingFishReduxKtor);
                        this.CatchingFishCoroutine = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishDaggerWebsocket;
                WeakReference weakReference2 = sideSheetBehavior.CatchingFishStateLiveData;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.CatchingFishSnackbar = i;
                    if (!this.CatchingFishCoroutine) {
                        ((View) sideSheetBehavior.CatchingFishStateLiveData.get()).postOnAnimation((CatchingFishMVPLayout) this.CatchingFishReduxKtor);
                        this.CatchingFishCoroutine = true;
                        break;
                    }
                }
                break;
        }
    }

    public CatchingFishFluxGraphQL(SideSheetBehavior sideSheetBehavior) {
        this.CatchingFishParcelableFAB = 2;
        this.CatchingFishDaggerWebsocket = sideSheetBehavior;
        this.CatchingFishReduxKtor = new CatchingFishMVPLayout(20, this);
    }

    public CatchingFishFluxGraphQL(BottomSheetBehavior bottomSheetBehavior) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishDaggerWebsocket = bottomSheetBehavior;
        this.CatchingFishReduxKtor = new CatchingFishGsonRealm(4, this);
    }
}
