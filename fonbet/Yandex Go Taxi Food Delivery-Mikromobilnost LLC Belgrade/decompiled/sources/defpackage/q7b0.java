package defpackage;

import android.location.Location;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class q7b0 {
    public final acz a;

    public q7b0(acz aczVar) {
        this.a = aczVar;
    }

    public final List a(d0l0 d0l0Var) {
        zzk0 zzk0Var = d0l0.Companion;
        List d = d0l0Var.d(false, false);
        if (!d.isEmpty()) {
            return d;
        }
        Location a = this.a.a();
        if (a == null) {
            return EmptyList.a;
        }
        zzs.Companion.getClass();
        return Collections.singletonList(uzs.b(a));
    }
}
