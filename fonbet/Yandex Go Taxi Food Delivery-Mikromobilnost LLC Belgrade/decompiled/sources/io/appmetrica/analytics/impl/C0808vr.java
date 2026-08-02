package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.UserManager;
import defpackage.ny61;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.vr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0808vr {
    public static boolean a(Context context) {
        Boolean bool = (Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new ny61(21));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final Boolean a(UserManager userManager) {
        return Boolean.valueOf(userManager.isUserUnlocked());
    }
}
