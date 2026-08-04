package com.gamericefishpro.space.rc;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public static final a Companion = new a(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function0 {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.rc.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0046d extends l implements Function0 {
        public static final C0046d INSTANCE = new C0046d();

        public C0046d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends l implements Function0 {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends l implements Function0 {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends l implements Function0 {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends l implements Function0 {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        Intrinsics.checkNotNullParameter(parentModel, "parentModel");
        Intrinsics.checkNotNullParameter(parentProperty, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", C0046d.INSTANCE);
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

    public final void setDirectEnabled(boolean z) {
        i.setBooleanProperty$default(this, "isDirectEnabled", z, null, false, 12, null);
    }

    public final void setIamLimit(int i) {
        i.setIntProperty$default(this, "iamLimit", i, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z) {
        i.setBooleanProperty$default(this, "isIndirectEnabled", z, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i) {
        i.setIntProperty$default(this, "indirectIAMAttributionWindow", i, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i) {
        i.setIntProperty$default(this, "indirectNotificationAttributionWindow", i, null, false, 12, null);
    }

    public final void setNotificationLimit(int i) {
        i.setIntProperty$default(this, "notificationLimit", i, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z) {
        i.setBooleanProperty$default(this, "isUnattributedEnabled", z, null, false, 12, null);
    }
}
