package defpackage;

/* loaded from: classes5.dex */
public final class m9i extends n1j {
    public final o9i g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m9i(o9i o9iVar) {
        super(r3, r4, r5, vz1.s(k5r.r(r0, "Mobile Backend Error: code - ", ", status - ", r1, " in request "), r2, ": ", r6 == null ? "empty message" : r6), (String) null, 48);
        o9iVar.getClass();
        int i = o9iVar.b;
        Integer num = o9iVar.e;
        q1c q1cVar = i == 1004 ? (num != null && num.intValue() == 1) ? q1c.d : q1c.c : q1c.a;
        r1c r1cVar = r1c.b;
        Integer valueOf = Integer.valueOf(i);
        String str = o9iVar.a;
        String str2 = o9iVar.c;
        String str3 = o9iVar.d;
        this.g = o9iVar;
    }

    @Override // defpackage.p1c
    public final dn9 a() {
        return new dn9(this.b, this.c, this.d, this.g.a, this.a);
    }
}
