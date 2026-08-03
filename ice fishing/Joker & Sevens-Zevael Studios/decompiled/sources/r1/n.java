package r1;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f5963a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5964b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5965c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5966d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5967e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5968f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5969g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5970h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5971i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5972j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f5973k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5974l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5975m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5976n;

    /* renamed from: o, reason: collision with root package name */
    public n f5977o;

    public n(long j3, long j6, long j10, boolean z10, float f10, long j11, long j12, boolean z11, boolean z12, int i10, long j13) {
        this.f5963a = j3;
        this.f5964b = j6;
        this.f5965c = j10;
        this.f5966d = z10;
        this.f5967e = f10;
        this.f5968f = j11;
        this.f5969g = j12;
        this.f5970h = z11;
        this.f5971i = i10;
        this.f5972j = j13;
        this.f5974l = 0L;
        this.f5975m = z12;
        this.f5976n = z12;
    }

    public final void a() {
        n nVar = this.f5977o;
        if (nVar == null) {
            this.f5975m = true;
            this.f5976n = true;
        } else if (nVar != null) {
            nVar.a();
        }
    }

    public final boolean b() {
        n nVar = this.f5977o;
        return nVar != null ? nVar.b() : this.f5975m || this.f5976n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) m.b(this.f5963a));
        sb.append(", uptimeMillis=");
        sb.append(this.f5964b);
        sb.append(", position=");
        sb.append((Object) e1.b.i(this.f5965c));
        sb.append(", pressed=");
        sb.append(this.f5966d);
        sb.append(", pressure=");
        sb.append(this.f5967e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f5968f);
        sb.append(", previousPosition=");
        sb.append((Object) e1.b.i(this.f5969g));
        sb.append(", previousPressed=");
        sb.append(this.f5970h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f5971i;
        sb.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f5973k;
        if (obj == null) {
            obj = bc.v.f1067g;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) e1.b.i(this.f5972j));
        sb.append(')');
        return sb.toString();
    }

    public n(long j3, long j6, long j10, boolean z10, float f10, long j11, long j12, boolean z11, int i10, ArrayList arrayList, long j13, long j14) {
        this(j3, j6, j10, z10, f10, j11, j12, z11, false, i10, j13);
        this.f5973k = arrayList;
        this.f5974l = j14;
    }
}
