package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes.dex */
public final class qlk extends xlk {
    public a g;

    @Override // defpackage.xlk, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ozm) {
            return super.containsKey((ozm) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof vwt) {
            return super.containsValue((vwt) obj);
        }
        return false;
    }

    @Override // defpackage.xlk, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ozm) {
            return (vwt) super.get((ozm) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ozm) ? obj2 : (vwt) super.getOrDefault((ozm) obj, (vwt) obj2);
    }

    @Override // defpackage.xlk
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a e() {
        aat aatVar = this.c;
        a aVar = this.g;
        if (aatVar != aVar.d) {
            this.b = new hs4(28);
            aVar = new a(this.c, f());
        }
        this.g = aVar;
        return aVar;
    }

    @Override // defpackage.xlk, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof ozm) {
            return (vwt) super.remove((ozm) obj);
        }
        return null;
    }
}
