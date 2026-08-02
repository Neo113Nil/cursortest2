package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.az60;
import defpackage.c7z;
import defpackage.cd0;
import defpackage.cz60;
import defpackage.ez60;
import defpackage.g92;
import defpackage.gau;
import defpackage.jqr;
import defpackage.jz60;
import defpackage.k7d0;
import defpackage.k7z;
import defpackage.mth;
import defpackage.n1f;
import defpackage.ncb1;
import defpackage.p1b;
import defpackage.r1s;
import defpackage.s1r;
import defpackage.sue0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.ui7;
import defpackage.uxd;
import defpackage.v2u;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wbz;
import defpackage.wy60;
import defpackage.xrr;
import defpackage.xy60;
import defpackage.ymu;
import defpackage.yy60;
import defpackage.z2u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.model.GroupType;

/* loaded from: classes5.dex */
public final class d implements wbz {
    public final TimestampSelector a;
    public final jz60 b;
    public final ru.yandex.taxi.locationsdk.core.input_controller.internal.b c;
    public final p1b d;
    public final r1s e;
    public final xrr f;

    public d(TimestampSelector timestampSelector, c7z c7zVar, jz60 jz60Var, ru.yandex.taxi.locationsdk.core.input_controller.internal.b bVar) {
        Object uxdVar;
        this.a = timestampSelector;
        this.b = jz60Var;
        this.c = bVar;
        az60 az60Var = jz60Var.a;
        Pair pair = new Pair(new v2u(az60Var.a, GroupType.Primary), az60Var);
        ArrayList<az60> arrayList = jz60Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (az60 az60Var2 : arrayList) {
            arrayList2.add(new Pair(new v2u(az60Var2.a, GroupType.Alternative), az60Var2));
        }
        ArrayList<cz60> arrayList3 = jz60Var.d;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        for (cz60 cz60Var : arrayList3) {
            arrayList4.add(new Pair(new v2u(cz60Var.a, GroupType.Reference), cz60Var));
        }
        r1s r1sVar = new r1s(23, pair, arrayList2, arrayList4);
        z2u z2uVar = new z2u(this.a, c7zVar);
        this.b.getClass();
        this.d = new p1b(z2uVar, r1sVar);
        yy60 yy60Var = this.b.c;
        if (yy60Var instanceof wy60) {
            uxdVar = new ymu(3, ((wy60) yy60Var).a, this.a);
        } else {
            if (!yy60Var.equals(xy60.a)) {
                w511.b();
                throw null;
            }
            uxdVar = new uxd(r1sVar);
        }
        this.e = new r1s(16, uxdVar, r1sVar, new sue0(18, this.a));
        jz60 jz60Var2 = this.b;
        this.f = new xrr(jz60Var2.a.a, ncb1.b(jz60Var2), ncb1.c(this.b), this.b.e);
    }

    @Override // defpackage.wbz
    public final k7z a() {
        return null;
    }

    @Override // defpackage.wbz
    public final tpr b() {
        jz60 jz60Var = this.b;
        boolean z = jz60Var.f;
        ru.yandex.taxi.locationsdk.core.input_controller.internal.b bVar = this.c;
        o d = z ? bVar.d(c(), v4r0.h(v4r0.h(jz60Var.a.a, ncb1.b(jz60Var)), ncb1.c(jz60Var))) : bVar.c(c());
        p1b p1bVar = this.d;
        r1s r1sVar = (r1s) p1bVar.b;
        ArrayList m0 = kotlin.collections.a.m0((ArrayList) r1sVar.w, kotlin.collections.a.o0((ArrayList) r1sVar.c, (Pair) r1sVar.b));
        ArrayList arrayList = new ArrayList(tcc.n(m0, 10));
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            v2u v2uVar = (v2u) pair.getFirst();
            ez60 ez60Var = (ez60) pair.getSecond();
            z2u z2uVar = (z2u) p1bVar.a;
            arrayList.add(new cd0(22, e.X(new j0(null, ru.yandex.taxi.locationsdk.core.utils.b.a(new n1f(25, d, ez60Var), z2uVar.a), new GroupStateSource$createGroupStateFlow$2(z2uVar, ez60Var, null)), new GroupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1(null, z2uVar)), v2uVar));
        }
        int i = 3;
        return ru.yandex.taxi.locationsdk.common_utils.a.c(new jqr(new mth(new j0(null, new jqr(new m0(new ui7((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), 1), ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.utils.a.a(0L), new CombinedInputStateSource$createCombinedInputStateFlow$1(3, null)), new ProcessorImpl$startProcessing$1(this, null), i), new ProcessorImpl$toStateUpdateFlow$1(this, null)), 6), new ProcessorImpl$startProcessing$2(this, null), i), new k7d0(27, this));
    }

    public final tpr c() {
        xrr xrrVar = this.f;
        if (!xrrVar.b) {
            return new g92(2, (LinkedHashMap) xrrVar.y);
        }
        return new n1f(28, e.t(e.r((r0) xrrVar.A, new s1r(7, new gau(17, xrrVar)))), xrrVar);
    }
}
