package u;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6627b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6628c;

    public o0(h0 h0Var, l0 l0Var, boolean z10, Map map) {
        this.f6626a = h0Var;
        this.f6627b = z10;
        this.f6628c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return pc.j.a(this.f6626a, o0Var.f6626a) && pc.j.a(null, null) && this.f6627b == o0Var.f6627b && pc.j.a(this.f6628c, o0Var.f6628c);
    }

    public final int hashCode() {
        h0 h0Var = this.f6626a;
        return this.f6628c.hashCode() + a4.d.d((((h0Var == null ? 0 : h0Var.hashCode()) * 29791) + 0) * 31, 31, this.f6627b);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f6626a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", hold=" + this.f6627b + ", effectsMap=" + this.f6628c + ')';
    }

    public /* synthetic */ o0(h0 h0Var, l0 l0Var, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : h0Var, (i10 & 8) != 0 ? null : l0Var, (i10 & 16) == 0, (i10 & 32) != 0 ? bc.w.f1068g : linkedHashMap);
    }
}
