package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class von {
    public vtm a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(opn opnVar) {
        int i = opnVar.j;
        if (!opnVar.i() && (i & 4) == 0) {
            opnVar.b();
        }
    }

    public abstract boolean a(opn opnVar, opn opnVar2, c9n c9nVar, c9n c9nVar2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(opn opnVar) {
        vtm vtmVar = this.a;
        if (vtmVar != null) {
            RecyclerView recyclerView = (RecyclerView) vtmVar.a;
            boolean z = true;
            opnVar.q(true);
            View view = opnVar.a;
            if (opnVar.h != null && opnVar.i == null) {
                opnVar.h = null;
            }
            opnVar.i = null;
            if ((opnVar.j & 16) != 0) {
                return;
            }
            amh amhVar = recyclerView.c;
            recyclerView.D0();
            c1t c1tVar = recyclerView.f;
            au1 au1Var = (au1) c1tVar.d;
            g8c g8cVar = (g8c) c1tVar.c;
            int i = c1tVar.b;
            if (i != 1) {
                if (i == 2) {
                    xq0.q("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    c1tVar.b = 2;
                    int indexOfChild = ((RecyclerView) g8cVar.a).indexOfChild(view);
                    if (indexOfChild == -1) {
                        c1tVar.t(view);
                    } else if (au1Var.L(indexOfChild)) {
                        au1Var.P(indexOfChild);
                        c1tVar.t(view);
                        g8cVar.r(indexOfChild);
                    }
                    if (z) {
                        opn b0 = RecyclerView.b0(view);
                        amhVar.m(b0);
                        amhVar.j(b0);
                        if (RecyclerView.k1) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.F0(!z);
                    if (z && opnVar.m()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c1tVar.b = 0;
                }
            }
            if (((View) c1tVar.f) != view) {
                xq0.q("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
            }
            recyclerView.F0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(opn opnVar);

    public abstract void e();

    public abstract boolean f();
}
