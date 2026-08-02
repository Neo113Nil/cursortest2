package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ts4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys4 b;

    public /* synthetic */ ts4(ys4 ys4Var, int i) {
        this.a = i;
        this.b = ys4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        switch (this.a) {
            case 0:
                size = this.b.b.a.size();
                break;
            default:
                size = this.b.b.a.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
