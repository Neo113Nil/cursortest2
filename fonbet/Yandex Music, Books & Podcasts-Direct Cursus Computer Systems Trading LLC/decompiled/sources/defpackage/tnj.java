package defpackage;

import java.io.EOFException;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class tnj {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[KotlinVersion.MAX_COMPONENT_VALUE];
    public final d7k g = new d7k(KotlinVersion.MAX_COMPONENT_VALUE);

    public final boolean a(s2c s2cVar, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        d7k d7kVar = this.g;
        d7kVar.E(27);
        try {
            z2 = s2cVar.l(d7kVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && d7kVar.x() == 1332176723) {
            if (d7kVar.v() == 0) {
                this.a = d7kVar.v();
                this.b = d7kVar.k();
                d7kVar.m();
                d7kVar.m();
                d7kVar.m();
                int v = d7kVar.v();
                this.c = v;
                this.d = v + 27;
                d7kVar.E(v);
                try {
                    z3 = s2cVar.l(d7kVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int v2 = d7kVar.v();
                        this.f[i] = v2;
                        this.e += v2;
                    }
                    return true;
                }
            } else if (!z) {
                throw r7k.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(s2c s2cVar, long j) {
        boolean z;
        vq1.v(s2cVar.getPosition() == s2cVar.s());
        d7k d7kVar = this.g;
        d7kVar.E(4);
        while (true) {
            if (j != -1 && s2cVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = s2cVar.l(d7kVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            d7kVar.H(0);
            if (d7kVar.x() == 1332176723) {
                s2cVar.n();
                return true;
            }
            s2cVar.y(1);
        }
        do {
            if (j != -1 && s2cVar.getPosition() >= j) {
                break;
            }
        } while (s2cVar.v(1) != -1);
        return false;
    }
}
