package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class pua implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zwa b;

    public /* synthetic */ pua(zwa zwaVar, int i) {
        this.a = i;
        this.b = zwaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.G();
                break;
            case 1:
                this.b.G();
                break;
            default:
                this.b.G();
                break;
        }
        return Unit.a;
    }
}
