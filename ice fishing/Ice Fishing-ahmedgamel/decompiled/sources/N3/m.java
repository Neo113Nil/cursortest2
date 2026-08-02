package N3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import c3.AbstractC0549a;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.LD;
import com.google.android.play.core.hsdp.service.HsdpLoadingPanelContainer;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import h.C4543G;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m implements InterfaceC0324b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1994a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.c f1995b;

    /* renamed from: c, reason: collision with root package name */
    public final f3.c f1996c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1997d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1998e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1999f;

    /* renamed from: g, reason: collision with root package name */
    public final b3.e f2000g;

    /* renamed from: h, reason: collision with root package name */
    public h f2001h;

    public m(Context context, f3.c cVar, f3.c cVar2, boolean z6, boolean z9, boolean z10) {
        boolean z11 = false;
        if (z10 && (context instanceof Activity)) {
            z11 = true;
        }
        b3.e eVar = context instanceof Activity ? new b3.e((Activity) context) : null;
        this.f2001h = null;
        this.f1994a = context;
        this.f1995b = cVar;
        this.f1996c = cVar2;
        this.f1997d = z6;
        this.f1998e = z9;
        this.f1999f = z11;
        this.f2000g = eVar;
    }

    public static void e(String str, C4543G c4543g, HashMap hashMap, x xVar, Activity activity) {
        int T8 = C.T(activity, activity.getResources().getConfiguration().screenWidthDp);
        int W3 = C.W(activity);
        A a9 = (A) xVar;
        Activity activity2 = a9.f1957b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            throw new IllegalStateException("Window token is null, cannot open HPOA service.");
        }
        z zVar = new z(a9, str, packageName, windowToken, T8, W3, c4543g, hashMap);
        v vVar = a9.f1956a;
        if (vVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.anythink.expressad.videocommon.e.b.f23194u, str);
        bundle.putString("callerId", packageName);
        bundle.putBinder("windowToken", windowToken);
        vVar.a(new E2.x(7, a9, bundle, zVar));
    }

    public final void a(String str) {
        g gVar = (g) ((B) this.f1996c.c());
        if (((o) gVar.f1973c.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", gVar.f1971a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.0.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            gVar.f1972b.a(new LD(18, gVar, bundle));
        }
        c();
    }

    public final void b(String str, String str2, C4543G c4543g, HashMap hashMap, boolean z6) {
        Context context = this.f1994a;
        Intent x9 = Q3.b.x(str, str2, context.getPackageName(), hashMap);
        if (!this.f1998e) {
            Activity activity = (Activity) context;
            if (this.f2000g == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
            }
            x9.addFlags(536870912);
            x9.addFlags(262144);
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(x9, com.anythink.basead.exoplayer.b.aX);
            f3.c cVar = this.f1995b;
            if (resolveActivity != null) {
                d();
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity found.");
                activity.startActivityForResult(x9, 0);
                e(str, c4543g, hashMap, (x) cVar.c(), activity);
                return;
            }
            if (!this.f1997d) {
                activity.startActivityForResult(Q3.b.v(str, str2, hashMap), 0);
                return;
            } else {
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity not found. Ignoring error and still showing HPOA affordance.");
                e(str, c4543g, hashMap, (x) cVar.c(), activity);
                return;
            }
        }
        Uri data = x9.getData();
        if (data == null) {
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "Deeplink URL is null.");
            c4543g.K(bundle);
            return;
        }
        String uri = data.toString();
        if (context instanceof Activity) {
            Activity activity2 = (Activity) context;
            f3.c cVar2 = this.f1996c;
            IInterface iInterface = (M3.g) ((g) ((B) cVar2.c())).f1972b.f2023k;
            if (iInterface == null || !((AbstractC0549a) iInterface).f5722u.isBinderAlive()) {
                d();
            }
            ((g) ((B) cVar2.c())).a(str, uri, activity2.getWindow().getDecorView().getWindowToken(), C.T(activity2, activity2.getResources().getConfiguration().screenWidthDp), C.W(activity2), z6, !this.f1999f ? new i(this, c4543g, activity2, str, str2, hashMap) : new l(this, c4543g, activity2, str, str2, hashMap));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
        intent.putExtra("target_package_name", str);
        intent.putExtra("referrer", str2);
        intent.putExtra("auto_trigger", z6);
        intent.putExtra("deeplink_url", uri);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle2.putString((String) entry.getKey(), (String) entry.getValue());
        }
        intent.putExtra("extra_query_params_bundle", bundle2);
        intent.addFlags(262144);
        intent.addFlags(268435456);
        Log.i("HsdpDeepLinkServiceImpl", "Starting HSDP Shim Activity.");
        context.startActivity(intent);
    }

    public final void c() {
        if (this.f1999f) {
            Activity activity = (Activity) this.f1994a;
            b3.e eVar = this.f2000g;
            if (eVar == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when loading panel is enabled.");
            }
            eVar.L();
            if (this.f2001h != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.f2001h);
                this.f2001h = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        Resources resources;
        int identifier;
        Drawable drawable;
        boolean z6;
        int i = 4;
        if (this.f1999f) {
            Activity activity = (Activity) this.f1994a;
            b3.e eVar = this.f2000g;
            if (eVar == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when enabling loading panel.");
            }
            if (((View) eVar.f5559w) == null) {
                if (this.f2001h != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this.f2001h);
                }
                this.f2001h = new h(this, activity);
                activity.getApplication().registerActivityLifecycleCallbacks(this.f2001h);
                Log.i("HsdpLoadingPanel", "try to showLoading");
                if (((View) eVar.f5559w) != null) {
                    return;
                }
                Log.i("HsdpLoadingPanel", "showLoading");
                Activity activity2 = (Activity) eVar.f5557u;
                View inflate = LayoutInflater.from(activity2).inflate(C5248R.layout.sdk_loading_panel, (ViewGroup) null);
                if (inflate == null) {
                    Log.e("HsdpLoadingPanel", "Failed to inflate loading panel layout.");
                    return;
                }
                eVar.f5559w = inflate;
                ((HsdpLoadingPanelContainer) inflate).setOnConfigurationChangedListener(new G0.c(i, eVar));
                View findViewById = inflate.findViewById(C5248R.id.hsdp_service_prism_with_loading_indicator);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                try {
                    resources = activity2.getPackageManager().getResourcesForApplication("com.android.vending");
                } catch (Exception e9) {
                    Log.e("HsdpLoadingPanel", "Error getting resources for com.android.vending", e9);
                    resources = null;
                }
                ImageView imageView = (ImageView) inflate.findViewById(C5248R.id.play_prism);
                if (imageView != null) {
                    if (resources != null) {
                        try {
                            int identifier2 = resources.getIdentifier("product_logo_play_prism_color_24", com.anythink.expressad.foundation.h.k.f20419c, "com.android.vending");
                            if (identifier2 != 0) {
                                imageView.setImageDrawable(resources.getDrawable(identifier2, activity2.getTheme()));
                                Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon as drawable from com.android.vending.");
                            }
                        } catch (RuntimeException e10) {
                            Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from com.android.vending.", e10);
                        }
                    }
                    try {
                        imageView.setImageResource(C5248R.drawable.logo_play_prism_24dp);
                        Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon from local resources.");
                    } catch (RuntimeException e11) {
                        Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from local resources.", e11);
                        Log.e("HsdpLoadingPanel", "Failed to load Play Prism icon.");
                        eVar.f5559w = null;
                        return;
                    }
                }
                ImageButton imageButton = (ImageButton) inflate.findViewById(C5248R.id.sdk_dismiss_button);
                if (imageButton != null) {
                    int a9 = E.b.a(activity2, eVar.M() ? C5248R.color.dismiss_icon_grey_500 : C5248R.color.dismiss_icon_grey_700);
                    if (resources != null) {
                        try {
                            int identifier3 = resources.getIdentifier(eVar.M() ? "grey_500" : "grey_700", com.anythink.expressad.foundation.h.k.f20420d, "com.android.vending");
                            if (identifier3 != 0) {
                                a9 = resources.getColor(identifier3, activity2.getTheme());
                            } else {
                                Log.w("HsdpLoadingPanel", "Could not load grey_500/grey_700 color from com.android.vending, falling back to local resources.");
                            }
                            identifier = resources.getIdentifier("gs_close_rond100_vd_theme_24", com.anythink.expressad.foundation.h.k.f20419c, "com.android.vending");
                        } catch (RuntimeException e12) {
                            Log.e("HsdpLoadingPanel", "Error loading dismiss icon from com.android.vending.", e12);
                        }
                        if (identifier != 0) {
                            drawable = resources.getDrawable(identifier, activity2.getTheme());
                            z6 = true;
                            if (drawable == null) {
                                drawable = com.bumptech.glide.g.h(activity2, R.drawable.ic_menu_close_clear_cancel);
                                z6 = false;
                            }
                            if (drawable != null) {
                                Log.e("HsdpLoadingPanel", "Failed to load dismiss button.");
                                eVar.f5559w = null;
                                return;
                            } else {
                                H.a.g(drawable, a9);
                                imageButton.setImageDrawable(drawable);
                                imageButton.setOnClickListener(new n(eVar));
                                Log.i("HsdpLoadingPanel", "Successfully loaded and tinted dismiss icon from ".concat(true != z6 ? "local resources." : "com.android.vending."));
                            }
                        } else {
                            Log.w("HsdpLoadingPanel", "Drawable resource 'gs_close_rond100_vd_theme_24' not found in com.android.vending");
                        }
                    }
                    drawable = null;
                    z6 = false;
                    if (drawable == null) {
                    }
                    if (drawable != null) {
                    }
                }
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C5248R.id.content_frame);
                if (frameLayout == null) {
                    Log.e("HsdpLoadingPanel", "content_frame not found in the layout.");
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(new float[]{C.T(activity2, 28), C.T(activity2, 28), C.T(activity2, 28), C.T(activity2, 28), 0.0f, 0.0f, 0.0f, 0.0f});
                    gradientDrawable.setColor(E.b.a(activity2, eVar.M() ? C5248R.color.background_dark : C5248R.color.background_light));
                    frameLayout.setBackground(gradientDrawable);
                    frameLayout.setClipToOutline(true);
                }
                View findViewById2 = inflate.findViewById(C5248R.id.placeholder_loading);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                try {
                    int W3 = C.W(activity2);
                    int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(C5248R.dimen.sdk_hsdp_loading_ui_height);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 40, -3);
                    layoutParams.height = Math.min(activity2.getResources().getDimensionPixelSize(C5248R.dimen.sdk_hsdp_loading_ui_height), (int) (C.W(activity2) * 0.6f));
                    if (activity2.getResources().getConfiguration().screenWidthDp > 640) {
                        layoutParams.width = C.T(activity2, 640);
                    }
                    layoutParams.gravity = 81;
                    Log.i("HsdpLoadingPanel", "screenHeight: " + W3 + ", loadingUiHeight: " + dimensionPixelSize + ", wmParams.y: " + layoutParams.y);
                    ((WindowManager) eVar.f5558v).addView(inflate, layoutParams);
                    Log.i("HsdpLoadingPanel", "Successfully added view to WindowManager. loadingView size: " + inflate.getWidth() + "x" + inflate.getHeight());
                    FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C5248R.id.content_frame);
                    if (frameLayout2 != null) {
                        Log.i("HsdpLoadingPanel", "contentFrame size: " + frameLayout2.getWidth() + "x" + frameLayout2.getHeight());
                    }
                } catch (RuntimeException e13) {
                    Log.e("HsdpLoadingPanel", "Error adding view to WindowManager", e13);
                    eVar.f5559w = null;
                }
            }
        }
    }
}
