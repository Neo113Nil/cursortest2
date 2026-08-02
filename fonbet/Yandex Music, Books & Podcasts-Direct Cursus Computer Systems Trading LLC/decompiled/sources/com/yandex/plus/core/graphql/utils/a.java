package com.yandex.plus.core.graphql.utils;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements pj {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                map.getClass();
                r1.W(r7fVar, map);
                break;
            default:
                Map map2 = (Map) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                map2.getClass();
                r1.W(r7fVar, map2);
                break;
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        switch (this.a) {
            case 0:
                a7fVar.getClass();
                fx6Var.getClass();
                a7fVar.j();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (a7fVar.hasNext()) {
                    String L = a7fVar.L();
                    Object A = r1.A(a7fVar);
                    if (A != null) {
                        linkedHashMap.put(L, A);
                    }
                }
                a7fVar.p();
                return linkedHashMap;
            default:
                a7fVar.getClass();
                fx6Var.getClass();
                a7fVar.j();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (a7fVar.hasNext()) {
                    String L2 = a7fVar.L();
                    String f0 = a7fVar.f0();
                    if (f0 != null) {
                    }
                }
                a7fVar.p();
                return linkedHashMap2;
        }
    }
}
