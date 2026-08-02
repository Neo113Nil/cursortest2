package defpackage;

import androidx.media3.exoplayer.source.a;

/* loaded from: classes.dex */
public final class fch extends sis {
    public final onh e;

    public fch(onh onhVar) {
        this.e = onhVar;
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        return obj == a.h ? 0 : -1;
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        oisVar.j(z ? 0 : null, z ? a.h : null, 0, -9223372036854775807L, 0L, lj.f, true);
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return 1;
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        return a.h;
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        risVar.b(ris.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        risVar.k = true;
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return 1;
    }
}
