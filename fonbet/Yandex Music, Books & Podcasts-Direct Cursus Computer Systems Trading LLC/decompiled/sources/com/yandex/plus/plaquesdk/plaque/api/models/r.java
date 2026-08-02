package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k5r;
import defpackage.u75;
import defpackage.vz1;
import defpackage.ype;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements o {
    public final String a;
    public final c0 b;
    public final a c;
    public final com.yandex.plus.plaquesdk.plaque.api.models.display.x d;
    public final List e;
    public final int f;

    public r(String str, c0 c0Var, a aVar, com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar, List list, int i) {
        str.getClass();
        aVar.getClass();
        xVar.getClass();
        list.getClass();
        this.a = str;
        this.b = c0Var;
        this.c = aVar;
        this.d = xVar;
        this.e = list;
        this.f = i;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.o
    public final List a() {
        return this.e;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final boolean b(x xVar) {
        xVar.getClass();
        if (!(xVar instanceof r)) {
            return false;
        }
        r rVar = (r) xVar;
        List list = rVar.e;
        if (!Intrinsics.d(this.d, rVar.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2.size() != list.size()) {
            return false;
        }
        Iterable f = u75.f(list2);
        if (!(f instanceof Collection) || !((Collection) f).isEmpty()) {
            ype it = f.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (!((x) list2.get(nextInt)).b((x) list.get(nextInt))) {
                    return false;
                }
            }
        }
        return this.f == rVar.f;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final com.yandex.plus.plaquesdk.plaque.api.models.display.x c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b) && Intrinsics.d(this.c, rVar.c) && Intrinsics.d(this.d, rVar.d) && Intrinsics.d(this.e, rVar.e) && this.f == rVar.f;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final a getContentDescription() {
        return this.c;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c0 c0Var = this.b;
        return Integer.hashCode(this.f) + k5r.d((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31)) * 31, 31, this.e);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final c0 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineGroupMicroWidgetModel(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", widgetDisplaySettings=");
        sb.append(this.d);
        sb.append(", microWidgetModels=");
        sb.append(this.e);
        sb.append(", orientation=");
        return vz1.r(sb, this.f, ')');
    }
}
