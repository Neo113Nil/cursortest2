package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f623c;

    public j(k kVar, boolean z2, int i) {
        this.f623c = kVar;
        this.f621a = z2;
        this.f622b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f623c;
        kVar.f606b.setTranslationX(RecyclerView.f2111C0);
        kVar.a(RecyclerView.f2111C0, this.f621a, this.f622b);
    }
}
