package q3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f5772a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f5773b;

    /* renamed from: c, reason: collision with root package name */
    public s f5774c;

    /* renamed from: d, reason: collision with root package name */
    public s f5775d;

    /* renamed from: e, reason: collision with root package name */
    public int f5776e;

    /* renamed from: f, reason: collision with root package name */
    public int f5777f;

    public p(s sVar) {
        this.f5773b = sVar;
        this.f5774c = sVar;
    }

    public final void a() {
        this.f5772a = 1;
        this.f5774c = this.f5773b;
        this.f5777f = 0;
    }

    public final boolean b() {
        r3.a b2 = this.f5774c.f5791b.b();
        int a6 = b2.a(6);
        return !(a6 == 0 || ((ByteBuffer) b2.f1313j).get(a6 + b2.f1310g) == 0) || this.f5776e == 65039;
    }
}
