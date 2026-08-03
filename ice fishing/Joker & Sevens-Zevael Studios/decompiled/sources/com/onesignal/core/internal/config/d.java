package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends i {
    public static final a Companion = new a(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // oc.a
        public final Integer invoke() {
            return 10;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // oc.a
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.config.d$d, reason: collision with other inner class name */
    public static final class C0014d extends k implements oc.a {
        public static final C0014d INSTANCE = new C0014d();

        public C0014d() {
            super(0);
        }

        @Override // oc.a
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends k implements oc.a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // oc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends k implements oc.a {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // oc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends k implements oc.a {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // oc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends k implements oc.a {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // oc.a
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str) {
        super(iVar, str);
        j.e(iVar, "parentModel");
        j.e(str, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", C0014d.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", h.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z10) {
        i.setBooleanProperty$default(this, "isDirectEnabled", z10, null, false, 12, null);
    }

    public final void setIamLimit(int i10) {
        i.setIntProperty$default(this, "iamLimit", i10, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z10) {
        i.setBooleanProperty$default(this, "isIndirectEnabled", z10, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i10) {
        i.setIntProperty$default(this, "indirectIAMAttributionWindow", i10, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i10) {
        i.setIntProperty$default(this, "indirectNotificationAttributionWindow", i10, null, false, 12, null);
    }

    public final void setNotificationLimit(int i10) {
        i.setIntProperty$default(this, "notificationLimit", i10, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z10) {
        i.setBooleanProperty$default(this, "isUnattributedEnabled", z10, null, false, 12, null);
    }
}
