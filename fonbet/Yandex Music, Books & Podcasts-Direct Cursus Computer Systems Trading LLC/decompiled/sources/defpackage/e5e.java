package defpackage;

import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class e5e implements Closeable {
    public final hkn a;
    public final hi3 b;
    public final cp2 c;
    public int d;
    public boolean e;

    public e5e(hkn hknVar) {
        this.a = hknVar;
        hi3 hi3Var = new hi3();
        this.b = hi3Var;
        this.c = new cp2(hi3Var);
        this.d = 16384;
    }

    public final void a(int i, int i2, byte b, byte b2) {
        Logger logger = g5e.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d5e.a(false, i, i2, b, b2));
        }
        int i3 = this.d;
        if (i2 > i3) {
            Locale locale = Locale.US;
            xq0.x(f1d.e(i3, i2, "FRAME_SIZE_ERROR length > ", ": "));
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Locale locale2 = Locale.US;
            xq0.x(k5r.i(i, "reserved bit set: "));
            return;
        }
        int i4 = (i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        hkn hknVar = this.a;
        hknVar.writeByte(i4);
        hknVar.writeByte((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        hknVar.writeByte(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        hknVar.writeByte(b & 255);
        hknVar.writeByte(b2 & 255);
        hknVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void b(int i, List list, boolean z) {
        int i2;
        int i3;
        if (this.e) {
            kac.f("closed");
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            vtd vtdVar = (vtd) list.get(i4);
            pn3 s = vtdVar.a.s();
            pn3 pn3Var = vtdVar.b;
            Integer num = (Integer) u4e.c.get(s);
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (i3 >= 2 && i3 <= 7) {
                    vtd[] vtdVarArr = u4e.b;
                    if (vtdVarArr[intValue].b.equals(pn3Var)) {
                        i2 = i3;
                    } else if (vtdVarArr[i3].b.equals(pn3Var)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            cp2 cp2Var = this.c;
            if (i3 == -1) {
                int i5 = cp2Var.b + 1;
                while (true) {
                    vtd[] vtdVarArr2 = (vtd[]) cp2Var.e;
                    if (i5 >= vtdVarArr2.length) {
                        break;
                    }
                    if (vtdVarArr2[i5].a.equals(s)) {
                        if (((vtd[]) cp2Var.e)[i5].b.equals(pn3Var)) {
                            i3 = (i5 - cp2Var.b) + u4e.b.length;
                            break;
                        } else if (i2 == -1) {
                            i2 = (i5 - cp2Var.b) + u4e.b.length;
                        }
                    }
                    i5++;
                }
            }
            if (i3 != -1) {
                cp2Var.k(i3, 127, 128);
            } else if (i2 == -1) {
                ((hi3) cp2Var.d).M0(64);
                cp2Var.j(s);
                cp2Var.j(pn3Var);
                cp2Var.h(vtdVar);
            } else {
                pn3 pn3Var2 = u4e.a;
                s.getClass();
                pn3Var2.getClass();
                if (!s.p(0, pn3Var2, pn3Var2.d()) || vtd.h.equals(s)) {
                    cp2Var.k(i2, 63, 64);
                    cp2Var.j(pn3Var);
                    cp2Var.h(vtdVar);
                } else {
                    cp2Var.k(i2, 15, 0);
                    cp2Var.j(pn3Var);
                }
            }
        }
        hi3 hi3Var = this.b;
        long j = hi3Var.b;
        int min = (int) Math.min(this.d, j);
        long j2 = min;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        a(i, min, (byte) 1, b);
        hkn hknVar = this.a;
        hknVar.t0(hi3Var, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int min2 = (int) Math.min(this.d, j3);
                long j4 = min2;
                j3 -= j4;
                a(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                hknVar.t0(hi3Var, j4);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.a.close();
    }
}
