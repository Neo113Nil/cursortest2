package pc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h extends c implements g, vc.a, ac.c {

    /* renamed from: m, reason: collision with root package name */
    public final int f5674m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5675n;

    public h(int i10, Class cls, String str, String str2, int i11) {
        this(i10, b.f5663g, cls, str, str2, i11, 0);
    }

    @Override // pc.c
    public final vc.a a() {
        t.f5684a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f5667j.equals(hVar.f5667j) && this.f5668k.equals(hVar.f5668k) && this.f5675n == hVar.f5675n && this.f5674m == hVar.f5674m && j.a(this.f5665h, hVar.f5665h) && e().equals(hVar.e());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        vc.a aVar = this.f5664g;
        if (aVar == null) {
            a();
            this.f5664g = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // pc.g
    public final int getArity() {
        return this.f5674m;
    }

    public final int hashCode() {
        e();
        return this.f5668k.hashCode() + ((this.f5667j.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        vc.a aVar = this.f5664g;
        if (aVar == null) {
            a();
            this.f5664g = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f5667j;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a4.d.j("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f5674m = i10;
        this.f5675n = 0;
    }
}
