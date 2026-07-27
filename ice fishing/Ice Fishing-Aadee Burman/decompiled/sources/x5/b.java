package x5;

import android.app.Activity;
import i5.h;
import i5.j;
import i5.k;
import i5.m;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.d;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5267d interfaceC5267d);

    Object canReceiveNotification(JSONObject jSONObject, InterfaceC5267d interfaceC5267d);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC5267d interfaceC5267d);

    Object notificationReceived(d dVar, InterfaceC5267d interfaceC5267d);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(InterfaceC5198a interfaceC5198a);
}
