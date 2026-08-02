package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.b;

/* loaded from: classes5.dex */
public final class vvq implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ vvq(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                Object a = b.a(bVar, continuation);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            default:
                Object a2 = b.a(bVar, continuation);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11Var;
        }
    }
}
