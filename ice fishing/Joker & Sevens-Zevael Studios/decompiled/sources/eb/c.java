package eb;

import com.onesignal.common.modeling.i;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends i {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // oc.a
        public final Long invoke() {
            return 0L;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // oc.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: eb.c$c, reason: collision with other inner class name */
    public static final class C0072c extends k implements oc.a {
        public static final C0072c INSTANCE = new C0072c();

        public C0072c() {
            super(0);
        }

        @Override // oc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends k implements oc.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // oc.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final long getActiveDuration() {
        return getLongProperty("activeDuration", a.INSTANCE);
    }

    public final long getFocusTime() {
        return getLongProperty("focusTime", b.INSTANCE);
    }

    public final String getSessionId() {
        return i.getStringProperty$default(this, "sessionId", null, 2, null);
    }

    public final long getStartTime() {
        return getLongProperty("startTime", d.INSTANCE);
    }

    public final boolean isValid() {
        return getBooleanProperty("isValid", C0072c.INSTANCE);
    }

    public final void setActiveDuration(long j3) {
        i.setLongProperty$default(this, "activeDuration", j3, null, false, 12, null);
    }

    public final void setFocusTime(long j3) {
        i.setLongProperty$default(this, "focusTime", j3, null, false, 12, null);
    }

    public final void setSessionId(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "sessionId", str, null, false, 12, null);
    }

    public final void setStartTime(long j3) {
        i.setLongProperty$default(this, "startTime", j3, null, false, 12, null);
    }

    public final void setValid(boolean z10) {
        i.setBooleanProperty$default(this, "isValid", z10, null, false, 12, null);
    }
}
