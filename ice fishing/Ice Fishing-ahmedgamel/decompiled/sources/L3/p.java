package L3;

import a3.AbstractC0432a;
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
import com.google.android.gms.internal.ads.LD;
import com.google.android.play.core.hsdp.service.HsdpLoadingPanelContainer;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import com.icefishing.icefishingbigwin.C5275R;
import g1.C4522b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p implements InterfaceC0316b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1721a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.c f1722b;

    /* renamed from: c, reason: collision with root package name */
    public final d3.c f1723c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1724d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1725e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1726f;

    /* renamed from: g, reason: collision with root package name */
    public final Z2.e f1727g;

    /* renamed from: h, reason: collision with root package name */
    public j f1728h;

    public p(Context context, d3.c cVar, d3.c cVar2, boolean z3, boolean z6, boolean z9) {
        boolean z10 = false;
        if (z9 && (context instanceof Activity)) {
            z10 = true;
        }
        Z2.e eVar = context instanceof Activity ? new Z2.e((Activity) context) : null;
        this.f1728h = null;
        this.f1721a = context;
        this.f1722b = cVar;
        this.f1723c = cVar2;
        this.f1724d = z3;
        this.f1725e = z6;
        this.f1726f = z10;
        this.f1727g = eVar;
    }

    public static void e(String str, C4522b c4522b, HashMap hashMap, A a9, Activity activity) {
        int s9 = d6.c.s(activity, activity.getResources().getConfiguration().screenWidthDp);
        int t6 = d6.c.t(activity);
        D d2 = (D) a9;
        Activity activity2 = d2.f1678b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            throw new IllegalStateException("Window token is null, cannot open HPOA service.");
        }
        C c9 = new C(d2, str, packageName, windowToken, s9, t6, c4522b, hashMap);
        y yVar = d2.f1677a;
        if (yVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.anythink.expressad.videocommon.e.b.f22407u, str);
        bundle.putString("callerId", packageName);
        bundle.putBinder("windowToken", windowToken);
        yVar.a(new C2.y(6, d2, bundle, c9));
    }

    public final void a(String str) {
        g gVar = (g) ((E) this.f1723c.c());
        if (((r) gVar.f1694c.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", gVar.f1692a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.0.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            gVar.f1693b.a(new LD(18, gVar, bundle));
        }
        c();
    }

    public final void b(String str, String str2, C4522b c4522b, HashMap hashMap, boolean z3) {
        Context context = this.f1721a;
        Intent L6 = t8.g.L(str, str2, context.getPackageName(), hashMap);
        if (!this.f1725e) {
            Activity activity = (Activity) context;
            if (this.f1727g == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
            }
            L6.addFlags(536870912);
            L6.addFlags(262144);
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(L6, com.anythink.basead.exoplayer.b.aX);
            d3.c cVar = this.f1722b;
            if (resolveActivity != null) {
                d();
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity found.");
                activity.startActivityForResult(L6, 0);
                e(str, c4522b, hashMap, (A) cVar.c(), activity);
                return;
            }
            if (!this.f1724d) {
                activity.startActivityForResult(t8.g.I(str, str2, hashMap), 0);
                return;
            } else {
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity not found. Ignoring error and still showing HPOA affordance.");
                e(str, c4522b, hashMap, (A) cVar.c(), activity);
                return;
            }
        }
        Uri data = L6.getData();
        if (data == null) {
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "Deeplink URL is null.");
            c4522b.L(bundle);
            return;
        }
        String uri = data.toString();
        if (context instanceof Activity) {
            Activity activity2 = (Activity) context;
            d3.c cVar2 = this.f1723c;
            IInterface iInterface = (K3.g) ((g) ((E) cVar2.c())).f1693b.f1751k;
            if (iInterface == null || !((AbstractC0432a) iInterface).f4329u.isBinderAlive()) {
                d();
            }
            ((g) ((E) cVar2.c())).a(str, uri, activity2.getWindow().getDecorView().getWindowToken(), d6.c.s(activity2, activity2.getResources().getConfiguration().screenWidthDp), d6.c.t(activity2), z3, !this.f1726f ? new k(this, c4522b, activity2, str, str2, hashMap) : new n(this, c4522b, activity2, str, str2, hashMap));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
        intent.putExtra("target_package_name", str);
        intent.putExtra("referrer", str2);
        intent.putExtra("auto_trigger", z3);
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
        if (this.f1726f) {
            Activity activity = (Activity) this.f1721a;
            Z2.e eVar = this.f1727g;
            if (eVar == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when loading panel is enabled.");
            }
            eVar.L();
            if (this.f1728h != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.f1728h);
                this.f1728h = null;
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
        boolean z3;
        int i = 4;
        if (this.f1726f) {
            Activity activity = (Activity) this.f1721a;
            Z2.e eVar = this.f1727g;
            if (eVar == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when enabling loading panel.");
            }
            if (((View) eVar.f4172w) == null) {
                if (this.f1728h != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this.f1728h);
                }
                this.f1728h = new j(this, activity);
                activity.getApplication().registerActivityLifecycleCallbacks(this.f1728h);
                Log.i("HsdpLoadingPanel", "try to showLoading");
                if (((View) eVar.f4172w) != null) {
                    return;
                }
                Log.i("HsdpLoadingPanel", "showLoading");
                Activity activity2 = (Activity) eVar.f4170u;
                View inflate = LayoutInflater.from(activity2).inflate(C5275R.layout.sdk_loading_panel, (ViewGroup) null);
                if (inflate == null) {
                    Log.e("HsdpLoadingPanel", "Failed to inflate loading panel layout.");
                    return;
                }
                eVar.f4172w = inflate;
                ((HsdpLoadingPanelContainer) inflate).setOnConfigurationChangedListener(new G0.c(i, eVar));
                View findViewById = inflate.findViewById(C5275R.id.hsdp_service_prism_with_loading_indicator);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                try {
                    resources = activity2.getPackageManager().getResourcesForApplication("com.android.vending");
                } catch (Exception e9) {
                    Log.e("HsdpLoadingPanel", "Error getting resources for com.android.vending", e9);
                    resources = null;
                }
                ImageView imageView = (ImageView) inflate.findViewById(C5275R.id.play_prism);
                if (imageView != null) {
                    if (resources != null) {
                        try {
                            int identifier2 = resources.getIdentifier("product_logo_play_prism_color_24", com.anythink.expressad.foundation.h.k.f19632c, "com.android.vending");
                            if (identifier2 != 0) {
                                imageView.setImageDrawable(resources.getDrawable(identifier2, activity2.getTheme()));
                                Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon as drawable from com.android.vending.");
                            }
                        } catch (RuntimeException e10) {
                            Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from com.android.vending.", e10);
                        }
                    }
                    try {
                        imageView.setImageResource(C5275R.drawable.logo_play_prism_24dp);
                        Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon from local resources.");
                    } catch (RuntimeException e11) {
                        Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from local resources.", e11);
                        Log.e("HsdpLoadingPanel", "Failed to load Play Prism icon.");
                        eVar.f4172w = null;
                        return;
                    }
                }
                ImageButton imageButton = (ImageButton) inflate.findViewById(C5275R.id.sdk_dismiss_button);
                if (imageButton != null) {
                    int a9 = E.b.a(activity2, eVar.M() ? C5275R.color.dismiss_icon_grey_500 : C5275R.color.dismiss_icon_grey_700);
                    if (resources != null) {
                        try {
                            int identifier3 = resources.getIdentifier(eVar.M() ? "grey_500" : "grey_700", com.anythink.expressad.foundation.h.k.f19633d, "com.android.vending");
                            if (identifier3 != 0) {
                                a9 = resources.getColor(identifier3, activity2.getTheme());
                            } else {
                                Log.w("HsdpLoadingPanel", "Could not load grey_500/grey_700 color from com.android.vending, falling back to local resources.");
                            }
                            identifier = resources.getIdentifier("gs_close_rond100_vd_theme_24", com.anythink.expressad.foundation.h.k.f19632c, "com.android.vending");
                        } catch (RuntimeException e12) {
                            Log.e("HsdpLoadingPanel", "Error loading dismiss icon from com.android.vending.", e12);
                        }
                        if (identifier != 0) {
                            drawable = resources.getDrawable(identifier, activity2.getTheme());
                            z3 = true;
                            if (drawable == null) {
                                drawable = com.bumptech.glide.g.e(activity2, R.drawable.ic_menu_close_clear_cancel);
                                z3 = false;
                            }
                            if (drawable != null) {
                                Log.e("HsdpLoadingPanel", "Failed to load dismiss button.");
                                eVar.f4172w = null;
                                return;
                            } else {
                                H.a.g(drawable, a9);
                                imageButton.setImageDrawable(drawable);
                                imageButton.setOnClickListener(new q(eVar));
                                Log.i("HsdpLoadingPanel", "Successfully loaded and tinted dismiss icon from ".concat(true != z3 ? "local resources." : "com.android.vending."));
                            }
                        } else {
                            Log.w("HsdpLoadingPanel", "Drawable resource 'gs_close_rond100_vd_theme_24' not found in com.android.vending");
                        }
                    }
                    drawable = null;
                    z3 = false;
                    if (drawable == null) {
                    }
                    if (drawable != null) {
                    }
                }
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C5275R.id.content_frame);
                if (frameLayout == null) {
                    Log.e("HsdpLoadingPanel", "content_frame not found in the layout.");
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(new float[]{d6.c.s(activity2, 28), d6.c.s(activity2, 28), d6.c.s(activity2, 28), d6.c.s(activity2, 28), 0.0f, 0.0f, 0.0f, 0.0f});
                    gradientDrawable.setColor(E.b.a(activity2, eVar.M() ? C5275R.color.background_dark : C5275R.color.background_light));
                    frameLayout.setBackground(gradientDrawable);
                    frameLayout.setClipToOutline(true);
                }
                View findViewById2 = inflate.findViewById(C5275R.id.placeholder_loading);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                try {
                    int t6 = d6.c.t(activity2);
                    int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(C5275R.dimen.sdk_hsdp_loading_ui_height);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 40, -3);
                    layoutParams.height = Math.min(activity2.getResources().getDimensionPixelSize(C5275R.dimen.sdk_hsdp_loading_ui_height), (int) (d6.c.t(activity2) * 0.6f));
                    if (activity2.getResources().getConfiguration().screenWidthDp > 640) {
                        layoutParams.width = d6.c.s(activity2, 640);
                    }
                    layoutParams.gravity = 81;
                    Log.i("HsdpLoadingPanel", "screenHeight: " + t6 + ", loadingUiHeight: " + dimensionPixelSize + ", wmParams.y: " + layoutParams.y);
                    ((WindowManager) eVar.f4171v).addView(inflate, layoutParams);
                    Log.i("HsdpLoadingPanel", "Successfully added view to WindowManager. loadingView size: " + inflate.getWidth() + "x" + inflate.getHeight());
                    FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C5275R.id.content_frame);
                    if (frameLayout2 != null) {
                        Log.i("HsdpLoadingPanel", "contentFrame size: " + frameLayout2.getWidth() + "x" + frameLayout2.getHeight());
                    }
                } catch (RuntimeException e13) {
                    Log.e("HsdpLoadingPanel", "Error adding view to WindowManager", e13);
                    eVar.f4172w = null;
                }
            }
        }
    }
}
