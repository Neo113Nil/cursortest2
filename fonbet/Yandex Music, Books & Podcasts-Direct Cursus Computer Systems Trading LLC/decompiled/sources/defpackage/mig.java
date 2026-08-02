package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
public class mig implements nig {
    public final Object a;

    public mig(Object obj) {
        this.a = obj;
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
    public final Object get() {
        return this.a;
    }

    @Override // defpackage.nig
    public int h() {
        return 1;
    }

    @Override // defpackage.nig
    public final crn i() {
        return null;
    }

    @Override // defpackage.nig
    public final Object j() {
        return this.a;
    }

    @Override // defpackage.nig
    public final void g(Object obj) {
    }

    @Override // defpackage.nig
    public final nig k(ReferenceQueue referenceQueue, Object obj, crn crnVar) {
        return this;
    }
}
