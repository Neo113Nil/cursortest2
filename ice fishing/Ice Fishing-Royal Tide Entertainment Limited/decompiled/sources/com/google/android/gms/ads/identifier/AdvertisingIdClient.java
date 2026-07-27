package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.text.CatchingFishAndroidXFABKtor;
import kotlin.text.CatchingFishDataStoreRedux;
import kotlin.text.CatchingFishFABKtor;
import kotlin.text.CatchingFishHandlerService;
import kotlin.text.CatchingFishLayoutHiltRoom;
import kotlin.text.CatchingFishMVIViewModel;
import kotlin.text.CatchingFishRealmMVI;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishSnackbarIntent;
import kotlin.text.CatchingFishToastHiltBundle;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    public boolean CatchingFishCoroutine;
    public CatchingFishRealmMVI CatchingFishDaggerWebsocket;
    public CatchingFishMVIViewModel CatchingFishParcelableFAB;
    public final Object CatchingFishReduxKtor = new Object();
    public CatchingFishLayoutHiltRoom CatchingFishSnackbar;
    public final long CatchingFishViewModelScope;
    public final Context CatchingFishWorkManager;

    public static final class Info {
        public final String CatchingFishParcelableFAB;
        public final boolean CatchingFishSnackbar;

        public Info(String str, boolean z) {
            this.CatchingFishParcelableFAB = str;
            this.CatchingFishSnackbar = z;
        }

        public String getId() {
            return this.CatchingFishParcelableFAB;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.CatchingFishSnackbar;
        }

        public final String toString() {
            String str = this.CatchingFishParcelableFAB;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.CatchingFishSnackbar);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(context);
        Context applicationContext = context.getApplicationContext();
        this.CatchingFishWorkManager = applicationContext != null ? applicationContext : context;
        this.CatchingFishCoroutine = false;
        this.CatchingFishViewModelScope = -1L;
    }

    public static void CatchingFishCoroutine(Info info, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (info != null) {
                hashMap.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = info.getId();
                if (id != null) {
                    hashMap.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new CatchingFishPagingLibrary(hashMap).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.CatchingFishSnackbar();
            Info CatchingFishReduxKtor = advertisingIdClient.CatchingFishReduxKtor();
            CatchingFishCoroutine(CatchingFishReduxKtor, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return CatchingFishReduxKtor;
        } finally {
        }
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishToastHiltBundle.CatchingFishUnitTesting("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.CatchingFishWorkManager == null || this.CatchingFishParcelableFAB == null) {
                    return;
                }
                try {
                    if (this.CatchingFishCoroutine) {
                        CatchingFishServiceHilt.CatchingFishDaggerHiltFAB().CatchingFishCardViewRealm(this.CatchingFishWorkManager, this.CatchingFishParcelableFAB);
                    }
                } catch (Throwable unused) {
                }
                this.CatchingFishCoroutine = false;
                this.CatchingFishSnackbar = null;
                this.CatchingFishParcelableFAB = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Info CatchingFishReduxKtor() {
        Info info;
        CatchingFishToastHiltBundle.CatchingFishUnitTesting("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.CatchingFishCoroutine) {
                    synchronized (this.CatchingFishReduxKtor) {
                        CatchingFishRealmMVI catchingFishRealmMVI = this.CatchingFishDaggerWebsocket;
                        if (catchingFishRealmMVI == null || !catchingFishRealmMVI.CatchingFishViewModelScope) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        CatchingFishSnackbar();
                        if (!this.CatchingFishCoroutine) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                CatchingFishToastHiltBundle.CatchingFishAnimationMockk(this.CatchingFishParcelableFAB);
                CatchingFishToastHiltBundle.CatchingFishAnimationMockk(this.CatchingFishSnackbar);
                try {
                    CatchingFishAndroidXFABKtor catchingFishAndroidXFABKtor = (CatchingFishAndroidXFABKtor) this.CatchingFishSnackbar;
                    catchingFishAndroidXFABKtor.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel CatchingFishParcelableFAB = catchingFishAndroidXFABKtor.CatchingFishParcelableFAB(obtain, 1);
                    String readString = CatchingFishParcelableFAB.readString();
                    CatchingFishParcelableFAB.recycle();
                    CatchingFishAndroidXFABKtor catchingFishAndroidXFABKtor2 = (CatchingFishAndroidXFABKtor) this.CatchingFishSnackbar;
                    catchingFishAndroidXFABKtor2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = CatchingFishDataStoreRedux.CatchingFishParcelableFAB;
                    obtain2.writeInt(1);
                    Parcel CatchingFishParcelableFAB2 = catchingFishAndroidXFABKtor2.CatchingFishParcelableFAB(obtain2, 2);
                    if (CatchingFishParcelableFAB2.readInt() == 0) {
                        z = false;
                    }
                    CatchingFishParcelableFAB2.recycle();
                    info = new Info(readString, z);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.CatchingFishReduxKtor) {
            CatchingFishRealmMVI catchingFishRealmMVI2 = this.CatchingFishDaggerWebsocket;
            if (catchingFishRealmMVI2 != null) {
                catchingFishRealmMVI2.CatchingFishWorkManager.countDown();
                try {
                    this.CatchingFishDaggerWebsocket.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j = this.CatchingFishViewModelScope;
            if (j > 0) {
                this.CatchingFishDaggerWebsocket = new CatchingFishRealmMVI(this, j);
            }
        }
        return info;
    }

    public final void CatchingFishSnackbar() {
        CatchingFishToastHiltBundle.CatchingFishUnitTesting("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.CatchingFishCoroutine) {
                    CatchingFishParcelableFAB();
                }
                Context context = this.CatchingFishWorkManager;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int CatchingFishSnackbar = CatchingFishFABKtor.CatchingFishSnackbar.CatchingFishSnackbar(context, 12451000);
                    if (CatchingFishSnackbar != 0 && CatchingFishSnackbar != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    CatchingFishMVIViewModel catchingFishMVIViewModel = new CatchingFishMVIViewModel();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!CatchingFishServiceHilt.CatchingFishDaggerHiltFAB().CatchingFishCardViewView(context, context.getClass().getName(), intent, catchingFishMVIViewModel, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.CatchingFishParcelableFAB = catchingFishMVIViewModel;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder CatchingFishParcelableFAB = catchingFishMVIViewModel.CatchingFishParcelableFAB();
                            int i = CatchingFishHandlerService.CatchingFishEspressoTesting;
                            IInterface queryLocalInterface = CatchingFishParcelableFAB.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.CatchingFishSnackbar = queryLocalInterface instanceof CatchingFishLayoutHiltRoom ? (CatchingFishLayoutHiltRoom) queryLocalInterface : new CatchingFishAndroidXFABKtor(CatchingFishParcelableFAB);
                            this.CatchingFishCoroutine = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new CatchingFishSnackbarIntent();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        CatchingFishParcelableFAB();
        super.finalize();
    }
}
