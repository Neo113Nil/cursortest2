package com.google.android.datatransport;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareInterface extends WinterFlowEncryptionSubsystem {
    public final /* synthetic */ int WinterFlowConfigurationSubsystem;

    @Override // com.google.android.datatransport.WinterFlowEncryptionSubsystem
    public com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowResponseEngine(Context context, Looper looper, WinterFlowSchedulerParser winterFlowSchedulerParser, Object obj, WinterFlowCacheTransactionManager winterFlowCacheTransactionManager, WinterFlowCacheTransactionManager winterFlowCacheTransactionManager2) {
        switch (this.WinterFlowConfigurationSubsystem) {
            case 2:
                return new WinterFlowObjectAlgorithm(context, looper, 449, winterFlowSchedulerParser, winterFlowCacheTransactionManager, winterFlowCacheTransactionManager2);
            case 3:
                return new WinterFlowFrameworkClass(context, looper, winterFlowSchedulerParser, (WinterFlowDecoratorDeserialization) obj, winterFlowCacheTransactionManager, winterFlowCacheTransactionManager2);
            case 4:
                return new WinterFlowDeserializationDebug(context, looper, 457, winterFlowSchedulerParser, winterFlowCacheTransactionManager, winterFlowCacheTransactionManager2);
            default:
                return super.WinterFlowResponseEngine(context, looper, winterFlowSchedulerParser, obj, winterFlowCacheTransactionManager, winterFlowCacheTransactionManager2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionSubsystem
    public com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowSyntax(Context context, Looper looper, WinterFlowSchedulerParser winterFlowSchedulerParser, Object obj, WinterFlowAlgorithmPlatform winterFlowAlgorithmPlatform, WinterFlowJSONHelper winterFlowJSONHelper) {
        switch (this.WinterFlowConfigurationSubsystem) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj2 = winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy;
                Integer num = (Integer) winterFlowSchedulerParser.WinterFlowHookDataSource;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new WinterFlowFrameworkLibrary(context, looper, winterFlowSchedulerParser, bundle, winterFlowAlgorithmPlatform, winterFlowJSONHelper);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.WinterFlowSyntax(context, looper, winterFlowSchedulerParser, obj, winterFlowAlgorithmPlatform, winterFlowJSONHelper);
        }
    }
}
