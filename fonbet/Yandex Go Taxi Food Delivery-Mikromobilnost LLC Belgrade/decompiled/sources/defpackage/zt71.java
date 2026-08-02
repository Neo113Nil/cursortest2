package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.w23;

/* loaded from: classes7.dex */
public abstract class zt71 implements pk81, c581 {
    public final kds0 a;
    public final rw81[] f;
    public int h;
    public yh81 i;
    public w23 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final yh81[] e = new du81[2];
    public int g = 2;

    public zt71() {
        rw81[] rw81VarArr = new rw81[2];
        for (int i = 0; i < this.g; i++) {
            this.e[i] = new du81();
        }
        this.f = rw81VarArr;
        this.h = 2;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new v471(this, 1);
        }
        kds0 kds0Var = new kds0(4, this);
        this.a = kds0Var;
        kds0Var.start();
        int i3 = this.g;
        yh81[] yh81VarArr = this.e;
        if (i3 != yh81VarArr.length) {
            ny61.k();
            throw null;
        }
        for (yh81 yh81Var : yh81VarArr) {
            yh81Var.g(1024);
        }
    }

    @Override // defpackage.c581
    public final rw81 a() {
        synchronized (this.b) {
            try {
                w23 w23Var = this.j;
                if (w23Var != null) {
                    throw w23Var;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (rw81) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c581
    public final void b(du81 du81Var) {
        synchronized (this.b) {
            try {
                w23 w23Var = this.j;
                if (w23Var != null) {
                    throw w23Var;
                }
                if (du81Var != this.i) {
                    throw new IllegalArgumentException();
                }
                this.c.addLast(du81Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract fh81 c(int i, byte[] bArr, boolean z);

    public final w23 d(yh81 yh81Var, rw81 rw81Var, boolean z) {
        du81 du81Var = (du81) yh81Var;
        try {
            ByteBuffer byteBuffer = du81Var.c;
            byteBuffer.getClass();
            fh81 c = c(byteBuffer.limit(), byteBuffer.array(), z);
            long j = du81Var.x;
            long j2 = du81Var.A;
            rw81Var.b = j;
            rw81Var.c = c;
            if (j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                j = j2;
            }
            rw81Var.w = j;
            rw81Var.a &= Integer.MAX_VALUE;
            return null;
        } catch (w23 e) {
            return e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        w23 w23Var;
        w23 w23Var2;
        synchronized (this.b) {
            while (!this.l && (this.c.isEmpty() || this.h <= 0)) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            yh81 yh81Var = (yh81) this.c.removeFirst();
            rw81[] rw81VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            rw81 rw81Var = rw81VarArr[i];
            boolean z = this.k;
            this.k = false;
            if (yh81Var.c(4)) {
                rw81Var.a = 4 | rw81Var.a;
            } else {
                if (yh81Var.c(Integer.MIN_VALUE)) {
                    rw81Var.a |= Integer.MIN_VALUE;
                }
                if (yh81Var.c(SelfTester_JCP.DECRYPT_CNT)) {
                    rw81Var.a = 134217728 | rw81Var.a;
                }
                try {
                    w23Var2 = d(yh81Var, rw81Var, z);
                } catch (OutOfMemoryError e) {
                    w23Var = new w23("Unexpected decode error", e);
                    w23Var2 = w23Var;
                    if (w23Var2 != null) {
                    }
                    synchronized (this.b) {
                    }
                } catch (RuntimeException e2) {
                    w23Var = new w23("Unexpected decode error", e2);
                    w23Var2 = w23Var;
                    if (w23Var2 != null) {
                    }
                    synchronized (this.b) {
                    }
                }
                if (w23Var2 != null) {
                    synchronized (this.b) {
                        this.j = w23Var2;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        rw81Var.e();
                    } else if (rw81Var.c(Integer.MIN_VALUE)) {
                        rw81Var.e();
                    } else {
                        this.d.addLast(rw81Var);
                    }
                    yh81Var.e();
                    yh81[] yh81VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    yh81VarArr[i2] = yh81Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.c581
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                yh81 yh81Var = this.i;
                if (yh81Var != null) {
                    yh81Var.e();
                    yh81[] yh81VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    yh81VarArr[i] = yh81Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    yh81 yh81Var2 = (yh81) this.c.removeFirst();
                    yh81Var2.e();
                    yh81[] yh81VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    yh81VarArr2[i2] = yh81Var2;
                }
                while (!this.d.isEmpty()) {
                    ((rw81) this.d.removeFirst()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c581
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.pk81
    public final void a(long j) {
    }

    @Override // defpackage.c581
    public final Object b() {
        yh81 yh81Var;
        synchronized (this.b) {
            try {
                w23 w23Var = this.j;
                if (w23Var == null) {
                    if (this.i == null) {
                        int i = this.g;
                        if (i == 0) {
                            yh81Var = null;
                        } else {
                            yh81[] yh81VarArr = this.e;
                            int i2 = i - 1;
                            this.g = i2;
                            yh81Var = yh81VarArr[i2];
                        }
                        this.i = yh81Var;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw w23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yh81Var;
    }
}
