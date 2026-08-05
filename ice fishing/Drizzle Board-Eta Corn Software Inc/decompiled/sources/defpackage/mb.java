package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mb extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean MdtA4re8;
    public final /* synthetic */ View NCTxEWno;
    public final /* synthetic */ kb VgvYg0wo;
    public final /* synthetic */ pb qoPGr6Ce;
    public final /* synthetic */ d80 wxUZMvaN;

    public mb(pb pbVar, View view, boolean z, d80 d80Var, kb kbVar) {
        this.qoPGr6Ce = pbVar;
        this.NCTxEWno = view;
        this.MdtA4re8 = z;
        this.wxUZMvaN = d80Var;
        this.VgvYg0wo = kbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.qoPGr6Ce.qoPGr6Ce;
        View view = this.NCTxEWno;
        viewGroup.endViewTransition(view);
        boolean z = this.MdtA4re8;
        d80 d80Var = this.wxUZMvaN;
        if (z) {
            int i = d80Var.qoPGr6Ce;
            view.getClass();
            q70.qoPGr6Ce(view, i);
        }
        this.VgvYg0wo.VgvYg0wo();
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Animator from operation " + d80Var + " has ended.");
        }
    }
}
