package ru.yandex.taxi.logistics.sdk.tracking.preparer;

import defpackage.a701;
import defpackage.b701;
import defpackage.bvf0;
import defpackage.c701;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.tje;
import defpackage.w511;
import defpackage.z501;
import defpackage.z601;
import defpackage.zgz0;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;

/* loaded from: classes5.dex */
public final class a {
    public final c701 a;
    public final z501 b;
    public final d c;
    public final ike d = bvf0.b();
    public final i3y e = kotlin.a.a(new zgz0(16, this));

    public a(z501 z501Var, c701 c701Var, d dVar) {
        this.a = c701Var;
        this.b = z501Var;
        this.c = dVar;
    }

    public final void a() {
        c701 c701Var = this.a;
        if (c701Var instanceof b701) {
            this.b.a(((b701) c701Var).a).b().b();
        } else if (c701Var instanceof z601) {
            tje.N(this.d, null, null, new TrackingPreparerRepositoryImpl$update$1(null, this), 3);
        } else {
            if (jl40.l(c701Var, a701.a)) {
                return;
            }
            w511.b();
        }
    }
}
