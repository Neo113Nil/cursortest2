package kotlin.text;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.catchingfish.fishcatcherpro.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXPicasso implements CatchingFishLiveDataDagger, CatchingFishAdMobOkHttp, CatchingFishDaggerAdMob {
    public final /* synthetic */ CatchingFishMockkWidgetKtor CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishAndroidXPicasso(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishMockkWidgetKtor;
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt;
        switch (this.CatchingFishReduxKtor) {
            case 2:
                this.CatchingFishDaggerWebsocket.CatchingFishStateLiveData(catchingFishSharedFlowAdMob);
                break;
            default:
                CatchingFishSharedFlowAdMob CatchingFishCloudMessaging = catchingFishSharedFlowAdMob.CatchingFishCloudMessaging();
                int i = 0;
                boolean z2 = CatchingFishCloudMessaging != catchingFishSharedFlowAdMob;
                if (z2) {
                    catchingFishSharedFlowAdMob = CatchingFishCloudMessaging;
                }
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishDaggerWebsocket;
                CatchingFishDaggerHiltHilt[] catchingFishDaggerHiltHiltArr = catchingFishMockkWidgetKtor.CatchingFishMotionLayout;
                int length = catchingFishDaggerHiltHiltArr != null ? catchingFishDaggerHiltHiltArr.length : 0;
                while (true) {
                    if (i >= length) {
                        catchingFishDaggerHiltHilt = null;
                    } else {
                        catchingFishDaggerHiltHilt = catchingFishDaggerHiltHiltArr[i];
                        if (catchingFishDaggerHiltHilt == null || catchingFishDaggerHiltHilt.CatchingFishViewModelFAB != catchingFishSharedFlowAdMob) {
                            i++;
                        }
                    }
                }
                if (catchingFishDaggerHiltHilt != null) {
                    if (!z2) {
                        catchingFishMockkWidgetKtor.CatchingFishRoomDatabase(catchingFishDaggerHiltHilt, z);
                        break;
                    } else {
                        catchingFishMockkWidgetKtor.CatchingFishAnimationMockk(catchingFishDaggerHiltHilt.CatchingFishParcelableFAB, catchingFishDaggerHiltHilt, CatchingFishCloudMessaging);
                        catchingFishMockkWidgetKtor.CatchingFishRoomDatabase(catchingFishDaggerHiltHilt, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishLiveDataDagger
    public CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM2 = catchingFishKtorPicassoMVVM;
        int CatchingFishReduxKtor = catchingFishKtorPicassoMVVM2.CatchingFishReduxKtor();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishDaggerWebsocket;
        Context context = catchingFishMockkWidgetKtor.CatchingFishUnitTesting;
        int CatchingFishReduxKtor2 = catchingFishKtorPicassoMVVM2.CatchingFishReduxKtor();
        ActionBarContextView actionBarContextView = catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.getLayoutParams();
            if (catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.isShown()) {
                if (catchingFishMockkWidgetKtor.CatchingFishMockkOkHttp == null) {
                    catchingFishMockkWidgetKtor.CatchingFishMockkOkHttp = new Rect();
                    catchingFishMockkWidgetKtor.CatchingFishReduxMoshi = new Rect();
                }
                Rect rect = catchingFishMockkWidgetKtor.CatchingFishMockkOkHttp;
                Rect rect2 = catchingFishMockkWidgetKtor.CatchingFishReduxMoshi;
                rect.set(catchingFishKtorPicassoMVVM2.CatchingFishSnackbar(), catchingFishKtorPicassoMVVM2.CatchingFishReduxKtor(), catchingFishKtorPicassoMVVM2.CatchingFishCoroutine(), catchingFishKtorPicassoMVVM2.CatchingFishParcelableFAB());
                ViewGroup viewGroup = catchingFishMockkWidgetKtor.CatchingFishFragmentFactory;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
                    CatchingFishMVIMVVM.CatchingFishParcelableFAB(viewGroup, rect, rect2);
                } else {
                    if (!CatchingFishMVVMGraphQL.CatchingFishParcelableFAB) {
                        CatchingFishMVVMGraphQL.CatchingFishParcelableFAB = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            CatchingFishMVVMGraphQL.CatchingFishSnackbar = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                CatchingFishMVVMGraphQL.CatchingFishSnackbar.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = CatchingFishMVVMGraphQL.CatchingFishSnackbar;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = catchingFishMockkWidgetKtor.CatchingFishFragmentFactory;
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB = CatchingFishStripeAPIHilt.CatchingFishParcelableFAB(viewGroup2);
                int CatchingFishSnackbar = CatchingFishParcelableFAB == null ? 0 : CatchingFishParcelableFAB.CatchingFishSnackbar();
                int CatchingFishCoroutine = CatchingFishParcelableFAB == null ? 0 : CatchingFishParcelableFAB.CatchingFishCoroutine();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                if (i2 <= 0 || catchingFishMockkWidgetKtor.CatchingFishJobScheduler != null) {
                    View view2 = catchingFishMockkWidgetKtor.CatchingFishJobScheduler;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != CatchingFishSnackbar || marginLayoutParams2.rightMargin != CatchingFishCoroutine) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = CatchingFishSnackbar;
                            marginLayoutParams2.rightMargin = CatchingFishCoroutine;
                            catchingFishMockkWidgetKtor.CatchingFishJobScheduler.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    catchingFishMockkWidgetKtor.CatchingFishJobScheduler = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = CatchingFishSnackbar;
                    layoutParams.rightMargin = CatchingFishCoroutine;
                    catchingFishMockkWidgetKtor.CatchingFishFragmentFactory.addView(catchingFishMockkWidgetKtor.CatchingFishJobScheduler, -1, layoutParams);
                }
                View view4 = catchingFishMockkWidgetKtor.CatchingFishJobScheduler;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = catchingFishMockkWidgetKtor.CatchingFishJobScheduler;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!catchingFishMockkWidgetKtor.CatchingFishCameraXIntent && z5) {
                    CatchingFishReduxKtor2 = 0;
                }
                z2 = z3;
                z = z5;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = catchingFishMockkWidgetKtor.CatchingFishJobScheduler;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (CatchingFishReduxKtor != CatchingFishReduxKtor2) {
            int CatchingFishSnackbar2 = catchingFishKtorPicassoMVVM2.CatchingFishSnackbar();
            int CatchingFishCoroutine2 = catchingFishKtorPicassoMVVM2.CatchingFishCoroutine();
            int CatchingFishParcelableFAB2 = catchingFishKtorPicassoMVVM2.CatchingFishParcelableFAB();
            int i7 = Build.VERSION.SDK_INT;
            CatchingFishManifestFABMVI catchingFishRealmView = i7 >= 36 ? new CatchingFishRealmView(catchingFishKtorPicassoMVVM2) : i7 >= 35 ? new CatchingFishRealmHiltGradle(catchingFishKtorPicassoMVVM2) : i7 >= 34 ? new CatchingFishRoomAdMobMVP(catchingFishKtorPicassoMVVM2) : i7 >= 31 ? new CatchingFishJUnitView(catchingFishKtorPicassoMVVM2) : i7 >= 30 ? new CatchingFishMVPLayoutRealm(catchingFishKtorPicassoMVVM2) : i7 >= 29 ? new CatchingFishStateFlowBundle(catchingFishKtorPicassoMVVM2) : new CatchingFishAdMobMVPGlide(catchingFishKtorPicassoMVVM2);
            catchingFishRealmView.CatchingFishViewModelFAB(CatchingFishReduxPayPal.CatchingFishSnackbar(CatchingFishSnackbar2, CatchingFishReduxKtor2, CatchingFishCoroutine2, CatchingFishParcelableFAB2));
            catchingFishKtorPicassoMVVM2 = catchingFishRealmView.CatchingFishSnackbar();
        }
        WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        WindowInsets CatchingFishWorkManager = catchingFishKtorPicassoMVVM2.CatchingFishWorkManager();
        if (CatchingFishWorkManager == null) {
            return catchingFishKtorPicassoMVVM2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(CatchingFishWorkManager);
        return !onApplyWindowInsets.equals(CatchingFishWorkManager) ? CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(view, onApplyWindowInsets) : catchingFishKtorPicassoMVVM2;
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public boolean CatchingFishViewModelScope(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        Window.Callback callback;
        switch (this.CatchingFishReduxKtor) {
            case 2:
                Window.Callback callback2 = this.CatchingFishDaggerWebsocket.CatchingFishAnimationMockk.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, catchingFishSharedFlowAdMob);
                    break;
                }
                break;
            default:
                if (catchingFishSharedFlowAdMob == catchingFishSharedFlowAdMob.CatchingFishCloudMessaging()) {
                    CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishDaggerWebsocket;
                    if (catchingFishMockkWidgetKtor.CatchingFishEspressoMockk && (callback = catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.getCallback()) != null && !catchingFishMockkWidgetKtor.CatchingFishDataStoreIntent) {
                        callback.onMenuOpened(108, catchingFishSharedFlowAdMob);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
