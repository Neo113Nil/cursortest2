package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.experiments.storage.a;

/* loaded from: classes9.dex */
public final class wku0 {
    public final gku0 a;
    public final r8h b;
    public final h3y c;
    public final wnt d;
    public final a e;
    public final LinkedHashMap f;
    public volatile long g;
    public final ReentrantReadWriteLock h;

    public wku0(gku0 gku0Var, r8h r8hVar, h3y h3yVar, wnt wntVar, a aVar) {
        this.a = gku0Var;
        this.b = r8hVar;
        this.c = h3yVar;
        this.d = wntVar;
        this.e = aVar;
        k4o a = ExperimentSource.a();
        int d = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : a) {
            linkedHashMap.put(obj, new vku0());
        }
        this.f = linkedHashMap;
        this.g = Long.MIN_VALUE;
        this.h = new ReentrantReadWriteLock();
    }

    public static void c(vku0 vku0Var, Collection collection) {
        ReentrantReadWriteLock.WriteLock writeLock = vku0Var.a().writeLock();
        writeLock.lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                uku0 uku0Var = (uku0) it.next();
                if (vku0Var.b().get(uku0Var.a) == uku0Var) {
                    uku0Var.e = false;
                }
            }
        } finally {
            writeLock.unlock();
        }
    }

    public static bku0 i(uku0 uku0Var, ExperimentSource experimentSource) {
        return new bku0(experimentSource.getValue(), uku0Var.a, uku0Var.b, uku0Var.c, uku0Var.d);
    }

    public static List j(LinkedHashMap linkedHashMap, Collection collection, long j) {
        if (collection.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            uku0 uku0Var = (uku0) linkedHashMap.get(str);
            if (uku0Var != null) {
                uku0 uku0Var2 = new uku0(uku0Var.a, uku0Var.b, uku0Var.c, j, true, uku0Var.f, uku0Var.g);
                linkedHashMap.put(str, uku0Var2);
                arrayList.add(uku0Var2);
            }
        }
        return arrayList;
    }

    public final List a(ExperimentSource experimentSource, boolean z) {
        if (!z) {
            vku0 h = h(experimentSource);
            h.a().readLock().lock();
            try {
                return b(h);
            } finally {
            }
        }
        vku0 h2 = h(experimentSource);
        h2.a().readLock().lock();
        try {
            if (!h2.d()) {
                synchronized (h2.c()) {
                    h2.a().readLock().lock();
                    try {
                        if (!h2.d()) {
                            List<bku0> c = this.a.c(d(), experimentSource.getValue());
                            ReentrantReadWriteLock.WriteLock writeLock = h2.a().writeLock();
                            writeLock.lock();
                            try {
                                if (!h2.d()) {
                                    for (bku0 bku0Var : c) {
                                        if (!h2.f().contains(bku0Var.b) && bku0Var.e > this.g) {
                                            String str = bku0Var.c;
                                            if (str == null) {
                                                str = "";
                                            }
                                            String str2 = str;
                                            uku0 uku0Var = (uku0) h2.b().get(bku0Var.b);
                                            if (uku0Var == null) {
                                                LinkedHashMap b = h2.b();
                                                String str3 = bku0Var.b;
                                                b.put(str3, new uku0(str3, str2, bku0Var.d, bku0Var.e, false, (b) null, 96));
                                            } else if (jl40.l(uku0Var.b, str2) && jl40.l(uku0Var.c, bku0Var.d) && uku0Var.d < bku0Var.e) {
                                                h2.b().put(bku0Var.b, new uku0(uku0Var.a, uku0Var.b, uku0Var.c, bku0Var.e, uku0Var.e, uku0Var.f, uku0Var.g));
                                            }
                                        }
                                    }
                                    h2.g();
                                    h2.f().clear();
                                }
                                writeLock.unlock();
                            } catch (Throwable th) {
                                writeLock.unlock();
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            vku0 h3 = h(experimentSource);
            h3.a().readLock().lock();
            try {
                return b(h3);
            } finally {
            }
        } finally {
        }
    }

    public final List b(vku0 vku0Var) {
        return kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(1, vku0Var.b().values()), new zk6(d(), 5)), new ceu0(2)));
    }

    public final long d() {
        this.b.getClass();
        return System.currentTimeMillis() - 2592000000L;
    }

    public final List e(LinkedHashMap linkedHashMap, ArrayList arrayList, long j) {
        if (arrayList.isEmpty()) {
            return EmptyList.a;
        }
        long d = d();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            uku0 uku0Var = (uku0) linkedHashMap.get((String) obj);
            if (uku0Var != null) {
                long j2 = uku0Var.d;
                if (j2 <= d || j - j2 >= 86400000) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (defpackage.jl40.l(r6.b, r8) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:3:0x000b, B:12:0x0028, B:14:0x002e, B:18:0x0019), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uku0 f(vku0 vku0Var, String str, String str2) {
        ReentrantReadWriteLock.ReadLock readLock = vku0Var.a().readLock();
        readLock.lock();
        try {
            uku0 uku0Var = (uku0) vku0Var.b().get(str);
            uku0 uku0Var2 = null;
            if (uku0Var != null && uku0Var.d > d()) {
                if (uku0Var != null) {
                    if (str2.length() > 0) {
                    }
                    uku0Var2 = uku0Var;
                }
                return uku0Var2;
            }
            uku0Var = null;
            if (uku0Var != null) {
            }
            return uku0Var2;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0236 A[Catch: all -> 0x0247, TRY_LEAVE, TryCatch #2 {all -> 0x0247, blocks: (B:62:0x0250, B:63:0x0253, B:93:0x0231, B:95:0x0236), top: B:19:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(ExperimentSource experimentSource, Collection collection) {
        vku0 h;
        ReentrantReadWriteLock.WriteLock writeLock;
        oo2 oo2Var;
        ArrayList arrayList;
        ReentrantReadWriteLock.ReadLock readLock;
        boolean l;
        boolean l2;
        if (collection.isEmpty()) {
            return;
        }
        ReentrantReadWriteLock.ReadLock readLock2 = this.h.readLock();
        readLock2.lock();
        try {
            h = h(experimentSource);
        } catch (Throwable th) {
            th = th;
        }
        try {
            synchronized (h.e()) {
                try {
                    Collection collection2 = collection;
                    int d = gw00.d(tcc.n(collection2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj : collection2) {
                        linkedHashMap.put(((fku0) obj).a, obj);
                    }
                    try {
                        this.b.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        ReentrantReadWriteLock.WriteLock writeLock2 = h.a().writeLock();
                        writeLock2.lock();
                        try {
                            LinkedHashMap b = h.b();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                                fku0 fku0Var = (fku0) it.next();
                                h.f().remove(fku0Var.a);
                                uku0 uku0Var = (uku0) b.get(fku0Var.a);
                                if (uku0Var != null) {
                                    writeLock = writeLock2;
                                    try {
                                        if (jl40.l(uku0Var.b, fku0Var.b)) {
                                            b bVar = uku0Var.f;
                                            if (bVar != null) {
                                                l2 = bVar.equals(fku0Var.c);
                                            } else {
                                                String str = uku0Var.c;
                                                String str2 = fku0Var.d;
                                                if (str2 == null) {
                                                    str2 = fku0Var.c.toString();
                                                    fku0Var.d = str2;
                                                }
                                                l2 = jl40.l(str, str2);
                                            }
                                            if (l2) {
                                                boolean z = uku0Var.e;
                                                if (z) {
                                                    ArrayList arrayList7 = arrayList5;
                                                    vku0 vku0Var = h;
                                                    ArrayList arrayList8 = arrayList6;
                                                    uku0 uku0Var2 = new uku0(uku0Var.a, uku0Var.b, uku0Var.c, currentTimeMillis, z, uku0Var.f, uku0Var.g);
                                                    b.put(fku0Var.a, uku0Var2);
                                                    arrayList2.add(i(uku0Var2, experimentSource));
                                                    arrayList8.add(uku0Var2);
                                                    arrayList5 = arrayList7;
                                                    arrayList6 = arrayList8;
                                                    it = it;
                                                    h = vku0Var;
                                                } else {
                                                    arrayList5.add(fku0Var.a);
                                                }
                                                writeLock2 = writeLock;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        writeLock.unlock();
                                        throw th;
                                    }
                                } else {
                                    writeLock = writeLock2;
                                }
                                vku0 vku0Var2 = h;
                                Iterator it2 = it;
                                ArrayList arrayList9 = arrayList5;
                                ArrayList arrayList10 = arrayList6;
                                if (uku0Var != null) {
                                    b bVar2 = uku0Var.f;
                                    if (bVar2 != null) {
                                        l = bVar2.equals(fku0Var.c);
                                    } else {
                                        String str3 = uku0Var.c;
                                        String str4 = fku0Var.d;
                                        if (str4 == null) {
                                            str4 = fku0Var.c.toString();
                                            fku0Var.d = str4;
                                        }
                                        l = jl40.l(str3, str4);
                                    }
                                    if (l) {
                                        long j = currentTimeMillis;
                                        readLock = readLock2;
                                        try {
                                            currentTimeMillis = j;
                                            arrayList3.add(new bku0(experimentSource.getValue(), fku0Var.a, fku0Var.b, uku0Var.c, j));
                                            arrayList = arrayList3;
                                            uku0 uku0Var3 = new uku0(uku0Var.a, fku0Var.b, uku0Var.c, currentTimeMillis, true, uku0Var.f, uku0Var.g);
                                            b.put(fku0Var.a, uku0Var3);
                                            arrayList10.add(uku0Var3);
                                            arrayList5 = arrayList9;
                                            arrayList6 = arrayList10;
                                            it = it2;
                                            arrayList3 = arrayList;
                                            h = vku0Var2;
                                            readLock2 = readLock;
                                            writeLock2 = writeLock;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            writeLock.unlock();
                                            throw th;
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                                readLock = readLock2;
                                String str5 = fku0Var.d;
                                if (str5 == null) {
                                    str5 = fku0Var.c.toString();
                                    fku0Var.d = str5;
                                }
                                String str6 = str5;
                                long j2 = currentTimeMillis;
                                bku0 bku0Var = new bku0(experimentSource.getValue(), fku0Var.a, fku0Var.b, str6, j2);
                                currentTimeMillis = j2;
                                if (uku0Var != null) {
                                    arrayList4.add(bku0Var);
                                } else {
                                    arrayList2.add(bku0Var);
                                }
                                String str7 = fku0Var.a;
                                uku0 uku0Var4 = new uku0(str7, fku0Var.b, str6, currentTimeMillis, true, fku0Var.c, 64);
                                b.put(str7, uku0Var4);
                                arrayList10.add(uku0Var4);
                                arrayList5 = arrayList9;
                                arrayList6 = arrayList10;
                                it = it2;
                                arrayList3 = arrayList;
                                h = vku0Var2;
                                readLock2 = readLock;
                                writeLock2 = writeLock;
                            }
                            writeLock = writeLock2;
                            vku0 vku0Var3 = h;
                            ArrayList arrayList11 = arrayList3;
                            ReentrantReadWriteLock.ReadLock readLock3 = readLock2;
                            ArrayList arrayList12 = arrayList6;
                            List e = e(b, arrayList5, currentTimeMillis);
                            List j3 = j(b, e, currentTimeMillis);
                            if (arrayList2.isEmpty() && arrayList11.isEmpty() && arrayList4.isEmpty() && e.isEmpty()) {
                                oo2Var = null;
                                writeLock.unlock();
                                if (oo2Var != null) {
                                    this.e.c(new tku0(oo2Var, this, vku0Var3, experimentSource, currentTimeMillis, 0));
                                }
                                readLock3.unlock();
                            }
                            oo2Var = new oo2(arrayList2, arrayList11, arrayList4, j3, arrayList12);
                            writeLock.unlock();
                            if (oo2Var != null) {
                            }
                            readLock3.unlock();
                        } catch (Throwable th4) {
                            th = th4;
                            writeLock = writeLock2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            readLock2.unlock();
            throw th;
        }
    }

    public final vku0 h(ExperimentSource experimentSource) {
        return (vku0) kotlin.collections.b.g(experimentSource, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x0187, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:13:0x0036, B:17:0x0040, B:24:0x0062, B:27:0x0069, B:32:0x00fe, B:67:0x0189, B:68:0x018c, B:73:0x018d, B:74:0x0190, B:29:0x0082, B:35:0x008f, B:40:0x00aa, B:43:0x00b1, B:46:0x00bd, B:49:0x00c5, B:52:0x00ce, B:55:0x00d8, B:59:0x00f5, B:62:0x009c, B:19:0x004b, B:21:0x0055), top: B:12:0x0036, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:29:0x0082, B:35:0x008f, B:40:0x00aa, B:43:0x00b1, B:46:0x00bd, B:49:0x00c5, B:52:0x00ce, B:55:0x00d8, B:59:0x00f5, B:62:0x009c), top: B:28:0x0082, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:29:0x0082, B:35:0x008f, B:40:0x00aa, B:43:0x00b1, B:46:0x00bd, B:49:0x00c5, B:52:0x00ce, B:55:0x00d8, B:59:0x00f5, B:62:0x009c), top: B:28:0x0082, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eku0 k(ExperimentSource experimentSource, String str, String str2, boolean z) {
        Object failure;
        boolean z2;
        uku0 uku0Var;
        vku0 h = h(experimentSource);
        uku0 f = f(h, str, str2);
        if (f == null) {
            if (z) {
                h.a().readLock().lock();
                try {
                    if (!h.f().contains(str)) {
                        synchronized (h.c()) {
                            uku0 f2 = f(h, str, str2);
                            if (f2 != null) {
                                f = f2;
                            } else {
                                h.a().readLock().lock();
                                try {
                                    if (!h.f().contains(str)) {
                                        if (!h.d()) {
                                            z2 = false;
                                            if (z2) {
                                                bku0 b = this.a.b(d(), experimentSource.getValue(), str);
                                                ReentrantReadWriteLock.WriteLock writeLock = h.a().writeLock();
                                                writeLock.lock();
                                                try {
                                                    if (!h.f().contains(str)) {
                                                        uku0Var = (uku0) h.b().get(str);
                                                        if (uku0Var != null && uku0Var.d > d()) {
                                                            if (uku0Var == null) {
                                                                if (str2.length() != 0) {
                                                                    if (!jl40.l(uku0Var.b, str2)) {
                                                                    }
                                                                }
                                                                f = uku0Var;
                                                            } else if (!h.d() && b != null && b.e > this.g) {
                                                                String str3 = b.b;
                                                                String str4 = b.c;
                                                                if (str4 == null) {
                                                                    str4 = "";
                                                                }
                                                                String str5 = str4;
                                                                uku0 uku0Var2 = new uku0(str3, str5, b.d, b.e, false, (b) null, 96);
                                                                h.b().put(b.b, uku0Var2);
                                                                if (str2.length() != 0 && !str5.equals(str2)) {
                                                                    uku0Var2 = null;
                                                                }
                                                                uku0Var = uku0Var2;
                                                                f = uku0Var;
                                                            }
                                                        }
                                                        uku0Var = null;
                                                        if (uku0Var == null) {
                                                        }
                                                    }
                                                    uku0Var = null;
                                                    f = uku0Var;
                                                } finally {
                                                    writeLock.unlock();
                                                }
                                            }
                                        }
                                    }
                                    z2 = true;
                                    if (z2) {
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            f = null;
        }
        if (f != null) {
            qn11 qn11Var = f.g;
            if (qn11Var != null) {
                return new eku0(f.a, f.b, f.c, qn11Var, f.a());
            }
            clw0 clw0Var = (clw0) ((dlw0) this.c.get()).a.get(str);
            if (clw0Var != null && clw0Var.c == experimentSource) {
                synchronized (f) {
                    try {
                        qn11 qn11Var2 = f.g;
                        if (qn11Var2 == null) {
                            try {
                                failure = (qn11) ((xnt) this.d).c(f.c, (KSerializer) clw0Var.e.getValue());
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            qn11Var2 = (qn11) failure;
                            if (qn11Var2 == null) {
                                return null;
                            }
                            if (qn11Var2 instanceof rn11) {
                                ((rn11) qn11Var2).b = f.a();
                            }
                            f.g = qn11Var2;
                        }
                        return new eku0(f.a, f.b, f.c, qn11Var2, f.a());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return null;
    }
}
