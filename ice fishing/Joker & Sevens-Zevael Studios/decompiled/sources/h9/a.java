package h9;

import g9.b;
import g9.c;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements g9.a {
    public a() {
        setLogLevel(c.WARN);
        setAlertLevel(c.NONE);
    }

    @Override // g9.a
    public void addLogListener(b bVar) {
        j.e(bVar, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.addListener(bVar);
    }

    @Override // g9.a
    public c getAlertLevel() {
        return com.onesignal.debug.internal.logging.b.getVisualLogLevel();
    }

    @Override // g9.a
    public c getLogLevel() {
        return com.onesignal.debug.internal.logging.b.getLogLevel();
    }

    @Override // g9.a
    public void removeLogListener(b bVar) {
        j.e(bVar, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.removeListener(bVar);
    }

    @Override // g9.a
    public void setAlertLevel(c cVar) {
        j.e(cVar, "value");
        com.onesignal.debug.internal.logging.b.setVisualLogLevel(cVar);
    }

    @Override // g9.a
    public void setLogLevel(c cVar) {
        j.e(cVar, "value");
        com.onesignal.debug.internal.logging.b.setLogLevel(cVar);
    }
}
