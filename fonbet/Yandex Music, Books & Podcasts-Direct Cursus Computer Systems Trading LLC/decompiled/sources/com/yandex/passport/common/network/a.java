package com.yandex.passport.common.network;

import defpackage.arf;
import defpackage.t9f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {
    @NotNull
    public final t9f serializer() {
        arf arfVar;
        arfVar = BackendError.$cachedSerializer$delegate;
        return (t9f) arfVar.getValue();
    }
}
