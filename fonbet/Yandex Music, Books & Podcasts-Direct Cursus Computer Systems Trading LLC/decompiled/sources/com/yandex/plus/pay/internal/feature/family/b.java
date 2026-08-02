package com.yandex.plus.pay.internal.feature.family;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.pay.graphql.family.b a;
    public final com.yandex.plus.pay.log.impl.b b;

    public b(com.yandex.plus.pay.graphql.family.b bVar, com.yandex.plus.pay.log.impl.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:44|45))(3:46|47|(1:49))|11|12|(2:14|(4:16|(1:(2:19|(2:21|(2:23|(1:25)(2:29|30))(1:31))(1:32))(1:33))(1:34)|26|27)(2:35|(2:37|38)(2:39|40)))(2:41|42)))|57|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0051, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004e, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0050, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0047, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a aVar;
        int i;
        Throwable a;
        PlusPayWebFamilyInviteResult.Cancelled.Reason reason;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.graphql.family.b bVar = this.a;
                    aVar.l = 1;
                    obj = bVar.a(aVar);
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
                a = z7o.a(obj);
                if (a == null) {
                    com.yandex.plus.pay.log.impl.b.f(this.b, com.yandex.plus.pay.common.internal.log.a.g, null, a, 10);
                    throw r1.U(a);
                }
                com.yandex.plus.pay.repository.api.model.family.d dVar = (com.yandex.plus.pay.repository.api.model.family.d) obj;
                dVar.getClass();
                if (!(dVar instanceof com.yandex.plus.pay.repository.api.model.family.b)) {
                    if (dVar instanceof com.yandex.plus.pay.repository.api.model.family.c) {
                        com.yandex.plus.pay.repository.api.model.family.c cVar = (com.yandex.plus.pay.repository.api.model.family.c) dVar;
                        return new PlusPayWebFamilyInviteResult.Success(cVar.a, cVar.b);
                    }
                    b6e.s();
                    return null;
                }
                int ordinal = ((com.yandex.plus.pay.repository.api.model.family.b) dVar).a.ordinal();
                if (ordinal == 0) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.MAX_FAMILY_MEMBERS;
                } else if (ordinal == 1) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.USER_HAS_NO_FAMILY;
                } else if (ordinal == 2) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.USER_IS_A_FAMILY_CHILD;
                } else if (ordinal == 3) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.USER_REGION_IS_NOT_SUPPORTED;
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.UNKNOWN_REASON;
                }
                return new PlusPayWebFamilyInviteResult.Cancelled(reason);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        if (a == null) {
        }
    }
}
