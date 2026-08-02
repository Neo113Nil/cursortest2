package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class b8s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e8s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8s(e8s e8sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = e8sVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b8s(this.l, continuation, 0);
            case 1:
                return new b8s(this.l, continuation, 1);
            case 2:
                return new b8s(this.l, continuation, 2);
            default:
                return new b8s(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b8s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r11.emit(defpackage.suo.a, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003b, code lost:
    
        if (r11 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xyo xyoVar;
        Object wyoVar;
        int i = this.j;
        e8s e8sVar = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    vdr c = e8sVar.q.c();
                    this.k = 1;
                    obj = zsd.g0(c, this);
                    if (obj == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (!((x66) obj).a) {
                    xdr xdrVar = e8sVar.u;
                    c3n c3nVar = e8sVar.p;
                    xik xikVar = new xik(new e3n(new m3n(c3nVar.a(R.string.purchase_application_title_without_offer), null), c3nVar.a(R.string.purchase_block_empty_description)));
                    xdrVar.getClass();
                    xdrVar.m(null, xikVar);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = e8sVar.w;
                    this.k = 1;
                    if (j0qVar.emit(ouo.a, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                sv8 sv8Var = e8sVar.l;
                String str = e8sVar.k;
                y6s y6sVar = e8sVar.n;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ((ey2) y6sVar.d.getValue()).c();
                    if (str == null) {
                        xyoVar = null;
                        if (!(xyoVar instanceof vyo)) {
                            ((ey2) y6sVar.d.getValue()).b(((vyo) xyoVar).a.getMessage());
                            jyr b = btf.b(new x6s(1));
                            sv8Var.getClass();
                            xyo b2 = sv8Var.b((String) b.getValue());
                            if (!(b2 instanceof vyo)) {
                                if (!(b2 instanceof wyo)) {
                                    b6e.s();
                                    break;
                                } else {
                                    wyoVar = new wyo(new bu8("tariff_paywall_default", (rv8) ((wyo) b2).a));
                                }
                            } else {
                                wyoVar = new vyo(null, ((vyo) b2).a);
                            }
                        } else if (!(xyoVar instanceof wyo)) {
                            if (xyoVar != null) {
                                b6e.s();
                                break;
                            } else {
                                ((ey2) y6sVar.d.getValue()).a();
                                jyr b3 = btf.b(new x6s(1));
                                sv8Var.getClass();
                                xyo b4 = sv8Var.b((String) b3.getValue());
                                if (!(b4 instanceof vyo)) {
                                    if (!(b4 instanceof wyo)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        wyoVar = new wyo(new bu8("tariff_paywall_default", (rv8) ((wyo) b4).a));
                                    }
                                } else {
                                    wyoVar = new vyo(null, ((vyo) b4).a);
                                }
                            }
                        } else {
                            ((ey2) y6sVar.d.getValue()).d();
                            wyoVar = new wyo(new bu8(str, (rv8) ((wyo) xyoVar).a));
                        }
                        xdr xdrVar2 = e8sVar.v;
                        xdrVar2.getClass();
                        xdrVar2.m(null, wyoVar);
                        break;
                    } else {
                        oy2 oy2Var = e8sVar.s;
                        long j = e8s.F;
                        this.k = 1;
                        obj = oy2Var.c(str, j, this);
                        if (obj == nm6Var3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                xyoVar = (xyo) obj;
                if (!(xyoVar instanceof vyo)) {
                }
                xdr xdrVar22 = e8sVar.v;
                xdrVar22.getClass();
                xdrVar22.m(null, wyoVar);
            default:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    wrt wrtVar = e8sVar.r;
                    this.k = 1;
                    wrtVar.getClass();
                    obj = x97.V(dm6.b, new zts(wrtVar, continuation, 8), this);
                    break;
                } else if (i5 == 1) {
                    qgg.h0(obj);
                } else if (i5 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                bot botVar = (bot) obj;
                if (!(botVar instanceof znt)) {
                    if (!(botVar instanceof xnt)) {
                        b6e.s();
                        break;
                    } else {
                        ssg.a(6, null, "Error update user center", ((xnt) botVar).a);
                        rar rarVar = e8sVar.C;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        e8sVar.C = x97.y(ot0.F(e8sVar), null, null, new v0r(e8sVar, null, 22), 3);
                    }
                } else {
                    znt zntVar = (znt) botVar;
                    String str2 = zntVar.a;
                    boolean z = zntVar.b;
                    boolean z2 = zntVar.c;
                    String str3 = e8sVar.z;
                    boolean z3 = (str3 == null || str3.equals(str2)) ? false : true;
                    if (z2 || !z || z3) {
                        ((zhk) e8sVar.n.a.getValue()).c();
                        j0q j0qVar2 = e8sVar.w;
                        this.k = 2;
                        break;
                    } else {
                        e8sVar.z = str2;
                        rar rarVar2 = e8sVar.C;
                        if (rarVar2 != null) {
                            rarVar2.g(null);
                        }
                        e8sVar.C = x97.y(ot0.F(e8sVar), null, null, new v0r(e8sVar, null, 22), 3);
                    }
                }
                break;
        }
        return null;
    }
}
