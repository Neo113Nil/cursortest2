package x4;

import android.app.Activity;
import android.content.Context;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public interface f {
    void addActivityLifecycleHandler(d dVar);

    void addApplicationLifecycleHandler(e eVar);

    Context getAppContext();

    Activity getCurrent();

    b getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(d dVar);

    void removeApplicationLifecycleHandler(e eVar);

    void setEntryState(b bVar);

    Object waitUntilActivityReady(InterfaceC5267d interfaceC5267d);

    Object waitUntilSystemConditionsAvailable(InterfaceC5267d interfaceC5267d);
}
