package defpackage;

import com.google.common.cache.a;
import com.google.common.cache.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class whg implements Iterator {
    public int a;
    public int b = -1;
    public a c;
    public AtomicReferenceArray d;
    public crn e;
    public sig f;
    public sig g;
    public final /* synthetic */ b h;
    public final /* synthetic */ int i;

    public whg(b bVar, int i) {
        this.i = i;
        this.h = bVar;
        this.a = bVar.c.length - 1;
        a();
    }

    public final void a() {
        this.f = null;
        if (e() || f()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            a[] aVarArr = this.h.c;
            this.a = i - 1;
            a aVar = aVarArr[i];
            this.c = aVar;
            if (aVar.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (f()) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r6.f = new defpackage.sig(r0, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r6.c.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(crn crnVar) {
        Object obj;
        b bVar = this.h;
        try {
            long a = bVar.o.a();
            Object key = crnVar.getKey();
            Object obj2 = null;
            if (crnVar.getKey() != null && (obj = crnVar.g().get()) != null && !bVar.e(crnVar, a)) {
                obj2 = obj;
            }
            this.c.n();
            return false;
        } catch (Throwable th) {
            this.c.n();
            throw th;
        }
    }

    public final Object c() {
        return d();
    }

    public final sig d() {
        sig sigVar = this.f;
        if (sigVar == null) {
            wvs.n();
            return null;
        }
        this.g = sigVar;
        a();
        return this.g;
    }

    public final boolean e() {
        crn crnVar = this.e;
        if (crnVar == null) {
            return false;
        }
        while (true) {
            this.e = crnVar.getNext();
            crn crnVar2 = this.e;
            if (crnVar2 == null) {
                return false;
            }
            if (b(crnVar2)) {
                return true;
            }
            crnVar = this.e;
        }
    }

    public final boolean f() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            crn crnVar = (crn) atomicReferenceArray.get(i);
            this.e = crnVar;
            if (crnVar != null && (b(crnVar) || e())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.i) {
            case 1:
                return d().a;
            case 2:
                return d().b;
            default:
                return c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        o2g.V(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
