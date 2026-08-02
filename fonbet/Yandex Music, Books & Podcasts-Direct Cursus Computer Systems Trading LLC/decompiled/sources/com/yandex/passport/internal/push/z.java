package com.yandex.passport.internal.push;

import defpackage.cg6;
import defpackage.jp0;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.s9f;
import defpackage.xq0;
import defpackage.zqf;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class z extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.storage.m b;
    public final zqf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.storage.m mVar, zqf zqfVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        mVar.getClass();
        zqfVar.getClass();
        this.b = mVar;
        this.c = zqfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(x xVar, cg6 cg6Var) {
        y yVar;
        int i;
        com.yandex.passport.internal.storage.m mVar;
        jp0 jp0Var;
        s9f[] s9fVarArr;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i2 = yVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.l = i2 - Integer.MIN_VALUE;
                Object obj = yVar.j;
                nm6 nm6Var = nm6.a;
                i = yVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Object obj2 = this.c.get();
                    obj2.getClass();
                    yVar.l = 1;
                    if (xVar.a((g) obj2, yVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                mVar = this.b;
                jp0Var = mVar.b;
                s9fVarArr = com.yandex.passport.internal.storage.m.m;
                if (!"7.54.1".equals((String) jp0Var.getValue(mVar, s9fVarArr[0]))) {
                    mVar.b.setValue(mVar, s9fVarArr[0], "7.54.1");
                }
                return Unit.a;
            }
        }
        yVar = new y(this, cg6Var);
        Object obj3 = yVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yVar.l;
        if (i != 0) {
        }
        mVar = this.b;
        jp0Var = mVar.b;
        s9fVarArr = com.yandex.passport.internal.storage.m.m;
        if (!"7.54.1".equals((String) jp0Var.getValue(mVar, s9fVarArr[0]))) {
        }
        return Unit.a;
    }
}
