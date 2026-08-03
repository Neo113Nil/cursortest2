package r0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends bc.i {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5913g;

    /* renamed from: h, reason: collision with root package name */
    public final c f5914h;

    public /* synthetic */ h(c cVar, int i10) {
        this.f5913g = i10;
        this.f5914h = cVar;
    }

    @Override // bc.a
    public final int a() {
        switch (this.f5913g) {
            case 0:
                c cVar = this.f5914h;
                cVar.getClass();
                return cVar.f5903h;
            default:
                c cVar2 = this.f5914h;
                cVar2.getClass();
                return cVar2.f5903h;
        }
    }

    @Override // bc.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5913g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                c cVar = this.f5914h;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f5914h.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5913g) {
            case 0:
                k kVar = this.f5914h.f5902g;
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(0);
                }
                return new i(kVar, lVarArr);
            default:
                k kVar2 = this.f5914h.f5902g;
                l[] lVarArr2 = new l[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    lVarArr2[i11] = new m(1);
                }
                return new i(kVar2, lVarArr2);
        }
    }
}
