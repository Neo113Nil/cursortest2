package r0;

import D.C0016q;
import t0.C0252g;

/* renamed from: r0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242n implements O0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O0.e f2904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2905g;

    public /* synthetic */ C0242n(O0.e eVar, G.d dVar, int i2) {
        this.f2903e = i2;
        this.f2904f = eVar;
        this.f2905g = dVar;
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
    @Override // O0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, v0.d dVar) {
        C0241m c0241m;
        int i2;
        s sVar;
        int i3;
        w wVar;
        int i4;
        y yVar;
        int i5;
        O0.n nVar;
        int i6;
        boolean z2;
        Object obj2;
        Object obj3;
        C0242n c0242n;
        switch (this.f2903e) {
            case 0:
                if (dVar instanceof C0241m) {
                    c0241m = (C0241m) dVar;
                    int i7 = c0241m.f2901i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0241m.f2901i = i7 - Integer.MIN_VALUE;
                        Object obj4 = c0241m.f2900h;
                        w0.a aVar = w0.a.f3076e;
                        i2 = c0241m.f2901i;
                        if (i2 != 0) {
                            o.g.z(obj4);
                            Object c2 = ((G.b) obj).c((G.d) this.f2905g);
                            c0241m.f2901i = 1;
                            if (this.f2904f.b(c2, c0241m) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj4);
                        }
                        return C0252g.f2994a;
                    }
                }
                c0241m = new C0241m(this, dVar);
                Object obj42 = c0241m.f2900h;
                w0.a aVar2 = w0.a.f3076e;
                i2 = c0241m.f2901i;
                if (i2 != 0) {
                }
                return C0252g.f2994a;
            case 1:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i8 = sVar.f2923i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        sVar.f2923i = i8 - Integer.MIN_VALUE;
                        Object obj5 = sVar.f2922h;
                        w0.a aVar3 = w0.a.f3076e;
                        i3 = sVar.f2923i;
                        if (i3 != 0) {
                            o.g.z(obj5);
                            Object c3 = ((G.b) obj).c((G.d) this.f2905g);
                            sVar.f2923i = 1;
                            if (this.f2904f.b(c3, sVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj5);
                        }
                        return C0252g.f2994a;
                    }
                }
                sVar = new s(this, dVar);
                Object obj52 = sVar.f2922h;
                w0.a aVar32 = w0.a.f3076e;
                i3 = sVar.f2923i;
                if (i3 != 0) {
                }
                return C0252g.f2994a;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    int i9 = wVar.f2942i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wVar.f2942i = i9 - Integer.MIN_VALUE;
                        Object obj6 = wVar.f2941h;
                        w0.a aVar4 = w0.a.f3076e;
                        i4 = wVar.f2942i;
                        if (i4 != 0) {
                            o.g.z(obj6);
                            Object c4 = ((G.b) obj).c((G.d) this.f2905g);
                            wVar.f2942i = 1;
                            if (this.f2904f.b(c4, wVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj6);
                        }
                        return C0252g.f2994a;
                    }
                }
                wVar = new w(this, dVar);
                Object obj62 = wVar.f2941h;
                w0.a aVar42 = w0.a.f3076e;
                i4 = wVar.f2942i;
                if (i4 != 0) {
                }
                return C0252g.f2994a;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i10 = yVar.f2950i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        yVar.f2950i = i10 - Integer.MIN_VALUE;
                        Object obj7 = yVar.f2949h;
                        w0.a aVar5 = w0.a.f3076e;
                        i5 = yVar.f2950i;
                        if (i5 != 0) {
                            o.g.z(obj7);
                            Object c5 = ((G.b) obj).c((G.d) this.f2905g);
                            yVar.f2950i = 1;
                            if (this.f2904f.b(c5, yVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj7);
                        }
                        return C0252g.f2994a;
                    }
                }
                yVar = new y(this, dVar);
                Object obj72 = yVar.f2949h;
                w0.a aVar52 = w0.a.f3076e;
                i5 = yVar.f2950i;
                if (i5 != 0) {
                }
                return C0252g.f2994a;
            default:
                if (dVar instanceof O0.n) {
                    nVar = (O0.n) dVar;
                    int i11 = nVar.f797j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f797j = i11 - Integer.MIN_VALUE;
                        Object obj8 = nVar.f796i;
                        w0.a aVar6 = w0.a.f3076e;
                        i6 = nVar.f797j;
                        z2 = true;
                        if (i6 != 0) {
                            o.g.z(obj8);
                            nVar.f795h = this;
                            nVar.f799l = obj;
                            nVar.f797j = 1;
                            Object f2 = ((C0016q) this.f2905g).f(obj, nVar);
                            if (f2 == aVar6) {
                                return aVar6;
                            }
                            obj2 = f2;
                            obj3 = obj;
                            c0242n = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0242n = nVar.f795h;
                                o.g.z(obj8);
                                if (z2) {
                                    return C0252g.f2994a;
                                }
                                throw new P0.a(c0242n);
                            }
                            Object obj9 = nVar.f799l;
                            C0242n c0242n2 = nVar.f795h;
                            o.g.z(obj8);
                            obj3 = obj9;
                            c0242n = c0242n2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            O0.e eVar = c0242n.f2904f;
                            nVar.f795h = c0242n;
                            nVar.f799l = null;
                            nVar.f797j = 2;
                            if (eVar.b(obj3, nVar) == aVar6) {
                                return aVar6;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                nVar = new O0.n(this, dVar);
                Object obj82 = nVar.f796i;
                w0.a aVar62 = w0.a.f3076e;
                i6 = nVar.f797j;
                z2 = true;
                if (i6 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0242n(C0016q c0016q, O0.e eVar) {
        this.f2903e = 4;
        this.f2905g = c0016q;
        this.f2904f = eVar;
    }
}
