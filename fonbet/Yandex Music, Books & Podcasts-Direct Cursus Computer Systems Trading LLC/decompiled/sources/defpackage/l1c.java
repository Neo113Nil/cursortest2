package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes5.dex */
public final class l1c extends k0 {
    public Hashtable a = new Hashtable();
    public Vector b = new Vector();

    public l1c(p0c[] p0cVarArr) {
        for (int i = 0; i != p0cVarArr.length; i++) {
            p0c p0cVar = p0cVarArr[i];
            this.b.addElement(p0cVar.a);
            this.a.put(p0cVar.a, p0cVar);
        }
    }

    @Override // defpackage.d0
    public final s0 n() {
        Vector vector = this.b;
        e0 e0Var = new e0(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            e0Var.e((p0c) this.a.get((n0) elements.nextElement()));
        }
        d07 d07Var = new d07(e0Var);
        d07Var.c = -1;
        return d07Var;
    }
}
