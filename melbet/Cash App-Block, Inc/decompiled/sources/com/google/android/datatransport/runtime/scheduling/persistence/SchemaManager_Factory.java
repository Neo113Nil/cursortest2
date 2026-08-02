package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class SchemaManager_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;

    public /* synthetic */ SchemaManager_Factory(Provider provider, int i) {
        this.$r8$classId = i;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.contextProvider;
        switch (i) {
            case 0:
                return new SchemaManager((Context) provider.get(), Integer.valueOf(SchemaManager.SCHEMA_VERSION).intValue(), "com.google.android.datatransport.events");
            default:
                String packageName = ((Context) provider.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                a$$ExternalSyntheticBUOutline0.m$2("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
