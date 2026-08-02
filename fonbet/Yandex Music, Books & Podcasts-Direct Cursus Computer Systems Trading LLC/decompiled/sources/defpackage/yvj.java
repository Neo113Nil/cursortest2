package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class yvj extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ cwj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvj(cwj cwjVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = cwjVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new yvj(this.l, continuation, 0);
            default:
                return new yvj(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((yvj) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xyo xyoVar;
        Object wyoVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    cwj cwjVar = this.l;
                    ((zhk) cwjVar.m.c.getValue()).c();
                    j0q j0qVar = cwjVar.A;
                    this.k = 1;
                    if (j0qVar.emit(nuo.a, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                cwj cwjVar2 = this.l;
                jyr jyrVar = cwjVar2.v;
                String str = cwjVar2.k;
                gvj gvjVar = cwjVar2.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ((ey2) gvjVar.e.getValue()).c();
                    if (str != null) {
                        oy2 oy2Var = cwjVar2.r;
                        long j = cwj.H;
                        this.k = 1;
                        obj = oy2Var.c(str, j, this);
                        if (obj == nm6Var2) {
                        }
                    } else {
                        xyoVar = null;
                        if (!(xyoVar instanceof vyo)) {
                            ((ey2) gvjVar.e.getValue()).b(((vyo) xyoVar).a.getMessage());
                            sv8 sv8Var = (sv8) jyrVar.getValue();
                            jyr b = btf.b(new s9j(21));
                            sv8Var.getClass();
                            xyo b2 = sv8Var.b((String) b.getValue());
                            if (!(b2 instanceof vyo)) {
                                if (!(b2 instanceof wyo)) {
                                    b6e.s();
                                    break;
                                } else {
                                    wyoVar = new wyo(new cu8("option_paywall_default", (rv8) ((wyo) b2).a));
                                }
                            } else {
                                wyoVar = new vyo(null, ((vyo) b2).a);
                            }
                            xdr xdrVar = cwjVar2.w;
                            xdrVar.getClass();
                            xdrVar.m(null, wyoVar);
                            break;
                        } else {
                            if (!(xyoVar instanceof wyo)) {
                                if (xyoVar != null) {
                                    b6e.s();
                                    break;
                                } else {
                                    ((ey2) gvjVar.e.getValue()).a();
                                    sv8 sv8Var2 = (sv8) jyrVar.getValue();
                                    jyr b3 = btf.b(new s9j(21));
                                    sv8Var2.getClass();
                                    xyo b4 = sv8Var2.b((String) b3.getValue());
                                    if (!(b4 instanceof vyo)) {
                                        if (!(b4 instanceof wyo)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            wyoVar = new wyo(new cu8("option_paywall_default", (rv8) ((wyo) b4).a));
                                        }
                                    } else {
                                        wyoVar = new vyo(null, ((vyo) b4).a);
                                    }
                                }
                            } else {
                                ((ey2) gvjVar.e.getValue()).d();
                                wyoVar = new wyo(new cu8(str, (rv8) ((wyo) xyoVar).a));
                            }
                            xdr xdrVar2 = cwjVar2.w;
                            xdrVar2.getClass();
                            xdrVar2.m(null, wyoVar);
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                xyoVar = (xyo) obj;
                if (!(xyoVar instanceof vyo)) {
                }
                break;
        }
        return Unit.a;
    }
}
