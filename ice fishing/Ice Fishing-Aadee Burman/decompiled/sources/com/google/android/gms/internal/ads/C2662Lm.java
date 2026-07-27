package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2662Lm implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26167n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2696Nm f26168u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f26169v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WindowManager f26170w;

    public /* synthetic */ C2662Lm(C2696Nm c2696Nm, WindowManager windowManager, FrameLayout frameLayout) {
        this.f26168u = c2696Nm;
        this.f26170w = windowManager;
        this.f26169v = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.Mm] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        C2696Nm c2696Nm = this.f26168u;
        switch (this.f26167n) {
            case 0:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                c2696Nm.getClass();
                int i = u2.z.f41319b;
                v2.i.a("Hide native ad policy validator overlay.");
                interfaceC4061vh.V().setVisibility(8);
                if (interfaceC4061vh.V().getWindowToken() != null) {
                    this.f26170w.removeView(interfaceC4061vh.V());
                }
                interfaceC4061vh.destroy();
                ViewTreeObserver viewTreeObserver = this.f26169v.getViewTreeObserver();
                if (c2696Nm.f26534c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(c2696Nm.f26534c);
                    break;
                }
                break;
            default:
                final InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) obj;
                c2696Nm.getClass();
                interfaceC4061vh2.g0().f26159z = new S0.l(12, c2696Nm, map);
                if (map != null) {
                    final FrameLayout frameLayout = this.f26169v;
                    Context context = frameLayout.getContext();
                    String str = (String) map.get("validator_width");
                    C3301ha c3301ha = AbstractC3569ma.l9;
                    q2.r rVar = q2.r.f40204e;
                    int b9 = C2696Nm.b(context, str, ((Integer) rVar.f40207c.a(c3301ha)).intValue());
                    String str2 = (String) map.get("validator_height");
                    C3301ha c3301ha2 = AbstractC3569ma.m9;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                    int b10 = C2696Nm.b(context, str2, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue());
                    int b11 = C2696Nm.b(context, (String) map.get("validator_x"), 0);
                    int b12 = C2696Nm.b(context, (String) map.get("validator_y"), 0);
                    interfaceC4061vh2.o0(new X2.b(1, b9, b10));
                    try {
                        interfaceC4061vh2.q().getSettings().setUseWideViewPort(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.n9)).booleanValue());
                        interfaceC4061vh2.q().getSettings().setLoadWithOverviewMode(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.o9)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams C8 = L3.F.C();
                    C8.x = b11;
                    C8.y = b12;
                    View V8 = interfaceC4061vh2.V();
                    final WindowManager windowManager = this.f26170w;
                    windowManager.updateViewLayout(V8, C8);
                    final String str3 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (frameLayout.getGlobalVisibleRect(rect)) {
                        final int i6 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - b12;
                        c2696Nm.f26534c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.Mm
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (frameLayout.getGlobalVisibleRect(rect2)) {
                                    InterfaceC4061vh interfaceC4061vh3 = interfaceC4061vh2;
                                    if (interfaceC4061vh3.V().getWindowToken() == null) {
                                        return;
                                    }
                                    String str4 = str3;
                                    boolean equals = "1".equals(str4);
                                    WindowManager.LayoutParams layoutParams = C8;
                                    int i9 = i6;
                                    if (equals || "2".equals(str4)) {
                                        layoutParams.y = rect2.bottom - i9;
                                    } else {
                                        layoutParams.y = rect2.top - i9;
                                    }
                                    windowManager.updateViewLayout(interfaceC4061vh3.V(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = frameLayout.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(c2696Nm.f26534c);
                        }
                    }
                    String str4 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str4)) {
                        interfaceC4061vh2.loadUrl(str4);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C2662Lm(C2696Nm c2696Nm, FrameLayout frameLayout, WindowManager windowManager) {
        this.f26168u = c2696Nm;
        this.f26169v = frameLayout;
        this.f26170w = windowManager;
    }
}
