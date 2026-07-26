package android.content.Context;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterResourceFusionNebulaTurbo2767 {
    public static final Bitmap.Config[] FrostHunterAlphaAnimationNeoCosmos5761;
    public static final Bitmap.Config FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        FrostHunterAlphaAnimationNeoCosmos5761 = configArr;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int FrostHunterAlphaAnimationNeoCosmos5761(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int FrostHunterConstraintSetCloneMasterUltraRogue2633(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }
}
