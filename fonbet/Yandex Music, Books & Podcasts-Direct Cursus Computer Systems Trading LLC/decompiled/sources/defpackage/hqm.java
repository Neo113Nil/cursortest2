package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class hqm extends fqm {
    private static final long serialVersionUID = -4837819299511743149L;
    public final fqm a;
    public final nu1 b;
    public final gqm c;
    public final int d;

    public hqm(nu1 nu1Var, fqm fqmVar, gqm gqmVar, int i) {
        this.a = fqmVar;
        this.b = nu1Var;
        this.c = gqmVar;
        this.d = i;
    }

    @Override // defpackage.fqm
    public final CharSequence a(Context context, int i) {
        return this.a.a(context, i);
    }

    @Override // defpackage.fqm
    public final co6 b() {
        return this.a.b();
    }

    @Override // defpackage.fqm
    public final jzb c() {
        return this.a.c();
    }

    @Override // defpackage.fqm
    public final CharSequence d() {
        return this.a.d();
    }

    @Override // defpackage.fqm
    public final CharSequence e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hqm.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((hqm) obj).b);
    }

    @Override // defpackage.fqm
    public final int f() {
        return this.a.f();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
