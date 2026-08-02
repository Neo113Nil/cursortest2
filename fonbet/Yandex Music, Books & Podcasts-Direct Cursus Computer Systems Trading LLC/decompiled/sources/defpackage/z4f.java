package defpackage;

/* loaded from: classes5.dex */
public final class z4f implements t9f {
    public static final z4f a = new z4f();
    public static final ohp b = avf.x("kotlinx.serialization.json.JsonElement", igm.c, new mhp[0], new s3f(1));

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return ltg.r(eg7Var).f();
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w4f w4fVar = (w4f) obj;
        l6bVar.getClass();
        w4fVar.getClass();
        ltg.s(l6bVar);
        if (w4fVar instanceof v6f) {
            l6bVar.v(y6f.a, w4fVar);
            return;
        }
        if (w4fVar instanceof q5f) {
            l6bVar.v(s5f.a, w4fVar);
        } else if (w4fVar instanceof c4f) {
            l6bVar.v(f4f.a, w4fVar);
        } else {
            b6e.s();
        }
    }
}
