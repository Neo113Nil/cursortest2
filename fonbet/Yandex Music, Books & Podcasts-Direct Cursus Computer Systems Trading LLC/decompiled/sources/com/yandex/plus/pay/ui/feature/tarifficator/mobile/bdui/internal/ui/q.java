package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class q {
    public final /* synthetic */ u a;

    public q(u uVar) {
        this.a = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        p pVar;
        int i;
        Object b;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pVar.j;
                nm6 nm6Var = nm6.a;
                i = pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.domain.auth.impl.i iVar = this.a.G;
                    iVar.getClass();
                    if (!(iVar.h.getValue() instanceof com.yandex.plus.domain.auth.api.b)) {
                        iVar = null;
                    }
                    if (iVar == null) {
                        return null;
                    }
                    pVar.l = 1;
                    b = iVar.b(pVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                return (String) (b instanceof t7o ? null : b);
            }
        }
        pVar = new p(this, continuation);
        Object obj2 = pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        return (String) (b instanceof t7o ? null : b);
    }
}
