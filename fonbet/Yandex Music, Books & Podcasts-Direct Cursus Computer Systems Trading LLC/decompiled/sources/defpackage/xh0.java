package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xh0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jhm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(jhm jhmVar, int i) {
        super(1);
        this.r = i;
        this.s = jhmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                wof Q = ((wof) obj).Q();
                Q.getClass();
                this.s.v(Q);
                break;
            case 1:
                hqe hqeVar = new hqe(((hqe) obj).a);
                jhm jhmVar = this.s;
                jhmVar.m28setPopupContentSizefhxjrPA(hqeVar);
                jhmVar.w();
                break;
            default:
                Function0 function0 = (Function0) obj;
                jhm jhmVar2 = this.s;
                Handler handler = jhmVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = jhmVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ti(6, function0));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
