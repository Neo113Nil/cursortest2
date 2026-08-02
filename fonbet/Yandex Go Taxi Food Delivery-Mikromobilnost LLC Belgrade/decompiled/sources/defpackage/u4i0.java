package defpackage;

/* loaded from: classes4.dex */
public final class u4i0 extends n2 {
    public l3 a;

    public final yc3 h() {
        z1[] z1VarArr = this.a.a;
        if (z1VarArr.length == 0) {
            return null;
        }
        return yc3.h(z1VarArr[0]);
    }

    public final yc3[] i() {
        l3 l3Var = this.a;
        int length = l3Var.a.length;
        yc3[] yc3VarArr = new yc3[length];
        for (int i = 0; i != length; i++) {
            yc3VarArr[i] = yc3.h(l3Var.a[i]);
        }
        return yc3VarArr;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        return this.a;
    }
}
