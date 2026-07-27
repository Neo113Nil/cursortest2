package kotlin.text;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishOkHttpLayout implements Runnable {
    public final /* synthetic */ CatchingFishLayoutService CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishOkHttpLayout(CatchingFishLayoutService catchingFishLayoutService, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishLayoutService;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CatchingFishDaggerDataStore CatchingFishGsonAppCompat;
        CatchingFishDaggerDataStore CatchingFishViewModelScope;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                return;
            case 1:
                this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                return;
            default:
                CatchingFishLayoutService catchingFishLayoutService = this.CatchingFishDaggerWebsocket;
                Object obj = CatchingFishLayoutService.CatchingFishOkHttp;
                synchronized (obj) {
                    try {
                        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = catchingFishLayoutService.CatchingFishParcelableFAB;
                        catchingFishPagingLibrary.CatchingFishParcelableFAB();
                        CatchingFishBundleGlide CatchingFishReduxKtor = CatchingFishBundleGlide.CatchingFishReduxKtor(catchingFishPagingLibrary.CatchingFishParcelableFAB);
                        try {
                            CatchingFishGsonAppCompat = catchingFishLayoutService.CatchingFishCoroutine.CatchingFishGsonAppCompat();
                            if (CatchingFishReduxKtor != null) {
                                CatchingFishReduxKtor.CatchingFishFragmentFactory();
                            }
                        } catch (Throwable th) {
                            if (CatchingFishReduxKtor != null) {
                                CatchingFishReduxKtor.CatchingFishFragmentFactory();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = CatchingFishGsonAppCompat.CatchingFishSnackbar;
                    if (!(i == 5)) {
                        if (!(i == 3)) {
                            if (catchingFishLayoutService.CatchingFishReduxKtor.CatchingFishParcelableFAB(CatchingFishGsonAppCompat)) {
                                CatchingFishViewModelScope = catchingFishLayoutService.CatchingFishSnackbar(CatchingFishGsonAppCompat);
                                synchronized (obj) {
                                    try {
                                        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = catchingFishLayoutService.CatchingFishParcelableFAB;
                                        catchingFishPagingLibrary2.CatchingFishParcelableFAB();
                                        CatchingFishBundleGlide CatchingFishReduxKtor2 = CatchingFishBundleGlide.CatchingFishReduxKtor(catchingFishPagingLibrary2.CatchingFishParcelableFAB);
                                        try {
                                            catchingFishLayoutService.CatchingFishCoroutine.CatchingFishAnimationMockk(CatchingFishViewModelScope);
                                            if (CatchingFishReduxKtor2 != null) {
                                                CatchingFishReduxKtor2.CatchingFishFragmentFactory();
                                            }
                                        } catch (Throwable th2) {
                                            if (CatchingFishReduxKtor2 != null) {
                                                CatchingFishReduxKtor2.CatchingFishFragmentFactory();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (catchingFishLayoutService) {
                                    try {
                                        if (catchingFishLayoutService.CatchingFishCloudMessaging.size() != 0 && !TextUtils.equals(CatchingFishGsonAppCompat.CatchingFishParcelableFAB, CatchingFishViewModelScope.CatchingFishParcelableFAB)) {
                                            Iterator it = catchingFishLayoutService.CatchingFishCloudMessaging.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (CatchingFishViewModelScope.CatchingFishSnackbar == 4) {
                                    String str = CatchingFishViewModelScope.CatchingFishParcelableFAB;
                                    synchronized (catchingFishLayoutService) {
                                        catchingFishLayoutService.CatchingFishFragmentHandler = str;
                                    }
                                }
                                int i2 = CatchingFishViewModelScope.CatchingFishSnackbar;
                                if (i2 == 5) {
                                    catchingFishLayoutService.CatchingFishViewModelFAB(new CatchingFishCardViewCameraX());
                                    return;
                                } else if (i2 == 2 || i2 == 1) {
                                    catchingFishLayoutService.CatchingFishViewModelFAB(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    catchingFishLayoutService.CatchingFishLayout(CatchingFishViewModelScope);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    CatchingFishViewModelScope = catchingFishLayoutService.CatchingFishViewModelScope(CatchingFishGsonAppCompat);
                    synchronized (obj) {
                    }
                } catch (CatchingFishCardViewCameraX e) {
                    catchingFishLayoutService.CatchingFishViewModelFAB(e);
                    return;
                }
                break;
        }
    }
}
