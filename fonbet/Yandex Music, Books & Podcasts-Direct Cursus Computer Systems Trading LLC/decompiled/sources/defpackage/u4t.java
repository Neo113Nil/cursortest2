package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class u4t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5t b;

    public /* synthetic */ u4t(b5t b5tVar, int i) {
        this.a = i;
        this.b = b5tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                th.getClass();
                this.b.i.Q(th);
                break;
            default:
                th.getClass();
                this.b.i.Q(th);
                break;
        }
        return Unit.a;
    }
}
