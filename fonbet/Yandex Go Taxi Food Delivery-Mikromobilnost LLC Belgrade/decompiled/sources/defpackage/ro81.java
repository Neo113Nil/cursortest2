package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;
import java.util.WeakHashMap;
import yads.i1;
import yads.mb;
import yads.nb;
import yads.xb;

/* loaded from: classes7.dex */
public final class ro81 {
    public static boolean c;
    public final st81 a;
    public final gr81 b;

    public ro81(st81 st81Var, gr81 gr81Var) {
        this.a = st81Var;
        this.b = gr81Var;
    }

    public final void a(Activity activity, xb xbVar, m671 m671Var) {
        kzo kzoVar = new kzo(activity, 14);
        gs71 gs71Var = new gs71();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, m671Var.d ? R$style.MonetizationAdsInternal_AdtuneTheme_Dark : R$style.MonetizationAdsInternal_AdtuneTheme_Light)).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(kzoVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            if (xga1.b(35)) {
                yx61 yx61Var = new yx61(6);
                WeakHashMap weakHashMap = b.a;
                ViewCompat$Api21Impl.o(viewGroup2, yx61Var);
            }
            viewGroup2.addView(xbVar);
        }
        View findViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new nb(viewGroup, dialog, gs71Var));
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new mb(dialog, gs71Var));
        }
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        yga1.a(dialog);
        dialog.setOnDismissListener(new no81(0));
        fp71 fp71Var = new fp71(dialog, xbVar, this.a, this.b);
        xb xbVar2 = (xb) fp71Var.b;
        String str = m671Var.b;
        xbVar2.setAdtuneWebViewListener(new aj71(fp71Var));
        xbVar2.loadUrl(str);
        ((Handler) fp71Var.x).postDelayed(new h3s0(15, fp71Var), 5000L);
        ((Dialog) fp71Var.a).show();
    }

    public final void b(View view, m671 m671Var) {
        Activity activity;
        Activity b;
        if (c) {
            return;
        }
        Context context = view.getContext();
        do {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    context = contextWrapper.getBaseContext();
                }
            } else {
                break;
            }
        } while (context != null);
        activity = null;
        if (activity == null) {
            synchronized (tb71.a) {
                i1 i1Var = tb71.b;
                b = i1Var != null ? i1Var.b() : null;
            }
            activity = b;
        }
        if (activity == null || !cs71.a(activity)) {
            return;
        }
        try {
            xb xbVar = new xb(activity, m671Var);
            c = true;
            a(activity, xbVar, m671Var);
        } catch (Throwable unused) {
            c = false;
        }
    }
}
