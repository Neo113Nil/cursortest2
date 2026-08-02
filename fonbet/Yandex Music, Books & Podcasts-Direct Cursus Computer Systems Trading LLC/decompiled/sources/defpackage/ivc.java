package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class ivc {
    public final azs a;
    public o0t d;
    public cq7 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final String j;
    public boolean m;
    public final vvs b = new vvs();
    public final d7k c = new d7k();
    public final d7k k = new d7k(1);
    public final d7k l = new d7k();

    public ivc(azs azsVar, o0t o0tVar, cq7 cq7Var, String str) {
        this.a = azsVar;
        this.d = o0tVar;
        this.e = cq7Var;
        this.j = str;
        e(o0tVar, cq7Var);
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final lvs b() {
        if (this.m) {
            vvs vvsVar = this.b;
            cq7 cq7Var = vvsVar.a;
            int i = dvt.a;
            int i2 = cq7Var.a;
            lvs lvsVar = vvsVar.m;
            if (lvsVar == null) {
                lvs[] lvsVarArr = this.d.a.l;
                lvsVar = lvsVarArr == null ? null : lvsVarArr[i2];
            }
            if (lvsVar != null && lvsVar.a) {
                return lvsVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        d7k d7kVar;
        lvs b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        vvs vvsVar = this.b;
        if (i3 != 0) {
            d7kVar = vvsVar.n;
        } else {
            byte[] bArr = b.e;
            int i4 = dvt.a;
            int length = bArr.length;
            d7k d7kVar2 = this.l;
            d7kVar2.F(length, bArr);
            i3 = bArr.length;
            d7kVar = d7kVar2;
        }
        boolean z = vvsVar.k && vvsVar.l[this.f];
        boolean z2 = z || i2 != 0;
        d7k d7kVar3 = this.k;
        d7kVar3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        d7kVar3.H(0);
        azs azsVar = this.a;
        azsVar.b(d7kVar3, 1, 1);
        azsVar.b(d7kVar, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        d7k d7kVar4 = this.c;
        if (!z) {
            d7kVar4.E(8);
            byte[] bArr2 = d7kVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            azsVar.b(d7kVar4, 8, 1);
            return i3 + 9;
        }
        d7k d7kVar5 = vvsVar.n;
        int B = d7kVar5.B();
        d7kVar5.I(-2);
        int i5 = (B * 6) + 2;
        if (i2 != 0) {
            d7kVar4.E(i5);
            byte[] bArr3 = d7kVar4.a;
            d7kVar5.f(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i6 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            d7kVar4 = d7kVar5;
        }
        azsVar.b(d7kVar4, i5, 1);
        return i3 + 1 + i5;
    }

    public final void e(o0t o0tVar, cq7 cq7Var) {
        this.d = o0tVar;
        this.e = cq7Var;
        bsc a = o0tVar.a.g.a();
        a.l = l5i.p(this.j);
        this.a.d(new dsc(a));
        f();
    }

    public final void f() {
        vvs vvsVar = this.b;
        vvsVar.d = 0;
        vvsVar.p = 0L;
        vvsVar.q = false;
        vvsVar.k = false;
        vvsVar.o = false;
        vvsVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
