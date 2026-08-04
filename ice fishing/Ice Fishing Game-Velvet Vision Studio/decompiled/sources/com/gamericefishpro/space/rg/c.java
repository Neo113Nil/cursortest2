package com.gamericefishpro.space.rg;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.rg.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0050c extends l implements Function0 {
        public static final C0050c INSTANCE = new C0050c();

        public C0050c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends l implements Function0 {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
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
        return getBooleanProperty("isValid", C0050c.INSTANCE);
    }

    public final void setActiveDuration(long j) {
        i.setLongProperty$default(this, "activeDuration", j, null, false, 12, null);
    }

    public final void setFocusTime(long j) {
        i.setLongProperty$default(this, "focusTime", j, null, false, 12, null);
    }

    public final void setSessionId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "sessionId", value, null, false, 12, null);
    }

    public final void setStartTime(long j) {
        i.setLongProperty$default(this, "startTime", j, null, false, 12, null);
    }

    public final void setValid(boolean z) {
        i.setBooleanProperty$default(this, "isValid", z, null, false, 12, null);
    }
}
