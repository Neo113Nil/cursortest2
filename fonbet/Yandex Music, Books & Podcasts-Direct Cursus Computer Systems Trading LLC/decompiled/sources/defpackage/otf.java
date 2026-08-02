package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class otf {
    public ga6 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ b h;
    public ltf[] a = pd.i;
    public int e = 1;

    public otf(b bVar) {
        this.h = bVar;
    }

    public static void b(otf otfVar, vtf vtfVar, mm6 mm6Var, uod uodVar, int i, int i2) {
        otfVar.h.getClass();
        long i3 = vtfVar.i(0);
        otfVar.a(vtfVar, mm6Var, uodVar, i, i2, (int) (!vtfVar.e() ? i3 & 4294967295L : i3 >> 32));
    }

    public final void a(vtf vtfVar, mm6 mm6Var, uod uodVar, int i, int i2, int i3) {
        ltf[] ltfVarArr;
        ltf[] ltfVarArr2 = this.a;
        int length = ltfVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                ltf ltfVar = ltfVarArr2[i4];
                if (ltfVar != null && ltfVar.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int b = vtfVar.b();
        int length2 = this.a.length;
        while (true) {
            ltfVarArr = this.a;
            if (b >= length2) {
                break;
            }
            ltf ltfVar2 = ltfVarArr[b];
            if (ltfVar2 != null) {
                ltfVar2.c();
            }
            b++;
        }
        if (ltfVarArr.length != vtfVar.b()) {
            this.a = (ltf[]) Arrays.copyOf(this.a, vtfVar.b());
        }
        this.b = new ga6(vtfVar.d());
        this.c = i3;
        this.d = vtfVar.j();
        this.e = vtfVar.c();
        int b2 = vtfVar.b();
        for (int i5 = 0; i5 < b2; i5++) {
            Object g = vtfVar.g(i5);
            ctf ctfVar = g instanceof ctf ? (ctf) g : null;
            ltf[] ltfVarArr3 = this.a;
            if (ctfVar == null) {
                ltf ltfVar3 = ltfVarArr3[i5];
                if (ltfVar3 != null) {
                    ltfVar3.c();
                }
                this.a[i5] = null;
            } else {
                ltf ltfVar4 = ltfVarArr3[i5];
                if (ltfVar4 == null) {
                    ltfVar4 = new ltf(mm6Var, uodVar, new ypb(12, this.h));
                    this.a[i5] = ltfVar4;
                }
                ltfVar4.d = ctfVar.o;
                ltfVar4.e = ctfVar.p;
                ltfVar4.f = ctfVar.q;
            }
        }
    }
}
