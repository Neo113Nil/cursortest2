package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b56 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xdr b;

    public /* synthetic */ b56(xdr xdrVar, int i) {
        this.a = i;
        this.b = xdrVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.collect(new a56(rjcVar, 0), continuation);
                break;
            case 1:
                this.b.collect(new uql(rjcVar, 9), continuation);
                break;
            case 2:
                this.b.collect(new uql(rjcVar, 10), continuation);
                break;
            case 3:
                this.b.collect(new k4q(rjcVar, 26), continuation);
                break;
            default:
                this.b.collect(new zzs(rjcVar, 26), continuation);
                break;
        }
        return nm6.a;
    }
}
