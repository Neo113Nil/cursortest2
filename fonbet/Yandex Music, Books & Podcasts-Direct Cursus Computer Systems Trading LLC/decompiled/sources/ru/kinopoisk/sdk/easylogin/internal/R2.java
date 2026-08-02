package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ca8;
import defpackage.dq7;
import defpackage.j5h;
import defpackage.mn7;
import defpackage.y4h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class R2 implements Q2 {

    @NotNull
    public final y4h a;

    @NotNull
    public final kotlinx.coroutines.a b;

    @NotNull
    public final kotlinx.coroutines.a c;

    public R2() {
        dq7 dq7Var = ca8.a;
        this.a = j5h.a.g;
        this.b = mn7.d;
        this.c = ca8.a;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.Q2
    @NotNull
    public final kotlinx.coroutines.a a() {
        return this.b;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.Q2
    @NotNull
    public final y4h b() {
        return this.a;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.Q2
    @NotNull
    public final kotlinx.coroutines.a c() {
        return this.c;
    }
}
