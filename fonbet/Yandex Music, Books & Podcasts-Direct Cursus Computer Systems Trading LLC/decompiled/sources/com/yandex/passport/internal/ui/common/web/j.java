package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.k;
import com.yandex.passport.R;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.s2;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.x;
import defpackage.ceu;
import defpackage.ezf;
import defpackage.g96;
import defpackage.i96;
import defpackage.ldg;
import defpackage.ndu;
import defpackage.q96;
import defpackage.t86;
import defpackage.tot;
import defpackage.wdu;
import defpackage.y86;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class j extends y86 {
    public final v d;
    public final View e;
    public final s2 f;
    public final WebView g;
    public final ViewGroup h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Activity activity, v vVar, x xVar) {
        super(activity);
        ViewGroup viewGroup;
        xVar.getClass();
        activity.getClass();
        vVar.getClass();
        this.d = vVar;
        this.e = com.yandex.passport.common.ui.e.b(this, activity, vVar, xVar.x, 1.0f, 16);
        this.f = vVar.b.v();
        int i = R.id.webview;
        View view = (View) i.a.invoke(ezf.a0(this.a, 0), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        this.b.j(view);
        WebView webView = (WebView) view;
        Context context = webView.getContext();
        context.getClass();
        webView.setBackgroundColor(com.yandex.plus.core.network.api.utils.a.t(context, ru.yandex.music.R.attr.colorBackgroundFloating));
        webView.setVisibility(8);
        ViewGroup.LayoutParams b = b(-2, -2);
        t86 t86Var = (t86) b;
        ((ViewGroup.MarginLayoutParams) t86Var).width = 0;
        ((ViewGroup.MarginLayoutParams) t86Var).height = 0;
        View decorView = activity.getWindow().getDecorView();
        tot totVar = new tot(23, t86Var);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(decorView, totVar);
        webView.setLayoutParams(b);
        this.g = webView;
        Context context2 = this.a;
        context2.getClass();
        Object systemService = context2.getSystemService("uimode");
        systemService.getClass();
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            int i2 = R.layout.passport_activity_web_view_error_layout;
            Context a0 = ezf.a0(this.a, 0);
            a0.getClass();
            Object systemService2 = a0.getSystemService("layout_inflater");
            systemService2.getClass();
            View inflate = ((LayoutInflater) systemService2).inflate(i2, (ViewGroup) null, false);
            inflate.getClass();
            this.b.j(inflate);
            viewGroup = (ViewGroup) inflate;
        } else {
            int i3 = R.layout.passport_activity_web_view_error_layout;
            Context a02 = ezf.a0(this.a, 0);
            a02.getClass();
            Object systemService3 = a02.getSystemService("layout_inflater");
            systemService3.getClass();
            View inflate2 = ((LayoutInflater) systemService3).inflate(i3, (ViewGroup) null, false);
            inflate2.getClass();
            this.b.j(inflate2);
            viewGroup = (ViewGroup) inflate2;
        }
        this.h = viewGroup;
    }

    @Override // defpackage.y86
    public final void a(final q96 q96Var) {
        q96Var.getClass();
        final int i = 0;
        q96Var.w(this.e, new Function1(this) { // from class: com.yandex.passport.internal.ui.common.web.h
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                q96 q96Var2 = q96Var;
                j jVar = this.b;
                ceu ceuVar = (ceu) obj;
                switch (i2) {
                    case 0:
                        ceuVar.getClass();
                        v vVar = jVar.d;
                        s2 s2Var = jVar.f;
                        ceuVar.c(vVar.a instanceof k2 ? s2Var.a : 0);
                        ceuVar.b(s2Var.b);
                        i96 i96Var = i96.a;
                        g96 g = k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.b;
                        g96 g2 = k.g(i96Var2, i96Var2, ceuVar, 0);
                        i96 i96Var3 = i96.c;
                        g96 g3 = k.g(i96Var3, i96Var3, ceuVar, 0);
                        i96 i96Var4 = i96.d;
                        q96Var2.v(g, g2, g3, k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        Context context = jVar.a;
                        context.getClass();
                        Object systemService = context.getSystemService("uimode");
                        systemService.getClass();
                        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                            ceuVar.c(0);
                            ceuVar.b(0);
                        }
                        i96 i96Var5 = i96.a;
                        g96 g4 = k.g(i96Var5, i96Var5, ceuVar, 0);
                        i96 i96Var6 = i96.b;
                        g96 g5 = k.g(i96Var6, i96Var6, ceuVar, 0);
                        i96 i96Var7 = i96.c;
                        g96 g6 = k.g(i96Var7, i96Var7, ceuVar, 0);
                        i96 i96Var8 = i96.d;
                        q96Var2.v(g4, g5, g6, k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
        q96Var.w(this.g, new com.yandex.passport.internal.ui.bouncer.error.c(6, q96Var));
        final int i2 = 1;
        q96Var.w(this.h, new Function1(this) { // from class: com.yandex.passport.internal.ui.common.web.h
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                q96 q96Var2 = q96Var;
                j jVar = this.b;
                ceu ceuVar = (ceu) obj;
                switch (i22) {
                    case 0:
                        ceuVar.getClass();
                        v vVar = jVar.d;
                        s2 s2Var = jVar.f;
                        ceuVar.c(vVar.a instanceof k2 ? s2Var.a : 0);
                        ceuVar.b(s2Var.b);
                        i96 i96Var = i96.a;
                        g96 g = k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.b;
                        g96 g2 = k.g(i96Var2, i96Var2, ceuVar, 0);
                        i96 i96Var3 = i96.c;
                        g96 g3 = k.g(i96Var3, i96Var3, ceuVar, 0);
                        i96 i96Var4 = i96.d;
                        q96Var2.v(g, g2, g3, k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        Context context = jVar.a;
                        context.getClass();
                        Object systemService = context.getSystemService("uimode");
                        systemService.getClass();
                        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                            ceuVar.c(0);
                            ceuVar.b(0);
                        }
                        i96 i96Var5 = i96.a;
                        g96 g4 = k.g(i96Var5, i96Var5, ceuVar, 0);
                        i96 i96Var6 = i96.b;
                        g96 g5 = k.g(i96Var6, i96Var6, ceuVar, 0);
                        i96 i96Var7 = i96.c;
                        g96 g6 = k.g(i96Var7, i96Var7, ceuVar, 0);
                        i96 i96Var8 = i96.d;
                        q96Var2.v(g4, g5, g6, k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.y86
    public final void d(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        ldg.H(R.color.passport_roundabout_background, constraintLayout);
    }
}
