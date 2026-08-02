package com.yandex.plus.pay.ui.core.internal.config;

import com.yandex.plus.pay.internal.feature.user.d;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayUserAvatarInfo;
import defpackage.cg6;
import defpackage.hrg;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class b {
    public final g a;
    public final com.yandex.plus.pay.log.impl.b b;

    public b(g gVar, com.yandex.plus.pay.log.impl.b bVar) {
        bVar.getClass();
        this.a = gVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)|15|(1:17)|18|19))|35|6|7|(0)(0)|11|12|(0)|15|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0028, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        a aVar;
        int i;
        Throwable a;
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
                    d dVar = (d) this.a.i.getValue();
                    aVar.l = 1;
                    obj = dVar.a(aVar);
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
                Serializable serializable = ((PlusPayUserAvatarInfo) obj).getAvatarUrl();
                r7o r7oVar2 = z7o.b;
                a = z7o.a(serializable);
                if (a != null) {
                    com.yandex.plus.pay.log.impl.b bVar = this.b;
                    bVar.getClass();
                    bVar.a(com.yandex.plus.log.api.a.b, hrg.l('.', "PAY", "COMMON"), "Could't get user avatar", a);
                }
                return serializable instanceof t7o ? null : serializable;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        Serializable serializable2 = ((PlusPayUserAvatarInfo) obj2).getAvatarUrl();
        r7o r7oVar22 = z7o.b;
        a = z7o.a(serializable2);
        if (a != null) {
        }
        return serializable2 instanceof t7o ? null : serializable2;
    }
}
