package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class j32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j32(Function1 function1, boolean z, int i) {
        this.a = i;
        this.b = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.valueOf(!this.c));
                break;
            case 1:
                this.b.invoke(Boolean.valueOf(!this.c));
                break;
            case 2:
                this.b.invoke(Boolean.valueOf(!this.c));
                break;
            default:
                this.b.invoke(Boolean.valueOf(this.c));
                break;
        }
        return Unit.a;
    }
}
