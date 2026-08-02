package com.yandex.plus.home.datasource.openapi.models;

import defpackage.b6e;
import defpackage.ern;
import defpackage.k4f;
import defpackage.r7o;
import defpackage.rj7;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.w4f;
import defpackage.x4f;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class h extends k4f {
    public static final h d = new h(ern.a(g.class));

    @Override // defpackage.k4f
    public final t9f c(w4f w4fVar) {
        Object t7oVar;
        w4fVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            w4f w4fVar2 = (w4f) x4f.f(w4fVar).get("type");
            t7oVar = w4fVar2 != null ? x4f.g(w4fVar2).a() : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (z7o.a(t7oVar) != null) {
            b6e.l(w4fVar, "Invalid discriminator for element=");
            return null;
        }
        String str = (String) t7oVar;
        int hashCode = str.hashCode();
        if (hashCode != -1984573540) {
            if (hashCode != 1143313449) {
                if (hashCode == 1411860198 && str.equals("DEEPLINK")) {
                    return p1.Companion.serializer();
                }
            } else if (str.equals("JUST_INTERACT")) {
                return c4.Companion.serializer();
            }
        } else if (str.equals("SERVICE_SPECIFIC")) {
            return d7.Companion.serializer();
        }
        rj7.i(str, " for NetworkActionModel", "Can't find discriminator=");
        return null;
    }
}
