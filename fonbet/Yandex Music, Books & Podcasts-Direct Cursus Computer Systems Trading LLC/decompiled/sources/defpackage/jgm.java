package defpackage;

/* loaded from: classes5.dex */
public abstract class jgm extends x5 {
    public final kip b;
    public final mhp c;

    public jgm(kip kipVar) {
        super(1);
        this.b = kipVar;
        this.c = w4f.Companion.serializer().getDescriptor();
    }

    @Override // defpackage.x5
    public final Object g(x3f x3fVar, w4f w4fVar) {
        String a;
        if (!(w4fVar instanceof q5f)) {
            return m(x3fVar, w4fVar, new IllegalArgumentException("JsonObject is expected"));
        }
        q5f q5fVar = (q5f) w4fVar;
        w4f w4fVar2 = (w4f) q5fVar.get("type");
        if (w4fVar2 == null || (a = x4f.g(w4fVar2).a()) == null) {
            return m(x3fVar, w4fVar, new zhp("Missing required type field \"type\" (presented fields: " + q5fVar.a.keySet() + ")"));
        }
        t9f g = this.b.g(a);
        if (g == null) {
            return l(a, x3fVar, q5fVar);
        }
        try {
            return x3fVar.a(g, w4fVar);
        } catch (Throwable th) {
            return m(x3fVar, w4fVar, th);
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.c;
    }

    public abstract Object l(String str, x3f x3fVar, q5f q5fVar);

    public abstract Object m(x3f x3fVar, w4f w4fVar, Throwable th);
}
