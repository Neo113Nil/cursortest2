package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c8g extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8g b;

    public /* synthetic */ c8g(e8g e8gVar, int i) {
        this.a = i;
        this.b = e8gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        d8g a;
        Object obj2;
        Object value;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                e8g e8gVar = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                d8g d8gVar = null;
                if (key != null) {
                    try {
                        a = e8gVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        d8gVar = a;
                    }
                    return d8gVar == null;
                }
                a = null;
                if (a != null) {
                    d8gVar = a;
                }
                if (d8gVar == null) {
                }
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new b8g(this.b, 0);
            default:
                return new b8g(this.b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        d8g a;
        Object obj2;
        Object value;
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    e8g e8gVar = this.b;
                    d8g d8gVar = null;
                    if (key != null) {
                        try {
                            a = e8gVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a != null && ((obj2 = a.h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                            d8gVar = a;
                        }
                        if (d8gVar == null) {
                            e8gVar.c(d8gVar, true);
                            break;
                        }
                    }
                    a = null;
                    if (a != null) {
                        d8gVar = a;
                    }
                    if (d8gVar == null) {
                    }
                }
                break;
            default:
                e8g e8gVar2 = this.b;
                d8g d8gVar2 = null;
                if (obj != null) {
                    try {
                        d8gVar2 = e8gVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (d8gVar2 != null) {
                    e8gVar2.c(d8gVar2, true);
                }
                if (d8gVar2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
