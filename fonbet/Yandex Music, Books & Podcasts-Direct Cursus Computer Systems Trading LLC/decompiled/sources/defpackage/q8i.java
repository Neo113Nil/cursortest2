package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class q8i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8i b;

    public /* synthetic */ q8i(l8i l8iVar, int i) {
        this.a = i;
        this.b = l8iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                this.b.c(false);
                break;
        }
        return Unit.a;
    }
}
