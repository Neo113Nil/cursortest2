package y8;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class r implements g {

    /* renamed from: n, reason: collision with root package name */
    public final x f41955n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41956u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41957v;

    public r(x source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f41955n = source;
        this.f41956u = new e();
    }

    public final h A(long j6) {
        E(j6);
        return this.f41956u.B(j6);
    }

    public final int B() {
        E(4L);
        return this.f41956u.D();
    }

    public final short C() {
        E(2L);
        return this.f41956u.E();
    }

    public final String D(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j6).toString());
        }
        long j9 = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : j6 + 1;
        long i = i((byte) 10, 0L, j9);
        e eVar = this.f41956u;
        if (i != -1) {
            return z8.a.a(i, eVar);
        }
        if (j9 < Long.MAX_VALUE && S(j9) && eVar.k(j9 - 1) == 13 && S(j9 + 1) && eVar.k(j9) == 10) {
            return z8.a.a(j9, eVar);
        }
        e eVar2 = new e();
        eVar.a(eVar2, 0L, Math.min(32, eVar.f41924u));
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f41924u, j6) + " content=" + eVar2.B(eVar2.f41924u).c() + (char) 8230);
    }

    public final void E(long j6) {
        if (!S(j6)) {
            throw new EOFException();
        }
    }

    public final void F(long j6) {
        if (this.f41957v) {
            throw new IllegalStateException("closed");
        }
        while (j6 > 0) {
            e eVar = this.f41956u;
            if (eVar.f41924u == 0 && this.f41955n.d(8192L, eVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j6, eVar.f41924u);
            eVar.H(min);
            j6 -= min;
        }
    }

    @Override // y8.x
    public final z L() {
        return this.f41955n.L();
    }

    @Override // y8.g
    public final byte[] O() {
        x xVar = this.f41955n;
        e eVar = this.f41956u;
        eVar.W(xVar);
        return eVar.A(eVar.f41924u);
    }

    @Override // y8.g
    public final e P() {
        return this.f41956u;
    }

    @Override // y8.g
    public final boolean S(long j6) {
        e eVar;
        if (j6 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (this.f41957v) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f41956u;
            if (eVar.f41924u >= j6) {
                return true;
            }
        } while (this.f41955n.d(8192L, eVar) != -1);
        return false;
    }

    public final boolean b() {
        if (this.f41957v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41956u;
        return eVar.j() && this.f41955n.d(8192L, eVar) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f41957v) {
            return;
        }
        this.f41957v = true;
        this.f41955n.close();
        e eVar = this.f41956u;
        eVar.H(eVar.f41924u);
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (this.f41957v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41956u;
        if (eVar.f41924u == 0) {
            if (j6 == 0) {
                return 0L;
            }
            if (this.f41955n.d(8192L, eVar) == -1) {
                return -1L;
            }
        }
        return eVar.d(Math.min(j6, eVar.f41924u), sink);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(byte b9, long j6, long j9) {
        s sVar;
        long j10;
        long j11;
        if (this.f41957v) {
            throw new IllegalStateException("closed");
        }
        long j12 = 0;
        if (0 > j9) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j9).toString());
        }
        while (j12 < j9) {
            e eVar = this.f41956u;
            eVar.getClass();
            long j13 = 0;
            if (0 > j12 || j12 > j9) {
                StringBuilder sb = new StringBuilder("size=");
                sb.append(eVar.f41924u);
                com.IceFishing.LiveIceFishing.k.z(sb, " fromIndex=", j12, " toIndex=");
                sb.append(j9);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            long j14 = eVar.f41924u;
            long j15 = j9 > j14 ? j14 : j9;
            if (j12 != j15 && (sVar = eVar.f41923n) != null) {
                if (j14 - j12 < j12) {
                    while (j14 > j12) {
                        sVar = sVar.f41964g;
                        kotlin.jvm.internal.h.b(sVar);
                        j14 -= sVar.f41960c - sVar.f41959b;
                    }
                    long j16 = j12;
                    while (j14 < j15) {
                        j10 = -1;
                        int min = (int) Math.min(sVar.f41960c, (sVar.f41959b + j15) - j14);
                        for (int i = (int) ((sVar.f41959b + j16) - j14); i < min; i++) {
                            if (sVar.f41958a[i] == b9) {
                                j11 = (i - sVar.f41959b) + j14;
                                break;
                            }
                        }
                        j16 = j14 + (sVar.f41960c - sVar.f41959b);
                        sVar = sVar.f41963f;
                        kotlin.jvm.internal.h.b(sVar);
                        j14 = j16;
                    }
                } else {
                    j10 = -1;
                    while (true) {
                        long j17 = (sVar.f41960c - sVar.f41959b) + j13;
                        if (j17 > j12) {
                            break;
                        }
                        sVar = sVar.f41963f;
                        kotlin.jvm.internal.h.b(sVar);
                        j13 = j17;
                    }
                    long j18 = j12;
                    while (j13 < j15) {
                        long j19 = j18;
                        int min2 = (int) Math.min(sVar.f41960c, (sVar.f41959b + j15) - j13);
                        for (int i4 = (int) ((sVar.f41959b + j19) - j13); i4 < min2; i4++) {
                            if (sVar.f41958a[i4] == b9) {
                                j11 = (i4 - sVar.f41959b) + j13;
                                break;
                            }
                        }
                        j18 = (sVar.f41960c - sVar.f41959b) + j13;
                        sVar = sVar.f41963f;
                        kotlin.jvm.internal.h.b(sVar);
                        j13 = j18;
                    }
                    j11 = -1;
                }
                if (j11 == j10) {
                    return j11;
                }
                long j20 = eVar.f41924u;
                if (j20 >= j9 || this.f41955n.d(8192L, eVar) == j10) {
                    return j10;
                }
                j12 = Math.max(j12, j20);
            }
            j10 = -1;
            j11 = -1;
            if (j11 == j10) {
            }
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f41957v;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(h targetBytes) {
        long j6;
        long j9;
        long j10;
        kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
        if (this.f41957v) {
            throw new IllegalStateException("closed");
        }
        long j11 = 0;
        while (true) {
            e eVar = this.f41956u;
            eVar.getClass();
            kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
            long j12 = 0;
            if (j11 < 0) {
                throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
            }
            s sVar = eVar.f41923n;
            if (sVar != null) {
                long j13 = eVar.f41924u;
                long j14 = j13 - j11;
                byte[] bArr = targetBytes.f41926n;
                if (j14 < j11) {
                    while (j13 > j11) {
                        sVar = sVar.f41964g;
                        kotlin.jvm.internal.h.b(sVar);
                        j13 -= sVar.f41960c - sVar.f41959b;
                    }
                    if (bArr.length == 2) {
                        byte b9 = bArr[0];
                        byte b10 = bArr[1];
                        long j15 = j11;
                        while (j13 < eVar.f41924u) {
                            int i = sVar.f41960c;
                            for (int i4 = (int) ((sVar.f41959b + j15) - j13); i4 < i; i4++) {
                                byte b11 = sVar.f41958a[i4];
                                if (b11 == b9 || b11 == b10) {
                                    j10 = i4 - sVar.f41959b;
                                    j6 = j10 + j13;
                                    break;
                                }
                            }
                            j15 = (sVar.f41960c - sVar.f41959b) + j13;
                            sVar = sVar.f41963f;
                            kotlin.jvm.internal.h.b(sVar);
                            j13 = j15;
                        }
                    } else {
                        long j16 = j11;
                        while (j13 < eVar.f41924u) {
                            int i6 = sVar.f41960c;
                            for (int i9 = (int) ((sVar.f41959b + j16) - j13); i9 < i6; i9++) {
                                byte b12 = sVar.f41958a[i9];
                                for (byte b13 : bArr) {
                                    if (b12 == b13) {
                                        j10 = i9 - sVar.f41959b;
                                        j6 = j10 + j13;
                                        break;
                                    }
                                }
                            }
                            j16 = (sVar.f41960c - sVar.f41959b) + j13;
                            sVar = sVar.f41963f;
                            kotlin.jvm.internal.h.b(sVar);
                            j13 = j16;
                        }
                    }
                } else {
                    while (true) {
                        long j17 = (sVar.f41960c - sVar.f41959b) + j12;
                        if (j17 > j11) {
                            break;
                        }
                        sVar = sVar.f41963f;
                        kotlin.jvm.internal.h.b(sVar);
                        j12 = j17;
                    }
                    if (bArr.length == 2) {
                        byte b14 = bArr[0];
                        byte b15 = bArr[1];
                        long j18 = j11;
                        while (j12 < eVar.f41924u) {
                            int i10 = sVar.f41960c;
                            for (int i11 = (int) ((sVar.f41959b + j18) - j12); i11 < i10; i11++) {
                                byte b16 = sVar.f41958a[i11];
                                if (b16 == b14 || b16 == b15) {
                                    j9 = i11 - sVar.f41959b;
                                    j6 = j12 + j9;
                                    break;
                                }
                            }
                            j18 = (sVar.f41960c - sVar.f41959b) + j12;
                            sVar = sVar.f41963f;
                            kotlin.jvm.internal.h.b(sVar);
                            j12 = j18;
                        }
                    } else {
                        long j19 = j11;
                        while (j12 < eVar.f41924u) {
                            int i12 = sVar.f41960c;
                            for (int i13 = (int) ((sVar.f41959b + j19) - j12); i13 < i12; i13++) {
                                byte b17 = sVar.f41958a[i13];
                                for (byte b18 : bArr) {
                                    if (b17 == b18) {
                                        j9 = i13 - sVar.f41959b;
                                        j6 = j12 + j9;
                                        break;
                                    }
                                }
                            }
                            j19 = (sVar.f41960c - sVar.f41959b) + j12;
                            sVar = sVar.f41963f;
                            kotlin.jvm.internal.h.b(sVar);
                            j12 = j19;
                        }
                    }
                }
                if (j6 == -1) {
                    return j6;
                }
                long j20 = eVar.f41924u;
                if (this.f41955n.d(8192L, eVar) == -1) {
                    return -1L;
                }
                j11 = Math.max(j11, j20);
            }
            j6 = -1;
            if (j6 == -1) {
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        e eVar = this.f41956u;
        if (eVar.f41924u == 0 && this.f41955n.d(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.read(sink);
    }

    public final String toString() {
        return "buffer(" + this.f41955n + ')';
    }

    public final byte z() {
        E(1L);
        return this.f41956u.z();
    }
}
