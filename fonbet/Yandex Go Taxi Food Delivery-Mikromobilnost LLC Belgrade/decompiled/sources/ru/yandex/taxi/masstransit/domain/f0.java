package ru.yandex.taxi.masstransit.domain;

import defpackage.ha2;
import defpackage.kdc;
import defpackage.mdh;
import defpackage.my6;
import defpackage.ny61;
import defpackage.q0l0;
import defpackage.q47;
import defpackage.qv30;
import defpackage.rv30;
import defpackage.sjh;
import defpackage.sv30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.z3l0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.masstransit.experiment.ExperimentAction;

/* loaded from: classes6.dex */
public final class f0 {
    public final ru.yandex.taxi.masstransit.datasource.routing.f a;
    public final tt2 b;
    public final ru.yandex.taxi.masstransit.experiment.d0 c;
    public final zuj0 d;
    public final ru.yandex.taxi.widget.c e;

    public f0(ru.yandex.taxi.masstransit.datasource.routing.f fVar, tt2 tt2Var, ru.yandex.taxi.masstransit.experiment.d0 d0Var, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = fVar;
        this.b = tt2Var;
        this.c = d0Var;
        this.d = zuj0Var;
        this.e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0132 -> B:11:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f0 f0Var, q0l0 q0l0Var, String str, ContinuationImpl continuationImpl) {
        MtRouteInfoInteractor$mapRouteButtons$1 mtRouteInfoInteractor$mapRouteButtons$1;
        int i;
        ArrayList arrayList;
        MtRouteInfoInteractor$mapRouteButtons$1 mtRouteInfoInteractor$mapRouteButtons$12;
        Iterator it;
        String str2;
        String str3;
        Iterator it2;
        sv30 sv30Var;
        z3l0 z3l0Var;
        Collection collection;
        Object i2;
        f0Var.getClass();
        ru.yandex.taxi.widget.c cVar = f0Var.e;
        if (continuationImpl instanceof MtRouteInfoInteractor$mapRouteButtons$1) {
            mtRouteInfoInteractor$mapRouteButtons$1 = (MtRouteInfoInteractor$mapRouteButtons$1) continuationImpl;
            int i3 = mtRouteInfoInteractor$mapRouteButtons$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtRouteInfoInteractor$mapRouteButtons$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mtRouteInfoInteractor$mapRouteButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteInfoInteractor$mapRouteButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = q0l0Var.a;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    mtRouteInfoInteractor$mapRouteButtons$12 = mtRouteInfoInteractor$mapRouteButtons$1;
                    it = list.iterator();
                    str2 = str;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        collection = (Collection) mtRouteInfoInteractor$mapRouteButtons$1.L$10;
                        sv30 sv30Var2 = (sv30) mtRouteInfoInteractor$mapRouteButtons$1.L$9;
                        z3l0Var = (z3l0) mtRouteInfoInteractor$mapRouteButtons$1.L$7;
                        Iterator it3 = (Iterator) mtRouteInfoInteractor$mapRouteButtons$1.L$5;
                        ?? r12 = (Collection) mtRouteInfoInteractor$mapRouteButtons$1.L$4;
                        str3 = (String) mtRouteInfoInteractor$mapRouteButtons$1.L$1;
                        kotlin.b.b(obj);
                        sv30Var = sv30Var2;
                        arrayList = r12;
                        it2 = it3;
                        CharSequence charSequence = (CharSequence) obj;
                        kdc kdcVar = z3l0Var.d;
                        FormattedText formattedText = z3l0Var.c;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$0 = null;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$1 = str3;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$2 = null;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$3 = null;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$4 = arrayList;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$5 = it2;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$6 = null;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$7 = null;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$8 = null;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$9 = sv30Var;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$10 = charSequence;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$11 = kdcVar;
                        mtRouteInfoInteractor$mapRouteButtons$1.L$12 = collection;
                        mtRouteInfoInteractor$mapRouteButtons$1.label = 2;
                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtRouteInfoInteractor$mapRouteButtons$1, 30);
                        if (i2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) mtRouteInfoInteractor$mapRouteButtons$1.L$12;
                    kdc kdcVar2 = (kdc) mtRouteInfoInteractor$mapRouteButtons$1.L$11;
                    CharSequence charSequence2 = (CharSequence) mtRouteInfoInteractor$mapRouteButtons$1.L$10;
                    sv30Var = (sv30) mtRouteInfoInteractor$mapRouteButtons$1.L$9;
                    it2 = (Iterator) mtRouteInfoInteractor$mapRouteButtons$1.L$5;
                    ?? r13 = (Collection) mtRouteInfoInteractor$mapRouteButtons$1.L$4;
                    String str4 = (String) mtRouteInfoInteractor$mapRouteButtons$1.L$1;
                    kotlin.b.b(obj);
                    kdc kdcVar3 = kdcVar2;
                    CharSequence charSequence3 = charSequence2;
                    ArrayList arrayList2 = r13;
                    str3 = str4;
                    MtRouteInfoInteractor$mapRouteButtons$1 mtRouteInfoInteractor$mapRouteButtons$13 = mtRouteInfoInteractor$mapRouteButtons$1;
                    it = it2;
                    collection.add(new my6(charSequence3, null, kdcVar3, null, sv30Var, (CharSequence) obj, null, false, false, 16182));
                    mtRouteInfoInteractor$mapRouteButtons$12 = mtRouteInfoInteractor$mapRouteButtons$13;
                    arrayList = arrayList2;
                    str2 = str3;
                    if (it.hasNext()) {
                        z3l0Var = (z3l0) it.next();
                        sv30Var = z3l0Var.a == ExperimentAction.SHARE_ROUTE ? new rv30(str2) : qv30.a;
                        FormattedText formattedText2 = z3l0Var.b;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$0 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$1 = str2;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$2 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$3 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$4 = arrayList;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$5 = it;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$6 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$7 = z3l0Var;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$8 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$9 = sv30Var;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$10 = arrayList;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$11 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.L$12 = null;
                        mtRouteInfoInteractor$mapRouteButtons$12.label = 1;
                        Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtRouteInfoInteractor$mapRouteButtons$12, 30);
                        if (i4 != coroutineSingletons) {
                            str3 = str2;
                            obj = i4;
                            it2 = it;
                            mtRouteInfoInteractor$mapRouteButtons$1 = mtRouteInfoInteractor$mapRouteButtons$12;
                            collection = arrayList;
                            CharSequence charSequence4 = (CharSequence) obj;
                            kdc kdcVar4 = z3l0Var.d;
                            FormattedText formattedText3 = z3l0Var.c;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$0 = null;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$1 = str3;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$2 = null;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$3 = null;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$4 = arrayList;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$5 = it2;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$6 = null;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$7 = null;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$8 = null;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$9 = sv30Var;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$10 = charSequence4;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$11 = kdcVar4;
                            mtRouteInfoInteractor$mapRouteButtons$1.L$12 = collection;
                            mtRouteInfoInteractor$mapRouteButtons$1.label = 2;
                            i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, mtRouteInfoInteractor$mapRouteButtons$1, 30);
                            if (i2 != coroutineSingletons) {
                                charSequence3 = charSequence4;
                                obj = i2;
                                kdcVar3 = kdcVar4;
                                arrayList2 = arrayList;
                                MtRouteInfoInteractor$mapRouteButtons$1 mtRouteInfoInteractor$mapRouteButtons$132 = mtRouteInfoInteractor$mapRouteButtons$1;
                                it = it2;
                                collection.add(new my6(charSequence3, null, kdcVar3, null, sv30Var, (CharSequence) obj, null, false, false, 16182));
                                mtRouteInfoInteractor$mapRouteButtons$12 = mtRouteInfoInteractor$mapRouteButtons$132;
                                arrayList = arrayList2;
                                str2 = str3;
                                if (it.hasNext()) {
                                    return new q47(ButtonOrientation.HORIZONTAL, arrayList);
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        mtRouteInfoInteractor$mapRouteButtons$1 = new MtRouteInfoInteractor$mapRouteButtons$1(f0Var, continuationImpl);
        Object obj2 = mtRouteInfoInteractor$mapRouteButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteInfoInteractor$mapRouteButtons$1.label;
        if (i != 0) {
        }
    }

    public final tpr b() {
        tpr t = kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.masstransit.datasource.routing.e(this.a.i));
        ru.yandex.taxi.masstransit.experiment.d0 d0Var = this.c;
        ha2 n = kotlinx.coroutines.flow.e.n(t, kotlinx.coroutines.flow.e.t(new e0(d0Var.b())), d0Var.b(), new MtRouteInfoInteractor$stateFlow$1(this, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(n, mdh.b);
    }
}
