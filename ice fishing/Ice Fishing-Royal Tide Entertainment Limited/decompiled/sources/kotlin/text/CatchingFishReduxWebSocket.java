package kotlin.text;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishReduxWebSocket extends Binder implements CatchingFishToastGson {
    public static final /* synthetic */ int CatchingFishOkHttp = 0;
    public final /* synthetic */ CustomTabsService CatchingFishEspressoTesting;

    public CatchingFishReduxWebSocket(CustomTabsService customTabsService) {
        this.CatchingFishEspressoTesting = customTabsService;
        attachInterface(this, CatchingFishToastGson.CatchingFishCoroutine);
    }

    public static PendingIntent CatchingFishParcelableFAB(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }

    public final boolean CatchingFishCoroutine(CatchingFishMVILifecycle catchingFishMVILifecycle, PendingIntent pendingIntent) {
        try {
            CatchingFishIntentFlux catchingFishIntentFlux = new CatchingFishIntentFlux(this, new CatchingFishToastExoPlayer(catchingFishMVILifecycle, pendingIntent), 0);
            synchronized (this.CatchingFishEspressoTesting.CatchingFishReduxKtor) {
                catchingFishMVILifecycle.asBinder().linkToDeath(catchingFishIntentFlux, 0);
                this.CatchingFishEspressoTesting.CatchingFishReduxKtor.put(catchingFishMVILifecycle.asBinder(), catchingFishIntentFlux);
            }
            return this.CatchingFishEspressoTesting.CatchingFishCoroutine();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // kotlin.text.CatchingFishToastGson
    public final boolean CatchingFishReduxKtor(CatchingFishFragmentGlide catchingFishFragmentGlide) {
        return CatchingFishCoroutine(catchingFishFragmentGlide, null);
    }

    @Override // kotlin.text.CatchingFishToastGson
    public final boolean CatchingFishSnackbar(CatchingFishMVILifecycle catchingFishMVILifecycle, Uri uri, Bundle bundle, List list) {
        PendingIntent CatchingFishParcelableFAB = CatchingFishParcelableFAB(bundle);
        if (catchingFishMVILifecycle == null && CatchingFishParcelableFAB == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        return this.CatchingFishEspressoTesting.CatchingFishSnackbar();
    }

    @Override // kotlin.text.CatchingFishToastGson
    public final boolean CatchingFishViewModelFAB() {
        return this.CatchingFishEspressoTesting.CatchingFishLayout();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface queryLocalInterface;
        String str = CatchingFishToastGson.CatchingFishCoroutine;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        CatchingFishCoroutinePayPal catchingFishCoroutinePayPal = null;
        switch (i) {
            case 2:
                parcel.readLong();
                boolean CatchingFishLayout = this.CatchingFishEspressoTesting.CatchingFishLayout();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishLayout ? 1 : 0);
                return true;
            case 3:
                boolean CatchingFishCoroutine = CatchingFishCoroutine(CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder()), null);
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishCoroutine ? 1 : 0);
                return true;
            case 4:
                CatchingFishMVILifecycle CatchingFishParcelableFAB = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                Uri uri = (Uri) parcel.readTypedObject(Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                boolean CatchingFishSnackbar = CatchingFishSnackbar(CatchingFishParcelableFAB, uri, (Bundle) parcel.readTypedObject(creator), parcel.createTypedArrayList(creator));
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishSnackbar ? 1 : 0);
                return true;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                parcel.readString();
                Bundle CatchingFishParcelableFAB2 = this.CatchingFishEspressoTesting.CatchingFishParcelableFAB();
                parcel2.writeNoException();
                parcel2.writeTypedObject(CatchingFishParcelableFAB2, 1);
                return true;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishMVILifecycle CatchingFishParcelableFAB3 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                Bundle bundle = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CustomTabsService customTabsService = this.CatchingFishEspressoTesting;
                PendingIntent CatchingFishParcelableFAB4 = CatchingFishParcelableFAB(bundle);
                if (CatchingFishParcelableFAB3 == null && CatchingFishParcelableFAB4 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean CatchingFishViewModelScope = customTabsService.CatchingFishViewModelScope();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishViewModelScope ? 1 : 0);
                return true;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishMVILifecycle CatchingFishParcelableFAB5 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                CustomTabsService customTabsService2 = this.CatchingFishEspressoTesting;
                if (CatchingFishParcelableFAB5 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                new Bundle();
                boolean CatchingFishWorkManager = customTabsService2.CatchingFishWorkManager();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishWorkManager ? 1 : 0);
                return true;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishMVILifecycle CatchingFishParcelableFAB6 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                parcel.readString();
                Bundle bundle2 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CustomTabsService customTabsService3 = this.CatchingFishEspressoTesting;
                PendingIntent CatchingFishParcelableFAB7 = CatchingFishParcelableFAB(bundle2);
                if (CatchingFishParcelableFAB6 == null && CatchingFishParcelableFAB7 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                int CatchingFishReduxKtor = customTabsService3.CatchingFishReduxKtor();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishReduxKtor);
                return true;
            case 9:
                CatchingFishMVILifecycle CatchingFishParcelableFAB8 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle3 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CustomTabsService customTabsService4 = this.CatchingFishEspressoTesting;
                PendingIntent CatchingFishParcelableFAB9 = CatchingFishParcelableFAB(bundle3);
                if (CatchingFishParcelableFAB8 == null && CatchingFishParcelableFAB9 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean CatchingFishViewModelFAB = customTabsService4.CatchingFishViewModelFAB();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishViewModelFAB ? 1 : 0);
                return true;
            case 10:
                boolean CatchingFishCoroutine2 = CatchingFishCoroutine(CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder()), CatchingFishParcelableFAB((Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishCoroutine2 ? 1 : 0);
                return true;
            case 11:
                CatchingFishMVILifecycle CatchingFishParcelableFAB10 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                Bundle bundle4 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CustomTabsService customTabsService5 = this.CatchingFishEspressoTesting;
                PendingIntent CatchingFishParcelableFAB11 = CatchingFishParcelableFAB(bundle4);
                if (CatchingFishParcelableFAB10 == null && CatchingFishParcelableFAB11 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                if (bundle4 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                }
                boolean CatchingFishWorkManager2 = customTabsService5.CatchingFishWorkManager();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishWorkManager2 ? 1 : 0);
                return true;
            case 12:
                CatchingFishMVILifecycle CatchingFishParcelableFAB12 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle5 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CustomTabsService customTabsService6 = this.CatchingFishEspressoTesting;
                PendingIntent CatchingFishParcelableFAB13 = CatchingFishParcelableFAB(bundle5);
                if (CatchingFishParcelableFAB12 == null && CatchingFishParcelableFAB13 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean CatchingFishDaggerWebsocket = customTabsService6.CatchingFishDaggerWebsocket();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishDaggerWebsocket ? 1 : 0);
                return true;
            case 13:
                CatchingFishMVILifecycle CatchingFishParcelableFAB14 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                PendingIntent CatchingFishParcelableFAB15 = CatchingFishParcelableFAB((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                if (CatchingFishParcelableFAB14 == null && CatchingFishParcelableFAB15 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 14:
                CatchingFishMVILifecycle CatchingFishParcelableFAB16 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                Bundle bundle6 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (readStrongBinder != null && (queryLocalInterface = readStrongBinder.queryLocalInterface(CatchingFishLiveDataService.CatchingFishReduxKtor)) != null && (queryLocalInterface instanceof CatchingFishLiveDataService)) {
                }
                PendingIntent CatchingFishParcelableFAB17 = CatchingFishParcelableFAB(bundle6);
                if (CatchingFishParcelableFAB16 == null && CatchingFishParcelableFAB17 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 15:
                CatchingFishMVILifecycle CatchingFishParcelableFAB18 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                Uri uri2 = (Uri) parcel.readTypedObject(Uri.CREATOR);
                Bundle bundle7 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                PendingIntent CatchingFishParcelableFAB19 = CatchingFishParcelableFAB(bundle7);
                if (CatchingFishParcelableFAB18 == null && CatchingFishParcelableFAB19 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                Object[] objArr = {uri2};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                Collections.unmodifiableList(arrayList);
                CatchingFishViewMVIMVVM.CatchingFishWorkManager(bundle7);
                parcel2.writeNoException();
                return true;
            case 16:
                CatchingFishMVILifecycle CatchingFishParcelableFAB20 = CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder());
                parcel.createTypedArrayList(Uri.CREATOR);
                Bundle bundle8 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                PendingIntent CatchingFishParcelableFAB21 = CatchingFishParcelableFAB(bundle8);
                if (CatchingFishParcelableFAB20 == null && CatchingFishParcelableFAB21 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                CatchingFishViewMVIMVVM.CatchingFishWorkManager(bundle8);
                parcel2.writeNoException();
                return true;
            case 17:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 18:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(CatchingFishCoroutinePayPal.CatchingFishParcelableFAB);
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof CatchingFishCoroutinePayPal)) {
                        CatchingFishMockkDagger catchingFishMockkDagger = new CatchingFishMockkDagger();
                        catchingFishMockkDagger.CatchingFishEspressoTesting = readStrongBinder2;
                        catchingFishCoroutinePayPal = catchingFishMockkDagger;
                    } else {
                        catchingFishCoroutinePayPal = (CatchingFishCoroutinePayPal) queryLocalInterface2;
                    }
                }
                try {
                    CatchingFishIntentFlux catchingFishIntentFlux = new CatchingFishIntentFlux(this, new CatchingFishParcelableGlide(catchingFishCoroutinePayPal, CatchingFishParcelableFAB((Bundle) parcel.readTypedObject(Bundle.CREATOR))), 1);
                    synchronized (this.CatchingFishEspressoTesting.CatchingFishReduxKtor) {
                        ((CatchingFishMockkDagger) catchingFishCoroutinePayPal).CatchingFishEspressoTesting.linkToDeath(catchingFishIntentFlux, 0);
                        this.CatchingFishEspressoTesting.CatchingFishReduxKtor.put(((CatchingFishMockkDagger) catchingFishCoroutinePayPal).CatchingFishEspressoTesting, catchingFishIntentFlux);
                    }
                } catch (RemoteException unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
