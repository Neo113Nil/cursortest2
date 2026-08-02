package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class ttw extends lac {
    public static final cak e;
    public final cak b;
    public final lac c;
    public final LinkedHashMap d;

    static {
        String str = cak.b;
        e = h1b.M("/");
    }

    public ttw(cak cakVar, lac lacVar, LinkedHashMap linkedHashMap) {
        this.b = cakVar;
        this.c = lacVar;
        this.d = linkedHashMap;
    }

    @Override // defpackage.lac
    public final jmq a(cak cakVar) {
        cakVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.lac
    public final void b(cak cakVar, cak cakVar2) {
        cakVar.getClass();
        cakVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.lac
    public final void c(cak cakVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.lac
    public final void d(cak cakVar) {
        cakVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.lac
    public final List g(cak cakVar) {
        cakVar.getClass();
        cak cakVar2 = e;
        cakVar2.getClass();
        stw stwVar = (stw) this.d.get(h.b(cakVar2, cakVar, true));
        if (stwVar == null) {
            tiu.j(cakVar, "not a directory: ");
            return null;
        }
        List w0 = CollectionsKt.w0(stwVar.q);
        w0.getClass();
        return w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    @Override // defpackage.lac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v97 i(cak cakVar) {
        Long valueOf;
        long j;
        Long l;
        Long valueOf2;
        Long l2;
        Long l3;
        Long valueOf3;
        Throwable th;
        Throwable th2;
        stw stwVar;
        cakVar.getClass();
        cak cakVar2 = e;
        cakVar2.getClass();
        stw stwVar2 = (stw) this.d.get(h.b(cakVar2, cakVar, true));
        if (stwVar2 == null) {
            return null;
        }
        long j2 = stwVar2.h;
        if (j2 != -1) {
            a9f j3 = this.c.j(this.b);
            try {
                ikn iknVar = new ikn(j3.a(j2));
                try {
                    stwVar = o8g.I(iknVar, stwVar2);
                    stwVar.getClass();
                    try {
                        iknVar.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        iknVar.close();
                    } catch (Throwable th5) {
                        fob.a(th4, th5);
                    }
                    th2 = th4;
                    stwVar = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (j3 != null) {
                    try {
                        j3.close();
                    } catch (Throwable th7) {
                        fob.a(th, th7);
                    }
                }
                stwVar2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                j3.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            stw stwVar3 = stwVar;
            th = th;
            stwVar2 = stwVar3;
            if (th != null) {
                throw th;
            }
        }
        boolean z = stwVar2.b;
        boolean z2 = !z;
        Long valueOf4 = z ? null : Long.valueOf(stwVar2.f);
        Long l4 = stwVar2.m;
        if (l4 != null) {
            valueOf = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        } else {
            valueOf = stwVar2.p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l5 = stwVar2.k;
        if (l5 != null) {
            j = 11644473600000L;
            valueOf2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            j = 11644473600000L;
            if (stwVar2.n == null) {
                int i = stwVar2.j;
                if (i != -1) {
                    int i2 = stwVar2.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        valueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l = null;
                l2 = stwVar2.l;
                if (l2 == null) {
                    valueOf3 = Long.valueOf((l2.longValue() / 10000) - j);
                } else {
                    if (stwVar2.o == null) {
                        l3 = null;
                        return new v97(z2, z, null, valueOf4, valueOf, l, l3);
                    }
                    valueOf3 = Long.valueOf(r0.intValue() * 1000);
                }
                l3 = valueOf3;
                return new v97(z2, z, null, valueOf4, valueOf, l, l3);
            }
            valueOf2 = Long.valueOf(r3.intValue() * 1000);
        }
        l = valueOf2;
        l2 = stwVar2.l;
        if (l2 == null) {
        }
        l3 = valueOf3;
        return new v97(z2, z, null, valueOf4, valueOf, l, l3);
    }

    @Override // defpackage.lac
    public final a9f j(cak cakVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.lac
    public final jmq k(cak cakVar) {
        cakVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.lac
    public final n3r l(cak cakVar) {
        ikn iknVar;
        Throwable th;
        cakVar.getClass();
        cak cakVar2 = e;
        cakVar2.getClass();
        stw stwVar = (stw) this.d.get(h.b(cakVar2, cakVar, true));
        if (stwVar == null) {
            kac.e(cakVar, "no such file: ");
            return null;
        }
        long j = stwVar.f;
        a9f j2 = this.c.j(this.b);
        try {
            iknVar = new ikn(j2.a(stwVar.h));
            try {
                j2.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (j2 != null) {
                try {
                    j2.close();
                } catch (Throwable th4) {
                    fob.a(th3, th4);
                }
            }
            iknVar = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        iknVar.getClass();
        o8g.I(iknVar, null);
        if (stwVar.g == 0) {
            return new yfc(iknVar, j, true);
        }
        return new yfc(new ake(new ikn(new yfc(iknVar, stwVar.e, true)), new Inflater(true)), j, false);
    }
}
