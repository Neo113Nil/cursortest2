package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class s4j0 {
    public final a a;
    public final ImmutableList b;
    public final long c;
    public final List w;
    public final w6i0 x;

    public s4j0(a aVar, List list, c8q0 c8q0Var, List list2) {
        d6z.l(!list.isEmpty());
        this.a = aVar;
        this.b = ImmutableList.l(list);
        this.w = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.x = c8q0Var.a(this);
        long j = c8q0Var.c;
        long j2 = c8q0Var.b;
        int i = tw21.a;
        this.c = tw21.e0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract pgg b();

    public abstract w6i0 c();
}
