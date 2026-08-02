package H1;

import P1.p;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e implements M1.c {

    /* renamed from: n, reason: collision with root package name */
    public final int f1207n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1208u;

    /* renamed from: v, reason: collision with root package name */
    public L1.c f1209v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f1210w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1211x;

    /* renamed from: y, reason: collision with root package name */
    public final long f1212y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f1213z;

    public e(Handler handler, int i, long j6) {
        if (!p.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f1207n = Integer.MIN_VALUE;
        this.f1208u = Integer.MIN_VALUE;
        this.f1210w = handler;
        this.f1211x = i;
        this.f1212y = j6;
    }

    @Override // M1.c
    public final void b(Object obj) {
        this.f1213z = (Bitmap) obj;
        Handler handler = this.f1210w;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f1212y);
    }

    @Override // M1.c
    public final void c(L1.c cVar) {
        this.f1209v = cVar;
    }

    @Override // M1.c
    public final void e(L1.f fVar) {
        fVar.l(this.f1207n, this.f1208u);
    }

    @Override // M1.c
    public final L1.c g() {
        return this.f1209v;
    }

    @Override // M1.c
    public final void h(Drawable drawable) {
        this.f1213z = null;
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

    @Override // M1.c
    public final void a(L1.f fVar) {
    }

    @Override // M1.c
    public final void d(Drawable drawable) {
    }

    @Override // M1.c
    public final void f(Drawable drawable) {
    }
}
