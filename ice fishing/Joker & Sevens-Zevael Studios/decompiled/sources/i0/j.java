package i0;

import m0.l1;
import m0.z;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public e1.b f2962a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2963b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2964c;

    /* renamed from: d, reason: collision with root package name */
    public Float f2965d;

    /* renamed from: e, reason: collision with root package name */
    public e1.b f2966e;

    /* renamed from: f, reason: collision with root package name */
    public final v.c f2967f = v.d.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public final v.c f2968g = v.d.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public final v.c f2969h = v.d.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public final yc.m f2970i;

    /* renamed from: j, reason: collision with root package name */
    public final l1 f2971j;

    /* renamed from: k, reason: collision with root package name */
    public final l1 f2972k;

    public j(e1.b bVar, float f10, boolean z10) {
        this.f2962a = bVar;
        this.f2963b = f10;
        this.f2964c = z10;
        yc.m mVar = new yc.m(true);
        mVar.P(null);
        this.f2970i = mVar;
        Boolean bool = Boolean.FALSE;
        this.f2971j = z.s(bool);
        this.f2972k = z.s(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r9.d0(r0) != r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hc.c cVar) {
        g gVar;
        int i10;
        j jVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f2955j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f2955j = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f2953h;
                i10 = gVar.f2955j;
                ac.o oVar = ac.o.f277a;
                fc.d dVar = null;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    gVar.f2952g = this;
                    gVar.f2955j = 1;
                    Object e10 = a0.e(new i(this, dVar, 0), gVar);
                    if (e10 != aVar) {
                        e10 = oVar;
                    }
                    if (e10 != aVar) {
                        jVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return oVar;
                    }
                    jVar = gVar.f2952g;
                    v6.a.W(obj);
                    gVar.f2952g = null;
                    gVar.f2955j = 3;
                    jVar.getClass();
                    Object e11 = a0.e(new i(jVar, dVar, 1), gVar);
                    if (e11 != aVar) {
                        e11 = oVar;
                    }
                    return e11 == aVar ? aVar : oVar;
                }
                jVar = gVar.f2952g;
                v6.a.W(obj);
                jVar.f2971j.setValue(Boolean.TRUE);
                yc.m mVar = jVar.f2970i;
                gVar.f2952g = jVar;
                gVar.f2955j = 2;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f2953h;
        i10 = gVar.f2955j;
        ac.o oVar2 = ac.o.f277a;
        fc.d dVar2 = null;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        jVar.f2971j.setValue(Boolean.TRUE);
        yc.m mVar2 = jVar.f2970i;
        gVar.f2952g = jVar;
        gVar.f2955j = 2;
    }
}
