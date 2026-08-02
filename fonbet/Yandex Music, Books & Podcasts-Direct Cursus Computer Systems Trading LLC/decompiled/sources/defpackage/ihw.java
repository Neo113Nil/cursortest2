package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ihw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bmw b;

    public /* synthetic */ ihw(bmw bmwVar, int i) {
        this.a = i;
        this.b = bmwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                th.getClass();
                this.b.onError(th);
                break;
            case 1:
                th.getClass();
                this.b.onError(th);
                break;
            default:
                th.getClass();
                this.b.onError(th);
                break;
        }
        return Unit.a;
    }
}
