package defpackage;

import android.util.StateSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class gn7 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public gn7(eg0 eg0Var) {
        this.c = eg0Var;
        this.e = dv2.b;
        this.d = fzh.a;
        this.b = new ArrayList();
        this.a = 0;
        this.g = fn7.b;
        this.h = new pd4(128);
    }

    public void a(int[] iArr, eup eupVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.c = eupVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.d = iArr3;
            eup[] eupVarArr = new eup[i2];
            System.arraycopy((eup[]) this.b, 0, eupVarArr, 0, i);
            this.b = eupVarArr;
        }
        int[][] iArr4 = (int[][]) this.d;
        int i3 = this.a;
        iArr4[i3] = iArr;
        ((eup[]) this.b)[i3] = eupVar;
        this.a = i3 + 1;
    }

    public boolean b() {
        return this.a < ((List) this.g).size() || !((ArrayList) this.b).isEmpty();
    }

    public void c() {
        this.c = new eup();
        this.d = new int[10][];
        this.b = new eup[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
    
        r2 = new defpackage.ej3[r0.size()];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        if (r3 >= r0.size()) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ce, code lost:
    
        r2[r3] = new defpackage.ej3((defpackage.pd4) r0.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d5, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e2, code lost:
    
        throw new defpackage.lzm(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e3, code lost:
    
        r3 = ((defpackage.lvd) ((defpackage.rd2) r12.f).d).b;
        r3.clear();
        java.util.Collections.addAll(r3, r2);
        r2 = (defpackage.rd2) r12.f;
        r12.f = null;
        r0.clear();
        r12.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fe, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rd2 d() {
        int i;
        int i2;
        char[] cArr;
        int i3;
        char c;
        ArrayList arrayList = (ArrayList) this.b;
        fzh fzhVar = (fzh) this.d;
        eg0 eg0Var = (eg0) this.c;
        int i4 = this.a;
        if (i4 == 0) {
            try {
                this.f = e(eg0Var);
                this.a = 1;
            } catch (e7k e) {
                lzm lzmVar = new lzm(e.getMessage());
                lzmVar.initCause(e);
                throw lzmVar;
            }
        } else if (i4 != 1) {
            xq0.q("Inconsistent parser state");
            return null;
        }
        fzhVar.getClass();
        dv2 dv2Var = (dv2) this.e;
        bg3.P(eg0Var, "Session input buffer");
        bg3.P(dv2Var, "Line parser");
        bg3.P(arrayList, "Header line list");
        pd4 pd4Var = null;
        pd4 pd4Var2 = null;
        while (true) {
            i = 0;
            if (pd4Var == null) {
                pd4Var = new pd4(64);
            } else {
                pd4Var.b = 0;
            }
            if (eg0Var.i(pd4Var) == -1 || pd4Var.b < 1) {
                break;
            }
            char c2 = pd4Var.a[0];
            if ((c2 == ' ' || c2 == '\t') && pd4Var2 != null) {
                while (i < pd4Var.b && ((c = pd4Var.a[i]) == ' ' || c == '\t')) {
                    i++;
                }
                pd4Var2.a(' ');
                i2 = pd4Var.b - i;
                cArr = pd4Var.a;
                if (cArr == null) {
                    continue;
                } else {
                    if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                        break;
                    }
                    if (i2 != 0) {
                        int i5 = pd4Var2.b + i2;
                        if (i5 > pd4Var2.a.length) {
                            pd4Var2.d(i5);
                        }
                        System.arraycopy(cArr, i, pd4Var2.a, pd4Var2.b, i2);
                        pd4Var2.b = i5;
                    }
                }
            } else {
                arrayList.add(pd4Var);
                pd4Var2 = pd4Var;
                pd4Var = null;
            }
        }
        l1j.k(cArr.length, dfi.l("off: ", i, i2, " len: ", " b.length: "));
        return null;
    }

    public rd2 e(eg0 eg0Var) {
        pd4 pd4Var = (pd4) this.h;
        pd4Var.b = 0;
        if (eg0Var.i(pd4Var) == -1) {
            throw new s6j("The target server failed to respond");
        }
        int i = pd4Var.b;
        c9n c9nVar = new c9n(i);
        dv2 dv2Var = (dv2) this.e;
        dv2Var.getClass();
        int i2 = c9nVar.c;
        try {
            a8e a = dv2Var.a(pd4Var, c9nVar);
            int i3 = c9nVar.c;
            while (i3 < i && vrd.a(pd4Var.a[i3])) {
                i3++;
            }
            c9nVar.h(i3);
            int i4 = c9nVar.c;
            int e = pd4Var.e(32, i4, i);
            if (e < 0) {
                e = i;
            }
            String g = pd4Var.g(i4, e);
            for (int i5 = 0; i5 < g.length(); i5++) {
                if (!Character.isDigit(g.charAt(i5))) {
                    throw new e7k("Status line contains invalid status code: " + pd4Var.f(i2, i));
                }
            }
            try {
                lv2 lv2Var = new lv2(a, Integer.parseInt(g), e < i ? pd4Var.g(e, i) : "");
                fn7 fn7Var = (fn7) this.g;
                fn7Var.getClass();
                return new rd2(lv2Var, fn7Var.a, Locale.getDefault());
            } catch (NumberFormatException unused) {
                throw new e7k("Status line contains invalid status code: " + pd4Var.f(i2, i));
            }
        } catch (IndexOutOfBoundsException unused2) {
            throw new e7k("Invalid status line: ".concat(pd4Var.f(i2, i)));
        }
    }

    public gn7(eup eupVar) {
        c();
        a(StateSet.WILD_CARD, eupVar);
    }
}
