package defpackage;

import com.yandex.plus.pay.a;

/* loaded from: classes4.dex */
public final class vwi {
    public final a a;
    public final ft0 b;

    public vwi(a aVar, ft0 ft0Var) {
        aVar.getClass();
        this.a = aVar;
        this.b = ft0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(2:18|(2:20|21)(2:22|(1:24)))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        uwi uwiVar;
        int i;
        if (cg6Var instanceof uwi) {
            uwiVar = (uwi) cg6Var;
            int i2 = uwiVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uwiVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uwiVar.j;
                nm6 nm6Var = nm6.a;
                i = uwiVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.b != ft0.GOOGLE_STORE) {
                        return Boolean.TRUE;
                    }
                    m1i m1iVar = new m1i(this, null, 11);
                    mn7 mn7Var = dm6.b;
                    uwiVar.l = 1;
                    obj = x97.V(mn7Var, m1iVar, uwiVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                boolean z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        uwiVar = new uwi(this, cg6Var);
        Object obj2 = uwiVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uwiVar.l;
        if (i != 0) {
        }
        boolean z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }
}
