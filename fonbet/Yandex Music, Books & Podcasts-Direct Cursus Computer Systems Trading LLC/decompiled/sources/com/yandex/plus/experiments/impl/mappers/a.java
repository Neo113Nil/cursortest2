package com.yandex.plus.experiments.impl.mappers;

import com.yandex.plus.experiments.api.cache.f;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a {
    public final Object a(f fVar) {
        fVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            String str = fVar.a;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str2 = fVar.b;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List list = fVar.c;
            if (list == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Set set = fVar.d;
            if (set != null) {
                return new com.yandex.plus.experiments.api.a(str, str2, list, set);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
