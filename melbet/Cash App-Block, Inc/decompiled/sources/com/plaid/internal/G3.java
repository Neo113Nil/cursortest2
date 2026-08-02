package com.plaid.internal;

import android.content.res.Resources;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class G3 implements Factory {
    public final C0255p3 a;

    public G3(C0255p3 c0255p3) {
        this.a = c0255p3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F3((Resources) this.a.get());
    }
}
