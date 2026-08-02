package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import retrofit2.Call;

/* loaded from: classes5.dex */
public final class dif extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Call s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dif(Call call, int i) {
        super(1);
        this.r = i;
        this.s = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.cancel();
                break;
            default:
                this.s.cancel();
                break;
        }
        return Unit.a;
    }
}
