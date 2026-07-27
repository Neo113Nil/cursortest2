package android.content.Context;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableNovaCelestial2796 implements FrostHunterFragmentTransactionEclipseNovaXForce8101 {
    public final Bitmap FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterDrawableNovaCelestial2796(Bitmap bitmap) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = bitmap;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionEclipseNovaXForce8101
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.getHeight();
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionEclipseNovaXForce8101
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return true;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionEclipseNovaXForce8101
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.getWidth();
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionEclipseNovaXForce8101
    public final long FrostHunterLifecycleBlazeGammaElite2889() {
        int i;
        Bitmap.Config config;
        int i2;
        Bitmap bitmap = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            i2 = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config2 == config) {
                        i = 8;
                    }
                }
                i = 4;
            }
            i2 = i * height;
        }
        return i2;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionEclipseNovaXForce8101
    public final void FrostHunterServiceEliteCelestialThunder1757(Canvas canvas) {
        canvas.drawBitmap(this.FrostHunterAlphaAnimationNeoCosmos5761, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrostHunterDrawableNovaCelestial2796) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterAlphaAnimationNeoCosmos5761, ((FrostHunterDrawableNovaCelestial2796) obj).FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", shareable=true)";
    }
}
