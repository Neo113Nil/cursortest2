package G4;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements F4.a {
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private b deviceLanguageProvider;

    public a(com.onesignal.user.internal.properties.b _propertiesModelStore) {
        h.e(_propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = _propertiesModelStore;
        this.deviceLanguageProvider = new b();
    }

    @Override // F4.a
    public String getLanguage() {
        String language = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // F4.a
    public void setLanguage(String value) {
        h.e(value, "value");
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setLanguage(value);
    }
}
