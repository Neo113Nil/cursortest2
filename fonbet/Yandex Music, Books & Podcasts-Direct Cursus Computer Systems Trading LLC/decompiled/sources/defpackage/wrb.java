package defpackage;

/* loaded from: classes.dex */
public final class wrb implements ewh {
    public final Object a;
    public final gch b;
    public sis c;

    public wrb(Object obj, gch gchVar) {
        this.a = obj;
        this.b = gchVar;
        this.c = gchVar.o;
    }

    @Override // defpackage.ewh
    public final sis a() {
        return this.c;
    }

    @Override // defpackage.ewh
    public final Object getUid() {
        return this.a;
    }
}
