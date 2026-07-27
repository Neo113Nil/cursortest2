package kotlin.text;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class CatchingFishGradleRealm extends CatchingFishViewStateFlow {
    public final int CatchingFishAnimationMockk;
    public Account CatchingFishCloudMessaging;
    public final int CatchingFishDaggerWebsocket;
    public CatchingFishAppCompatPayPal[] CatchingFishEspressoTesting;
    public Bundle CatchingFishFragmentHandler;
    public Scope[] CatchingFishLayout;
    public CatchingFishAppCompatPayPal[] CatchingFishOkHttp;
    public final int CatchingFishReduxKtor;
    public final String CatchingFishRoomDatabase;
    public final boolean CatchingFishStateLiveData;
    public final boolean CatchingFishUnitTesting;
    public IBinder CatchingFishViewModelFAB;
    public String CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;
    public static final Parcelable.Creator<CatchingFishGradleRealm> CREATOR = new CatchingFishRoomKtorToast(8);
    public static final Scope[] CatchingFishNavigation = new Scope[0];
    public static final CatchingFishAppCompatPayPal[] CatchingFish = new CatchingFishAppCompatPayPal[0];

    public CatchingFishGradleRealm(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr, CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? CatchingFishNavigation : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr3 = CatchingFish;
        catchingFishAppCompatPayPalArr = catchingFishAppCompatPayPalArr == null ? catchingFishAppCompatPayPalArr3 : catchingFishAppCompatPayPalArr;
        catchingFishAppCompatPayPalArr2 = catchingFishAppCompatPayPalArr2 == null ? catchingFishAppCompatPayPalArr3 : catchingFishAppCompatPayPalArr2;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = i3;
        if ("com.google.android.gms".equals(str)) {
            this.CatchingFishViewModelScope = "com.google.android.gms";
        } else {
            this.CatchingFishViewModelScope = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = CatchingFishExoPlayer.CatchingFishOkHttp;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                CatchingFishCoroutineFlux catchingFishToastGsonFlux = queryLocalInterface instanceof CatchingFishCoroutineFlux ? (CatchingFishCoroutineFlux) queryLocalInterface : new CatchingFishToastGsonFlux(iBinder);
                if (catchingFishToastGsonFlux != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = ((CatchingFishToastGsonFlux) catchingFishToastGsonFlux).CatchingFishParcelableFAB();
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.CatchingFishCloudMessaging = account2;
        } else {
            this.CatchingFishViewModelFAB = iBinder;
            this.CatchingFishCloudMessaging = account;
        }
        this.CatchingFishLayout = scopeArr;
        this.CatchingFishFragmentHandler = bundle;
        this.CatchingFishEspressoTesting = catchingFishAppCompatPayPalArr;
        this.CatchingFishOkHttp = catchingFishAppCompatPayPalArr2;
        this.CatchingFishUnitTesting = z;
        this.CatchingFishAnimationMockk = i4;
        this.CatchingFishStateLiveData = z2;
        this.CatchingFishRoomDatabase = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CatchingFishRoomKtorToast.CatchingFishParcelableFAB(this, parcel, i);
    }
}
