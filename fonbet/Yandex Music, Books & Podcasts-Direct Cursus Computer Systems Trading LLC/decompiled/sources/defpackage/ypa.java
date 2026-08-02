package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ypa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zpa b;

    public /* synthetic */ ypa(zpa zpaVar, int i) {
        this.a = i;
        this.b = zpaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                zpa zpaVar = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = zpaVar.g;
                if (arrayList != null && !zpaVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ek0) it.next()).a(zpaVar);
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
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                zpa zpaVar = this.b;
                ArrayList arrayList = zpaVar.g;
                if (arrayList != null && !zpaVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ek0) it.next()).b(zpaVar);
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
