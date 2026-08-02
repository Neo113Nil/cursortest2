package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.delivery.edit.b;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;

/* loaded from: classes5.dex */
public final class v1f0 extends fy4 {
    public final g701 c;
    public final s1f0 d;
    public final String e;

    public v1f0(g701 g701Var, e eVar, b bVar, ov7 ov7Var, p1b p1bVar, uy31 uy31Var, s1f0 s1f0Var, i iVar, v6s v6sVar) {
        super(uy31Var.i, eVar, bVar, ov7Var, p1bVar, iVar, v6sVar);
        this.c = g701Var;
        this.d = s1f0Var;
        this.e = "primary-action-buttons-key";
    }

    @Override // defpackage.fy4
    public final ztb b(gri griVar, boolean z, boolean z2, Set set, int i, Map map) {
        Collection collection;
        boolean contains = set.contains(this.c.a);
        vwa0 vwa0Var = griVar.k;
        if (vwa0Var != null) {
            p1b p1bVar = this.a;
            p1bVar.getClass();
            String str = vwa0Var.b;
            String str2 = vwa0Var.e;
            String str3 = vwa0Var.f;
            if (str3 == null) {
                str3 = ((l7x0) p1bVar.a).a(vwa0Var.g);
            }
            String str4 = str3;
            String str5 = vwa0Var.b;
            String str6 = vwa0Var.e;
            if (str6 == null) {
                str6 = "";
            }
            collection = Collections.singletonList(new mtb(str, str2, str4, null, g8e.p(str5, " ", str6), null, null, false, false, jtb.a, 1992));
        } else {
            collection = EmptyList.a;
        }
        ArrayList m0 = a.m0(this.a.i(griVar.d, z, z2, contains, i, map), collection);
        boolean z3 = !m0.isEmpty();
        r0 r0Var = this.d.a;
        Boolean valueOf = Boolean.valueOf(z3);
        r0Var.getClass();
        r0Var.m(null, valueOf);
        return new ztb(m0);
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.e;
    }
}
