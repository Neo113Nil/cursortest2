package android.content.Context;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKotlinNebulaSpectraOlympian6969 implements Parcelable {
    public static final Parcelable.Creator<FrostHunterKotlinNebulaSpectraOlympian6969> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(3);
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final IntentSender FrostHunterCameraXPixelTurboCosmos9814;
    public final Intent FrostHunterFlowMaxDragonHero5809;
    public final int FrostHunterKeyframeGammaGamma1197;

    public FrostHunterKotlinNebulaSpectraOlympian6969(IntentSender intentSender, Intent intent, int i, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = intentSender;
        this.FrostHunterFlowMaxDragonHero5809 = intent;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterKeyframeGammaGamma1197 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.FrostHunterCameraXPixelTurboCosmos9814, i);
        parcel.writeParcelable(this.FrostHunterFlowMaxDragonHero5809, i);
        parcel.writeInt(this.FrostHunterAlertDialogAuroraDelta3200);
        parcel.writeInt(this.FrostHunterKeyframeGammaGamma1197);
    }
}
