package defpackage;

import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class vcv implements Closeable {
    public final ij3 a;
    public final gln b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final hi3 k;
    public final hi3 l;
    public gzh m;
    public final byte[] n;

    public vcv(ij3 ij3Var, gln glnVar, boolean z, boolean z2) {
        ij3Var.getClass();
        glnVar.getClass();
        this.a = ij3Var;
        this.b = glnVar;
        this.c = z;
        this.d = z2;
        this.k = new hi3();
        this.l = new hi3();
        this.n = null;
    }

    public final void a() {
        String str;
        short s;
        vcv vcvVar;
        wcv wcvVar;
        long j = this.g;
        if (j > 0) {
            this.a.O(this.k, j);
        }
        switch (this.f) {
            case 8:
                hi3 hi3Var = this.k;
                long j2 = hi3Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                zp4 zp4Var = null;
                if (j2 != 0) {
                    s = hi3Var.readShort();
                    str = this.k.G0();
                    String i = (s < 1000 || s >= 5000) ? k5r.i(s, "Code must be in range [1000,5000): ") : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : dfi.c(s, "Code ", " is reserved and may not be used.");
                    if (i != null) {
                        throw new ProtocolException(i);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                gln glnVar = this.b;
                glnVar.getClass();
                if (s == -1) {
                    xq0.x("Failed requirement.");
                    return;
                }
                synchronized (glnVar) {
                    if (glnVar.r != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    glnVar.r = s;
                    glnVar.s = str;
                    if (glnVar.q && glnVar.o.isEmpty()) {
                        zp4 zp4Var2 = glnVar.m;
                        glnVar.m = null;
                        vcvVar = glnVar.i;
                        glnVar.i = null;
                        wcvVar = glnVar.j;
                        glnVar.j = null;
                        glnVar.k.f();
                        zp4Var = zp4Var2;
                    } else {
                        vcvVar = null;
                        wcvVar = null;
                    }
                }
                try {
                    glnVar.a.Z(glnVar, s, str);
                    if (zp4Var != null) {
                        glnVar.a.Y(glnVar, s, str);
                    }
                    this.e = true;
                    return;
                } finally {
                    if (zp4Var != null) {
                        cvt.d(zp4Var);
                    }
                    if (vcvVar != null) {
                        cvt.d(vcvVar);
                    }
                    if (wcvVar != null) {
                        cvt.d(wcvVar);
                    }
                }
            case 9:
                gln glnVar2 = this.b;
                hi3 hi3Var2 = this.k;
                pn3 g0 = hi3Var2.g0(hi3Var2.b);
                synchronized (glnVar2) {
                    try {
                        g0.getClass();
                        if (!glnVar2.t && (!glnVar2.q || !glnVar2.o.isEmpty())) {
                            glnVar2.n.add(g0);
                            glnVar2.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                gln glnVar3 = this.b;
                hi3 hi3Var3 = this.k;
                pn3 g02 = hi3Var3.g0(hi3Var3.b);
                synchronized (glnVar3) {
                    g02.getClass();
                    glnVar3.v = false;
                }
                return;
            default:
                int i2 = this.f;
                byte[] bArr = cvt.a;
                String hexString = Integer.toHexString(i2);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void b() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.e) {
            kac.f("closed");
            return;
        }
        ij3 ij3Var = this.a;
        long h = ij3Var.i().h();
        ij3Var.i().b();
        try {
            byte readByte = ij3Var.readByte();
            byte[] bArr = cvt.a;
            ij3Var.i().g(h, timeUnit);
            int i = readByte & 15;
            this.f = i;
            boolean z2 = (readByte & 128) != 0;
            this.h = z2;
            boolean z3 = (readByte & 8) != 0;
            this.i = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.j = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = ij3Var.readByte();
            boolean z5 = (readByte2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.g = j;
            if (j == 126) {
                this.g = ij3Var.readShort() & 65535;
            } else if (j == 127) {
                long readLong = ij3Var.readLong();
                this.g = readLong;
                if (readLong < 0) {
                    String hexString = Long.toHexString(this.g);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.i && this.g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.n;
                bArr2.getClass();
                ij3Var.readFully(bArr2);
            }
        } catch (Throwable th) {
            ij3Var.i().g(h, timeUnit);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gzh gzhVar = this.m;
        if (gzhVar != null) {
            gzhVar.close();
        }
    }
}
