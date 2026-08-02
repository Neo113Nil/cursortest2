package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.network.http.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.k;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.a;

/* loaded from: classes10.dex */
public final class tvu implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ tvu(tpr tprVar, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = ((k) tprVar).collect(new b(vprVar, (fc70) obj3, (c) obj2, (Ref$ObjectRef) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new a(vprVar, (fl51) obj3, (hwy0) obj2, (fl51) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
