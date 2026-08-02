package defpackage;

import com.yandex.go.superapp.discovery.map.impl.navigation.c;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.masstransit.trains.checkout.a;
import ru.yandex.taxi.masstransit.trains.checkout.r;

/* loaded from: classes6.dex */
public final class ta40 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ta40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    /* JADX WARN: Type inference failed for: r14v13, types: [T, m950] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                gb40 gb40Var = (gb40) obj4;
                Object b = ((a) obj5).b(new hd40((db40) pair.getFirst(), gb40Var, (String) pair.getSecond()), (r) obj6, (ab40) obj3, gb40Var, (tse) obj2, continuation);
                return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11Var;
            default:
                c cVar = (c) obj6;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                if (((Boolean) obj).booleanValue()) {
                    m950 m950Var = (m950) ref$ObjectRef.element;
                    m950 m950Var2 = m950Var;
                    if (m950Var == null) {
                        ?? r14 = (m950) ((sls) obj4).invoke();
                        ref$ObjectRef.element = r14;
                        m950Var2 = r14;
                    }
                    if (!cVar.v(m950Var2)) {
                        cVar.A(m950Var2, obj3, (sy60) obj2);
                    }
                } else {
                    m950 m950Var3 = (m950) ref$ObjectRef.element;
                    if (m950Var3 != null) {
                        cVar.j(new epb(m950Var3));
                    }
                }
                return zy11Var;
        }
    }
}
