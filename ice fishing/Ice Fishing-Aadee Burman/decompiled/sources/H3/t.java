package H3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.Z;

/* loaded from: classes2.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f1179e;

    public t(v vVar, int i, TextView textView, int i6, TextView textView2) {
        this.f1179e = vVar;
        this.f1175a = i;
        this.f1176b = textView;
        this.f1177c = i6;
        this.f1178d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Z z3;
        int i = this.f1175a;
        v vVar = this.f1179e;
        vVar.f1195n = i;
        vVar.f1193l = null;
        TextView textView = this.f1176b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1177c == 1 && (z3 = vVar.f1199r) != null) {
                z3.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1178d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1178d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
