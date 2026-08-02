package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class kc5 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ x1u c;

    public /* synthetic */ kc5(rjc rjcVar, x1u x1uVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = x1uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        jc5 jc5Var;
        int i;
        n7q n7qVar;
        m5u m5uVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof jc5) {
                    jc5Var = (jc5) continuation;
                    int i3 = jc5Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jc5Var.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = jc5Var.j;
                        nm6 nm6Var = nm6.a;
                        i = jc5Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            d6l x = p6g.x((e6l) obj);
                            Object b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
                            i5u i5uVar = b instanceof i5u ? (i5u) b : null;
                            Boolean valueOf = Boolean.valueOf(i5uVar == null ? false : Intrinsics.d(this.c.a, i5uVar.a.a));
                            jc5Var.k = 1;
                            if (this.b.emit(valueOf, jc5Var) == nm6Var) {
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
                jc5Var = new jc5(this, continuation);
                Object obj22 = jc5Var.j;
                nm6 nm6Var2 = nm6.a;
                i = jc5Var.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof m5u) {
                    m5uVar = (m5u) continuation;
                    int i4 = m5uVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        m5uVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = m5uVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = m5uVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            q4u q4uVar = new q4u(new p4u(this.c, (j1g) obj), System.currentTimeMillis());
                            m5uVar.k = 1;
                            if (this.b.emit(q4uVar, m5uVar) == nm6Var3) {
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
                m5uVar = new m5u(this, continuation);
                Object obj32 = m5uVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = m5uVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
