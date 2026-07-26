package android.content.Context;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterChipGroupLegendShadowEpic4100 {
    public static final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 0;

    static {
        FrostHunterChipGroupLegendShadowEpic4100.class.getClassLoader();
    }

    public static Parcelable FrostHunterAlphaAnimationNeoCosmos5761(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
