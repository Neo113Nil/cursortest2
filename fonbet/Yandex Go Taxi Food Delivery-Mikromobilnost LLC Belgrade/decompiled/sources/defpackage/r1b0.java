package defpackage;

import androidx.compose.runtime.h;

/* loaded from: classes.dex */
public final class r1b0 extends b2b0 implements hud {
    public static final r1b0 w = new r1b0(ce11.e, 0);

    @Override // defpackage.b2b0
    public final d2b0 a() {
        q1b0 q1b0Var = new q1b0(this);
        q1b0Var.z = this;
        return q1b0Var;
    }

    @Override // defpackage.b2b0
    public final d2b0 b() {
        q1b0 q1b0Var = new q1b0(this);
        q1b0Var.z = this;
        return q1b0Var;
    }

    @Override // defpackage.b2b0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof h) {
            return super.containsKey((h) obj);
        }
        return false;
    }

    @Override // defpackage.b2b0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j131) {
            return super.containsValue((j131) obj);
        }
        return false;
    }

    public final r1b0 d(h hVar, j131 j131Var) {
        ysl u = this.a.u(hVar.hashCode(), hVar, j131Var, 0);
        return u == null ? this : new r1b0((ce11) u.b, this.b + u.a);
    }

    @Override // defpackage.b2b0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof h) {
            return (j131) super.get((h) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof h) ? obj2 : (j131) super.getOrDefault((h) obj, (j131) obj2);
    }
}
