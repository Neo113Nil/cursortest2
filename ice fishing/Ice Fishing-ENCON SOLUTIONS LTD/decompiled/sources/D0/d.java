package D0;

import p0.AbstractC1021r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final m f210a = new m();

    public final void a(Exception exc) {
        m mVar = this.f210a;
        mVar.getClass();
        AbstractC1021r.d(exc, "Exception must not be null");
        synchronized (mVar.f229a) {
            try {
                if (mVar.f231c) {
                    return;
                }
                mVar.f231c = true;
                mVar.f234f = exc;
                mVar.f230b.d(mVar);
            } finally {
            }
        }
    }
}
