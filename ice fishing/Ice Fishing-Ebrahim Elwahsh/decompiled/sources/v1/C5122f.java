package v1;

import N1.p;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5122f implements InterfaceC5117a {

    /* renamed from: C, reason: collision with root package name */
    public static final Bitmap.Config f41339C = Bitmap.Config.ARGB_8888;

    /* renamed from: A, reason: collision with root package name */
    public int f41340A;

    /* renamed from: B, reason: collision with root package name */
    public int f41341B;

    /* renamed from: n, reason: collision with root package name */
    public final j f41342n;

    /* renamed from: u, reason: collision with root package name */
    public final Set f41343u;

    /* renamed from: v, reason: collision with root package name */
    public final C3.e f41344v;

    /* renamed from: w, reason: collision with root package name */
    public final long f41345w;

    /* renamed from: x, reason: collision with root package name */
    public long f41346x;

    /* renamed from: y, reason: collision with root package name */
    public int f41347y;

    /* renamed from: z, reason: collision with root package name */
    public int f41348z;

    public C5122f(long j9) {
        Bitmap.Config config;
        j jVar = new j();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f41345w = j9;
        this.f41342n = jVar;
        this.f41343u = unmodifiableSet;
        this.f41344v = new C3.e();
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f41347y + ", misses=" + this.f41348z + ", puts=" + this.f41340A + ", evictions=" + this.f41341B + ", currentSize=" + this.f41346x + ", maxSize=" + this.f41345w + "\nStrategy=" + this.f41342n);
    }

    public final synchronized Bitmap b(int i, int i4, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b9;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            b9 = this.f41342n.b(i, i4, config != null ? config : f41339C);
            if (b9 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f41342n.getClass();
                    sb.append(j.c(p.d(config) * i * i4, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f41348z++;
            } else {
                this.f41347y++;
                long j9 = this.f41346x;
                this.f41342n.getClass();
                this.f41346x = j9 - p.c(b9);
                this.f41344v.getClass();
                b9.setHasAlpha(true);
                b9.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f41342n.getClass();
                sb2.append(j.c(p.d(config) * i * i4, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b9;
    }

    @Override // v1.InterfaceC5117a
    public final Bitmap c(int i, int i4, Bitmap.Config config) {
        Bitmap b9 = b(i, i4, config);
        if (b9 != null) {
            return b9;
        }
        if (config == null) {
            config = f41339C;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // v1.InterfaceC5117a
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f41342n.getClass();
                if (p.c(bitmap) <= this.f41345w && this.f41343u.contains(bitmap.getConfig())) {
                    this.f41342n.getClass();
                    int c4 = p.c(bitmap);
                    this.f41342n.e(bitmap);
                    this.f41344v.getClass();
                    this.f41340A++;
                    this.f41346x += c4;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f41342n.getClass();
                        sb.append(j.c(p.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    e(this.f41345w);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f41342n.getClass();
                sb2.append(j.c(p.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f41343u.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(long j9) {
        while (this.f41346x > j9) {
            try {
                j jVar = this.f41342n;
                Bitmap bitmap = (Bitmap) jVar.f41359b.B();
                if (bitmap != null) {
                    jVar.a(Integer.valueOf(p.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f41346x = 0L;
                    return;
                }
                this.f41344v.getClass();
                long j10 = this.f41346x;
                this.f41342n.getClass();
                this.f41346x = j10 - p.c(bitmap);
                this.f41341B++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f41342n.getClass();
                    sb.append(j.c(p.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v1.InterfaceC5117a
    public final Bitmap l(int i, int i4, Bitmap.Config config) {
        Bitmap b9 = b(i, i4, config);
        if (b9 != null) {
            b9.eraseColor(0);
            return b9;
        }
        if (config == null) {
            config = f41339C;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // v1.InterfaceC5117a
    public final void p(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            s();
        } else if (i >= 20 || i == 15) {
            e(this.f41345w / 2);
        }
    }

    @Override // v1.InterfaceC5117a
    public final void s() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
