package defpackage;

import com.yandex.media.ynison.service.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class raq extends maq {
    public final oaq b;
    public final List c;
    public final int d;
    public final x e;

    public raq(oaq oaqVar, List list, int i, x xVar) {
        list.getClass();
        this.b = oaqVar;
        this.c = list;
        this.d = i;
        this.e = xVar;
    }

    public static raq m(raq raqVar, int i) {
        oaq oaqVar = raqVar.b;
        List list = raqVar.c;
        x xVar = raqVar.e;
        list.getClass();
        return new raq(oaqVar, list, i, xVar);
    }

    @Override // defpackage.n7q
    public final mwk b() {
        return (qaq) this.c.get(this.d);
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return a3l.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raq)) {
            return false;
        }
        raq raqVar = (raq) obj;
        return this.b.equals(raqVar.b) && Intrinsics.d(this.c, raqVar.c) && this.d == raqVar.d && this.e.equals(raqVar.e);
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.b;
    }

    @Override // defpackage.maq
    public final faq h() {
        return (qaq) this.c.get(this.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1d.a(this.d, this.c.hashCode() * 31, 31);
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

    public final String toString() {
        return "SharedYnisonUnknownState(playbackEntity=" + this.b + ", currentPlayableIndex=" + this.d + ", playables=" + w1g.J(this.c) + ", rawQueue=" + this.e + ")";
    }
}
