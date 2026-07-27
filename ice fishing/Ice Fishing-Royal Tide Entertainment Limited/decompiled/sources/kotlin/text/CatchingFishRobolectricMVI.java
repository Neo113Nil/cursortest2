package kotlin.text;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class CatchingFishRobolectricMVI extends CatchingFishKtorMVVMJUnit implements CatchingFishJUnitPicasso, CatchingFishHandlerBundle {
    public static final CatchingFishToastDataStore CatchingFishJetpackCompose = CatchingFishMVVMAnimation.CatchingFishParcelableFAB;
    public CatchingFishGsonFragment CatchingFish;
    public final CatchingFishToastDataStore CatchingFishAnimationMockk;
    public CatchingFishWidgetRetrofit CatchingFishNavigation;
    public final Context CatchingFishOkHttp;
    public final CatchingFishViewWorkManager CatchingFishRoomDatabase;
    public final Set CatchingFishStateLiveData;
    public final Handler CatchingFishUnitTesting;

    public CatchingFishRobolectricMVI(Context context, CatchingFishPayPalRedux catchingFishPayPalRedux, CatchingFishViewWorkManager catchingFishViewWorkManager) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.CatchingFishOkHttp = context;
        this.CatchingFishUnitTesting = catchingFishPayPalRedux;
        this.CatchingFishRoomDatabase = catchingFishViewWorkManager;
        this.CatchingFishStateLiveData = (Set) catchingFishViewWorkManager.CatchingFishReduxKtor;
        this.CatchingFishAnimationMockk = CatchingFishJetpackCompose;
    }

    @Override // kotlin.text.CatchingFishJUnitPicasso
    public final void CatchingFishCoroutine() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        CatchingFishWidgetRetrofit catchingFishWidgetRetrofit = this.CatchingFishNavigation;
        catchingFishWidgetRetrofit.getClass();
        try {
            try {
                catchingFishWidgetRetrofit.CatchingFishPayPal.getClass();
                Account account = new Account("<<default account>>", "com.google");
                try {
                    if ("<<default account>>".equals(account.name)) {
                        Context context = catchingFishWidgetRetrofit.CatchingFishCoroutine;
                        ReentrantLock reentrantLock = CatchingFishToolbarSnackbar.CatchingFishCoroutine;
                        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(context);
                        ReentrantLock reentrantLock2 = CatchingFishToolbarSnackbar.CatchingFishCoroutine;
                        reentrantLock2.lock();
                        try {
                            if (CatchingFishToolbarSnackbar.CatchingFishReduxKtor == null) {
                                CatchingFishToolbarSnackbar.CatchingFishReduxKtor = new CatchingFishToolbarSnackbar(context.getApplicationContext());
                            }
                            CatchingFishToolbarSnackbar catchingFishToolbarSnackbar = CatchingFishToolbarSnackbar.CatchingFishReduxKtor;
                            reentrantLock2.unlock();
                            String CatchingFishParcelableFAB = catchingFishToolbarSnackbar.CatchingFishParcelableFAB("defaultGoogleSignInAccount");
                            if (!TextUtils.isEmpty(CatchingFishParcelableFAB)) {
                                StringBuilder sb = new StringBuilder(20 + String.valueOf(CatchingFishParcelableFAB).length());
                                sb.append("googleSignInAccount:");
                                sb.append(CatchingFishParcelableFAB);
                                String CatchingFishParcelableFAB2 = catchingFishToolbarSnackbar.CatchingFishParcelableFAB(sb.toString());
                                if (CatchingFishParcelableFAB2 != null) {
                                    try {
                                        googleSignInAccount = GoogleSignInAccount.CatchingFishParcelableFAB(CatchingFishParcelableFAB2);
                                    } catch (JSONException unused) {
                                    }
                                    Integer num = catchingFishWidgetRetrofit.CatchingFishMVPRobolectric;
                                    CatchingFishToastHiltBundle.CatchingFishAnimationMockk(num);
                                    CatchingFishMVPDagger catchingFishMVPDagger = new CatchingFishMVPDagger(2, account, num.intValue(), googleSignInAccount);
                                    CatchingFishMoshiMVIRedux catchingFishMoshiMVIRedux = (CatchingFishMoshiMVIRedux) catchingFishWidgetRetrofit.CatchingFishLayout();
                                    obtain = Parcel.obtain();
                                    obtain.writeInterfaceToken(catchingFishMoshiMVIRedux.CatchingFishOkHttp);
                                    int i = CatchingFishKtorEspresso.CatchingFishParcelableFAB;
                                    obtain.writeInt(1);
                                    int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(obtain, 20293);
                                    CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(obtain, 1, 4);
                                    obtain.writeInt(1);
                                    CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(obtain, 2, catchingFishMVPDagger, 0);
                                    CatchingFishViewMVIMVVM.CatchingFishPayPalService(obtain, CatchingFishJobScheduler);
                                    obtain.writeStrongBinder(this);
                                    obtain2 = Parcel.obtain();
                                    catchingFishMoshiMVIRedux.CatchingFishEspressoTesting.transact(12, obtain, obtain2, 0);
                                    obtain2.readException();
                                    obtain.recycle();
                                    obtain2.recycle();
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    catchingFishMoshiMVIRedux.CatchingFishEspressoTesting.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain.recycle();
                    obtain2.recycle();
                    return;
                } catch (Throwable th2) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th2;
                }
                googleSignInAccount = null;
                Integer num2 = catchingFishWidgetRetrofit.CatchingFishMVPRobolectric;
                CatchingFishToastHiltBundle.CatchingFishAnimationMockk(num2);
                CatchingFishMVPDagger catchingFishMVPDagger2 = new CatchingFishMVPDagger(2, account, num2.intValue(), googleSignInAccount);
                CatchingFishMoshiMVIRedux catchingFishMoshiMVIRedux2 = (CatchingFishMoshiMVIRedux) catchingFishWidgetRetrofit.CatchingFishLayout();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(catchingFishMoshiMVIRedux2.CatchingFishOkHttp);
                int i2 = CatchingFishKtorEspresso.CatchingFishParcelableFAB;
                obtain.writeInt(1);
                int CatchingFishJobScheduler2 = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(obtain, 20293);
                CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(obtain, 1, 4);
                obtain.writeInt(1);
                CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(obtain, 2, catchingFishMVPDagger2, 0);
                CatchingFishViewMVIMVVM.CatchingFishPayPalService(obtain, CatchingFishJobScheduler2);
                obtain.writeStrongBinder(this);
                obtain2 = Parcel.obtain();
            } catch (RemoteException unused2) {
                this.CatchingFishUnitTesting.post(new CatchingFishGsonRealmMoshi(3, this, new CatchingFishHiltGlideFlux(1, new ConnectionResult(8, null, null), null)));
            }
        } catch (RemoteException unused3) {
        }
    }

    @Override // kotlin.text.CatchingFishHandlerBundle
    public final void CatchingFishDaggerWebsocket(ConnectionResult connectionResult) {
        this.CatchingFish.CatchingFishSnackbar(connectionResult);
    }

    @Override // kotlin.text.CatchingFishJUnitPicasso
    public final void CatchingFishParcelableFAB(int i) {
        CatchingFishGsonFragment catchingFishGsonFragment = this.CatchingFish;
        CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP = (CatchingFishAdMobDaggerMVP) ((CatchingFishExoPlayerGson) catchingFishGsonFragment.CatchingFishLayout).CatchingFishFragmentHandler.get((CatchingFishExoPlayerRoom) catchingFishGsonFragment.CatchingFishWorkManager);
        if (catchingFishAdMobDaggerMVP != null) {
            if (catchingFishAdMobDaggerMVP.CatchingFishJetpackCompose) {
                catchingFishAdMobDaggerMVP.CatchingFishOkHttp(new ConnectionResult(17, null, null));
            } else {
                catchingFishAdMobDaggerMVP.CatchingFishParcelableFAB(i);
            }
        }
    }
}
