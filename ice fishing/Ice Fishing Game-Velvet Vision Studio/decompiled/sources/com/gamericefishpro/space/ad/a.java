package com.gamericefishpro.space.ad;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.zc.a {
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private b deviceLanguageProvider;

    public a(com.gamericefishpro.space.hh.b _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = _propertiesModelStore;
        this.deviceLanguageProvider = new b();
    }

    @Override // com.gamericefishpro.space.zc.a
    public String getLanguage() {
        String language = ((com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // com.gamericefishpro.space.zc.a
    public void setLanguage(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel()).setLanguage(value);
    }
}
