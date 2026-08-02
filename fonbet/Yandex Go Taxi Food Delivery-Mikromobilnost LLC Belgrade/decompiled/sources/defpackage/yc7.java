package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class yc7 {
    public final String a;
    public final byte[] b;
    public long c;
    public long d;
    public long e;
    public volatile boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public yc7(n171 n171Var, no71 no71Var, byte[] bArr, ok71 ok71Var) {
        this.g = n171Var;
        this.h = n171Var.a;
        this.i = no71Var;
        this.b = bArr == null ? new byte[131072] : bArr;
        this.j = ok71Var;
        String str = no71Var.g;
        this.a = str == null ? no71Var.a.toString() : str;
        this.c = no71Var.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158 A[Catch: IOException -> 0x0177, TryCatch #1 {IOException -> 0x0177, blocks: (B:57:0x0151, B:60:0x0158, B:63:0x016d, B:64:0x0165, B:72:0x017f, B:74:0x0183, B:81:0x0190, B:84:0x01ad, B:86:0x01a5, B:88:0x01b6, B:89:0x01bb, B:94:0x01bf, B:97:0x01c9, B:100:0x01e1, B:101:0x01d8), top: B:56:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017f A[Catch: IOException -> 0x0177, TryCatch #1 {IOException -> 0x0177, blocks: (B:57:0x0151, B:60:0x0158, B:63:0x016d, B:64:0x0165, B:72:0x017f, B:74:0x0183, B:81:0x0190, B:84:0x01ad, B:86:0x01a5, B:88:0x01b6, B:89:0x01bb, B:94:0x01bf, B:97:0x01c9, B:100:0x01e1, B:101:0x01d8), top: B:56:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bf A[Catch: IOException -> 0x0177, TryCatch #1 {IOException -> 0x0177, blocks: (B:57:0x0151, B:60:0x0158, B:63:0x016d, B:64:0x0165, B:72:0x017f, B:74:0x0183, B:81:0x0190, B:84:0x01ad, B:86:0x01a5, B:88:0x01b6, B:89:0x01bb, B:94:0x01bf, B:97:0x01c9, B:100:0x01e1, B:101:0x01d8), top: B:56:0x0151 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        String str;
        long j;
        boolean z;
        long j2;
        int i;
        long j3;
        long j4;
        long j5;
        if (this.f) {
            throw new InterruptedIOException();
        }
        l291 l291Var = (l291) this.h;
        String str2 = this.a;
        no71 no71Var = (no71) this.i;
        this.e = ((z171) l291Var).a(no71Var.e, no71Var.f, str2);
        no71 no71Var2 = (no71) this.i;
        long j6 = no71Var2.f;
        long j7 = -1;
        if (j6 != -1) {
            this.d = no71Var2.e + j6;
        } else {
            long a = j571.a(((z171) ((l291) this.h)).j(this.a));
            if (a == -1) {
                a = -1;
            }
            this.d = a;
        }
        ok71 ok71Var = (ok71) this.j;
        long j8 = this.d;
        ok71Var.c(j8 == -1 ? -1L : j8 - ((no71) this.i).e, this.e, 0L);
        while (true) {
            long j9 = this.d;
            if (j9 != j7 && this.c >= j9) {
                return;
            }
            if (this.f) {
                throw new InterruptedIOException();
            }
            long j10 = this.d;
            long i2 = ((z171) ((l291) this.h)).i(this.c, j10 == j7 ? Long.MAX_VALUE : j10 - this.c, this.a);
            if (i2 > 0) {
                this.c += i2;
            } else {
                long j11 = -i2;
                long j12 = j11 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? j7 : j11;
                long j13 = this.c;
                int i3 = 0;
                boolean z2 = j13 + j12 == this.d || j12 == j7;
                if (j12 != j7) {
                    no71 no71Var3 = (no71) this.i;
                    Uri uri = no71Var3.a;
                    long j14 = no71Var3.b;
                    byte[] bArr = no71Var3.c;
                    Map map = no71Var3.d;
                    String str3 = no71Var3.g;
                    int i4 = no71Var3.h;
                    cha1.b(uri, "The uri must be set.");
                    str = "The uri must be set.";
                    j = j13;
                    try {
                        j2 = ((n171) this.g).Q(new no71(uri, j14, bArr, map, j13, j12, str3, i4));
                        z = true;
                    } catch (IOException unused) {
                        xca1.c((n171) this.g);
                    }
                    if (!z) {
                        if (this.f) {
                            throw new InterruptedIOException();
                        }
                        no71 no71Var4 = (no71) this.i;
                        Uri uri2 = no71Var4.a;
                        long j15 = no71Var4.b;
                        byte[] bArr2 = no71Var4.c;
                        Map map2 = no71Var4.d;
                        String str4 = no71Var4.g;
                        int i5 = no71Var4.h;
                        cha1.b(uri2, str);
                        try {
                            j2 = ((n171) this.g).Q(new no71(uri2, j15, bArr2, map2, j, -1L, str4, i5));
                        } catch (IOException e) {
                            xca1.c((n171) this.g);
                            throw e;
                        }
                    }
                    if (z2 && j2 != j7) {
                        j5 = j + j2;
                        try {
                            if (this.d == j5) {
                                this.d = j5;
                                ((ok71) this.j).c(j5 == j7 ? j7 : j5 - ((no71) this.i).e, this.e, 0L);
                            }
                        } catch (IOException e2) {
                            xca1.c((n171) this.g);
                            throw e2;
                        }
                    }
                    i = 0;
                    int i6 = 0;
                    while (i != -1) {
                        if (this.f) {
                            throw new InterruptedIOException();
                        }
                        n171 n171Var = (n171) this.g;
                        byte[] bArr3 = this.b;
                        i = n171Var.v(i3, bArr3.length, bArr3);
                        if (i != -1) {
                            long j16 = i;
                            long j17 = this.e + j16;
                            this.e = j17;
                            ok71 ok71Var2 = (ok71) this.j;
                            long j18 = this.d;
                            if (j18 == j7) {
                                j4 = j7;
                                j3 = j4;
                            } else {
                                j3 = j7;
                                j4 = j18 - ((no71) this.i).e;
                            }
                            ok71Var2.c(j4, j17, j16);
                            i6 += i;
                            j7 = j3;
                            i3 = 0;
                        }
                    }
                    long j19 = j7;
                    if (z2) {
                        long j20 = j + i6;
                        if (this.d != j20) {
                            this.d = j20;
                            ((ok71) this.j).c(j20 == j19 ? j19 : j20 - ((no71) this.i).e, this.e, 0L);
                        }
                    }
                    ((n171) this.g).close();
                    this.c = j + i6;
                    j7 = j19;
                } else {
                    str = "The uri must be set.";
                    j = j13;
                }
                z = false;
                j2 = j7;
                if (!z) {
                }
                if (z2) {
                    j5 = j + j2;
                    if (this.d == j5) {
                    }
                }
                i = 0;
                int i62 = 0;
                while (i != -1) {
                }
                long j192 = j7;
                if (z2) {
                }
                ((n171) this.g).close();
                this.c = j + i62;
                j7 = j192;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018a A[Catch: Exception -> 0x017c, TryCatch #1 {Exception -> 0x017c, blocks: (B:62:0x00fe, B:65:0x0105, B:70:0x011c, B:71:0x0114, B:79:0x0129, B:81:0x012d, B:88:0x0136, B:90:0x0142, B:94:0x0165, B:95:0x016f, B:97:0x0155, B:100:0x017e, B:101:0x0183, B:106:0x018a, B:109:0x0193, B:114:0x01ab, B:115:0x01a3), top: B:61:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105 A[Catch: Exception -> 0x017c, TryCatch #1 {Exception -> 0x017c, blocks: (B:62:0x00fe, B:65:0x0105, B:70:0x011c, B:71:0x0114, B:79:0x0129, B:81:0x012d, B:88:0x0136, B:90:0x0142, B:94:0x0165, B:95:0x016f, B:97:0x0155, B:100:0x017e, B:101:0x0183, B:106:0x018a, B:109:0x0193, B:114:0x01ab, B:115:0x01a3), top: B:61:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129 A[Catch: Exception -> 0x017c, TryCatch #1 {Exception -> 0x017c, blocks: (B:62:0x00fe, B:65:0x0105, B:70:0x011c, B:71:0x0114, B:79:0x0129, B:81:0x012d, B:88:0x0136, B:90:0x0142, B:94:0x0165, B:95:0x016f, B:97:0x0155, B:100:0x017e, B:101:0x0183, B:106:0x018a, B:109:0x0193, B:114:0x01ab, B:115:0x01a3), top: B:61:0x00fe }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        long j;
        int i;
        npg npgVar;
        long j2;
        npg npgVar2;
        int i2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (this.f) {
            throw new InterruptedIOException();
        }
        ra7 ra7Var = (ra7) this.h;
        String str = this.a;
        npg npgVar3 = (npg) this.i;
        this.e = ra7Var.getCachedBytes(str, npgVar3.f, npgVar3.g);
        long j8 = npgVar3.g;
        long j9 = -1;
        if (j8 != -1) {
            this.d = npgVar3.f + j8;
        } else {
            long a = bhe.a(((ra7) this.h).getContentMetadata(this.a));
            if (a == -1) {
                a = -1;
            }
            this.d = a;
        }
        xc7 xc7Var = (xc7) this.j;
        if (xc7Var != null) {
            long j10 = this.d;
            xc7Var.a(j10 == -1 ? -1L : j10 - ((npg) this.i).f, this.e, 0L);
        }
        while (true) {
            long j11 = this.d;
            if (j11 != j9 && this.c >= j11) {
                return;
            }
            if (this.f) {
                throw new InterruptedIOException();
            }
            long j12 = this.d;
            long cachedLength = ((ra7) this.h).getCachedLength(this.a, this.c, j12 == j9 ? Long.MAX_VALUE : j12 - this.c);
            if (cachedLength > 0) {
                this.c += cachedLength;
                npgVar = npgVar3;
                j2 = j9;
            } else {
                long j13 = -cachedLength;
                if (j13 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                    j13 = j9;
                }
                long j14 = this.c;
                eb7 eb7Var = (eb7) this.g;
                boolean z = true;
                int i3 = 0;
                boolean z2 = j14 + j13 == this.d || j13 == j9;
                if (j13 != j9) {
                    mpg a2 = npgVar3.a();
                    a2.f = j14;
                    a2.g = j13;
                    try {
                        j = eb7Var.open(a2.a());
                    } catch (Exception unused) {
                        yri0.b(eb7Var);
                    }
                    if (!z) {
                        if (this.f) {
                            throw new InterruptedIOException();
                        }
                        mpg a3 = npgVar3.a();
                        a3.f = j14;
                        a3.g = j9;
                        try {
                            j = eb7Var.open(a3.a());
                        } catch (Exception e) {
                            yri0.b(eb7Var);
                            throw e;
                        }
                    }
                    if (z2 && j != j9) {
                        j7 = j + j14;
                        try {
                            if (this.d == j7) {
                                this.d = j7;
                                xc7 xc7Var2 = (xc7) this.j;
                                if (xc7Var2 != null) {
                                    xc7Var2.a(j7 == j9 ? j9 : j7 - ((npg) this.i).f, this.e, 0L);
                                }
                            }
                        } catch (Exception e2) {
                            yri0.b(eb7Var);
                            throw e2;
                        }
                    }
                    i = 0;
                    int i4 = 0;
                    while (i != -1) {
                        if (this.f) {
                            throw new InterruptedIOException();
                        }
                        byte[] bArr = this.b;
                        i = eb7Var.read(bArr, i3, bArr.length);
                        if (i != -1) {
                            long j15 = i;
                            long j16 = this.e + j15;
                            this.e = j16;
                            xc7 xc7Var3 = (xc7) this.j;
                            if (xc7Var3 != null) {
                                j3 = j9;
                                long j17 = this.d;
                                if (j17 == j3) {
                                    npgVar2 = npgVar3;
                                    i2 = i;
                                    j4 = j15;
                                    j5 = j16;
                                    j6 = j3;
                                } else {
                                    npgVar2 = npgVar3;
                                    i2 = i;
                                    j4 = j15;
                                    j5 = j16;
                                    j6 = j17 - ((npg) this.i).f;
                                }
                                xc7Var3.a(j6, j5, j4);
                            } else {
                                npgVar2 = npgVar3;
                                i2 = i;
                                j3 = j9;
                            }
                            i4 += i2;
                            j9 = j3;
                            npgVar3 = npgVar2;
                            i = i2;
                            i3 = 0;
                        }
                    }
                    npgVar = npgVar3;
                    j2 = j9;
                    if (z2) {
                        long j18 = i4 + j14;
                        if (this.d != j18) {
                            this.d = j18;
                            xc7 xc7Var4 = (xc7) this.j;
                            if (xc7Var4 != null) {
                                xc7Var4.a(j18 == j2 ? j2 : j18 - ((npg) this.i).f, this.e, 0L);
                            }
                        }
                    }
                    eb7Var.close();
                    this.c = j14 + i4;
                }
                j = j9;
                z = false;
                if (!z) {
                }
                if (z2) {
                    j7 = j + j14;
                    if (this.d == j7) {
                    }
                }
                i = 0;
                int i42 = 0;
                while (i != -1) {
                }
                npgVar = npgVar3;
                j2 = j9;
                if (z2) {
                }
                eb7Var.close();
                this.c = j14 + i42;
            }
            j9 = j2;
            npgVar3 = npgVar;
        }
    }

    public yc7(eb7 eb7Var, npg npgVar, byte[] bArr, xc7 xc7Var) {
        this.g = eb7Var;
        this.h = eb7Var.a;
        this.i = npgVar;
        this.b = bArr == null ? new byte[131072] : bArr;
        this.j = xc7Var;
        this.a = eb7Var.x.buildCacheKey(npgVar);
        this.c = npgVar.f;
    }
}
