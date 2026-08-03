package r0;

import java.util.Iterator;
import java.util.Map;
import l1.f0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends bc.h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5911g;

    /* renamed from: h, reason: collision with root package name */
    public final u0.h f5912h;

    public /* synthetic */ f(int i10, u0.h hVar) {
        this.f5911g = i10;
        this.f5912h = hVar;
    }

    @Override // bc.h
    public final int a() {
        switch (this.f5911g) {
            case 0:
                u0.h hVar = this.f5912h;
                hVar.getClass();
                return hVar.f6676k;
            default:
                u0.h hVar2 = this.f5912h;
                hVar2.getClass();
                return hVar2.f6676k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5911g) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5911g) {
            case 0:
                this.f5912h.clear();
                break;
            default:
                this.f5912h.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5911g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                u0.h hVar = this.f5912h;
                Object obj2 = hVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && hVar.containsKey(entry.getKey());
            default:
                return this.f5912h.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5911g) {
            case 0:
                return new f0(this.f5912h);
            default:
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(1);
                }
                return new g(this.f5912h, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5911g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f5912h.remove(entry.getKey(), entry.getValue());
            default:
                u0.h hVar = this.f5912h;
                if (!hVar.containsKey(obj)) {
                    return false;
                }
                hVar.remove(obj);
                return true;
        }
    }
}
