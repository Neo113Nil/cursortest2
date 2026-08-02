package z0;

import N3.C;
import X.r;
import android.content.Context;
import u7.C5085k;
import u7.C5093s;
import y0.InterfaceC5197b;

/* renamed from: z0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5218g implements InterfaceC5197b {

    /* renamed from: n, reason: collision with root package name */
    public final Context f42212n;

    /* renamed from: u, reason: collision with root package name */
    public final String f42213u;

    /* renamed from: v, reason: collision with root package name */
    public final F.d f42214v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f42215w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f42216x;

    /* renamed from: y, reason: collision with root package name */
    public final C5085k f42217y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42218z;

    public C5218g(Context context, String str, F.d callback, boolean z6, boolean z9) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f42212n = context;
        this.f42213u = str;
        this.f42214v = callback;
        this.f42215w = z6;
        this.f42216x = z9;
        this.f42217y = C.O(new r(5, this));
    }

    @Override // y0.InterfaceC5197b
    public final C5214c R() {
        return ((C5217f) this.f42217y.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42217y.f41059u != C5093s.f41070a) {
            ((C5217f) this.f42217y.getValue()).close();
        }
    }

    @Override // y0.InterfaceC5197b
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        if (this.f42217y.f41059u != C5093s.f41070a) {
            C5217f sQLiteOpenHelper = (C5217f) this.f42217y.getValue();
            kotlin.jvm.internal.h.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z6);
        }
        this.f42218z = z6;
    }
}
