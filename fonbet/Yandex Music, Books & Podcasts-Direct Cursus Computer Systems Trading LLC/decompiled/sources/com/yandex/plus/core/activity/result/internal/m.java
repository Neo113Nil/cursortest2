package com.yandex.plus.core.activity.result.internal;

import com.yandex.passport.sloth.ui.v;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.dxd;
import defpackage.gi;
import defpackage.lyf;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.qxe;
import defpackage.rqi;
import defpackage.uh;
import defpackage.xq0;
import defpackage.zh;
import defpackage.zt3;

/* loaded from: classes4.dex */
public final class m extends bfu {
    public uh l;
    public v m;
    public zh n;
    public a o;
    public lyf k = lyf.b;
    public final qqi p = rqi.a();
    public final dxd q = new dxd(4, this);
    public final gi r = new gi(21, this);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:24:0x0061, B:26:0x0088, B:27:0x0091), top: B:23:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uh uhVar, Object obj, cg6 cg6Var) {
        l lVar;
        Object obj2;
        nm6 nm6Var;
        int i;
        int i2;
        Object obj3;
        oqi oqiVar;
        Throwable th;
        oqi oqiVar2;
        zh zhVar;
        try {
            if (cg6Var instanceof l) {
                lVar = (l) cg6Var;
                int i3 = lVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    lVar.p = i3 - Integer.MIN_VALUE;
                    obj2 = lVar.n;
                    nm6Var = nm6.a;
                    i = lVar.p;
                    if (i != 0) {
                        qgg.h0(obj2);
                        lVar.j = uhVar;
                        lVar.k = obj;
                        qqi qqiVar = this.p;
                        lVar.l = qqiVar;
                        i2 = 0;
                        lVar.m = 0;
                        lVar.p = 1;
                        if (qqiVar.a(lVar) != nm6Var) {
                            obj3 = obj;
                            oqiVar = qqiVar;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = lVar.l;
                        try {
                            qgg.h0(obj2);
                            oqiVar2.b(null);
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    int i4 = lVar.m;
                    oqiVar = lVar.l;
                    Object obj4 = lVar.k;
                    uh uhVar2 = lVar.j;
                    qgg.h0(obj2);
                    obj3 = obj4;
                    i2 = i4;
                    uhVar = uhVar2;
                    lVar.j = uhVar;
                    lVar.k = obj3;
                    lVar.l = oqiVar;
                    lVar.m = i2;
                    lVar.p = 2;
                    zt3 zt3Var = new zt3(1, qxe.b(lVar));
                    zt3Var.s();
                    uhVar.getClass();
                    this.l = uhVar;
                    this.m = new v(zt3Var, 1);
                    zhVar = this.n;
                    if (zhVar != null) {
                        zhVar.a(obj3);
                    }
                    obj2 = zt3Var.q();
                    if (obj2 != nm6Var) {
                        oqiVar2 = oqiVar;
                        oqiVar2.b(null);
                        return obj2;
                    }
                    return nm6Var;
                }
            }
            lVar.j = uhVar;
            lVar.k = obj3;
            lVar.l = oqiVar;
            lVar.m = i2;
            lVar.p = 2;
            zt3 zt3Var2 = new zt3(1, qxe.b(lVar));
            zt3Var2.s();
            uhVar.getClass();
            this.l = uhVar;
            this.m = new v(zt3Var2, 1);
            zhVar = this.n;
            if (zhVar != null) {
            }
            obj2 = zt3Var2.q();
            if (obj2 != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqi oqiVar3 = oqiVar;
            th = th3;
            oqiVar2 = oqiVar3;
            oqiVar2.b(null);
            throw th;
        }
        lVar = new l(this, cg6Var);
        obj2 = lVar.n;
        nm6Var = nm6.a;
        i = lVar.p;
        if (i != 0) {
        }
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        a aVar = this.o;
        if (aVar != null) {
            aVar.invoke(this);
        }
    }
}
