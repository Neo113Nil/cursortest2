package defpackage;

/* loaded from: classes5.dex */
public final class g7f extends z6 {
    public final c4f f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7f(x3f x3fVar, c4f c4fVar) {
        super(x3fVar, null);
        x3fVar.getClass();
        c4fVar.getClass();
        this.f = c4fVar;
        this.g = c4fVar.a.size();
        this.h = -1;
    }

    @Override // defpackage.z6
    public final w4f I(String str) {
        str.getClass();
        return (w4f) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.z6
    public final String U(mhp mhpVar, int i) {
        mhpVar.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.z6
    public final w4f W() {
        return this.f;
    }

    @Override // defpackage.tq5
    public final int w(mhp mhpVar) {
        mhpVar.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
