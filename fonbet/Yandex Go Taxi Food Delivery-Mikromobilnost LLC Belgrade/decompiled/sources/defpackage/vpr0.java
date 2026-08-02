package defpackage;

import com.yandex.go.rida.header.data.SharedRidaHeaderStateHolderImpl$special$$inlined$flatMapLatest$1;
import com.yandex.go.rida.header.data.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class vpr0 {
    public final r0 a;

    public vpr0(c cVar, tt2 tt2Var) {
        r0 c = bvf0.c(Collections.singletonList(cVar));
        this.a = c;
        tpr t = e.t(e.X(e.t(new com.yandex.go.rida.header.data.e(c)), new SharedRidaHeaderStateHolderImpl$special$$inlined$flatMapLatest$1(3, null)));
        tt2Var.getClass();
        e.F(t, uyj.a);
    }

    public final void a(s5k0 s5k0Var) {
        r0 r0Var;
        Object value;
        List list;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            list = (List) value;
            if (!list.contains(s5k0Var)) {
                list = a.o0(list, s5k0Var);
            }
        } while (!r0Var.k(value, list));
    }

    public final void b(s5k0 s5k0Var) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!jl40.l((s5k0) obj, s5k0Var)) {
                    arrayList.add(obj);
                }
            }
        } while (!r0Var.k(value, arrayList));
    }
}
