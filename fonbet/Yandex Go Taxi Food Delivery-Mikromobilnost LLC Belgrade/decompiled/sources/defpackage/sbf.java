package defpackage;

/* loaded from: classes4.dex */
public final class sbf extends o2 {
    public i3 a;

    public sbf(ubf[] ubfVarArr) {
        this.a = new jqf(ubfVarArr);
    }

    public final ubf[] m() {
        i3 i3Var = this.a;
        int size = i3Var.size();
        ubf[] ubfVarArr = new ubf[size];
        for (int i = 0; i < size; i++) {
            ubfVarArr[i] = ubf.m(i3Var.A(i));
        }
        return ubfVarArr;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return new jqf(this.a);
    }
}
