package F1;

import N1.p;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d implements K1.c {

    /* renamed from: n, reason: collision with root package name */
    public final int f969n;

    /* renamed from: u, reason: collision with root package name */
    public final int f970u;

    /* renamed from: v, reason: collision with root package name */
    public J1.c f971v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f972w;

    /* renamed from: x, reason: collision with root package name */
    public final int f973x;

    /* renamed from: y, reason: collision with root package name */
    public final long f974y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f975z;

    public d(Handler handler, int i, long j9) {
        if (!p.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f969n = Integer.MIN_VALUE;
        this.f970u = Integer.MIN_VALUE;
        this.f972w = handler;
        this.f973x = i;
        this.f974y = j9;
    }

    @Override // K1.c
    public final void b(J1.c cVar) {
        this.f971v = cVar;
    }

    @Override // K1.c
    public final void c(Object obj) {
        this.f975z = (Bitmap) obj;
        Handler handler = this.f972w;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f974y);
    }

    @Override // K1.c
    public final void e(J1.f fVar) {
        fVar.l(this.f969n, this.f970u);
    }

    @Override // K1.c
    public final J1.c g() {
        return this.f971v;
    }

    @Override // K1.c
    public final void h(Drawable drawable) {
        this.f975z = null;
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
