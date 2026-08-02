package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class k62 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ o62 b;

    public /* synthetic */ k62(o62 o62Var, int i) {
        this.a = i;
        this.b = o62Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(mqs mqsVar, Continuation continuation) {
        l62 l62Var;
        Object obj;
        int i;
        if (continuation instanceof l62) {
            l62Var = (l62) continuation;
            int i2 = l62Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l62Var.m = i2 - Integer.MIN_VALUE;
                obj = l62Var.k;
                nm6 nm6Var = nm6.a;
                i = l62Var.m;
                o62 o62Var = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    l62Var.j = mqsVar;
                    l62Var.m = 1;
                    obj = o62.c(o62Var, mqsVar, l62Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqsVar = l62Var.j;
                    qgg.h0(obj);
                }
                Continuation continuation2 = null;
                if (!((Boolean) obj).booleanValue()) {
                    taa taaVar = (taa) o62Var.c;
                    taaVar.getClass();
                    mqsVar.getClass();
                    x97.y(taaVar.h, null, null, new f98(taaVar, mqsVar, continuation2, 5), 3);
                    return Unit.a;
                }
                a72 d = o62Var.d();
                String str = mqsVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                l62Var.j = null;
                l62Var.m = 2;
                d.getClass();
                Object V = x97.V(dm6.a, new z62(currentTimeMillis, d, str, null, 0), l62Var);
                if (V != nm6Var) {
                    V = Unit.a;
                }
            }
        }
        l62Var = new l62(this, continuation);
        obj = l62Var.k;
        nm6 nm6Var2 = nm6.a;
        i = l62Var.m;
        o62 o62Var2 = this.b;
        if (i != 0) {
        }
        Continuation continuation22 = null;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                mqs mqsVar = (mqs) obj;
                taa taaVar = (taa) this.b.c;
                taaVar.getClass();
                mqsVar.getClass();
                x97.y(taaVar.h, null, null, new f98(taaVar, mqsVar, (Continuation) null, 5), 3);
                return Unit.a;
            case 1:
                return b((mqs) obj, continuation);
            default:
                Object h = ((taa) this.b.c).h(new zvs((String) obj), oss.a, kss.a, continuation);
                return h == nm6.a ? h : Unit.a;
        }
    }
}
