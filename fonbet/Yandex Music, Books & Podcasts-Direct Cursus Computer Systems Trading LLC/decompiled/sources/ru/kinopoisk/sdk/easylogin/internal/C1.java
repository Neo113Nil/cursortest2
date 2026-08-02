package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r7o;
import defpackage.t7o;
import defpackage.w3f;
import defpackage.w4f;
import defpackage.z4f;
import defpackage.z7o;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class C1 implements InterfaceC1281x2 {

    @NotNull
    public final B1 a;

    public C1(@NotNull B1 b1) {
        b1.getClass();
        this.a = b1;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1281x2
    public final K7 a(@NotNull String str) {
        Object t7oVar;
        str.getClass();
        B1 b1 = this.a;
        b1.getClass();
        String string = b1.b.getString(str, null);
        if (string == null) {
            return null;
        }
        w3f w3fVar = b1.c;
        try {
            r7o r7oVar = z7o.b;
            w3fVar.getClass();
            t7oVar = (w4f) w3fVar.b(z4f.a, string);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Timber.INSTANCE.tag("ConfigCacheStorage").e(a, "Failed to parse to JsonElement %s", string);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        w4f w4fVar = (w4f) t7oVar;
        if (w4fVar != null) {
            return new K7(w4fVar, B1.d);
        }
        return null;
    }
}
