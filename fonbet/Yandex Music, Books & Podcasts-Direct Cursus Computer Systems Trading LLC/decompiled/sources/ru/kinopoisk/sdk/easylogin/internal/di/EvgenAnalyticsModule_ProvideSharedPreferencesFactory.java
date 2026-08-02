package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;

/* loaded from: classes5.dex */
public final class EvgenAnalyticsModule_ProvideSharedPreferencesFactory implements rzm {
    private final szm contextProvider;

    public EvgenAnalyticsModule_ProvideSharedPreferencesFactory(szm szmVar) {
        this.contextProvider = szmVar;
    }

    public static EvgenAnalyticsModule_ProvideSharedPreferencesFactory create(szm szmVar) {
        return new EvgenAnalyticsModule_ProvideSharedPreferencesFactory(szmVar);
    }

    public static SharedPreferences provideSharedPreferences(Context context) {
        SharedPreferences provideSharedPreferences = EvgenAnalyticsModule.INSTANCE.provideSharedPreferences(context);
        a4g.t(provideSharedPreferences);
        return provideSharedPreferences;
    }

    @Override // defpackage.szm
    public SharedPreferences get() {
        return provideSharedPreferences((Context) this.contextProvider.get());
    }
}
