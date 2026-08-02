package com.yandex.passport.sloth.command.performers;

import android.content.Context;
import defpackage.cg6;
import defpackage.ern;
import defpackage.gm5;
import defpackage.hld;
import defpackage.l1j;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.pmd;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class v implements com.yandex.passport.sloth.command.r {
    public final Context a;
    public final com.yandex.passport.sloth.v b;
    public final com.yandex.passport.sloth.data.m c;

    public v(Context context, com.yandex.passport.sloth.v vVar, com.yandex.passport.sloth.data.m mVar) {
        context.getClass();
        vVar.getClass();
        mVar.getClass();
        this.a = context;
        this.b = vVar;
        this.c = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if (r7.b.b(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        u uVar;
        int i;
        gm5 j;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.m = i2 - Integer.MIN_VALUE;
                Object obj = uVar.k;
                nm6 nm6Var = nm6.a;
                i = uVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Context context = this.a;
                    context.getClass();
                    if (pmd.e.b(context, 220000000) != 0 || (this.c.a instanceof com.yandex.passport.sloth.data.h0)) {
                        com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.f;
                        return dVar instanceof com.yandex.passport.sloth.command.s ? new l2b(dVar) : new m2b(dVar);
                    }
                    j = hld.j();
                    com.yandex.passport.sloth.t tVar = new com.yandex.passport.sloth.t(new com.yandex.passport.internal.sloth.performers.usermenu.c(j, 2));
                    uVar.j = j;
                    uVar.m = 1;
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
                    j = uVar.j;
                    qgg.h0(obj);
                }
                uVar.j = null;
                uVar.m = 2;
                obj = j.s(uVar);
            }
        }
        uVar = new u(this, (cg6) continuation);
        Object obj2 = uVar.k;
        nm6 nm6Var2 = nm6.a;
        i = uVar.m;
        if (i != 0) {
        }
        uVar.j = null;
        uVar.m = 2;
        obj2 = j.s(uVar);
    }

    @Override // com.yandex.passport.sloth.command.r
    public final /* bridge */ /* synthetic */ Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        return a(fVar);
    }
}
