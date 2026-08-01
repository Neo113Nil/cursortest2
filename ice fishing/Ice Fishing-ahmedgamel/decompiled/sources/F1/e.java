package F1;

import N1.p;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e implements K1.c {

    /* renamed from: n, reason: collision with root package name */
    public final int f922n;

    /* renamed from: u, reason: collision with root package name */
    public final int f923u;

    /* renamed from: v, reason: collision with root package name */
    public J1.c f924v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f925w;

    /* renamed from: x, reason: collision with root package name */
    public final int f926x;

    /* renamed from: y, reason: collision with root package name */
    public final long f927y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f928z;

    public e(Handler handler, int i, long j6) {
        if (!p.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f922n = Integer.MIN_VALUE;
        this.f923u = Integer.MIN_VALUE;
        this.f925w = handler;
        this.f926x = i;
        this.f927y = j6;
    }

    @Override // K1.c
    public final void b(J1.c cVar) {
        this.f924v = cVar;
    }

    @Override // K1.c
    public final void c(Object obj) {
        this.f928z = (Bitmap) obj;
        Handler handler = this.f925w;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f927y);
    }

    @Override // K1.c
    public final void e(J1.f fVar) {
        fVar.l(this.f922n, this.f923u);
    }

    @Override // K1.c
    public final J1.c g() {
        return this.f924v;
    }

    @Override // K1.c
    public final void h(Drawable drawable) {
        this.f928z = null;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
    }

    @Override // K1.c
    public final void a(J1.f fVar) {
    }

    @Override // K1.c
    public final void d(Drawable drawable) {
    }

    @Override // K1.c
    public final void f(Drawable drawable) {
    }
}
