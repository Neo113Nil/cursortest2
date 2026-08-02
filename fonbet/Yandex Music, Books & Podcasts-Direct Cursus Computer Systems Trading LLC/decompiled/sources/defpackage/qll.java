package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qll implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ wor b;

    public /* synthetic */ qll(wor worVar, int i) {
        this.a = i;
        this.b = worVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.collect(new j7l(rjcVar, 18), continuation);
                break;
            case 1:
                this.b.collect(new j7l(rjcVar, 21), continuation);
                break;
            default:
                this.b.collect(new bnu(rjcVar, 22), continuation);
                break;
        }
        return nm6.a;
    }
}
