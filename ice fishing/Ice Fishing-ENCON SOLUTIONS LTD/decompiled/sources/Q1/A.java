package Q1;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import h.C0222s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1555b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1556c;

    public A(int i2, String str, double d2, double d3, double d4, double d5, int i3, int i4, ByteBuffer byteBuffer) {
        this.f1554a = i2;
        this.f1556c = str;
        this.f1555b = i3;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new F0.a(11, this));
    }

    public void b(Typeface typeface) {
        int i2;
        WeakReference weakReference = (WeakReference) this.f1556c;
        C0222s c0222s = (C0222s) weakReference.get();
        if (c0222s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f1554a) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f1555b & 2) != 0);
        }
        c0222s.f3338a.post(new D0.f(weakReference, typeface, 5, false));
    }

    public A() {
        this.f1556c = new A[256];
        this.f1554a = 0;
        this.f1555b = 0;
    }

    public A(int i2, int i3) {
        this.f1556c = null;
        this.f1554a = i2;
        int i4 = i3 & 7;
        this.f1555b = i4 == 0 ? 8 : i4;
    }

    public A(C0222s c0222s, int i2, int i3) {
        this.f1556c = new WeakReference(c0222s);
        this.f1554a = i2;
        this.f1555b = i3;
    }
}
