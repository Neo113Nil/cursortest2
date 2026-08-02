package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sqj extends xci implements qof {
    public Function1 o;
    public long p;

    @Override // defpackage.xci
    public final boolean H0() {
        return true;
    }

    @Override // defpackage.qof
    public final void j(long j) {
        if (hqe.a(this.p, j)) {
            return;
        }
        this.o.invoke(new hqe(j));
        this.p = j;
    }
}
