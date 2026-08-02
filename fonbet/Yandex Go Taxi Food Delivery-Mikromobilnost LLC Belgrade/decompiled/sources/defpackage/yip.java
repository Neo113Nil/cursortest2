package defpackage;

import com.yandex.go.navigator.favorites.f;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class yip implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ yip(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                Object b = f.b(fVar, (ugp) obj, continuation);
                return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11Var;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fVar.e.l(null);
                Iterator it = fVar.l.entrySet().iterator();
                while (it.hasNext()) {
                    ((a4c0) ((Map.Entry) it.next()).getValue()).a.i(!booleanValue);
                }
                return zy11Var;
        }
    }
}
