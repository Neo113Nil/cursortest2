package h;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: h.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174s {

    /* renamed from: a, reason: collision with root package name */
    public final int f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2268b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2269c;

    public C0174s(int i2, String str, double d2, double d3, double d4, double d5, int i3, int i4, ByteBuffer byteBuffer) {
        this.f2267a = i2;
        this.f2269c = str;
        this.f2268b = i3;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new androidx.lifecycle.k(4, this));
    }

    public void b(Typeface typeface) {
        int i2;
        WeakReference weakReference = (WeakReference) this.f2269c;
        C0175t c0175t = (C0175t) weakReference.get();
        if (c0175t == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2267a) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f2268b & 2) != 0);
        }
        c0175t.f2281a.post(new Q0.i(weakReference, typeface, 2, false));
    }

    public C0174s(C0175t c0175t, int i2, int i3) {
        this.f2269c = new WeakReference(c0175t);
        this.f2267a = i2;
        this.f2268b = i3;
    }
}
