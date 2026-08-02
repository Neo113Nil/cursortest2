package defpackage;

import android.net.Uri;
import com.yandex.music.shared.player.download2.exo.ChunkedRangesDataSource$ContentRangeHeaderException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class uw6 implements db7 {
    public final so3 a;
    public final db7 b;
    public final o8s c;
    public final lj3 d;
    public final db7 e;
    public final vp3 f;
    public final xla g;
    public Uri h;
    public nb7 i;
    public nb7 j;
    public db7 k;
    public long l;
    public long m;
    public long n;
    public jq3 o;
    public long p;
    public boolean q;

    public uw6(so3 so3Var, db7 db7Var, db7 db7Var2, ta7 ta7Var, xq0 xq0Var, int i, xla xlaVar) {
        this.a = so3Var;
        this.b = db7Var2;
        this.f = xq0Var == null ? vp3.R : xq0Var;
        if (db7Var != null) {
            this.e = db7Var;
            this.c = ta7Var != null ? new o8s(db7Var, ta7Var) : null;
            this.d = ta7Var instanceof lj3 ? (lj3) ta7Var : null;
        } else {
            this.e = qsk.a;
            this.c = null;
            this.d = null;
        }
        this.g = xlaVar;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        String str;
        String str2;
        this.q = true;
        String f = this.f.f(nb7Var);
        mb7 a = nb7Var.a();
        long j = nb7Var.g;
        long j2 = nb7Var.f;
        a.h = f;
        nb7 a2 = a.a();
        this.i = a2;
        Uri uri = a2.a;
        so3 so3Var = this.a;
        Uri b = qc6.b(so3Var.a(f));
        if (b != null) {
            uri = b;
        }
        this.h = uri;
        this.m = j2;
        this.n = qc6.a(so3Var.a(f));
        StringBuilder sb = new StringBuilder("open ");
        Matcher matcher = Pattern.compile(".*/(.*/.*)").matcher(f);
        sb.append(matcher.matches() ? matcher.group(1) : f);
        sb.append(", ds = ");
        sb.append(j2);
        ouj.C(sb, "/", j, ", content length = ");
        sb.append(this.n);
        d(sb.toString());
        long j3 = this.n;
        if (j3 != -1) {
            long j4 = j3 - j2;
            this.n = j4;
            if (j4 < 0) {
                throw new hb7(2008);
            }
        }
        if (j != -1) {
            long j5 = this.n;
            this.n = j5 == -1 ? j : Math.min(j5, j);
        }
        long j6 = this.n;
        if (j6 > 0 || j6 == -1) {
            f(a2, false);
        }
        d("opened, bytesRemaining = " + this.n);
        if (this.n == -1) {
            long a3 = qc6.a(so3Var.a(f));
            this.n = a3;
            if (a3 != -1) {
                long j7 = a3 - j2;
                this.n = j7;
                if (j7 < 0) {
                    throw new hb7(2008);
                }
            }
            d("tried again, bytesRemaining = " + this.n);
        }
        xla xlaVar = this.g;
        if (xlaVar != null) {
            long j8 = this.n;
            switch (xlaVar.a) {
                case 22:
                    if (j8 < 0) {
                        str = "enc2 experiment is broken, got ";
                        str2 = " bytes after open";
                        dfi.r(dfi.e(j8, str, str2), "ExoDataSources");
                        break;
                    }
                    break;
                default:
                    if (j8 < 0) {
                        str = "enc2 experiment is broken, got ";
                        str2 = " bytes after open";
                        dfi.r(dfi.e(j8, str, str2), "ExoDataSources");
                        break;
                    }
                    break;
            }
        }
        this.q = false;
        return j != -1 ? j : this.n;
    }

    @Override // defpackage.db7
    public final Map b() {
        return !(this.k == this.b) ? this.e.b() : Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        so3 so3Var = this.a;
        db7 db7Var = this.k;
        if (db7Var == null) {
            return;
        }
        try {
            db7Var.close();
        } finally {
            this.j = null;
            this.k = null;
            jq3 jq3Var = this.o;
            if (jq3Var != null) {
                so3Var.b(jq3Var);
                this.o = null;
            }
        }
    }

    @Override // defpackage.db7
    public final void close() {
        this.i = null;
        this.h = null;
        this.m = 0L;
        c();
    }

    public final void d(String str) {
        Timber.tag("CustomCacheDataSource").d(ouj.o(Integer.toString(System.identityHashCode(this), 16), ": ", str), new Object[0]);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nb7 nb7Var, boolean z) {
        so3 so3Var;
        long j;
        nb7 a;
        so3 so3Var2;
        db7 db7Var;
        List list;
        Uri uri;
        Long l;
        String str;
        String str2 = nb7Var.h;
        int i = dvt.a;
        try {
            long j2 = this.n;
            long j3 = 524288;
            if (j2 != -1) {
                j3 = Math.min(524288L, j2);
            }
            jq3 f = this.a.f(this.m, j3, str2);
            if (this.q) {
                d("nextSpan cached = " + f.d);
            }
            boolean z2 = f.d;
            o8s o8sVar = this.c;
            db7 db7Var2 = this.b;
            so3 so3Var3 = this.a;
            if (z2) {
                Uri fromFile = Uri.fromFile(f.e);
                long j4 = f.b;
                long j5 = this.m - j4;
                long j6 = f.c - j5;
                so3Var = so3Var3;
                long j7 = this.n;
                if (j7 != -1) {
                    j6 = Math.min(j6, j7);
                }
                mb7 a2 = nb7Var.a();
                a2.a = fromFile;
                a2.b = j4;
                a2.f = j5;
                a2.g = j6;
                a = a2.a();
                db7Var = db7Var2;
            } else {
                so3Var = so3Var3;
                jq3 g = this.a.g(this.m, this.n, str2);
                if (g != null) {
                    j = g.c;
                    if (j != -1) {
                        long j8 = this.n;
                        if (j8 != -1) {
                            j = Math.min(j, j8);
                        }
                        mb7 a3 = nb7Var.a();
                        a3.f = this.m;
                        a3.g = j;
                        a = a3.a();
                        if (o8sVar != null) {
                            so3Var2 = so3Var;
                            so3Var2.b(f);
                            db7Var = this.e;
                            f = null;
                            this.p = db7Var == db7Var2 ? this.m + 131071 : Long.MAX_VALUE;
                            if (z) {
                                if (db7Var == this.k) {
                                    return;
                                }
                                try {
                                    c();
                                } catch (Throwable th) {
                                    if (!f.d) {
                                        so3Var2.b(f);
                                    }
                                    throw th;
                                }
                            }
                            if (f != null && !f.d) {
                                this.o = f;
                            }
                            this.k = db7Var;
                            this.j = a;
                            this.l = 0L;
                            db7Var.a(a);
                            Map b = db7Var.b();
                            b.getClass();
                            list = (List) b.get("content-range");
                            if (list != null || (str = (String) CollectionsKt.firstOrNull(list)) == null) {
                                uri = null;
                                l = null;
                            } else {
                                jch b2 = new Regex("bytes (\\d+)-(\\d+)/(\\d+)").b(str);
                                if (b2 == null) {
                                    ssg.a(7, null, "Unknown format of Content-Range header: ".concat(str), null);
                                    throw new ChunkedRangesDataSource$ContentRangeHeaderException("Unknown format of Content-Range header: ".concat(str));
                                }
                                l = Long.valueOf(Long.parseLong((String) ((fb9) b2.a()).get(3)));
                                uri = null;
                            }
                            if (this.q) {
                                StringBuilder sb = new StringBuilder("newContentSize = ");
                                sb.append(l == null ? "null" : l.toString());
                                d(sb.toString());
                            }
                            rc6 rc6Var = new rc6(0);
                            if (l != null) {
                                this.n = l.longValue() - this.m;
                                rc6Var.a(l, "exo_len");
                            }
                            if (!(this.k == db7Var2)) {
                                Uri uri2 = db7Var.getUri();
                                this.h = uri2;
                                rc6.d(rc6Var, !nb7Var.a.equals(uri2) ? this.h : uri);
                            }
                            if (this.k != o8sVar) {
                                so3Var2.l(str2, rc6Var);
                                lj3 lj3Var = this.d;
                                if (lj3Var != null) {
                                    lj3Var.i = rc6Var;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        db7Var = o8sVar;
                    }
                }
                j = this.n;
                mb7 a32 = nb7Var.a();
                a32.f = this.m;
                a32.g = j;
                a = a32.a();
                if (o8sVar != null) {
                }
            }
            so3Var2 = so3Var;
            this.p = db7Var == db7Var2 ? this.m + 131071 : Long.MAX_VALUE;
            if (z) {
            }
            if (f != null) {
                this.o = f;
            }
            this.k = db7Var;
            this.j = a;
            this.l = 0L;
            db7Var.a(a);
            Map b3 = db7Var.b();
            b3.getClass();
            list = (List) b3.get("content-range");
            if (list != null) {
            }
            uri = null;
            l = null;
            if (this.q) {
            }
            rc6 rc6Var2 = new rc6(0);
            if (l != null) {
            }
            if (!(this.k == db7Var2)) {
            }
            if (this.k != o8sVar) {
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.h;
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.b.q(t6tVar);
        this.e.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        nb7 nb7Var = this.i;
        nb7Var.getClass();
        nb7 nb7Var2 = this.j;
        nb7Var2.getClass();
        if (this.m >= this.p) {
            f(nb7Var, true);
        }
        db7 db7Var = this.k;
        db7Var.getClass();
        int read = db7Var.read(bArr, i, i2);
        db7 db7Var2 = this.k;
        if (read != -1) {
            long j = read;
            this.m += j;
            this.l += j;
            long j2 = this.n;
            if (j2 != -1) {
                this.n = j2 - j;
                return read;
            }
        } else {
            if (!(db7Var2 == this.b)) {
                long j3 = nb7Var2.g;
                if (j3 == -1 || this.l < j3) {
                    String str = nb7Var.h;
                    int i3 = dvt.a;
                    this.n = 0L;
                    if (db7Var2 == this.c) {
                        rc6 rc6Var = new rc6(0);
                        rc6Var.a(Long.valueOf(this.m), "exo_len");
                        this.a.l(str, rc6Var);
                        lj3 lj3Var = this.d;
                        if (lj3Var != null) {
                            lj3Var.i = rc6Var;
                        }
                    }
                    return read;
                }
            }
            long j4 = this.n;
            if (j4 > 0 || j4 == -1) {
                c();
                f(nb7Var, false);
                return read(bArr, i, i2);
            }
        }
        return read;
    }
}
