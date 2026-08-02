package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e54 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o54 b;

    public /* synthetic */ e54(o54 o54Var, int i) {
        this.a = i;
        this.b = o54Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        switch (this.a) {
            case 0:
                size = this.b.d.b.size();
                break;
            default:
                size = this.b.d.b.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
