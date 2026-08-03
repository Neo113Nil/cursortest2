package u0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f6671a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f6671a);
        sb.append(")@");
        int hashCode = hashCode();
        u2.b.i(16);
        String num = Integer.toString(hashCode, 16);
        pc.j.d(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }
}
