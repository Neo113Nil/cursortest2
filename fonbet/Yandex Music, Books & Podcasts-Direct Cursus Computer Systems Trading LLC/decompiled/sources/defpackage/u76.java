package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u76 implements nld, qmh, pjn {
    public Object a;
    public volatile Object b;

    public /* synthetic */ u76(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qmh
    public byte[] a(UUID uuid, nqb nqbVar) {
        uuid.getClass();
        x9o x9oVar = (x9o) this.b;
        roj rojVar = (roj) this.a;
        String str = nqbVar.b;
        if (str == null) {
            str = "";
        }
        byte[] bArr = nqbVar.a;
        bArr.getClass();
        return x9oVar.c(rojVar, str, bArr, uuid);
    }

    public void b() {
        boolean isEmpty = ((ConcurrentLinkedDeque) this.a).isEmpty();
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) this.a;
        if (!isEmpty) {
            concurrentLinkedDeque.addLast(new q7k());
        } else {
            concurrentLinkedDeque.addLast((q7k) this.b);
            this.b = new q7k();
        }
    }

    @Override // defpackage.qmh
    public byte[] c(UUID uuid, lqb lqbVar) {
        uuid.getClass();
        x9o x9oVar = (x9o) this.b;
        roj rojVar = (roj) this.a;
        String str = lqbVar.b;
        if (str == null) {
            str = "";
        }
        byte[] bArr = lqbVar.a;
        bArr.getClass();
        return x9oVar.a(rojVar, str, bArr, uuid);
    }

    public void d() {
        ((ConcurrentLinkedDeque) this.a).pollLast();
    }

    public w68 e() {
        if (((w68) this.b) == null) {
            synchronized (this) {
                try {
                    if (((w68) this.b) == null) {
                        File cacheDir = ((vg0) ((cib) this.a).b).a.getCacheDir();
                        m78 m78Var = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            m78Var = new m78();
                            m78Var.d = new qne(23);
                            m78Var.c = file;
                            m78Var.a = 262144000L;
                            m78Var.b = new atn(2);
                        }
                        this.b = m78Var;
                    }
                    if (((w68) this.b) == null) {
                        this.b = new i9w();
                    }
                } finally {
                }
            }
        }
        return (w68) this.b;
    }

    @Override // defpackage.pjn
    public synchronized q1 f(znk znkVar) {
        try {
            if (((AtomicBoolean) this.a).get()) {
                q1 config = ((i1) znkVar.b).getConfig();
                if (!Intrinsics.d(config, (q1) this.b)) {
                    this.b = config;
                    ((AtomicBoolean) this.a).set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (q1) this.b;
    }

    public p7k g(lm4 lm4Var) {
        p7k p7kVar;
        Iterator descendingIterator = ((ConcurrentLinkedDeque) this.a).descendingIterator();
        do {
            p7kVar = null;
            if (!descendingIterator.hasNext()) {
                Object obj = ((q7k) this.b).a.get(lm4Var);
                if (obj instanceof p7k) {
                    return (p7k) obj;
                }
                return null;
            }
            Object obj2 = ((q7k) descendingIterator.next()).a.get(lm4Var);
            if (obj2 instanceof p7k) {
                p7kVar = (p7k) obj2;
            }
        } while (p7kVar == null);
        return p7kVar;
    }

    @Override // defpackage.nld
    public Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = ((nld) this.a).get();
                        w1g.s(obj, "Argument must not be null");
                        this.b = obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public ro4 h(dsk dskVar) {
        aeg aegVar = ((j8h) this.a).x;
        if (((j8h) this.a).F.get()) {
            return ((j8h) this.a).D;
        }
        if (aegVar == null) {
            ((j8h) this.a).m.execute(new dsd(9, this));
            return ((j8h) this.a).D;
        }
        ro4 f = xqd.f(aegVar.a(dskVar), Boolean.TRUE.equals(dskVar.a.e));
        return f != null ? f : ((j8h) this.a).D;
    }

    public void i(r76 r76Var) {
        o2g.O(r76Var, "newState");
        if (((r76) this.b) == r76Var || ((r76) this.b) == r76.e) {
            return;
        }
        this.b = r76Var;
        if (((ArrayList) this.a).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.a;
        this.a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t76 t76Var = (t76) it.next();
            t76Var.b.execute(t76Var.a);
        }
    }

    public boolean j() {
        Boolean bool = (Boolean) this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = ((SharedPreferences) this.a).getBoolean("com.yandex.plus.metrica_logs_enabled", false);
        this.b = Boolean.valueOf(z);
        return z;
    }

    public void k(p7k... p7kVarArr) {
        q7k q7kVar = (q7k) ((ConcurrentLinkedDeque) this.a).peekLast();
        if (q7kVar == null) {
            q7kVar = (q7k) this.b;
        }
        ConcurrentHashMap concurrentHashMap = q7kVar.a;
        int a = tah.a(p7kVarArr.length);
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (p7k p7kVar : p7kVarArr) {
            linkedHashMap.put(ern.a(p7kVar.getClass()), p7kVar);
        }
        concurrentHashMap.putAll(linkedHashMap);
    }
}
