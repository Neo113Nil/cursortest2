package defpackage;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class kq3 {
    public final d0o a;
    public final hq3 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public kq3(d0o d0oVar, hq3 hq3Var) {
        int i;
        this.a = d0oVar;
        this.b = hq3Var;
        this.k = -1;
        if (hq3Var != null) {
            this.h = hq3Var.a;
            this.i = hq3Var.c;
            zvd zvdVar = (zvd) hq3Var.f;
            int size = zvdVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String g = zvdVar.g(i2);
                if (c.o(g, "Date", true)) {
                    String a = zvdVar.a("Date");
                    this.c = a != null ? wd7.a(a) : null;
                    this.d = zvdVar.q(i2);
                } else if (c.o(g, "Expires", true)) {
                    String a2 = zvdVar.a("Expires");
                    this.g = a2 != null ? wd7.a(a2) : null;
                } else if (c.o(g, "Last-Modified", true)) {
                    String a3 = zvdVar.a("Last-Modified");
                    this.e = a3 != null ? wd7.a(a3) : null;
                    this.f = zvdVar.q(i2);
                } else if (c.o(g, "ETag", true)) {
                    this.j = zvdVar.q(i2);
                } else if (c.o(g, "Age", true)) {
                    String q = zvdVar.q(i2);
                    Bitmap.Config[] configArr = k.a;
                    Long s0 = StringsKt.s0(q);
                    if (s0 != null) {
                        long longValue = s0.longValue();
                        i = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                    } else {
                        i = -1;
                    }
                    this.k = i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cd, code lost:
    
        if (r4 > 0) goto L54;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [arf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lq3 a() {
        hq3 hq3Var;
        long j;
        String sb;
        long j2;
        Date date;
        long j3;
        int i;
        d0o d0oVar = this.a;
        u7e u7eVar = d0oVar.a;
        hq3 hq3Var2 = this.b;
        if (hq3Var2 == null) {
            return new lq3(d0oVar, null);
        }
        ?? r5 = hq3Var2.d;
        if (u7eVar.j && !hq3Var2.b) {
            return new lq3(d0oVar, null);
        }
        cp3 cp3Var = (cp3) r5.getValue();
        if (d0oVar.a().b || ((cp3) r5.getValue()).b || Intrinsics.d(((zvd) hq3Var2.f).a("Vary"), "*")) {
            return new lq3(d0oVar, null);
        }
        cp3 a = d0oVar.a();
        if (!a.a) {
            zvd zvdVar = d0oVar.c;
            String str = "If-Modified-Since";
            if (zvdVar.a("If-Modified-Since") == null && zvdVar.a("If-None-Match") == null) {
                long j4 = this.i;
                Date date2 = this.c;
                if (date2 != null) {
                    hq3Var = hq3Var2;
                    j = Math.max(0L, j4 - date2.getTime());
                } else {
                    hq3Var = hq3Var2;
                    j = 0;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.k;
                if (i2 != -1) {
                    j = Math.max(j, timeUnit.toMillis(i2));
                }
                long j5 = this.h;
                long longValue = j + (j4 - j5) + (((Number) fhs.a.invoke()).longValue() - j4);
                int i3 = ((cp3) r5.getValue()).c;
                Date date3 = this.e;
                if (i3 != -1) {
                    j2 = timeUnit.toMillis(i3);
                } else {
                    Date date4 = this.g;
                    if (date4 != null) {
                        if (date2 != null) {
                            j4 = date2.getTime();
                        }
                        j2 = date4.getTime() - j4;
                    } else {
                        if (date3 != null) {
                            List list = u7eVar.g;
                            if (list == null) {
                                sb = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                ofc.I(list, sb2);
                                sb = sb2.toString();
                            }
                            if (sb == null) {
                                if (date2 != null) {
                                    j5 = date2.getTime();
                                }
                                long time = j5 - date3.getTime();
                                if (time > 0) {
                                    j2 = time / 10;
                                }
                            }
                        }
                        j2 = 0;
                    }
                }
                int i4 = a.c;
                if (i4 != -1) {
                    j2 = Math.min(j2, timeUnit.toMillis(i4));
                }
                int i5 = a.i;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                if (cp3Var.g || (i = a.h) == -1) {
                    date = date3;
                    j3 = 0;
                } else {
                    date = date3;
                    j3 = timeUnit.toMillis(i);
                }
                if (!cp3Var.a && longValue + millis < j2 + j3) {
                    return new lq3(null, hq3Var);
                }
                hq3 hq3Var3 = hq3Var;
                String str2 = this.j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date != null) {
                    str2 = this.f;
                    str2.getClass();
                } else {
                    if (date2 == null) {
                        return new lq3(d0oVar, null);
                    }
                    str2 = this.d;
                    str2.getClass();
                }
                b0o b = d0oVar.b();
                b.a(str, str2);
                return new lq3(b.b(), hq3Var3);
            }
        }
        return new lq3(d0oVar, null);
    }
}
