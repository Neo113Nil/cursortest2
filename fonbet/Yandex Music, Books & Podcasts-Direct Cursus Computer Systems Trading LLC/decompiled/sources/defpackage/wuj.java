package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class wuj extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ avj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wuj(avj avjVar, int i) {
        super(1);
        this.r = i;
        this.s = avjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                Map o = this.s.h.o();
                jomVar.j = o != null ? uah.o(o) : null;
                break;
            case 1:
                gld.L(this.s.p, null);
                break;
            case 2:
                cyc cycVar = (cyc) obj;
                cycVar.getClass();
                str strVar = this.s.e;
                cycVar.a = strVar.b;
                cycVar.b = strVar.a;
                break;
            default:
                rnn rnnVar = (rnn) obj;
                rnnVar.getClass();
                rnnVar.b = this.s.j();
                break;
        }
        return Unit.a;
    }
}
