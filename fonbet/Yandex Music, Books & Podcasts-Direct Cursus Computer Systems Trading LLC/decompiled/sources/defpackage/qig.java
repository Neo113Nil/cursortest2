package defpackage;

import com.google.common.cache.b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class qig extends WeakReference implements crn {
    public final int a;
    public final crn b;
    public volatile nig c;

    public qig(ReferenceQueue referenceQueue, Object obj, int i, crn crnVar) {
        super(obj, referenceQueue);
        this.c = b.w;
        this.a = i;
        this.b = crnVar;
    }

    public crn a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.crn
    public final void b(nig nigVar) {
        this.c = nigVar;
    }

    public void c(crn crnVar) {
        throw new UnsupportedOperationException();
    }

    public void d(crn crnVar) {
        throw new UnsupportedOperationException();
    }

    public void e(crn crnVar) {
        throw new UnsupportedOperationException();
    }

    public crn f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.crn
    public final nig g() {
        return this.c;
    }

    @Override // defpackage.crn
    public final Object getKey() {
        return get();
    }

    @Override // defpackage.crn
    public final crn getNext() {
        return this.b;
    }

    public crn h() {
        throw new UnsupportedOperationException();
    }

    public void i(crn crnVar) {
        throw new UnsupportedOperationException();
    }

    public crn k() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.crn
    public final int l() {
        return this.a;
    }

    public long n() {
        throw new UnsupportedOperationException();
    }

    public void o(long j) {
        throw new UnsupportedOperationException();
    }

    public long p() {
        throw new UnsupportedOperationException();
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
