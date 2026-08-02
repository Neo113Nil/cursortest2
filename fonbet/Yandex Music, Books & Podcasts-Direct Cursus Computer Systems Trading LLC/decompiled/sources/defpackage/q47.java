package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class q47 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e57 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q47(e57 e57Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = e57Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new q47(this.l, continuation, 0);
            case 1:
                return new q47(this.l, continuation, 1);
            case 2:
                return new q47(this.l, continuation, 2);
            case 3:
                return new q47(this.l, continuation, 3);
            case 4:
                return new q47(this.l, continuation, 4);
            case 5:
                return new q47(this.l, continuation, 5);
            case 6:
                return new q47(this.l, continuation, 6);
            case 7:
                return new q47(this.l, continuation, 7);
            case 8:
                return new q47(this.l, continuation, 8);
            case 9:
                return new q47(this.l, continuation, 9);
            case 10:
                return new q47(this.l, continuation, 10);
            default:
                return new q47(this.l, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 2:
                ((q47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((q47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0164, code lost:
    
        if (r0.m(r2, r8) == r3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x015b, code lost:
    
        if (r0.m(defpackage.zhe.a, r8) == r3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e4, code lost:
    
        if (((defpackage.pjc) r9).collect(r2, r8) == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d4, code lost:
    
        if (r9 == r0) goto L122;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        yhe yheVar = yhe.a;
        e57 e57Var = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = e57Var.s;
                    p47 p47Var = new p47(e57Var, 0);
                    this.k = 1;
                    if (pjcVar.collect(p47Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    e8w e8wVar = e8w.a;
                    this.k = 1;
                    e8w.c();
                    obj = y0q.b(0, 0, null, 7);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                p47 p47Var2 = new p47(e57Var, 1);
                this.k = 2;
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = e57Var.w0;
                p47 p47Var3 = new p47(e57Var, 2);
                this.k = 1;
                x0qVar.collect(p47Var3, this);
                return nm6Var3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = e57Var.H;
                    this.k = 1;
                    if (zi3Var.m(yheVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                zi3 zi3Var2 = e57Var.H;
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.k = 2;
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var3 = e57Var.H;
                    this.k = 1;
                    if (zi3Var3.m(yheVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = e57Var.I;
                    ncp ncpVar = new ncp();
                    this.k = 1;
                    if (x0qVar2.emit(ncpVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar3 = e57Var.I;
                    ncp ncpVar2 = new ncp();
                    this.k = 1;
                    if (x0qVar3.emit(ncpVar2, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    jst jstVar = new jst();
                    this.k = 1;
                    if (e57Var.C(jstVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar4 = e57Var.I;
                    ocp ocpVar = new ocp(zqo.a, false);
                    this.k = 1;
                    if (x0qVar4.emit(ocpVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar5 = e57Var.I;
                    ocp ocpVar2 = new ocp(yqo.a, false);
                    this.k = 1;
                    if (x0qVar5.emit(ocpVar2, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var12 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    le3 le3Var = e57Var.r;
                    le3Var.getClass();
                    ss3 I = zsd.I(new vv4(le3Var, continuation, 27));
                    p47 p47Var4 = new p47(e57Var, 4);
                    this.k = 1;
                    Object collect = I.collect(new a56(p47Var4, 4), this);
                    if (collect != nm6.a) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
