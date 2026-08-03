package y8;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements x8.a {
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private b deviceLanguageProvider;

    public a(com.onesignal.user.internal.properties.b bVar) {
        j.e(bVar, "_propertiesModelStore");
        this._propertiesModelStore = bVar;
        this.deviceLanguageProvider = new b();
    }

    @Override // x8.a
    public String getLanguage() {
        String language = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // x8.a
    public void setLanguage(String str) {
        j.e(str, "value");
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setLanguage(str);
    }
}
