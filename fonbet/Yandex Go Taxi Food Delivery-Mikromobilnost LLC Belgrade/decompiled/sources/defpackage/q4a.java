package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final class q4a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4a b;

    public /* synthetic */ q4a(r4a r4aVar, int i) {
        this.a = i;
        this.b = r4aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        r4a r4aVar = this.b;
        switch (i) {
            case 0:
                b4a b4aVar = (b4a) obj;
                if (jl40.l(b4aVar, z3a.a)) {
                    ((j4a) r4aVar.C.b).r(new ew9(18));
                    return zy11Var;
                }
                if (b4aVar instanceof a4a) {
                    ((j4a) r4aVar.C.b).r(new h0(((a4a) b4aVar).a, 27));
                    return zy11Var;
                }
                if (jl40.l(b4aVar, y3a.a)) {
                    return zy11Var;
                }
                w511.b();
                return null;
            default:
                b bVar = (b) obj;
                if (bVar != null) {
                    cyx cyxVar = r4aVar.A;
                    kdx kdxVar = new kdx();
                    kdxVar.b("filter", bVar);
                    cyxVar.b(new byx(Screen.MULTIORDER, new c430(Mode.CHARGERS, (b) null, new q6e("chargers", kdxVar.a()))));
                } else {
                    r4aVar.A.b(new byx(Screen.MULTIORDER, new c430(Mode.CHARGERS, (b) null, (un0) null)));
                }
                return zy11Var;
        }
    }
}
