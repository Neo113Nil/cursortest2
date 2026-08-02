package defpackage;

/* loaded from: classes3.dex */
public final class ldb extends bfu {
    public final jyr k;
    public final xdr l;

    public ldb(odb odbVar, lwc lwcVar, jyr jyrVar) {
        Object gdbVar;
        this.k = jyrVar;
        if (odbVar instanceof mdb) {
            gdbVar = bdb.a;
        } else {
            if (!(odbVar instanceof ndb)) {
                b6e.s();
                throw null;
            }
            gdbVar = new gdb(((ndb) odbVar).a, false);
        }
        this.l = ydr.a(gdbVar);
        lwcVar.f.set(false);
    }
}
