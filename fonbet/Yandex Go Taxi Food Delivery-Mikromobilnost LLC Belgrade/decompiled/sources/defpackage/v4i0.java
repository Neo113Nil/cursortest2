package defpackage;

/* loaded from: classes4.dex */
public final class v4i0 extends o2 {
    public m3 a;

    public final zc3 m() {
        a2[] a2VarArr = this.a.a;
        if (a2VarArr.length == 0) {
            return null;
        }
        return zc3.m(a2VarArr[0]);
    }

    public final zc3[] n() {
        m3 m3Var = this.a;
        int length = m3Var.a.length;
        zc3[] zc3VarArr = new zc3[length];
        for (int i = 0; i != length; i++) {
            zc3VarArr[i] = zc3.m(m3Var.a[i]);
        }
        return zc3VarArr;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }
}
