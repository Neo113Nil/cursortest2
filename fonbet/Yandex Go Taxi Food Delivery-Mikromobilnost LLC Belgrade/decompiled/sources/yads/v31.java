package yads;

import defpackage.ela1;
import defpackage.jr71;
import defpackage.p481;
import defpackage.wr71;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public final class v31 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;
    public final Object[] c;

    public v31(w31 w31Var) {
        int i = ((bl2) w31Var).y;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        wr71 it = w31Var.entrySet().iterator();
        int i2 = 0;
        while (true) {
            p481 p481Var = (p481) it;
            if (!p481Var.hasNext()) {
                this.b = objArr;
                this.c = objArr2;
                return;
            } else {
                Map.Entry entry = (Map.Entry) p481Var.next();
                objArr[i2] = entry.getKey();
                objArr2[i2] = entry.getValue();
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.b;
        int i = 0;
        if (objArr instanceof y31) {
            y31 y31Var = (y31) objArr;
            n31 n31Var = (n31) this.c;
            Object[] objArr2 = new Object[y31Var.size() * 2];
            wr71 it = y31Var.iterator();
            wr71 it2 = n31Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                int i2 = i + 1;
                int i3 = i2 * 2;
                if (i3 > objArr2.length) {
                    objArr2 = Arrays.copyOf(objArr2, jr71.a(objArr2.length, i3));
                }
                ela1.b(next, next2);
                int i4 = i * 2;
                objArr2[i4] = next;
                objArr2[i4 + 1] = next2;
                i = i2;
            }
            return bl2.f(i, objArr2);
        }
        Object[] objArr3 = this.c;
        int i5 = 0;
        Object[] objArr4 = new Object[objArr.length * 2];
        while (i < objArr.length) {
            Object[] objArr5 = objArr[i];
            Object obj = objArr3[i];
            int i6 = i5 + 1;
            int i7 = i6 * 2;
            if (i7 > objArr4.length) {
                objArr4 = Arrays.copyOf(objArr4, jr71.a(objArr4.length, i7));
            }
            ela1.b(objArr5, obj);
            int i8 = i5 * 2;
            objArr4[i8] = objArr5;
            objArr4[i8 + 1] = obj;
            i++;
            i5 = i6;
            objArr4 = objArr4;
        }
        return bl2.f(i5, objArr4);
    }
}
