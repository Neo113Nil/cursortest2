package kotlin.text;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishLayoutLayout implements CatchingFishLiveDataDagger, CatchingFishReduxGson, CatchingFishMockkAsyncTask, CatchingFishAndroidXOkHttp, CatchingFishJUnitBiometric, CatchingFishManifestDagger {
    public static final CatchingFishLayoutLayout CatchingFishDaggerWebsocket = new CatchingFishLayoutLayout(0);
    public static final CatchingFishLayoutLayout CatchingFishWorkManager = new CatchingFishLayoutLayout(1);
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishLayoutLayout(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishReduxGson
    public double CatchingFishCoroutine(double d) {
        switch (this.CatchingFishReduxKtor) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                float[] fArr = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                return CatchingFishSnackbarGlide.CatchingFishSnackbar(CatchingFishSnackbarGlide.CatchingFishCoroutine, d);
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(CatchingFishSnackbarGlide.CatchingFishCoroutine, d);
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                return CatchingFishSnackbarGlide.CatchingFishReduxKtor(CatchingFishSnackbarGlide.CatchingFishReduxKtor, d);
            default:
                float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                return CatchingFishSnackbarGlide.CatchingFishCoroutine(CatchingFishSnackbarGlide.CatchingFishReduxKtor, d);
        }
    }

    @Override // kotlin.text.CatchingFishJUnitBiometric
    public Object CatchingFishFragmentHandler(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        int i;
        Object obj;
        switch (this.CatchingFishReduxKtor) {
            case 18:
                i = 403;
                break;
            case 19:
                i = -1;
                break;
            default:
                synchronized (catchingFishWorkManagerMVP.CatchingFishParcelableFAB) {
                    if (!catchingFishWorkManagerMVP.CatchingFishCoroutine) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    if (catchingFishWorkManagerMVP.CatchingFishReduxKtor) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(catchingFishWorkManagerMVP.CatchingFishWorkManager)) {
                        throw ((Throwable) IOException.class.cast(catchingFishWorkManagerMVP.CatchingFishWorkManager));
                    }
                    Exception exc = catchingFishWorkManagerMVP.CatchingFishWorkManager;
                    if (exc != null) {
                        throw new CatchingFishDaggerGsonFlux(exc);
                    }
                    obj = catchingFishWorkManagerMVP.CatchingFishDaggerWebsocket;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // kotlin.text.CatchingFishAndroidXOkHttp
    public float CatchingFishParcelableFAB(float f) {
        return f;
    }

    @Override // kotlin.text.CatchingFishManifestDagger
    public String CatchingFishSnackbar(Context context) {
        switch (this.CatchingFishReduxKtor) {
            case 20:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 21:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 22:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.CatchingFishParcelableFAB(installerPackageName) : "";
        }
    }

    @Override // kotlin.text.CatchingFishLiveDataDagger
    public CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        CatchingFishReduxPayPal CatchingFishLayout = catchingFishFragmentHilt.CatchingFishLayout(8);
        CatchingFishReduxPayPal CatchingFishLayout2 = catchingFishFragmentHilt.CatchingFishLayout(519);
        view.setPadding(CatchingFishLayout2.CatchingFishParcelableFAB, CatchingFishLayout2.CatchingFishSnackbar, CatchingFishLayout2.CatchingFishCoroutine, Math.max(CatchingFishLayout.CatchingFishReduxKtor, CatchingFishLayout2.CatchingFishReduxKtor));
        return catchingFishKtorPicassoMVVM;
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        CatchingFishToolbarPayPal lambda$getComponents$0;
        CatchingFishToastAsyncTask lambda$getComponents$02;
        switch (this.CatchingFishReduxKtor) {
            case 9:
                Set CatchingFishSnackbar = catchingFishViewWorkManager.CatchingFishSnackbar(CatchingFishFABDagger.CatchingFishParcelableFAB(CatchingFishSpannableWidget.class));
                CatchingFishServiceHilt catchingFishServiceHilt = CatchingFishServiceHilt.CatchingFishWorkManager;
                if (catchingFishServiceHilt == null) {
                    synchronized (CatchingFishServiceHilt.class) {
                        try {
                            catchingFishServiceHilt = CatchingFishServiceHilt.CatchingFishWorkManager;
                            if (catchingFishServiceHilt == null) {
                                catchingFishServiceHilt = new CatchingFishServiceHilt(0);
                                CatchingFishServiceHilt.CatchingFishWorkManager = catchingFishServiceHilt;
                            }
                        } finally {
                        }
                    }
                }
                return new CatchingFishStripeAPIMVPMVI(CatchingFishSnackbar, catchingFishServiceHilt);
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.CatchingFishParcelableFAB.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.CatchingFishCoroutine.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.CatchingFishSnackbar.get();
            case 17:
                CatchingFishWebsocketOkHttp catchingFishWebsocketOkHttp = ExecutorsRegistrar.CatchingFishParcelableFAB;
                return CatchingFishMVVMMVIGson.CatchingFishReduxKtor;
            case 24:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(catchingFishViewWorkManager);
                return lambda$getComponents$0;
            default:
                lambda$getComponents$02 = FirestoreRegistrar.lambda$getComponents$0(catchingFishViewWorkManager);
                return lambda$getComponents$02;
        }
    }

    public /* synthetic */ CatchingFishLayoutLayout(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
    }
}
