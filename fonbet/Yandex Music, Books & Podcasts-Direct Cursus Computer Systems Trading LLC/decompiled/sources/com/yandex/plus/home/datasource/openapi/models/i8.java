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
public final class i8 extends k4f {
    public static final i8 d = new i8(ern.a(h8.class));

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
        if (hashCode != 69617) {
            if (hashCode != 69621) {
                if (hashCode == 2157955 && str.equals("FILL")) {
                    return s2.Companion.serializer();
                }
            } else if (str.equals("FIX")) {
                return y2.Companion.serializer();
            }
        } else if (str.equals("FIT")) {
            return v2.Companion.serializer();
        }
        rj7.i(str, " for NetworkWidthTypeModel", "Can't find discriminator=");
        return null;
    }
}
