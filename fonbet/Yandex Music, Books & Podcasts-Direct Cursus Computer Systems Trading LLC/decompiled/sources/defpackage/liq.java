package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class liq implements so3 {
    public static final HashSet k = new HashSet();
    public final File a;
    public final rp3 b;
    public final rdk c;
    public final le3 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public oo3 j;

    public liq(File file, rp3 rp3Var, kc7 kc7Var, boolean z) {
        le3 le3Var;
        boolean add;
        rdk rdkVar = new rdk(kc7Var, file, z);
        if (kc7Var == null || z) {
            le3Var = null;
        } else {
            le3Var = new le3();
            le3Var.a = kc7Var;
        }
        synchronized (liq.class) {
            add = k.add(file.getAbsoluteFile());
        }
        if (!add) {
            b6e.u(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.a = file;
        this.b = rp3Var;
        this.c = rdkVar;
        this.d = le3Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = rp3Var.c();
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new kiq(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void m(liq liqVar) {
        long j;
        le3 le3Var = liqVar.d;
        rdk rdkVar = liqVar.c;
        File file = liqVar.a;
        if (!file.exists()) {
            try {
                p(file);
            } catch (oo3 e) {
                liqVar.j = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            vq1.K("SimpleCache", str);
            liqVar.j = new oo3(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = listFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    vq1.K("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        liqVar.h = j;
        if (j == -1) {
            try {
                long nextLong = new SecureRandom().nextLong();
                long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
                File file3 = new File(file, ouj.n(Long.toString(abs, 16), ".uid"));
                if (!file3.createNewFile()) {
                    tiu.j(file3, "Failed to create UID file: ");
                    abs = 0;
                }
                liqVar.h = abs;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                vq1.L("SimpleCache", str2, e2);
                liqVar.j = new oo3(str2, e2);
                return;
            }
        }
        try {
            rdkVar.J(liqVar.h);
            if (le3Var != null) {
                le3Var.f(liqVar.h);
                HashMap d = le3Var.d();
                liqVar.r(file, true, listFiles, d);
                le3Var.k(d.keySet());
            } else {
                liqVar.r(file, true, listFiles, null);
            }
            xkt it = hee.v(((HashMap) rdkVar.b).keySet()).iterator();
            while (it.hasNext()) {
                rdkVar.M((String) it.next());
            }
            try {
                rdkVar.X();
            } catch (IOException e3) {
                vq1.L("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            vq1.L("SimpleCache", str3, e4);
            liqVar.j = new oo3(str3, e4);
        }
    }

    public static void p(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        vq1.K("SimpleCache", str);
        throw new oo3(str);
    }

    @Override // defpackage.so3
    public final synchronized qc6 a(String str) {
        sq3 z;
        vq1.A(!false);
        z = this.c.z(str);
        return z != null ? z.e : tk7.c;
    }

    @Override // defpackage.so3
    public final synchronized void b(jq3 jq3Var) {
        vq1.A(!false);
        sq3 z = this.c.z(jq3Var.a);
        z.getClass();
        long j = jq3Var.b;
        ArrayList arrayList = z.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((rq3) arrayList.get(i)).a == j) {
                arrayList.remove(i);
                this.c.M(z.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.so3
    public final synchronized Set c() {
        vq1.A(!false);
        return new HashSet(((HashMap) this.c.b).keySet());
    }

    @Override // defpackage.so3
    public final synchronized long d() {
        vq1.A(!false);
        return this.i;
    }

    @Override // defpackage.so3
    public final synchronized long e(long j, long j2, String str) {
        sq3 z;
        vq1.A(!false);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        z = this.c.z(str);
        return z != null ? z.a(j, j2) : -j2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:? -> B:13:0x001d). Please report as a decompilation issue!!! */
    @Override // defpackage.so3
    public final synchronized jq3 f(long j, long j2, String str) {
        try {
            vq1.A(!false);
            o();
            while (true) {
                jq3 g = g(j, j2, str);
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                if (g != null) {
                    return g;
                }
                try {
                    wait();
                    j = j4;
                    j2 = j3;
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.so3
    public final synchronized jq3 g(long j, long j2, String str) {
        long j3;
        miq b;
        int i;
        vq1.A(!false);
        o();
        sq3 z = this.c.z(str);
        if (z != null) {
            j3 = j;
            while (true) {
                b = z.b(j3, j2);
                if (!b.d) {
                    break;
                }
                File file = b.e;
                file.getClass();
                if (file.length() == b.c) {
                    break;
                }
                u();
            }
        } else {
            j3 = j;
            b = new miq(str, j3, j2, -9223372036854775807L, null);
        }
        if (b.d) {
            return v(str, b);
        }
        sq3 E = this.c.E(str);
        long j4 = b.c;
        ArrayList arrayList = E.d;
        while (i < arrayList.size()) {
            rq3 rq3Var = (rq3) arrayList.get(i);
            long j5 = rq3Var.a;
            if (j5 <= j3) {
                long j6 = rq3Var.b;
                i = (j6 != -1 && j5 + j6 <= j3) ? i + 1 : 0;
                return null;
            }
            if (j4 != -1 && j3 + j4 <= j5) {
            }
            return null;
        }
        arrayList.add(new rq3(j3, j4));
        return b;
    }

    @Override // defpackage.so3
    public final synchronized long h(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long e = e(j6, j5 - j6, str);
            if (e > 0) {
                j3 += e;
            } else {
                e = -e;
            }
            j6 += e;
        }
        return j3;
    }

    @Override // defpackage.so3
    public final synchronized File i(long j, long j2, String str) {
        sq3 z;
        File file;
        try {
            vq1.A(!false);
            o();
            z = this.c.z(str);
            z.getClass();
            vq1.A(z.c(j, j2));
            if (!this.a.exists()) {
                p(this.a);
                u();
            }
            this.b.d(this, str, j2);
            file = new File(this.a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                p(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return miq.c(file, z.a, j, System.currentTimeMillis());
    }

    @Override // defpackage.so3
    public final synchronized void j(File file, long j) {
        boolean z = true;
        vq1.A(!false);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            miq b = miq.b(file, j, -9223372036854775807L, this.c);
            b.getClass();
            sq3 z2 = this.c.z(b.a);
            z2.getClass();
            vq1.A(z2.c(b.b, b.c));
            long a = qc6.a(z2.e);
            if (a != -1) {
                if (b.b + b.c > a) {
                    z = false;
                }
                vq1.A(z);
            }
            if (this.d != null) {
                try {
                    this.d.m(b.c, b.f, file.getName());
                } catch (IOException e) {
                    throw new oo3(e);
                }
            }
            n(b);
            try {
                this.c.X();
                notifyAll();
            } catch (IOException e2) {
                throw new oo3(e2);
            }
        }
    }

    @Override // defpackage.so3
    public final synchronized void k(String str) {
        vq1.A(!false);
        Iterator it = q(str).iterator();
        while (it.hasNext()) {
            t((jq3) it.next());
        }
    }

    @Override // defpackage.so3
    public final synchronized void l(String str, rc6 rc6Var) {
        vq1.A(!false);
        o();
        rdk rdkVar = this.c;
        sq3 E = rdkVar.E(str);
        tk7 tk7Var = E.e;
        tk7 c = tk7Var.c(rc6Var);
        E.e = c;
        if (!c.equals(tk7Var)) {
            ((tq3) rdkVar.f).b(E);
        }
        try {
            this.c.X();
        } catch (IOException e) {
            throw new oo3(e);
        }
    }

    public final void n(miq miqVar) {
        String str = miqVar.a;
        this.c.E(str).c.add(miqVar);
        this.i += miqVar.c;
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((rp3) arrayList.get(size)).a(this, miqVar);
            }
        }
        this.b.a(this, miqVar);
    }

    public final synchronized void o() {
        oo3 oo3Var = this.j;
        if (oo3Var != null) {
            throw oo3Var;
        }
    }

    public final synchronized NavigableSet q(String str) {
        TreeSet treeSet;
        try {
            vq1.A(!false);
            sq3 z = this.c.z(str);
            if (z != null && !z.c.isEmpty()) {
                treeSet = new TreeSet((Collection) z.c);
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    public final void r(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                r(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                sp3 sp3Var = map != null ? (sp3) map.remove(name) : null;
                if (sp3Var != null) {
                    j = sp3Var.a;
                    j2 = sp3Var.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                miq b = miq.b(file2, j, j2, this.c);
                if (b != null) {
                    n(b);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void s(jq3 jq3Var) {
        vq1.A(!false);
        t(jq3Var);
    }

    public final void t(jq3 jq3Var) {
        String str = jq3Var.a;
        File file = jq3Var.e;
        rdk rdkVar = this.c;
        sq3 z = rdkVar.z(str);
        if (z == null || !z.c.remove(jq3Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        this.i -= jq3Var.c;
        le3 le3Var = this.d;
        if (le3Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) le3Var.b).getClass();
                try {
                    ((kc7) le3Var.a).getWritableDatabase().delete((String) le3Var.b, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new pg5(e);
                }
            } catch (IOException unused) {
                vz1.C("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        rdkVar.M(z.b);
        ArrayList arrayList = (ArrayList) this.e.get(jq3Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((rp3) arrayList.get(size)).e(this, jq3Var);
            }
        }
        this.b.e(this, jq3Var);
    }

    public final void u() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.b).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((sq3) it.next()).c.iterator();
            while (it2.hasNext()) {
                jq3 jq3Var = (jq3) it2.next();
                File file = jq3Var.e;
                file.getClass();
                if (file.length() != jq3Var.c) {
                    arrayList.add(jq3Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            t((jq3) arrayList.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final miq v(String str, miq miqVar) {
        boolean z;
        File file;
        ArrayList arrayList;
        File file2 = miqVar.e;
        if (!this.g) {
            return miqVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j = miqVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        le3 le3Var = this.d;
        if (le3Var != null) {
            try {
                le3Var.m(j, currentTimeMillis, name);
            } catch (IOException unused) {
                currentTimeMillis = currentTimeMillis;
                vq1.n0("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        sq3 z2 = this.c.z(str);
        z2.getClass();
        TreeSet treeSet = z2.c;
        vq1.A(treeSet.remove(miqVar));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File c = miq.c(parentFile, z2.a, miqVar.b, currentTimeMillis);
            if (file2.renameTo(c)) {
                file = c;
                vq1.A(miqVar.d);
                miq miqVar2 = new miq(miqVar.a, miqVar.b, miqVar.c, currentTimeMillis, file);
                treeSet.add(miqVar2);
                arrayList = (ArrayList) this.e.get(miqVar.a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((rp3) arrayList.get(size)).b(this, miqVar, miqVar2);
                    }
                }
                this.b.b(this, miqVar, miqVar2);
                return miqVar2;
            }
            vq1.n0("CachedContent", "Failed to rename " + file2 + " to " + c);
        }
        file = file2;
        vq1.A(miqVar.d);
        miq miqVar22 = new miq(miqVar.a, miqVar.b, miqVar.c, currentTimeMillis, file);
        treeSet.add(miqVar22);
        arrayList = (ArrayList) this.e.get(miqVar.a);
        if (arrayList != null) {
        }
        this.b.b(this, miqVar, miqVar22);
        return miqVar22;
    }
}
