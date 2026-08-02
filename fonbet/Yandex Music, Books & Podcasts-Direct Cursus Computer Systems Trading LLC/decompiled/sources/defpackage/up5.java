package defpackage;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class up5 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ CancellationSignal s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up5(CancellationSignal cancellationSignal, int i) {
        super(1);
        this.r = i;
        this.s = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.s.cancel();
                }
                break;
            case 1:
                this.s.cancel();
                break;
            default:
                this.s.cancel();
                break;
        }
        return Unit.a;
    }
}
