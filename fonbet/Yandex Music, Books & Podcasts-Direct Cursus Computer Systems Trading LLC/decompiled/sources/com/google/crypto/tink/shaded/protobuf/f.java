package com.google.crypto.tink.shaded.protobuf;

import defpackage.b1c;
import defpackage.d8;
import defpackage.eta;
import defpackage.f3d;
import defpackage.kkt;
import defpackage.mn3;
import defpackage.n8n;
import defpackage.okt;
import defpackage.ouj;
import defpackage.vto;
import defpackage.wx0;
import defpackage.y0c;

/* loaded from: classes3.dex */
public final class f implements vto {
    public final d8 a;
    public final okt b;
    public final b1c c;

    public f(okt oktVar, b1c b1cVar, d8 d8Var) {
        this.b = oktVar;
        b1cVar.getClass();
        this.c = b1cVar;
        this.a = d8Var;
    }

    @Override // defpackage.vto
    public final void a(Object obj) {
        this.b.getClass();
        ((c) obj).unknownFields.e = false;
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.vto
    public final boolean b(Object obj) {
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.vto
    public final Object c() {
        return ((f3d) ((c) this.a).f(5)).c();
    }

    @Override // defpackage.vto
    public final void d(Object obj, n8n n8nVar, y0c y0cVar) {
        this.b.getClass();
        c cVar = (c) obj;
        if (cVar.unknownFields == kkt.f) {
            cVar.unknownFields = kkt.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.vto
    public final void e(Object obj, b bVar) {
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.vto
    public final int f(d8 d8Var) {
        this.b.getClass();
        kkt kktVar = ((c) d8Var).unknownFields;
        int i = kktVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < kktVar.a; i3++) {
            int i4 = kktVar.b[i3] >>> 3;
            i2 += a.a(3, (mn3) kktVar.c[i3]) + a.i(i4) + a.h(2) + (a.h(1) * 2);
        }
        kktVar.d = i2;
        return i2;
    }

    @Override // defpackage.vto
    public final boolean g(c cVar, c cVar2) {
        this.b.getClass();
        return cVar.unknownFields.equals(cVar2.unknownFields);
    }

    @Override // defpackage.vto
    public final int h(c cVar) {
        this.b.getClass();
        return cVar.unknownFields.hashCode();
    }

    @Override // defpackage.vto
    public final void i(Object obj, byte[] bArr, int i, int i2, wx0 wx0Var) {
        c cVar = (c) obj;
        if (cVar.unknownFields == kkt.f) {
            cVar.unknownFields = kkt.b();
        }
        throw ouj.g(obj);
    }

    @Override // defpackage.vto
    public final void j(c cVar, c cVar2) {
        g.x(this.b, cVar, cVar2);
    }
}
