package ru.yandex.taxi.masstransit.trains.checkout.tariff;

import defpackage.bvf0;
import defpackage.ci40;
import defpackage.d9s;
import defpackage.ny61;
import defpackage.ph40;
import defpackage.pz40;
import defpackage.sh40;
import defpackage.tcc;
import defpackage.vb40;
import defpackage.xdf;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class d {
    public final ru.yandex.taxi.widget.c a;
    public final xdf b;
    public final r0 c = bvf0.c(new ci40("Выберите тариф", Collections.singletonList(new ph40(31)), "standart", "Применить"));

    public d(ru.yandex.taxi.widget.c cVar, xdf xdfVar) {
        this.a = cVar;
        this.b = xdfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x02a7 -> B:23:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x02f3 -> B:12:0x02f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sh40 sh40Var, ContinuationImpl continuationImpl) {
        MtTrainTariffUiStateRepository$updateInitialState$1 mtTrainTariffUiStateRepository$updateInitialState$1;
        int i;
        pz40 pz40Var;
        Object obj;
        sh40 sh40Var2;
        Collection collection;
        sh40 sh40Var3;
        pz40 pz40Var2;
        Object obj2;
        CharSequence charSequence;
        Collection collection2;
        Iterator it;
        vb40.n nVar;
        Map map;
        CharSequence charSequence2;
        sh40 sh40Var4;
        pz40 pz40Var3;
        Object obj3;
        CharSequence charSequence3;
        Collection collection3;
        Iterator it2;
        vb40.n nVar2;
        Collection collection4;
        CharSequence charSequence4;
        Collection collection5;
        Object obj4;
        vb40.n nVar3;
        sh40 sh40Var5;
        Collection collection6;
        CharSequence charSequence5;
        pz40 pz40Var4;
        Iterator it3;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        Object obj5;
        CoroutineSingletons coroutineSingletons;
        Object i2;
        Object i3;
        CoroutineSingletons coroutineSingletons2;
        List list;
        String str;
        Object i4;
        ci40 ci40Var;
        r0 r0Var;
        d dVar = this;
        if (continuationImpl instanceof MtTrainTariffUiStateRepository$updateInitialState$1) {
            mtTrainTariffUiStateRepository$updateInitialState$1 = (MtTrainTariffUiStateRepository$updateInitialState$1) continuationImpl;
            int i5 = mtTrainTariffUiStateRepository$updateInitialState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mtTrainTariffUiStateRepository$updateInitialState$1.label = i5 - Integer.MIN_VALUE;
                Object obj6 = mtTrainTariffUiStateRepository$updateInitialState$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainTariffUiStateRepository$updateInitialState$1.label;
                ru.yandex.taxi.widget.c cVar = dVar.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj6);
                        pz40Var = dVar.c;
                        sh40 sh40Var6 = sh40Var;
                        obj = pz40Var.getValue();
                        FormattedText formattedText = sh40Var6.a.a;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var6;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.label = 1;
                        Object i6 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                        if (i6 != coroutineSingletons3) {
                            sh40Var2 = sh40Var6;
                            obj6 = i6;
                            List list2 = sh40Var2.a.c;
                            collection2 = new ArrayList(tcc.n(list2, 10));
                            it = list2.iterator();
                            charSequence = (CharSequence) obj6;
                            obj2 = obj;
                            pz40Var2 = pz40Var;
                            if (!it.hasNext()) {
                                vb40.n nVar4 = (vb40.n) it.next();
                                FormattedText formattedText2 = nVar4.a;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var2;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var2;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj2;
                                map = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection2;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar4;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection2;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$13 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.L$14 = null;
                                mtTrainTariffUiStateRepository$updateInitialState$1.label = 2;
                                Object i7 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                                if (i7 != coroutineSingletons3) {
                                    sh40Var3 = sh40Var2;
                                    nVar = nVar4;
                                    obj6 = i7;
                                    collection = collection2;
                                    CharSequence charSequence10 = (CharSequence) obj6;
                                    FormattedText formattedText3 = nVar.b;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var3;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var2;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj2;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = map;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = map;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = map;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection2;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = map;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = charSequence10;
                                    mtTrainTariffUiStateRepository$updateInitialState$1.label = 3;
                                    i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, map, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                                    if (i3 != coroutineSingletons3) {
                                        Collection collection7 = collection;
                                        charSequence2 = charSequence10;
                                        obj6 = i3;
                                        sh40Var4 = sh40Var3;
                                        pz40Var3 = pz40Var2;
                                        obj3 = obj2;
                                        charSequence3 = charSequence;
                                        collection3 = collection2;
                                        it2 = it;
                                        nVar2 = nVar;
                                        collection4 = collection7;
                                        CharSequence charSequence11 = (CharSequence) obj6;
                                        FormattedText formattedText4 = nVar2.c;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var4;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var3;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj3;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = map;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence3;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = map;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = map;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection3;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it2;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = map;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar2;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection4;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = charSequence2;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.L$13 = charSequence11;
                                        mtTrainTariffUiStateRepository$updateInitialState$1.label = 4;
                                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText4, map, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                                        if (i2 != coroutineSingletons3) {
                                            pz40Var4 = pz40Var3;
                                            obj6 = i2;
                                            it3 = it2;
                                            charSequence4 = charSequence3;
                                            charSequence6 = charSequence11;
                                            collection5 = collection4;
                                            obj4 = obj3;
                                            nVar3 = nVar2;
                                            sh40Var5 = sh40Var4;
                                            collection6 = collection3;
                                            charSequence5 = charSequence2;
                                            charSequence7 = (CharSequence) obj6;
                                            FormattedText c = d9s.c(nVar3.d, dVar.b, sh40Var5.c, true);
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var5;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var4;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj4;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = null;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence4;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = null;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = null;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection6;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it3;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = null;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar3;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection5;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = charSequence5;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$13 = charSequence6;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.L$14 = charSequence7;
                                            mtTrainTariffUiStateRepository$updateInitialState$1.label = 5;
                                            cVar = cVar;
                                            obj5 = ru.yandex.taxi.widget.c.i(cVar, c, null, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                                            coroutineSingletons = coroutineSingletons3;
                                            if (obj5 != coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            CharSequence charSequence12 = charSequence5;
                                            charSequence8 = charSequence6;
                                            charSequence9 = charSequence12;
                                            pz40 pz40Var5 = pz40Var4;
                                            Object obj7 = obj4;
                                            sh40Var2 = sh40Var5;
                                            Collection collection8 = collection5;
                                            Iterator it4 = it3;
                                            CharSequence charSequence13 = charSequence7;
                                            Collection collection9 = collection6;
                                            collection8.add(new ph40(charSequence9, charSequence8, charSequence13, (CharSequence) obj5, nVar3.e, nVar3.f));
                                            dVar = this;
                                            it = it4;
                                            collection2 = collection9;
                                            charSequence = charSequence4;
                                            obj2 = obj7;
                                            pz40Var2 = pz40Var5;
                                            coroutineSingletons3 = coroutineSingletons;
                                            if (!it.hasNext()) {
                                                coroutineSingletons2 = coroutineSingletons3;
                                                list = (List) collection2;
                                                str = sh40Var2.b;
                                                FormattedText formattedText5 = sh40Var2.a.b;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var2;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var2;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj2;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = list;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = str;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$13 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$14 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.label = 6;
                                                i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText5, null, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                                                if (i4 == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                                ci40Var = new ci40(charSequence, list, str, (CharSequence) i4);
                                                r0Var = (r0) pz40Var2;
                                                if (!r0Var.k(obj2, ci40Var)) {
                                                    return zy11.a;
                                                }
                                                pz40Var = r0Var;
                                                coroutineSingletons3 = coroutineSingletons2;
                                                sh40Var6 = sh40Var2;
                                                dVar = this;
                                                obj = pz40Var.getValue();
                                                FormattedText formattedText6 = sh40Var6.a.a;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var6;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = null;
                                                mtTrainTariffUiStateRepository$updateInitialState$1.label = 1;
                                                Object i62 = ru.yandex.taxi.widget.c.i(cVar, formattedText6, null, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                                                if (i62 != coroutineSingletons3) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons3;
                    case 1:
                        obj = mtTrainTariffUiStateRepository$updateInitialState$1.L$2;
                        pz40Var = (pz40) mtTrainTariffUiStateRepository$updateInitialState$1.L$1;
                        sh40Var2 = (sh40) mtTrainTariffUiStateRepository$updateInitialState$1.L$0;
                        kotlin.b.b(obj6);
                        List list22 = sh40Var2.a.c;
                        collection2 = new ArrayList(tcc.n(list22, 10));
                        it = list22.iterator();
                        charSequence = (CharSequence) obj6;
                        obj2 = obj;
                        pz40Var2 = pz40Var;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 2:
                        collection = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$11;
                        vb40.n nVar5 = (vb40.n) mtTrainTariffUiStateRepository$updateInitialState$1.L$10;
                        Iterator it5 = (Iterator) mtTrainTariffUiStateRepository$updateInitialState$1.L$8;
                        Collection collection10 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$7;
                        CharSequence charSequence14 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$4;
                        Object obj8 = mtTrainTariffUiStateRepository$updateInitialState$1.L$2;
                        pz40 pz40Var6 = (pz40) mtTrainTariffUiStateRepository$updateInitialState$1.L$1;
                        sh40 sh40Var7 = (sh40) mtTrainTariffUiStateRepository$updateInitialState$1.L$0;
                        kotlin.b.b(obj6);
                        sh40Var3 = sh40Var7;
                        pz40Var2 = pz40Var6;
                        obj2 = obj8;
                        charSequence = charSequence14;
                        collection2 = collection10;
                        it = it5;
                        nVar = nVar5;
                        map = null;
                        CharSequence charSequence102 = (CharSequence) obj6;
                        FormattedText formattedText32 = nVar.b;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var2;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj2;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection2;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = charSequence102;
                        mtTrainTariffUiStateRepository$updateInitialState$1.label = 3;
                        i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText32, map, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                        if (i3 != coroutineSingletons3) {
                        }
                        return coroutineSingletons3;
                    case 3:
                        charSequence2 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$12;
                        Collection collection11 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$11;
                        vb40.n nVar6 = (vb40.n) mtTrainTariffUiStateRepository$updateInitialState$1.L$10;
                        Iterator it6 = (Iterator) mtTrainTariffUiStateRepository$updateInitialState$1.L$8;
                        Collection collection12 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$7;
                        CharSequence charSequence15 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$4;
                        Object obj9 = mtTrainTariffUiStateRepository$updateInitialState$1.L$2;
                        pz40 pz40Var7 = (pz40) mtTrainTariffUiStateRepository$updateInitialState$1.L$1;
                        sh40 sh40Var8 = (sh40) mtTrainTariffUiStateRepository$updateInitialState$1.L$0;
                        kotlin.b.b(obj6);
                        sh40Var4 = sh40Var8;
                        pz40Var3 = pz40Var7;
                        obj3 = obj9;
                        charSequence3 = charSequence15;
                        collection3 = collection12;
                        it2 = it6;
                        nVar2 = nVar6;
                        collection4 = collection11;
                        map = null;
                        CharSequence charSequence112 = (CharSequence) obj6;
                        FormattedText formattedText42 = nVar2.c;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var4;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it2;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = map;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar2;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection4;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = charSequence2;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$13 = charSequence112;
                        mtTrainTariffUiStateRepository$updateInitialState$1.label = 4;
                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText42, map, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                        if (i2 != coroutineSingletons3) {
                        }
                        return coroutineSingletons3;
                    case 4:
                        CharSequence charSequence16 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$13;
                        CharSequence charSequence17 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$12;
                        Collection collection13 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$11;
                        vb40.n nVar7 = (vb40.n) mtTrainTariffUiStateRepository$updateInitialState$1.L$10;
                        Iterator it7 = (Iterator) mtTrainTariffUiStateRepository$updateInitialState$1.L$8;
                        Collection collection14 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$7;
                        CharSequence charSequence18 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$4;
                        Object obj10 = mtTrainTariffUiStateRepository$updateInitialState$1.L$2;
                        pz40 pz40Var8 = (pz40) mtTrainTariffUiStateRepository$updateInitialState$1.L$1;
                        sh40 sh40Var9 = (sh40) mtTrainTariffUiStateRepository$updateInitialState$1.L$0;
                        kotlin.b.b(obj6);
                        charSequence4 = charSequence18;
                        collection5 = collection13;
                        obj4 = obj10;
                        nVar3 = nVar7;
                        sh40Var5 = sh40Var9;
                        collection6 = collection14;
                        charSequence5 = charSequence17;
                        pz40Var4 = pz40Var8;
                        it3 = it7;
                        charSequence6 = charSequence16;
                        charSequence7 = (CharSequence) obj6;
                        FormattedText c2 = d9s.c(nVar3.d, dVar.b, sh40Var5.c, true);
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$0 = sh40Var5;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$1 = pz40Var4;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$2 = obj4;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$3 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$4 = charSequence4;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$5 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$6 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$7 = collection6;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$8 = it3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$9 = null;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$10 = nVar3;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$11 = collection5;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$12 = charSequence5;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$13 = charSequence6;
                        mtTrainTariffUiStateRepository$updateInitialState$1.L$14 = charSequence7;
                        mtTrainTariffUiStateRepository$updateInitialState$1.label = 5;
                        cVar = cVar;
                        obj5 = ru.yandex.taxi.widget.c.i(cVar, c2, null, mtTrainTariffUiStateRepository$updateInitialState$1, 30);
                        coroutineSingletons = coroutineSingletons3;
                        if (obj5 != coroutineSingletons) {
                        }
                        break;
                    case 5:
                        charSequence7 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$14;
                        CharSequence charSequence19 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$13;
                        CharSequence charSequence20 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$12;
                        collection5 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$11;
                        nVar3 = (vb40.n) mtTrainTariffUiStateRepository$updateInitialState$1.L$10;
                        it3 = (Iterator) mtTrainTariffUiStateRepository$updateInitialState$1.L$8;
                        collection6 = (Collection) mtTrainTariffUiStateRepository$updateInitialState$1.L$7;
                        charSequence4 = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$4;
                        obj4 = mtTrainTariffUiStateRepository$updateInitialState$1.L$2;
                        pz40Var4 = (pz40) mtTrainTariffUiStateRepository$updateInitialState$1.L$1;
                        sh40Var5 = (sh40) mtTrainTariffUiStateRepository$updateInitialState$1.L$0;
                        kotlin.b.b(obj6);
                        charSequence8 = charSequence19;
                        charSequence9 = charSequence20;
                        obj5 = obj6;
                        coroutineSingletons = coroutineSingletons3;
                        pz40 pz40Var52 = pz40Var4;
                        Object obj72 = obj4;
                        sh40Var2 = sh40Var5;
                        Collection collection82 = collection5;
                        Iterator it42 = it3;
                        CharSequence charSequence132 = charSequence7;
                        Collection collection92 = collection6;
                        collection82.add(new ph40(charSequence9, charSequence8, charSequence132, (CharSequence) obj5, nVar3.e, nVar3.f));
                        dVar = this;
                        it = it42;
                        collection2 = collection92;
                        charSequence = charSequence4;
                        obj2 = obj72;
                        pz40Var2 = pz40Var52;
                        coroutineSingletons3 = coroutineSingletons;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        str = (String) mtTrainTariffUiStateRepository$updateInitialState$1.L$6;
                        list = (List) mtTrainTariffUiStateRepository$updateInitialState$1.L$5;
                        charSequence = (CharSequence) mtTrainTariffUiStateRepository$updateInitialState$1.L$4;
                        obj2 = mtTrainTariffUiStateRepository$updateInitialState$1.L$2;
                        pz40Var2 = (pz40) mtTrainTariffUiStateRepository$updateInitialState$1.L$1;
                        sh40 sh40Var10 = (sh40) mtTrainTariffUiStateRepository$updateInitialState$1.L$0;
                        kotlin.b.b(obj6);
                        i4 = obj6;
                        coroutineSingletons2 = coroutineSingletons3;
                        sh40Var2 = sh40Var10;
                        ci40Var = new ci40(charSequence, list, str, (CharSequence) i4);
                        r0Var = (r0) pz40Var2;
                        if (!r0Var.k(obj2, ci40Var)) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mtTrainTariffUiStateRepository$updateInitialState$1 = new MtTrainTariffUiStateRepository$updateInitialState$1(dVar, continuationImpl);
        Object obj62 = mtTrainTariffUiStateRepository$updateInitialState$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainTariffUiStateRepository$updateInitialState$1.label;
        ru.yandex.taxi.widget.c cVar2 = dVar.a;
        switch (i) {
        }
    }
}
