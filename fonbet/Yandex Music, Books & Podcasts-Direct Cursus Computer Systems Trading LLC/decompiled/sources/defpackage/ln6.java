package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ln6 extends oj implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((pc5) this.receiver).d();
                break;
            case 1:
                suc.c((suc) this.receiver);
                break;
            case 2:
                ((esi) this.receiver).d();
                break;
            default:
                suc.c((suc) this.receiver);
                break;
        }
        return Unit.a;
    }
}
