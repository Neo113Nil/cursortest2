package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class k78 implements Closeable, Flushable {
    public static final Regex s = new Regex("[a-z0-9_-]{1,120}");
    public static final String t = "CLEAN";
    public static final String u = "DIRTY";
    public static final String v = "REMOVE";
    public static final String w = "READ";
    public final File a;
    public final long b;
    public final File c;
    public final File d;
    public final File e;
    public long f;
    public hkn g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public final l8s q;
    public final h78 r;

    public k78(File file, long j, m8s m8sVar) {
        file.getClass();
        m8sVar.getClass();
        this.a = file;
        this.b = j;
        this.h = new LinkedHashMap(0, 0.75f, true);
        this.q = m8sVar.e();
        this.r = new h78(this, su4.o(new StringBuilder(), cvt.g, " Cache"), 0);
        if (j <= 0) {
            xq0.x("maxSize <= 0");
            throw null;
        }
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
    }

    public static void X(String str) {
        if (s.e(str)) {
            return;
        }
        xq0.o(ouj.k('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final boolean D() {
        int i = this.i;
        return i >= 2000 && i >= this.h.size();
    }

    public final hkn H() {
        kt1 kt1Var;
        File file = this.c;
        file.getClass();
        try {
            Logger logger = epj.a;
            kt1Var = new kt1(new FileOutputStream(file, true), new vis());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = epj.a;
            kt1Var = new kt1(new FileOutputStream(file, true), new vis());
        }
        return new hkn(new o5c(kt1Var, (Function1) new az6(14, this)));
    }

    public final void I() {
        e88 e88Var = e88.d;
        e88Var.s(this.d);
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            d78 d78Var = (d78) next;
            int i = 0;
            if (d78Var.g == null) {
                while (i < 2) {
                    this.f += d78Var.b[i];
                    i++;
                }
            } else {
                d78Var.g = null;
                while (i < 2) {
                    e88Var.s((File) d78Var.c.get(i));
                    e88Var.s((File) d78Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void N() {
        File file = this.c;
        file.getClass();
        ikn iknVar = new ikn(fxf.S(file));
        try {
            String G = iknVar.G(Long.MAX_VALUE);
            String G2 = iknVar.G(Long.MAX_VALUE);
            String G3 = iknVar.G(Long.MAX_VALUE);
            String G4 = iknVar.G(Long.MAX_VALUE);
            String G5 = iknVar.G(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(G) || !"1".equals(G2) || !Intrinsics.d(String.valueOf(201105), G3) || !Intrinsics.d(String.valueOf(2), G4) || G5.length() > 0) {
                throw new IOException("unexpected journal header: [" + G + ", " + G2 + ", " + G4 + ", " + G5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    P(iknVar.G(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.i = i - this.h.size();
                    if (iknVar.a()) {
                        this.g = H();
                    } else {
                        Q();
                    }
                    iknVar.close();
                    return;
                }
            }
        } finally {
        }
    }

    public final void P(String str) {
        String substring;
        int S = StringsKt.S(str, ' ', 0, 6);
        if (S == -1) {
            kac.f("unexpected journal line: ".concat(str));
            return;
        }
        int i = S + 1;
        int S2 = StringsKt.S(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.h;
        if (S2 == -1) {
            substring = str.substring(i);
            String str2 = v;
            if (S == str2.length() && c.v(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, S2);
        }
        d78 d78Var = (d78) linkedHashMap.get(substring);
        if (d78Var == null) {
            d78Var = new d78(this, substring);
            linkedHashMap.put(substring, d78Var);
        }
        if (S2 != -1) {
            String str3 = t;
            if (S == str3.length() && c.v(str, str3, false)) {
                List e0 = StringsKt.e0(str.substring(S2 + 1), new char[]{' '}, 6);
                d78Var.e = true;
                d78Var.g = null;
                e0.getClass();
                int size = e0.size();
                d78Var.j.getClass();
                if (size != 2) {
                    tiu.j(e0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = e0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        d78Var.b[i2] = Long.parseLong((String) e0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    tiu.j(e0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (S2 == -1) {
            String str4 = u;
            if (S == str4.length() && c.v(str, str4, false)) {
                d78Var.g = new z0j(this, d78Var);
                return;
            }
        }
        if (S2 == -1) {
            String str5 = w;
            if (S == str5.length() && c.v(str, str5, false)) {
                return;
            }
        }
        kac.f("unexpected journal line: ".concat(str));
    }

    public final synchronized void Q() {
        kt1 kt1Var;
        try {
            hkn hknVar = this.g;
            if (hknVar != null) {
                hknVar.close();
            }
            File file = this.d;
            file.getClass();
            try {
                Logger logger = epj.a;
                kt1Var = new kt1(new FileOutputStream(file, false), new vis());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = epj.a;
                kt1Var = new kt1(new FileOutputStream(file, false), new vis());
            }
            hkn hknVar2 = new hkn(kt1Var);
            try {
                hknVar2.M("libcore.io.DiskLruCache");
                hknVar2.writeByte(10);
                hknVar2.M("1");
                hknVar2.writeByte(10);
                hknVar2.c0(201105);
                hknVar2.writeByte(10);
                hknVar2.c0(2);
                hknVar2.writeByte(10);
                hknVar2.writeByte(10);
                for (d78 d78Var : this.h.values()) {
                    if (d78Var.g != null) {
                        hknVar2.M(u);
                        hknVar2.writeByte(32);
                        hknVar2.M(d78Var.a);
                        hknVar2.writeByte(10);
                    } else {
                        hknVar2.M(t);
                        hknVar2.writeByte(32);
                        hknVar2.M(d78Var.a);
                        for (long j : d78Var.b) {
                            hknVar2.writeByte(32);
                            hknVar2.c0(j);
                        }
                        hknVar2.writeByte(10);
                    }
                }
                hknVar2.close();
                e88 e88Var = e88.d;
                if (e88Var.w(this.c)) {
                    e88Var.z(this.c, this.e);
                }
                e88Var.z(this.d, this.c);
                e88Var.s(this.e);
                this.g = H();
                this.j = false;
                this.o = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void R(d78 d78Var) {
        hkn hknVar;
        String str = d78Var.a;
        if (!this.k) {
            if (d78Var.h > 0 && (hknVar = this.g) != null) {
                hknVar.M(u);
                hknVar.writeByte(32);
                hknVar.M(str);
                hknVar.writeByte(10);
                hknVar.flush();
            }
            if (d78Var.h > 0 || d78Var.g != null) {
                d78Var.f = true;
                return;
            }
        }
        z0j z0jVar = d78Var.g;
        if (z0jVar != null) {
            z0jVar.L();
        }
        for (int i = 0; i < 2; i++) {
            File file = (File) d78Var.c.get(i);
            file.getClass();
            if (!file.delete() && file.exists()) {
                tiu.j(file, "failed to delete ");
                return;
            }
            long j = this.f;
            long[] jArr = d78Var.b;
            this.f = j - jArr[i];
            jArr[i] = 0;
        }
        this.i++;
        hkn hknVar2 = this.g;
        if (hknVar2 != null) {
            hknVar2.M(v);
            hknVar2.writeByte(32);
            hknVar2.M(str);
            hknVar2.writeByte(10);
        }
        this.h.remove(str);
        if (D()) {
            this.q.c(this.r, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        R(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        while (this.f > this.b) {
            for (d78 d78Var : this.h.values()) {
                if (!d78Var.f) {
                    break;
                }
            }
            return;
        }
        this.n = false;
    }

    public final synchronized void a() {
        if (this.m) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void b(z0j z0jVar, boolean z) {
        d78 d78Var = (d78) z0jVar.c;
        if (!Intrinsics.d(d78Var.g, z0jVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !d78Var.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) z0jVar.d;
                zArr.getClass();
                if (!zArr[i]) {
                    z0jVar.l();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                File file = (File) d78Var.d.get(i);
                file.getClass();
                if (!file.exists()) {
                    z0jVar.l();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file2 = (File) d78Var.d.get(i2);
            if (!z || d78Var.f) {
                file2.getClass();
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                e88 e88Var = e88.d;
                if (e88Var.w(file2)) {
                    File file3 = (File) d78Var.c.get(i2);
                    e88Var.z(file2, file3);
                    long j = d78Var.b[i2];
                    long length = file3.length();
                    d78Var.b[i2] = length;
                    this.f = (this.f - j) + length;
                }
            }
        }
        d78Var.g = null;
        if (d78Var.f) {
            R(d78Var);
            return;
        }
        this.i++;
        hkn hknVar = this.g;
        hknVar.getClass();
        if (!d78Var.e && !z) {
            this.h.remove(d78Var.a);
            hknVar.M(v);
            hknVar.writeByte(32);
            hknVar.M(d78Var.a);
            hknVar.writeByte(10);
            hknVar.flush();
            if (this.f <= this.b || D()) {
                this.q.c(this.r, 0L);
            }
        }
        d78Var.e = true;
        hknVar.M(t);
        hknVar.writeByte(32);
        hknVar.M(d78Var.a);
        for (long j2 : d78Var.b) {
            hknVar.writeByte(32);
            hknVar.c0(j2);
        }
        hknVar.writeByte(10);
        if (z) {
            long j3 = this.p;
            this.p = 1 + j3;
            d78Var.i = j3;
        }
        hknVar.flush();
        if (this.f <= this.b) {
        }
        this.q.c(this.r, 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l && !this.m) {
                Collection values = this.h.values();
                values.getClass();
                for (d78 d78Var : (d78[]) values.toArray(new d78[0])) {
                    z0j z0jVar = d78Var.g;
                    if (z0jVar != null) {
                        z0jVar.L();
                    }
                }
                S();
                hkn hknVar = this.g;
                hknVar.getClass();
                hknVar.close();
                this.g = null;
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
            a();
            S();
            hkn hknVar = this.g;
            hknVar.getClass();
            hknVar.flush();
        }
    }

    public final synchronized z0j g(long j, String str) {
        str.getClass();
        z();
        a();
        X(str);
        d78 d78Var = (d78) this.h.get(str);
        if (j != -1 && (d78Var == null || d78Var.i != j)) {
            return null;
        }
        if ((d78Var != null ? d78Var.g : null) != null) {
            return null;
        }
        if (d78Var != null && d78Var.h != 0) {
            return null;
        }
        if (!this.n && !this.o) {
            hkn hknVar = this.g;
            hknVar.getClass();
            hknVar.M(u);
            hknVar.writeByte(32);
            hknVar.M(str);
            hknVar.writeByte(10);
            hknVar.flush();
            if (this.j) {
                return null;
            }
            if (d78Var == null) {
                d78Var = new d78(this, str);
                this.h.put(str, d78Var);
            }
            z0j z0jVar = new z0j(this, d78Var);
            d78Var.g = z0jVar;
            return z0jVar;
        }
        this.q.c(this.r, 0L);
        return null;
    }

    public final synchronized f78 o(String str) {
        str.getClass();
        z();
        a();
        X(str);
        d78 d78Var = (d78) this.h.get(str);
        if (d78Var == null) {
            return null;
        }
        f78 a = d78Var.a();
        if (a == null) {
            return null;
        }
        this.i++;
        hkn hknVar = this.g;
        hknVar.getClass();
        hknVar.M(w);
        hknVar.writeByte(32);
        hknVar.M(str);
        hknVar.writeByte(10);
        if (D()) {
            this.q.c(this.r, 0L);
        }
        return a;
    }

    public final synchronized void z() {
        boolean z;
        try {
            byte[] bArr = cvt.a;
            if (this.l) {
                return;
            }
            e88 e88Var = e88.d;
            if (e88Var.w(this.e)) {
                boolean w2 = e88Var.w(this.c);
                File file = this.e;
                if (w2) {
                    e88Var.s(file);
                } else {
                    e88Var.z(file, this.c);
                }
            }
            File file2 = this.e;
            file2.getClass();
            kt1 B = e88Var.B(file2);
            try {
                try {
                    e88Var.s(file2);
                    B.close();
                    z = true;
                } catch (IOException unused) {
                    B.close();
                    e88Var.s(file2);
                    z = false;
                }
                this.k = z;
                File file3 = this.c;
                file3.getClass();
                if (file3.exists()) {
                    try {
                        N();
                        I();
                        this.l = true;
                        return;
                    } catch (IOException e) {
                        otk otkVar = otk.a;
                        otk otkVar2 = otk.a;
                        String str = "DiskLruCache " + this.a + " is corrupt: " + e.getMessage() + ", removing";
                        otkVar2.getClass();
                        otk.i(5, str, e);
                        try {
                            close();
                            e88.d.v(this.a);
                            this.m = false;
                        } catch (Throwable th) {
                            this.m = false;
                            throw th;
                        }
                    }
                }
                Q();
                this.l = true;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
