package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family;

import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class c implements a {
    public final g a;
    public final com.yandex.plus.pay.ui.webview.family.domain.a b;
    public final com.yandex.plus.log.api.b c;

    public c(g gVar, com.yandex.plus.pay.ui.webview.family.domain.a aVar, com.yandex.plus.log.api.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.a = gVar;
        this.b = aVar;
        this.c = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(1:10)(2:44|45))(4:46|(1:48)|49|(1:51))|11|12|(2:14|(1:16))|17|(4:19|(1:21)|22|(1:24))|(1:26)|27|(2:29|30)(2:32|(2:34|(2:36|37)(1:38))(1:(1:42)(2:40|41)))))|59|6|7|(0)(0)|11|12|(0)|17|(0)|(0)|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0068, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0065, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        b bVar;
        int i;
        boolean z;
        Throwable a;
        PlusPayWebFamilyInviteResult plusPayWebFamilyInviteResult;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                com.yandex.plus.log.api.b bVar2 = this.c;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "FamilyInvitationRepositoryImpl", "Started loading family invitation info");
                    }
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.ui.core.debug.internal.ui.form.b bVar3 = new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(this, continuation, 3);
                    bVar.l = 1;
                    obj = tyf.J(1000L, bVar3, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                z = obj instanceof t7o;
                if (!z) {
                    PlusPayWebFamilyInviteResult plusPayWebFamilyInviteResult2 = (PlusPayWebFamilyInviteResult) obj;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "FamilyInvitationRepositoryImpl", "Successfully got family invitation info: " + plusPayWebFamilyInviteResult2);
                    }
                }
                a = z7o.a(obj);
                com.yandex.plus.pay.ui.webview.family.domain.a aVar3 = this.b;
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    aVar3.a(message);
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar4)) {
                        bVar2.a(aVar4, "FamilyInvitationRepositoryImpl", "Failed to get family invitation info", a);
                    }
                }
                if (z) {
                    obj = null;
                }
                plusPayWebFamilyInviteResult = (PlusPayWebFamilyInviteResult) obj;
                if (!(plusPayWebFamilyInviteResult instanceof PlusPayWebFamilyInviteResult.Success)) {
                    return (PlusPayWebFamilyInviteResult.Success) plusPayWebFamilyInviteResult;
                }
                if (!(plusPayWebFamilyInviteResult instanceof PlusPayWebFamilyInviteResult.Cancelled)) {
                    if (plusPayWebFamilyInviteResult == null) {
                        return null;
                    }
                    b6e.s();
                    return null;
                }
                PlusPayWebFamilyInviteResult.Cancelled cancelled = (PlusPayWebFamilyInviteResult.Cancelled) plusPayWebFamilyInviteResult;
                aVar3.a(cancelled.getReason().getDescription());
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
                if (!bVar2.b(aVar5)) {
                    return null;
                }
                bVar2.c(aVar5, "FamilyInvitationRepositoryImpl", "Family invitation is cancelled: " + cancelled.getReason().getDescription());
                return null;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        com.yandex.plus.log.api.b bVar22 = this.c;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        z = obj2 instanceof t7o;
        if (!z) {
        }
        a = z7o.a(obj2);
        com.yandex.plus.pay.ui.webview.family.domain.a aVar32 = this.b;
        if (a != null) {
        }
        if (z) {
        }
        plusPayWebFamilyInviteResult = (PlusPayWebFamilyInviteResult) obj2;
        if (!(plusPayWebFamilyInviteResult instanceof PlusPayWebFamilyInviteResult.Success)) {
        }
    }
}
