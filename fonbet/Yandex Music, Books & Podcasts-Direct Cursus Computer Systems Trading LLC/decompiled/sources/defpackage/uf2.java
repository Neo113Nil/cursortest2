package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.music.YMApplication;

/* loaded from: classes3.dex */
public final class uf2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public uf2() {
        this.a = 2;
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    if (aec.d().b(p70.class) != null) {
                        l1j.f();
                        return;
                    } else {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            v5g.J(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String N;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                activity.getClass();
                if (activity instanceof t) {
                    wf2 wf2Var = (wf2) this.b;
                    y supportFragmentManager = ((t) activity).getSupportFragmentManager();
                    vf2 vf2Var = wf2Var.d;
                    nnk nnkVar = supportFragmentManager.p;
                    nnkVar.getClass();
                    vf2Var.getClass();
                    ((CopyOnWriteArrayList) nnkVar.b).add(new qtc(vf2Var));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Intent intent = activity.getIntent();
                if (intent != null && ((Set) this.b).add(intent)) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new sr7(14, this, intent));
                        break;
                    }
                }
                break;
            case 3:
                YMApplication yMApplication = (YMApplication) this.b;
                activity.getClass();
                if (activity.getClass().getName().equals("com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity") && !new File(yMApplication.getFilesDir(), "soft_mode_disabled_exp").exists() && (N = a0g.N(yMApplication)) != null && new File(quj.i0(yMApplication), "offline_mode_availability_".concat(N)).exists() && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null) {
                    viewGroup.post(new zvh(12, viewGroup, activity));
                    break;
                }
                break;
            case 4:
                activity.getClass();
                hn5 hn5Var = activity instanceof hn5 ? (hn5) activity : null;
                if (hn5Var != null) {
                    tkk tkkVar = (tkk) this.b;
                    zi3 g = men.g(1, 6, null);
                    zh registerForActivityResult = hn5Var.registerForActivityResult(new vh(3), new gi(7, g));
                    registerForActivityResult.getClass();
                    j0q j0qVar = ((klk) tkkVar.a.getValue()).c;
                    nyf lifecycle = hn5Var.getLifecycle();
                    lifecycle.getClass();
                    ox6.B(kg5.t(j0qVar, lifecycle, lyf.e), wyf.F(hn5Var.getLifecycle()), new tek(hn5Var, registerForActivityResult, g));
                    break;
                } else {
                    ssg.a(6, "PermissionsActivityHolder", "Created activity is not ComponentActivity", null);
                    break;
                }
            default:
                activity.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                wf2 wf2Var = (wf2) this.b;
                if (activity.getClass().getSimpleName().equals("CommunicationTriggerActivity")) {
                    v3w.k("CommunicationTriggerActivity destroyed: ", activity.hashCode(), 3, "AutoplayScreenObserver", null);
                    wf2.a(wf2Var, m73.a);
                    return;
                }
                return;
            case 1:
                Context applicationContext = ((aqb) this.b).a.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
                return;
            case 2:
                return;
            case 3:
                activity.getClass();
                return;
            case 4:
                activity.getClass();
                return;
            default:
                activity.getClass();
                xgd xgdVar = (xgd) this.b;
                synchronized (xgdVar.g) {
                    ((Set) xgdVar.a).remove(activity);
                    xgd.b(xgdVar);
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                return;
            case 1:
                return;
            case 2:
                if (activity.isFinishing()) {
                    ((Set) this.b).remove(activity.getIntent());
                    return;
                }
                return;
            case 3:
                activity.getClass();
                return;
            case 4:
                activity.getClass();
                return;
            default:
                activity.getClass();
                xgd xgdVar = (xgd) this.b;
                synchronized (xgdVar.g) {
                    ((Set) xgdVar.a).add(activity);
                    xgd.b(xgdVar);
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                return;
            case 1:
                aqb aqbVar = (aqb) this.b;
                if (aqbVar.g) {
                    aqbVar.g = false;
                    aqbVar.i().Q0(hap.d);
                    aqbVar.g(aqbVar.i().J0());
                    aqbVar.b();
                    aqbVar.i().Q0(hap.c);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                activity.getClass();
                return;
            case 4:
                activity.getClass();
                return;
            default:
                activity.getClass();
                xgd xgdVar = (xgd) this.b;
                synchronized (xgdVar.g) {
                    ((Set) xgdVar.a).add(activity);
                    xgd.b(xgdVar);
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
            case 3:
            case 4:
            default:
                activity.getClass();
                bundle.getClass();
                break;
            case 1:
            case 2:
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                return;
            case 1:
            case 2:
                return;
            case 3:
                activity.getClass();
                if (activity.getClass().getName().equals("com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity")) {
                    YMApplication yMApplication = (YMApplication) this.b;
                    yMApplication.sendBroadcast(new Intent("ru.yandex.music.VPN_CHALLENGE_SHOWN").setPackage(yMApplication.getPackageName()));
                    return;
                }
                return;
            case 4:
                activity.getClass();
                return;
            default:
                activity.getClass();
                xgd xgdVar = (xgd) this.b;
                synchronized (xgdVar.g) {
                    ((Set) xgdVar.a).add(activity);
                    xgd.b(xgdVar);
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                return;
            case 1:
            case 2:
                return;
            case 3:
                activity.getClass();
                if (activity.getClass().getName().equals("com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity")) {
                    YMApplication yMApplication = (YMApplication) this.b;
                    yMApplication.sendBroadcast(new Intent("ru.yandex.music.VPN_CHALLENGE_HIDDEN").setPackage(yMApplication.getPackageName()));
                    return;
                }
                return;
            case 4:
                activity.getClass();
                return;
            default:
                activity.getClass();
                xgd xgdVar = (xgd) this.b;
                synchronized (xgdVar.g) {
                    ((Set) xgdVar.a).remove(activity);
                    xgd.b(xgdVar);
                }
                return;
        }
    }

    public uf2(flk flkVar, tkk tkkVar) {
        this.a = 4;
        this.b = tkkVar;
    }

    public /* synthetic */ uf2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }

    private final void g(Activity activity, Bundle bundle) {
    }
}
