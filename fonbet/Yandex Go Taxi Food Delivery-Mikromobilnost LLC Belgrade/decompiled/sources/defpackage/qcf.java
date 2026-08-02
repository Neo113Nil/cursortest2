package defpackage;

import android.graphics.drawable.Drawable;
import coil.drawable.CrossfadeDrawable;

/* loaded from: classes10.dex */
public final class qcf implements wx01 {
    public final qy01 a;
    public final nev b;
    public final int c;
    public final boolean w;

    public qcf(qy01 qy01Var, nev nevVar, int i, boolean z) {
        this.a = qy01Var;
        this.b = nevVar;
        this.c = i;
        this.w = z;
        if (i > 0) {
            return;
        }
        ny61.g("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.wx01
    public final void a() {
        qy01 qy01Var = this.a;
        Drawable n = qy01Var.n();
        nev nevVar = this.b;
        boolean z = nevVar instanceof u3v0;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(n, nevVar.a(), nevVar.b().z, this.c, (z && ((u3v0) nevVar).g) ? false : true, this.w);
        if (z) {
            qy01Var.b(crossfadeDrawable);
        } else if (nevVar instanceof n9o) {
            qy01Var.g(crossfadeDrawable);
        }
    }
}
