package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public abstract class b {
    public static final a resolveAppId(String str, com.onesignal.core.internal.config.b configModel, F4.b preferencesService) {
        kotlin.jvm.internal.h.e(configModel, "configModel");
        kotlin.jvm.internal.h.e(preferencesService, "preferencesService");
        boolean z8 = true;
        if (str != null) {
            if (configModel.hasProperty(com.anythink.expressad.videocommon.e.b.f22565u) && kotlin.jvm.internal.h.a(configModel.getAppId(), str)) {
                z8 = false;
            }
            return new a(str, z8, false);
        }
        if (configModel.hasProperty(com.anythink.expressad.videocommon.e.b.f22565u)) {
            return new a(configModel.getAppId(), false, false);
        }
        String string$default = F4.a.getString$default(preferencesService, com.onesignal.common.threading.b.BASE_THREAD_NAME, "GT_APP_ID", null, 4, null);
        return string$default != null ? new a(string$default, true, false) : new a(null, false, true);
    }
}
