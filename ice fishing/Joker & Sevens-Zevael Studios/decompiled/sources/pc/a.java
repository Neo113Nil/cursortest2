package pc;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements g, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Object f5656g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f5657h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5658i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5659j;

    /* renamed from: l, reason: collision with root package name */
    public final int f5661l;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5660k = false;

    /* renamed from: m, reason: collision with root package name */
    public final int f5662m = 4;

    public a(int i10, Class cls, Object obj, String str, String str2) {
        this.f5656g = obj;
        this.f5657h = cls;
        this.f5658i = str;
        this.f5659j = str2;
        this.f5661l = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5660k == aVar.f5660k && this.f5661l == aVar.f5661l && this.f5662m == aVar.f5662m && this.f5656g.equals(aVar.f5656g) && this.f5657h.equals(aVar.f5657h) && this.f5658i.equals(aVar.f5658i) && this.f5659j.equals(aVar.f5659j);
    }

    @Override // pc.g
    public final int getArity() {
        return this.f5661l;
    }

    public final int hashCode() {
        return ((((((this.f5659j.hashCode() + ((this.f5658i.hashCode() + ((this.f5657h.hashCode() + (this.f5656g.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f5660k ? 1231 : 1237)) * 31) + this.f5661l) * 31) + this.f5662m;
    }

    public final String toString() {
        t.f5684a.getClass();
        return u.a(this);
    }
}
