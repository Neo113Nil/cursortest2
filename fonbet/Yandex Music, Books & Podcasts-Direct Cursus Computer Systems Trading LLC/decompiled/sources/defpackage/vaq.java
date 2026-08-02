package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class vaq extends maq {
    public final taq b;
    public final List c;
    public final int d;
    public final gxc e;
    public final String f;
    public final b3l g;

    public vaq(taq taqVar, List list, int i, gxc gxcVar, String str, b3l b3lVar) {
        this.b = taqVar;
        this.c = list;
        this.d = i;
        this.e = gxcVar;
        this.f = str;
        this.g = b3lVar;
    }

    public static vaq m(vaq vaqVar, List list, int i) {
        return new vaq(vaqVar.b, list, i, vaqVar.e, vaqVar.f, vaqVar.g);
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaq)) {
            return false;
        }
        vaq vaqVar = (vaq) obj;
        return this.b.equals(vaqVar.b) && this.c.equals(vaqVar.c) && this.d == vaqVar.d && this.e.equals(vaqVar.e) && this.f.equals(vaqVar.f) && this.g.equals(vaqVar.g);
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + k5r.c((this.e.hashCode() + f1d.a(this.d, k5r.d(this.b.a.hashCode() * 31, 31, this.c), 31)) * 31, 31, this.f);
    }

    @Override // defpackage.maq
    public final int i() {
        return this.d;
    }

    @Override // defpackage.maq
    public final List j() {
        return this.c;
    }

    @Override // defpackage.maq
    public final f5q k() {
        return this.b;
    }

    @Override // defpackage.maq
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final saq b() {
        return (saq) this.c.get(this.d);
    }

    public final saq o() {
        Integer q = q(1);
        if (q == null) {
            return null;
        }
        return (saq) CollectionsKt.S(this.c, q.intValue());
    }

    public final saq p() {
        Integer q = q(-1);
        if (q == null) {
            return null;
        }
        return (saq) CollectionsKt.S(this.c, q.intValue());
    }

    public final Integer q(int i) {
        int i2 = this.d + i;
        Integer valueOf = Integer.valueOf(i2);
        if (i2 < 0 || i2 >= this.c.size()) {
            return null;
        }
        return valueOf;
    }

    public final String toString() {
        saq p = p();
        saq b = b();
        saq o = o();
        String J = w1g.J(this.c);
        StringBuilder sb = new StringBuilder("SharedYnisonVideoWaveState(playbackEntity=");
        sb.append(this.b);
        sb.append(", previous=");
        sb.append(p);
        sb.append(", current=");
        sb.append(b);
        sb.append(", pending=");
        sb.append(o);
        sb.append(", currentPlayableIndex=");
        sb.append(this.d);
        sb.append(", playables=");
        sb.append(J);
        sb.append(", from='");
        return su4.o(sb, this.f, "')");
    }
}
