package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class lai implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mai b;

    public /* synthetic */ lai(mai maiVar, int i) {
        this.a = i;
        this.b = maiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mai maiVar = this.b;
                maiVar.y(true);
                maiVar.z(true);
                break;
            default:
                mai maiVar2 = this.b;
                maiVar2.y(false);
                maiVar2.z(false);
                maiVar2.dismissAllowingStateLoss();
                break;
        }
        return Unit.a;
    }
}
