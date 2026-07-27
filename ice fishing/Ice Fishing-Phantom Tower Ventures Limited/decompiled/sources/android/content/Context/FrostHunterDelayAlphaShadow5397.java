package android.content.Context;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterDelayAlphaShadow5397 extends FrostHunterValueAnimatorNovaXVision5984 implements IInterface {
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterDelayAlphaShadow5397(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length == 25) {
            this.FrostHunterServiceEliteCelestialThunder1757 = Arrays.hashCode(bArr);
        } else {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
            throw null;
        }
    }

    public static byte[] FrostHunterLifecycleBlazeGammaElite2889(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] FrostHunterLevelListDrawableFusionDragonHero2232();

    @Override // android.content.Context.FrostHunterValueAnimatorNovaXVision5984
    public final boolean FrostHunterServiceEliteCelestialThunder1757(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.FrostHunterServiceEliteCelestialThunder1757);
            return true;
        }
        FrostHunterViewPager2DeltaPhoenix4839 frostHunterViewPager2DeltaPhoenix4839 = new FrostHunterViewPager2DeltaPhoenix4839(FrostHunterLevelListDrawableFusionDragonHero2232());
        parcel2.writeNoException();
        int i2 = FrostHunterJobSchedulerOlympianBlazePrime3747.FrostHunterAlphaAnimationNeoCosmos5761;
        parcel2.writeStrongBinder(frostHunterViewPager2DeltaPhoenix4839);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FrostHunterDelayAlphaShadow5397)) {
            return false;
        }
        try {
            FrostHunterDelayAlphaShadow5397 frostHunterDelayAlphaShadow5397 = (FrostHunterDelayAlphaShadow5397) obj;
            if (frostHunterDelayAlphaShadow5397.FrostHunterServiceEliteCelestialThunder1757 != this.FrostHunterServiceEliteCelestialThunder1757) {
                return false;
            }
            return Arrays.equals(FrostHunterLevelListDrawableFusionDragonHero2232(), (byte[]) new FrostHunterViewPager2DeltaPhoenix4839(frostHunterDelayAlphaShadow5397.FrostHunterLevelListDrawableFusionDragonHero2232()).FrostHunterServiceEliteCelestialThunder1757);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }
}
