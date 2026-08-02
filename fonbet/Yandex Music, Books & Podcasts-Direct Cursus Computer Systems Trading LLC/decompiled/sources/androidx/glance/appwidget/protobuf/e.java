package androidx.glance.appwidget.protobuf;

import defpackage.d1c;
import defpackage.eta;
import defpackage.h3d;
import defpackage.jzi;
import defpackage.mkt;
import defpackage.n8n;
import defpackage.qn3;
import defpackage.x0c;
import defpackage.xr4;
import defpackage.xto;

/* loaded from: classes.dex */
public final class e implements xto {
    public final a a;
    public final g b;
    public final d1c c;

    public e(g gVar, d1c d1cVar, a aVar) {
        this.b = gVar;
        d1cVar.getClass();
        this.c = d1cVar;
        this.a = aVar;
    }

    @Override // defpackage.xto
    public final void a(Object obj) {
        this.b.getClass();
        mkt mktVar = ((b) obj).unknownFields;
        if (mktVar.e) {
            mktVar.e = false;
        }
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.xto
    public final boolean b(Object obj) {
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.xto
    public final b c() {
        a aVar = this.a;
        return aVar instanceof b ? ((b) aVar).h() : ((h3d) ((b) aVar).b(5)).c();
    }

    @Override // defpackage.xto
    public final void d(Object obj, Object obj2) {
        f.k(this.b, obj, obj2);
    }

    @Override // defpackage.xto
    public final void e(Object obj, n8n n8nVar, x0c x0cVar) {
        this.b.getClass();
        g.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.xto
    public final int f(b bVar) {
        this.b.getClass();
        return bVar.unknownFields.hashCode();
    }

    @Override // defpackage.xto
    public final int g(b bVar) {
        this.b.getClass();
        mkt mktVar = bVar.unknownFields;
        int i = mktVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < mktVar.a; i3++) {
            int i4 = mktVar.b[i3] >>> 3;
            i2 += xr4.f(3, (qn3) mktVar.c[i3]) + xr4.i(i4) + xr4.h(2) + (xr4.h(1) * 2);
        }
        mktVar.d = i2;
        return i2;
    }

    @Override // defpackage.xto
    public final void h(Object obj, jzi jziVar) {
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.xto
    public final boolean i(b bVar, b bVar2) {
        this.b.getClass();
        return bVar.unknownFields.equals(bVar2.unknownFields);
    }
}
