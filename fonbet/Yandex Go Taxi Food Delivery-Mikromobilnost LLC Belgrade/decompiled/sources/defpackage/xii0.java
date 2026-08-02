package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class xii0 implements f2m0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public xii0(g2m0 g2m0Var) {
        g2m0Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.f2m0
    public final Bundle a() {
        Bundle g = wwg.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        List J0 = a.J0(this.a);
        g.putStringArrayList("classes_to_restore", J0 instanceof ArrayList ? (ArrayList) J0 : new ArrayList<>(J0));
        return g;
    }

    public final void b(String str) {
        this.a.add(str);
    }
}
