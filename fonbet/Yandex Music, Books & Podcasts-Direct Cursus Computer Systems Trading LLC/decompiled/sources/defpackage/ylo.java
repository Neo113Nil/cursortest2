package defpackage;

/* loaded from: classes.dex */
public abstract class ylo extends ilo {
    @Override // defpackage.ilo, defpackage.jlo
    public final void h(nlo nloVar) {
        if (nloVar instanceof xlo) {
            this.i.add(nloVar);
            return;
        }
        throw new nmo("Text content elements cannot contain " + nloVar + " elements.");
    }
}
