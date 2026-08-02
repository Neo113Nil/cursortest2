package defpackage;

/* loaded from: classes3.dex */
public final class a0i implements wto {
    public final vzh a;
    public final nkt b;
    public final c1c c;

    public a0i(nkt nktVar, c1c c1cVar, vzh vzhVar) {
        this.b = nktVar;
        c1cVar.getClass();
        this.c = c1cVar;
        this.a = vzhVar;
    }

    @Override // defpackage.wto
    public final void a(Object obj) {
        this.b.getClass();
        lkt lktVar = ((o3d) obj).unknownFields;
        if (lktVar.e) {
            lktVar.e = false;
        }
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.wto
    public final boolean b(Object obj) {
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.wto
    public final o3d c() {
        vzh vzhVar = this.a;
        return vzhVar instanceof o3d ? ((o3d) vzhVar).newMutableInstance() : ((g3d) vzhVar.newBuilderForType()).c();
    }

    @Override // defpackage.wto
    public final void d(Object obj, Object obj2) {
        auo.k(this.b, obj, obj2);
    }

    @Override // defpackage.wto
    public final void e(Object obj, n8n n8nVar, z0c z0cVar) {
        this.b.getClass();
        nkt.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.wto
    public final void f(Object obj, rp7 rp7Var) {
        this.c.getClass();
        eta.q(obj);
        throw null;
    }

    @Override // defpackage.wto
    public final boolean g(o3d o3dVar, o3d o3dVar2) {
        this.b.getClass();
        return o3dVar.unknownFields.equals(o3dVar2.unknownFields);
    }

    @Override // defpackage.wto
    public final int h(o3d o3dVar) {
        this.b.getClass();
        return o3dVar.unknownFields.hashCode();
    }

    @Override // defpackage.wto
    public final void i(Object obj, byte[] bArr, int i, int i2, vx0 vx0Var) {
        o3d o3dVar = (o3d) obj;
        if (o3dVar.unknownFields == lkt.f) {
            o3dVar.unknownFields = new lkt();
        }
        throw ouj.g(obj);
    }

    @Override // defpackage.wto
    public final int j(o3d o3dVar) {
        this.b.getClass();
        lkt lktVar = o3dVar.unknownFields;
        int i = lktVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < lktVar.a; i3++) {
            int i4 = lktVar.b[i3] >>> 3;
            i2 += yr4.a(3, (nn3) lktVar.c[i3]) + yr4.f(i4) + yr4.e(2) + (yr4.e(1) * 2);
        }
        lktVar.d = i2;
        return i2;
    }
}
