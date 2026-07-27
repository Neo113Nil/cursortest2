package d5;

import F4.b;
import c5.InterfaceC0541a;
import kotlin.jvm.internal.h;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4459a implements InterfaceC0541a {
    private final b _prefs;

    public C4459a(b _prefs) {
        h.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // c5.InterfaceC0541a
    public long getLastLocationTime() {
        Long l9 = this._prefs.getLong(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", -600000L);
        h.b(l9);
        return l9.longValue();
    }

    @Override // c5.InterfaceC0541a
    public void setLastLocationTime(long j9) {
        this._prefs.saveLong(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", Long.valueOf(j9));
    }
}
