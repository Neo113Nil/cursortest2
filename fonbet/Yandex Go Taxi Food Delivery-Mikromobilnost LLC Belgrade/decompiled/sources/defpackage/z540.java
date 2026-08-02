package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class z540 {
    public final tdu a;
    public final List b;
    public final kne0 c;

    public /* synthetic */ z540(tdu tduVar, kne0 kne0Var, int i) {
        this((i & 1) != 0 ? new tdu(null, null, null, null, 15) : tduVar, EmptyList.a, (i & 4) != 0 ? null : kne0Var);
    }

    public z540(tdu tduVar, List list, kne0 kne0Var) {
        this.a = tduVar;
        this.b = list;
        this.c = kne0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z540() {
        this((tdu) null, (kne0) (0 == true ? 1 : 0), 7);
    }
}
