package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.CatchingFishAdMobAdMob;
import kotlin.text.CatchingFishAppCompatPayPal;
import kotlin.text.CatchingFishBundleMVPIntent;
import kotlin.text.CatchingFishCoroutineFlux;
import kotlin.text.CatchingFishEspressoPayPal;
import kotlin.text.CatchingFishFABKtor;
import kotlin.text.CatchingFishGlideMVP;
import kotlin.text.CatchingFishGradleRealm;
import kotlin.text.CatchingFishGradleService;
import kotlin.text.CatchingFishHandlerBundle;
import kotlin.text.CatchingFishJUnitPicasso;
import kotlin.text.CatchingFishLiveDataFlux;
import kotlin.text.CatchingFishMVPDaggerMVI;
import kotlin.text.CatchingFishMVPIntent;
import kotlin.text.CatchingFishMVPUnitTesting;
import kotlin.text.CatchingFishMoshiJUnit;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishStripeAPIRealm;
import kotlin.text.CatchingFishToastGoogleMaps;
import kotlin.text.CatchingFishToastGsonFlux;
import kotlin.text.CatchingFishToastHiltBundle;
import kotlin.text.CatchingFishToastRoom;
import kotlin.text.CatchingFishToolbarMockk;
import kotlin.text.CatchingFishViewWorkManager;
import kotlin.text.CatchingFishXMLLayoutView;

