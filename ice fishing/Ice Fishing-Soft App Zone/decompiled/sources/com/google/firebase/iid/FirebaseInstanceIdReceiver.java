package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.datatransport.WinterFlowAlgorithmArray;
import com.google.android.datatransport.WinterFlowEncryptionSubsystem;
import com.google.android.datatransport.WinterFlowHookProcessor;
import com.google.android.datatransport.WinterFlowThreadTransactionManager;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void WinterFlowHookDataSource(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (WinterFlowEncryptionSubsystem.WinterFlowCacheTool(putExtras)) {
            WinterFlowEncryptionSubsystem.WinterFlowSyntaxSubsystem(putExtras.getExtras(), "_nd");
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int WinterFlowRouterStructure(Context context, WinterFlowThreadTransactionManager winterFlowThreadTransactionManager) {
        try {
            return ((Integer) WinterFlowHookProcessor.WinterFlowArrayNetwork(new WinterFlowAlgorithmArray(context, 0).WinterFlowBackendCacheManager(winterFlowThreadTransactionManager.WinterFlowVariableVersionControl))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }
}
