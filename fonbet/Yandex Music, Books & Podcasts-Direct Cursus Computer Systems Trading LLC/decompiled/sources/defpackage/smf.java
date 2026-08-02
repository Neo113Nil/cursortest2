package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class smf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xmf b;

    public /* synthetic */ smf(xmf xmfVar, int i) {
        this.a = i;
        this.b = xmfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.g = null;
                break;
            default:
                this.b.f = null;
                break;
        }
        return Unit.a;
    }
}
