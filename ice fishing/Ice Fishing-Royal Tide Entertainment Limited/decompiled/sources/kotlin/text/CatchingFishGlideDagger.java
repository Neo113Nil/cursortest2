package kotlin.text;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishGlideDagger {
    public static volatile CatchingFishSpannablePayPal CatchingFishDaggerWebsocket;
    public final CatchingFishToastHandler CatchingFishCoroutine;
    public final CatchingFishMVIWorkManager CatchingFishParcelableFAB;
    public final CatchingFishGsonRetrofit CatchingFishReduxKtor;
    public final CatchingFishMVIWorkManager CatchingFishSnackbar;

    public CatchingFishGlideDagger(CatchingFishMVIWorkManager catchingFishMVIWorkManager, CatchingFishMVIWorkManager catchingFishMVIWorkManager2, CatchingFishToastHandler catchingFishToastHandler, CatchingFishGsonRetrofit catchingFishGsonRetrofit, CatchingFishMVIAppCompat catchingFishMVIAppCompat) {
        this.CatchingFishParcelableFAB = catchingFishMVIWorkManager;
        this.CatchingFishSnackbar = catchingFishMVIWorkManager2;
        this.CatchingFishCoroutine = catchingFishToastHandler;
        this.CatchingFishReduxKtor = catchingFishGsonRetrofit;
        catchingFishMVIAppCompat.CatchingFishParcelableFAB.execute(new CatchingFishMVPLayout(24, catchingFishMVIAppCompat));
    }

    public static CatchingFishGlideDagger CatchingFishParcelableFAB() {
        CatchingFishSpannablePayPal catchingFishSpannablePayPal = CatchingFishDaggerWebsocket;
        if (catchingFishSpannablePayPal != null) {
            return (CatchingFishGlideDagger) catchingFishSpannablePayPal.CatchingFishLayout.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void CatchingFishSnackbar(Context context) {
        if (CatchingFishDaggerWebsocket == null) {
            synchronized (CatchingFishGlideDagger.class) {
                try {
                    if (CatchingFishDaggerWebsocket == null) {
                        CatchingFishFluxDataStore catchingFishFluxDataStore = new CatchingFishFluxDataStore();
                        context.getClass();
                        catchingFishFluxDataStore.CatchingFishParcelableFAB = context;
                        CatchingFishDaggerWebsocket = catchingFishFluxDataStore.CatchingFishSnackbar();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final CatchingFishGsonMVVM CatchingFishCoroutine(CatchingFishReduxToast catchingFishReduxToast) {
        byte[] bytes;
        Set unmodifiableSet = catchingFishReduxToast != null ? Collections.unmodifiableSet(CatchingFishWidgetMVVM.CatchingFishReduxKtor) : Collections.singleton(new CatchingFishBiometricIntent("proto"));
        CatchingFishAsyncTaskDagger CatchingFishParcelableFAB = CatchingFishBundleMVIHilt.CatchingFishParcelableFAB();
        catchingFishReduxToast.getClass();
        CatchingFishParcelableFAB.CatchingFishDaggerWebsocket = "cct";
        CatchingFishWidgetMVVM catchingFishWidgetMVVM = (CatchingFishWidgetMVVM) catchingFishReduxToast;
        String str = catchingFishWidgetMVVM.CatchingFishParcelableFAB;
        String str2 = catchingFishWidgetMVVM.CatchingFishSnackbar;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName(Constants.ENCODING));
        }
        CatchingFishParcelableFAB.CatchingFishWorkManager = bytes;
        return new CatchingFishGsonMVVM(unmodifiableSet, CatchingFishParcelableFAB.CatchingFishCoroutineFlow(), this);
    }
}
