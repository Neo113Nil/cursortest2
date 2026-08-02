package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r7o;
import defpackage.swf;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.w3f;
import defpackage.x3f;
import defpackage.z7o;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1046g1 {
    public static final <T> C1032f1<T> a(@NotNull JSONObject jSONObject, @NotNull Type type) {
        Object t7oVar;
        jSONObject.getClass();
        type.getClass();
        try {
            r7o r7oVar = z7o.b;
            w3f w3fVar = x3f.d;
            t9f h0 = swf.h0(w3fVar.b, type);
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            t7oVar = (C1032f1) w3fVar.b(h0, jSONObject2);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (C1032f1) t7oVar;
    }
}
