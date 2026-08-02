package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.y;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class bq7 {
    public final y a;
    public final int b;
    public final znk c;
    public final qxp d;
    public final xzi e;
    public final bnd f;
    public final vx6 g;

    public bq7(y yVar, int i, znk znkVar, qxp qxpVar, xzi xziVar, bnd bndVar, vx6 vx6Var) {
        this.a = yVar;
        this.b = i;
        this.c = znkVar;
        this.d = qxpVar;
        this.e = xziVar;
        this.f = bndVar;
        this.g = vx6Var;
    }

    public final boolean a(boolean z) {
        y yVar = this.a;
        if (!yVar.c.f().isEmpty()) {
            if (z) {
                a aVar = new a(yVar);
                aVar.g(R.animator.slide_in_right, R.animator.slide_out_to_right, R.animator.slide_in_left, R.animator.slide_out_to_left);
                if (aVar.i) {
                    xq0.q("This transaction is already being added to the back stack");
                    return false;
                }
                aVar.j = false;
                aVar.t.A(aVar, false);
            }
            yVar.T();
            if (yVar.c.f().size() > 1) {
                return true;
            }
        }
        return false;
    }
}
