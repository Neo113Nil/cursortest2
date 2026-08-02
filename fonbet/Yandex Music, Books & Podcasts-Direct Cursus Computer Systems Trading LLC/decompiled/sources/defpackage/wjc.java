package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wjc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltm b;

    public /* synthetic */ wjc(ltm ltmVar, int i) {
        this.a = i;
        this.b = ltmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        skc skcVar;
        int i;
        vkc vkcVar;
        int i2;
        switch (this.a) {
            case 0:
                Object m = ((oc4) this.b).d.m(obj, continuation);
                if (m != nm6.a) {
                    break;
                }
                break;
            case 1:
                if (continuation instanceof skc) {
                    skcVar = (skc) continuation;
                    int i3 = skcVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        skcVar.l = i3 - Integer.MIN_VALUE;
                        Object obj2 = skcVar.j;
                        nm6 nm6Var = nm6.a;
                        i = skcVar.l;
                        if (i != 0) {
                            qgg.h0(obj2);
                            if (obj == null) {
                                obj = ugj.a;
                            }
                            skcVar.l = 1;
                            if (((oc4) this.b).d.m(obj, skcVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                skcVar = new skc(this, continuation);
                Object obj22 = skcVar.j;
                nm6 nm6Var2 = nm6.a;
                i = skcVar.l;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof vkc) {
                    vkcVar = (vkc) continuation;
                    int i4 = vkcVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vkcVar.l = i4 - Integer.MIN_VALUE;
                        Object obj3 = vkcVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = vkcVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (obj == null) {
                                obj = ugj.a;
                            }
                            vkcVar.l = 1;
                            if (((oc4) this.b).d.m(obj, vkcVar) == nm6Var3) {
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
                vkcVar = new vkc(this, continuation);
                Object obj32 = vkcVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = vkcVar.l;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
