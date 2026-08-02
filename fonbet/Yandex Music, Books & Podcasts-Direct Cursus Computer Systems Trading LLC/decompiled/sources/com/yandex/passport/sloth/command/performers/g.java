package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.data.o0;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;
    public final com.yandex.passport.sloth.data.m b;

    public g(com.yandex.passport.sloth.v vVar, com.yandex.passport.sloth.data.m mVar) {
        vVar.getClass();
        mVar.getClass();
        this.a = vVar;
        this.b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        f fVar;
        int i;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fVar.j;
                nm6 nm6Var = nm6.a;
                i = fVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    o0 o0Var = this.b.a;
                    if (o0Var instanceof com.yandex.passport.sloth.data.j0) {
                        com.yandex.passport.sloth.z zVar = new com.yandex.passport.sloth.z(((com.yandex.passport.sloth.data.j0) o0Var).c);
                        fVar.l = 1;
                        if (this.a.c(zVar, fVar) == nm6Var) {
                            return nm6Var;
                        }
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
        fVar = new f(this, (cg6) continuation);
        Object obj2 = fVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }

    @Override // com.yandex.passport.sloth.command.r
    public final /* bridge */ /* synthetic */ Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        return a(fVar);
    }
}
