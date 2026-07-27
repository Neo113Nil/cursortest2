package android.content.Context;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRealtimeDatabasePulseStormOlympian4721 implements Parcelable {
    public static final Parcelable.Creator<FrostHunterRealtimeDatabasePulseStormOlympian4721> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(0);
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final Intent FrostHunterFlowMaxDragonHero5809;

    public FrostHunterRealtimeDatabasePulseStormOlympian4721(Intent intent, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.FrostHunterFlowMaxDragonHero5809);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.FrostHunterCameraXPixelTurboCosmos9814);
        Intent intent = this.FrostHunterFlowMaxDragonHero5809;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
