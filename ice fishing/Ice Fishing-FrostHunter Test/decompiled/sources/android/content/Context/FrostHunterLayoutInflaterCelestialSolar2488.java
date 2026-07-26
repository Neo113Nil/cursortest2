package android.content.Context;

import android.animation.ValueAnimator;
import android.view.View;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutInflaterCelestialSolar2488 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 1;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterLayoutInflaterCelestialSolar2488(InstallReferrer installReferrer, Object obj, Method method, Object[] objArr) {
        this.FrostHunterFragmentBetaMegaVortex6025 = installReferrer;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = method;
        this.FrostHunterKeyframeGammaGamma1197 = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InstallReferrerReadListener installReferrerReadListener;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFragmentBetaMegaVortex6025;
        Object obj2 = this.FrostHunterKeyframeGammaGamma1197;
        Object obj3 = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj4 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                InstallReferrer installReferrer = (InstallReferrer) obj;
                try {
                    installReferrer.invokeI(obj4, (Method) obj3, (Object[]) obj2);
                    break;
                } catch (Throwable th) {
                    installReferrerReadListener = installReferrer.referrerCallback;
                    installReferrerReadListener.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
                    return;
                }
            default:
                FrostHunterSharedElementHyperVisionEpic7121.FrostHunterFlowMaxDragonHero5809((View) obj4, (FrostHunterTransitionCelestialOmega6993) obj3, (FrostHunterProximitySensorEpicSolar3138) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public FrostHunterLayoutInflaterCelestialSolar2488(View view, FrostHunterTransitionCelestialOmega6993 frostHunterTransitionCelestialOmega6993, FrostHunterProximitySensorEpicSolar3138 frostHunterProximitySensorEpicSolar3138, ValueAnimator valueAnimator) {
        this.FrostHunterFlowMaxDragonHero5809 = view;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterTransitionCelestialOmega6993;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterProximitySensorEpicSolar3138;
        this.FrostHunterFragmentBetaMegaVortex6025 = valueAnimator;
    }
}
