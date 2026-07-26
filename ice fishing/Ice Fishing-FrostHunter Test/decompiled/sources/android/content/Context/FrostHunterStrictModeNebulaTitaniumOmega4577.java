package android.content.Context;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStrictModeNebulaTitaniumOmega4577 implements Parcelable.ClassLoaderCreator {
    public static FrostHunterStrictModeCyberNebulaThunder6426 FrostHunterAlphaAnimationNeoCosmos5761(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = FrostHunterStrictModeNebulaTitaniumOmega4577.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new FrostHunterStrictModeCyberNebulaThunder6426();
        }
        FrostHunterLiveDataShadowStrike4842 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterCameraVortexTitanSpark3327.FrostHunterFlowMaxDragonHero5809.FrostHunterLevelListDrawableFusionDragonHero2232();
        for (int i = 0; i < readInt; i++) {
            FrostHunterLevelListDrawableFusionDragonHero2232.add(parcel.readValue(classLoader));
        }
        return new FrostHunterStrictModeCyberNebulaThunder6426(FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterServiceEliteCelestialThunder1757());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return FrostHunterAlphaAnimationNeoCosmos5761(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FrostHunterStrictModeCyberNebulaThunder6426[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return FrostHunterAlphaAnimationNeoCosmos5761(parcel, classLoader);
    }
}
