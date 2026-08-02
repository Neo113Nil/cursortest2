package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui;

import defpackage.cms;
import defpackage.csb;
import defpackage.ehg;
import defpackage.fhg;
import defpackage.ghg;
import defpackage.hhg;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jms;
import defpackage.l7b;
import defpackage.tje;
import defpackage.ugg;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements vpr, jms {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        hhg hhgVar = (hhg) obj;
        c cVar = this.a;
        csb csbVar = cVar.a;
        if (hhgVar instanceof ugg) {
            csbVar.a.dismiss();
        } else if (hhgVar instanceof ghg) {
            csbVar.b.invoke(new ghg(new l7b(14, cVar), ((ghg) hhgVar).a));
        } else if (hhgVar instanceof ehg) {
            tje.N(cVar.e, null, null, new ChooseProfileActionsHandler$handle$1(cVar, (ehg) hhgVar, null), 3);
        } else if (hhgVar instanceof fhg) {
            jgz jgzVar = jgz.a;
            jgz.a("Unsupported action: " + ((fhg) hhgVar), new Object[0]);
            csbVar.a.dismiss();
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, c.class, "handle", "handle(Lcom/yandex/delivery/mapper/model/DashboardAction;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
