package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import android.os.Message;
import defpackage.cg6;
import defpackage.cxb;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;

/* loaded from: classes4.dex */
public interface t {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        r6 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object b(t tVar, m mVar, cg6 cg6Var) {
        s sVar;
        int i;
        Throwable a;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = sVar.j;
                nm6 nm6Var = nm6.a;
                i = sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    sVar.l = 1;
                    obj = tVar.a(mVar, sVar);
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
                Object t7oVar = (i) obj;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(t7oVar);
                if (a != null) {
                    i iVar = (i) t7oVar;
                    iVar.getClass();
                    Message obtain = Message.obtain(null, 110, cxb.K(new Pair("HostResponse", iVar)));
                    obtain.getClass();
                    return obtain;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable(Constants.KEY_EXCEPTION, a);
                Message obtain2 = Message.obtain(null, 110, bundle);
                obtain2.getClass();
                return obtain2;
            }
        }
        sVar = new s(tVar, cg6Var);
        Object obj2 = sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = sVar.l;
        if (i != 0) {
        }
        Object t7oVar2 = (i) obj2;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(t7oVar2);
        if (a != null) {
        }
    }

    Object a(m mVar, s sVar);
}
