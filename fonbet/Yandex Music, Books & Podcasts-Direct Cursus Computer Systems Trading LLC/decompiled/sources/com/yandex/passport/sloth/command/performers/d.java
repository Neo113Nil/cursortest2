package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;

    public d(com.yandex.passport.sloth.v vVar) {
        vVar.getClass();
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.l = 1;
                    if (this.a.d(com.yandex.passport.sloth.e.a, cVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(com.yandex.passport.sloth.command.v.c);
            }
        }
        cVar = new c(this, (cg6) continuation);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }

    @Override // com.yandex.passport.sloth.command.r
    public final /* bridge */ /* synthetic */ Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        return a(fVar);
    }
}
