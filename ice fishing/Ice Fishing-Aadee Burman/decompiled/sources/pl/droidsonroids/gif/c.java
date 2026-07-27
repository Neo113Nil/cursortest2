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
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: A, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39949A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f39950B;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuffColorFilter f39951C;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f39952D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f39953E;

    /* renamed from: F, reason: collision with root package name */
    public final g f39954F;

    /* renamed from: G, reason: collision with root package name */
    public final e f39955G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f39956H;

    /* renamed from: I, reason: collision with root package name */
    public ScheduledFuture f39957I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f39958K;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f39959n;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f39960u;

    /* renamed from: v, reason: collision with root package name */
    public long f39961v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f39962w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f39963x;

    /* renamed from: y, reason: collision with root package name */
    public final Bitmap f39964y;

    /* renamed from: z, reason: collision with root package name */
    public final GifInfoHandle f39965z;

    public c(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)));
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i6 = typedValue.density;
        if (i6 == 0) {
            i6 = 160;
        } else if (i6 == 65535) {
            i6 = 0;
        }
        int i9 = resources.getDisplayMetrics().densityDpi;
        float f3 = (i6 <= 0 || i9 <= 0) ? 1.0f : i9 / i6;
        this.f39958K = (int) (this.f39965z.e() * f3);
        this.J = (int) (this.f39965z.j() * f3);
    }

    public final void a(long j6) {
        g gVar = this.f39954F;
        if (this.f39953E) {
            this.f39961v = 0L;
            gVar.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f39957I;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        gVar.removeMessages(-1);
        this.f39957I = this.f39959n.schedule(this.f39955G, Math.max(j6, 0L), TimeUnit.MILLISECONDS);
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
        return this.f39965z.h() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f39965z.h() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        PorterDuffColorFilter porterDuffColorFilter = this.f39951C;
        Paint paint = this.f39963x;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.f39951C);
            z3 = true;
        }
        canvas.drawBitmap(this.f39964y, this.f39956H, this.f39962w, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39963x.getAlpha();
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
        return this.f39963x.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f39965z.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f39965z.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f39958K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f39965z.k() || this.f39963x.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f39953E && this.f39960u) {
            long j6 = this.f39961v;
            if (j6 != Long.MIN_VALUE) {
                long max = Math.max(0L, j6 - SystemClock.uptimeMillis());
                this.f39961v = Long.MIN_VALUE;
                this.f39959n.remove(this.f39955G);
                this.f39957I = this.f39959n.schedule(this.f39955G, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f39960u;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f39960u;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f39950B;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f39962w.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f39950B;
        if (colorStateList == null || (mode = this.f39952D) == null) {
            return false;
        }
        this.f39951C = b(colorStateList, mode);
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
        this.f39959n.execute(new b(this, this, i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f39963x.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39963x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f39963x.setDither(z3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f39963x.setFilterBitmap(z3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f39950B = colorStateList;
        this.f39951C = b(colorStateList, this.f39952D);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f39952D = mode;
        this.f39951C = b(this.f39950B, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z6) {
        boolean visible = super.setVisible(z3, z6);
        if (!this.f39953E) {
            if (z3) {
                if (z6) {
                    this.f39959n.execute(new a(this, this));
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
                if (this.f39960u) {
                    return;
                }
                this.f39960u = true;
                a(this.f39965z.n());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            try {
                if (this.f39960u) {
                    this.f39960u = false;
                    ScheduledFuture scheduledFuture = this.f39957I;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f39954F.removeMessages(-1);
                    this.f39965z.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f39965z;
        int j6 = gifInfoHandle.j();
        int e9 = gifInfoHandle.e();
        int h9 = gifInfoHandle.h();
        int g4 = gifInfoHandle.g();
        StringBuilder h10 = AbstractC4404f.h(j6, e9, "GIF: size: ", "x", ", frames: ");
        h10.append(h9);
        h10.append(", error: ");
        h10.append(g4);
        return h10.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(ContentResolver contentResolver, Uri uri) {
        this(r3);
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f39944b;
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            gifInfoHandle = new GifInfoHandle();
            gifInfoHandle.f39945a = GifInfoHandle.openFile(path);
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
        this.f39960u = true;
        this.f39961v = Long.MIN_VALUE;
        this.f39962w = new Rect();
        this.f39963x = new Paint(6);
        this.f39949A = new ConcurrentLinkedQueue();
        e eVar = new e(this);
        this.f39955G = eVar;
        this.f39953E = true;
        int i = B8.c.f229n;
        this.f39959n = B8.b.f228a;
        this.f39965z = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        this.f39964y = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.k());
        this.f39956H = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.f39954F = new g(this);
        eVar.a();
        this.J = gifInfoHandle.j();
        this.f39958K = gifInfoHandle.e();
    }
}
