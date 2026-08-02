package ru.yandex.taxi.plus.repository;

import defpackage.aqp0;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.ike;
import defpackage.jl40;
import defpackage.n5c;
import defpackage.tje;
import defpackage.uyj;
import ru.yandex.taxi.cashback.sdk.c0;

/* loaded from: classes9.dex */
public final class e {
    public final aqp0 a;
    public final c0 b;
    public final f c;
    public final ru.yandex.taxi.plus.repository.mappers.d d;
    public final n5c e;
    public ike f;

    public e(aqp0 aqp0Var, c0 c0Var, f fVar, ru.yandex.taxi.plus.repository.mappers.d dVar, n5c n5cVar) {
        this.a = aqp0Var;
        this.b = c0Var;
        this.c = fVar;
        this.d = dVar;
        this.e = n5cVar;
    }

    public final void a() {
        ike a = bvf0.a(cvw.U(jl40.a(), uyj.a));
        this.f = a;
        tje.N(a, null, null, new SdkResponseInteractor$startTypedScreensProcessing$1(this, null), 3);
        ike ikeVar = this.f;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new SdkResponseInteractor$startClosedBadgesScreenUpdater$1(this, null), 3);
        }
    }
}
