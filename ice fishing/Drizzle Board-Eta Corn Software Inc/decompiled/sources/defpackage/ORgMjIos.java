package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ORgMjIos implements Drawable.Callback {
    public final /* synthetic */ zgcfmssZ NCTxEWno;

    public ORgMjIos(zgcfmssZ zgcfmssz) {
        this.NCTxEWno = zgcfmssz;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.NCTxEWno.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.NCTxEWno.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.NCTxEWno.unscheduleSelf(runnable);
    }
}
