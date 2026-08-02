package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class l13 {
    public final qdc a;
    public final Set b;

    public l13(qdc qdcVar, LinkedHashSet linkedHashSet) {
        this.a = qdcVar;
        this.b = linkedHashSet;
    }

    public final Object a(bdt bdtVar) {
        return this.a.D(bdtVar, this, this.b);
    }

    public final jyr b(bdt bdtVar, boolean z) {
        if (z) {
            this.a.q(bdtVar);
        }
        return btf.b(new ap1(9, this, bdtVar));
    }
}
