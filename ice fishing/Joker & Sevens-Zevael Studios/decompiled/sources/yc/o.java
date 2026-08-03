package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8881a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8882b;

    /* renamed from: c, reason: collision with root package name */
    public final oc.c f8883c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8884d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f8885e;

    public o(Object obj, e eVar, oc.c cVar, Object obj2, Throwable th) {
        this.f8881a = obj;
        this.f8882b = eVar;
        this.f8883c = cVar;
        this.f8884d = obj2;
        this.f8885e = th;
    }

    public static o a(o oVar, e eVar, Throwable th, int i10) {
        Object obj = oVar.f8881a;
        if ((i10 & 2) != 0) {
            eVar = oVar.f8882b;
        }
        e eVar2 = eVar;
        oc.c cVar = oVar.f8883c;
        Object obj2 = oVar.f8884d;
        if ((i10 & 16) != 0) {
            th = oVar.f8885e;
        }
        return new o(obj, eVar2, cVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return pc.j.a(this.f8881a, oVar.f8881a) && pc.j.a(this.f8882b, oVar.f8882b) && pc.j.a(this.f8883c, oVar.f8883c) && pc.j.a(this.f8884d, oVar.f8884d) && pc.j.a(this.f8885e, oVar.f8885e);
    }

    public final int hashCode() {
        Object obj = this.f8881a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f8882b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        oc.c cVar = this.f8883c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f8884d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8885e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8881a + ", cancelHandler=" + this.f8882b + ", onCancellation=" + this.f8883c + ", idempotentResume=" + this.f8884d + ", cancelCause=" + this.f8885e + ')';
    }

    public /* synthetic */ o(Object obj, e eVar, oc.c cVar, Throwable th, int i10) {
        this(obj, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : cVar, (Object) null, (i10 & 16) != 0 ? null : th);
    }
}
