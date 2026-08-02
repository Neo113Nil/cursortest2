package defpackage;

import android.media.AudioManager;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class uy1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ xy1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy1(xy1 xy1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = xy1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new uy1(this.k, continuation, 0);
            default:
                return new uy1(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((uy1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((uy1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        int i = this.j;
        xy1 xy1Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ex1 ex1Var = xy1Var.a;
                int i2 = 80;
                if (!ex1Var.d) {
                    try {
                        r7o r7oVar = z7o.b;
                        Method method = (Method) ex1Var.c.getValue();
                        Object invoke = method != null ? method.invoke((AudioManager) ex1Var.b.getValue(), 3) : null;
                        Integer num = invoke instanceof Integer ? (Integer) invoke : null;
                        t7oVar = Integer.valueOf(num != null ? num.intValue() : 80);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        ssg.a(6, "HeadphonesDelayProvider", "Got an error while trying to receive output latency", a);
                        ex1Var.d = true;
                    }
                    Integer num2 = (Integer) (t7oVar instanceof t7o ? null : t7oVar);
                    if (num2 != null) {
                        i2 = num2.intValue();
                    }
                }
                return new Integer(i2);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                xy1Var.e.set(true);
                return Unit.a;
        }
    }
}
