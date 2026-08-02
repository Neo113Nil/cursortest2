package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class s4r0 extends AbstractSet {
    public final /* synthetic */ int a;

    public /* synthetic */ s4r0(int i) {
        this.a = i;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                if (collection instanceof ix40) {
                    collection = ((ix40) collection).F1();
                }
                boolean z = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        z |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            z = true;
                        }
                    }
                }
                return z;
            case 1:
                return msa1.p(this, collection);
            case 2:
                return cta1.f(this, collection);
            case 3:
                return hta1.g(this, collection);
            default:
                return sta1.d(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                break;
            case 1:
                collection.getClass();
                break;
            case 2:
                collection.getClass();
                break;
            case 3:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
