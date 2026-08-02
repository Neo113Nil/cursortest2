package com.yandex.plus.home.common.utils;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.btf;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uh;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class m extends u {
    public static final jyr a = btf.b(new s(21));

    @Override // com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u
    public final Object A(String[] strArr, Continuation continuation) {
        return com.yandex.plus.core.activity.result.internal.h.d.A(strArr, continuation);
    }

    @Override // com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u
    public final Object m(String str, Continuation continuation) {
        return com.yandex.plus.core.activity.result.internal.h.d.m("*/*", continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(uh uhVar, Object obj, cg6 cg6Var) {
        l lVar;
        int i;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.j;
                nm6 nm6Var = nm6.a;
                i = lVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj2);
                        return ((z7o) obj2).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj2);
                com.yandex.plus.core.activity.result.internal.h hVar = com.yandex.plus.core.activity.result.internal.h.d;
                lVar.l = 1;
                Object u = hVar.u(uhVar, obj, lVar);
                return u == nm6Var ? nm6Var : u;
            }
        }
        lVar = new l(this, cg6Var);
        Object obj22 = lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lVar.l;
        if (i == 0) {
        }
    }
}
