package defpackage;

import kotlinx.datetime.LocalDateTime;

/* loaded from: classes4.dex */
public final class w2z extends e7 {
    public final od7 a;

    public w2z(od7 od7Var) {
        this.a = od7Var;
    }

    @Override // defpackage.e7
    public final od7 a() {
        return this.a;
    }

    @Override // defpackage.e7
    public final fpe b() {
        return x2z.b;
    }

    @Override // defpackage.e7
    public final Object d(fpe fpeVar) {
        kqv kqvVar = (kqv) fpeVar;
        return new LocalDateTime(kqvVar.a.c(), kqvVar.b.b());
    }
}
