package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.model.FamilyRole;
import com.yandex.plus.pay.api.model.Feature;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.g4;
import com.yandex.plus.pay.data.mb.dto.z1;
import com.yandex.plus.pay.internal.model.mappers.n;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.su4;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes5.dex */
public final class h {
    public final com.yandex.plus.domain.auth.impl.i a;
    public final ExternalMediaBillingApi b;
    public final kotlinx.coroutines.a c;
    public final com.yandex.plus.pay.log.impl.b d;
    public final jyr e;
    public final xdr f;
    public final xdr g;

    public h(com.yandex.plus.domain.auth.impl.i iVar, ExternalMediaBillingApi externalMediaBillingApi, kotlinx.coroutines.a aVar, com.yandex.plus.pay.log.impl.b bVar) {
        externalMediaBillingApi.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = iVar;
        this.b = externalMediaBillingApi;
        this.c = aVar;
        this.d = bVar;
        this.e = btf.b(new com.yandex.plus.pay.internal.di.g(17));
        xdr a = ydr.a(null);
        this.f = a;
        this.g = a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|(8:15|(1:(1:(1:19)(2:29|30))(1:31))(1:32)|20|21|(2:24|22)|25|26|27)(2:33|34))(2:36|37))(1:38))(1:47)|39|(2:41|42)(2:45|46)))|56|6|7|(0)(0)|39|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r0 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0050, code lost:
    
        if (r0 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0082, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        g gVar;
        Object obj;
        int i;
        FamilyRole familyRole;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                xdr xdrVar = this.f;
                com.yandex.plus.pay.log.impl.b bVar = this.d;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    gVar.l = 1;
                    obj = this.a.e(gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        Throwable a = z7o.a(obj);
                        if (a != null) {
                            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                            bVar.getClass();
                            bVar.a(aVar, "RestUserStatusRepository", su4.p(a, new StringBuilder("Failed to update user status: ")), a);
                            throw a;
                        }
                        n nVar = (n) this.e.getValue();
                        g4 g4Var = (g4) ((com.yandex.plus.pay.common.api.utils.b) obj).a;
                        nVar.getClass();
                        g4Var.getClass();
                        long j = g4Var.a;
                        String str = g4Var.b;
                        int ordinal = g4Var.c.ordinal();
                        if (ordinal == 0) {
                            familyRole = FamilyRole.PARENT;
                        } else if (ordinal == 1) {
                            familyRole = FamilyRole.CHILD;
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            familyRole = FamilyRole.NONE;
                        }
                        FamilyRole familyRole2 = familyRole;
                        List<z1> list = g4Var.d;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (z1 z1Var : list) {
                            arrayList.add(new Feature(new Date(z1Var.a), z1Var.b));
                        }
                        PlusPayUserStatus plusPayUserStatus = new PlusPayUserStatus(j, str, familyRole2, arrayList);
                        xdrVar.getClass();
                        xdrVar.m(null, plusPayUserStatus);
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        bVar.getClass();
                        bVar.c(aVar2, "RestUserStatusRepository", "User status updated successfully");
                        return plusPayUserStatus;
                    }
                    qgg.h0(obj);
                }
                if (!(obj instanceof com.yandex.plus.domain.auth.api.d)) {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                    bVar.getClass();
                    bVar.c(aVar3, "RestUserStatusRepository", "update() skipped - user is not authorized");
                    xdrVar.l(null);
                    throw new PlusPayUnauthorizedException(new com.yandex.plus.home.common.network.g(NetworkRequestException.EXPIRED_SIGNATURE, "User must be authorized"));
                }
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
                bVar.getClass();
                bVar.c(aVar4, "RestUserStatusRepository", "Starting user status update");
                r7o r7oVar2 = z7o.b;
                kotlinx.coroutines.a aVar5 = this.c;
                com.yandex.passport.internal.ui.social.i iVar = new com.yandex.passport.internal.ui.social.i(this, continuation, 28);
                gVar.l = 2;
                obj = x97.V(aVar5, iVar, gVar);
            }
        }
        gVar = new g(this, cg6Var);
        obj = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        xdr xdrVar2 = this.f;
        com.yandex.plus.pay.log.impl.b bVar2 = this.d;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!(obj instanceof com.yandex.plus.domain.auth.api.d)) {
        }
    }
}
