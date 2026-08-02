package com.plaid.internal;

import dagger.internal.Factory;
import papa.AppUpdateData;

/* renamed from: com.plaid.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0328x5 implements Factory {
    public final C0266q5 a;

    public C0328x5(C0266q5 c0266q5) {
        this.a = c0266q5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.a.getClass();
        return AppUpdateData.Json$default(C0274r5.a);
    }
}
