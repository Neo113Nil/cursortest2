package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.Z;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import com.plaid.link.Plaid;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0283s5 implements Factory {
    public final Factory a;
    public final Provider b;
    public final Provider c;

    public C0283s5(C0266q5 c0266q5, Factory factory, Provider provider, Provider provider2) {
        this.a = factory;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        E5 e5 = (E5) this.b.get();
        C0230m5 c0230m5 = (C0230m5) this.c.get();
        application.getClass();
        e5.getClass();
        c0230m5.getClass();
        return new C0114c5(application, SentryProject.LinkSdk.INSTANCE, Plaid.getVERSION_NAME(), Z.a.a, e5, c0230m5, new M2(application));
    }
}
