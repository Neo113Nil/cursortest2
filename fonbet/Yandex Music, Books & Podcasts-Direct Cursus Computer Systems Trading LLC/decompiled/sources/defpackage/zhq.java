package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "T", "ex", ""}, k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class zhq extends uif implements Function1<Throwable, Unit> {
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ biq s;
    public final /* synthetic */ Function2 t = C0958qkq.r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhq(Function1 function1, biq biqVar) {
        super(1);
        this.r = function1;
        this.s = biqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        Throwable th = (Throwable) obj;
        ((pkq) this.r).invoke(th);
        zi3 zi3Var = this.s.c;
        zi3Var.o(th, false);
        do {
            Object b = gd4.b(zi3Var.k());
            if (b == null) {
                unit = null;
            } else {
                C0958qkq.r.invoke(b, th);
                unit = Unit.a;
            }
        } while (unit != null);
        return Unit.a;
    }
}
