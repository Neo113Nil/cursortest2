package com.yandex.passport.internal.usecase.ui;

import android.database.sqlite.SQLiteDatabase;
import defpackage.cg6;
import defpackage.evw;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.HashMap;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class t extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.core.accounts.y b;
    public final com.yandex.passport.internal.analytics.o0 c;
    public final com.yandex.passport.internal.database.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.y yVar, com.yandex.passport.internal.analytics.o0 o0Var, com.yandex.passport.internal.database.d dVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        yVar.getClass();
        o0Var.getClass();
        dVar.getClass();
        this.b = yVar;
        this.c = o0Var;
        this.d = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.internal.l lVar, cg6 cg6Var) {
        s sVar;
        int i;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = sVar.j;
                nm6 nm6Var = nm6.a;
                i = sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.analytics.o0 o0Var = this.c;
                    o0Var.getClass();
                    lVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", String.valueOf(lVar.b.b));
                    o0Var.a.b(com.yandex.passport.internal.analytics.i.c, hashMap);
                    if (!lVar.e.x) {
                        String str = lVar.j;
                        com.yandex.passport.internal.database.d dVar = this.d;
                        dVar.getClass();
                        str.getClass();
                        com.yandex.passport.common.network.n nVar = dVar.f;
                        nVar.getClass();
                        ((SQLiteDatabase) ((evw) nVar.c).invoke()).delete("children", "parent_name  = ?", new String[]{str});
                    }
                    com.yandex.passport.internal.core.accounts.x xVar = new com.yandex.passport.internal.core.accounts.x(new com.yandex.passport.internal.core.accounts.v(lVar), true, true, com.yandex.passport.internal.report.reporters.x0.d, false);
                    sVar.l = 1;
                    if (this.b.a(xVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        sVar = new s(this, cg6Var);
        Object obj2 = sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = sVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }
}
