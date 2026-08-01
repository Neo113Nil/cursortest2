package com.google.android.datatransport;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperProvider extends WinterFlowQuerySyntax {
    public final /* synthetic */ int WinterFlowServiceUtility;

    public /* synthetic */ WinterFlowMapperProvider(int i) {
        this.WinterFlowServiceUtility = i;
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final Object WinterFlowEventEmitterController(Intent intent, int i) {
        r1 = false;
        boolean z = false;
        switch (this.WinterFlowServiceUtility) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i2 = 0; i2 < itemCount; i2++) {
                                Uri uri = clipData.getItemAt(i2).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        return new ArrayList(linkedHashSet);
                    }
                }
                return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
            default:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (intArrayExtra[i3] == 0) {
                                z = true;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final WinterFlowNodeEngine WinterFlowOrchestrationSubsystem(Context context, String str) {
        switch (this.WinterFlowServiceUtility) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return null;
            default:
                if (WinterFlowHandlerWebsocket.WinterFlowServerProtocol(context, str) == 0) {
                    return new WinterFlowNodeEngine(Boolean.TRUE);
                }
                return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final Intent WinterFlowSyntax(Context context, String str) {
        switch (this.WinterFlowServiceUtility) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                putExtra.getClass();
                return putExtra;
            default:
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra2.getClass();
                return putExtra2;
        }
    }
}
