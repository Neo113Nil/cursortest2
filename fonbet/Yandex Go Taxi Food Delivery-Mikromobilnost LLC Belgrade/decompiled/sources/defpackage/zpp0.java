package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.plus.repository.e;

/* loaded from: classes9.dex */
public final class zpp0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ zpp0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                r0 r0Var = eVar.e.a;
                Iterable iterable = (Iterable) r0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (!jl40.l(((m5c) obj2).b(), str)) {
                        arrayList.add(obj2);
                    }
                }
                r0Var.m(null, a.N0(arrayList));
                break;
            default:
                eVar.c.a.l((List) obj);
                break;
        }
        return zy11Var;
    }
}
