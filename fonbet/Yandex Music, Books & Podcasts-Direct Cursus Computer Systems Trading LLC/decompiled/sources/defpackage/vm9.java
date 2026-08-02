package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class vm9 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ en9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm9(en9 en9Var, int i) {
        super(0);
        this.r = i;
        this.s = en9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return (tc9) this.s.b;
            default:
                vm9 vm9Var = new vm9(this.s, 0);
                b2c b2cVar = new b2c();
                btf.b(vm9Var);
                return b2cVar;
        }
    }
}
