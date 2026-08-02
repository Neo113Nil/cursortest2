package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements e {
    public final e[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(List list, boolean z) {
        this((e[]) r2.toArray(new e[r2.size()]), z);
        ArrayList arrayList = (ArrayList) list;
    }

    public d(e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(x xVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            xVar.c++;
        }
        try {
            for (e eVar : this.a) {
                if (!eVar.u(xVar, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z) {
                xVar.c--;
            }
        }
    }

    @Override // j$.time.format.e
    public final int E(v vVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        e[] eVarArr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = vVar.d;
            c0 c = vVar.c();
            c.getClass();
            c0 c0Var = new c0();
            ((HashMap) c0Var.a).putAll(c.a);
            c0Var.b = c.b;
            c0Var.c = c.c;
            c0Var.d = c.d;
            arrayList.add(c0Var);
            int length = eVarArr.length;
            int i3 = i;
            while (i2 < length) {
                i3 = eVarArr[i2].E(vVar, charSequence, i3);
                if (i3 < 0) {
                    vVar.d.remove(r8.size() - 1);
                    return i;
                }
                i2++;
            }
            vVar.d.remove(r8.size() - 2);
            return i3;
        }
        int length2 = eVarArr.length;
        while (i2 < length2) {
            i = eVarArr[i2].E(vVar, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
