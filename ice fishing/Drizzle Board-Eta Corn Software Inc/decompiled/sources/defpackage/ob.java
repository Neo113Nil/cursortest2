package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ob implements Animation.AnimationListener {
    public final /* synthetic */ View MdtA4re8;
    public final /* synthetic */ pb NCTxEWno;
    public final /* synthetic */ d80 qoPGr6Ce;
    public final /* synthetic */ kb wxUZMvaN;

    public ob(kb kbVar, pb pbVar, d80 d80Var, View view) {
        this.qoPGr6Ce = d80Var;
        this.NCTxEWno = pbVar;
        this.MdtA4re8 = view;
        this.wxUZMvaN = kbVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        pb pbVar = this.NCTxEWno;
        pbVar.qoPGr6Ce.post(new nb(pbVar, this.MdtA4re8, this.wxUZMvaN, 0));
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.qoPGr6Ce + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.qoPGr6Ce + " has reached onAnimationStart.");
        }
    }
}
