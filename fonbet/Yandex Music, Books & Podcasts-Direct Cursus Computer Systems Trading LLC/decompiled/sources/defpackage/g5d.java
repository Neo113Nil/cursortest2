package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g5d implements Iterator, j9f {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;

    public g5d(wpi wpiVar) {
        this.a = 2;
        this.d = wpiVar;
        this.b = -1;
        this.c = dhp.a(new vpi(wpiVar, this, null));
    }

    public void a() {
        Object invoke;
        int i = this.b;
        h5d h5dVar = (h5d) this.d;
        if (i == -2) {
            invoke = ((Function0) h5dVar.b).invoke();
        } else {
            Function1 function1 = (Function1) h5dVar.c;
            Object obj = this.c;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.c = invoke;
        this.b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            case 1:
                return ((xgp) this.c).hasNext();
            case 2:
                return ((xgp) this.c).hasNext();
            case 3:
                return this.b < ((Map) this.d).size();
            case 4:
                umr umrVar = (umr) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < umrVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                return this.b < umrVar.c && it.hasNext();
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    wvs.n();
                    return null;
                }
                Object obj = this.c;
                obj.getClass();
                this.b = -1;
                return obj;
            case 1:
                return ((xgp) this.c).next();
            case 2:
                return ((xgp) this.c).next();
            case 3:
                if (!hasNext()) {
                    wvs.n();
                    return null;
                }
                Object obj2 = this.c;
                this.b++;
                Object obj3 = ((Map) this.d).get(obj2);
                if (obj3 == null) {
                    throw new ConcurrentModificationException(dfi.g("Hash code of an element (", ") has changed after it was added to the persistent set.", obj2));
                }
                this.c = ((h8g) obj3).b;
                return obj2;
            case 4:
                umr umrVar = (umr) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < umrVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i = this.b;
                if (i < umrVar.c) {
                    this.b = i + 1;
                    return it.next();
                }
                wvs.n();
                return null;
            default:
                Function2 function2 = (Function2) ((h5d) this.d).c;
                int i2 = this.b;
                this.b = i2 + 1;
                if (i2 >= 0) {
                    return function2.invoke(Integer.valueOf(i2), ((Iterator) this.c).next());
                }
                u75.n();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.b;
                if (i != -1) {
                    ((jpi) this.d).b.h(i);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                if (i2 != -1) {
                    ((wpi) this.d).b.n(i2);
                    this.b = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g5d(h5d h5dVar, byte b) {
        this.a = 5;
        this.d = h5dVar;
        this.c = new kcc((lcc) h5dVar.b);
    }

    public g5d(umr umrVar) {
        this.a = 4;
        this.d = umrVar;
        this.c = umrVar.a.iterator();
    }

    public g5d(h5d h5dVar) {
        this.a = 0;
        this.d = h5dVar;
        this.b = -2;
    }

    public g5d(Object obj, Map map) {
        this.a = 3;
        this.c = obj;
        this.d = map;
    }

    public g5d(jpi jpiVar) {
        this.a = 1;
        this.d = jpiVar;
        this.b = -1;
        this.c = dhp.a(new ipi(jpiVar, this, null));
    }
}
