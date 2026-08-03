package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 implements u {

    /* renamed from: o, reason: collision with root package name */
    public static final f0 f667o = new f0();

    /* renamed from: g, reason: collision with root package name */
    public int f668g;

    /* renamed from: h, reason: collision with root package name */
    public int f669h;

    /* renamed from: k, reason: collision with root package name */
    public Handler f672k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f670i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f671j = true;

    /* renamed from: l, reason: collision with root package name */
    public final w f673l = new w(this, true);

    /* renamed from: m, reason: collision with root package name */
    public final a1.a f674m = new a1.a(1, this);

    /* renamed from: n, reason: collision with root package name */
    public final x0 f675n = new x0(this);

    public final void c() {
        int i10 = this.f669h + 1;
        this.f669h = i10;
        if (i10 == 1) {
            if (this.f670i) {
                this.f673l.d(o.ON_RESUME);
                this.f670i = false;
            } else {
                Handler handler = this.f672k;
                pc.j.b(handler);
                handler.removeCallbacks(this.f674m);
            }
        }
    }

    @Override // androidx.lifecycle.u
    public final w h() {
        return this.f673l;
    }
}
