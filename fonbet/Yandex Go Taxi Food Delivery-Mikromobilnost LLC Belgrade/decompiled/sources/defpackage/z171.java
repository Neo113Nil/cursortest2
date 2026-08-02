package defpackage;

import android.os.ConditionVariable;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.m30;
import yads.wm0;
import yads.wq;
import yads.y31;

/* loaded from: classes7.dex */
public final class z171 implements l291 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final r371 b;
    public final vmn0 c;
    public final ymu d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public wq i;

    public z171(File file, r371 r371Var, wm0 wm0Var) {
        boolean add;
        vmn0 vmn0Var = new vmn0(wm0Var, file);
        ymu ymuVar = new ymu(wm0Var);
        synchronized (z171.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (!add) {
            ny61.r(g8e.n(file, "Another SimpleCache instance uses the folder: "));
            throw null;
        }
        this.a = file;
        this.b = r371Var;
        this.c = vmn0Var;
        this.d = ymuVar;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new cbv(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void e(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        nba1.c("SimpleCache", str);
        throw new wq(str);
    }

    public final synchronized long a(long j2, long j3, String str) {
        long j4;
        long j5 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        long j6 = j3 == -1 ? Long.MAX_VALUE : j3 + j2;
        if (j6 >= 0) {
            j5 = j6;
        }
        j4 = 0;
        while (j2 < j5) {
            long i = i(j2, j5 - j2, str);
            if (i > 0) {
                j4 += i;
            } else {
                i = -i;
            }
            j2 += i;
        }
        return j4;
    }

    public final synchronized TreeSet b(String str) {
        TreeSet treeSet;
        try {
            hg81 hg81Var = (hg81) ((HashMap) this.c.a).get(str);
            if (hg81Var != null && !hg81Var.c.isEmpty()) {
                treeSet = new TreeSet((Collection) hg81Var.c);
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    public final synchronized void c() {
        wq wqVar = this.i;
        if (wqVar != null) {
            throw wqVar;
        }
    }

    public final void d(c871 c871Var) {
        String str = c871Var.a;
        long j2 = c871Var.c;
        this.c.e(str).c.add(c871Var);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                r371 r371Var = (r371) arrayList.get(size);
                r371Var.b.add(c871Var);
                r371Var.c += j2;
                r371Var.a(this, 0L);
            }
        }
        r371 r371Var2 = this.b;
        r371Var2.b.add(c871Var);
        r371Var2.c += j2;
        r371Var2.a(this, 0L);
    }

    public final void f(File file, boolean z, File[] fileArr, HashMap hashMap) {
        long j2;
        long j3;
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
                f(file2, false, file2.listFiles(), hashMap);
            } else if (!z || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                t471 t471Var = hashMap != null ? (t471) hashMap.remove(name) : null;
                if (t471Var != null) {
                    j2 = t471Var.a;
                    j3 = t471Var.b;
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                }
                c871 a = c871.a(file2, j2, j3, this.c);
                if (a != null) {
                    d(a);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void g(String str, g871 g871Var) {
        wq wqVar;
        c();
        vmn0 vmn0Var = this.c;
        hg81 e = vmn0Var.e(str);
        g581 g581Var = e.e;
        g581 b = g581Var.b(g871Var);
        e.e = b;
        if (!b.equals(g581Var)) {
            ((SparseArray) ((m2v) vmn0Var.x).b).put(e.a, e);
        }
        try {
            this.c.f();
        } finally {
        }
    }

    public final void h(c871 c871Var) {
        String str = c871Var.a;
        long j2 = c871Var.c;
        File file = c871Var.x;
        vmn0 vmn0Var = this.c;
        hg81 hg81Var = (hg81) ((HashMap) vmn0Var.a).get(str);
        if (hg81Var == null || !hg81Var.c.remove(c871Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        ymu ymuVar = this.d;
        if (ymuVar != null) {
            String name = file.getName();
            try {
                ((String) ymuVar.c).getClass();
                try {
                    ((wm0) ymuVar.b).getWritableDatabase().delete((String) ymuVar.c, "name = ?", new String[]{name});
                } catch (Throwable th) {
                    throw new m30(th);
                }
            } catch (IOException unused) {
                nba1.e();
            }
        }
        vmn0Var.k(hg81Var.b);
        ArrayList arrayList = (ArrayList) this.e.get(c871Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                r371 r371Var = (r371) arrayList.get(size);
                r371Var.b.remove(c871Var);
                r371Var.c -= j2;
            }
        }
        r371 r371Var2 = this.b;
        r371Var2.b.remove(c871Var);
        r371Var2.c -= j2;
    }

    public final synchronized long i(long j2, long j3, String str) {
        hg81 hg81Var;
        if (j3 == -1) {
            j3 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        hg81Var = (hg81) ((HashMap) this.c.a).get(str);
        return hg81Var != null ? hg81Var.a(j2, j3) : -j3;
    }

    public final synchronized g581 j(String str) {
        hg81 hg81Var;
        try {
            hg81Var = (hg81) ((HashMap) this.c.a).get(str);
        } catch (Throwable th) {
            throw th;
        }
        return hg81Var != null ? hg81Var.e : g581.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
    
        if (r1.i() == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j2;
        y31 l;
        vmn0 vmn0Var = this.c;
        File file = this.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (wq e) {
                this.i = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            nba1.c("SimpleCache", str);
            this.i = new wq(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file2 = listFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    nba1.c("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        this.h = j2;
        if (j2 == -1) {
            try {
                long nextLong = new SecureRandom().nextLong();
                long j3 = 0;
                long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
                File file3 = new File(file, b64.j(Long.toString(abs, 16), ".uid"));
                if (file3.createNewFile()) {
                    j3 = abs;
                } else {
                    ny61.v(g8e.n(file3, "Failed to create UID file: "));
                }
                this.h = j3;
            } catch (IOException e2) {
                String n = g8e.n(file, "Failed to create cache UID: ");
                nba1.c("SimpleCache", nba1.b(n, e2));
                this.i = new wq(n, e2);
                return;
            }
        }
        try {
            vmn0Var.g(this.h);
            ymu ymuVar = this.d;
            if (ymuVar != null) {
                ymuVar.f(this.h);
                HashMap e3 = ymuVar.e();
                f(file, true, listFiles, e3);
                ymuVar.h(e3.keySet());
            } else {
                f(file, true, listFiles, null);
            }
            Set keySet = ((HashMap) vmn0Var.a).keySet();
            int i2 = y31.c;
            if ((keySet instanceof y31) && !(keySet instanceof SortedSet)) {
                l = (y31) keySet;
            }
            Object[] array = keySet.toArray();
            l = y31.l(array.length, array);
            wr71 it = l.iterator();
            while (it.hasNext()) {
                vmn0Var.k((String) it.next());
            }
            try {
                vmn0Var.f();
            } catch (Throwable th) {
                nba1.c("SimpleCache", nba1.b("Storing index file failed", th));
            }
        } catch (Throwable th2) {
            String n2 = g8e.n(file, "Failed to initialize cache indices: ");
            nba1.c("SimpleCache", nba1.b(n2, th2));
            this.i = new wq(n2, th2);
        }
    }

    public final synchronized void l(c871 c871Var) {
        vmn0 vmn0Var = this.c;
        hg81 hg81Var = (hg81) ((HashMap) vmn0Var.a).get(c871Var.a);
        hg81Var.getClass();
        long j2 = c871Var.b;
        for (int i = 0; i < hg81Var.d.size(); i++) {
            if (((hd81) hg81Var.d.get(i)).a == j2) {
                hg81Var.d.remove(i);
                this.c.k(hg81Var.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0188, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, IOException -> 0x0068, blocks: (B:4:0x0005, B:6:0x0016, B:7:0x0045, B:9:0x004a, B:15:0x0050, B:43:0x0064, B:19:0x006d, B:21:0x0081, B:23:0x0088, B:26:0x00cf, B:28:0x00d3, B:30:0x00f6, B:32:0x00fd, B:34:0x0121, B:36:0x0141, B:37:0x0146, B:38:0x00c4, B:40:0x0147, B:41:0x014c, B:45:0x0068, B:46:0x014d, B:47:0x0155, B:50:0x015f, B:52:0x016d, B:71:0x018a, B:75:0x002d, B:77:0x0035, B:79:0x0041), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141 A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #1 {all -> 0x0026, IOException -> 0x0068, blocks: (B:4:0x0005, B:6:0x0016, B:7:0x0045, B:9:0x004a, B:15:0x0050, B:43:0x0064, B:19:0x006d, B:21:0x0081, B:23:0x0088, B:26:0x00cf, B:28:0x00d3, B:30:0x00f6, B:32:0x00fd, B:34:0x0121, B:36:0x0141, B:37:0x0146, B:38:0x00c4, B:40:0x0147, B:41:0x014c, B:45:0x0068, B:46:0x014d, B:47:0x0155, B:50:0x015f, B:52:0x016d, B:71:0x018a, B:75:0x002d, B:77:0x0035, B:79:0x0041), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized c871 m(long j2, long j3, String str) {
        long j4;
        c871 b;
        int i;
        File file;
        try {
            c();
            hg81 hg81Var = (hg81) ((HashMap) this.c.a).get(str);
            if (hg81Var != null) {
                j4 = j2;
                while (true) {
                    b = hg81Var.b(j4, j3);
                    if (!b.w || b.x.length() == b.c) {
                        break;
                    }
                    n();
                }
            } else {
                j4 = j2;
                b = new c871(str, j4, j3, -9223372036854775807L, null);
            }
            i = 0;
        } catch (IOException unused) {
            nba1.e();
        } finally {
        }
        if (b.w) {
            if (this.g) {
                File file2 = b.x;
                file2.getClass();
                String name = file2.getName();
                long j5 = b.c;
                long currentTimeMillis = System.currentTimeMillis();
                ymu ymuVar = this.d;
                if (ymuVar != null) {
                    ymuVar.g(j5, currentTimeMillis, name);
                } else {
                    i = 1;
                }
                hg81 hg81Var2 = (hg81) ((HashMap) this.c.a).get(str);
                if (!hg81Var2.c.remove(b)) {
                    throw new IllegalStateException();
                }
                File file3 = b.x;
                file3.getClass();
                if (i != 0) {
                    File parentFile = file3.getParentFile();
                    parentFile.getClass();
                    long j6 = b.b;
                    int i2 = hg81Var2.a;
                    Pattern pattern = c871.z;
                    File file4 = new File(parentFile, i2 + Extension.DOT_CHAR + j6 + Extension.DOT_CHAR + currentTimeMillis + ".v3.exo");
                    if (file3.renameTo(file4)) {
                        file = file4;
                        if (b.w) {
                            throw new IllegalStateException();
                        }
                        c871 c871Var = new c871(b.a, b.b, b.c, currentTimeMillis, file);
                        hg81Var2.c.add(c871Var);
                        ArrayList arrayList = (ArrayList) this.e.get(b.a);
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                r371 r371Var = (r371) arrayList.get(size);
                                r371Var.b.remove(b);
                                r371Var.c -= b.c;
                                r371Var.b.add(c871Var);
                                r371Var.c += c871Var.c;
                                r371Var.a(this, 0L);
                            }
                        }
                        r371 r371Var2 = this.b;
                        r371Var2.b.remove(b);
                        r371Var2.c -= b.c;
                        r371Var2.b.add(c871Var);
                        r371Var2.c += c871Var.c;
                        r371Var2.a(this, 0L);
                        b = c871Var;
                    } else {
                        file3.toString();
                        file4.toString();
                        nba1.e();
                    }
                }
                file = file3;
                if (b.w) {
                }
            }
            return b;
        }
        hg81 e = this.c.e(str);
        long j7 = b.c;
        while (true) {
            int size2 = e.d.size();
            ArrayList arrayList2 = e.d;
            if (i >= size2) {
                arrayList2.add(new hd81(j4, j7));
                return b;
            }
            hd81 hd81Var = (hd81) arrayList2.get(i);
            long j8 = hd81Var.a;
            if (j8 > j4) {
                if (j7 == -1 || j4 + j7 > j8) {
                    break;
                }
                i++;
            } else {
                long j9 = hd81Var.b;
                if (j9 == -1 || j8 + j9 > j4) {
                    break;
                }
                i++;
            }
        }
    }

    public final void n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((hg81) it.next()).c.iterator();
            while (it2.hasNext()) {
                c871 c871Var = (c871) it2.next();
                if (c871Var.x.length() != c871Var.c) {
                    arrayList.add(c871Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            h((c871) arrayList.get(i));
        }
    }

    public final synchronized void o(String str) {
        Iterator it = b(str).iterator();
        while (it.hasNext()) {
            h((c871) it.next());
        }
    }
}
