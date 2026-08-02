package androidx.media3.exoplayer.source;

import defpackage.atc;
import defpackage.ois;
import defpackage.ris;
import defpackage.sis;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends atc {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public a(sis sisVar, Object obj, Object obj2) {
        super(sisVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.atc, defpackage.sis
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.atc, defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        this.e.f(i, oisVar, z);
        if (Objects.equals(oisVar.b, this.g) && z) {
            oisVar.b = h;
        }
        return oisVar;
    }

    @Override // defpackage.atc, defpackage.sis
    public final Object l(int i) {
        Object l = this.e.l(i);
        return Objects.equals(l, this.g) ? h : l;
    }

    @Override // defpackage.atc, defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        this.e.m(i, risVar, j);
        if (Objects.equals(risVar.a, this.f)) {
            risVar.a = ris.q;
        }
        return risVar;
    }
}
