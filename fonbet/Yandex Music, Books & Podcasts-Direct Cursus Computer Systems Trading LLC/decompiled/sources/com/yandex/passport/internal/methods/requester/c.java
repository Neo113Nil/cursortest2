package com.yandex.passport.internal.methods.requester;

import androidx.core.app.n0;
import com.yandex.passport.internal.methods.e3;
import com.yandex.passport.internal.methods.i4;
import com.yandex.passport.internal.push.h0;

/* loaded from: classes4.dex */
public final class c extends n0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i) {
        super(fVar);
        this.b = i;
    }

    @Override // androidx.core.app.n0
    public final Object t(Object obj) {
        switch (this.b) {
            case 0:
                return new i4((h0) obj);
            default:
                return new e3((String) obj);
        }
    }
}
