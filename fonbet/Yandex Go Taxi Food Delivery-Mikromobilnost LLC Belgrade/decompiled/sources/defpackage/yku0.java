package defpackage;

import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class yku0 extends vgb1 {
    public final String a;
    public final JSONArray b;

    public yku0(String str, JSONArray jSONArray) {
        this.a = str;
        this.b = jSONArray;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yku0)) {
            return false;
        }
        yku0 yku0Var = (yku0) obj;
        return jl40.l(this.a, yku0Var.a) && jl40.l(this.b, yku0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArrayStoredValue(name=" + this.a + ", value=" + this.b + ')';
    }
}
