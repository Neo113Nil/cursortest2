package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class qxa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ txa b;

    public /* synthetic */ qxa(txa txaVar, int i) {
        this.a = i;
        this.b = txaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.h();
                break;
            default:
                this.b.g();
                break;
        }
        return Unit.a;
    }
}