/* loaded from: classes.dex */
public abstract class CatchingFishPagingLibrary implements CatchingFishMVPUnitTesting {
    public static final CatchingFishAppCompatPayPal[] CatchingFishGsonAppCompat = new CatchingFishAppCompatPayPal[0];
    public volatile CatchingFishServiceHilt CatchingFish;
    public final CatchingFishEspressoPayPal CatchingFishAnimationMockk;
    public final ArrayList CatchingFishCloudMessaging;
    public final Context CatchingFishCoroutine;
    public boolean CatchingFishCoroutineFlow;
    public volatile CatchingFishToastGoogleMaps CatchingFishDaggerHiltFAB;
    public final CatchingFishToastRoom CatchingFishDaggerWebsocket;
    public CatchingFishMVPIntent CatchingFishEspressoTesting;
    public IInterface CatchingFishFragmentHandler;
    public ConnectionResult CatchingFishJetpackCompose;
    public CatchingFishLiveDataFlux CatchingFishLayout;
    public volatile String CatchingFishNavigation;
    public int CatchingFishOkHttp;
    public volatile String CatchingFishParcelableFAB;
    public final Set CatchingFishParcelableFlux;
    public final CatchingFishGradleService CatchingFishReduxKtor;
    public final String CatchingFishRoomDatabase;
    public CatchingFishStripeAPIRealm CatchingFishSnackbar;
    public final AtomicInteger CatchingFishSpannableWidget;
    public final int CatchingFishStateLiveData;
    public final CatchingFishEspressoPayPal CatchingFishUnitTesting;
    public CatchingFishBundleMVPIntent CatchingFishViewModelFAB;
    public final Object CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public CatchingFishPagingLibrary(Context context, Looper looper, int i, CatchingFishViewWorkManager catchingFishViewWorkManager, CatchingFishJUnitPicasso catchingFishJUnitPicasso, CatchingFishHandlerBundle catchingFishHandlerBundle) {
        synchronized (CatchingFishGradleService.CatchingFishViewModelScope) {
            try {
                if (CatchingFishGradleService.CatchingFishViewModelFAB == null) {
                    CatchingFishGradleService.CatchingFishViewModelFAB = new CatchingFishGradleService(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        CatchingFishGradleService catchingFishGradleService = CatchingFishGradleService.CatchingFishViewModelFAB;
        Object obj = CatchingFishAdMobAdMob.CatchingFishReduxKtor;
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishJUnitPicasso);
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishHandlerBundle);
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(18, catchingFishJUnitPicasso);
        CatchingFishEspressoPayPal catchingFishEspressoPayPal2 = new CatchingFishEspressoPayPal(19, catchingFishHandlerBundle);
        String str = (String) catchingFishViewWorkManager.CatchingFishViewModelScope;
        this.CatchingFishParcelableFAB = null;
        this.CatchingFishWorkManager = new Object();
        this.CatchingFishViewModelScope = new Object();
        this.CatchingFishCloudMessaging = new ArrayList();
        this.CatchingFishOkHttp = 1;
        this.CatchingFishJetpackCompose = null;
        this.CatchingFishCoroutineFlow = false;
        this.CatchingFishDaggerHiltFAB = null;
        this.CatchingFishSpannableWidget = new AtomicInteger(0);
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(context, "Context must not be null");
        this.CatchingFishCoroutine = context;
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(looper, "Looper must not be null");
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(catchingFishGradleService, "Supervisor must not be null");
        this.CatchingFishReduxKtor = catchingFishGradleService;
        this.CatchingFishDaggerWebsocket = new CatchingFishToastRoom(this, looper);
        this.CatchingFishStateLiveData = i;
        this.CatchingFishUnitTesting = catchingFishEspressoPayPal;
        this.CatchingFishAnimationMockk = catchingFishEspressoPayPal2;
        this.CatchingFishRoomDatabase = str;
        Set set = (Set) catchingFishViewWorkManager.CatchingFishDaggerWebsocket;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.CatchingFishParcelableFlux = set;
    }

    public final /* synthetic */ boolean CatchingFishAnimationMockk(int i, int i2, IInterface iInterface) {
        synchronized (this.CatchingFishWorkManager) {
            try {
                if (this.CatchingFishOkHttp != i) {
                    return false;
                }
                CatchingFishStateLiveData(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String CatchingFishCloudMessaging();

    public abstract IInterface CatchingFishCoroutine(IBinder iBinder);

    public final void CatchingFishDaggerWebsocket(String str) {
        this.CatchingFishParcelableFAB = str;
        CatchingFishReduxKtor();
    }

    public boolean CatchingFishEspressoTesting() {
        return CatchingFishParcelableFAB() >= 211700000;
    }

    public abstract String CatchingFishFragmentHandler();

    public final IInterface CatchingFishLayout() {
        IInterface iInterface;
        synchronized (this.CatchingFishWorkManager) {
            try {
                if (this.CatchingFishOkHttp == 5) {
                    throw new DeadObjectException();
                }
                if (!CatchingFishOkHttp()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.CatchingFishFragmentHandler;
                CatchingFishToastHiltBundle.CatchingFishStateLiveData(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public final boolean CatchingFishOkHttp() {
        boolean z;
        synchronized (this.CatchingFishWorkManager) {
            z = this.CatchingFishOkHttp == 4;
        }
        return z;
    }

    public final void CatchingFishReduxKtor() {
        this.CatchingFishSpannableWidget.incrementAndGet();
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    CatchingFishToolbarMockk catchingFishToolbarMockk = (CatchingFishToolbarMockk) arrayList.get(i);
                    synchronized (catchingFishToolbarMockk) {
                        catchingFishToolbarMockk.CatchingFishParcelableFAB = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.CatchingFishViewModelScope) {
            this.CatchingFishViewModelFAB = null;
        }
        CatchingFishStateLiveData(1, null);
    }

    @Override // kotlin.text.CatchingFishMVPUnitTesting
    public boolean CatchingFishSnackbar() {
        return false;
    }

    public final void CatchingFishStateLiveData(int i, IInterface iInterface) {
        CatchingFishStripeAPIRealm catchingFishStripeAPIRealm;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.CatchingFishWorkManager) {
            try {
                this.CatchingFishOkHttp = i;
                this.CatchingFishFragmentHandler = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    CatchingFishMVPIntent catchingFishMVPIntent = this.CatchingFishEspressoTesting;
                    if (catchingFishMVPIntent != null) {
                        CatchingFishGradleService catchingFishGradleService = this.CatchingFishReduxKtor;
                        String str = (String) this.CatchingFishSnackbar.CatchingFishSnackbar;
                        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(str);
                        this.CatchingFishSnackbar.getClass();
                        if (this.CatchingFishRoomDatabase == null) {
                            this.CatchingFishCoroutine.getClass();
                        }
                        catchingFishGradleService.CatchingFishSnackbar(str, catchingFishMVPIntent, this.CatchingFishSnackbar.CatchingFishParcelableFAB);
                        this.CatchingFishEspressoTesting = null;
                    }
                } else if (i == 2 || i == 3) {
                    CatchingFishMVPIntent catchingFishMVPIntent2 = this.CatchingFishEspressoTesting;
                    if (catchingFishMVPIntent2 != null && (catchingFishStripeAPIRealm = this.CatchingFishSnackbar) != null) {
                        new StringBuilder(String.valueOf((String) catchingFishStripeAPIRealm.CatchingFishSnackbar).length() + 70 + "com.google.android.gms".length());
                        CatchingFishGradleService catchingFishGradleService2 = this.CatchingFishReduxKtor;
                        String str2 = (String) this.CatchingFishSnackbar.CatchingFishSnackbar;
                        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(str2);
                        this.CatchingFishSnackbar.getClass();
                        if (this.CatchingFishRoomDatabase == null) {
                            this.CatchingFishCoroutine.getClass();
                        }
                        catchingFishGradleService2.CatchingFishSnackbar(str2, catchingFishMVPIntent2, this.CatchingFishSnackbar.CatchingFishParcelableFAB);
                        this.CatchingFishSpannableWidget.incrementAndGet();
                    }
                    CatchingFishMVPIntent catchingFishMVPIntent3 = new CatchingFishMVPIntent(this, this.CatchingFishSpannableWidget.get());
                    this.CatchingFishEspressoTesting = catchingFishMVPIntent3;
                    String CatchingFishCloudMessaging = CatchingFishCloudMessaging();
                    boolean CatchingFishEspressoTesting = CatchingFishEspressoTesting();
                    this.CatchingFishSnackbar = new CatchingFishStripeAPIRealm(CatchingFishCloudMessaging, CatchingFishEspressoTesting);
                    if (CatchingFishEspressoTesting && CatchingFishParcelableFAB() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.CatchingFishSnackbar.CatchingFishSnackbar)));
                    }
                    CatchingFishGradleService catchingFishGradleService3 = this.CatchingFishReduxKtor;
                    String str3 = (String) this.CatchingFishSnackbar.CatchingFishSnackbar;
                    CatchingFishToastHiltBundle.CatchingFishAnimationMockk(str3);
                    this.CatchingFishSnackbar.getClass();
                    String str4 = this.CatchingFishRoomDatabase;
                    if (str4 == null) {
                        str4 = this.CatchingFishCoroutine.getClass().getName();
                    }
                    ConnectionResult CatchingFishParcelableFAB = catchingFishGradleService3.CatchingFishParcelableFAB(new CatchingFishXMLLayoutView(str3, this.CatchingFishSnackbar.CatchingFishParcelableFAB), catchingFishMVPIntent3, str4);
                    if (!(CatchingFishParcelableFAB.CatchingFishDaggerWebsocket == 0)) {
                        new StringBuilder(String.valueOf((String) this.CatchingFishSnackbar.CatchingFishSnackbar).length() + 34 + "com.google.android.gms".length());
                        int i2 = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (CatchingFishParcelableFAB.CatchingFishWorkManager != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", CatchingFishParcelableFAB.CatchingFishWorkManager);
                        }
                        int i3 = this.CatchingFishSpannableWidget.get();
                        CatchingFishMoshiJUnit catchingFishMoshiJUnit = new CatchingFishMoshiJUnit(this, i2, bundle);
                        CatchingFishToastRoom catchingFishToastRoom = this.CatchingFishDaggerWebsocket;
                        catchingFishToastRoom.sendMessage(catchingFishToastRoom.obtainMessage(7, i3, -1, catchingFishMoshiJUnit));
                    }
                } else if (i == 4) {
                    CatchingFishToastHiltBundle.CatchingFishAnimationMockk(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final boolean CatchingFishUnitTesting() {
        boolean z;
        synchronized (this.CatchingFishWorkManager) {
            int i = this.CatchingFishOkHttp;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void CatchingFishViewModelFAB(CatchingFishCoroutineFlux catchingFishCoroutineFlux, Set set) {
        String attributionTag;
        String attributionTag2;
        Bundle CatchingFishViewModelScope = CatchingFishViewModelScope();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.CatchingFishNavigation;
        } else if (this.CatchingFish == null) {
            attributionTag2 = this.CatchingFishNavigation;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.CatchingFish.CatchingFishDaggerWebsocket;
            if (attributionSource == null) {
                attributionTag2 = this.CatchingFishNavigation;
            } else {
                attributionTag = attributionSource.getAttributionTag();
                attributionTag2 = attributionTag == null ? this.CatchingFishNavigation : attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i = this.CatchingFishStateLiveData;
        int i2 = CatchingFishFABKtor.CatchingFishParcelableFAB;
        Scope[] scopeArr = CatchingFishGradleRealm.CatchingFishNavigation;
        Bundle bundle = new Bundle();
        CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr = CatchingFishGradleRealm.CatchingFish;
        CatchingFishGradleRealm catchingFishGradleRealm = new CatchingFishGradleRealm(6, i, i2, null, null, scopeArr, bundle, null, catchingFishAppCompatPayPalArr, catchingFishAppCompatPayPalArr, true, 0, false, str);
        catchingFishGradleRealm.CatchingFishViewModelScope = this.CatchingFishCoroutine.getPackageName();
        catchingFishGradleRealm.CatchingFishFragmentHandler = CatchingFishViewModelScope;
        if (set != null) {
            catchingFishGradleRealm.CatchingFishLayout = (Scope[]) set.toArray(new Scope[0]);
        }
        if (CatchingFishSnackbar()) {
            catchingFishGradleRealm.CatchingFishCloudMessaging = new Account("<<default account>>", "com.google");
            if (catchingFishCoroutineFlux != null) {
                catchingFishGradleRealm.CatchingFishViewModelFAB = ((CatchingFishToastGsonFlux) catchingFishCoroutineFlux).CatchingFishEspressoTesting;
            }
        }
        catchingFishGradleRealm.CatchingFishEspressoTesting = CatchingFishGsonAppCompat;
        catchingFishGradleRealm.CatchingFishOkHttp = CatchingFishWorkManager();
        try {
            try {
                synchronized (this.CatchingFishViewModelScope) {
                    try {
                        CatchingFishBundleMVPIntent catchingFishBundleMVPIntent = this.CatchingFishViewModelFAB;
                        if (catchingFishBundleMVPIntent != null) {
                            catchingFishBundleMVPIntent.CatchingFishParcelableFAB(new CatchingFishMVPDaggerMVI(this, this.CatchingFishSpannableWidget.get()), catchingFishGradleRealm);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i3 = this.CatchingFishSpannableWidget.get();
                CatchingFishGlideMVP catchingFishGlideMVP = new CatchingFishGlideMVP(this, 8, null, null);
                CatchingFishToastRoom catchingFishToastRoom = this.CatchingFishDaggerWebsocket;
                catchingFishToastRoom.sendMessage(catchingFishToastRoom.obtainMessage(1, i3, -1, catchingFishGlideMVP));
            }
        } catch (DeadObjectException unused2) {
            int i4 = this.CatchingFishSpannableWidget.get();
            CatchingFishToastRoom catchingFishToastRoom2 = this.CatchingFishDaggerWebsocket;
            catchingFishToastRoom2.sendMessage(catchingFishToastRoom2.obtainMessage(6, i4, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public Bundle CatchingFishViewModelScope() {
        return new Bundle();
    }

    public CatchingFishAppCompatPayPal[] CatchingFishWorkManager() {
        return CatchingFishGsonAppCompat;
    }
}
