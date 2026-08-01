package V0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import m.C0245b0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1325d;
    public final /* synthetic */ t e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = tVar;
        this.f1322a = i;
        this.f1323b = textView;
        this.f1324c = i2;
        this.f1325d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0245b0 c0245b0;
        int i = this.f1322a;
        t tVar = this.e;
        tVar.f1339n = i;
        tVar.f1337l = null;
        TextView textView = this.f1323b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1324c == 1 && (c0245b0 = tVar.f1343r) != null) {
                c0245b0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1325d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.f2111C0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1325d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.f2111C0);
        }
    }
}
