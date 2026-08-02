package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class nr5 extends w8 {
    public static final wvo e = new wvo(17);
    public static final e3s f = new e3s(17);
    public static final gos g = new gos(17);
    public static final ehv h = new ehv(17);
    public static final i9w i = new i9w();
    public final ArrayDeque a;
    public ArrayDeque b;
    public int c;
    public boolean d;

    public nr5() {
        new ArrayDeque(2);
        this.a = new ArrayDeque();
    }

    @Override // defpackage.w8
    public final void D(ByteBuffer byteBuffer) {
        X(h, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.w8
    public final void H(byte[] bArr, int i2, int i3) {
        X(g, i3, bArr, i2);
    }

    @Override // defpackage.w8
    public final int I() {
        return X(e, 1, null, 0);
    }

    @Override // defpackage.w8
    public final int N() {
        return this.c;
    }

    @Override // defpackage.w8
    public final void P(int i2) {
        X(f, i2, null, 0);
    }

    public final void Q(w8 w8Var) {
        boolean z = this.d;
        ArrayDeque arrayDeque = this.a;
        boolean z2 = z && arrayDeque.isEmpty();
        if (w8Var instanceof nr5) {
            nr5 nr5Var = (nr5) w8Var;
            ArrayDeque arrayDeque2 = nr5Var.a;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((w8) arrayDeque2.remove());
            }
            this.c += nr5Var.c;
            nr5Var.c = 0;
            nr5Var.close();
        } else {
            arrayDeque.add(w8Var);
            this.c = w8Var.N() + this.c;
        }
        if (z2) {
            ((w8) arrayDeque.peek()).b();
        }
    }

    public final void R() {
        boolean z = this.d;
        ArrayDeque arrayDeque = this.a;
        if (!z) {
            ((w8) arrayDeque.remove()).close();
            return;
        }
        this.b.add((w8) arrayDeque.remove());
        w8 w8Var = (w8) arrayDeque.peek();
        if (w8Var != null) {
            w8Var.b();
        }
    }

    public final int S(mr5 mr5Var, int i2, Object obj, int i3) {
        a(i2);
        ArrayDeque arrayDeque = this.a;
        if (!arrayDeque.isEmpty() && ((w8) arrayDeque.peek()).N() == 0) {
            R();
        }
        while (i2 > 0 && !arrayDeque.isEmpty()) {
            w8 w8Var = (w8) arrayDeque.peek();
            int min = Math.min(i2, w8Var.N());
            i3 = mr5Var.v(w8Var, min, obj, i3);
            i2 -= min;
            this.c -= min;
            if (((w8) arrayDeque.peek()).N() == 0) {
                R();
            }
        }
        if (i2 <= 0) {
            return i3;
        }
        xq0.w("Failed executing read operation");
        return 0;
    }

    public final int X(lr5 lr5Var, int i2, Object obj, int i3) {
        try {
            return S(lr5Var, i2, obj, i3);
        } catch (IOException e2) {
            xq0.w(e2);
            return 0;
        }
    }

    @Override // defpackage.w8
    public final void b() {
        ArrayDeque arrayDeque = this.b;
        ArrayDeque arrayDeque2 = this.a;
        if (arrayDeque == null) {
            this.b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.b.isEmpty()) {
            ((w8) this.b.remove()).close();
        }
        this.d = true;
        w8 w8Var = (w8) arrayDeque2.peek();
        if (w8Var != null) {
            w8Var.b();
        }
    }

    @Override // defpackage.w8, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((w8) arrayDeque.remove()).close();
            }
        }
        if (this.b != null) {
            while (!this.b.isEmpty()) {
                ((w8) this.b.remove()).close();
            }
        }
    }

    @Override // defpackage.w8
    public final boolean g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((w8) it.next()).g()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.w8
    public final w8 o(int i2) {
        w8 w8Var;
        int i3;
        w8 w8Var2;
        if (i2 <= 0) {
            return akn.a;
        }
        a(i2);
        this.c -= i2;
        w8 w8Var3 = null;
        nr5 nr5Var = null;
        while (true) {
            ArrayDeque arrayDeque = this.a;
            w8 w8Var4 = (w8) arrayDeque.peek();
            int N = w8Var4.N();
            if (N > i2) {
                w8Var2 = w8Var4.o(i2);
                i3 = 0;
            } else {
                if (this.d) {
                    w8Var = w8Var4.o(N);
                    R();
                } else {
                    w8Var = (w8) arrayDeque.poll();
                }
                w8 w8Var5 = w8Var;
                i3 = i2 - N;
                w8Var2 = w8Var5;
            }
            if (w8Var3 == null) {
                w8Var3 = w8Var2;
            } else {
                if (nr5Var == null) {
                    nr5Var = new nr5(i3 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    nr5Var.Q(w8Var3);
                    w8Var3 = nr5Var;
                }
                nr5Var.Q(w8Var2);
            }
            if (i3 <= 0) {
                return w8Var3;
            }
            i2 = i3;
        }
    }

    @Override // defpackage.w8
    public final void reset() {
        if (!this.d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.a;
        w8 w8Var = (w8) arrayDeque.peek();
        if (w8Var != null) {
            int N = w8Var.N();
            w8Var.reset();
            this.c = (w8Var.N() - N) + this.c;
        }
        while (true) {
            w8 w8Var2 = (w8) this.b.pollLast();
            if (w8Var2 == null) {
                return;
            }
            w8Var2.reset();
            arrayDeque.addFirst(w8Var2);
            this.c = w8Var2.N() + this.c;
        }
    }

    @Override // defpackage.w8
    public final void z(OutputStream outputStream, int i2) {
        S(i, i2, outputStream, 0);
    }

    public nr5(int i2) {
        new ArrayDeque(2);
        this.a = new ArrayDeque(i2);
    }
}
