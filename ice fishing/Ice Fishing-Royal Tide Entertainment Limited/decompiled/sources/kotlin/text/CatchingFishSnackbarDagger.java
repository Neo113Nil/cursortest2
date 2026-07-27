package kotlin.text;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.catchingfish.fishcatcherpro.R;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishSnackbarDagger {
    public static final LinkedHashMap CatchingFishParcelableFAB = new LinkedHashMap();

    public static final CatchingFishReduxMVI CatchingFishParcelableFAB(Context context) {
        CatchingFishReduxMVI catchingFishReduxMVI;
        LinkedHashMap linkedHashMap = CatchingFishParcelableFAB;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    CatchingFishPicassoCameraX CatchingFishParcelableFAB2 = CatchingFishAdMobFAB.CatchingFishParcelableFAB(-1, null, 6);
                    CatchingFishEspressoPayPal catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(new CatchingFishWidgetFABLayout(contentResolver, uriFor, new CatchingFishCustomViewGson(CatchingFishParcelableFAB2, CatchingFishGsonCardView.CatchingFishUnitTesting(Looper.getMainLooper())), CatchingFishParcelableFAB2, context, null));
                    CatchingFishDaggerToast catchingFishDaggerToast = new CatchingFishDaggerToast(null);
                    CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                    obj = CatchingFishBiometricBundle.CatchingFishPayPalLiveData(catchingFishEspressoPayPal, new CatchingFishFABCoroutine(CatchingFishAdMobFAB.CatchingFishMutableLiveData(catchingFishDaggerToast, CatchingFishPayPalLayout.CatchingFishParcelableFAB)), new CatchingFishRealmParcelable(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                catchingFishReduxMVI = (CatchingFishReduxMVI) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishReduxMVI;
    }

    public static final CatchingFishMVIWebSocket CatchingFishSnackbar(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CatchingFishMVIWebSocket) {
            return (CatchingFishMVIWebSocket) tag;
        }
        return null;
    }
}
