package com.onesignal.core.internal.config;

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
        public final String invoke() {
            return null;
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
            return null;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.config.c$c, reason: collision with other inner class name */
    public static final class C0013c extends k implements oc.a {
        public static final C0013c INSTANCE = new C0013c();

        public C0013c() {
            super(0);
        }

        @Override // oc.a
        public final String invoke() {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        super(iVar, str);
        j.e(iVar, "parentModel");
        j.e(str, "parentProperty");
    }

    public final String getApiKey() {
        return getOptStringProperty("apiKey", a.INSTANCE);
    }

    public final String getAppId() {
        return getOptStringProperty("appId", b.INSTANCE);
    }

    public final String getProjectId() {
        return getOptStringProperty("projectId", C0013c.INSTANCE);
    }

    public final void setApiKey(String str) {
        i.setOptStringProperty$default(this, "apiKey", str, null, false, 12, null);
    }

    public final void setAppId(String str) {
        i.setOptStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final void setProjectId(String str) {
        i.setOptStringProperty$default(this, "projectId", str, null, false, 12, null);
    }
}
