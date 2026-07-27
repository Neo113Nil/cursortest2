package kotlin.text;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class CatchingFishWebSocketIntent implements Application.ActivityLifecycleCallbacks {
    public final ArrayDeque CatchingFishReduxKtor = new ArrayDeque(10);

    public final void CatchingFishParcelableFAB(Intent intent) {
        ArrayDeque arrayDeque = this.CatchingFishReduxKtor;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
                com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
                CatchingFishSnackbar.CatchingFishParcelableFAB();
                if (CatchingFishSnackbar.CatchingFishReduxKtor.CatchingFishParcelableFAB(CatchingFishBiometric.class) != null) {
                    throw new ClassCastException();
                }
            }
            CatchingFishDaggerBiometric.CatchingFishCardViewView("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new CatchingFishEspressoFlux(9, this, intent));
        } else {
            CatchingFishParcelableFAB(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
