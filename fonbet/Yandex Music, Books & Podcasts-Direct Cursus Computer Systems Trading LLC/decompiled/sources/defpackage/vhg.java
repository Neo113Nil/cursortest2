package defpackage;

import com.google.common.cache.b;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class vhg extends AbstractQueue {
    public final /* synthetic */ int a;
    public final shg b;

    public vhg(int i) {
        this.a = i;
        switch (i) {
            case 1:
                thg thgVar = new thg(1);
                thgVar.b = thgVar;
                thgVar.c = thgVar;
                this.b = thgVar;
                break;
            default:
                thg thgVar2 = new thg(0);
                thgVar2.b = thgVar2;
                thgVar2.c = thgVar2;
                this.b = thgVar2;
                break;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        dig digVar = dig.a;
        shg shgVar = this.b;
        switch (i) {
            case 0:
                thg thgVar = (thg) shgVar;
                crn crnVar = thgVar.b;
                while (crnVar != thgVar) {
                    crn h = crnVar.h();
                    Logger logger = b.v;
                    crnVar.i(digVar);
                    crnVar.e(digVar);
                    crnVar = h;
                }
                thgVar.b = thgVar;
                thgVar.c = thgVar;
                break;
            default:
                thg thgVar2 = (thg) shgVar;
                crn crnVar2 = thgVar2.b;
                while (crnVar2 != thgVar2) {
                    crn f = crnVar2.f();
                    Logger logger2 = b.v;
                    crnVar2.d(digVar);
                    crnVar2.c(digVar);
                    crnVar2 = f;
                }
                thgVar2.b = thgVar2;
                thgVar2.c = thgVar2;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (((crn) obj).h() != dig.a) {
                }
                break;
            default:
                if (((crn) obj).f() != dig.a) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                thg thgVar = (thg) this.b;
                if (thgVar.b == thgVar) {
                }
                break;
            default:
                thg thgVar2 = (thg) this.b;
                if (thgVar2.b == thgVar2) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                thg thgVar = (thg) this.b;
                crn crnVar = thgVar.b;
                if (crnVar == thgVar) {
                    crnVar = null;
                }
                return new uhg(this, crnVar, 0);
            default:
                thg thgVar2 = (thg) this.b;
                crn crnVar2 = thgVar2.b;
                if (crnVar2 == thgVar2) {
                    crnVar2 = null;
                }
                return new uhg(this, crnVar2, 1);
        }
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        int i = this.a;
        shg shgVar = this.b;
        switch (i) {
            case 0:
                crn crnVar = (crn) obj;
                crn a = crnVar.a();
                crn h = crnVar.h();
                Logger logger = b.v;
                a.i(h);
                h.e(a);
                thg thgVar = (thg) shgVar;
                crn crnVar2 = thgVar.c;
                crnVar2.i(crnVar);
                crnVar.e(crnVar2);
                crnVar.i(thgVar);
                thgVar.c = crnVar;
                break;
            default:
                crn crnVar3 = (crn) obj;
                crn k = crnVar3.k();
                crn f = crnVar3.f();
                Logger logger2 = b.v;
                k.d(f);
                f.c(k);
                thg thgVar2 = (thg) shgVar;
                crn crnVar4 = thgVar2.c;
                crnVar4.d(crnVar3);
                crnVar3.c(crnVar4);
                crnVar3.d(thgVar2);
                thgVar2.c = crnVar3;
                break;
        }
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        switch (this.a) {
            case 0:
                thg thgVar = (thg) this.b;
                crn crnVar = thgVar.b;
                if (crnVar == thgVar) {
                    return null;
                }
                return crnVar;
            default:
                thg thgVar2 = (thg) this.b;
                crn crnVar2 = thgVar2.b;
                if (crnVar2 == thgVar2) {
                    return null;
                }
                return crnVar2;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        switch (this.a) {
            case 0:
                thg thgVar = (thg) this.b;
                crn crnVar = thgVar.b;
                if (crnVar == thgVar) {
                    return null;
                }
                remove(crnVar);
                return crnVar;
            default:
                thg thgVar2 = (thg) this.b;
                crn crnVar2 = thgVar2.b;
                if (crnVar2 == thgVar2) {
                    return null;
                }
                remove(crnVar2);
                return crnVar2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        dig digVar = dig.a;
        switch (i) {
            case 0:
                crn crnVar = (crn) obj;
                crn a = crnVar.a();
                crn h = crnVar.h();
                Logger logger = b.v;
                a.i(h);
                h.e(a);
                crnVar.i(digVar);
                crnVar.e(digVar);
                if (h != digVar) {
                    break;
                }
                break;
            default:
                crn crnVar2 = (crn) obj;
                crn k = crnVar2.k();
                crn f = crnVar2.f();
                Logger logger2 = b.v;
                k.d(f);
                f.c(k);
                crnVar2.d(digVar);
                crnVar2.c(digVar);
                if (f != digVar) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                thg thgVar = (thg) this.b;
                int i = 0;
                for (crn crnVar = thgVar.b; crnVar != thgVar; crnVar = crnVar.h()) {
                    i++;
                }
                return i;
            default:
                thg thgVar2 = (thg) this.b;
                int i2 = 0;
                for (crn crnVar2 = thgVar2.b; crnVar2 != thgVar2; crnVar2 = crnVar2.f()) {
                    i2++;
                }
                return i2;
        }
    }
}
