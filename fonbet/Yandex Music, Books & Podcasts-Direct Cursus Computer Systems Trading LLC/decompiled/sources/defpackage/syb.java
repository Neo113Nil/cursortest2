package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class syb {
    public final String a;
    public final String b;
    public final String c;
    public final File d;
    public final ctd e;
    public final long f;
    public final tjl g;
    public final ujl h;
    public final y3e i;
    public final i5f j;
    public final z0i k;
    public final b5m l;
    public final tf6 m;
    public final a n;
    public final t1f o;
    public final qqi p;
    public final e0h q;
    public long r;

    public syb(String str, String str2, String str3, File file, ctd ctdVar, long j, tjl tjlVar, ujl ujlVar, y3e y3eVar, mvn mvnVar, i9w i9wVar, i5f i5fVar, z0i z0iVar, b5m b5mVar, tf6 tf6Var, a aVar) {
        str.getClass();
        ctdVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = file;
        this.e = ctdVar;
        this.f = j;
        this.g = tjlVar;
        this.h = ujlVar;
        this.i = y3eVar;
        this.j = i5fVar;
        this.k = z0iVar;
        this.l = b5mVar;
        this.m = tf6Var;
        this.n = aVar;
        this.o = new t1f(1);
        this.p = rqi.a();
        this.q = new e0h(5);
        nsa.b.getClass();
        this.r = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:11:0x005a, B:13:0x006e, B:15:0x0076, B:17:0x007b, B:19:0x008f, B:23:0x009c, B:27:0x00b0, B:28:0x00a7, B:30:0x00ad, B:34:0x00b6, B:35:0x00b8), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(syb sybVar, cg6 cg6Var) {
        nyb nybVar;
        int i;
        qqi qqiVar;
        long N;
        nsa nsaVar;
        int i2;
        long j = sybVar.f;
        try {
            if (cg6Var instanceof nyb) {
                nybVar = (nyb) cg6Var;
                int i3 = nybVar.m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nybVar.m = i3 - Integer.MIN_VALUE;
                    Object obj = nybVar.k;
                    nm6 nm6Var = nm6.a;
                    i = nybVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        long j2 = sybVar.r;
                        msa msaVar = nsa.b;
                        if (nsa.c(j2, yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS)) >= 0) {
                            return Unit.a;
                        }
                        qqi qqiVar2 = sybVar.p;
                        nybVar.j = qqiVar2;
                        nybVar.m = 1;
                        if (qqiVar2.a(nybVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = nybVar.j;
                        qgg.h0(obj);
                    }
                    msa msaVar2 = nsa.b;
                    N = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
                    if (nsa.c(sybVar.r, N) < 0) {
                        File[] listFiles = sybVar.d.listFiles();
                        if (listFiles != null) {
                            int length = listFiles.length;
                            nsaVar = null;
                            while (i2 < length) {
                                File file = listFiles[i2];
                                msa msaVar3 = nsa.b;
                                long N2 = yd5.N(file.lastModified(), ssa.MILLISECONDS);
                                if (nsa.c(N2, N) <= 0 && nsa.c(nsa.o(N2, j), N) >= 0) {
                                    i2 = (nsaVar != null && nsa.c(N2, nsaVar.a) >= 0) ? i2 + 1 : 0;
                                    nsaVar = new nsa(N2);
                                }
                                file.delete();
                            }
                        } else {
                            nsaVar = null;
                        }
                        if (nsaVar != null) {
                            N = nsaVar.a;
                        }
                        sybVar.r = nsa.o(N, j);
                    }
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            msa msaVar22 = nsa.b;
            N = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
            if (nsa.c(sybVar.r, N) < 0) {
            }
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        nybVar = new nyb(sybVar, cg6Var);
        Object obj2 = nybVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nybVar.m;
        if (i != 0) {
        }
    }

    public static final Object b(syb sybVar, String str, String str2, z77 z77Var, String str3, pyb pybVar) {
        String a = sybVar.e.a("com.yandex.plus2.sdk.widget.daily", "sdk-widget-daily", "1.3.2", str, str2, z77Var, str3);
        return sybVar.o.Z(a, new qyb(sybVar, a, new File(sybVar.d, a), z77Var, str, str2, str3, null), pybVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0117, code lost:
    
        if (r2 != r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(syb sybVar, String str, String str2, String str3, String str4, String str5, String str6, z77 z77Var, String str7, cg6 cg6Var) {
        ryb rybVar;
        int i;
        String str8;
        String str9;
        String str10;
        Object obj;
        String str11;
        String str12;
        String str13;
        upi upiVar;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        char c;
        long j;
        Object[] objArr2;
        int i2;
        upi upiVar2;
        int i3;
        i5f i5fVar = sybVar.j;
        z0i z0iVar = sybVar.k;
        String str14 = sybVar.a;
        if (cg6Var instanceof ryb) {
            rybVar = (ryb) cg6Var;
            int i4 = rybVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rybVar.r = i4 - Integer.MIN_VALUE;
                Object obj2 = rybVar.p;
                nm6 nm6Var = nm6.a;
                i = rybVar.r;
                if (i != 0) {
                    qgg.h0(obj2);
                    rybVar.j = str;
                    str8 = str2;
                    rybVar.k = str8;
                    str9 = str3;
                    rybVar.l = str9;
                    rybVar.m = str4;
                    rybVar.n = str5;
                    str10 = str7;
                    rybVar.o = str10;
                    rybVar.r = 1;
                    b5m b5mVar = sybVar.l;
                    if (str6 != null) {
                        obj = b5mVar.invoke(new yz1(z77Var, str6), rybVar);
                        if (obj != nm6Var) {
                            obj = (String) obj;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != nm6Var) {
                        obj2 = obj;
                        str11 = str5;
                        str12 = str;
                        str13 = str4;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    String str15 = rybVar.o;
                    String str16 = rybVar.n;
                    str13 = rybVar.m;
                    str9 = rybVar.l;
                    String str17 = rybVar.k;
                    str12 = rybVar.j;
                    qgg.h0(obj2);
                    str10 = str15;
                    str11 = str16;
                    str8 = str17;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    obj2.getClass();
                    InputStream inputStream = ((i7e) obj2).c;
                    if (inputStream == null) {
                        xq0.q("bodyInputStream is null");
                        return null;
                    }
                    try {
                        l5o l5oVar = (l5o) i4w.C(i5fVar, l5o.Companion.serializer(), inputStream);
                        inputStream.close();
                        l5oVar.getClass();
                        k5o k5oVar = l5oVar.a;
                        int i5 = xso.a;
                        upi upiVar3 = new upi();
                        if (k5oVar != null && (upiVar = k5oVar.b) != null) {
                            Object[] objArr3 = upiVar.b;
                            long[] jArr3 = upiVar.a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j2 = jArr3[i6];
                                    char c2 = 7;
                                    long j3 = -9187201950435737472L;
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j2 & 255) < 128) {
                                                h5o h5oVar = (h5o) objArr3[(i6 << 3) + i9];
                                                if (h5oVar == null || (upiVar2 = h5oVar.c) == null) {
                                                    jArr2 = jArr3;
                                                    c = c2;
                                                    j = j3;
                                                } else {
                                                    Object[] objArr4 = upiVar2.b;
                                                    long[] jArr4 = upiVar2.a;
                                                    c = c2;
                                                    int length2 = jArr4.length - 2;
                                                    if (length2 >= 0) {
                                                        int i10 = i7;
                                                        j = j3;
                                                        int i11 = 0;
                                                        while (true) {
                                                            int i12 = length2;
                                                            long j4 = jArr4[i11];
                                                            jArr2 = jArr3;
                                                            objArr2 = objArr3;
                                                            if ((((~j4) << c) & j4 & j) != j) {
                                                                int i13 = 8 - ((~(i11 - i12)) >>> 31);
                                                                int i14 = 0;
                                                                while (i14 < i13) {
                                                                    if ((j4 & 255) < 128) {
                                                                        i3 = i14;
                                                                        String str18 = (String) objArr4[(i11 << 3) + i14];
                                                                        if (str18 != null) {
                                                                            upiVar3.a(str18);
                                                                        }
                                                                    } else {
                                                                        i3 = i14;
                                                                    }
                                                                    j4 >>= i10;
                                                                    i14 = i3 + 1;
                                                                }
                                                                if (i13 != i10) {
                                                                    break;
                                                                }
                                                            }
                                                            length2 = i12;
                                                            if (i11 == length2) {
                                                                break;
                                                            }
                                                            i11++;
                                                            objArr3 = objArr2;
                                                            jArr3 = jArr2;
                                                            i10 = 8;
                                                        }
                                                        i2 = 8;
                                                    } else {
                                                        jArr2 = jArr3;
                                                        j = j3;
                                                    }
                                                }
                                                objArr2 = objArr3;
                                                i2 = 8;
                                            } else {
                                                jArr2 = jArr3;
                                                c = c2;
                                                j = j3;
                                                objArr2 = objArr3;
                                                i2 = i7;
                                            }
                                            j2 >>= i2;
                                            i9++;
                                            c2 = c;
                                            i7 = i2;
                                            objArr3 = objArr2;
                                            jArr3 = jArr2;
                                            j3 = j;
                                        }
                                        jArr = jArr3;
                                        objArr = objArr3;
                                        if (i8 != i7) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                        objArr = objArr3;
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    objArr3 = objArr;
                                    jArr3 = jArr;
                                }
                            }
                        }
                        String str19 = k5oVar != null ? k5oVar.c : null;
                        if (str19 == null) {
                            str19 = "";
                        }
                        String str20 = k5oVar != null ? k5oVar.d : null;
                        return new okg(str19, str20 != null ? str20 : "", upiVar3);
                    } finally {
                    }
                }
                LinkedHashMap b = sybVar.i.b((String) obj2, str11 != null ? str14 : str11, str10);
                tpi tpiVar = new tpi();
                tpiVar.j(str14, "app_package");
                tpiVar.j(sybVar.b, "app_version");
                if (str8 != null) {
                    tpiVar.j(str8, "lib_package");
                }
                if (str9 != null) {
                    tpiVar.j(str9, "lib_name");
                }
                if (str13 != null) {
                    tpiVar.j(str13, "lib_version");
                }
                tpiVar.j("ANDROID", "platform");
                tpiVar.j(sybVar.c, "platform_version");
                if (str11 != null) {
                    str14 = str11;
                }
                tpiVar.j(str14, "consumer_name");
                b5o b5oVar = new b5o(tpiVar);
                String n = ouj.n(str12, "/v1/experiments");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i4w.D(i5fVar, b5o.Companion.serializer(), b5oVar, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                g7e g7eVar = new g7e(n, b, new ByteArrayInputStream(byteArray));
                rybVar.j = null;
                rybVar.k = null;
                rybVar.l = null;
                rybVar.m = null;
                rybVar.n = null;
                rybVar.o = null;
                rybVar.r = 2;
                obj2 = z0iVar.invoke(g7eVar, rybVar);
            }
        }
        rybVar = new ryb(sybVar, cg6Var);
        Object obj22 = rybVar.p;
        nm6 nm6Var2 = nm6.a;
        i = rybVar.r;
        if (i != 0) {
        }
        LinkedHashMap b2 = sybVar.i.b((String) obj22, str11 != null ? str14 : str11, str10);
        tpi tpiVar2 = new tpi();
        tpiVar2.j(str14, "app_package");
        tpiVar2.j(sybVar.b, "app_version");
        if (str8 != null) {
        }
        if (str9 != null) {
        }
        if (str13 != null) {
        }
        tpiVar2.j("ANDROID", "platform");
        tpiVar2.j(sybVar.c, "platform_version");
        if (str11 != null) {
        }
        tpiVar2.j(str14, "consumer_name");
        b5o b5oVar2 = new b5o(tpiVar2);
        String n2 = ouj.n(str12, "/v1/experiments");
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        i4w.D(i5fVar, b5o.Companion.serializer(), b5oVar2, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        byteArray2.getClass();
        g7e g7eVar2 = new g7e(n2, b2, new ByteArrayInputStream(byteArray2));
        rybVar.j = null;
        rybVar.k = null;
        rybVar.l = null;
        rybVar.m = null;
        rybVar.n = null;
        rybVar.o = null;
        rybVar.r = 2;
        obj22 = z0iVar.invoke(g7eVar2, rybVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, z77 z77Var, String str3, cg6 cg6Var) {
        oyb oybVar;
        int i;
        if (cg6Var instanceof oyb) {
            oybVar = (oyb) cg6Var;
            int i2 = oybVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oybVar.l = i2 - Integer.MIN_VALUE;
                oyb oybVar2 = oybVar;
                Object obj = oybVar2.j;
                nm6 nm6Var = nm6.a;
                i = oybVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ou7 p = x97.p(this.m, this.n, null, new pyb(z77Var, this, str, str2, str3, null), 2);
                    oybVar2.l = 1;
                    obj = p.s(oybVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        oybVar = new oyb(this, cg6Var);
        oyb oybVar22 = oybVar;
        Object obj2 = oybVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = oybVar22.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
