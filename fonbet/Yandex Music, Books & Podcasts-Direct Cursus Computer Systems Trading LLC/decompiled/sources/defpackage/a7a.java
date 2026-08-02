package defpackage;

import android.os.Parcelable;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class a7a implements z6a {
    public final aab a;
    public final y6a b;
    public final jyr c;
    public final by7 d;

    /* JADX WARN: Multi-variable type inference failed */
    public a7a(int i, aab aabVar, y6a y6aVar) {
        pjc d;
        int i2;
        aabVar.getClass();
        this.a = aabVar;
        this.b = y6aVar;
        jyr b = l18.b.b(hag.I(i7a.class), true);
        this.c = b;
        i7a i7aVar = (i7a) b.getValue();
        i7aVar.getClass();
        jyr jyrVar = i7aVar.f;
        boolean z = aabVar instanceof lt;
        if (z) {
            d = ((g2q) jyrVar.getValue()).b.d(((lt) aabVar).a);
        } else if (aabVar instanceof u51) {
            d = ((g2q) jyrVar.getValue()).c.d(((u51) aabVar).a);
        } else {
            if (!(aabVar instanceof eul)) {
                b6e.s();
                throw null;
            }
            d = ((g2q) jyrVar.getValue()).d.d(((eul) aabVar).d());
        }
        h7a h7aVar = new h7a(d, i, 0);
        tf6 tf6Var = i7aVar.e;
        if (aabVar instanceof u51) {
            i2 = i7aVar.c().n(((u51) aabVar).a);
        } else if (z) {
            i2 = i7aVar.c().l(((lt) aabVar).a);
        } else {
            if (!(aabVar instanceof eul)) {
                b6e.s();
                throw null;
            }
            Parcelable.Creator<nvl> creator = nvl.CREATOR;
            nvl x = wxf.x(((eul) aabVar).f);
            i2 = x != null ? i7aVar.c().p(x) : 0;
        }
        j1g j1gVar = i2 != 0 ? j1g.a : j1g.b;
        int i3 = i2 + i;
        this.d = asq.K(lg3.u0(h7aVar, tf6Var, new m1g(j1gVar, i3 >= 0 ? i3 : 0)), new c68(12));
    }

    @Override // defpackage.z6a
    public final vdr b() {
        return this.d;
    }

    @Override // defpackage.z6a
    public final void c(int i, boolean z) {
        y6a y6aVar = this.b;
        if (y6aVar != null) {
            y6aVar.c(i, z);
        }
        i7a i7aVar = (i7a) this.c.getValue();
        i7aVar.getClass();
        aab aabVar = this.a;
        aabVar.getClass();
        x97.y(i7aVar.e, null, null, new j57(aabVar, i7aVar, (Continuation) null, 15), 3);
    }
}
