package defpackage;

import android.animation.AnimatorSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class g8p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8p b;

    public /* synthetic */ g8p(t8p t8pVar, int i) {
        this.a = i;
        this.b = t8pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m();
                break;
            case 1:
                t8p t8pVar = this.b;
                AnimatorSet e = t8pVar.e(true);
                e.addListener(new s8p(t8pVar, 0));
                e.start();
                break;
            default:
                t8p t8pVar2 = this.b;
                t8pVar2.c.setTranslationY(r1.getHeight());
                AnimatorSet h = t8pVar2.h(true);
                h.addListener(new s8p(t8pVar2, 2));
                h.start();
                break;
        }
    }
}
