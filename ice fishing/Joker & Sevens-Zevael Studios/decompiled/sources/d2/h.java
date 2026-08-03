package d2;

import ac.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f1646a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1647b;

    /* renamed from: c, reason: collision with root package name */
    public float f1648c;

    public h(int i10, c cVar) {
        this.f1646a = i10;
        this.f1647b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f10, hc.c cVar) {
        g gVar;
        int i10;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f1645i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f1645i = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f1643g;
                i10 = gVar.f1645i;
                if (i10 != 0) {
                    v6.a.W(obj);
                    Float f11 = new Float(f10);
                    gVar.f1645i = 1;
                    obj = this.f1647b.invoke(f11, gVar);
                    gc.a aVar = gc.a.f2559g;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                this.f1648c += ((Number) obj).floatValue();
                return o.f277a;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f1643g;
        i10 = gVar.f1645i;
        if (i10 != 0) {
        }
        this.f1648c += ((Number) obj2).floatValue();
        return o.f277a;
    }
}
