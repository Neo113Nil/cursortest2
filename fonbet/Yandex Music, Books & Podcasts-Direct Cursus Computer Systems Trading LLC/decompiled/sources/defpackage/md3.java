package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Set;

/* loaded from: classes3.dex */
public final class md3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;

    public md3(htm htmVar, ucr ucrVar, boolean z, int i) {
        htmVar.getClass();
        ucrVar.getClass();
        this.d = htmVar;
        this.e = ucrVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        n5w b;
        switch (this.a) {
            case 0:
                ((ActionMenuView) this.d).setTranslationX(((BottomAppBar) this.e).D(r0, this.c, this.b));
                return;
            default:
                boolean z = this.b;
                htm htmVar = (htm) this.d;
                ucr ucrVar = (ucr) this.e;
                if (z) {
                    int i = this.c;
                    htmVar.getClass();
                    String str = ucrVar.a.a;
                    synchronized (htmVar.k) {
                        b = htmVar.b(str);
                    }
                    d = htm.d(str, b, i);
                } else {
                    int i2 = this.c;
                    htmVar.getClass();
                    String str2 = ucrVar.a.a;
                    synchronized (htmVar.k) {
                        try {
                            if (htmVar.f.get(str2) != null) {
                                jsg.j().e(htm.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                            } else {
                                Set set = (Set) htmVar.h.get(str2);
                                if (set != null && set.contains(ucrVar)) {
                                    d = htm.d(str2, htmVar.b(str2), i2);
                                }
                            }
                            d = false;
                        } finally {
                        }
                    }
                }
                jsg.j().e(jsg.n("StopWorkRunnable"), "StopWorkRunnable for " + ((ucr) this.e).a.a + "; Processor.stopWork = " + d);
                return;
        }
    }

    public md3(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.d = actionMenuView;
        this.c = i;
        this.b = z;
    }
}
