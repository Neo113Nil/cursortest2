package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.bca;
import defpackage.bqi;
import defpackage.pjc;
import defpackage.xdr;
import defpackage.ydr;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.D2;

/* loaded from: classes5.dex */
public final class E2 implements D2 {

    @NotNull
    public final bqi a = ydr.a(null);

    @Override // ru.kinopoisk.sdk.easylogin.internal.D2
    @NotNull
    public final pjc a() {
        return new bca(this.a, 18);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D2
    public final D2.a get() {
        return (D2.a) ((xdr) this.a).getValue();
    }
}
