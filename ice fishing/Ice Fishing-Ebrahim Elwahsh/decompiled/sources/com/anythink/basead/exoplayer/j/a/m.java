package com.anythink.basead.exoplayer.j.a;

import android.os.ConditionVariable;
import android.util.Log;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.C0544a;
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
    private static final String f8254a = "SimpleCache";

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<File> f8255b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f8256c;

    /* renamed from: d, reason: collision with root package name */
    private final File f8257d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8258e;

    /* renamed from: f, reason: collision with root package name */
    private final h f8259f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, ArrayList<a.b>> f8260g;

    /* renamed from: h, reason: collision with root package name */
    private long f8261h;
    private boolean i;

    private m(File file, d dVar) {
        this(file, dVar, null, false);
    }

    @Deprecated
    private static synchronized void d() {
        synchronized (m.class) {
            f8256c = true;
            f8255b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.basead.exoplayer.j.a.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized n a(String str, long j9) {
        n b9;
        while (true) {
            b9 = b(str, j9);
            if (b9 == null) {
                wait();
            }
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.basead.exoplayer.j.a.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized n b(String str, long j9) {
        n a9;
        n nVar;
        try {
            C0544a.b(!this.i);
            g b9 = this.f8259f.b(str);
            if (b9 == null) {
                nVar = n.b(str, j9);
            } else {
                while (true) {
                    a9 = b9.a(j9);
                    if (!a9.f8220d || a9.f8221e.exists()) {
                        break;
                    }
                    f();
                }
                nVar = a9;
            }
            if (!nVar.f8220d) {
                g a10 = this.f8259f.a(str);
                if (a10.b()) {
                    return null;
                }
                a10.a(true);
                return nVar;
            }
            n b10 = this.f8259f.b(str).b(nVar);
            ArrayList<a.b> arrayList = this.f8260g.get(nVar.f8217a);
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

    private n g(String str, long j9) {
        n a9;
        g b9 = this.f8259f.b(str);
        if (b9 == null) {
            return n.b(str, j9);
        }
        while (true) {
            a9 = b9.a(j9);
            if (!a9.f8220d || a9.f8221e.exists()) {
                break;
            }
            f();
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized long c() {
        C0544a.b(!this.i);
        return this.f8261h;
    }

    private m(File file, d dVar, byte[] bArr) {
        this(file, dVar, bArr, bArr != null);
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a() {
        if (this.i) {
            return;
        }
        this.f8260g.clear();
        try {
            f();
        } finally {
            d(this.f8257d);
            this.i = true;
        }
    }

    private m(File file, d dVar, byte[] bArr, boolean z8) {
        this(file, dVar, new h(file, bArr, z8));
    }

    private static synchronized boolean b(File file) {
        boolean contains;
        synchronized (m.class) {
            contains = f8255b.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized File c(String str, long j9) {
        g b9;
        try {
            C0544a.b(!this.i);
            b9 = this.f8259f.b(str);
            C0544a.a(b9);
            C0544a.b(b9.b());
            if (!this.f8257d.exists()) {
                this.f8257d.mkdirs();
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n.a(this.f8257d, b9.f8229a, j9, System.currentTimeMillis());
    }

    private m(File file, d dVar, h hVar) {
        if (c(file)) {
            this.f8257d = file;
            this.f8258e = dVar;
            this.f8259f = hVar;
            this.f8260g = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") { // from class: com.anythink.basead.exoplayer.j.a.m.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    synchronized (m.this) {
                        conditionVariable.open();
                        m.a(m.this);
                        d unused = m.this.f8258e;
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
        ArrayList<a.b> arrayList = this.f8260g.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (arrayList.isEmpty()) {
                this.f8260g.remove(str);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void d(String str, long j9) {
        k kVar = new k();
        j.a(kVar, j9);
        a(str, kVar);
    }

    private void e() {
        if (!this.f8257d.exists()) {
            this.f8257d.mkdirs();
            return;
        }
        this.f8259f.a();
        File[] listFiles = this.f8257d.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(h.f8234a)) {
                n a9 = file.length() > 0 ? n.a(file, this.f8259f) : null;
                if (a9 != null) {
                    a(a9);
                } else {
                    file.delete();
                }
            }
        }
        this.f8259f.d();
        try {
            this.f8259f.b();
        } catch (a.C0033a e6) {
            Log.e(f8254a, "Storing index file failed", e6);
        }
    }

    private static synchronized void d(File file) {
        synchronized (m.class) {
            if (!f8256c) {
                f8255b.remove(file.getAbsoluteFile());
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized Set<String> b() {
        C0544a.b(!this.i);
        return new HashSet(this.f8259f.e());
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized NavigableSet<e> a(String str, a.b bVar) {
        try {
            C0544a.b(!this.i);
            ArrayList<a.b> arrayList = this.f8260g.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f8260g.put(str, arrayList);
            }
            arrayList.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
        return a(str);
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void b(e eVar) {
        C0544a.b(!this.i);
        a(eVar, true);
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized i c(String str) {
        C0544a.b(!this.i);
        return this.f8259f.e(str);
    }

    private void c(e eVar) {
        ArrayList<a.b> arrayList = this.f8260g.get(eVar.f8217a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized long b(String str, long j9, long j10) {
        C0544a.b(!this.i);
        g b9 = this.f8259f.b(str);
        if (b9 != null) {
            return b9.a(j9, j10);
        }
        return -j10;
    }

    private void c(n nVar) {
        ArrayList<a.b> arrayList = this.f8260g.get(nVar.f8217a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f8259f.c().iterator();
        while (it.hasNext()) {
            Iterator<n> it2 = it.next().c().iterator();
            while (it2.hasNext()) {
                n next = it2.next();
                if (!next.f8221e.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a((e) arrayList.get(i), false);
        }
        this.f8259f.d();
        this.f8259f.b();
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized NavigableSet<e> a(String str) {
        C0544a.b(!this.i);
        g b9 = this.f8259f.b(str);
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
        ArrayList<a.b> arrayList = this.f8260g.get(nVar.f8217a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    private static synchronized boolean c(File file) {
        synchronized (m.class) {
            if (f8256c) {
                return true;
            }
            return f8255b.add(file.getAbsoluteFile());
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a(File file) {
        C0544a.b(!this.i);
        n a9 = n.a(file, this.f8259f);
        C0544a.b(a9 != null);
        g b9 = this.f8259f.b(a9.f8217a);
        C0544a.a(b9);
        C0544a.b(b9.b());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long a10 = j.a(b9.a());
            if (a10 != -1) {
                C0544a.b(a9.f8218b + a9.f8219c <= a10);
            }
            a(a9);
            this.f8259f.b();
            notifyAll();
        }
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a(e eVar) {
        C0544a.b(!this.i);
        g b9 = this.f8259f.b(eVar.f8217a);
        C0544a.a(b9);
        C0544a.b(b9.b());
        b9.a(false);
        this.f8259f.d(b9.f8230b);
        notifyAll();
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized boolean a(String str, long j9, long j10) {
        C0544a.b(!this.i);
        g b9 = this.f8259f.b(str);
        if (b9 != null) {
            if (b9.a(j9, j10) >= j10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.j.a.a
    public final synchronized void a(String str, k kVar) {
        C0544a.b(!this.i);
        this.f8259f.a(str, kVar);
        this.f8259f.b();
    }

    private void a(n nVar) {
        this.f8259f.a(nVar.f8217a).a(nVar);
        this.f8261h += nVar.f8219c;
        b(nVar);
    }

    private void a(e eVar, boolean z8) {
        g b9 = this.f8259f.b(eVar.f8217a);
        if (b9 == null || !b9.a(eVar)) {
            return;
        }
        this.f8261h -= eVar.f8219c;
        if (z8) {
            try {
                this.f8259f.d(b9.f8230b);
                this.f8259f.b();
            } finally {
                c(eVar);
            }
        }
    }

    public static /* synthetic */ void a(m mVar) {
        if (!mVar.f8257d.exists()) {
            mVar.f8257d.mkdirs();
            return;
        }
        mVar.f8259f.a();
        File[] listFiles = mVar.f8257d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(h.f8234a)) {
                    n a9 = file.length() > 0 ? n.a(file, mVar.f8259f) : null;
                    if (a9 != null) {
                        mVar.a(a9);
                    } else {
                        file.delete();
                    }
                }
            }
            mVar.f8259f.d();
            try {
                mVar.f8259f.b();
            } catch (a.C0033a e6) {
                Log.e(f8254a, "Storing index file failed", e6);
            }
        }
    }
}
