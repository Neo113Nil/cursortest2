package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class eo3 implements do3 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public eo3(int i, int i2, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[RETURN] */
    @Override // defpackage.do3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(llo lloVar) {
        int i;
        int i2;
        boolean z = this.d;
        String str = this.e;
        if (z && str == null) {
            str = lloVar.o();
        }
        jlo jloVar = lloVar.b;
        if (jloVar != null) {
            Iterator it = jloVar.a().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                llo lloVar2 = (llo) ((nlo) it.next());
                if (lloVar2 == lloVar) {
                    i = i2;
                }
                if (str == null || lloVar2.o().equals(str)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.c ? i + 1 : i2 - i;
        int i4 = this.b;
        int i5 = this.a;
        if (i5 == 0) {
            return i3 == i4;
        }
        int i6 = i3 - i4;
        if (i6 % i5 != 0 || (Integer.signum(i6) != 0 && Integer.signum(i6) != Integer.signum(i5))) {
        }
    }

    public final String toString() {
        String str = this.c ? "" : "last-";
        int i = this.b;
        boolean z = this.d;
        int i2 = this.a;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
