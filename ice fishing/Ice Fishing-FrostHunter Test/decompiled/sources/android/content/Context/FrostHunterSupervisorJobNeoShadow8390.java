package android.content.Context;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSupervisorJobNeoShadow8390 extends FrostHunterAdapterMegaSpectraThunder2458 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterCameraXTurboCelestialHero5430;
    public FrostHunterContextBetaSpark7441[] FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final int FrostHunterFlowMaxDragonHero5809;
    public IBinder FrostHunterFragmentBetaMegaVortex6025;
    public String FrostHunterKeyframeGammaGamma1197;
    public Bundle FrostHunterLightSensorForceFusion4241;
    public FrostHunterContextBetaSpark7441[] FrostHunterLintTitanVortexQuantum9911;
    public final String FrostHunterLooperThreadBetaHyperionMax1000;
    public final int FrostHunterResourcesTitanHyperVision5823;
    public Account FrostHunterScaleAnimationStrikeSpark5059;
    public Scope[] FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final boolean FrostHunterTextViewDragonStormMega4297;
    public static final Parcelable.Creator<FrostHunterSupervisorJobNeoShadow8390> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(25);
    public static final Scope[] FrostHunterMotionSceneAuroraMega2271 = new Scope[0];
    public static final FrostHunterContextBetaSpark7441[] FrostHunterBitmapTurboDeltaNebula8743 = new FrostHunterContextBetaSpark7441[0];

    public FrostHunterSupervisorJobNeoShadow8390(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr, FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? FrostHunterMotionSceneAuroraMega2271 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr3 = FrostHunterBitmapTurboDeltaNebula8743;
        frostHunterContextBetaSpark7441Arr = frostHunterContextBetaSpark7441Arr == null ? frostHunterContextBetaSpark7441Arr3 : frostHunterContextBetaSpark7441Arr;
        frostHunterContextBetaSpark7441Arr2 = frostHunterContextBetaSpark7441Arr2 == null ? frostHunterContextBetaSpark7441Arr3 : frostHunterContextBetaSpark7441Arr2;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
        this.FrostHunterAlertDialogAuroraDelta3200 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.FrostHunterKeyframeGammaGamma1197 = "com.google.android.gms";
        } else {
            this.FrostHunterKeyframeGammaGamma1197 = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = FrostHunterGradlePluginQuantumNebulaThunder2592.FrostHunterServiceEliteCelestialThunder1757;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                FrostHunterFlowBlazeVision5301 frostHunterPreviewInfernoFusion6094 = queryLocalInterface instanceof FrostHunterFlowBlazeVision5301 ? (FrostHunterFlowBlazeVision5301) queryLocalInterface : new FrostHunterPreviewInfernoFusion6094(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    account2 = ((FrostHunterPreviewInfernoFusion6094) frostHunterPreviewInfernoFusion6094).FrostHunterAlphaAnimationNeoCosmos5761();
                } catch (RemoteException unused) {
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
            this.FrostHunterScaleAnimationStrikeSpark5059 = account2;
        } else {
            this.FrostHunterFragmentBetaMegaVortex6025 = iBinder;
            this.FrostHunterScaleAnimationStrikeSpark5059 = account;
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = scopeArr;
        this.FrostHunterLightSensorForceFusion4241 = bundle;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterContextBetaSpark7441Arr;
        this.FrostHunterLintTitanVortexQuantum9911 = frostHunterContextBetaSpark7441Arr2;
        this.FrostHunterCameraXTurboCelestialHero5430 = z;
        this.FrostHunterResourcesTitanHyperVision5823 = i4;
        this.FrostHunterTextViewDragonStormMega4297 = z2;
        this.FrostHunterLooperThreadBetaHyperionMax1000 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FrostHunterOnPreDrawListenerFusionGammaOmega7733.FrostHunterAlphaAnimationNeoCosmos5761(this, parcel, i);
    }
}
