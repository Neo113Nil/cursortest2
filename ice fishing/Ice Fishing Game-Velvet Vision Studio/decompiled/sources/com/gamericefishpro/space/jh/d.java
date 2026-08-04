package com.gamericefishpro.space.jh;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.i;
import com.gamericefishpro.space.vd.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function0 {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.jh.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0030d extends l implements Function0 {
        public static final C0030d INSTANCE = new C0030d();

        public C0030d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    public d() {
        super(null, null, 3, null);
    }

    public final String getAddress() {
        return i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppVersion() {
        return getStringProperty("appVersion", a.INSTANCE);
    }

    public final String getCarrier() {
        return getStringProperty("carrier", b.INSTANCE);
    }

    public final String getDeviceOS() {
        return getStringProperty("deviceOS", c.INSTANCE);
    }

    public final boolean getOptedIn() {
        return i.getBooleanProperty$default(this, "optedIn", null, 2, null);
    }

    public final String getSdk() {
        return getStringProperty("sdk", C0030d.INSTANCE);
    }

    public final f getStatus() {
        Enum enumValueOf = null;
        if (!hasProperty("status")) {
            f fVar = f.SUBSCRIBED;
            setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
        }
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "status", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof f) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? f.valueOf((String) optAnyProperty$default) : (f) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (f) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final g getType() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, m.EVENT_TYPE_KEY, null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof g) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? g.valueOf((String) optAnyProperty$default) : (g) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (g) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final void setAddress(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "address", value, null, false, 12, null);
    }

    public final void setAppVersion(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "appVersion", value, null, false, 12, null);
    }

    public final void setCarrier(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "carrier", value, null, false, 12, null);
    }

    public final void setDeviceOS(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "deviceOS", value, null, false, 12, null);
    }

    public final void setOptedIn(boolean z) {
        i.setBooleanProperty$default(this, "optedIn", z, null, false, 12, null);
    }

    public final void setSdk(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "sdk", value, null, false, 12, null);
    }

    public final void setStatus(f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setOptAnyProperty("status", value.toString(), "NORMAL", false);
    }

    public final void setType(g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setOptAnyProperty(m.EVENT_TYPE_KEY, value.toString(), "NORMAL", false);
    }
}
