package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class qvb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6h b;

    public /* synthetic */ qvb(c6h c6hVar, int i) {
        this.a = i;
        this.b = c6hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            case 1:
                this.b.r();
                break;
            default:
                this.b.h();
                break;
        }
        return Unit.a;
    }
}
