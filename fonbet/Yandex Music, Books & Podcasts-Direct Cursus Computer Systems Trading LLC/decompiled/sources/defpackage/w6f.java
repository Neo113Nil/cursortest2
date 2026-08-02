package defpackage;

/* loaded from: classes5.dex */
public final class w6f extends z6 {
    public final w4f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6f(x3f x3fVar, w4f w4fVar, String str) {
        super(x3fVar, str);
        x3fVar.getClass();
        w4fVar.getClass();
        this.f = w4fVar;
        this.a.add("primitive");
    }

    @Override // defpackage.z6
    public final w4f I(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        xq0.x("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.z6
    public final w4f W() {
        return this.f;
    }

    @Override // defpackage.tq5
    public final int w(mhp mhpVar) {
        mhpVar.getClass();
        return 0;
    }
}
