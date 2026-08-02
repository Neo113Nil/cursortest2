package com.yandex.plus.home.dailyquests.feature.internal.domain;

import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.l;
import defpackage.av7;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.home.dailyquests.repository.rest.c a;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|12|(1:14)|15|(1:17)|(1:22)(2:19|20)))|37|6|7|(0)(0)|11|12|(0)|15|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(cg6 cg6Var) {
        a aVar;
        int i;
        boolean z;
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
                    com.yandex.plus.home.dailyquests.repository.rest.c cVar = this.a;
                    aVar.l = 1;
                    obj = x97.V(cVar.h, new av7(cVar, null), aVar);
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
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "ActivateQuestInteractorImpl.activateQuest() success, quest=" + ((l) obj), null);
                }
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    jyr jyrVar2 = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "ActivateQuestInteractorImpl.activateQuest() error", a);
                }
                if (z) {
                    return obj;
                }
                return null;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        z = obj2 instanceof t7o;
        if (!z) {
        }
        a = z7o.a(obj2);
        if (a != null) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|12|(1:14)|15|(1:17)|(1:22)(2:19|20)))|36|6|7|(0)(0)|11|12|(0)|15|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(boolean z, cg6 cg6Var) {
        c cVar;
        int i;
        boolean z2;
        Throwable a;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.home.dailyquests.repository.rest.c cVar2 = this.a;
                    cVar.l = 1;
                    obj = x97.V(cVar2.h, new com.yandex.plus.home.dailyquests.repository.rest.a(cVar2, ((com.yandex.plus.domain.auth.api.e) cVar2.f.invoke()).getId(), z, null), cVar);
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
                z2 = obj instanceof t7o;
                if (!z2) {
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "GetQuestInteractorImpl.getQuest() success, quest=" + ((l) obj), null);
                }
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    jyr jyrVar2 = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "GetQuestInteractorImpl.getQuest() error", a);
                }
                if (z2) {
                    return obj;
                }
                return null;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        z2 = obj2 instanceof t7o;
        if (!z2) {
        }
        a = z7o.a(obj2);
        if (a != null) {
        }
        if (z2) {
        }
    }

    public b(com.yandex.plus.home.dailyquests.repository.rest.c cVar) {
        this.a = cVar;
    }
}
