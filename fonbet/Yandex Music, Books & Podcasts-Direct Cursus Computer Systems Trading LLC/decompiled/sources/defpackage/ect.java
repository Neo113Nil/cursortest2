package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ect implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mct b;

    public /* synthetic */ ect(mct mctVar, int i) {
        this.a = i;
        this.b = mctVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float e;
        switch (this.a) {
            case 0:
                e = this.b.e.e();
                break;
            default:
                e = this.b.a();
                break;
        }
        return Float.valueOf(e);
    }
}
