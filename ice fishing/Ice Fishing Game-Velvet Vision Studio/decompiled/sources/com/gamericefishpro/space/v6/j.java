package com.gamericefishpro.space.v6;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    static {
        com.gamericefishpro.space.l6.q.d("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            com.gamericefishpro.space.l6.q.c().getClass();
        } catch (Exception unused) {
            com.gamericefishpro.space.l6.q.c().getClass();
        }
    }
}
