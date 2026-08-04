package com.gamericefishpro.space.c7;

import android.content.Context;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ei.s;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final /* synthetic */ com.gamericefishpro.space.ki.d[] a;
    public static final com.gamericefishpro.space.o4.b b;

    static {
        s sVar = new s(com.gamericefishpro.space.ei.c.d, n.class, "settingsDataStore", "getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        b0.a.getClass();
        a = new com.gamericefishpro.space.ki.d[]{sVar};
        b = com.gamericefishpro.space.hj.c.I("ice_fishing_settings", null, null, 14);
    }

    public static final com.gamericefishpro.space.l4.g a(Context context) {
        return b.a(context, a[0]);
    }
}
