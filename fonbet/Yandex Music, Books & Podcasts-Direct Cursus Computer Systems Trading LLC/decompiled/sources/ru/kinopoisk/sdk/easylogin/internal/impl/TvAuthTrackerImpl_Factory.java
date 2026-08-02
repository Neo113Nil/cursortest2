package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1166o9;

/* loaded from: classes5.dex */
public final class TvAuthTrackerImpl_Factory implements rzm {
    private final szm argsProvider;
    private final szm evgenAnalyticsProvider;

    public TvAuthTrackerImpl_Factory(szm szmVar, szm szmVar2) {
        this.evgenAnalyticsProvider = szmVar;
        this.argsProvider = szmVar2;
    }

    public static TvAuthTrackerImpl_Factory create(szm szmVar, szm szmVar2) {
        return new TvAuthTrackerImpl_Factory(szmVar, szmVar2);
    }

    public static TvAuthTrackerImpl newInstance(EvgenEasyLoginAnalytics evgenEasyLoginAnalytics, C1166o9 c1166o9) {
        return new TvAuthTrackerImpl(evgenEasyLoginAnalytics, c1166o9);
    }

    @Override // defpackage.szm
    public TvAuthTrackerImpl get() {
        return newInstance((EvgenEasyLoginAnalytics) this.evgenAnalyticsProvider.get(), (C1166o9) this.argsProvider.get());
    }
}
