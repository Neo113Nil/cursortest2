package defpackage;

import com.google.common.cache.b;

/* loaded from: classes3.dex */
public class lig extends shg {
    public final Object a;
    public final int b;
    public final crn c;
    public volatile nig d = b.w;

    public lig(Object obj, int i, crn crnVar) {
        this.a = obj;
        this.b = i;
        this.c = crnVar;
    }

    @Override // defpackage.shg, defpackage.crn
    public final void b(nig nigVar) {
        this.d = nigVar;
    }

    @Override // defpackage.shg, defpackage.crn
    public final nig g() {
        return this.d;
    }

    @Override // defpackage.shg, defpackage.crn
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.shg, defpackage.crn
    public final crn getNext() {
        return this.c;
    }

    @Override // defpackage.shg, defpackage.crn
    public final int l() {
        return this.b;
    }
}
