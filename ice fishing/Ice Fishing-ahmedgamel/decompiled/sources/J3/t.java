package J3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.Z;

/* loaded from: classes2.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f1535e;

    public t(v vVar, int i, TextView textView, int i4, TextView textView2) {
        this.f1535e = vVar;
        this.f1531a = i;
        this.f1532b = textView;
        this.f1533c = i4;
        this.f1534d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Z z6;
        int i = this.f1531a;
        v vVar = this.f1535e;
        vVar.f1551n = i;
        vVar.f1549l = null;
        TextView textView = this.f1532b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1533c == 1 && (z6 = vVar.f1555r) != null) {
                z6.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1534d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1534d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
