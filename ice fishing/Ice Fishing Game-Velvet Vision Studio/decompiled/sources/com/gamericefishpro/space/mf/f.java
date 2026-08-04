package com.gamericefishpro.space.mf;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public final boolean getShouldOpenActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !"DISABLE".equals(AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean getSuppressLaunchURL(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.suppressLaunchURLs");
    }
}
