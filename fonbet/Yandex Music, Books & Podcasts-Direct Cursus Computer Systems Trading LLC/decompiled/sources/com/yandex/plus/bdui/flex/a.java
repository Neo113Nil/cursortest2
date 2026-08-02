package com.yandex.plus.bdui.flex;

import android.view.ViewGroup;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.bdui.plus.scenario.f;
import com.yandex.plus.bdui.plus.scenario.j;
import com.yandex.plus.bdui.query.e;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.TarifficatorBduiScenarioActivity;
import defpackage.f0q;
import defpackage.jun;
import defpackage.lnt;
import defpackage.md;
import defpackage.o3a;
import defpackage.pg;
import defpackage.q2a;
import defpackage.reg;
import defpackage.t5a;
import defpackage.xqn;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements com.yandex.plus.bdui.a {
    public final o3a a;
    public final com.yandex.plus.bdui.flex.utils.b b;
    public final f c;
    public e d;

    public a(o3a o3aVar, com.yandex.plus.bdui.flex.utils.b bVar, j jVar, f fVar) {
        this.a = o3aVar;
        this.b = bVar;
        this.c = fVar;
        xqn xqnVar = new xqn();
        b bVar2 = new b(bVar, new p(jVar, new n(27, this, xqnVar)));
        xqnVar.a = bVar2;
        ((ArrayList) o3aVar.y.b).add(bVar2);
    }

    @Override // com.yandex.plus.bdui.a
    public final void a(e eVar, com.yandex.plus.bdui.document.e eVar2) {
        o3a.i(this.a, new t5a(eVar.a, eVar.b, eVar.c), eVar2 != null ? this.b.b(eVar2) : null);
    }

    @Override // com.yandex.plus.bdui.query.f
    public final void b(e eVar) {
        h(eVar);
    }

    @Override // com.yandex.plus.bdui.a
    public final com.yandex.plus.bdui.action.a c(com.yandex.plus.bdui.content.a aVar) {
        aVar.getClass();
        return com.yandex.plus.bdui.flex.utils.b.f(new lnt(new q2a(new com.yandex.plus.bdui.flex.content.a(aVar), null, f0q.b, null, null, null)));
    }

    @Override // com.yandex.plus.bdui.a
    public final com.yandex.plus.bdui.action.a d(e eVar, boolean z, com.yandex.plus.bdui.document.e eVar2) {
        eVar.getClass();
        return com.yandex.plus.bdui.flex.utils.b.f(new reg(new t5a(eVar.a, eVar.b, eVar.c), z, eVar2 != null ? this.b.b(eVar2) : null));
    }

    @Override // com.yandex.plus.bdui.a
    public final void destroy() {
        this.a.e();
    }

    @Override // com.yandex.plus.bdui.a
    public final com.yandex.plus.bdui.action.a e(com.yandex.plus.bdui.query.b bVar, com.yandex.plus.bdui.action.a aVar) {
        md eVar;
        bVar.getClass();
        pg pgVar = new pg(bVar.a, bVar.b, bVar.c);
        md mdVar = null;
        if (aVar != null) {
            com.yandex.plus.bdui.flex.action.j jVar = aVar instanceof com.yandex.plus.bdui.flex.action.j ? (com.yandex.plus.bdui.flex.action.j) aVar : null;
            if (jVar == null || (eVar = jVar.a) == null) {
                eVar = new com.yandex.plus.bdui.flex.action.e(aVar, null);
            }
            mdVar = eVar;
        }
        return com.yandex.plus.bdui.flex.utils.b.f(new jun(pgVar, mdVar));
    }

    @Override // com.yandex.plus.bdui.a
    public final void f() {
        this.a.f();
    }

    @Override // com.yandex.plus.bdui.a
    public final void g(ViewGroup viewGroup, TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity) {
        this.a.c(viewGroup, tarifficatorBduiScenarioActivity);
    }

    public final void h(e eVar) {
        if (Intrinsics.d(this.d, eVar)) {
            return;
        }
        this.d = eVar;
        this.c.b(eVar);
    }
}
