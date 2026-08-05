package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vd extends AnimatorListenerAdapter {
    public final /* synthetic */ wd NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ vd(wd wdVar, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = wdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 1:
                super.onAnimationEnd(animator);
                wd wdVar = this.NCTxEWno;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = wdVar.Qr9iLBAD;
                if (arrayList != null && !wdVar.jb9XjC4I) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((b2) obj).qoPGr6Ce(wdVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 0:
                super.onAnimationStart(animator);
                wd wdVar = this.NCTxEWno;
                ArrayList arrayList = wdVar.Qr9iLBAD;
                if (arrayList != null && !wdVar.jb9XjC4I) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((b2) obj).NCTxEWno(wdVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
