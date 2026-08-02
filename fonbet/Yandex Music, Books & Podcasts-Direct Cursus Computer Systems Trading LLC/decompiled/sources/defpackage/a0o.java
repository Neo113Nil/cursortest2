package defpackage;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a0o {
    public final dsc a;
    public final yde b;
    public final long c;
    public final List d;
    public final whn e;

    public a0o(dsc dscVar, List list, ebp ebpVar, List list2) {
        vq1.v(!list.isEmpty());
        this.a = dscVar;
        this.b = yde.v(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.e = ebpVar.a(this);
        long j = ebpVar.c;
        long j2 = ebpVar.b;
        int i = dvt.a;
        this.c = dvt.g0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract o97 b();

    public abstract whn d();
}
