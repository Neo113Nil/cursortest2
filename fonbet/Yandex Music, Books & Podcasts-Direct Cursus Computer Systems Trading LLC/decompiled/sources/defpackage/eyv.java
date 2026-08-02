package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class eyv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lyv b;

    public /* synthetic */ eyv(lyv lyvVar, int i) {
        this.a = i;
        this.b = lyvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) this.b.a.C.getValue();
                bool.getClass();
                return bool;
            case 1:
                return new wpe(this.b.a.d());
            default:
                this.b.a.r(false);
                return Unit.a;
        }
    }
}
