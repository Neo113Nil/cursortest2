package z0;

import X.r;
import a.AbstractC0422a;
import android.content.Context;
import u7.C5093k;
import u7.C5101s;

/* renamed from: z0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5251g implements y0.b {

    /* renamed from: n, reason: collision with root package name */
    public final Context f42238n;

    /* renamed from: u, reason: collision with root package name */
    public final String f42239u;

    /* renamed from: v, reason: collision with root package name */
    public final F.d f42240v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f42241w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f42242x;

    /* renamed from: y, reason: collision with root package name */
    public final C5093k f42243y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42244z;

    public C5251g(Context context, String str, F.d callback, boolean z3, boolean z6) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f42238n = context;
        this.f42239u = str;
        this.f42240v = callback;
        this.f42241w = z3;
        this.f42242x = z6;
        this.f42243y = AbstractC0422a.q(new r(5, this));
    }

    @Override // y0.b
    public final C5247c R() {
        return ((C5250f) this.f42243y.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42243y.f41336u != C5101s.f41347a) {
            ((C5250f) this.f42243y.getValue()).close();
        }
    }

    @Override // y0.b
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.f42243y.f41336u != C5101s.f41347a) {
            C5250f sQLiteOpenHelper = (C5250f) this.f42243y.getValue();
            kotlin.jvm.internal.h.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z3);
        }
        this.f42244z = z3;
    }
}
