package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.swf;
import defpackage.t9f;
import defpackage.w3f;
import defpackage.x3f;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1004d1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1018e1 {
    @NotNull
    public static final String a(@NotNull C1004d1<?> c1004d1) {
        c1004d1.getClass();
        T t = c1004d1.c;
        Class cls = t != 0 ? t.getClass() : Unit.class;
        C1004d1.Companion companion = C1004d1.INSTANCE;
        w3f w3fVar = x3f.d;
        t9f serializer = companion.serializer(swf.h0(w3fVar.b, cls));
        serializer.getClass();
        return w3fVar.c(serializer, c1004d1);
    }
}
