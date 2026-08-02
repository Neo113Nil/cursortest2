package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jb2;
import defpackage.jj4;
import defpackage.l8t;
import defpackage.n8t;
import defpackage.s9f;
import defpackage.w3c;
import defpackage.wsq;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] f = {new yxm(b.class, "card", "getCard()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, b.class, "progressView", "getProgressView()Landroid/view/View;", 0), new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0)};
    public final BottomSheetLoadingView a;
    public final com.yandex.plus.bdui.plus.content.controller.f b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final com.yandex.plus.bdui.plus.content.controller.f e;

    public b(BottomSheetLoadingView bottomSheetLoadingView) {
        bottomSheetLoadingView.getClass();
        this.a = bottomSheetLoadingView;
        this.b = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(bottomSheetLoadingView, 7));
        this.c = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(bottomSheetLoadingView, 8));
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(bottomSheetLoadingView, 9));
        this.e = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(bottomSheetLoadingView, 10));
        ViewGroup a = a();
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Context context = bottomSheetLoadingView.getContext();
        context.getClass();
        layoutParams2.width = (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? context.getResources().getDimensionPixelSize(R.dimen.pay_sdk_tablet_bottom_sheet_width) : -1;
        a.setLayoutParams(layoutParams2);
    }

    public final ViewGroup a() {
        return (ViewGroup) this.b.g(f[0]);
    }

    public final TextView b() {
        return (TextView) this.e.g(f[3]);
    }

    public final TextView c() {
        return (TextView) this.d.g(f[2]);
    }

    public final void d() {
        e();
        BottomSheetLoadingView bottomSheetLoadingView = this.a;
        bottomSheetLoadingView.setVisibility(8);
        a().setVisibility(8);
        c().setVisibility(8);
        b().setVisibility(8);
        bottomSheetLoadingView.setOnTouchListener(null);
    }

    public final void e() {
        BottomSheetLoadingView bottomSheetLoadingView = this.a;
        ViewParent parent = bottomSheetLoadingView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            w3c w3cVar = new w3c();
            w3cVar.f.add(bottomSheetLoadingView);
            wsq wsqVar = new wsq();
            wsqVar.f.add(a());
            jb2 jb2Var = new jb2();
            jb2Var.e((View) this.c.g(f[1]));
            jb2Var.e(c());
            jb2Var.e(b());
            n8t n8tVar = new n8t();
            n8tVar.W(w3cVar);
            n8tVar.W(wsqVar);
            n8tVar.W(jb2Var);
            n8tVar.M(300L);
            l8t.a(viewGroup, n8tVar);
        }
    }

    public final void f(String str, String str2) {
        str.getClass();
        str2.getClass();
        e();
        BottomSheetLoadingView bottomSheetLoadingView = this.a;
        bottomSheetLoadingView.setVisibility(0);
        a().setVisibility(0);
        c().setVisibility(0);
        b().setVisibility(0);
        c().setText(str);
        b().setText(str2);
        bottomSheetLoadingView.setOnTouchListener(new a());
    }
}
