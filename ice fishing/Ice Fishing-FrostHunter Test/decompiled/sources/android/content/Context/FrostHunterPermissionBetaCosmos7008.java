package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterPermissionBetaCosmos7008 implements IRunActivityHandler {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ String FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterPermissionBetaCosmos7008(String str, String str2, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.addGlobalPartnerParameterI(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
                break;
        }
    }
}
