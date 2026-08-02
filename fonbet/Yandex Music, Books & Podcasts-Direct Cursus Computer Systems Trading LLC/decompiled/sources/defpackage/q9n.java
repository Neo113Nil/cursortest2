package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class q9n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q9n(int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            case 1:
                this.b.invoke(Integer.valueOf(this.c));
                break;
            default:
                this.b.invoke(Integer.valueOf(this.c));
                break;
        }
        return Unit.a;
    }
}
