package defpackage;

/* loaded from: classes6.dex */
public final class dv2 {
    public static final dv2 b;
    public final mzm a = a8e.f;

    static {
        new dv2();
        b = new dv2();
    }

    public final a8e a(pd4 pd4Var, c9n c9nVar) {
        bg3.P(pd4Var, "Char array buffer");
        mzm mzmVar = this.a;
        String str = mzmVar.a;
        int length = str.length();
        int i = c9nVar.c;
        int i2 = c9nVar.b;
        int i3 = i;
        while (i3 < i2 && vrd.a(pd4Var.a[i3])) {
            i3++;
        }
        c9nVar.h(i3);
        int i4 = c9nVar.c;
        int i5 = i4 + length;
        if (i5 + 4 > i2) {
            throw new e7k("Not a valid protocol version: ".concat(pd4Var.f(i, i2)));
        }
        boolean z = true;
        for (int i6 = 0; z && i6 < length; i6++) {
            z = pd4Var.a[i4 + i6] == str.charAt(i6);
        }
        if (z) {
            z = pd4Var.a[i5] == '/';
        }
        if (!z) {
            throw new e7k("Not a valid protocol version: ".concat(pd4Var.f(i, i2)));
        }
        int i7 = length + 1 + i4;
        int e = pd4Var.e(46, i7, i2);
        if (e == -1) {
            throw new e7k("Invalid protocol version number: ".concat(pd4Var.f(i, i2)));
        }
        try {
            int parseInt = Integer.parseInt(pd4Var.g(i7, e));
            int i8 = e + 1;
            int e2 = pd4Var.e(32, i8, i2);
            if (e2 == -1) {
                e2 = i2;
            }
            try {
                int parseInt2 = Integer.parseInt(pd4Var.g(i8, e2));
                c9nVar.h(e2);
                a8e a8eVar = (a8e) mzmVar;
                if (parseInt == a8eVar.b && parseInt2 == a8eVar.c) {
                    return a8eVar;
                }
                if (parseInt == 1) {
                    if (parseInt2 == 0) {
                        return a8e.e;
                    }
                    if (parseInt2 == 1) {
                        return a8e.f;
                    }
                }
                return (parseInt == 0 && parseInt2 == 9) ? a8e.d : new a8e(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                throw new e7k("Invalid protocol minor version number: ".concat(pd4Var.f(i, i2)));
            }
        } catch (NumberFormatException unused2) {
            throw new e7k("Invalid protocol major version number: ".concat(pd4Var.f(i, i2)));
        }
    }
}
