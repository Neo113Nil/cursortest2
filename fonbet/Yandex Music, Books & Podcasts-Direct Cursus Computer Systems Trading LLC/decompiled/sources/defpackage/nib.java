package defpackage;

import kotlin.Unit;
import kotlinx.coroutines.c;

/* loaded from: classes5.dex */
public final class nib extends pib {
    public final zt3 c;
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nib(c cVar, long j, zt3 zt3Var) {
        super(j);
        this.d = cVar;
        this.c = zt3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.E(this.d, Unit.a);
    }

    @Override // defpackage.pib
    public final String toString() {
        return super.toString() + this.c;
    }
}
