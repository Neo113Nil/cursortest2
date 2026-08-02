package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class cfv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cfv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new a6p(20, (jvu) this.b);
            case 1:
                return ((dov) this.b).getViewModelStore();
            case 2:
                return new a6p(21, (jvu) this.b);
            case 3:
                return ((v0w) this.b).getViewModelStore();
            default:
                return new a6p(22, (u0w) this.b);
        }
    }
}
