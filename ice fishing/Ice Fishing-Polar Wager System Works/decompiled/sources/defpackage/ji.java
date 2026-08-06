package defpackage;

/* loaded from: classes.dex */
public final class ji implements defpackage.y71 {
    public final java.util.concurrent.atomic.AtomicReference IHQe1A4L2xu;

    public ji(defpackage.zd zdVar) {
        this.IHQe1A4L2xu = new java.util.concurrent.atomic.AtomicReference(zdVar);
    }

    @Override // defpackage.y71
    public final java.util.Iterator iterator() {
        defpackage.y71 y71Var = (defpackage.y71) this.IHQe1A4L2xu.getAndSet(null);
        if (y71Var != null) {
            return y71Var.iterator();
        }
        defpackage.db.AARZUJiTa("This sequence can be consumed only once.");
        return null;
    }
}
