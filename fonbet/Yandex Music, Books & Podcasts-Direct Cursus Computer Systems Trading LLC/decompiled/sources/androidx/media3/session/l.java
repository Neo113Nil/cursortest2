package androidx.media3.session;

import defpackage.dvt;
import defpackage.fnh;
import defpackage.lrl;
import defpackage.ois;
import defpackage.onh;
import defpackage.ris;
import defpackage.sis;

/* loaded from: classes.dex */
public final class l extends sis {
    public static final Object k = new Object();
    public final onh e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final fnh i;
    public final long j;

    public l(lrl lrlVar) {
        this.e = lrlVar.M0();
        this.f = lrlVar.d1();
        this.g = lrlVar.W0();
        this.h = !lrlVar.V().p() && lrlVar.V().m(lrlVar.v0(), new ris(), 0L).k;
        this.i = lrlVar.h1() ? fnh.f : null;
        this.j = dvt.Y(lrlVar.o());
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        long j = this.j;
        Object obj = k;
        oisVar.i(0, j, 0L, obj, obj);
        oisVar.f = this.h;
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return 1;
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        return k;
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        risVar.b(k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.i, 0L, this.j, 0, 0, 0L);
        risVar.k = this.h;
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return 1;
    }
}
