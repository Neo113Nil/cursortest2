package e4;

import ac.i;
import android.os.Bundle;
import bc.a0;
import bc.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import x4.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2104a = new LinkedHashSet();

    public a(l lVar) {
        lVar.k("androidx.savedstate.Restarter", this);
    }

    @Override // e4.d
    public final Bundle a() {
        Bundle e10 = a0.e((i[]) Arrays.copyOf(new i[0], 0));
        List e02 = m.e0(this.f2104a);
        e10.putStringArrayList("classes_to_restore", e02 instanceof ArrayList ? (ArrayList) e02 : new ArrayList<>(e02));
        return e10;
    }
}
