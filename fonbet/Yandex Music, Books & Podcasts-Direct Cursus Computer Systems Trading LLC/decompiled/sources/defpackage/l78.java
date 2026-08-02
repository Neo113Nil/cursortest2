package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class l78 implements Closeable, Flushable {
    public static final Regex q = new Regex("[a-z0-9_-]{1,120}");
    public final cak a;
    public final long b;
    public final cak c;
    public final cak d;
    public final cak e;
    public final LinkedHashMap f;
    public final tf6 g;
    public long h;
    public int i;
    public hkn j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final i78 p;

    public l78(long j, lac lacVar, cak cakVar, a aVar) {
        this.a = cakVar;
        this.b = j;
        if (j <= 0) {
            xq0.x("maxSize <= 0");
            throw null;
        }
        this.c = cakVar.d("journal");
        this.d = cakVar.d("journal.tmp");
        this.e = cakVar.d("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        this.g = gld.e(e.c(a4g.n(), aVar.I0(1)));
        this.p = new i78(lacVar);
    }

    public static void R(String str) {
        if (q.e(str)) {
            return;
        }
        xq0.o(ouj.k('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if ((r9.i >= 2000) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:29:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:37:0x005c, B:39:0x006a, B:41:0x00a8, B:43:0x00af, B:46:0x00b4, B:48:0x00c5, B:51:0x00ca, B:52:0x0105, B:54:0x0110, B:60:0x0119, B:61:0x00e2, B:63:0x00f7, B:65:0x0102, B:68:0x0098, B:70:0x011e, B:71:0x0125), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(l78 l78Var, z0j z0jVar, boolean z) {
        synchronized (l78Var) {
            e78 e78Var = (e78) z0jVar.c;
            if (!Intrinsics.d(e78Var.g, z0jVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || e78Var.f) {
                for (int i = 0; i < 2; i++) {
                    l78Var.p.e((cak) e78Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) z0jVar.d)[i2] && !l78Var.p.f((cak) e78Var.d.get(i2))) {
                        z0jVar.F(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    cak cakVar = (cak) e78Var.d.get(i3);
                    cak cakVar2 = (cak) e78Var.c.get(i3);
                    boolean f = l78Var.p.f(cakVar);
                    i78 i78Var = l78Var.p;
                    if (f) {
                        i78Var.b(cakVar, cakVar2);
                    } else {
                        cak cakVar3 = (cak) e78Var.c.get(i3);
                        if (!i78Var.f(cakVar3)) {
                            k.a(i78Var.k(cakVar3));
                        }
                    }
                    long j = e78Var.b[i3];
                    Long l = (Long) l78Var.p.h(cakVar2).e;
                    long longValue = l != null ? l.longValue() : 0L;
                    e78Var.b[i3] = longValue;
                    l78Var.h = (l78Var.h - j) + longValue;
                }
            }
            e78Var.g = null;
            if (e78Var.f) {
                l78Var.P(e78Var);
                return;
            }
            l78Var.i++;
            hkn hknVar = l78Var.j;
            hknVar.getClass();
            if (!z && !e78Var.e) {
                l78Var.f.remove(e78Var.a);
                hknVar.M("REMOVE");
                hknVar.writeByte(32);
                hknVar.M(e78Var.a);
                hknVar.writeByte(10);
                hknVar.flush();
                if (l78Var.h <= l78Var.b) {
                }
                l78Var.z();
            }
            e78Var.e = true;
            hknVar.M("CLEAN");
            hknVar.writeByte(32);
            hknVar.M(e78Var.a);
            for (long j2 : e78Var.b) {
                hknVar.writeByte(32);
                hknVar.c0(j2);
            }
            hknVar.writeByte(10);
            hknVar.flush();
            if (l78Var.h <= l78Var.b) {
            }
            l78Var.z();
        }
    }

    public final hkn D() {
        i78 i78Var = this.p;
        i78Var.getClass();
        cak cakVar = this.c;
        cakVar.getClass();
        return new hkn(new o5c(i78Var.b.a(cakVar), new az6(15, this)));
    }

    public final void H() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            e78 e78Var = (e78) it.next();
            int i = 0;
            if (e78Var.g == null) {
                while (i < 2) {
                    j += e78Var.b[i];
                    i++;
                }
            } else {
                e78Var.g = null;
                while (i < 2) {
                    cak cakVar = (cak) e78Var.c.get(i);
                    i78 i78Var = this.p;
                    i78Var.e(cakVar);
                    i78Var.e((cak) e78Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.h = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        Unit unit;
        ikn u = fxf.u(this.p.l(this.c));
        Throwable th = null;
        try {
            String G = u.G(Long.MAX_VALUE);
            String G2 = u.G(Long.MAX_VALUE);
            String G3 = u.G(Long.MAX_VALUE);
            String G4 = u.G(Long.MAX_VALUE);
            String G5 = u.G(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(G) || !"1".equals(G2) || !Intrinsics.d(String.valueOf(1), G3) || !Intrinsics.d(String.valueOf(2), G4) || G5.length() > 0) {
                throw new IOException("unexpected journal header: [" + G + ", " + G2 + ", " + G3 + ", " + G4 + ", " + G5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    N(u.G(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.i = i - this.f.size();
                    if (u.a()) {
                        this.j = D();
                    } else {
                        S();
                    }
                    unit = Unit.a;
                    try {
                        u.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    unit.getClass();
                    return;
                }
            }
        } catch (Throwable th3) {
            try {
                u.close();
            } catch (Throwable th4) {
                fob.a(th3, th4);
            }
            th = th3;
            unit = null;
            if (th == null) {
            }
        }
    }

    public final void N(String str) {
        String substring;
        int S = StringsKt.S(str, ' ', 0, 6);
        if (S == -1) {
            kac.f("unexpected journal line: ".concat(str));
            return;
        }
        int i = S + 1;
        int S2 = StringsKt.S(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f;
        if (S2 == -1) {
            substring = str.substring(i);
            if (S == 6 && c.v(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, S2);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new e78(this, substring);
            linkedHashMap.put(substring, obj);
        }
        e78 e78Var = (e78) obj;
        if (S2 == -1 || S != 5 || !c.v(str, "CLEAN", false)) {
            if (S2 == -1 && S == 5 && c.v(str, "DIRTY", false)) {
                e78Var.g = new z0j(this, e78Var);
                return;
            } else {
                if (S2 == -1 && S == 4 && c.v(str, "READ", false)) {
                    return;
                }
                kac.f("unexpected journal line: ".concat(str));
                return;
            }
        }
        List e0 = StringsKt.e0(str.substring(S2 + 1), new char[]{' '}, 6);
        e78Var.e = true;
        e78Var.g = null;
        if (e0.size() != 2) {
            tiu.j(e0, "unexpected journal line: ");
            return;
        }
        try {
            int size = e0.size();
            for (int i2 = 0; i2 < size; i2++) {
                e78Var.b[i2] = Long.parseLong((String) e0.get(i2));
            }
        } catch (NumberFormatException unused) {
            tiu.j(e0, "unexpected journal line: ");
        }
    }

    public final void P(e78 e78Var) {
        hkn hknVar;
        int i = e78Var.h;
        String str = e78Var.a;
        if (i > 0 && (hknVar = this.j) != null) {
            hknVar.M("DIRTY");
            hknVar.writeByte(32);
            hknVar.M(str);
            hknVar.writeByte(10);
            hknVar.flush();
        }
        if (e78Var.h > 0 || e78Var.g != null) {
            e78Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.p.e((cak) e78Var.c.get(i2));
            long j = this.h;
            long[] jArr = e78Var.b;
            this.h = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.i++;
        hkn hknVar2 = this.j;
        if (hknVar2 != null) {
            hknVar2.M("REMOVE");
            hknVar2.writeByte(32);
            hknVar2.M(str);
            hknVar2.writeByte(10);
        }
        this.f.remove(str);
        if (this.i >= 2000) {
            z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        P(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        while (this.h > this.b) {
            for (e78 e78Var : this.f.values()) {
                if (!e78Var.f) {
                    break;
                }
            }
            return;
        }
        this.n = false;
    }

    public final synchronized void S() {
        Unit unit;
        try {
            hkn hknVar = this.j;
            if (hknVar != null) {
                hknVar.close();
            }
            hkn t = fxf.t(this.p.k(this.d));
            Throwable th = null;
            try {
                t.M("libcore.io.DiskLruCache");
                t.writeByte(10);
                t.M("1");
                t.writeByte(10);
                t.c0(1);
                t.writeByte(10);
                t.c0(2);
                t.writeByte(10);
                t.writeByte(10);
                for (e78 e78Var : this.f.values()) {
                    if (e78Var.g != null) {
                        t.M("DIRTY");
                        t.writeByte(32);
                        t.M(e78Var.a);
                        t.writeByte(10);
                    } else {
                        t.M("CLEAN");
                        t.writeByte(32);
                        t.M(e78Var.a);
                        for (long j : e78Var.b) {
                            t.writeByte(32);
                            t.c0(j);
                        }
                        t.writeByte(10);
                    }
                }
                unit = Unit.a;
                try {
                    t.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    t.close();
                } catch (Throwable th4) {
                    fob.a(th3, th4);
                }
                unit = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            unit.getClass();
            boolean f = this.p.f(this.c);
            i78 i78Var = this.p;
            if (f) {
                i78Var.b(this.c, this.e);
                this.p.b(this.d, this.c);
                this.p.e(this.e);
            } else {
                i78Var.b(this.d, this.c);
            }
            this.j = D();
            this.i = 0;
            this.k = false;
            this.o = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized z0j b(String str) {
        if (this.m) {
            throw new IllegalStateException("cache is closed");
        }
        R(str);
        o();
        e78 e78Var = (e78) this.f.get(str);
        if ((e78Var != null ? e78Var.g : null) != null) {
            return null;
        }
        if (e78Var != null && e78Var.h != 0) {
            return null;
        }
        if (!this.n && !this.o) {
            hkn hknVar = this.j;
            hknVar.getClass();
            hknVar.M("DIRTY");
            hknVar.writeByte(32);
            hknVar.M(str);
            hknVar.writeByte(10);
            hknVar.flush();
            if (this.k) {
                return null;
            }
            if (e78Var == null) {
                e78Var = new e78(this, str);
                this.f.put(str, e78Var);
            }
            z0j z0jVar = new z0j(this, e78Var);
            e78Var.g = z0jVar;
            return z0jVar;
        }
        z();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l && !this.m) {
                for (e78 e78Var : (e78[]) this.f.values().toArray(new e78[0])) {
                    z0j z0jVar = e78Var.g;
                    if (z0jVar != null) {
                        e78 e78Var2 = (e78) z0jVar.c;
                        if (Intrinsics.d(e78Var2.g, z0jVar)) {
                            e78Var2.f = true;
                        }
                    }
                }
                Q();
                gld.L(this.g, null);
                hkn hknVar = this.j;
                hknVar.getClass();
                hknVar.close();
                this.j = null;
                this.m = true;
                return;
            }
            this.m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.l) {
            if (this.m) {
                throw new IllegalStateException("cache is closed");
            }
            Q();
            hkn hknVar = this.j;
            hknVar.getClass();
            hknVar.flush();
        }
    }

    public final synchronized g78 g(String str) {
        g78 a;
        if (this.m) {
            throw new IllegalStateException("cache is closed");
        }
        R(str);
        o();
        e78 e78Var = (e78) this.f.get(str);
        if (e78Var != null && (a = e78Var.a()) != null) {
            boolean z = true;
            this.i++;
            hkn hknVar = this.j;
            hknVar.getClass();
            hknVar.M("READ");
            hknVar.writeByte(32);
            hknVar.M(str);
            hknVar.writeByte(10);
            if (this.i < 2000) {
                z = false;
            }
            if (z) {
                z();
            }
            return a;
        }
        return null;
    }

    public final synchronized void o() {
        try {
            if (this.l) {
                return;
            }
            this.p.e(this.d);
            if (this.p.f(this.e)) {
                boolean f = this.p.f(this.c);
                i78 i78Var = this.p;
                cak cakVar = this.e;
                if (f) {
                    i78Var.e(cakVar);
                } else {
                    i78Var.b(cakVar, this.c);
                }
            }
            if (this.p.f(this.c)) {
                try {
                    I();
                    H();
                    this.l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        lxe.j(this.p, this.a);
                        this.m = false;
                    } catch (Throwable th) {
                        this.m = false;
                        throw th;
                    }
                }
            }
            S();
            this.l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void z() {
        x97.y(this.g, null, null, new ox1(this, null, 13), 3);
    }
}
