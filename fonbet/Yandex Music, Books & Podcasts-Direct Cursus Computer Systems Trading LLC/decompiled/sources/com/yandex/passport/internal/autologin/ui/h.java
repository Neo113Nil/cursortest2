package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import com.yandex.passport.internal.impl.f0;
import defpackage.gm5;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rjc;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h implements rjc {
    public final /* synthetic */ k a;
    public final /* synthetic */ gm5 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ com.yandex.passport.internal.properties.g d;

    public h(k kVar, gm5 gm5Var, Context context, com.yandex.passport.internal.properties.g gVar) {
        this.a = kVar;
        this.b = gm5Var;
        this.c = context;
        this.d = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        g gVar;
        int i;
        com.yandex.passport.internal.sloth.credentialmanager.a aVar;
        int i2;
        Object c;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.k = i3 - Integer.MIN_VALUE;
                Object obj2 = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.k;
                k kVar = this.a;
                gm5 gm5Var = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    aVar = (com.yandex.passport.internal.sloth.credentialmanager.a) obj;
                    f0 f0Var = kVar.a;
                    gVar.m = aVar;
                    gVar.n = 0;
                    gVar.k = 1;
                    if (f0Var.u(true, gVar) != nm6Var) {
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    c = ((z7o) obj2).a;
                    r7o r7oVar = z7o.b;
                    if (!(c instanceof t7o)) {
                        gm5Var.U(new z7o((com.yandex.passport.internal.entities.d) c));
                    }
                    Throwable a = z7o.a(c);
                    if (a != null) {
                        gm5Var.U(new z7o(new t7o(a)));
                    }
                    return Unit.a;
                }
                i2 = gVar.n;
                aVar = gVar.m;
                qgg.h0(obj2);
                ((z7o) obj2).getClass();
                if (aVar != null) {
                    r7o r7oVar2 = z7o.b;
                    gm5Var.U(new z7o(new t7o(new com.yandex.passport.api.exception.d("Can't request credentials from credential manager"))));
                    return Unit.a;
                }
                gVar.m = null;
                gVar.n = i2;
                gVar.k = 2;
                c = kVar.c(this.c, aVar, this.d, gVar);
            }
        }
        gVar = new g(this, continuation);
        Object obj22 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.k;
        k kVar2 = this.a;
        gm5 gm5Var2 = this.b;
        if (i != 0) {
        }
        if (aVar != null) {
        }
    }
}
