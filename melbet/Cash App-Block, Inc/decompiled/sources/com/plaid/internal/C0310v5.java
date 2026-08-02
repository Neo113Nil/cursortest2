package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;

/* renamed from: com.plaid.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0310v5 implements Factory {
    public final Factory a;

    public C0310v5(C0266q5 c0266q5, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        SharedPreferences sharedPreferences = application.getSharedPreferences("plaid_feature_overrides", 0);
        sharedPreferences.getClass();
        SharedPreferences sharedPreferences2 = application.getSharedPreferences("plaid_features_from_server", 0);
        sharedPreferences2.getClass();
        return new C0096a7(sharedPreferences, sharedPreferences2);
    }
}
