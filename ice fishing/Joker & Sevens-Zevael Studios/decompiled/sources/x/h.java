package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final c0.b f7796a;

    /* renamed from: b, reason: collision with root package name */
    public final yc.g f7797b;

    public h(c0.b bVar, yc.g gVar) {
        this.f7796a = bVar;
        this.f7797b = gVar;
    }

    public final String toString() {
        yc.g gVar = this.f7797b;
        if (gVar.f8849k.v(yc.x.f8914h) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        u2.b.i(16);
        String num = Integer.toString(hashCode, 16);
        pc.j.d(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f7796a.invoke());
        sb.append(", continuation=");
        sb.append(gVar);
        sb.append(')');
        return sb.toString();
    }
}
