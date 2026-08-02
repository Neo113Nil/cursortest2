package com.plaid.internal;

import android.app.Application;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Providers;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0252p0 implements X4 {
    public final Application a;
    public final C0252p0 b = this;
    public final Factory c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;
    public final Provider k;
    public final Provider l;
    public final Provider m;
    public final Provider n;
    public final Provider o;
    public final Provider p;

    public C0252p0(C0266q5 c0266q5, Application application) {
        this.a = application;
        DoubleCheck.provider(Providers.asDaggerProvider(new C0319w5(c0266q5)));
        InstanceFactory create = InstanceFactory.create(application);
        this.c = create;
        dagger.internal.Provider provider = DoubleCheck.provider(Providers.asDaggerProvider(new C5(c0266q5, create)));
        this.d = provider;
        dagger.internal.Provider provider2 = DoubleCheck.provider(Providers.asDaggerProvider(new C0328x5(c0266q5)));
        this.e = provider2;
        this.f = DoubleCheck.provider(Providers.asDaggerProvider(new C0342z1(provider, provider2)));
        dagger.internal.Provider provider3 = DoubleCheck.provider(Providers.asDaggerProvider(new C0310v5(c0266q5, create)));
        this.g = provider3;
        this.h = DoubleCheck.provider(Providers.asDaggerProvider(new C0346z5(c0266q5, provider)));
        this.i = DoubleCheck.provider(Providers.asDaggerProvider(new C0292t5(c0266q5, create)));
        this.j = DoubleCheck.provider(Providers.asDaggerProvider(new C0337y5(c0266q5)));
        dagger.internal.Provider provider4 = DoubleCheck.provider(Providers.asDaggerProvider(new D5(c0266q5, create)));
        this.k = provider4;
        dagger.internal.Provider provider5 = DoubleCheck.provider(Providers.asDaggerProvider(new B5(c0266q5, provider4)));
        this.l = provider5;
        dagger.internal.Provider provider6 = DoubleCheck.provider(Providers.asDaggerProvider(new A5(c0266q5, create)));
        this.m = provider6;
        this.n = DoubleCheck.provider(Providers.asDaggerProvider(new C0283s5(c0266q5, create, provider5, provider6)));
        this.o = DoubleCheck.provider(Providers.asDaggerProvider(new O5(create)));
        this.p = DoubleCheck.provider(Providers.asDaggerProvider(new C0301u5(c0266q5, provider3)));
    }
}
