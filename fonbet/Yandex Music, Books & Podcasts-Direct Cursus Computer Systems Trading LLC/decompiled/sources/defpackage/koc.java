package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class koc extends xci implements moc {
    public Function1 o;
    public bpc p;

    @Override // defpackage.moc
    public final void t(bpc bpcVar) {
        if (Intrinsics.d(this.p, bpcVar)) {
            return;
        }
        this.p = bpcVar;
        this.o.invoke(bpcVar);
    }
}
