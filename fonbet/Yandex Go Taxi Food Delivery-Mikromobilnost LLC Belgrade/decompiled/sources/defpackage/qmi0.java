package defpackage;

/* loaded from: classes9.dex */
public final class qmi0 extends rm60 {
    public final ntf0 c;
    public final int d;
    public final int e;
    public final int f;

    public qmi0(ntf0 ntf0Var, String str) {
        super(2, str);
        this.c = ntf0Var;
        int i = j810.a[2];
        this.d = i;
        int i2 = 1970 % i;
        this.e = i2;
        this.f = 1970 - i2;
    }

    @Override // defpackage.rm60
    public final sm60 a(Object obj, CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 = (i3 * 10) + (charSequence.charAt(i) - '0');
            i++;
        }
        int i4 = this.e;
        int i5 = this.f;
        if (i3 < i4) {
            i5 += this.d;
        }
        Object a = this.c.a(obj, Integer.valueOf(i5 + i3));
        if (a == null) {
            return null;
        }
        return new w40(a);
    }

    @Override // defpackage.rm60
    public final Integer b() {
        return 2;
    }
}
