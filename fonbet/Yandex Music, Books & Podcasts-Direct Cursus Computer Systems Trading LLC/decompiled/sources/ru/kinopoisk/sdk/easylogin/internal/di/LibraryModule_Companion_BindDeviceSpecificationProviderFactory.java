package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.F2;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_BindDeviceSpecificationProviderFactory implements rzm {
    private final szm contextProvider;

    public LibraryModule_Companion_BindDeviceSpecificationProviderFactory(szm szmVar) {
        this.contextProvider = szmVar;
    }

    public static F2 bindDeviceSpecificationProvider(Context context) {
        F2 bindDeviceSpecificationProvider = LibraryModule.INSTANCE.bindDeviceSpecificationProvider(context);
        a4g.t(bindDeviceSpecificationProvider);
        return bindDeviceSpecificationProvider;
    }

    public static LibraryModule_Companion_BindDeviceSpecificationProviderFactory create(szm szmVar) {
        return new LibraryModule_Companion_BindDeviceSpecificationProviderFactory(szmVar);
    }

    @Override // defpackage.szm
    public F2 get() {
        return bindDeviceSpecificationProvider((Context) this.contextProvider.get());
    }
}
