package com.yandex.plus.bdui.flex.utils;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.templating.render.z;
import defpackage.cg6;
import defpackage.j0v;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.tlm;
import defpackage.xq0;
import defpackage.z75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g {
    public final com.yandex.plus.bdui.flex.factory.e a;
    public final com.yandex.plus.bdui.plus.content.controller.f b;
    public final com.yandex.plus.log.api.b c;
    public final String d;
    public final String e;

    public g(com.yandex.plus.bdui.flex.factory.e eVar, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.log.api.b bVar, String str, String str2) {
        bVar.getClass();
        this.a = eVar;
        this.b = fVar;
        this.c = bVar;
        this.d = str;
        this.e = str2;
    }

    public static d a(com.yandex.plus.bdui.shared.b bVar, Object obj) {
        bVar.getClass();
        obj.getClass();
        com.yandex.plus.bdui.shared.b a = bVar.a();
        Set j = u.j(a);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : j) {
            if (!((z) obj2).b()) {
                arrayList.add(obj2);
            }
        }
        Set A0 = CollectionsKt.A0(arrayList);
        Set j2 = u.j(obj);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : j2) {
            if (!((z) obj3).b()) {
                arrayList2.add(obj3);
            }
        }
        return new d(bVar, a, A0, CollectionsKt.A0(arrayList2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|14|(2:16|(1:18))|19)(2:22|23))(3:24|25|26))(4:30|(1:32)|33|(2:35|29)(1:36))|27))|44|6|7|(0)(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r6.c(r13, r8, r10, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0035, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        r13 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0033, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0031, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        r13 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r13v3, types: [t7o] */
    /* JADX WARN: Type inference failed for: r13v6, types: [t7o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d dVar, cg6 cg6Var) {
        e eVar;
        int i;
        int i2;
        g gVar;
        int i3;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i4 = eVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.p = i4 - Integer.MIN_VALUE;
                Object obj = eVar.n;
                nm6 nm6Var = nm6.a;
                i = eVar.p;
                String str = this.d;
                com.yandex.plus.log.api.b bVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, str, "Templates rendering started");
                    }
                    r7o r7oVar = z7o.b;
                    Set set = dVar.c;
                    com.yandex.plus.bdui.shared.b bVar2 = dVar.a;
                    eVar.j = dVar;
                    eVar.k = this;
                    i2 = 0;
                    eVar.l = 0;
                    eVar.m = 0;
                    eVar.p = 1;
                    if (c(set, bVar2, "Shared data", eVar) == nm6Var) {
                        return nm6Var;
                    }
                    gVar = this;
                    i3 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dVar = eVar.j;
                        qgg.h0(obj);
                        r7o r7oVar2 = z7o.b;
                        Throwable a = z7o.a(dVar);
                        if (a != null) {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                            if (bVar.b(aVar2)) {
                                bVar.a(aVar2, str, "Templates rendering failed!", a);
                            }
                        }
                        return dVar;
                    }
                    int i5 = eVar.m;
                    i3 = eVar.l;
                    gVar = eVar.k;
                    d dVar2 = eVar.j;
                    qgg.h0(obj);
                    i2 = i5;
                    dVar = dVar2;
                }
                Set set2 = dVar.d;
                com.yandex.plus.bdui.shared.b bVar3 = dVar.b;
                String str2 = gVar.e;
                eVar.j = dVar;
                eVar.k = null;
                eVar.l = i3;
                eVar.m = i2;
                eVar.p = 2;
            }
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.n;
        nm6 nm6Var2 = nm6.a;
        i = eVar.p;
        String str3 = this.d;
        com.yandex.plus.log.api.b bVar4 = this.c;
        if (i != 0) {
        }
        Set set22 = dVar.d;
        com.yandex.plus.bdui.shared.b bVar32 = dVar.b;
        String str22 = gVar.e;
        eVar.j = dVar;
        eVar.k = null;
        eVar.l = i3;
        eVar.m = i2;
        eVar.p = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Set set, com.yandex.plus.bdui.shared.b bVar, String str, cg6 cg6Var) {
        f fVar;
        int i;
        com.yandex.plus.log.api.b bVar2;
        com.yandex.plus.log.api.a aVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                bVar2 = this.c;
                String str2 = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    if (set.isEmpty()) {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar2.b(aVar2)) {
                            bVar2.c(aVar2, str2, str + " templates is empty");
                        }
                        return Unit.a;
                    }
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar3)) {
                        StringBuilder m = tlm.m(str, " templates rendering started; placeholders = ");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            Set c = ((z) it.next()).c();
                            if (c == null) {
                                c = q5b.a;
                            }
                            z75.t(arrayList, c);
                        }
                        m.append(arrayList);
                        bVar2.c(aVar3, str2, m.toString());
                    }
                    j0v j0vVar = new j0v(this, (Continuation) null, 15);
                    fVar.j = str;
                    fVar.m = 1;
                    if (this.a.h(set, j0vVar, bVar, fVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = fVar.j;
                    qgg.h0(obj);
                }
                aVar = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, str2, str + " templates rendering finished");
                }
                return Unit.a;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        bVar2 = this.c;
        String str22 = this.d;
        if (i != 0) {
        }
        aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
        }
        return Unit.a;
    }
}
