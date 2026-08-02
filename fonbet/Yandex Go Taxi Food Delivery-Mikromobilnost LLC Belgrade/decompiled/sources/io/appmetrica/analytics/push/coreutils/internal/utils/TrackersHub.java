package io.appmetrica.analytics.push.coreutils.internal.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public class TrackersHub implements Tracker {
    private static final TrackersHub b = new TrackersHub();
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static TrackersHub getInstance() {
        return b;
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public void pauseSession() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Tracker) it.next()).pauseSession();
        }
    }

    public void registerTracker(Tracker tracker) {
        this.a.add(tracker);
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public void reportError(String str, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Tracker) it.next()).reportError(str, th);
        }
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public void reportEvent(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Tracker) it.next()).reportEvent(str);
        }
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public void reportUnhandledException(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Tracker) it.next()).reportUnhandledException(th);
        }
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public void resumeSession() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Tracker) it.next()).resumeSession();
        }
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public void reportEvent(String str, Map<String, Object> map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Tracker) it.next()).reportEvent(str, map);
        }
    }
}
