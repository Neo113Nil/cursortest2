package F3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.Z;

/* loaded from: classes2.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f1092e;

    public t(v vVar, int i, TextView textView, int i4, TextView textView2) {
        this.f1092e = vVar;
        this.f1088a = i;
        this.f1089b = textView;
        this.f1090c = i4;
        this.f1091d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Z z8;
        int i = this.f1088a;
        v vVar = this.f1092e;
        vVar.f1108n = i;
        vVar.f1106l = null;
        TextView textView = this.f1089b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1090c == 1 && (z8 = vVar.f1112r) != null) {
                z8.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1091d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1091d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
