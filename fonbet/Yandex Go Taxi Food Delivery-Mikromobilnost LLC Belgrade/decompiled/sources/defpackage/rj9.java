package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.n;
import ru.yandex.taxi.common_models.net.map_object.p;
import ru.yandex.taxi.common_models.net.map_object.v;
import ru.yandex.taxi.layers.domain.links.a;

/* loaded from: classes.dex */
public final class rj9 implements xsd0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rj9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v vVar = (v) wsd0Var.getAction();
                nj9 nj9Var = (nj9) ((oj9) obj).a.peekLast();
                if (nj9Var != null) {
                    String str = vVar.c;
                    nj9Var.a(new psa(new tsa(vVar.a, vVar.b)));
                }
                return zy11Var;
            case 1:
                String str2 = ((p) wsd0Var.getAction()).a;
                if (str2.length() > 0) {
                    ((a60) ((y50) obj)).c(str2, v770.r);
                }
                return zy11Var;
            default:
                String str3 = ((n) wsd0Var.getAction()).a;
                return ((a) obj).c.emit(new a001(str3), (ContinuationImpl) continuation);
        }
    }
}
