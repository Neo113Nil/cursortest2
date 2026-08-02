package com.yandex.plus.core.network.api.interceptors;

import com.yandex.passport.internal.ui.social.i;
import defpackage.b0o;
import defpackage.bse;
import defpackage.d0o;
import defpackage.l3o;
import defpackage.o3o;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.ukn;
import defpackage.x97;
import defpackage.z7o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f implements bse {
    public final Object a;
    public final Function2 b;
    public final com.yandex.plus.log.api.b c;

    public f(Function1 function1, Function2 function2, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = function1;
        this.b = function2;
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009c, code lost:
    
        if (r8.intValue() != 401) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        if (r8.intValue() != 403) goto L55;
     */
    @Override // defpackage.bse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l3o b(ukn uknVar) {
        Object t7oVar;
        Integer num;
        String I;
        Object obj;
        String obj2;
        l3o f = uknVar.f((d0o) uknVar.i);
        int i = f.d;
        d0o d0oVar = f.a;
        com.yandex.plus.log.api.b bVar = this.c;
        Continuation continuation = null;
        if (i != 401 && i != 403) {
            if (d0oVar.c.a("X-APOLLO-OPERATION-NAME") == null) {
                num = null;
            } else {
                try {
                    r7o r7oVar = z7o.b;
                    o3o o3oVar = f.g;
                    t7oVar = (o3oVar == null || (I = com.yandex.plus.bdui.flex.ui.a.I(o3oVar)) == null || (obj = new JSONObject(I).get("status")) == null || (obj2 = obj.toString()) == null) ? null : Integer.valueOf(Integer.parseInt(obj2));
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                boolean z = t7oVar instanceof t7o;
                if (!z) {
                    Integer num2 = (Integer) t7oVar;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "RefreshTokenInterceptor", "apolloHttpCode() = " + num2);
                    }
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar2)) {
                        bVar.a(aVar2, "RefreshTokenInterceptor", "apolloHttpCode()", a);
                    }
                }
                if (z) {
                    t7oVar = null;
                }
                num = (Integer) t7oVar;
            }
            if (num != null) {
            }
            if (num != null) {
            }
            return f;
        }
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "RefreshTokenInterceptor", "Try refresh token, receive code=" + i);
        }
        String str = (String) x97.D(g.a, new i(this, continuation, 10));
        if (str != null) {
            if (bVar.b(aVar3)) {
                bVar.c(aVar3, "RefreshTokenInterceptor", "Token is refreshed, proceed request again");
            }
            d0o b = ((b0o) this.b.invoke(d0oVar.b(), str)).b();
            f.close();
            return uknVar.f(b);
        }
        return f;
    }
}
