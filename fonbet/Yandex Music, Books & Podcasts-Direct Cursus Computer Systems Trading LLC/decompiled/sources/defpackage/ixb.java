package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ixb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5 b;

    public /* synthetic */ ixb(j5 j5Var, int i) {
        this.a = i;
        this.b = j5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((Function0) this.b.b).invoke();
            default:
                return this.b.a;
        }
    }
}
