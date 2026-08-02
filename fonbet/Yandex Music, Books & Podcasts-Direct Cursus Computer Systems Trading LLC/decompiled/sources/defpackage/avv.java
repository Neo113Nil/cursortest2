package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class avv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cvv b;

    public /* synthetic */ avv(cvv cvvVar, int i) {
        this.a = i;
        this.b = cvvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
        return Unit.a;
    }
}
