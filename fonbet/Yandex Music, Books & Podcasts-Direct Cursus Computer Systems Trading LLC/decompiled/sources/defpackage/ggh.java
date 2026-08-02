package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ggh implements pjc {
    public final /* synthetic */ pjc a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public ggh(pjc pjcVar, boolean z, boolean z2) {
        this.a = pjcVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new fgh(rjcVar, this.b, this.c), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
