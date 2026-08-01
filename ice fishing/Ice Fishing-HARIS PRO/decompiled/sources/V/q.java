package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f1229a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f1230b;

    /* renamed from: c, reason: collision with root package name */
    public t f1231c;

    /* renamed from: d, reason: collision with root package name */
    public t f1232d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1233f;

    public q(t tVar) {
        this.f1230b = tVar;
        this.f1231c = tVar;
    }

    public final void a() {
        this.f1229a = 1;
        this.f1231c = this.f1230b;
        this.f1233f = 0;
    }

    public final boolean b() {
        W.a c2 = this.f1231c.f1243b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.f839d).get(a2 + c2.f836a) == 0) || this.e == 65039;
    }
}
