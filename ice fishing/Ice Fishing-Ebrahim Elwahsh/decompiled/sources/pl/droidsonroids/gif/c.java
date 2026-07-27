package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import com.google.android.gms.internal.ads.C3103dg;
import h.HandlerC4547f;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class c extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: A, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39859A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f39860B;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuffColorFilter f39861C;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f39862D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f39863E;

    /* renamed from: F, reason: collision with root package name */
    public final HandlerC4547f f39864F;

    /* renamed from: G, reason: collision with root package name */
    public final e f39865G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f39866H;

    /* renamed from: I, reason: collision with root package name */
    public ScheduledFuture f39867I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f39868K;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f39869n;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f39870u;

    /* renamed from: v, reason: collision with root package name */
    public long f39871v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f39872w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f39873x;

    /* renamed from: y, reason: collision with root package name */
    public final Bitmap f39874y;

    /* renamed from: z, reason: collision with root package name */
    public final GifInfoHandle f39875z;

    public c(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)));
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i4 = typedValue.density;
        if (i4 == 0) {
            i4 = 160;
        } else if (i4 == 65535) {
            i4 = 0;
        }
        int i9 = resources.getDisplayMetrics().densityDpi;
        float f6 = (i4 <= 0 || i9 <= 0) ? 1.0f : i9 / i4;
        this.f39868K = (int) (this.f39875z.e() * f6);
        this.J = (int) (this.f39875z.j() * f6);
    }

    public final void a(long j9) {
        HandlerC4547f handlerC4547f = this.f39864F;
        if (this.f39863E) {
            this.f39871v = 0L;
            handlerC4547f.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f39867I;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        handlerC4547f.removeMessages(-1);
        this.f39867I = this.f39869n.schedule(this.f39865G, Math.max(j9, 0L), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f39875z.h() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f39875z.h() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        PorterDuffColorFilter porterDuffColorFilter = this.f39861C;
        Paint paint = this.f39873x;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z8 = false;
        } else {
            paint.setColorFilter(this.f39861C);
            z8 = true;
        }
        canvas.drawBitmap(this.f39874y, this.f39866H, this.f39872w, paint);
        if (z8) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39873x.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f39873x.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f39875z.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f39875z.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f39868K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f39875z.k() || this.f39873x.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f39863E && this.f39870u) {
            long j9 = this.f39871v;
            if (j9 != Long.MIN_VALUE) {
                long max = Math.max(0L, j9 - SystemClock.uptimeMillis());
                this.f39871v = Long.MIN_VALUE;
                this.f39869n.remove(this.f39865G);
                this.f39867I = this.f39869n.schedule(this.f39865G, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f39870u;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f39870u;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f39860B;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f39872w.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f39860B;
        if (colorStateList == null || (mode = this.f39862D) == null) {
            return false;
        }
        this.f39861C = b(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f39869n.execute(new b(this, this, i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f39873x.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39873x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z8) {
        this.f39873x.setDither(z8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z8) {
        this.f39873x.setFilterBitmap(z8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f39860B = colorStateList;
        this.f39861C = b(colorStateList, this.f39862D);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f39862D = mode;
        this.f39861C = b(this.f39860B, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (!this.f39863E) {
            if (z8) {
                if (z9) {
                    this.f39869n.execute(new a(this, this));
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            try {
                if (this.f39870u) {
                    return;
                }
                this.f39870u = true;
                a(this.f39875z.n());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            try {
                if (this.f39870u) {
                    this.f39870u = false;
                    ScheduledFuture scheduledFuture = this.f39867I;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f39864F.removeMessages(-1);
                    this.f39875z.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f39875z;
        int j9 = gifInfoHandle.j();
        int e6 = gifInfoHandle.e();
        int h9 = gifInfoHandle.h();
        int g9 = gifInfoHandle.g();
        StringBuilder h10 = AbstractC5051n.h(j9, e6, "GIF: size: ", "x", ", frames: ");
        h10.append(h9);
        h10.append(", error: ");
        h10.append(g9);
        return h10.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(ContentResolver contentResolver, Uri uri) {
        this(r3);
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f39854b;
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            gifInfoHandle = new GifInfoHandle();
            gifInfoHandle.f39855a = GifInfoHandle.openFile(path);
        } else {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv);
            if (openAssetFileDescriptor != null) {
                gifInfoHandle = new GifInfoHandle(openAssetFileDescriptor);
            } else {
                throw new IOException("Could not open AssetFileDescriptor for " + uri);
            }
        }
    }

    public c(GifInfoHandle gifInfoHandle) {
        this.f39870u = true;
        this.f39871v = Long.MIN_VALUE;
        this.f39872w = new Rect();
        this.f39873x = new Paint(6);
        this.f39859A = new ConcurrentLinkedQueue();
        e eVar = new e(this);
        this.f39865G = eVar;
        this.f39863E = true;
        int i = C3103dg.f30074n;
        this.f39869n = x8.b.f41805a;
        this.f39875z = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        this.f39874y = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.k());
        this.f39866H = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.f39864F = new HandlerC4547f(this);
        eVar.a();
        this.J = gifInfoHandle.j();
        this.f39868K = gifInfoHandle.e();
    }
}
