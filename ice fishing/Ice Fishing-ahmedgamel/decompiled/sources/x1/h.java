package x1;

import P1.p;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements InterfaceC5183a {

    /* renamed from: C, reason: collision with root package name */
    public static final Bitmap.Config f41823C = Bitmap.Config.ARGB_8888;

    /* renamed from: A, reason: collision with root package name */
    public int f41824A;

    /* renamed from: B, reason: collision with root package name */
    public int f41825B;

    /* renamed from: n, reason: collision with root package name */
    public final l f41826n;

    /* renamed from: u, reason: collision with root package name */
    public final Set f41827u;

    /* renamed from: v, reason: collision with root package name */
    public final g f41828v;

    /* renamed from: w, reason: collision with root package name */
    public final long f41829w;

    /* renamed from: x, reason: collision with root package name */
    public long f41830x;

    /* renamed from: y, reason: collision with root package name */
    public int f41831y;

    /* renamed from: z, reason: collision with root package name */
    public int f41832z;

    public h(long j6) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f41829w = j6;
        this.f41826n = lVar;
        this.f41827u = unmodifiableSet;
        this.f41828v = new g();
    }

    @Override // x1.InterfaceC5183a
    public final Bitmap a(int i, int i4, Bitmap.Config config) {
        Bitmap e9 = e(i, i4, config);
        if (e9 != null) {
            return e9;
        }
        if (config == null) {
            config = f41823C;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // x1.InterfaceC5183a
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f41826n.getClass();
                if (p.c(bitmap) <= this.f41829w && this.f41827u.contains(bitmap.getConfig())) {
                    this.f41826n.getClass();
                    int c9 = p.c(bitmap);
                    this.f41826n.e(bitmap);
                    this.f41828v.getClass();
                    this.f41824A++;
                    this.f41830x += c9;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f41826n.getClass();
                        sb.append(l.c(p.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        c();
                    }
                    h(this.f41829w);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f41826n.getClass();
                sb2.append(l.c(p.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f41827u.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        Log.v("LruBitmapPool", "Hits=" + this.f41831y + ", misses=" + this.f41832z + ", puts=" + this.f41824A + ", evictions=" + this.f41825B + ", currentSize=" + this.f41830x + ", maxSize=" + this.f41829w + "\nStrategy=" + this.f41826n);
    }

    @Override // x1.InterfaceC5183a
    public final Bitmap d(int i, int i4, Bitmap.Config config) {
        Bitmap e9 = e(i, i4, config);
        if (e9 != null) {
            e9.eraseColor(0);
            return e9;
        }
        if (config == null) {
            config = f41823C;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    public final synchronized Bitmap e(int i, int i4, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b9;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            b9 = this.f41826n.b(i, i4, config != null ? config : f41823C);
            if (b9 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f41826n.getClass();
                    sb.append(l.c(p.d(config) * i * i4, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f41832z++;
            } else {
                this.f41831y++;
                long j6 = this.f41830x;
                this.f41826n.getClass();
                this.f41830x = j6 - p.c(b9);
                this.f41828v.getClass();
                b9.setHasAlpha(true);
                b9.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f41826n.getClass();
                sb2.append(l.c(p.d(config) * i * i4, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b9;
    }

    @Override // x1.InterfaceC5183a
    public final void f(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            g();
        } else if (i >= 20 || i == 15) {
            h(this.f41829w / 2);
        }
    }

    @Override // x1.InterfaceC5183a
    public final void g() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    public final synchronized void h(long j6) {
        while (this.f41830x > j6) {
            try {
                l lVar = this.f41826n;
                Bitmap bitmap = (Bitmap) lVar.f41843b.f();
                if (bitmap != null) {
                    lVar.a(Integer.valueOf(p.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        c();
                    }
                    this.f41830x = 0L;
                    return;
                }
                this.f41828v.getClass();
                long j9 = this.f41830x;
                this.f41826n.getClass();
                this.f41830x = j9 - p.c(bitmap);
                this.f41825B++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f41826n.getClass();
                    sb.append(l.c(p.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    c();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
