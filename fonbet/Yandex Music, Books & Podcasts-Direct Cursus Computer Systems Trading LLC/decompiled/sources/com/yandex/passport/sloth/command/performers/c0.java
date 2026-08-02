package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c0 implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;

    public c0(com.yandex.passport.sloth.v vVar) {
        vVar.getClass();
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        b0 b0Var;
        int i;
        if (continuation instanceof b0) {
            b0Var = (b0) continuation;
            int i2 = b0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = b0Var.j;
                nm6 nm6Var = nm6.a;
                i = b0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    b0Var.l = 1;
                    if (this.a.b(com.yandex.passport.sloth.s.a, b0Var) == nm6Var) {
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
        b0Var = new b0(this, (cg6) continuation);
        Object obj2 = b0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = b0Var.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }

    @Override // com.yandex.passport.sloth.command.r
    public final /* bridge */ /* synthetic */ Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        return a(fVar);
    }
}
