package kotlin.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import java.io.IOException;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CatchingFishMVPExoPlayer implements CatchingFishMockkAsyncTask, CatchingFishGlidePayPal, CatchingFishWidgetViewPager, CatchingFishToastToast, CatchingFishJUnitBiometric, CatchingFishViewXMLLayout, CatchingFishMVVMView, CatchingFishMockkService, CatchingFishMVIGlide {
    public final /* synthetic */ int CatchingFishReduxKtor;
    public static final CatchingFishExoPlayerHilt CatchingFishDaggerWebsocket = new CatchingFishExoPlayerHilt();
    public static final CatchingFishMVPExoPlayer CatchingFishWorkManager = new CatchingFishMVPExoPlayer(2);
    public static final CatchingFishMVPExoPlayer CatchingFishViewModelScope = new CatchingFishMVPExoPlayer(3);
    public static final CatchingFishMVPExoPlayer CatchingFishViewModelFAB = new CatchingFishMVPExoPlayer(4);
    public static final /* synthetic */ CatchingFishMVPExoPlayer CatchingFishLayout = new CatchingFishMVPExoPlayer(5);
    public static final CatchingFishMVPExoPlayer CatchingFishFragmentHandler = new CatchingFishMVPExoPlayer(6);
    public static final CatchingFishMVPExoPlayer CatchingFishCloudMessaging = new CatchingFishMVPExoPlayer(7);
    public static final CatchingFishMVPExoPlayer CatchingFishEspressoTesting = new CatchingFishMVPExoPlayer(8);
    public static final /* synthetic */ CatchingFishMVPExoPlayer CatchingFishOkHttp = new CatchingFishMVPExoPlayer(9);

    public /* synthetic */ CatchingFishMVPExoPlayer(int i) {
        this.CatchingFishReduxKtor = i;
    }

    public static void CatchingFishOkHttp(JSONObject jSONObject, JSONObject jSONObject2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(jSONObject, "source");
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                CatchingFishOkHttp((JSONObject) opt, jSONObject2);
            } else {
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(next);
                String obj = opt != null ? opt.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                if (!CatchingFishRoomMVVMWidget.CatchingFishSensorManager(obj) && !obj.equals("null") && !obj.equals("0")) {
                    jSONObject2.put(next, obj);
                }
            }
        }
    }

    public static CatchingFishMVPExoPlayer CatchingFishUnitTesting(Context context, int i) {
        CatchingFishHiltMVPToast.CatchingFishReduxKtor("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, CatchingFishSnackbarPicasso.CatchingFishUnitTesting);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 4);
        CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 9);
        CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        CatchingFishFragmentMVVM.CatchingFishParcelableFAB(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new CatchingFishEspressoTesting(0)).CatchingFishParcelableFAB();
        obtainStyledAttributes.recycle();
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = new CatchingFishMVPExoPlayer(15);
        CatchingFishHiltMVPToast.CatchingFishDaggerWebsocket(rect.left);
        CatchingFishHiltMVPToast.CatchingFishDaggerWebsocket(rect.top);
        CatchingFishHiltMVPToast.CatchingFishDaggerWebsocket(rect.right);
        CatchingFishHiltMVPToast.CatchingFishDaggerWebsocket(rect.bottom);
        return catchingFishMVPExoPlayer;
    }

    public Signature[] CatchingFishAnimationMockk(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // kotlin.text.CatchingFishToastToast
    public long CatchingFishCoroutine() {
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return CatchingFishToastFragment.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishMockkService
    public Typeface CatchingFishDaggerWebsocket(CatchingFishFragmentToolbar catchingFishFragmentToolbar, int i) {
        return (i == 0 && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFragmentToolbar, CatchingFishFragmentToolbar.CatchingFishWorkManager)) ? Typeface.DEFAULT : Typeface.defaultFromStyle(CatchingFishAdMobFAB.CatchingFishParcelableFlux(catchingFishFragmentToolbar, i));
    }

    public void CatchingFishEspressoTesting(AppCompatActivity appCompatActivity, View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "rootView");
        CatchingFishLayoutLayout catchingFishLayoutLayout = new CatchingFishLayoutLayout(2);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        CatchingFishGlideFlux.CatchingFishCoroutine(view, catchingFishLayoutLayout);
        boolean z = (appCompatActivity.getResources().getConfiguration().uiMode & 48) == 32;
        appCompatActivity.getWindow().setStatusBarColor(appCompatActivity.getColor(z ? R.color.black : R.color.white));
        Window window = appCompatActivity.getWindow();
        CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(appCompatActivity.getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new CatchingFishPicassoGson(window, catchingFishGradleMVVM) : i >= 30 ? new CatchingFishDaggerHiltMVVM(window, catchingFishGradleMVVM) : i >= 26 ? new CatchingFishGraphQLFluxFlux(window, catchingFishGradleMVVM) : new CatchingFishMVPRetrofit(window, catchingFishGradleMVVM)).CatchingFishJobScheduler(!z);
    }

    @Override // kotlin.text.CatchingFishJUnitBiometric
    public Object CatchingFishFragmentHandler(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        if (catchingFishWorkManagerMVP.CatchingFishViewModelFAB()) {
            return (Bundle) catchingFishWorkManagerMVP.CatchingFishWorkManager();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(catchingFishWorkManagerMVP.CatchingFishDaggerWebsocket()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", catchingFishWorkManagerMVP.CatchingFishDaggerWebsocket());
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public void CatchingFishLayout(CatchingFishBiometricRoom catchingFishBiometricRoom, long j, CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, boolean z) {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishBiometricRoom.CatchingFishJobScheduler;
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB;
        CatchingFishMockkLiveData catchingFishMockkLiveData = CatchingFishDaggerToolbar.CatchingFishCameraXIntent;
        ((CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB).CatchingFishLifecycle(CatchingFishDaggerToolbar.CatchingFishGradleManifest, catchingFishDaggerToolbar.CatchingFishKtorService(j), catchingFishStripeAPIOkHttp, 1, z);
    }

    @Override // kotlin.text.CatchingFishToastToast
    public float CatchingFishParcelableFAB() {
        return Float.NaN;
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public int CatchingFishReduxKtor() {
        return 8;
    }

    @Override // kotlin.text.CatchingFishWidgetViewPager
    public boolean CatchingFishSnackbar(Object obj, Object obj2) {
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            default:
                if (obj == obj2) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public boolean CatchingFishViewModelFAB(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        CatchingFishMVPMotionLayout CatchingFish = catchingFishBiometricRoom.CatchingFish();
        boolean z = false;
        if (CatchingFish != null && CatchingFish.CatchingFishViewModelScope) {
            z = true;
        }
        return !z;
    }

    @Override // kotlin.text.CatchingFishToastToast
    public CatchingFishRobolectricHilt CatchingFishViewModelScope() {
        return null;
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        Object CatchingFishWorkManager2 = catchingFishViewWorkManager.CatchingFishWorkManager(new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, Executor.class));
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishWorkManager2, "get(...)");
        return new CatchingFishGradleMVP((Executor) CatchingFishWorkManager2);
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return "NeverEqualPolicy";
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return "ReferentialEqualityPolicy";
            case 28:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ CatchingFishMVPExoPlayer(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
    }

    public CatchingFishMVPExoPlayer(CatchingFishWidgetContext catchingFishWidgetContext, CatchingFishWidgetContext catchingFishWidgetContext2) {
        this.CatchingFishReduxKtor = 10;
    }

    public CatchingFishMVPExoPlayer(MainActivity mainActivity, String str) {
        this.CatchingFishReduxKtor = 11;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "applicationToken");
    }

    @Override // kotlin.text.CatchingFishMVVMView
    public void CatchingFishCloudMessaging(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
    }

    @Override // kotlin.text.CatchingFishMVIGlide
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // kotlin.text.CatchingFishMVIGlide
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
