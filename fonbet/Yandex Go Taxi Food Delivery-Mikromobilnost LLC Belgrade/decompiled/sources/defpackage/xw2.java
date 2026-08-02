package defpackage;

import com.yandex.go.deeplinks.generated.app_settings.AppSettingsNotificationsCategory;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class xw2 {
    public static AppSettingsNotificationsCategory a(String str) {
        Object obj;
        Iterator<E> it = AppSettingsNotificationsCategory.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((AppSettingsNotificationsCategory) obj).getValue(), str, true)) {
                break;
            }
        }
        return (AppSettingsNotificationsCategory) obj;
    }
}
