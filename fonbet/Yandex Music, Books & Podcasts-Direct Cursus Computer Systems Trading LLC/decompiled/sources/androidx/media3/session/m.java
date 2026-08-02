package androidx.media3.session;

import defpackage.dvt;
import defpackage.ois;
import defpackage.onh;
import defpackage.pcn;
import defpackage.qsn;
import defpackage.ris;
import defpackage.sis;
import defpackage.tde;
import defpackage.ude;
import defpackage.yde;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends sis {
    public static final m g;
    public static final Object h;
    public final yde e;
    public final pcn f;

    static {
        ude udeVar = yde.b;
        g = new m(qsn.e, null);
        h = new Object();
    }

    public m(yde ydeVar, pcn pcnVar) {
        this.e = ydeVar;
        this.f = pcnVar;
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sis
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.e, mVar.e) && Objects.equals(this.f, mVar.f);
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        pcn s = s(i);
        oisVar.i(i, dvt.Y(s.c), 0L, Long.valueOf(s.b), null);
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return o();
    }

    @Override // defpackage.sis
    public final int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        pcn s = s(i);
        risVar.b(h, s.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, dvt.Y(s.c), i, i, 0L);
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final m q(List list, int i) {
        tde tdeVar = new tde(4);
        yde ydeVar = this.e;
        tdeVar.c(ydeVar.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            tdeVar.a(new pcn((onh) list.get(i2), -1L, -9223372036854775807L));
        }
        tdeVar.c(ydeVar.subList(i, ydeVar.size()));
        return new m(tdeVar.f(), this.f);
    }

    public final long r(int i) {
        if (i < 0) {
            return -1L;
        }
        yde ydeVar = this.e;
        if (i < ydeVar.size()) {
            return ((pcn) ydeVar.get(i)).b;
        }
        return -1L;
    }

    public final pcn s(int i) {
        pcn pcnVar;
        yde ydeVar = this.e;
        return (i != ydeVar.size() || (pcnVar = this.f) == null) ? (pcn) ydeVar.get(i) : pcnVar;
    }
}
