package ru.yandex.taxi.main.map;

import defpackage.avj0;
import defpackage.er3;
import defpackage.ir3;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.rwt;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.uwt;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.vyb0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;
    public final /* synthetic */ tse b;

    public b(c cVar, tse tseVar) {
        this.a = cVar;
        this.b = tseVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [ru.yandex.taxi.main.map.a] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        c cVar = this.a;
        if ((cVar.k.a() ? true : er3.c.contains(cVar.i.b.b())) && !this.a.g.b) {
            if (this.a.g.c) {
                ir3 ir3Var = this.a.j;
                synchronized (ir3Var) {
                    ir3.a(ir3Var);
                    z = ir3Var.c == AutoFsSessionPhase.Silent;
                }
                if (!z) {
                    this.a.g.c = false;
                }
            }
            if (!(this.a.h.a() instanceof vyb0)) {
                final c cVar2 = this.a;
                final tse tseVar = this.b;
                cVar2.g.a = true;
                rwt rwtVar = cVar2.f;
                uwt uwtVar = new uwt(((avj0) cVar2.l).h(kyh0.specify_your_address), ((avj0) cVar2.l).h(kyh0.common_yes), ((avj0) cVar2.l).h(kyh0.common_no), new GpsDiscoBubbleInteractor$showBubble$1(0, cVar2, c.class, "onUserConfirmedLocation", "onUserConfirmedLocation()V", 0), new sls() { // from class: ru.yandex.taxi.main.map.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        c cVar3 = c.this;
                        tse tseVar2 = tseVar;
                        cVar3.g.b = true;
                        cVar3.a();
                        cVar3.e.getClass();
                        sjh sjhVar = uyj.a;
                        tje.N(tseVar2, mdh.b, null, new GpsDiscoBubbleInteractor$onUserDeniedLocation$1(cVar3, null), 2);
                        return zy11.a;
                    }
                });
                r0 r0Var = rwtVar.a;
                r0Var.getClass();
                r0Var.m(null, uwtVar);
            }
        }
        return zy11.a;
    }
}
