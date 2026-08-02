package defpackage;

/* loaded from: classes5.dex */
public final class jv0 {
    public final jyr a;
    public final jyr b;

    public jv0(jyr jyrVar, jyr jyrVar2) {
        this.a = jyrVar;
        this.b = jyrVar2;
    }

    public final wb7 a(String str) {
        v02 v02Var = (v02) ((uz1) this.b.getValue()).d.a.getValue();
        if (v02Var == null) {
            return null;
        }
        return ((dc7) ((cc7) this.a.getValue())).c(String.valueOf(v02Var.a), str);
    }
}
