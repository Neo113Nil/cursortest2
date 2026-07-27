package kotlin.text;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class CatchingFishWidgetRetrofit extends com.google.android.gms.common.internal.CatchingFishPagingLibrary implements CatchingFishMVPUnitTesting {
    public final boolean CatchingFishCardViewRealm;
    public final Bundle CatchingFishCardViewView;
    public final Integer CatchingFishMVPRobolectric;
    public final CatchingFishViewWorkManager CatchingFishPayPal;

    public CatchingFishWidgetRetrofit(Context context, Looper looper, CatchingFishViewWorkManager catchingFishViewWorkManager, Bundle bundle, CatchingFishJUnitPicasso catchingFishJUnitPicasso, CatchingFishHandlerBundle catchingFishHandlerBundle) {
        super(context, looper, 44, catchingFishViewWorkManager, catchingFishJUnitPicasso, catchingFishHandlerBundle);
        this.CatchingFishCardViewRealm = true;
        this.CatchingFishPayPal = catchingFishViewWorkManager;
        this.CatchingFishCardViewView = bundle;
        this.CatchingFishMVPRobolectric = (Integer) catchingFishViewWorkManager.CatchingFishLayout;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final String CatchingFishCloudMessaging() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final IInterface CatchingFishCoroutine(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof CatchingFishMoshiMVIRedux ? (CatchingFishMoshiMVIRedux) queryLocalInterface : new CatchingFishMoshiMVIRedux(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final String CatchingFishFragmentHandler() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // kotlin.text.CatchingFishMVPUnitTesting
    public final int CatchingFishParcelableFAB() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary, kotlin.text.CatchingFishMVPUnitTesting
    public final boolean CatchingFishSnackbar() {
        return this.CatchingFishCardViewRealm;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final Bundle CatchingFishViewModelScope() {
        CatchingFishViewWorkManager catchingFishViewWorkManager = this.CatchingFishPayPal;
        boolean equals = this.CatchingFishCoroutine.getPackageName().equals((String) catchingFishViewWorkManager.CatchingFishWorkManager);
        Bundle bundle = this.CatchingFishCardViewView;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) catchingFishViewWorkManager.CatchingFishWorkManager);
        }
        return bundle;
    }
}
