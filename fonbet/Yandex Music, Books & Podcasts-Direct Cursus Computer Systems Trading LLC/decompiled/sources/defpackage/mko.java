package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mko extends llo implements jlo {
    public List h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // defpackage.jlo
    public final List a() {
        return this.h;
    }

    @Override // defpackage.jlo
    public final void h(nlo nloVar) {
        if (nloVar instanceof elo) {
            this.h.add(nloVar);
            return;
        }
        throw new nmo("Gradient elements cannot contain " + nloVar + " elements.");
    }
}
