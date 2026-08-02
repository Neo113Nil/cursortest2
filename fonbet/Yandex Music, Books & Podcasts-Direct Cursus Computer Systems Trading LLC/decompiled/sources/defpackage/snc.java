package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class snc implements rjc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public snc(rjc rjcVar, ueo ueoVar, boolean z, Function1 function1) {
        this.b = rjcVar;
        this.d = ueoVar;
        this.c = z;
        this.e = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        rnc rncVar;
        Object obj2;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        l5u l5uVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof rnc) {
                    rncVar = (rnc) continuation;
                    int i3 = rncVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rncVar.k = i3 - Integer.MIN_VALUE;
                        obj2 = rncVar.j;
                        nm6Var = nm6.a;
                        i = rncVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            ueo ueoVar = (ueo) this.d;
                            Function1 function1 = (Function1) this.e;
                            rjc rjcVar2 = this.b;
                            rncVar.l = rjcVar2;
                            rncVar.k = 1;
                            obj2 = up6.G(ueoVar, true, this.c, function1, rncVar);
                            if (obj2 != nm6Var) {
                                rjcVar = rjcVar2;
                            }
                        } else if (i == 1) {
                            rjcVar = rncVar.l;
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        rncVar.l = null;
                        rncVar.k = 2;
                        if (rjcVar.emit(obj2, rncVar) == nm6Var) {
                        }
                    }
                }
                rncVar = new rnc(this, continuation);
                obj2 = rncVar.j;
                nm6Var = nm6.a;
                i = rncVar.k;
                if (i != 0) {
                }
                rncVar.l = null;
                rncVar.k = 2;
                if (rjcVar.emit(obj2, rncVar) == nm6Var) {
                }
                break;
            default:
                if (continuation instanceof l5u) {
                    l5uVar = (l5u) continuation;
                    int i4 = l5uVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        l5uVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = l5uVar.j;
                        nm6 nm6Var2 = nm6.a;
                        i2 = l5uVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            q4u q4uVar = (q4u) ((w5u) this.d).g.getValue();
                            if (!Intrinsics.d(q4uVar != null ? q4uVar.a.a : null, (x1u) this.e) || this.c) {
                                l5uVar.k = 1;
                                if (this.b.emit(obj, l5uVar) == nm6Var2) {
                                }
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                l5uVar = new l5u(this, continuation);
                Object obj32 = l5uVar.j;
                nm6 nm6Var22 = nm6.a;
                i2 = l5uVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public snc(rjc rjcVar, w5u w5uVar, x1u x1uVar, boolean z) {
        this.b = rjcVar;
        this.d = w5uVar;
        this.e = x1uVar;
        this.c = z;
    }
}
