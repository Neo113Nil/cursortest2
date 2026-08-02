package defpackage;

/* loaded from: classes5.dex */
public final class y7o {
    public final tb a;
    public final r7w b;

    public y7o(Object obj, r7w r7wVar) {
        this.a = r7wVar == null ? new tb(obj) : null;
        this.b = r7wVar;
    }

    public final Object a() {
        tb tbVar = this.a;
        up6.D(tbVar);
        return tbVar.a;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean c() {
        return this.b == null;
    }

    public final Object d() {
        if (!b()) {
            return a();
        }
        r7w r7wVar = this.b;
        up6.D(r7wVar);
        throw r7wVar;
    }
}
