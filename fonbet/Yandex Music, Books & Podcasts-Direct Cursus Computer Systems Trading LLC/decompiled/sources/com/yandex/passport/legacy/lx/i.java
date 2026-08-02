package com.yandex.passport.legacy.lx;

import com.yandex.passport.internal.methods.z5;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class i extends z5 {
    public final /* synthetic */ Callable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Callable callable) {
        super((z5) null);
        this.d = callable;
    }

    @Override // com.yandex.passport.internal.methods.z5
    public final Object c() {
        return this.d.call();
    }
}
