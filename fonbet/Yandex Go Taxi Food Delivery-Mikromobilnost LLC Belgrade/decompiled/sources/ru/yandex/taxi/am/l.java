package ru.yandex.taxi.am;

import defpackage.tje;
import defpackage.tjy;
import defpackage.tse;
import defpackage.uj3;
import defpackage.um3;
import defpackage.vj3;

/* loaded from: classes9.dex */
public final class l {
    public final r a;
    public final e b;
    public final g c;
    public final ru.yandex.taxi.startup.launch.h d;
    public final tjy e;
    public final f f;
    public final vj3 g;
    public final AuthStateRepository h;
    public final tse i;

    public l(r rVar, e eVar, g gVar, ru.yandex.taxi.startup.launch.h hVar, tjy tjyVar, f fVar, vj3 vj3Var, AuthStateRepository authStateRepository, tse tseVar) {
        this.a = rVar;
        this.b = eVar;
        this.c = gVar;
        this.d = hVar;
        this.e = tjyVar;
        this.f = fVar;
        this.g = vj3Var;
        this.h = authStateRepository;
        this.i = tseVar;
    }

    public final void a(um3 um3Var) {
        vj3 vj3Var = this.g;
        g gVar = this.c;
        if (gVar.f()) {
            k kVar = gVar.a;
            if (((Boolean) kVar.E.getValue(kVar, k.S[4])).booleanValue() && !gVar.a.Kg()) {
                vj3Var.a("Auth Passport: authorization phone confirmation");
                uj3 uj3Var = new uj3(um3Var, this);
                f fVar = this.f;
                String Ig = this.d.Ig();
                fVar.j = uj3Var;
                fVar.m = true;
                fVar.f.a = true;
                fVar.b(Ig);
                return;
            }
        }
        vj3Var.a("Auth Passport: authorization start login");
        tje.N(this.i, null, null, new AuthPassport$startLoginAuthorization$1(um3Var, this, null), 3);
    }
}
