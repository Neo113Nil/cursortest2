package r0;

import D.C0016q;

/* renamed from: r0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255p implements N0.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N0.e f2905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2906h;

    public /* synthetic */ C0255p(N0.e eVar, G.d dVar, int i2) {
        this.f2904f = i2;
        this.f2905g = eVar;
        this.f2906h = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    @Override // N0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, v0.d dVar) {
        C0254o c0254o;
        int i2;
        u uVar;
        int i3;
        y yVar;
        int i4;
        C0227A c0227a;
        int i5;
        N0.n nVar;
        int i6;
        boolean z2;
        Object obj2;
        Object obj3;
        C0255p c0255p;
        switch (this.f2904f) {
            case 0:
                if (dVar instanceof C0254o) {
                    c0254o = (C0254o) dVar;
                    int i7 = c0254o.f2902j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0254o.f2902j = i7 - Integer.MIN_VALUE;
                        Object obj4 = c0254o.f2901i;
                        w0.a aVar = w0.a.f3071f;
                        i2 = c0254o.f2902j;
                        if (i2 != 0) {
                            o.g.C(obj4);
                            Object c2 = ((G.b) obj).c((G.d) this.f2906h);
                            c0254o.f2902j = 1;
                            if (this.f2905g.b(c2, c0254o) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj4);
                        }
                        return t0.g.f2989a;
                    }
                }
                c0254o = new C0254o(this, dVar);
                Object obj42 = c0254o.f2901i;
                w0.a aVar2 = w0.a.f3071f;
                i2 = c0254o.f2902j;
                if (i2 != 0) {
                }
                return t0.g.f2989a;
            case 1:
                if (dVar instanceof u) {
                    uVar = (u) dVar;
                    int i8 = uVar.f2924j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        uVar.f2924j = i8 - Integer.MIN_VALUE;
                        Object obj5 = uVar.f2923i;
                        w0.a aVar3 = w0.a.f3071f;
                        i3 = uVar.f2924j;
                        if (i3 != 0) {
                            o.g.C(obj5);
                            Object c3 = ((G.b) obj).c((G.d) this.f2906h);
                            uVar.f2924j = 1;
                            if (this.f2905g.b(c3, uVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj5);
                        }
                        return t0.g.f2989a;
                    }
                }
                uVar = new u(this, dVar);
                Object obj52 = uVar.f2923i;
                w0.a aVar32 = w0.a.f3071f;
                i3 = uVar.f2924j;
                if (i3 != 0) {
                }
                return t0.g.f2989a;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i9 = yVar.f2943j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yVar.f2943j = i9 - Integer.MIN_VALUE;
                        Object obj6 = yVar.f2942i;
                        w0.a aVar4 = w0.a.f3071f;
                        i4 = yVar.f2943j;
                        if (i4 != 0) {
                            o.g.C(obj6);
                            Object c4 = ((G.b) obj).c((G.d) this.f2906h);
                            yVar.f2943j = 1;
                            if (this.f2905g.b(c4, yVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj6);
                        }
                        return t0.g.f2989a;
                    }
                }
                yVar = new y(this, dVar);
                Object obj62 = yVar.f2942i;
                w0.a aVar42 = w0.a.f3071f;
                i4 = yVar.f2943j;
                if (i4 != 0) {
                }
                return t0.g.f2989a;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof C0227A) {
                    c0227a = (C0227A) dVar;
                    int i10 = c0227a.f2823j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0227a.f2823j = i10 - Integer.MIN_VALUE;
                        Object obj7 = c0227a.f2822i;
                        w0.a aVar5 = w0.a.f3071f;
                        i5 = c0227a.f2823j;
                        if (i5 != 0) {
                            o.g.C(obj7);
                            Object c5 = ((G.b) obj).c((G.d) this.f2906h);
                            c0227a.f2823j = 1;
                            if (this.f2905g.b(c5, c0227a) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj7);
                        }
                        return t0.g.f2989a;
                    }
                }
                c0227a = new C0227A(this, dVar);
                Object obj72 = c0227a.f2822i;
                w0.a aVar52 = w0.a.f3071f;
                i5 = c0227a.f2823j;
                if (i5 != 0) {
                }
                return t0.g.f2989a;
            default:
                if (dVar instanceof N0.n) {
                    nVar = (N0.n) dVar;
                    int i11 = nVar.f789k;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f789k = i11 - Integer.MIN_VALUE;
                        Object obj8 = nVar.f788j;
                        w0.a aVar6 = w0.a.f3071f;
                        i6 = nVar.f789k;
                        z2 = true;
                        if (i6 != 0) {
                            o.g.C(obj8);
                            nVar.f787i = this;
                            nVar.f791m = obj;
                            nVar.f789k = 1;
                            Object f2 = ((C0016q) this.f2906h).f(obj, nVar);
                            if (f2 == aVar6) {
                                return aVar6;
                            }
                            obj2 = f2;
                            obj3 = obj;
                            c0255p = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0255p = nVar.f787i;
                                o.g.C(obj8);
                                if (z2) {
                                    return t0.g.f2989a;
                                }
                                throw new O0.a(c0255p);
                            }
                            Object obj9 = nVar.f791m;
                            C0255p c0255p2 = nVar.f787i;
                            o.g.C(obj8);
                            obj3 = obj9;
                            c0255p = c0255p2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            N0.e eVar = c0255p.f2905g;
                            nVar.f787i = c0255p;
                            nVar.f791m = null;
                            nVar.f789k = 2;
                            if (eVar.b(obj3, nVar) == aVar6) {
                                return aVar6;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                nVar = new N0.n(this, dVar);
                Object obj82 = nVar.f788j;
                w0.a aVar62 = w0.a.f3071f;
                i6 = nVar.f789k;
                z2 = true;
                if (i6 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0255p(C0016q c0016q, N0.e eVar) {
        this.f2904f = 4;
        this.f2906h = c0016q;
        this.f2905g = eVar;
    }
}
