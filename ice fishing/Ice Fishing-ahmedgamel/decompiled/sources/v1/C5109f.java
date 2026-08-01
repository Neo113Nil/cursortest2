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
public final class C5109f implements InterfaceC5104a {

    /* renamed from: C, reason: collision with root package name */
    public static final Bitmap.Config f41369C = Bitmap.Config.ARGB_8888;

    /* renamed from: A, reason: collision with root package name */
    public int f41370A;

    /* renamed from: B, reason: collision with root package name */
    public int f41371B;

    /* renamed from: n, reason: collision with root package name */
    public final j f41372n;

    /* renamed from: u, reason: collision with root package name */
    public final Set f41373u;

    /* renamed from: v, reason: collision with root package name */
    public final M2.i f41374v;

    /* renamed from: w, reason: collision with root package name */
    public final long f41375w;

    /* renamed from: x, reason: collision with root package name */
    public long f41376x;

    /* renamed from: y, reason: collision with root package name */
    public int f41377y;

    /* renamed from: z, reason: collision with root package name */
    public int f41378z;

    public C5109f(long j6) {
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
        this.f41375w = j6;
        this.f41372n = jVar;
        this.f41373u = unmodifiableSet;
        this.f41374v = new M2.i(28);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f41377y + ", misses=" + this.f41378z + ", puts=" + this.f41370A + ", evictions=" + this.f41371B + ", currentSize=" + this.f41376x + ", maxSize=" + this.f41375w + "\nStrategy=" + this.f41372n);
    }

    public final synchronized Bitmap b(int i, int i6, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b9;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            b9 = this.f41372n.b(i, i6, config != null ? config : f41369C);
            if (b9 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f41372n.getClass();
                    sb.append(j.c(p.d(config) * i * i6, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f41378z++;
            } else {
                this.f41377y++;
                long j6 = this.f41376x;
                this.f41372n.getClass();
                this.f41376x = j6 - p.c(b9);
                this.f41374v.getClass();
                b9.setHasAlpha(true);
                b9.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f41372n.getClass();
                sb2.append(j.c(p.d(config) * i * i6, config));
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

    @Override // v1.InterfaceC5104a
    public final Bitmap c(int i, int i6, Bitmap.Config config) {
        Bitmap b9 = b(i, i6, config);
        if (b9 != null) {
            return b9;
        }
        if (config == null) {
            config = f41369C;
        }
        return Bitmap.createBitmap(i, i6, config);
    }

    @Override // v1.InterfaceC5104a
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f41372n.getClass();
                if (p.c(bitmap) <= this.f41375w && this.f41373u.contains(bitmap.getConfig())) {
                    this.f41372n.getClass();
                    int c9 = p.c(bitmap);
                    this.f41372n.e(bitmap);
                    this.f41374v.getClass();
                    this.f41370A++;
                    this.f41376x += c9;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f41372n.getClass();
                        sb.append(j.c(p.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    e(this.f41375w);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f41372n.getClass();
                sb2.append(j.c(p.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f41373u.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(long j6) {
        while (this.f41376x > j6) {
            try {
                j jVar = this.f41372n;
                Bitmap bitmap = (Bitmap) jVar.f41389b.h();
                if (bitmap != null) {
                    jVar.a(Integer.valueOf(p.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f41376x = 0L;
                    return;
                }
                this.f41374v.getClass();
                long j9 = this.f41376x;
                this.f41372n.getClass();
                this.f41376x = j9 - p.c(bitmap);
                this.f41371B++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f41372n.getClass();
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

    @Override // v1.InterfaceC5104a
    public final Bitmap n(int i, int i6, Bitmap.Config config) {
        Bitmap b9 = b(i, i6, config);
        if (b9 != null) {
            b9.eraseColor(0);
            return b9;
        }
        if (config == null) {
            config = f41369C;
        }
        return Bitmap.createBitmap(i, i6, config);
    }

    @Override // v1.InterfaceC5104a
    public final void s(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            t();
        } else if (i >= 20 || i == 15) {
            e(this.f41375w / 2);
        }
    }

    @Override // v1.InterfaceC5104a
    public final void t() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
