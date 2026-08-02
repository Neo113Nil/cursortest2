package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class uoc0 implements b050 {
    public final pax0 a;
    public final String b;

    public uoc0(pax0 pax0Var, String str) {
        this.a = pax0Var;
        this.b = str;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("targetingInput");
        l80.a(foe.i).a(bfxVar, cVar, this.a);
        bfxVar.A1("actionToken");
        bfxVar.r0(this.b);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(voc0.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation PlaquePerformAction($targetingInput: TargetingInput!, $actionToken: String!) { plaquePerformAction(input: { actionToken: $actionToken targeting: $targetingInput } ) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoc0)) {
            return false;
        }
        uoc0 uoc0Var = (uoc0) obj;
        return jl40.l(this.a, uoc0Var.a) && jl40.l(this.b, uoc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "2b24ad7a0e5c4d7084195bca13c370222a500dd2be90c733ba98bea23eba7a5f";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "PlaquePerformAction";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaquePerformActionMutation(targetingInput=");
        sb.append(this.a);
        sb.append(", actionToken=");
        return b64.p(sb, this.b, ')');
    }
}
