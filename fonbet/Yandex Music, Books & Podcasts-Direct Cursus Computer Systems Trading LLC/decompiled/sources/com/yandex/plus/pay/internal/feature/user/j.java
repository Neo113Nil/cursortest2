package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.internal.model.PlusPayUserAvatarInfo;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.vdr;
import defpackage.wis;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class j {
    public final vdr a;
    public final com.yandex.plus.pay.graphql.avatar.b b;
    public final com.yandex.plus.pay.log.impl.b c;

    public j(xdr xdrVar, com.yandex.plus.pay.graphql.avatar.b bVar, com.yandex.plus.pay.log.impl.b bVar2) {
        xdrVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = xdrVar;
        this.b = bVar;
        this.c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        i iVar;
        int i;
        String l;
        String str;
        Throwable th;
        wis e;
        t7o t7oVar;
        Throwable a;
        try {
            if (cg6Var instanceof i) {
                iVar = (i) cg6Var;
                int i2 = iVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = iVar.k;
                    nm6 nm6Var = nm6.a;
                    i = iVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        Long id = ((com.yandex.plus.domain.auth.api.e) this.a.getValue()).getId();
                        if (id == null || (l = id.toString()) == null) {
                            throw new com.yandex.plus.pay.api.exception.a("User must be authorized to get user info", null);
                        }
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.graphql.avatar.b bVar = this.b;
                            iVar.j = l;
                            iVar.m = 1;
                            Object a2 = bVar.a(l, iVar);
                            if (a2 == nm6Var) {
                                return nm6Var;
                            }
                            str = l;
                            obj = a2;
                        } catch (wis e2) {
                            str = l;
                            e = e2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th2) {
                            str = l;
                            th = th2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = iVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (wis e3) {
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                        }
                    }
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a != null) {
                        return new PlusPayUserAvatarInfo(str, ((com.yandex.plus.pay.repository.api.model.user.a) obj).a);
                    }
                    com.yandex.plus.pay.log.impl.b.f(this.c, com.yandex.plus.pay.common.internal.log.a.d, null, a, 10);
                    throw r1.U(a);
                }
            }
            if (i != 0) {
            }
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
    }
}
