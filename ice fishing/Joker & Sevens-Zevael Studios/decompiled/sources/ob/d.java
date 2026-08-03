package ob;

import com.onesignal.common.modeling.i;
import com.onesignal.inAppMessages.internal.display.impl.n;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends i {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // oc.a
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // oc.a
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // oc.a
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: ob.d$d, reason: collision with other inner class name */
    public static final class C0077d extends k implements oc.a {
        public static final C0077d INSTANCE = new C0077d();

        public C0077d() {
            super(0);
        }

        @Override // oc.a
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
        return getStringProperty("sdk", C0077d.INSTANCE);
    }

    public final f getStatus() {
        if (!hasProperty("status")) {
            f fVar = f.SUBSCRIBED;
            setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
        }
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? f.valueOf((String) optAnyProperty$default) : (f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (f) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final g getType() {
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, n.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? g.valueOf((String) optAnyProperty$default) : (g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (g) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final void setAddress(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    public final void setAppVersion(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "appVersion", str, null, false, 12, null);
    }

    public final void setCarrier(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "carrier", str, null, false, 12, null);
    }

    public final void setDeviceOS(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "deviceOS", str, null, false, 12, null);
    }

    public final void setOptedIn(boolean z10) {
        i.setBooleanProperty$default(this, "optedIn", z10, null, false, 12, null);
    }

    public final void setSdk(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "sdk", str, null, false, 12, null);
    }

    public final void setStatus(f fVar) {
        j.e(fVar, "value");
        setOptAnyProperty("status", fVar.toString(), "NORMAL", false);
    }

    public final void setType(g gVar) {
        j.e(gVar, "value");
        setOptAnyProperty(n.EVENT_TYPE_KEY, gVar.toString(), "NORMAL", false);
    }
}
