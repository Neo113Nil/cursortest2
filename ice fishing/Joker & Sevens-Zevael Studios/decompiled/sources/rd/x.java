package rd;

import v.h1;
import v.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6201g;

    /* renamed from: h, reason: collision with root package name */
    public int f6202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v.c f6203i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v.c f6204j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(v.c cVar, v.c cVar2, fc.d dVar, int i10) {
        super(2, dVar);
        this.f6201g = i10;
        this.f6203i = cVar;
        this.f6204j = cVar2;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f6201g) {
            case 0:
                return new x(this.f6203i, this.f6204j, dVar, 0);
            default:
                return new x(this.f6203i, this.f6204j, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f6201g) {
        }
        return ((x) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Float f10;
        o0 i10;
        Float f11;
        h1 j3;
        Float f12;
        o0 i11;
        Float f13;
        h1 j6;
        switch (this.f6201g) {
            case 0:
                int i12 = this.f6202h;
                gc.a aVar = gc.a.f2559g;
                if (i12 == 0) {
                    v6.a.W(obj);
                    Float f14 = new Float(0.88f);
                    h1 j10 = v.d.j(70, 6, null);
                    this.f6202h = 1;
                    if (v.c.c(this.f6203i, f14, j10, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            v6.a.W(obj);
                            f10 = new Float(1.0f);
                            i10 = v.d.i(0.5f, 200.0f, null, 4);
                            this.f6202h = 3;
                            if (v.c.c(this.f6203i, f10, i10, null, this, 12) == aVar) {
                                return aVar;
                            }
                            f11 = new Float(1.0f);
                            j3 = v.d.j(70, 6, null);
                            this.f6202h = 4;
                            if (v.c.c(this.f6204j, f11, j3, null, this, 12) == aVar) {
                            }
                            return ac.o.f277a;
                        }
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return ac.o.f277a;
                        }
                        v6.a.W(obj);
                        f11 = new Float(1.0f);
                        j3 = v.d.j(70, 6, null);
                        this.f6202h = 4;
                        if (v.c.c(this.f6204j, f11, j3, null, this, 12) == aVar) {
                            return aVar;
                        }
                        return ac.o.f277a;
                    }
                    v6.a.W(obj);
                }
                Float f15 = new Float(0.7f);
                h1 j11 = v.d.j(70, 6, null);
                this.f6202h = 2;
                if (v.c.c(this.f6204j, f15, j11, null, this, 12) == aVar) {
                    return aVar;
                }
                f10 = new Float(1.0f);
                i10 = v.d.i(0.5f, 200.0f, null, 4);
                this.f6202h = 3;
                if (v.c.c(this.f6203i, f10, i10, null, this, 12) == aVar) {
                }
                f11 = new Float(1.0f);
                j3 = v.d.j(70, 6, null);
                this.f6202h = 4;
                if (v.c.c(this.f6204j, f11, j3, null, this, 12) == aVar) {
                }
                return ac.o.f277a;
            default:
                int i13 = this.f6202h;
                gc.a aVar2 = gc.a.f2559g;
                if (i13 == 0) {
                    v6.a.W(obj);
                    Float f16 = new Float(0.85f);
                    h1 j12 = v.d.j(90, 6, null);
                    this.f6202h = 1;
                    if (v.c.c(this.f6203i, f16, j12, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            v6.a.W(obj);
                            f12 = new Float(1.0f);
                            i11 = v.d.i(0.75f, 200.0f, null, 4);
                            this.f6202h = 3;
                            if (v.c.c(this.f6203i, f12, i11, null, this, 12) == aVar2) {
                                return aVar2;
                            }
                            f13 = new Float(1.0f);
                            j6 = v.d.j(80, 6, null);
                            this.f6202h = 4;
                            if (v.c.c(this.f6204j, f13, j6, null, this, 12) == aVar2) {
                            }
                            return ac.o.f277a;
                        }
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return ac.o.f277a;
                        }
                        v6.a.W(obj);
                        f13 = new Float(1.0f);
                        j6 = v.d.j(80, 6, null);
                        this.f6202h = 4;
                        if (v.c.c(this.f6204j, f13, j6, null, this, 12) == aVar2) {
                            return aVar2;
                        }
                        return ac.o.f277a;
                    }
                    v6.a.W(obj);
                }
                Float f17 = new Float(0.7f);
                h1 j13 = v.d.j(90, 6, null);
                this.f6202h = 2;
                if (v.c.c(this.f6204j, f17, j13, null, this, 12) == aVar2) {
                    return aVar2;
                }
                f12 = new Float(1.0f);
                i11 = v.d.i(0.75f, 200.0f, null, 4);
                this.f6202h = 3;
                if (v.c.c(this.f6203i, f12, i11, null, this, 12) == aVar2) {
                }
                f13 = new Float(1.0f);
                j6 = v.d.j(80, 6, null);
                this.f6202h = 4;
                if (v.c.c(this.f6204j, f13, j6, null, this, 12) == aVar2) {
                }
                return ac.o.f277a;
        }
    }
}
