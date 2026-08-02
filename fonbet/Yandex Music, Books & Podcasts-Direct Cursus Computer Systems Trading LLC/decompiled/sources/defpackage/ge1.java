package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ge1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ he1 b;

    public /* synthetic */ ge1(he1 he1Var, int i) {
        this.a = i;
        this.b = he1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return btf.b(new ge1(this.b, 1));
            default:
                return new ee1(0, this.b);
        }
    }
}
