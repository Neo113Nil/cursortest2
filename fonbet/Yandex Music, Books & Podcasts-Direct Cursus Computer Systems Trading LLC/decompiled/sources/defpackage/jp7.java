package defpackage;

/* loaded from: classes.dex */
public final class jp7 {
    public final String a;
    public int b;
    public long c;
    public final uvh d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ kp7 g;

    public jp7(kp7 kp7Var, String str, int i, uvh uvhVar) {
        this.g = kp7Var;
        this.a = str;
        this.b = i;
        this.c = uvhVar == null ? -1L : uvhVar.d;
        if (uvhVar == null || !uvhVar.b()) {
            return;
        }
        this.d = uvhVar;
    }

    public final boolean a(c80 c80Var) {
        uvh uvhVar = c80Var.d;
        sis sisVar = c80Var.b;
        if (uvhVar == null) {
            return this.b != c80Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (uvhVar.d > j) {
            return true;
        }
        uvh uvhVar2 = this.d;
        if (uvhVar2 == null) {
            return false;
        }
        int i = uvhVar2.b;
        int b = sisVar.b(uvhVar.a);
        int b2 = sisVar.b(uvhVar2.a);
        if (uvhVar.d < uvhVar2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!uvhVar.b()) {
            int i2 = uvhVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = uvhVar.b;
        int i4 = uvhVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > uvhVar2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(sis sisVar, sis sisVar2) {
        uvh uvhVar;
        int i = this.b;
        if (i < sisVar.o()) {
            kp7 kp7Var = this.g;
            ris risVar = kp7Var.a;
            sisVar.n(i, risVar);
            for (int i2 = risVar.n; i2 <= risVar.o; i2++) {
                int b = sisVar2.b(sisVar.l(i2));
                if (b != -1) {
                    i = sisVar2.f(b, kp7Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((uvhVar = this.d) == null || sisVar2.b(uvhVar.a) != -1);
    }
}
