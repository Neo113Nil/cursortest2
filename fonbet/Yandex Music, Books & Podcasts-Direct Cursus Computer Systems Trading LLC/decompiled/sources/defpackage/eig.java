package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public class eig extends SoftReference implements nig {
    public final crn a;

    public eig(ReferenceQueue referenceQueue, Object obj, crn crnVar) {
        super(obj, referenceQueue);
        this.a = crnVar;
    }

    @Override // defpackage.nig
    public final boolean b() {
        return true;
    }

    @Override // defpackage.nig
    public final boolean f() {
        return false;
    }

    @Override // defpackage.nig
    public int h() {
        return 1;
    }

    @Override // defpackage.nig
    public final crn i() {
        return this.a;
    }

    @Override // defpackage.nig
    public final Object j() {
        return get();
    }

    @Override // defpackage.nig
    public nig k(ReferenceQueue referenceQueue, Object obj, crn crnVar) {
        return new eig(referenceQueue, obj, crnVar);
    }

    @Override // defpackage.nig
    public final void g(Object obj) {
    }
}
