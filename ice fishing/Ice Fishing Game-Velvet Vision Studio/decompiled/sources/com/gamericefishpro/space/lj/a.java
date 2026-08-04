package com.gamericefishpro.space.lj;

import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.f1.h;
import com.gamericefishpro.space.ph.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public final List a;
    public int b;

    public a(int i, ArrayList _values) {
        _values = (i & 1) != 0 ? new ArrayList() : _values;
        Intrinsics.checkNotNullParameter(_values, "_values");
        this.a = _values;
    }

    public Object a(g clazz) throws h {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        List list = this.a;
        if (list.size() > 0) {
            return list.get(0);
        }
        String msg = "Can't get injected parameter #0 from " + this + " for type '" + com.gamericefishpro.space.qj.a.a(clazz) + '\'';
        Intrinsics.checkNotNullParameter(msg, "msg");
        throw new h(msg);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f A[RETURN] */
    public Object b(g clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        int i = this.b;
        List list2 = this.a;
        Object obj = list2.get(i);
        if (!clazz.d(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null && this.b < x.e(list2)) {
            this.b++;
        }
        if (obj2 != null) {
            return obj2;
        }
        for (Object obj3 : list) {
            if (clazz.d(obj3)) {
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            }
        }
        obj3 = null;
        if (obj3 == null) {
            return null;
        }
        return obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.a(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + CollectionsKt.L(this.a);
    }
}
