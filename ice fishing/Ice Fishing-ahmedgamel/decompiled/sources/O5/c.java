package O5;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c extends i {

    public static final class a extends kotlin.jvm.internal.i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final Long invoke() {
            return 0L;
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements I7.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // I7.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: O5.c$c, reason: collision with other inner class name */
    public static final class C0001c extends kotlin.jvm.internal.i implements I7.a {
        public static final C0001c INSTANCE = new C0001c();

        public C0001c() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class d extends kotlin.jvm.internal.i implements I7.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // I7.a
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
        return getBooleanProperty("isValid", C0001c.INSTANCE);
    }

    public final void setActiveDuration(long j6) {
        i.setLongProperty$default(this, "activeDuration", j6, null, false, 12, null);
    }

    public final void setFocusTime(long j6) {
        i.setLongProperty$default(this, "focusTime", j6, null, false, 12, null);
    }

    public final void setSessionId(String value) {
        h.e(value, "value");
        i.setStringProperty$default(this, "sessionId", value, null, false, 12, null);
    }

    public final void setStartTime(long j6) {
        i.setLongProperty$default(this, "startTime", j6, null, false, 12, null);
    }

    public final void setValid(boolean z3) {
        i.setBooleanProperty$default(this, "isValid", z3, null, false, 12, null);
    }
}
