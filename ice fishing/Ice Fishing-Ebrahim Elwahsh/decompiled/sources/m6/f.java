package m6;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f extends g {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == java.lang.ClassLoader.getSystemClassLoader().getParent()) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f() {
        super(r1, new ConcurrentHashMap());
        boolean z8;
        ClassLoader classLoader = e.class.getClassLoader();
        if (classLoader != null) {
            z8 = false;
            try {
                if (classLoader != ClassLoader.getSystemClassLoader()) {
                }
            } catch (Throwable unused) {
            }
        }
        z8 = true;
    }

    @Override // m6.AbstractRunnableC4786d
    public final Object a(Object obj) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.a(obj);
            }
            this.f39576n.remove(poll);
        }
    }

    @Override // m6.g, m6.AbstractRunnableC4786d
    public final e c(Object obj) {
        e eVar = this.f39580u ? (e) g.f39579v.get() : new e();
        eVar.f39577a = obj;
        eVar.f39578b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // m6.AbstractRunnableC4786d
    public final Object d(Object obj, Object obj2) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.d(obj, obj2);
            }
            this.f39576n.remove(poll);
        }
    }

    @Override // m6.g, m6.AbstractRunnableC4786d
    public final void e(Object obj) {
        e eVar = (e) obj;
        eVar.f39577a = null;
        eVar.f39578b = 0;
    }

    @Override // m6.AbstractRunnableC4786d, java.lang.Iterable
    public final Iterator iterator() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.iterator();
            }
            this.f39576n.remove(poll);
        }
    }
}
