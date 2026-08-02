package ru.yandex.taxi.masstransit.domain;

import defpackage.ny61;
import defpackage.tcc;
import defpackage.ub6;
import defpackage.vb6;
import defpackage.wb6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.experiment.ExperimentAction;

/* loaded from: classes6.dex */
public final class g {
    public final ru.yandex.taxi.masstransit.datasource.routing.f a;
    public final ru.yandex.taxi.widget.c b;
    public final c c;

    public g(ru.yandex.taxi.masstransit.datasource.routing.f fVar, ru.yandex.taxi.widget.c cVar, c cVar2) {
        this.a = fVar;
        this.b = cVar;
        this.c = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        if (r12 != r14) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00eb -> B:11:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, ru.yandex.taxi.masstransit.experiment.f fVar, ContinuationImpl continuationImpl) {
        MtDetailStateInteractor$mapBottomButtonsState$1 mtDetailStateInteractor$mapBottomButtonsState$1;
        int i;
        Collection arrayList;
        Iterator it;
        Collection collection;
        Iterator it2;
        ub6 ub6Var;
        ExperimentAction experimentAction;
        CharSequence charSequence;
        gVar.getClass();
        ru.yandex.taxi.widget.c cVar = gVar.b;
        if (continuationImpl instanceof MtDetailStateInteractor$mapBottomButtonsState$1) {
            mtDetailStateInteractor$mapBottomButtonsState$1 = (MtDetailStateInteractor$mapBottomButtonsState$1) continuationImpl;
            int i2 = mtDetailStateInteractor$mapBottomButtonsState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailStateInteractor$mapBottomButtonsState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDetailStateInteractor$mapBottomButtonsState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailStateInteractor$mapBottomButtonsState$1.label;
                List list = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (fVar != null) {
                        ArrayList arrayList2 = fVar.f;
                        arrayList = new ArrayList(tcc.n(arrayList2, 10));
                        it = arrayList2.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    if (list == null) {
                    }
                    return new wb6(list);
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (Collection) mtDetailStateInteractor$mapBottomButtonsState$1.L$9;
                    charSequence = (CharSequence) mtDetailStateInteractor$mapBottomButtonsState$1.L$8;
                    experimentAction = (ExperimentAction) mtDetailStateInteractor$mapBottomButtonsState$1.L$7;
                    ub6Var = (ub6) mtDetailStateInteractor$mapBottomButtonsState$1.L$6;
                    it2 = (Iterator) mtDetailStateInteractor$mapBottomButtonsState$1.L$4;
                    collection = (Collection) mtDetailStateInteractor$mapBottomButtonsState$1.L$3;
                    kotlin.b.b(obj);
                    arrayList.add(new vb6(experimentAction, charSequence, (CharSequence) obj, ub6Var.d));
                    it = it2;
                    arrayList = collection;
                    if (it.hasNext()) {
                        list = (List) arrayList;
                        if (list == null) {
                            list = EmptyList.a;
                        }
                        return new wb6(list);
                    }
                    ub6 ub6Var2 = (ub6) it.next();
                    experimentAction = ub6Var2.a;
                    FormattedText formattedText = ub6Var2.b;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$0 = null;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$1 = null;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$2 = null;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$3 = arrayList;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$4 = it;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$5 = null;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$6 = ub6Var2;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$7 = experimentAction;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$8 = arrayList;
                    mtDetailStateInteractor$mapBottomButtonsState$1.L$9 = null;
                    mtDetailStateInteractor$mapBottomButtonsState$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtDetailStateInteractor$mapBottomButtonsState$1, 30);
                    if (i3 != coroutineSingletons) {
                        it2 = it;
                        collection = arrayList;
                        obj = i3;
                        ub6Var = ub6Var2;
                        charSequence = (CharSequence) obj;
                        FormattedText formattedText2 = ub6Var.c;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$0 = null;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$1 = null;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$2 = null;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$3 = collection;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$4 = it2;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$5 = null;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$6 = ub6Var;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$7 = experimentAction;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$8 = charSequence;
                        mtDetailStateInteractor$mapBottomButtonsState$1.L$9 = arrayList;
                        mtDetailStateInteractor$mapBottomButtonsState$1.label = 2;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtDetailStateInteractor$mapBottomButtonsState$1, 30);
                    }
                    return coroutineSingletons;
                }
                arrayList = (Collection) mtDetailStateInteractor$mapBottomButtonsState$1.L$8;
                ExperimentAction experimentAction2 = (ExperimentAction) mtDetailStateInteractor$mapBottomButtonsState$1.L$7;
                ub6 ub6Var3 = (ub6) mtDetailStateInteractor$mapBottomButtonsState$1.L$6;
                Iterator it3 = (Iterator) mtDetailStateInteractor$mapBottomButtonsState$1.L$4;
                Collection collection2 = (Collection) mtDetailStateInteractor$mapBottomButtonsState$1.L$3;
                kotlin.b.b(obj);
                collection = collection2;
                it2 = it3;
                ub6Var = ub6Var3;
                experimentAction = experimentAction2;
                charSequence = (CharSequence) obj;
                FormattedText formattedText22 = ub6Var.c;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$0 = null;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$1 = null;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$2 = null;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$3 = collection;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$4 = it2;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$5 = null;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$6 = ub6Var;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$7 = experimentAction;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$8 = charSequence;
                mtDetailStateInteractor$mapBottomButtonsState$1.L$9 = arrayList;
                mtDetailStateInteractor$mapBottomButtonsState$1.label = 2;
                obj = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, mtDetailStateInteractor$mapBottomButtonsState$1, 30);
            }
        }
        mtDetailStateInteractor$mapBottomButtonsState$1 = new MtDetailStateInteractor$mapBottomButtonsState$1(gVar, continuationImpl);
        Object obj2 = mtDetailStateInteractor$mapBottomButtonsState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailStateInteractor$mapBottomButtonsState$1.label;
        List list2 = null;
        if (i != 0) {
        }
    }

    public final kotlinx.coroutines.flow.internal.g b(kotlinx.coroutines.flow.internal.g gVar) {
        return kotlinx.coroutines.flow.e.I(this.c.a(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.masstransit.datasource.routing.e(this.a.i)), gVar), new MtDetailStateInteractor$stateFlow$1(this, null));
    }
}
