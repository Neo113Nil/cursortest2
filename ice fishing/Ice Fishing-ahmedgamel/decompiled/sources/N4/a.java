package N4;

import M4.b;
import M4.c;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements M4.a {
    public a() {
        setLogLevel(c.WARN);
        setAlertLevel(c.NONE);
    }

    @Override // M4.a
    public void addLogListener(b listener) {
        h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.addListener(listener);
    }

    @Override // M4.a
    public c getAlertLevel() {
        return com.onesignal.debug.internal.logging.b.getVisualLogLevel();
    }

    @Override // M4.a
    public c getLogLevel() {
        return com.onesignal.debug.internal.logging.b.getLogLevel();
    }

    @Override // M4.a
    public void removeLogListener(b listener) {
        h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.removeListener(listener);
    }

    @Override // M4.a
    public void setAlertLevel(c value) {
        h.e(value, "value");
        com.onesignal.debug.internal.logging.b.setVisualLogLevel(value);
    }

    @Override // M4.a
    public void setLogLevel(c value) {
        h.e(value, "value");
        com.onesignal.debug.internal.logging.b.setLogLevel(value);
    }
}
