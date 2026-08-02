package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hr3 implements rjc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ vqn c;

    public hr3(rjc rjcVar, vqn vqnVar) {
        this.b = rjcVar;
        this.c = vqnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(IndexedValue indexedValue, Continuation continuation) {
        gr3 gr3Var;
        int i;
        hr3 hr3Var;
        if (continuation instanceof gr3) {
            gr3Var = (gr3) continuation;
            int i2 = gr3Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gr3Var.n = i2 - Integer.MIN_VALUE;
                Object obj = gr3Var.l;
                nm6 nm6Var = nm6.a;
                i = gr3Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    indexedValue.getClass();
                    if (indexedValue.a > this.c.a) {
                        Object obj2 = indexedValue.b;
                        gr3Var.j = this;
                        gr3Var.k = indexedValue;
                        gr3Var.n = 1;
                        if (this.b.emit(obj2, gr3Var) == nm6Var) {
                            return nm6Var;
                        }
                        hr3Var = this;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                indexedValue = gr3Var.k;
                hr3Var = gr3Var.j;
                qgg.h0(obj);
                hr3Var.c.a = indexedValue.a;
                return Unit.a;
            }
        }
        gr3Var = new gr3(this, continuation);
        Object obj3 = gr3Var.l;
        nm6 nm6Var2 = nm6.a;
        i = gr3Var.n;
        if (i != 0) {
        }
        hr3Var.c.a = indexedValue.a;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        kmc kmcVar;
        int i;
        switch (this.a) {
            case 0:
                return b((IndexedValue) obj, continuation);
            default:
                if (continuation instanceof kmc) {
                    kmcVar = (kmc) continuation;
                    int i2 = kmcVar.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kmcVar.l = i2 - Integer.MIN_VALUE;
                        Object obj2 = kmcVar.j;
                        nm6 nm6Var = nm6.a;
                        i = kmcVar.l;
                        if (i != 0) {
                            qgg.h0(obj2);
                            vqn vqnVar = this.c;
                            int i3 = vqnVar.a;
                            vqnVar.a = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened");
                            }
                            IndexedValue indexedValue = new IndexedValue(i3, obj);
                            kmcVar.l = 1;
                            if (this.b.emit(indexedValue, kmcVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                        }
                        return Unit.a;
                    }
                }
                kmcVar = new kmc(this, continuation);
                Object obj22 = kmcVar.j;
                nm6 nm6Var2 = nm6.a;
                i = kmcVar.l;
                if (i != 0) {
                }
                return Unit.a;
        }
    }

    public hr3(vqn vqnVar, rjc rjcVar) {
        this.c = vqnVar;
        this.b = rjcVar;
    }
}
