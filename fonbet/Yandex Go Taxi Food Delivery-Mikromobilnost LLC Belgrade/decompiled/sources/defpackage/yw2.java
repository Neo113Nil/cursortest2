package defpackage;

import com.yandex.go.deeplinks.generated.app_settings.AppSettingsNotificationsCategory;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yw2 {
    public final AppSettingsNotificationsCategory a;

    public yw2(AppSettingsNotificationsCategory appSettingsNotificationsCategory) {
        this.a = appSettingsNotificationsCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw2) && this.a == ((yw2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppSettingsNotificationsDeeplink(category=" + this.a + Extension.C_BRAKE;
    }
}
