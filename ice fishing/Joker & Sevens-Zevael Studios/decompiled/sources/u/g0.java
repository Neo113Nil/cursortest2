package u;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f6599b = new g0(new o0((h0) null, (l0) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f6600c = new g0(new o0((h0) (0 == true ? 1 : 0), (l0) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 47));

    /* renamed from: a, reason: collision with root package name */
    public final o0 f6601a;

    public g0(o0 o0Var) {
        this.f6601a = o0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && pc.j.a(((g0) obj).f6601a, this.f6601a);
    }

    public final int hashCode() {
        return this.f6601a.hashCode();
    }

    public final String toString() {
        if (equals(f6599b)) {
            return "ExitTransition.None";
        }
        if (equals(f6600c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        o0 o0Var = this.f6601a;
        h0 h0Var = o0Var.f6626a;
        sb.append(h0Var != null ? h0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(o0Var.f6627b);
        return sb.toString();
    }
}
