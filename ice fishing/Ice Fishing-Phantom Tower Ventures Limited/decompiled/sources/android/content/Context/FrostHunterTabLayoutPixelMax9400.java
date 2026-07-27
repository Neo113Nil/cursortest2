package android.content.Context;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.PackageFactory;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTabLayoutPixelMax9400 implements Runnable {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterTabLayoutPixelMax9400(Context context, FrostHunterDigitalInkRecognitionAuroraUltra6822 frostHunterDigitalInkRecognitionAuroraUltra6822, CountDownLatch countDownLatch) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
        this.FrostHunterFlowMaxDragonHero5809 = context;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterDigitalInkRecognitionAuroraUltra6822;
        this.FrostHunterKeyframeGammaGamma1197 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i;
        FrostHunterGradientDrawablePrimeSpectraUltra1716 FrostHunterServiceConnectionTurboPhoenixOmega6719;
        Object obj = null;
        boolean z = false;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.FrostHunterKeyframeGammaGamma1197).sendInstallReferrerI((ReferrerDetails) this.FrostHunterFlowMaxDragonHero5809, (String) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 1:
                ((Handler) this.FrostHunterAlertDialogAuroraDelta3200).post(new FrostHunterActivityRogueFusionRogue5543(11, this, ((AsyncTaskExecutor) this.FrostHunterKeyframeGammaGamma1197).doInBackground((Object[]) this.FrostHunterFlowMaxDragonHero5809)));
                return;
            case 2:
                try {
                    obj = ((FrostHunterExoPlayerAuroraThunderPrime8091) this.FrostHunterFlowMaxDragonHero5809).call();
                } catch (Exception unused) {
                }
                ((Handler) this.FrostHunterKeyframeGammaGamma1197).post(new FrostHunterActivityRogueFusionRogue5543(21, (FrostHunterTransitionManagerNeoTitanTitan4580) this.FrostHunterAlertDialogAuroraDelta3200, obj, z));
                return;
            case 3:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.FrostHunterKeyframeGammaGamma1197;
                weakReference = sdkClickHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.FrostHunterAlertDialogAuroraDelta3200, (String) this.FrostHunterFlowMaxDragonHero5809, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                return;
            default:
                FrostHunterDigitalInkRecognitionAuroraUltra6822 frostHunterDigitalInkRecognitionAuroraUltra6822 = (FrostHunterDigitalInkRecognitionAuroraUltra6822) this.FrostHunterAlertDialogAuroraDelta3200;
                Intent intent = frostHunterDigitalInkRecognitionAuroraUltra6822.FrostHunterCameraXPixelTurboCosmos9814;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterChipNovaPhantomElite7665.FrostHunterLevelListDrawableFusionDragonHero2232(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = frostHunterDigitalInkRecognitionAuroraUltra6822.FrostHunterCameraXPixelTurboCosmos9814;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = frostHunterDigitalInkRecognitionAuroraUltra6822.FrostHunterCameraXPixelTurboCosmos9814;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.FrostHunterFlowMaxDragonHero5809;
                    bundle.putBoolean("supports_message_handled", true);
                    FrostHunterCardViewFusionHeroSpectra3749 FrostHunterFragmentBetaMegaVortex6025 = FrostHunterCardViewFusionHeroSpectra3749.FrostHunterFragmentBetaMegaVortex6025(context);
                    synchronized (FrostHunterFragmentBetaMegaVortex6025) {
                        i = FrostHunterFragmentBetaMegaVortex6025.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterFragmentBetaMegaVortex6025.FrostHunterAlphaAnimationNeoCosmos5761 = i + 1;
                    }
                    FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceConnectionTurboPhoenixOmega6719(new FrostHunterShapeAppearanceNebulaAurora4980(i, 2, bundle, 0));
                }
                FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTextInputEditTextBetaTitanDelta2402.FrostHunterFlowMaxDragonHero5809, new FrostHunterActionBarStrikeInferno9162((CountDownLatch) this.FrostHunterKeyframeGammaGamma1197));
                return;
        }
    }

    public /* synthetic */ FrostHunterTabLayoutPixelMax9400(Object obj, Object obj2, Object obj3, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterKeyframeGammaGamma1197 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = obj2;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj3;
    }

    public FrostHunterTabLayoutPixelMax9400(SdkClickHandler sdkClickHandler, String str, String str2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
        this.FrostHunterKeyframeGammaGamma1197 = sdkClickHandler;
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
        this.FrostHunterFlowMaxDragonHero5809 = str2;
    }
}
