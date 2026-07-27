package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.catchingfish.fishcatcherpro.R;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishAdMobCameraXFAB extends CatchingFishGlideFABHilt {
    public static final PathInterpolator CatchingFishDaggerWebsocket = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final CatchingFishLayoutRetrofit CatchingFishWorkManager = new CatchingFishLayoutRetrofit();
    public static final DecelerateInterpolator CatchingFishViewModelScope = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator CatchingFishViewModelFAB = new AccelerateInterpolator(1.5f);

    public static CatchingFishReduxLayout CatchingFishCloudMessaging(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof CatchingFishGlideAdMobHilt) {
            return ((CatchingFishGlideAdMobHilt) tag).CatchingFishParcelableFAB;
        }
        return null;
    }

    public static WindowInsets CatchingFishFragmentHandler(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static void CatchingFishLayout(View view, CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        CatchingFishReduxLayout CatchingFishCloudMessaging = CatchingFishCloudMessaging(view);
        if (CatchingFishCloudMessaging != null) {
            CatchingFishCloudMessaging.CatchingFishViewModelScope(catchingFishGoogleMapsJUnit, catchingFishViewModelIntent);
            if (CatchingFishCloudMessaging.CatchingFishReduxKtor == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                CatchingFishLayout(viewGroup.getChildAt(i), catchingFishGoogleMapsJUnit, catchingFishViewModelIntent);
            }
        }
    }

    public static void CatchingFishViewModelFAB(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, List list) {
        CatchingFishReduxLayout CatchingFishCloudMessaging = CatchingFishCloudMessaging(view);
        if (CatchingFishCloudMessaging != null) {
            catchingFishKtorPicassoMVVM = CatchingFishCloudMessaging.CatchingFishWorkManager(catchingFishKtorPicassoMVVM, list);
            if (CatchingFishCloudMessaging.CatchingFishReduxKtor == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                CatchingFishViewModelFAB(viewGroup.getChildAt(i), catchingFishKtorPicassoMVVM, list);
            }
        }
    }

    public static void CatchingFishViewModelScope(View view, CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, boolean z) {
        CatchingFishReduxLayout CatchingFishCloudMessaging = CatchingFishCloudMessaging(view);
        if (CatchingFishCloudMessaging != null) {
            CatchingFishCloudMessaging.CatchingFishDaggerWebsocket = catchingFishKtorPicassoMVVM;
            if (!z) {
                CatchingFishCloudMessaging.CatchingFishDaggerWebsocket(catchingFishGoogleMapsJUnit);
                z = CatchingFishCloudMessaging.CatchingFishReduxKtor == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                CatchingFishViewModelScope(viewGroup.getChildAt(i), catchingFishGoogleMapsJUnit, catchingFishKtorPicassoMVVM, z);
            }
        }
    }

    public static void CatchingFishWorkManager(View view, CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit) {
        CatchingFishReduxLayout CatchingFishCloudMessaging = CatchingFishCloudMessaging(view);
        if (CatchingFishCloudMessaging != null) {
            CatchingFishCloudMessaging.CatchingFishReduxKtor(catchingFishGoogleMapsJUnit);
            if (CatchingFishCloudMessaging.CatchingFishReduxKtor == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                CatchingFishWorkManager(viewGroup.getChildAt(i), catchingFishGoogleMapsJUnit);
            }
        }
    }
}
