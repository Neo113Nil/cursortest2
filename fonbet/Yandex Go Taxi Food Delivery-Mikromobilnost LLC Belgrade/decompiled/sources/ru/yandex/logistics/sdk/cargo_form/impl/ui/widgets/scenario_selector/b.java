package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.ad3;
import defpackage.bd3;
import defpackage.cbc;
import defpackage.cd3;
import defpackage.cqs0;
import defpackage.dbc;
import defpackage.j6s;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.qmm0;
import defpackage.rmm0;
import defpackage.smm0;
import defpackage.tcc;
import defpackage.uvi0;
import defpackage.vmm0;
import defpackage.w511;
import defpackage.wmm0;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.xmm0;
import defpackage.xts0;
import defpackage.ymm0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScenarioSelectorState;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xmm0 xmm0Var, j6s j6sVar, String str, ContinuationImpl continuationImpl) {
        ScenarioSelectorMapper$map$4 scenarioSelectorMapper$map$4;
        int i;
        String str2;
        Object obj;
        x2s x2sVar;
        boolean z;
        smm0 smm0Var;
        xmm0 xmm0Var2 = xmm0Var;
        if (continuationImpl instanceof ScenarioSelectorMapper$map$4) {
            scenarioSelectorMapper$map$4 = (ScenarioSelectorMapper$map$4) continuationImpl;
            int i2 = scenarioSelectorMapper$map$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scenarioSelectorMapper$map$4.label = i2 - Integer.MIN_VALUE;
                ScenarioSelectorMapper$map$4 scenarioSelectorMapper$map$42 = scenarioSelectorMapper$map$4;
                Object obj2 = scenarioSelectorMapper$map$42.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scenarioSelectorMapper$map$42.label;
                smm0 smm0Var2 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = j6sVar.a.get(str);
                    x2s x2sVar2 = new x2s(xmm0Var2.g, null);
                    xts0 xts0Var = xmm0Var2.b;
                    scenarioSelectorMapper$map$42.L$0 = xmm0Var2;
                    scenarioSelectorMapper$map$42.L$1 = null;
                    scenarioSelectorMapper$map$42.L$2 = str;
                    scenarioSelectorMapper$map$42.L$3 = obj3;
                    scenarioSelectorMapper$map$42.L$4 = x2sVar2;
                    scenarioSelectorMapper$map$42.label = 1;
                    Object q = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.q(this.a, xts0Var, j6sVar, null, scenarioSelectorMapper$map$42, 12);
                    if (q == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    obj = obj3;
                    obj2 = q;
                    x2sVar = x2sVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x2s x2sVar3 = (x2s) scenarioSelectorMapper$map$42.L$4;
                    obj = scenarioSelectorMapper$map$42.L$3;
                    str2 = (String) scenarioSelectorMapper$map$42.L$2;
                    xmm0 xmm0Var3 = (xmm0) scenarioSelectorMapper$map$42.L$0;
                    kotlin.b.b(obj2);
                    x2sVar = x2sVar3;
                    xmm0Var2 = xmm0Var3;
                }
                cqs0 cqs0Var = (cqs0) obj2;
                boolean equals = obj != null ? xmm0Var2.e : obj.equals(xmm0Var2.a);
                cd3 cd3Var = xmm0Var2.c;
                z = cd3Var instanceof ad3;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                if (!z) {
                    smm0Var2 = new smm0(new uvi0(((ad3) cd3Var).a), r2.b, r2.c);
                } else {
                    if (cd3Var instanceof bd3) {
                        smm0Var = new smm0(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, ((bd3) cd3Var).a, null, null, 14), r2.b, r2.c);
                        return new wmm0(cqs0Var, equals, smm0Var, aVar.g.f(xmm0Var2.d), new x9x0(null, str2, xmm0Var2.a, x2sVar, 1), xmm0Var2.f, x2sVar);
                    }
                    if (cd3Var != null) {
                        w511.b();
                        return null;
                    }
                }
                smm0Var = smm0Var2;
                return new wmm0(cqs0Var, equals, smm0Var, aVar.g.f(xmm0Var2.d), new x9x0(null, str2, xmm0Var2.a, x2sVar, 1), xmm0Var2.f, x2sVar);
            }
        }
        scenarioSelectorMapper$map$4 = new ScenarioSelectorMapper$map$4(this, continuationImpl);
        ScenarioSelectorMapper$map$4 scenarioSelectorMapper$map$422 = scenarioSelectorMapper$map$4;
        Object obj22 = scenarioSelectorMapper$map$422.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scenarioSelectorMapper$map$422.label;
        smm0 smm0Var22 = null;
        if (i != 0) {
        }
        cqs0 cqs0Var2 = (cqs0) obj22;
        boolean equals2 = obj != null ? xmm0Var2.e : obj.equals(xmm0Var2.a);
        cd3 cd3Var2 = xmm0Var2.c;
        z = cd3Var2 instanceof ad3;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        if (!z) {
        }
        smm0Var = smm0Var22;
        return new wmm0(cqs0Var2, equals2, smm0Var, aVar2.g.f(xmm0Var2.d), new x9x0(null, str2, xmm0Var2.a, x2sVar, 1), xmm0Var2.f, x2sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.b] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00eb -> B:24:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ymm0 ymm0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        ScenarioSelectorMapper$map$1 scenarioSelectorMapper$map$1;
        int i;
        ymm0 ymm0Var2;
        Iterator it;
        int i2;
        ArrayList arrayList;
        ScenarioSelectorMapper$map$1 scenarioSelectorMapper$map$12;
        int i3;
        j6s j6sVar2;
        ArrayList arrayList2;
        dbc dbcVar;
        ScenarioSelectorState scenarioSelectorState;
        ymm0 ymm0Var3;
        Object c;
        qmm0 qmm0Var;
        ymm0 ymm0Var4;
        ArrayList arrayList3;
        if (continuationImpl instanceof ScenarioSelectorMapper$map$1) {
            scenarioSelectorMapper$map$1 = (ScenarioSelectorMapper$map$1) continuationImpl;
            int i4 = scenarioSelectorMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scenarioSelectorMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scenarioSelectorMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scenarioSelectorMapper$map$1.label;
                int i5 = 0;
                cbc cbcVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ymm0Var2 = ymm0Var;
                    ArrayList arrayList4 = ymm0Var2.c;
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                    it = arrayList4.iterator();
                    i2 = 0;
                    arrayList = arrayList5;
                    scenarioSelectorMapper$map$12 = scenarioSelectorMapper$map$1;
                    i3 = 0;
                    j6sVar2 = j6sVar;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r0 = (List) scenarioSelectorMapper$map$1.L$5;
                        qmm0Var = (qmm0) scenarioSelectorMapper$map$1.L$4;
                        scenarioSelectorState = (ScenarioSelectorState) scenarioSelectorMapper$map$1.L$3;
                        ymm0Var4 = (ymm0) scenarioSelectorMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        arrayList3 = r0;
                        cbcVar = new cbc(scenarioSelectorState, qmm0Var, (qmm0) obj);
                        arrayList2 = arrayList3;
                        ymm0Var2 = ymm0Var4;
                        return new vmm0(arrayList2, cbcVar, ymm0Var2.a);
                    }
                    i5 = scenarioSelectorMapper$map$1.I$0;
                    ?? r4 = (List) scenarioSelectorMapper$map$1.L$4;
                    ScenarioSelectorState scenarioSelectorState2 = (ScenarioSelectorState) scenarioSelectorMapper$map$1.L$3;
                    dbcVar = (dbc) scenarioSelectorMapper$map$1.L$2;
                    ymm0Var3 = (ymm0) scenarioSelectorMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    arrayList2 = r4;
                    scenarioSelectorState = scenarioSelectorState2;
                    qmm0 qmm0Var2 = (qmm0) obj;
                    rmm0 rmm0Var = dbcVar.c;
                    scenarioSelectorMapper$map$1.L$0 = ymm0Var3;
                    scenarioSelectorMapper$map$1.L$1 = null;
                    scenarioSelectorMapper$map$1.L$2 = null;
                    scenarioSelectorMapper$map$1.L$3 = scenarioSelectorState;
                    scenarioSelectorMapper$map$1.L$4 = qmm0Var2;
                    scenarioSelectorMapper$map$1.L$5 = arrayList2;
                    scenarioSelectorMapper$map$1.I$0 = i5;
                    scenarioSelectorMapper$map$1.label = 3;
                    c = c(rmm0Var, scenarioSelectorMapper$map$1);
                    if (c != coroutineSingletons) {
                        qmm0Var = qmm0Var2;
                        ymm0Var4 = ymm0Var3;
                        obj = c;
                        arrayList3 = arrayList2;
                        cbcVar = new cbc(scenarioSelectorState, qmm0Var, (qmm0) obj);
                        arrayList2 = arrayList3;
                        ymm0Var2 = ymm0Var4;
                        return new vmm0(arrayList2, cbcVar, ymm0Var2.a);
                    }
                    return coroutineSingletons;
                }
                int i6 = scenarioSelectorMapper$map$1.I$1;
                int i7 = scenarioSelectorMapper$map$1.I$0;
                Collection collection = (Collection) scenarioSelectorMapper$map$1.L$8;
                Iterator it2 = (Iterator) scenarioSelectorMapper$map$1.L$5;
                ?? r13 = (Collection) scenarioSelectorMapper$map$1.L$4;
                j6s j6sVar3 = (j6s) scenarioSelectorMapper$map$1.L$1;
                ymm0 ymm0Var5 = (ymm0) scenarioSelectorMapper$map$1.L$0;
                kotlin.b.b(obj);
                scenarioSelectorMapper$map$12 = scenarioSelectorMapper$map$1;
                j6sVar2 = j6sVar3;
                Iterator it3 = it2;
                int i8 = i7;
                i3 = i6;
                ArrayList arrayList6 = r13;
                collection.add((wmm0) obj);
                i2 = i8;
                arrayList = arrayList6;
                it = it3;
                ymm0Var2 = ymm0Var5;
                if (it.hasNext()) {
                    xmm0 xmm0Var = (xmm0) it.next();
                    String str = ymm0Var2.b;
                    scenarioSelectorMapper$map$12.L$0 = ymm0Var2;
                    scenarioSelectorMapper$map$12.L$1 = j6sVar2;
                    scenarioSelectorMapper$map$12.L$2 = null;
                    scenarioSelectorMapper$map$12.L$3 = null;
                    scenarioSelectorMapper$map$12.L$4 = arrayList;
                    scenarioSelectorMapper$map$12.L$5 = it;
                    scenarioSelectorMapper$map$12.L$6 = null;
                    scenarioSelectorMapper$map$12.L$7 = null;
                    scenarioSelectorMapper$map$12.L$8 = arrayList;
                    scenarioSelectorMapper$map$12.I$0 = i2;
                    scenarioSelectorMapper$map$12.I$1 = i3;
                    scenarioSelectorMapper$map$12.I$2 = 0;
                    scenarioSelectorMapper$map$12.label = 1;
                    Object a = a(xmm0Var, j6sVar2, str, scenarioSelectorMapper$map$12);
                    if (a != coroutineSingletons) {
                        ymm0Var5 = ymm0Var2;
                        obj = a;
                        it3 = it;
                        ArrayList arrayList7 = arrayList;
                        i8 = i2;
                        collection = arrayList7;
                        arrayList6 = arrayList7;
                        collection.add((wmm0) obj);
                        i2 = i8;
                        arrayList = arrayList6;
                        it = it3;
                        ymm0Var2 = ymm0Var5;
                        if (it.hasNext()) {
                            arrayList2 = arrayList;
                            dbcVar = ymm0Var2.d;
                            if (dbcVar != null) {
                                ScenarioSelectorState scenarioSelectorState3 = dbcVar.a;
                                rmm0 rmm0Var2 = dbcVar.b;
                                scenarioSelectorMapper$map$12.L$0 = ymm0Var2;
                                scenarioSelectorMapper$map$12.L$1 = null;
                                scenarioSelectorMapper$map$12.L$2 = dbcVar;
                                scenarioSelectorMapper$map$12.L$3 = scenarioSelectorState3;
                                scenarioSelectorMapper$map$12.L$4 = arrayList2;
                                scenarioSelectorMapper$map$12.L$5 = null;
                                scenarioSelectorMapper$map$12.L$6 = null;
                                scenarioSelectorMapper$map$12.L$7 = null;
                                scenarioSelectorMapper$map$12.L$8 = null;
                                scenarioSelectorMapper$map$12.I$0 = 0;
                                scenarioSelectorMapper$map$12.label = 2;
                                Object c2 = c(rmm0Var2, scenarioSelectorMapper$map$12);
                                if (c2 != coroutineSingletons) {
                                    ScenarioSelectorMapper$map$1 scenarioSelectorMapper$map$13 = scenarioSelectorMapper$map$12;
                                    scenarioSelectorState = scenarioSelectorState3;
                                    scenarioSelectorMapper$map$1 = scenarioSelectorMapper$map$13;
                                    ymm0Var3 = ymm0Var2;
                                    obj = c2;
                                    qmm0 qmm0Var22 = (qmm0) obj;
                                    rmm0 rmm0Var3 = dbcVar.c;
                                    scenarioSelectorMapper$map$1.L$0 = ymm0Var3;
                                    scenarioSelectorMapper$map$1.L$1 = null;
                                    scenarioSelectorMapper$map$1.L$2 = null;
                                    scenarioSelectorMapper$map$1.L$3 = scenarioSelectorState;
                                    scenarioSelectorMapper$map$1.L$4 = qmm0Var22;
                                    scenarioSelectorMapper$map$1.L$5 = arrayList2;
                                    scenarioSelectorMapper$map$1.I$0 = i5;
                                    scenarioSelectorMapper$map$1.label = 3;
                                    c = c(rmm0Var3, scenarioSelectorMapper$map$1);
                                    if (c != coroutineSingletons) {
                                    }
                                }
                            }
                            return new vmm0(arrayList2, cbcVar, ymm0Var2.a);
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        scenarioSelectorMapper$map$1 = new ScenarioSelectorMapper$map$1(this, continuationImpl);
        Object obj2 = scenarioSelectorMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scenarioSelectorMapper$map$1.label;
        int i52 = 0;
        cbc cbcVar2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rmm0 rmm0Var, ContinuationImpl continuationImpl) {
        ScenarioSelectorMapper$mapButton$1 scenarioSelectorMapper$mapButton$1;
        int i;
        x2s x2sVar;
        if (continuationImpl instanceof ScenarioSelectorMapper$mapButton$1) {
            scenarioSelectorMapper$mapButton$1 = (ScenarioSelectorMapper$mapButton$1) continuationImpl;
            int i2 = scenarioSelectorMapper$mapButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scenarioSelectorMapper$mapButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scenarioSelectorMapper$mapButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scenarioSelectorMapper$mapButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x2s x2sVar2 = new x2s(rmm0Var.c, null);
                    FormattedText formattedText = rmm0Var.a;
                    scenarioSelectorMapper$mapButton$1.L$0 = rmm0Var;
                    scenarioSelectorMapper$mapButton$1.L$1 = x2sVar2;
                    scenarioSelectorMapper$mapButton$1.label = 1;
                    Object a = this.b.a(formattedText, scenarioSelectorMapper$mapButton$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    x2sVar = x2sVar2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x2s x2sVar3 = (x2s) scenarioSelectorMapper$mapButton$1.L$1;
                    rmm0 rmm0Var2 = (rmm0) scenarioSelectorMapper$mapButton$1.L$0;
                    kotlin.b.b(obj);
                    x2sVar = x2sVar3;
                    rmm0Var = rmm0Var2;
                }
                return new qmm0((CharSequence) obj, this.a.g.f(rmm0Var.b), new x9x0(null, null, null, x2sVar, 7), x2sVar);
            }
        }
        scenarioSelectorMapper$mapButton$1 = new ScenarioSelectorMapper$mapButton$1(this, continuationImpl);
        Object obj2 = scenarioSelectorMapper$mapButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scenarioSelectorMapper$mapButton$1.label;
        if (i != 0) {
        }
        return new qmm0((CharSequence) obj2, this.a.g.f(rmm0Var.b), new x9x0(null, null, null, x2sVar, 7), x2sVar);
    }
}
