package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.datatransport.WinterFlowCacheManagerVersionControl;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class zabs extends BroadcastReceiver {
    public final WinterFlowCacheManagerVersionControl WinterFlowHookDataSource;
    public Context WinterFlowRouterStructure;

    public zabs(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        this.WinterFlowHookDataSource = winterFlowCacheManagerVersionControl;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            throw null;
        }
    }
}
