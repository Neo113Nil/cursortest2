package defpackage;

/* loaded from: classes10.dex */
public final class w40 implements cpg, nuy, sm60 {
    public Object a;

    public /* synthetic */ w40(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }

    @Override // defpackage.cpg
    public void cleanup() {
    }

    @Override // defpackage.cpg
    public Object d() {
        return this.a;
    }

    @Override // defpackage.sm60
    public String q() {
        return qv10.r(new StringBuilder("attempted to overwrite the existing value '"), this.a, '\'');
    }
}
