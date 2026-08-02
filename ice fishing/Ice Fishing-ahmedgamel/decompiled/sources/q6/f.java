package q6;

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
        boolean z6;
        ClassLoader classLoader = e.class.getClassLoader();
        if (classLoader != null) {
            z6 = false;
            try {
                if (classLoader != ClassLoader.getSystemClassLoader()) {
                }
            } catch (Throwable unused) {
            }
        }
        z6 = true;
    }

    @Override // q6.AbstractRunnableC4880d
    public final Object a(Object obj) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.a(obj);
            }
            this.f40061n.remove(poll);
        }
    }

    @Override // q6.g, q6.AbstractRunnableC4880d
    public final e c(Object obj) {
        e eVar = this.f40065u ? (e) g.f40064v.get() : new e();
        eVar.f40062a = obj;
        eVar.f40063b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // q6.AbstractRunnableC4880d
    public final Object d(Object obj, Object obj2) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.d(obj, obj2);
            }
            this.f40061n.remove(poll);
        }
    }

    @Override // q6.g, q6.AbstractRunnableC4880d
    public final void e(Object obj) {
        e eVar = (e) obj;
        eVar.f40062a = null;
        eVar.f40063b = 0;
    }

    @Override // q6.AbstractRunnableC4880d, java.lang.Iterable
    public final Iterator iterator() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.iterator();
            }
            this.f40061n.remove(poll);
        }
    }
}
