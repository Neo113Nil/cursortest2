package i4;

import ac.m;
import ac.n;
import android.content.Context;
import b0.p0;
import bc.a0;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements h4.d {

    /* renamed from: g, reason: collision with root package name */
    public final Context f3186g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3187h;

    /* renamed from: i, reason: collision with root package name */
    public final h4.a f3188i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3189j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3190k;

    /* renamed from: l, reason: collision with root package name */
    public final m f3191l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3192m;

    public g(Context context, String str, h4.a aVar, boolean z10, boolean z11) {
        j.e(aVar, "callback");
        this.f3186g = context;
        this.f3187h = str;
        this.f3188i = aVar;
        this.f3189j = z10;
        this.f3190k = z11;
        this.f3191l = a0.y(new p0(7, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3191l.f274h != n.f276a) {
            ((f) this.f3191l.getValue()).close();
        }
    }

    @Override // h4.d
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f3191l.f274h != n.f276a) {
            f fVar = (f) this.f3191l.getValue();
            j.e(fVar, "sQLiteOpenHelper");
            fVar.setWriteAheadLoggingEnabled(z10);
        }
        this.f3192m = z10;
    }

    @Override // h4.d
    public final c t() {
        return ((f) this.f3191l.getValue()).a(true);
    }
}
