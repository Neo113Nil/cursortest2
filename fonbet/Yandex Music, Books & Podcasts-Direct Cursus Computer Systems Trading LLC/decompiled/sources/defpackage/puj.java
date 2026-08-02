package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class puj extends y5g {
    public int b;
    public int d;
    public int f;
    public s17[] a = new s17[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final void C0() {
        this.b = 0;
        this.d = 0;
        Arrays.fill(this.e, 0, this.f, (Object) null);
        this.f = 0;
    }

    public final void D0(nw0 nw0Var, oxq oxqVar, m mVar) {
        int i;
        int i2;
        if (F0()) {
            n8n n8nVar = new n8n(this);
            puj pujVar = (puj) n8nVar.e;
            do {
                pujVar.a[n8nVar.b].a(n8nVar, nw0Var, oxqVar, mVar);
                int i3 = n8nVar.b;
                i = pujVar.b;
                if (i3 >= i) {
                    break;
                }
                s17 s17Var = pujVar.a[i3];
                n8nVar.c += s17Var.b;
                n8nVar.d += s17Var.c;
                i2 = i3 + 1;
                n8nVar.b = i2;
            } while (i2 < i);
        }
        C0();
    }

    public final boolean E0() {
        return this.b == 0;
    }

    public final boolean F0() {
        return this.b != 0;
    }

    public final void G0(s17 s17Var) {
        int i = this.b;
        s17[] s17VarArr = this.a;
        if (i == s17VarArr.length) {
            s17[] s17VarArr2 = new s17[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(s17VarArr, 0, s17VarArr2, 0, i);
            this.a = s17VarArr2;
        }
        int i2 = this.d;
        int i3 = s17Var.b;
        int i4 = s17Var.c;
        int i5 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            uz0.e(0, 0, length, iArr, iArr2);
            this.c = iArr2;
        }
        int i7 = this.f + i4;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        s17[] s17VarArr3 = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        s17VarArr3[i9] = s17Var;
        this.d += s17Var.b;
        this.f += i4;
    }
}
