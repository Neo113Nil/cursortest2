package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes4.dex */
public final class cx6 extends ljo {
    public final /* synthetic */ int h;
    public final /* synthetic */ ika i;

    public /* synthetic */ cx6(ika ikaVar, int i) {
        this.h = i;
        this.i = ikaVar;
    }

    @Override // defpackage.ljo
    public final void d() {
        switch (this.h) {
            case 0:
                ((dx6) this.i).c.h = true;
                break;
            default:
                ((ovm) this.i).d.h = true;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a A[Catch: IOException -> 0x0153, TryCatch #1 {IOException -> 0x0153, blocks: (B:62:0x0103, B:65:0x010a, B:68:0x011b, B:69:0x0116, B:77:0x0125, B:79:0x0129, B:82:0x0132, B:85:0x014b, B:88:0x0143, B:91:0x0155, B:92:0x015a, B:97:0x015f, B:100:0x0168, B:103:0x017a, B:104:0x0175), top: B:61:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125 A[Catch: IOException -> 0x0153, TryCatch #1 {IOException -> 0x0153, blocks: (B:62:0x0103, B:65:0x010a, B:68:0x011b, B:69:0x0116, B:77:0x0125, B:79:0x0129, B:82:0x0132, B:85:0x014b, B:88:0x0143, B:91:0x0155, B:92:0x015a, B:97:0x015f, B:100:0x0168, B:103:0x017a, B:104:0x0175), top: B:61:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015f A[Catch: IOException -> 0x0153, TryCatch #1 {IOException -> 0x0153, blocks: (B:62:0x0103, B:65:0x010a, B:68:0x011b, B:69:0x0116, B:77:0x0125, B:79:0x0129, B:82:0x0132, B:85:0x014b, B:88:0x0143, B:91:0x0155, B:92:0x015a, B:97:0x015f, B:100:0x0168, B:103:0x017a, B:104:0x0175), top: B:61:0x0103 }] */
    @Override // defpackage.ljo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e() {
        long j;
        int i;
        long j2;
        long j3;
        switch (this.h) {
            case 0:
                pq3 pq3Var = ((dx6) this.i).c;
                if (pq3Var.h) {
                    throw new InterruptedIOException();
                }
                n nVar = (n) pq3Var.j;
                so3 so3Var = pq3Var.a;
                String str = pq3Var.c;
                nb7 nb7Var = pq3Var.b;
                pq3Var.g = so3Var.h(nb7Var.f, nb7Var.g, str);
                long j4 = nb7Var.g;
                long j5 = -1;
                if (j4 != -1) {
                    pq3Var.f = nb7Var.f + j4;
                } else {
                    long a = qc6.a(pq3Var.a.a(pq3Var.c));
                    if (a == -1) {
                        a = -1;
                    }
                    pq3Var.f = a;
                }
                long j6 = pq3Var.f;
                nVar.n(j6 == -1 ? -1L : j6 - pq3Var.b.f, pq3Var.g);
                while (true) {
                    long j7 = pq3Var.f;
                    if (j7 != j5 && pq3Var.e >= j7) {
                        return null;
                    }
                    if (pq3Var.h) {
                        throw new InterruptedIOException();
                    }
                    long j8 = pq3Var.f;
                    long e = pq3Var.a.e(pq3Var.e, j8 == j5 ? Long.MAX_VALUE : j8 - pq3Var.e, pq3Var.c);
                    if (e > 0) {
                        pq3Var.e += e;
                        j2 = j5;
                    } else {
                        long j9 = -e;
                        if (j9 == Long.MAX_VALUE) {
                            j9 = j5;
                        }
                        long j10 = pq3Var.e;
                        uw6 uw6Var = (uw6) pq3Var.i;
                        boolean z = true;
                        int i2 = 0;
                        boolean z2 = j10 + j9 == pq3Var.f || j9 == j5;
                        if (j9 != j5) {
                            mb7 a2 = nb7Var.a();
                            a2.f = j10;
                            a2.g = j9;
                            try {
                                j = uw6Var.a(a2.a());
                            } catch (IOException unused) {
                                hld.x(uw6Var);
                            }
                            if (!z) {
                                if (pq3Var.h) {
                                    throw new InterruptedIOException();
                                }
                                mb7 a3 = nb7Var.a();
                                a3.f = j10;
                                a3.g = j5;
                                try {
                                    j = uw6Var.a(a3.a());
                                } catch (IOException e2) {
                                    hld.x(uw6Var);
                                    throw e2;
                                }
                            }
                            if (z2 && j != j5) {
                                j3 = j + j10;
                                try {
                                    if (pq3Var.f == j3) {
                                        pq3Var.f = j3;
                                        ((n) pq3Var.j).n(j3 == j5 ? j5 : j3 - pq3Var.b.f, pq3Var.g);
                                    }
                                } catch (IOException e3) {
                                    hld.x(uw6Var);
                                    throw e3;
                                }
                            }
                            i = 0;
                            int i3 = 0;
                            while (i != -1) {
                                if (pq3Var.h) {
                                    throw new InterruptedIOException();
                                }
                                byte[] bArr = pq3Var.d;
                                i = uw6Var.read(bArr, i2, bArr.length);
                                if (i != -1) {
                                    long j11 = j5;
                                    long j12 = pq3Var.g + i;
                                    pq3Var.g = j12;
                                    long j13 = pq3Var.f;
                                    nVar.n(j13 == j11 ? j11 : j13 - pq3Var.b.f, j12);
                                    i3 += i;
                                    j5 = j11;
                                    i2 = 0;
                                }
                            }
                            j2 = j5;
                            if (z2) {
                                long j14 = i3 + j10;
                                if (pq3Var.f != j14) {
                                    pq3Var.f = j14;
                                    ((n) pq3Var.j).n(j14 == j2 ? j2 : j14 - pq3Var.b.f, pq3Var.g);
                                }
                            }
                            uw6Var.close();
                            pq3Var.e = j10 + i3;
                        }
                        j = j5;
                        z = false;
                        if (!z) {
                        }
                        if (z2) {
                            j3 = j + j10;
                            if (pq3Var.f == j3) {
                            }
                        }
                        i = 0;
                        int i32 = 0;
                        while (i != -1) {
                        }
                        j2 = j5;
                        if (z2) {
                        }
                        uw6Var.close();
                        pq3Var.e = j10 + i32;
                    }
                    j5 = j2;
                }
                break;
            default:
                ((ovm) this.i).d.a();
                return null;
        }
    }
}
