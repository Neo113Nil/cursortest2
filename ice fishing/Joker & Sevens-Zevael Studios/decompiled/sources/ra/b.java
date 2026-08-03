package ra;

import android.app.Activity;
import ca.h;
import ca.j;
import ca.k;
import ca.m;
import fc.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, d dVar);

    Object canReceiveNotification(JSONObject jSONObject, d dVar);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, d dVar);

    Object notificationReceived(na.d dVar, d dVar2);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(a aVar);
}
