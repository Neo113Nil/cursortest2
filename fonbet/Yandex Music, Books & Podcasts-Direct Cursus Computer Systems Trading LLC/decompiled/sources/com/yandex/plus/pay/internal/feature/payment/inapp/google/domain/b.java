package com.yandex.plus.pay.internal.feature.payment.inapp.google.domain;

import com.yandex.passport.internal.ui.social.i;
import com.yandex.plus.pay.api.google.model.f;
import com.yandex.plus.pay.internal.di.m;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.pay.inapp.api.b a;
    public final kotlinx.coroutines.a b;
    public final m c;

    public b(com.yandex.plus.pay.inapp.api.b bVar, kotlinx.coroutines.a aVar, m mVar) {
        bVar.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = aVar;
        this.c = mVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)|15|(1:20)(2:17|18)))|34|6|7|(0)(0)|11|12|(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, cg6 cg6Var) {
        a aVar;
        Object obj;
        int i;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.inapp.api.b bVar2 = bVar.a;
                    aVar.l = 1;
                    obj = bVar2.a(aVar);
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
                if (!(obj instanceof t7o)) {
                    obj = new f(((com.yandex.plus.pay.inapp.api.a) obj).a);
                }
                if (obj instanceof t7o) {
                    return obj;
                }
                return null;
            }
        }
        aVar = new a(bVar, cg6Var);
        obj = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (!(obj instanceof t7o)) {
        }
        if (obj instanceof t7o) {
        }
    }

    public final Object b(cg6 cg6Var) {
        return x97.V(this.b, new i(this, null, 27), cg6Var);
    }
}
