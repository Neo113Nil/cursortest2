package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class pq3 {
    public final so3 a;
    public final nb7 b;
    public final String c;
    public final byte[] d;
    public long e;
    public long f;
    public long g;
    public volatile boolean h;
    public final db7 i;
    public final Object j;

    public pq3(jp3 jp3Var, nb7 nb7Var, byte[] bArr, oq3 oq3Var) {
        this.i = jp3Var;
        this.a = jp3Var.a;
        this.b = nb7Var;
        this.d = bArr == null ? new byte[SQLiteDatabase.OPEN_SHAREDCACHE] : bArr;
        this.j = oq3Var;
        this.c = jp3Var.e.f(nb7Var);
        this.e = nb7Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0165 A[Catch: Exception -> 0x0159, TryCatch #1 {Exception -> 0x0159, blocks: (B:62:0x00f0, B:65:0x00f7, B:70:0x010c, B:71:0x0106, B:79:0x0119, B:81:0x011d, B:84:0x0126, B:86:0x0132, B:90:0x014e, B:91:0x0154, B:94:0x0141, B:98:0x015b, B:99:0x0160, B:104:0x0165, B:107:0x016e, B:112:0x0184, B:113:0x017e), top: B:61:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[Catch: Exception -> 0x0159, TryCatch #1 {Exception -> 0x0159, blocks: (B:62:0x00f0, B:65:0x00f7, B:70:0x010c, B:71:0x0106, B:79:0x0119, B:81:0x011d, B:84:0x0126, B:86:0x0132, B:90:0x014e, B:91:0x0154, B:94:0x0141, B:98:0x015b, B:99:0x0160, B:104:0x0165, B:107:0x016e, B:112:0x0184, B:113:0x017e), top: B:61:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119 A[Catch: Exception -> 0x0159, TryCatch #1 {Exception -> 0x0159, blocks: (B:62:0x00f0, B:65:0x00f7, B:70:0x010c, B:71:0x0106, B:79:0x0119, B:81:0x011d, B:84:0x0126, B:86:0x0132, B:90:0x014e, B:91:0x0154, B:94:0x0141, B:98:0x015b, B:99:0x0160, B:104:0x0165, B:107:0x016e, B:112:0x0184, B:113:0x017e), top: B:61:0x00f0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (this.h) {
            throw new InterruptedIOException();
        }
        so3 so3Var = this.a;
        String str = this.c;
        nb7 nb7Var = this.b;
        this.g = so3Var.h(nb7Var.f, nb7Var.g, str);
        long j8 = nb7Var.g;
        long j9 = -1;
        if (j8 != -1) {
            this.f = nb7Var.f + j8;
        } else {
            long a = qc6.a(this.a.a(this.c));
            if (a == -1) {
                a = -1;
            }
            this.f = a;
        }
        oq3 oq3Var = (oq3) this.j;
        if (oq3Var != null) {
            long j10 = this.f;
            oq3Var.d(j10 == -1 ? -1L : j10 - this.b.f, this.g, 0L);
        }
        while (true) {
            long j11 = this.f;
            if (j11 != j9 && this.e >= j11) {
                return;
            }
            if (this.h) {
                throw new InterruptedIOException();
            }
            long j12 = this.f;
            long e = this.a.e(this.e, j12 == j9 ? Long.MAX_VALUE : j12 - this.e, this.c);
            if (e > 0) {
                this.e += e;
                j2 = j9;
            } else {
                long j13 = -e;
                if (j13 == Long.MAX_VALUE) {
                    j13 = j9;
                }
                long j14 = this.e;
                jp3 jp3Var = (jp3) this.i;
                boolean z = true;
                int i2 = 0;
                boolean z2 = j14 + j13 == this.f || j13 == j9;
                if (j13 != j9) {
                    mb7 a2 = nb7Var.a();
                    a2.f = j14;
                    a2.g = j13;
                    try {
                        j = jp3Var.a(a2.a());
                    } catch (Exception unused) {
                        hld.x(jp3Var);
                    }
                    if (!z) {
                        if (this.h) {
                            throw new InterruptedIOException();
                        }
                        mb7 a3 = nb7Var.a();
                        a3.f = j14;
                        a3.g = j9;
                        try {
                            j = jp3Var.a(a3.a());
                        } catch (Exception e2) {
                            hld.x(jp3Var);
                            throw e2;
                        }
                    }
                    if (z2 && j != j9) {
                        j7 = j + j14;
                        try {
                            if (this.f == j7) {
                                this.f = j7;
                                oq3 oq3Var2 = (oq3) this.j;
                                if (oq3Var2 != null) {
                                    oq3Var2.d(j7 == j9 ? j9 : j7 - this.b.f, this.g, 0L);
                                }
                            }
                        } catch (Exception e3) {
                            hld.x(jp3Var);
                            throw e3;
                        }
                    }
                    i = 0;
                    int i3 = 0;
                    while (i != -1) {
                        if (this.h) {
                            throw new InterruptedIOException();
                        }
                        byte[] bArr = this.d;
                        i = jp3Var.read(bArr, i2, bArr.length);
                        if (i != -1) {
                            long j15 = i;
                            long j16 = this.g + j15;
                            this.g = j16;
                            oq3 oq3Var3 = (oq3) this.j;
                            if (oq3Var3 != null) {
                                j3 = j9;
                                long j17 = this.f;
                                if (j17 == j3) {
                                    j4 = j15;
                                    j5 = j16;
                                    j6 = j3;
                                } else {
                                    j4 = j15;
                                    j5 = j16;
                                    j6 = j17 - this.b.f;
                                }
                                oq3Var3.d(j6, j5, j4);
                            } else {
                                j3 = j9;
                            }
                            i3 += i;
                            j9 = j3;
                            i2 = 0;
                        }
                    }
                    j2 = j9;
                    if (z2) {
                        long j18 = i3 + j14;
                        if (this.f != j18) {
                            this.f = j18;
                            oq3 oq3Var4 = (oq3) this.j;
                            if (oq3Var4 != null) {
                                oq3Var4.d(j18 == j2 ? j2 : j18 - this.b.f, this.g, 0L);
                            }
                        }
                    }
                    jp3Var.close();
                    this.e = j14 + i3;
                }
                j = j9;
                z = false;
                if (!z) {
                }
                if (z2) {
                    j7 = j + j14;
                    if (this.f == j7) {
                    }
                }
                i = 0;
                int i32 = 0;
                while (i != -1) {
                }
                j2 = j9;
                if (z2) {
                }
                jp3Var.close();
                this.e = j14 + i32;
            }
            j9 = j2;
        }
    }

    public pq3(uw6 uw6Var, nb7 nb7Var, n nVar) {
        this.i = uw6Var;
        this.a = uw6Var.a;
        this.b = nb7Var;
        this.d = new byte[SQLiteDatabase.OPEN_SHAREDCACHE];
        this.j = nVar;
        this.c = uw6Var.f.f(nb7Var);
        this.e = nb7Var.f;
    }
}
