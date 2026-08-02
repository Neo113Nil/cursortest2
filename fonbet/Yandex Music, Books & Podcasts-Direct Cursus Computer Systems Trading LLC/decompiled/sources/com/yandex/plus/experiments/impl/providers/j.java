package com.yandex.plus.experiments.impl.providers;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.r0;
import com.yandex.plus.core.graphql.s0;
import com.yandex.plus.core.graphql.t0;
import com.yandex.plus.core.graphql.u0;
import defpackage.cg6;
import defpackage.jwj;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class j implements com.yandex.plus.experiments.api.providers.a {
    public final com.yandex.plus.core.graphql.internal.c a;
    public final com.yandex.plus.core.graphql.target.a b;
    public final com.yandex.plus.experiments.impl.mappers.a c;
    public final Map d;

    public j(com.yandex.plus.core.graphql.internal.c cVar, com.yandex.plus.core.graphql.target.a aVar, com.yandex.plus.experiments.impl.mappers.a aVar2, Map map) {
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        map.getClass();
        this.a = cVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.experiments.api.providers.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        i iVar;
        int i;
        Object a;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                nm6 nm6Var = nm6.a;
                i = iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    this.b.a.getClass();
                    u0 u0Var = new u0(r1.K(this.d), jwj.f);
                    iVar.l = 1;
                    a = this.a.a(u0Var, iVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(a instanceof t7o)) {
                    return a;
                }
                r0 r0Var = (r0) a;
                this.c.getClass();
                r0Var.getClass();
                s0 s0Var = r0Var.a;
                ArrayList<t0> arrayList = s0Var.c;
                ArrayList O = CollectionsKt.O(arrayList);
                HashSet hashSet = new HashSet();
                Iterator it = O.iterator();
                while (it.hasNext()) {
                    z75.t(hashSet, ((t0) it.next()).a);
                }
                String str = s0Var.a;
                String str2 = s0Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (t0 t0Var : arrayList) {
                    Long valueOf = t0Var != null ? Long.valueOf(t0Var.b) : null;
                    if (valueOf != null) {
                        arrayList2.add(valueOf);
                    }
                }
                return new com.yandex.plus.experiments.api.a(str, str2, arrayList2, hashSet);
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (!(a instanceof t7o)) {
        }
    }
}
