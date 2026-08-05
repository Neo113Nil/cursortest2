package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tef3qNMP extends AnimatorListenerAdapter {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public tef3qNMP(zg0 zg0Var, View view) {
        this.qoPGr6Ce = 4;
        this.NCTxEWno = zg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.gjV1z5T1 = null;
                actionBarOverlayLayout.k3x7lurq = false;
                break;
            case 1:
            case 3:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.ow5vqvCr = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 4:
                ((zg0) obj).NCTxEWno();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.gjV1z5T1 = null;
                actionBarOverlayLayout.k3x7lurq = false;
                break;
            case 1:
                zgcfmssZ zgcfmssz = (zgcfmssZ) obj;
                ArrayList arrayList = new ArrayList(zgcfmssz.P7K7Inc8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((b2) arrayList.get(i2)).qoPGr6Ce(zgcfmssz);
                }
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                ((rd0) obj).OnDfzHZD();
                animator.removeListener(this);
                break;
            case 4:
                ((zg0) obj).qoPGr6Ce();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 1:
                zgcfmssZ zgcfmssz = (zgcfmssZ) obj;
                ArrayList arrayList = new ArrayList(zgcfmssz.P7K7Inc8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((b2) arrayList.get(i2)).NCTxEWno(zgcfmssz);
                }
                break;
            case 4:
                ((zg0) obj).MdtA4re8();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ tef3qNMP(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }
}
