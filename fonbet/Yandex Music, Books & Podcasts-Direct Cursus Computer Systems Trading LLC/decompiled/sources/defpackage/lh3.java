package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class lh3 {
    public final eqi a = new eqi(new mh3[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0062 -> B:10:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ynn ynnVar, cg6 cg6Var) {
        kh3 kh3Var;
        int i;
        ynn ynnVar2;
        int i2;
        Object[] objArr;
        int i3;
        if (cg6Var instanceof kh3) {
            kh3Var = (kh3) cg6Var;
            int i4 = kh3Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kh3Var.p = i4 - Integer.MIN_VALUE;
                Object obj = kh3Var.n;
                nm6 nm6Var = nm6.a;
                i = kh3Var.p;
                if (i != 0) {
                    qgg.h0(obj);
                    eqi eqiVar = this.a;
                    Object[] objArr2 = eqiVar.a;
                    int i5 = eqiVar.c;
                    ynnVar2 = ynnVar;
                    i2 = i5;
                    objArr = objArr2;
                    i3 = 0;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = kh3Var.m;
                    i3 = kh3Var.l;
                    objArr = kh3Var.k;
                    ynn ynnVar3 = kh3Var.j;
                    qgg.h0(obj);
                    ynnVar2 = ynnVar3;
                    i3++;
                    if (i3 < i2) {
                        mh3 mh3Var = (mh3) objArr[i3];
                        k5 k5Var = new k5(16, ynnVar2);
                        kh3Var.j = ynnVar2;
                        kh3Var.k = objArr;
                        kh3Var.l = i3;
                        kh3Var.m = i2;
                        kh3Var.p = 1;
                        if (zc4.q(mh3Var, k5Var, kh3Var) == nm6Var) {
                            return nm6Var;
                        }
                        i3++;
                        if (i3 < i2) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        kh3Var = new kh3(this, cg6Var);
        Object obj2 = kh3Var.n;
        nm6 nm6Var2 = nm6.a;
        i = kh3Var.p;
        if (i != 0) {
        }
    }
}
