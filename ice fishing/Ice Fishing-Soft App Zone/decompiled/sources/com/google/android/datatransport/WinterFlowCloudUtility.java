package com.google.android.datatransport;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudUtility implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object WinterFlowCacheManagerAgent;
    public final /* synthetic */ Intent WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowCloudUtility(Intent intent, Object obj, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = intent;
        this.WinterFlowCacheManagerAgent = obj;
    }

    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowCacheManagerAgent;
        Intent intent = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                if (intent != null) {
                    ((WinterFlowMiddlewareVersion) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                WinterFlowRouterStructure();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
