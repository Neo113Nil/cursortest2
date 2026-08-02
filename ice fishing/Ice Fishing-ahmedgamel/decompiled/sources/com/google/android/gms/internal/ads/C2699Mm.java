package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2699Mm implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27113n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2733Om f27114u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f27115v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WindowManager f27116w;

    public /* synthetic */ C2699Mm(C2733Om c2733Om, WindowManager windowManager, FrameLayout frameLayout) {
        this.f27114u = c2733Om;
        this.f27116w = windowManager;
        this.f27115v = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.Nm] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        C2733Om c2733Om = this.f27114u;
        switch (this.f27113n) {
            case 0:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                c2733Om.getClass();
                int i = w2.z.f41712b;
                x2.i.a("Hide native ad policy validator overlay.");
                interfaceC4084vh.V().setVisibility(8);
                if (interfaceC4084vh.V().getWindowToken() != null) {
                    this.f27116w.removeView(interfaceC4084vh.V());
                }
                interfaceC4084vh.destroy();
                ViewTreeObserver viewTreeObserver = this.f27115v.getViewTreeObserver();
                if (c2733Om.f27438c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(c2733Om.f27438c);
                    break;
                }
                break;
            default:
                final InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) obj;
                c2733Om.getClass();
                interfaceC4084vh2.h0().f26956z = new S0.l(15, c2733Om, map);
                if (map != null) {
                    final FrameLayout frameLayout = this.f27115v;
                    Context context = frameLayout.getContext();
                    String str = (String) map.get("validator_width");
                    C3324ha c3324ha = AbstractC3592ma.l9;
                    s2.r rVar = s2.r.f40506e;
                    int b9 = C2733Om.b(context, str, ((Integer) rVar.f40509c.a(c3324ha)).intValue());
                    String str2 = (String) map.get("validator_height");
                    C3324ha c3324ha2 = AbstractC3592ma.m9;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                    int b10 = C2733Om.b(context, str2, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).intValue());
                    int b11 = C2733Om.b(context, (String) map.get("validator_x"), 0);
                    int b12 = C2733Om.b(context, (String) map.get("validator_y"), 0);
                    interfaceC4084vh2.f1(new A3.r(1, b9, b10));
                    try {
                        interfaceC4084vh2.q().getSettings().setUseWideViewPort(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.n9)).booleanValue());
                        interfaceC4084vh2.q().getSettings().setLoadWithOverviewMode(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.o9)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams E8 = t8.g.E();
                    E8.x = b11;
                    E8.y = b12;
                    View V8 = interfaceC4084vh2.V();
                    final WindowManager windowManager = this.f27116w;
                    windowManager.updateViewLayout(V8, E8);
                    final String str3 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (frameLayout.getGlobalVisibleRect(rect)) {
                        final int i4 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - b12;
                        c2733Om.f27438c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.Nm
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (frameLayout.getGlobalVisibleRect(rect2)) {
                                    InterfaceC4084vh interfaceC4084vh3 = interfaceC4084vh2;
                                    if (interfaceC4084vh3.V().getWindowToken() == null) {
                                        return;
                                    }
                                    String str4 = str3;
                                    boolean equals = "1".equals(str4);
                                    WindowManager.LayoutParams layoutParams = E8;
                                    int i6 = i4;
                                    if (equals || "2".equals(str4)) {
                                        layoutParams.y = rect2.bottom - i6;
                                    } else {
                                        layoutParams.y = rect2.top - i6;
                                    }
                                    windowManager.updateViewLayout(interfaceC4084vh3.V(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = frameLayout.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(c2733Om.f27438c);
                        }
                    }
                    String str4 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str4)) {
                        interfaceC4084vh2.loadUrl(str4);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C2699Mm(C2733Om c2733Om, FrameLayout frameLayout, WindowManager windowManager) {
        this.f27114u = c2733Om;
        this.f27115v = frameLayout;
        this.f27116w = windowManager;
    }
}
