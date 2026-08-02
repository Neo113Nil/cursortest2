package pl.droidsonroids.gif;

import B8.g;
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
import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: A, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39999A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f40000B;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuffColorFilter f40001C;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f40002D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f40003E;

    /* renamed from: F, reason: collision with root package name */
    public final g f40004F;

    /* renamed from: G, reason: collision with root package name */
    public final e f40005G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f40006H;

    /* renamed from: I, reason: collision with root package name */
    public ScheduledFuture f40007I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f40008K;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f40009n;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f40010u;

    /* renamed from: v, reason: collision with root package name */
    public long f40011v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f40012w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f40013x;

    /* renamed from: y, reason: collision with root package name */
    public final Bitmap f40014y;

    /* renamed from: z, reason: collision with root package name */
    public final GifInfoHandle f40015z;

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
        int i6 = resources.getDisplayMetrics().densityDpi;
        float f2 = (i4 <= 0 || i6 <= 0) ? 1.0f : i6 / i4;
        this.f40008K = (int) (this.f40015z.e() * f2);
        this.J = (int) (this.f40015z.j() * f2);
    }

    public final void a(long j6) {
        g gVar = this.f40004F;
        if (this.f40003E) {
            this.f40011v = 0L;
            gVar.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f40007I;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        gVar.removeMessages(-1);
        this.f40007I = this.f40009n.schedule(this.f40005G, Math.max(j6, 0L), TimeUnit.MILLISECONDS);
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
        return this.f40015z.h() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f40015z.h() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6;
        PorterDuffColorFilter porterDuffColorFilter = this.f40001C;
        Paint paint = this.f40013x;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.f40001C);
            z6 = true;
        }
        canvas.drawBitmap(this.f40014y, this.f40006H, this.f40012w, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40013x.getAlpha();
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
        return this.f40013x.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f40015z.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f40015z.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f40008K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f40015z.k() || this.f40013x.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f40003E && this.f40010u) {
            long j6 = this.f40011v;
            if (j6 != Long.MIN_VALUE) {
                long max = Math.max(0L, j6 - SystemClock.uptimeMillis());
                this.f40011v = Long.MIN_VALUE;
                this.f40009n.remove(this.f40005G);
                this.f40007I = this.f40009n.schedule(this.f40005G, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f40010u;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f40010u;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f40000B;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f40012w.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f40000B;
        if (colorStateList == null || (mode = this.f40002D) == null) {
            return false;
        }
        this.f40001C = b(colorStateList, mode);
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
        this.f40009n.execute(new b(this, this, i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40013x.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40013x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        this.f40013x.setDither(z6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z6) {
        this.f40013x.setFilterBitmap(z6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f40000B = colorStateList;
        this.f40001C = b(colorStateList, this.f40002D);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f40002D = mode;
        this.f40001C = b(this.f40000B, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z9) {
        boolean visible = super.setVisible(z6, z9);
        if (!this.f40003E) {
            if (z6) {
                if (z9) {
                    this.f40009n.execute(new a(this, this));
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
                if (this.f40010u) {
                    return;
                }
                this.f40010u = true;
                a(this.f40015z.n());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            try {
                if (this.f40010u) {
                    this.f40010u = false;
                    ScheduledFuture scheduledFuture = this.f40007I;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f40004F.removeMessages(-1);
                    this.f40015z.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f40015z;
        int j6 = gifInfoHandle.j();
        int e9 = gifInfoHandle.e();
        int h3 = gifInfoHandle.h();
        int g9 = gifInfoHandle.g();
        StringBuilder j9 = Wv.j(j6, e9, "GIF: size: ", "x", ", frames: ");
        j9.append(h3);
        j9.append(", error: ");
        j9.append(g9);
        return j9.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(ContentResolver contentResolver, Uri uri) {
        this(r3);
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f39994b;
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            gifInfoHandle = new GifInfoHandle();
            gifInfoHandle.f39995a = GifInfoHandle.openFile(path);
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
        this.f40010u = true;
        this.f40011v = Long.MIN_VALUE;
        this.f40012w = new Rect();
        this.f40013x = new Paint(6);
        this.f39999A = new ConcurrentLinkedQueue();
        e eVar = new e(this);
        this.f40005G = eVar;
        this.f40003E = true;
        int i = B8.c.f295n;
        this.f40009n = B8.b.f294a;
        this.f40015z = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        this.f40014y = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.k());
        this.f40006H = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.f40004F = new g(this);
        eVar.a();
        this.J = gifInfoHandle.j();
        this.f40008K = gifInfoHandle.e();
    }
}
