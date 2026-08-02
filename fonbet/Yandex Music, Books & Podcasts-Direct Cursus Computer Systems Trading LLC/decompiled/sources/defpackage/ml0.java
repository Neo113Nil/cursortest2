package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class ml0 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ml0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((pl0) this.b).invalidateSelf();
                break;
            case 1:
                break;
            default:
                drawable.getClass();
                opa opaVar = (opa) this.b;
                x6k x6kVar = opaVar.f;
                x6kVar.setValue(Integer.valueOf(((Number) x6kVar.getValue()).intValue() + 1));
                Drawable drawable2 = opaVar.e;
                Object obj = ppa.a;
                opaVar.g.setValue(new nmq((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : a4g.i(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [arf, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((pl0) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) ppa.a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [arf, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((pl0) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) ppa.a.getValue()).removeCallbacks(runnable);
                break;
        }
    }

    public /* synthetic */ ml0() {
        this.a = 1;
    }

    private final void a(Drawable drawable) {
    }
}
