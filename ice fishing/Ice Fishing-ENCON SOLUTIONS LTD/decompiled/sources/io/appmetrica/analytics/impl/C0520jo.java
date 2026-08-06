package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520jo implements InterfaceC0544km {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f6331a;

    public C0520jo(UtilityServiceProvider utilityServiceProvider) {
        this.f6331a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0544km
    public final void a(C0415fm c0415fm) {
        this.f6331a.updateConfiguration(new UtilityServiceConfiguration(c0415fm.f6022v, c0415fm.f6021u));
    }
}
