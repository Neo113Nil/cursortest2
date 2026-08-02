package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;
import defpackage.ern;
import defpackage.gm5;
import defpackage.hld;
import defpackage.l1j;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class o implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;

    public o(com.yandex.passport.sloth.v vVar) {
        vVar.getClass();
        this.a = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r7.a.c(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        n nVar;
        int i;
        gm5 j;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nVar.k;
                nm6 nm6Var = nm6.a;
                i = nVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    j = hld.j();
                    com.yandex.passport.sloth.b0 b0Var = new com.yandex.passport.sloth.b0(new com.yandex.passport.internal.sloth.performers.usermenu.c(j, 1));
                    nVar.j = j;
                    nVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        if (obj instanceof com.yandex.passport.sloth.command.s) {
                            return new l2b(obj);
                        }
                        if (obj instanceof com.yandex.passport.sloth.command.d) {
                            return new m2b(obj);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(obj);
                        sb.append(" is neither ");
                        sb.append(ern.a(com.yandex.passport.sloth.command.d.class));
                        l1j.o(sb, " nor ", ern.a(com.yandex.passport.sloth.command.s.class));
                        return null;
                    }
                    j = nVar.j;
                    qgg.h0(obj);
                }
                nVar.j = null;
                nVar.m = 2;
                obj = j.s(nVar);
            }
        }
        nVar = new n(this, (cg6) continuation);
        Object obj2 = nVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nVar.m;
        if (i != 0) {
        }
        nVar.j = null;
        nVar.m = 2;
        obj2 = j.s(nVar);
    }

    @Override // com.yandex.passport.sloth.command.r
    public final /* bridge */ /* synthetic */ Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        return a(fVar);
    }
}
