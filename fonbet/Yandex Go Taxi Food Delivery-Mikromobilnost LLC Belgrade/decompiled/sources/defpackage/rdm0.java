package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.design.spoiler.b;
import com.ybsdk.feature.divkit.api.ui.YbDivView;

/* loaded from: classes3.dex */
public final class rdm0 {
    public static final PathInterpolator k = new PathInterpolator(0.34f, 1.56f, 0.64f, 1.0f);
    public static final PathInterpolator l = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    public final n561 a;
    public final qdm0 b;
    public final qdm0 c;
    public final e d;
    public final e e;
    public AnimatorSet f;
    public OneShotPreDrawListener g;
    public boolean h;
    public Boolean i;
    public boolean j;

    public rdm0(n561 n561Var) {
        this.a = n561Var;
        ConstraintLayout constraintLayout = n561Var.c;
        this.b = new qdm0(this, rje.a(constraintLayout.getContext(), ung0.ybColor_textIcon_primary), l1i0.Widget_YB_Text_Numbers5, d(iwg0.ybsdk_savings_dashboard_v4_expanded_shelf_spoiler_width, iwg0.ybsdk_savings_dashboard_v4_expanded_shelf_spoiler_height));
        this.c = new qdm0(this, rje.a(constraintLayout.getContext(), ung0.ybColor_textIcon_secondary), l1i0.Widget_YB_Text_Caption1_Medium, d(iwg0.ybsdk_savings_dashboard_v4_collapsed_shelf_spoiler_width, iwg0.ybsdk_savings_dashboard_v4_collapsed_shelf_spoiler_height));
        e eVar = new e();
        eVar.g(constraintLayout);
        TextView textView = n561Var.j;
        eVar.e(textView.getId(), 4);
        int id = textView.getId();
        ImageView imageView = n561Var.g;
        eVar.i(id, 3, imageView.getId(), 3);
        SpoilerTextView spoilerTextView = n561Var.h;
        eVar.e(spoilerTextView.getId(), 6);
        eVar.e(spoilerTextView.getId(), 7);
        eVar.e(spoilerTextView.getId(), 3);
        eVar.e(spoilerTextView.getId(), 4);
        eVar.i(spoilerTextView.getId(), 6, textView.getId(), 6);
        eVar.i(spoilerTextView.getId(), 7, tbh0.subtitleDivView, 6);
        eVar.j(spoilerTextView.getId(), 3, textView.getId(), 4, 0);
        this.d = eVar;
        e eVar2 = new e();
        eVar2.g(constraintLayout);
        eVar2.i(textView.getId(), 3, imageView.getId(), 3);
        eVar2.i(textView.getId(), 4, imageView.getId(), 4);
        eVar2.o(textView.getId()).e.y = 0.5f;
        this.e = eVar2;
        this.j = n561Var.d.getVisibility() == 0;
    }

    public static ValueAnimator e(tls tlsVar, float f, long j, PathInterpolator pathInterpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.addUpdateListener(new nj2(6, tlsVar));
        return ofFloat;
    }

    public static void f(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public final void a(boolean z) {
        n561 n561Var = this.a;
        YbDivView ybDivView = n561Var.d;
        int visibility = ybDivView.getVisibility();
        YbDivView ybDivView2 = n561Var.i;
        int visibility2 = ybDivView2.getVisibility();
        ImageView imageView = n561Var.e;
        int visibility3 = imageView.getVisibility();
        (z ? this.d : this.e).b(n561Var.c);
        ybDivView.setVisibility(visibility);
        ybDivView2.setVisibility(visibility2);
        imageView.setVisibility(visibility3);
    }

    public final void b(qdm0 qdm0Var) {
        SpoilerTextView spoilerTextView = this.a.h;
        xty0.g(spoilerTextView, qdm0Var.b);
        spoilerTextView.setTextColor(qdm0Var.a);
        spoilerTextView.setSpoiler(Spoiler.a(spoilerTextView.getSpoiler(), false, qdm0Var.c, null, null, 13));
    }

    public final void c() {
        OneShotPreDrawListener oneShotPreDrawListener = this.g;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.g = null;
        h();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f = null;
    }

    public final Spoiler.a d(int i, int i2) {
        n561 n561Var = this.a;
        int d = rje.d(i, sm91.c(n561Var));
        Spoiler.Gravity gravity = Spoiler.Gravity.START;
        return new Spoiler.a(new b(d, gravity), new b(rje.d(i2, sm91.c(n561Var)), gravity));
    }

    public final void g(boolean z) {
        c();
        this.i = Boolean.valueOf(z);
        n561 n561Var = this.a;
        YbDivView ybDivView = n561Var.d;
        YbDivView ybDivView2 = n561Var.i;
        SpoilerTextView spoilerTextView = n561Var.h;
        ImageView imageView = n561Var.e;
        RecyclerView recyclerView = n561Var.b;
        this.j = ybDivView.getVisibility() == 0;
        a(z);
        imageView.setRotation(z ? 180.0f : 0.0f);
        b(z ? this.c : this.b);
        n561Var.j.setTranslationY(0.0f);
        imageView.setTranslationY(0.0f);
        spoilerTextView.setTranslationX(0.0f);
        spoilerTextView.setTranslationY(0.0f);
        recyclerView.setTranslationY(0.0f);
        ybDivView.setTranslationY(0.0f);
        ybDivView2.setTranslationX(0.0f);
        ybDivView2.setTranslationY(0.0f);
        recyclerView.setAlpha(z ? 1.0f : 0.0f);
        f(z ? -2 : 0, recyclerView);
    }

    public final void h() {
        if (this.h) {
            f(-2, this.a.c);
            this.h = false;
        }
    }
}
