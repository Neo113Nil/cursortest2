package x5;

import android.app.Activity;
import i5.h;
import i5.j;
import i5.k;
import i5.m;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.d;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5240d interfaceC5240d);

    Object canReceiveNotification(JSONObject jSONObject, InterfaceC5240d interfaceC5240d);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC5240d interfaceC5240d);

    Object notificationReceived(d dVar, InterfaceC5240d interfaceC5240d);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(InterfaceC5193a interfaceC5193a);
}
