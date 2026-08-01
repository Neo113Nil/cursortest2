package com.google.android.datatransport;

import android.net.Uri;
import com.adjust.sdk.Constants;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryEntity {
    public final boolean WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final Uri WinterFlowRouterStructure;
    public final int WinterFlowTransactionManagerStrategy;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowLibraryEntity(String str, String str2) {
        this.WinterFlowRouterStructure = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.WinterFlowHookDataSource = 0;
        this.WinterFlowCacheManagerAgent = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.WinterFlowArrayNetwork = false;
        this.WinterFlowVariableVersionControl = str2;
        this.WinterFlowTransactionManagerStrategy = 0;
    }

    public WinterFlowLibraryEntity(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.WinterFlowRouterStructure = uri;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
        this.WinterFlowArrayNetwork = z;
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = i3;
    }
}
