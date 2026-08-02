package Q2;

import j3.AbstractBinderC4615d;
import j3.C4619h;
import java.lang.ref.WeakReference;

/* renamed from: Q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0371p extends AbstractBinderC4615d {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f2584n;

    public BinderC0371p(C0373s c0373s) {
        this.f2584n = new WeakReference(c0373s);
    }

    @Override // j3.InterfaceC4616e
    public final void M1(C4619h c4619h) {
        C0373s c0373s = (C0373s) this.f2584n.get();
        if (c0373s == null) {
            return;
        }
        C0368m c0368m = new C0368m(c0373s, c0373s, c4619h);
        HandlerC0374t handlerC0374t = c0373s.f2601n.f2644x;
        handlerC0374t.sendMessage(handlerC0374t.obtainMessage(1, c0368m));
    }
}
