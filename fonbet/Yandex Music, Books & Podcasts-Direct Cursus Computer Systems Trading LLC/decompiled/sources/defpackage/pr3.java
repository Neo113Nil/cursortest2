package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class pr3 {
    public final et a;
    public final p51 b;
    public final rtl c;
    public final i2m d;
    public final rus e;
    public final frt f;

    public pr3(et etVar, p51 p51Var, rtl rtlVar, i2m i2mVar, rus rusVar, frt frtVar) {
        etVar.getClass();
        p51Var.getClass();
        rtlVar.getClass();
        i2mVar.getClass();
        rusVar.getClass();
        this.a = etVar;
        this.b = p51Var;
        this.c = rtlVar;
        this.d = i2mVar;
        this.e = rusVar;
        this.f = frtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, cg6 cg6Var) {
        or3 or3Var;
        int i;
        Function2 function22;
        if (cg6Var instanceof or3) {
            or3Var = (or3) cg6Var;
            int i2 = or3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                or3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = or3Var.k;
                nm6 nm6Var = nm6.a;
                i = or3Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    or3Var.j = (aur) function2;
                    or3Var.m = 1;
                    obj = this.f.f(or3Var);
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) or3Var.j;
                    qgg.h0(obj);
                    function22 = function23;
                }
                String str = ((xxq) obj).a;
                str.getClass();
                zrt zrtVar = new zrt(str);
                or3Var.j = null;
                or3Var.m = 2;
                Object invoke = function22.invoke(zrtVar, or3Var);
                return invoke != nm6Var ? nm6Var : invoke;
            }
        }
        or3Var = new or3(this, cg6Var);
        Object obj2 = or3Var.k;
        nm6 nm6Var2 = nm6.a;
        i = or3Var.m;
        if (i != 0) {
        }
        String str2 = ((xxq) obj2).a;
        str2.getClass();
        zrt zrtVar2 = new zrt(str2);
        or3Var.j = null;
        or3Var.m = 2;
        Object invoke2 = function22.invoke(zrtVar2, or3Var);
        if (invoke2 != nm6Var2) {
        }
    }
}
