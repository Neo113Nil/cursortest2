package defpackage;

import com.yandex.go.payments.notifications.a;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class qna0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ qna0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                Object d = a.d(aVar, (List) obj, aVar.k, continuation);
                return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11Var;
            default:
                Object d2 = a.d(aVar, (List) obj, aVar.l, continuation);
                return d2 == CoroutineSingletons.COROUTINE_SUSPENDED ? d2 : zy11Var;
        }
    }
}
