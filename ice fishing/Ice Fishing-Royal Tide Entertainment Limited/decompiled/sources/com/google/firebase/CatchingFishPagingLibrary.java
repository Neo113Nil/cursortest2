package com.google.firebase;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.CatchingFishCameraXRetrofit;
import kotlin.text.CatchingFishContextKtorFlux;
import kotlin.text.CatchingFishKtorViewModel;
import kotlin.text.CatchingFishLiveDataHandler;
import kotlin.text.CatchingFishMVIStateFlow;
import kotlin.text.CatchingFishMVVMMVIGson;
import kotlin.text.CatchingFishMockkExoPlayer;
import kotlin.text.CatchingFishOkHttpSnackbar;
import kotlin.text.CatchingFishReduxMVVM;
import kotlin.text.CatchingFishSpannableJUnit;
import kotlin.text.CatchingFishSpannableLayout;
import kotlin.text.CatchingFishToastHiltBundle;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishWebsocketOkHttp;
import kotlin.text.CatchingFishWidgetContext;
import kotlin.text.CatchingFishXMLLayoutAdMob;
import kotlin.text.CatchingFishXMLLayoutIntent;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary {
    public static final Object CatchingFishCloudMessaging = new Object();
    public static final CatchingFishCameraXRetrofit CatchingFishEspressoTesting = new CatchingFishCameraXRetrofit(0);
    public final CatchingFishOkHttpSnackbar CatchingFishCoroutine;
    public final Context CatchingFishParcelableFAB;
    public final CatchingFishSpannableJUnit CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public final CatchingFishLiveDataHandler CatchingFishViewModelFAB;
    public final CatchingFishWebsocketOkHttp CatchingFishViewModelScope;
    public final AtomicBoolean CatchingFishDaggerWebsocket = new AtomicBoolean(false);
    public final AtomicBoolean CatchingFishWorkManager = new AtomicBoolean();
    public final CopyOnWriteArrayList CatchingFishLayout = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList CatchingFishFragmentHandler = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public CatchingFishPagingLibrary(Context context, String str, CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar) {
        ?? arrayList;
        int i = 0;
        this.CatchingFishParcelableFAB = context;
        CatchingFishToastHiltBundle.CatchingFishEspressoTesting(str);
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = catchingFishOkHttpSnackbar;
        CatchingFishReduxMVVM catchingFishReduxMVVM = FirebaseInitProvider.CatchingFishReduxKtor;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new CatchingFishMVIStateFlow(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        CatchingFishMVVMMVIGson catchingFishMVVMMVIGson = CatchingFishMVVMMVIGson.CatchingFishReduxKtor;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new CatchingFishMVIStateFlow(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new CatchingFishMVIStateFlow(i2, new ExecutorsRegistrar()));
        arrayList4.add(CatchingFishToastKtor.CatchingFishCoroutine(context, Context.class, new Class[0]));
        arrayList4.add(CatchingFishToastKtor.CatchingFishCoroutine(this, CatchingFishPagingLibrary.class, new Class[0]));
        arrayList4.add(CatchingFishToastKtor.CatchingFishCoroutine(catchingFishOkHttpSnackbar, CatchingFishOkHttpSnackbar.class, new Class[0]));
        CatchingFishWidgetContext catchingFishWidgetContext = new CatchingFishWidgetContext();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.CatchingFishDaggerWebsocket.get()) {
            arrayList4.add(CatchingFishToastKtor.CatchingFishCoroutine(catchingFishReduxMVVM, CatchingFishReduxMVVM.class, new Class[0]));
        }
        CatchingFishSpannableJUnit catchingFishSpannableJUnit = new CatchingFishSpannableJUnit(arrayList3, arrayList4, catchingFishWidgetContext);
        this.CatchingFishReduxKtor = catchingFishSpannableJUnit;
        Trace.endSection();
        this.CatchingFishViewModelScope = new CatchingFishWebsocketOkHttp(new CatchingFishXMLLayoutIntent(2, this, context));
        this.CatchingFishViewModelFAB = catchingFishSpannableJUnit.CatchingFishReduxKtor(CatchingFishXMLLayoutAdMob.class);
        CatchingFishContextKtorFlux catchingFishContextKtorFlux = new CatchingFishContextKtorFlux(this);
        CatchingFishParcelableFAB();
        if (this.CatchingFishDaggerWebsocket.get()) {
            CatchingFishMockkExoPlayer.CatchingFishViewModelFAB.CatchingFishReduxKtor.get();
        }
        this.CatchingFishLayout.add(catchingFishContextKtorFlux);
        Trace.endSection();
    }

    public static CatchingFishPagingLibrary CatchingFishDaggerWebsocket(Context context, CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar) {
        CatchingFishPagingLibrary catchingFishPagingLibrary;
        AtomicReference atomicReference = CatchingFishSpannableLayout.CatchingFishParcelableFAB;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = CatchingFishSpannableLayout.CatchingFishParcelableFAB;
            if (atomicReference2.get() == null) {
                CatchingFishSpannableLayout catchingFishSpannableLayout = new CatchingFishSpannableLayout();
                while (true) {
                    if (atomicReference2.compareAndSet(null, catchingFishSpannableLayout)) {
                        CatchingFishMockkExoPlayer.CatchingFishParcelableFAB(application);
                        CatchingFishMockkExoPlayer catchingFishMockkExoPlayer = CatchingFishMockkExoPlayer.CatchingFishViewModelFAB;
                        catchingFishMockkExoPlayer.getClass();
                        synchronized (catchingFishMockkExoPlayer) {
                            catchingFishMockkExoPlayer.CatchingFishWorkManager.add(catchingFishSpannableLayout);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (CatchingFishCloudMessaging) {
            CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = CatchingFishEspressoTesting;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (catchingFishCameraXRetrofit.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(String.valueOf(str));
            }
            CatchingFishToastHiltBundle.CatchingFishStateLiveData(context, "Application context cannot be null.");
            catchingFishPagingLibrary = new CatchingFishPagingLibrary(context, "[DEFAULT]", catchingFishOkHttpSnackbar);
            catchingFishCameraXRetrofit.put("[DEFAULT]", catchingFishPagingLibrary);
        }
        catchingFishPagingLibrary.CatchingFishReduxKtor();
        return catchingFishPagingLibrary;
    }

    public static CatchingFishPagingLibrary CatchingFishSnackbar() {
        CatchingFishPagingLibrary catchingFishPagingLibrary;
        synchronized (CatchingFishCloudMessaging) {
            try {
                catchingFishPagingLibrary = (CatchingFishPagingLibrary) CatchingFishEspressoTesting.get("[DEFAULT]");
                if (catchingFishPagingLibrary == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + CatchingFishKtorViewModel.CatchingFishUnitTesting() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((CatchingFishXMLLayoutAdMob) catchingFishPagingLibrary.CatchingFishViewModelFAB.get()).CatchingFishSnackbar();
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishPagingLibrary;
    }

    public final String CatchingFishCoroutine() {
        StringBuilder sb = new StringBuilder();
        CatchingFishParcelableFAB();
        byte[] bytes = this.CatchingFishSnackbar.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        CatchingFishParcelableFAB();
        byte[] bytes2 = this.CatchingFishCoroutine.CatchingFishSnackbar.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishWorkManager.get()) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public final void CatchingFishReduxKtor() {
        HashMap hashMap;
        if (!((UserManager) this.CatchingFishParcelableFAB.getSystemService(UserManager.class)).isUserUnlocked()) {
            CatchingFishParcelableFAB();
            Context context = this.CatchingFishParcelableFAB;
            AtomicReference atomicReference = FirebaseApp$UserUnlockReceiver.CatchingFishSnackbar;
            if (atomicReference.get() == null) {
                FirebaseApp$UserUnlockReceiver firebaseApp$UserUnlockReceiver = new FirebaseApp$UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, firebaseApp$UserUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(firebaseApp$UserUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        CatchingFishParcelableFAB();
        CatchingFishSpannableJUnit catchingFishSpannableJUnit = this.CatchingFishReduxKtor;
        CatchingFishParcelableFAB();
        boolean equals = "[DEFAULT]".equals(this.CatchingFishSnackbar);
        AtomicReference atomicReference2 = (AtomicReference) catchingFishSpannableJUnit.CatchingFishLayout;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (catchingFishSpannableJUnit) {
                    hashMap = new HashMap((HashMap) catchingFishSpannableJUnit.CatchingFishReduxKtor);
                }
                catchingFishSpannableJUnit.CatchingFishLayout(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((CatchingFishXMLLayoutAdMob) this.CatchingFishViewModelFAB.get()).CatchingFishSnackbar();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishPagingLibrary)) {
            return false;
        }
        CatchingFishPagingLibrary catchingFishPagingLibrary = (CatchingFishPagingLibrary) obj;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        return this.CatchingFishSnackbar.equals(catchingFishPagingLibrary.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.hashCode();
    }

    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(this);
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishSnackbar, "name");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishCoroutine, "options");
        return catchingFishViewModelIntent.toString();
    }
}
