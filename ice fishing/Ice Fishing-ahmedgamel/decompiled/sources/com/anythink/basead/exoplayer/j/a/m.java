package com.anythink.basead.exoplayer.j.a;

import android.os.ConditionVariable;
import android.util.Log;
import com.anythink.basead.exoplayer.j.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8097a = "SimpleCache";

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<File> f8098b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f8099c;

    /* renamed from: d, reason: collision with root package name */
    private final File f8100d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8101e;

    /* renamed from: f, reason: collision with root package name */
    private final h f8102f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, ArrayList<a.b>> f8103g;

    /* renamed from: h, reason: collision with root package name */
    private long f8104h;
    private boolean i;

    private m(File file, d dVar) {
        this(file, dVar, null, false);
    }

    @Deprecated
    private static synchronized void d() {
        synchronized (m.class) {
            f8099c = true;
            f8098b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.basead.exoplayer.j.a.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized n a(String str, long j6) {
        n b9;
        while (true) {
            b9 = b(str, j6);
            if (b9 == null) {
                wait();
            }
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.basead.exoplayer.j.a.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized n b(String str, long j6) {
        n a9;
        n nVar;
        try {
            com.anythink.basead.exoplayer.k.a.b(!this.i);
            g b9 = this.f8102f.b(str);
            if (b9 == null) {
                nVar = n.b(str, j6);
            } else {
                while (true) {
                    a9 = b9.a(j6);
                    if (!a9.f8063d || a9.f8064e.exists()) {
                        break;
                    }
                    f();
                }
                nVar = a9;
            }
            if (!nVar.f8063d) {
                g a10 = this.f8102f.a(str);
                if (a10.b()) {
                    return null;
                }
                a10.a(true);
                return nVar;
            }
            n b10 = this.f8102f.b(str).b(nVar);
            ArrayList<a.b> arrayList = this.f8103g.get(nVar.f8060a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size);
                }
            }
            return b10;
        } catch (Throwable th) {
            throw th;
        }
    }

    private n g(String str, long j6) {
        n a9;
        g b9 = this.f8102f.b(str);
        if (b9 == null) {
            return n.b(str, j6);
        }
        while (true) {
            a9 = b9.a(j6);
            if (!a9.f8063d || a9.f8064e.exists()) {
                break;
            }
            f();
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized long c() {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        return this.f8104h;
    }

    private m(File file, d dVar, byte[] bArr) {
        this(file, dVar, bArr, bArr != null);
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a() {
        if (this.i) {
            return;
        }
        this.f8103g.clear();
        try {
            f();
        } finally {
            d(this.f8100d);
            this.i = true;
        }
    }

    private m(File file, d dVar, byte[] bArr, boolean z3) {
        this(file, dVar, new h(file, bArr, z3));
    }

    private static synchronized boolean b(File file) {
        boolean contains;
        synchronized (m.class) {
            contains = f8098b.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized File c(String str, long j6) {
        g b9;
        try {
            com.anythink.basead.exoplayer.k.a.b(!this.i);
            b9 = this.f8102f.b(str);
            com.anythink.basead.exoplayer.k.a.a(b9);
            com.anythink.basead.exoplayer.k.a.b(b9.b());
            if (!this.f8100d.exists()) {
                this.f8100d.mkdirs();
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n.a(this.f8100d, b9.f8072a, j6, System.currentTimeMillis());
    }

    private m(File file, d dVar, h hVar) {
        if (c(file)) {
            this.f8100d = file;
            this.f8101e = dVar;
            this.f8102f = hVar;
            this.f8103g = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") { // from class: com.anythink.basead.exoplayer.j.a.m.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    synchronized (m.this) {
                        conditionVariable.open();
                        m.a(m.this);
                        d unused = m.this.f8101e;
                    }
                }
            }.start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(file)));
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void b(String str, a.b bVar) {
        if (this.i) {
            return;
        }
        ArrayList<a.b> arrayList = this.f8103g.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (arrayList.isEmpty()) {
                this.f8103g.remove(str);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void d(String str, long j6) {
        k kVar = new k();
        j.a(kVar, j6);
        a(str, kVar);
    }

    private void e() {
        if (!this.f8100d.exists()) {
            this.f8100d.mkdirs();
            return;
        }
        this.f8102f.a();
        File[] listFiles = this.f8100d.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(h.f8077a)) {
                n a9 = file.length() > 0 ? n.a(file, this.f8102f) : null;
                if (a9 != null) {
                    a(a9);
                } else {
                    file.delete();
                }
            }
        }
        this.f8102f.d();
        try {
            this.f8102f.b();
        } catch (a.C0034a e9) {
            Log.e(f8097a, "Storing index file failed", e9);
        }
    }

    private static synchronized void d(File file) {
        synchronized (m.class) {
            if (!f8099c) {
                f8098b.remove(file.getAbsoluteFile());
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized Set<String> b() {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        return new HashSet(this.f8102f.e());
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized NavigableSet<e> a(String str, a.b bVar) {
        try {
            com.anythink.basead.exoplayer.k.a.b(!this.i);
            ArrayList<a.b> arrayList = this.f8103g.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f8103g.put(str, arrayList);
            }
            arrayList.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
        return a(str);
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void b(e eVar) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        a(eVar, true);
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized i c(String str) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        return this.f8102f.e(str);
    }

    private void c(e eVar) {
        ArrayList<a.b> arrayList = this.f8103g.get(eVar.f8060a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized long b(String str, long j6, long j9) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        g b9 = this.f8102f.b(str);
        if (b9 != null) {
            return b9.a(j6, j9);
        }
        return -j9;
    }

    private void c(n nVar) {
        ArrayList<a.b> arrayList = this.f8103g.get(nVar.f8060a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f8102f.c().iterator();
        while (it.hasNext()) {
            Iterator<n> it2 = it.next().c().iterator();
            while (it2.hasNext()) {
                n next = it2.next();
                if (!next.f8064e.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a((e) arrayList.get(i), false);
        }
        this.f8102f.d();
        this.f8102f.b();
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized NavigableSet<e> a(String str) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        g b9 = this.f8102f.b(str);
        if (b9 != null && !b9.d()) {
            return new TreeSet((Collection) b9.c());
        }
        return new TreeSet();
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized long b(String str) {
        return j.a(c(str));
    }

    private void b(n nVar) {
        ArrayList<a.b> arrayList = this.f8103g.get(nVar.f8060a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    private static synchronized boolean c(File file) {
        synchronized (m.class) {
            if (f8099c) {
                return true;
            }
            return f8098b.add(file.getAbsoluteFile());
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a(File file) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        n a9 = n.a(file, this.f8102f);
        com.anythink.basead.exoplayer.k.a.b(a9 != null);
        g b9 = this.f8102f.b(a9.f8060a);
        com.anythink.basead.exoplayer.k.a.a(b9);
        com.anythink.basead.exoplayer.k.a.b(b9.b());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long a10 = j.a(b9.a());
            if (a10 != -1) {
                com.anythink.basead.exoplayer.k.a.b(a9.f8061b + a9.f8062c <= a10);
            }
            a(a9);
            this.f8102f.b();
            notifyAll();
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a(e eVar) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        g b9 = this.f8102f.b(eVar.f8060a);
        com.anythink.basead.exoplayer.k.a.a(b9);
        com.anythink.basead.exoplayer.k.a.b(b9.b());
        b9.a(false);
        this.f8102f.d(b9.f8073b);
        notifyAll();
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized boolean a(String str, long j6, long j9) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        g b9 = this.f8102f.b(str);
        if (b9 != null) {
            if (b9.a(j6, j9) >= j9) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a(String str, k kVar) {
        com.anythink.basead.exoplayer.k.a.b(!this.i);
        this.f8102f.a(str, kVar);
        this.f8102f.b();
    }

    private void a(n nVar) {
        this.f8102f.a(nVar.f8060a).a(nVar);
        this.f8104h += nVar.f8062c;
        b(nVar);
    }

    private void a(e eVar, boolean z3) {
        g b9 = this.f8102f.b(eVar.f8060a);
        if (b9 == null || !b9.a(eVar)) {
            return;
        }
        this.f8104h -= eVar.f8062c;
        if (z3) {
            try {
                this.f8102f.d(b9.f8073b);
                this.f8102f.b();
            } finally {
                c(eVar);
            }
        }
    }

    public static /* synthetic */ void a(m mVar) {
        if (!mVar.f8100d.exists()) {
            mVar.f8100d.mkdirs();
            return;
        }
        mVar.f8102f.a();
        File[] listFiles = mVar.f8100d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(h.f8077a)) {
                    n a9 = file.length() > 0 ? n.a(file, mVar.f8102f) : null;
                    if (a9 != null) {
                        mVar.a(a9);
                    } else {
                        file.delete();
                    }
                }
            }
            mVar.f8102f.d();
            try {
                mVar.f8102f.b();
            } catch (a.C0034a e9) {
                Log.e(f8097a, "Storing index file failed", e9);
            }
        }
    }
}
