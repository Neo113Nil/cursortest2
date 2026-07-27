package h5;

import J4.b;
import g5.InterfaceC4530a;
import kotlin.jvm.internal.h;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4573a implements InterfaceC4530a {
    private final b _prefs;

    public C4573a(b _prefs) {
        h.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // g5.InterfaceC4530a
    public long getLastLocationTime() {
        Long l9 = this._prefs.getLong(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", -600000L);
        h.b(l9);
        return l9.longValue();
    }

    @Override // g5.InterfaceC4530a
    public void setLastLocationTime(long j6) {
        this._prefs.saveLong(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", Long.valueOf(j6));
    }
}
