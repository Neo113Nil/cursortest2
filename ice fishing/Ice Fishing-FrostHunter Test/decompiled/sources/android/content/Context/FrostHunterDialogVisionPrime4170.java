package android.content.Context;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDialogVisionPrime4170 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterDialogVisionPrime4170(int i, int i2, long j, long j2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.FrostHunterServiceEliteCelestialThunder1757 = j2;
    }

    public static FrostHunterDialogVisionPrime4170 FrostHunterAlphaAnimationNeoCosmos5761(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            FrostHunterDialogVisionPrime4170 frostHunterDialogVisionPrime4170 = new FrostHunterDialogVisionPrime4170(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return frostHunterDialogVisionPrime4170;
        } finally {
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.FrostHunterAlphaAnimationNeoCosmos5761);
            dataOutputStream.writeInt(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            dataOutputStream.writeLong(this.FrostHunterBundlePulseFusionHero2475);
            dataOutputStream.writeLong(this.FrostHunterServiceEliteCelestialThunder1757);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof FrostHunterDialogVisionPrime4170)) {
            FrostHunterDialogVisionPrime4170 frostHunterDialogVisionPrime4170 = (FrostHunterDialogVisionPrime4170) obj;
            if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterDialogVisionPrime4170.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterDialogVisionPrime4170.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterDialogVisionPrime4170.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterServiceEliteCelestialThunder1757 == frostHunterDialogVisionPrime4170.FrostHunterServiceEliteCelestialThunder1757) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.FrostHunterConstraintSetCloneMasterUltraRogue2633), Long.valueOf(this.FrostHunterBundlePulseFusionHero2475), Integer.valueOf(this.FrostHunterAlphaAnimationNeoCosmos5761), Long.valueOf(this.FrostHunterServiceEliteCelestialThunder1757));
    }
}
