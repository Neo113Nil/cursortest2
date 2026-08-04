package com.gamericefishpro.space.i9;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f5 implements Cloneable {
    public final g5 d;
    public g5 e;

    public f5(g5 g5Var) {
        this.d = g5Var;
        if (g5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.e = (g5) g5Var.o(4);
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.e.e()) {
            return;
        }
        g5 g5Var = (g5) this.d.o(4);
        f6.c.a(g5Var.getClass()).d(g5Var, this.e);
        this.e = g5Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f5 clone() {
        f5 f5Var = (f5) this.d.o(5);
        f5Var.e = d();
        return f5Var;
    }

    public final g5 d() {
        if (!this.e.e()) {
            return this.e;
        }
        this.e.g();
        return this.e;
    }

    public final g5 e() {
        g5 g5VarD = d();
        g5VarD.getClass();
        boolean zI = true;
        byte bByteValue = ((Byte) g5VarD.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zI = false;
            } else {
                zI = f6.c.a(g5VarD.getClass()).i(g5VarD);
                g5VarD.o(2);
            }
        }
        if (zI) {
            return g5VarD;
        }
        throw new com.gamericefishpro.space.bb.n("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(g5 g5Var) {
        g5 g5Var2 = this.d;
        if (g5Var2.equals(g5Var)) {
            return;
        }
        if (!this.e.e()) {
            g5 g5Var3 = (g5) g5Var2.o(4);
            f6.c.a(g5Var3.getClass()).d(g5Var3, this.e);
            this.e = g5Var3;
        }
        g5 g5Var4 = this.e;
        f6.c.a(g5Var4.getClass()).d(g5Var4, g5Var);
    }

    public final void g(byte[] bArr, int i, z4 z4Var) throws p5 {
        if (!this.e.e()) {
            g5 g5Var = (g5) this.d.o(4);
            f6.c.a(g5Var.getClass()).d(g5Var, this.e);
            this.e = g5Var;
        }
        try {
            i6 i6VarA = f6.c.a(this.e.getClass());
            g5 g5Var2 = this.e;
            s4 s4Var = new s4();
            z4Var.getClass();
            i6VarA.f(g5Var2, bArr, 0, i, s4Var);
        } catch (p5 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
