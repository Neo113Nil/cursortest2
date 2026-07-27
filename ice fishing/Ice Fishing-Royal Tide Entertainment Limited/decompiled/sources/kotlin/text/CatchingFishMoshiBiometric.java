package kotlin.text;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class CatchingFishMoshiBiometric implements Drawable.Callback {
    public final /* synthetic */ CatchingFishAdMobSharedFlow CatchingFishReduxKtor;

    public CatchingFishMoshiBiometric(CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow) {
        this.CatchingFishReduxKtor = catchingFishAdMobSharedFlow;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.CatchingFishReduxKtor.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.CatchingFishReduxKtor.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.CatchingFishReduxKtor.unscheduleSelf(runnable);
    }
}
