package u;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f6596b = new f0(new o0((h0) null, (l0) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));

    /* renamed from: a, reason: collision with root package name */
    public final o0 f6597a;

    public f0(o0 o0Var) {
        this.f6597a = o0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f0) && pc.j.a(((f0) obj).f6597a, this.f6597a);
    }

    public final int hashCode() {
        return this.f6597a.hashCode();
    }

    public final String toString() {
        if (equals(f6596b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        h0 h0Var = this.f6597a.f6626a;
        sb.append(h0Var != null ? h0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
