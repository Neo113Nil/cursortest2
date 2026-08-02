package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class hs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public hs0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        onx onxVar;
        switch (this.a) {
            case 0:
                ((TextView) this.c).setTypeface((Typeface) this.d, this.b);
                return;
            case 1:
                ((BottomSheetBehavior) this.d).startSettling((View) this.c, this.b, false);
                return;
            case 2:
                l3x l3xVar = (l3x) this.c;
                crh crhVar = (crh) this.d;
                int i = this.b;
                synchronized (l3xVar.j) {
                    l3xVar.T0(crhVar, i);
                }
                return;
            default:
                sbx sbxVar = (sbx) this.c;
                ohx ohxVar = (ohx) this.d;
                int i2 = this.b;
                m4x m4xVar = sbxVar.h;
                if (m4xVar == null) {
                    return;
                }
                synchronized (m4xVar) {
                    i8s i8sVar = new i8s();
                    q5i a = h8s.a();
                    w8c w8cVar = m4xVar.c;
                    a.c = new vpl();
                    a.b = 4501;
                    onx c = w8cVar.c(0, a.c());
                    k4x k4xVar = new k4x(i8sVar);
                    c.getClass();
                    c.d(j8s.a, k4xVar);
                    c.n(new knn(25, i8sVar));
                    m4xVar.b.postDelayed(new k0x(1, i8sVar), m4xVar.a * 1000);
                    onxVar = i8sVar.a;
                }
                onxVar.o(new w2r(sbxVar, ohxVar, i2));
                return;
        }
    }

    public /* synthetic */ hs0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
