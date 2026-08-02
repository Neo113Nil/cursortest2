package com.yandex.passport.sloth.url;

import com.yandex.passport.sloth.data.o0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uah;
import defpackage.xq0;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class x {
    public final com.yandex.passport.sloth.data.m a;
    public final com.yandex.passport.internal.sloth.z b;

    public x(com.yandex.passport.sloth.data.m mVar, com.yandex.passport.internal.sloth.z zVar) {
        mVar.getClass();
        zVar.getClass();
        this.a = mVar;
        this.b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        w wVar;
        int i;
        x xVar;
        LinkedHashMap linkedHashMap;
        o0 o0Var;
        String str;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i2 = wVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wVar.k;
                nm6 nm6Var = nm6.a;
                i = wVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    wVar.j = this;
                    wVar.m = 1;
                    obj = this.b.a(wVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    xVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = wVar.j;
                    qgg.h0(obj);
                }
                LinkedHashMap q = uah.q((Map) obj);
                linkedHashMap = new LinkedHashMap();
                o0Var = this.a.a;
                if ((o0Var instanceof com.yandex.passport.sloth.data.r) && (str = ((com.yandex.passport.sloth.data.r) o0Var).d().i) != null) {
                    linkedHashMap.put("origin", str);
                }
                xVar.getClass();
                return uah.i(q, linkedHashMap);
            }
        }
        wVar = new w(this, cg6Var);
        Object obj2 = wVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wVar.m;
        if (i != 0) {
        }
        LinkedHashMap q2 = uah.q((Map) obj2);
        linkedHashMap = new LinkedHashMap();
        o0Var = this.a.a;
        if (o0Var instanceof com.yandex.passport.sloth.data.r) {
            linkedHashMap.put("origin", str);
        }
        xVar.getClass();
        return uah.i(q2, linkedHashMap);
    }
}
