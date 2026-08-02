package N2;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements l3.c, l3.e, l3.d, l3.b {

    /* renamed from: n, reason: collision with root package name */
    public final CountDownLatch f1929n;

    @Override // l3.e
    public void b(Object obj) {
        this.f1929n.countDown();
    }

    @Override // l3.b
    public void c() {
        this.f1929n.countDown();
    }

    @Override // l3.d
    public void d(Exception exc) {
        this.f1929n.countDown();
    }

    @Override // l3.c
    public void r(l3.m mVar) {
        this.f1929n.countDown();
    }

    public /* synthetic */ i() {
        this.f1929n = new CountDownLatch(1);
    }
}
