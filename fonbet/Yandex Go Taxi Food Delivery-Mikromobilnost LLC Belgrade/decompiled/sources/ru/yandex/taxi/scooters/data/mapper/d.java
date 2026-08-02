package ru.yandex.taxi.scooters.data.mapper;

import defpackage.bmn0;
import defpackage.bmu;
import defpackage.bvf0;
import defpackage.cmn0;
import defpackage.cno0;
import defpackage.dmn0;
import defpackage.er;
import defpackage.f9s;
import defpackage.fef;
import defpackage.fmn0;
import defpackage.har;
import defpackage.k7x0;
import defpackage.kmu;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qp;
import defpackage.s7n0;
import defpackage.wo;
import defpackage.xdf;
import defpackage.zuo0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class d {
    public final pav a;
    public final k7x0 b;
    public final xdf c;
    public final ru.yandex.taxi.widget.c d;
    public final cno0 e;

    public d(pav pavVar, k7x0 k7x0Var, xdf xdfVar, ru.yandex.taxi.widget.c cVar, cno0 cno0Var) {
        this.a = pavVar;
        this.b = k7x0Var;
        this.c = xdfVar;
        this.d = cVar;
        this.e = cno0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r20v6, types: [bmn0] */
    /* JADX WARN: Type inference failed for: r7v23, types: [cmn0] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0233 -> B:17:0x04d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x02f5 -> B:16:0x04c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0491 -> B:14:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x04bc -> B:16:0x04c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x04c3 -> B:16:0x04c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, fef fefVar, List list, ContinuationImpl continuationImpl) {
        ScootersFinishInfoMapper$mapFinishInfoItems$1 scootersFinishInfoMapper$mapFinishInfoItems$1;
        int i;
        dmn0 dmn0Var;
        ScootersFinishInfoMapper$mapFinishInfoItems$1 scootersFinishInfoMapper$mapFinishInfoItems$12;
        ArrayList arrayList;
        Iterator it;
        fef fefVar2;
        k7x0 k7x0Var;
        FormattedText formattedText;
        ScootersFinishInfoMapper$mapFinishInfoItems$1 scootersFinishInfoMapper$mapFinishInfoItems$13;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        er erVar;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str2;
        fef fefVar3;
        ArrayList arrayList2;
        Iterator it2;
        String str3;
        dmn0 dmn0Var2;
        CharSequence charSequence5;
        Object e;
        fef fefVar4;
        fef fefVar5;
        ArrayList arrayList3;
        Iterator it3;
        er erVar2;
        FormattedText formattedText2;
        CharSequence charSequence6;
        String str4;
        CharSequence charSequence7;
        CharSequence charSequence8;
        er erVar3;
        CharSequence charSequence9;
        FormattedText formattedText3;
        fef fefVar6;
        ArrayList arrayList4;
        Iterator it4;
        CharSequence charSequence10;
        String str5;
        CharSequence charSequence11;
        har harVar;
        er erVar4;
        dmn0 dmn0Var3;
        har harVar2;
        FormattedText formattedText4;
        Object e2;
        d dVar2 = dVar;
        k7x0 k7x0Var2 = dVar2.b;
        xdf xdfVar = dVar2.c;
        if (continuationImpl instanceof ScootersFinishInfoMapper$mapFinishInfoItems$1) {
            scootersFinishInfoMapper$mapFinishInfoItems$1 = (ScootersFinishInfoMapper$mapFinishInfoItems$1) continuationImpl;
            int i2 = scootersFinishInfoMapper$mapFinishInfoItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishInfoMapper$mapFinishInfoItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFinishInfoMapper$mapFinishInfoItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishInfoMapper$mapFinishInfoItems$1.label;
                if (i != 0) {
                    dmn0Var = null;
                    kotlin.b.b(obj);
                    if (list == null) {
                        return EmptyList.a;
                    }
                    scootersFinishInfoMapper$mapFinishInfoItems$12 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                    arrayList = new ArrayList();
                    it = list.iterator();
                    fefVar2 = fefVar;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        formattedText4 = (FormattedText) scootersFinishInfoMapper$mapFinishInfoItems$1.L$10;
                        har harVar3 = (har) scootersFinishInfoMapper$mapFinishInfoItems$1.L$9;
                        Iterator it5 = (Iterator) scootersFinishInfoMapper$mapFinishInfoItems$1.L$6;
                        ?? r9 = (Collection) scootersFinishInfoMapper$mapFinishInfoItems$1.L$4;
                        fef fefVar7 = (fef) scootersFinishInfoMapper$mapFinishInfoItems$1.L$0;
                        kotlin.b.b(obj);
                        harVar2 = harVar3;
                        arrayList = r9;
                        fefVar4 = fefVar7;
                        scootersFinishInfoMapper$mapFinishInfoItems$12 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                        it = it5;
                        CharSequence charSequence12 = (CharSequence) obj;
                        ru.yandex.taxi.widget.c cVar = dVar2.d;
                        FormattedText c = f9s.c(xdfVar, fefVar4, formattedText4);
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$0 = fefVar4;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$1 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$2 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$3 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$4 = arrayList;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$5 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$6 = it;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$7 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$8 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$9 = harVar2;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$10 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$11 = null;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$12 = charSequence12;
                        scootersFinishInfoMapper$mapFinishInfoItems$12.label = 2;
                        e2 = ru.yandex.taxi.widget.c.e(cVar, c, null, false, scootersFinishInfoMapper$mapFinishInfoItems$12, 30);
                        if (e2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 2) {
                        CharSequence charSequence13 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$12;
                        harVar = (har) scootersFinishInfoMapper$mapFinishInfoItems$1.L$9;
                        Iterator it6 = (Iterator) scootersFinishInfoMapper$mapFinishInfoItems$1.L$6;
                        ?? r92 = (Collection) scootersFinishInfoMapper$mapFinishInfoItems$1.L$4;
                        fef fefVar8 = (fef) scootersFinishInfoMapper$mapFinishInfoItems$1.L$0;
                        kotlin.b.b(obj);
                        charSequence11 = charSequence13;
                        arrayList = r92;
                        fefVar4 = fefVar8;
                        scootersFinishInfoMapper$mapFinishInfoItems$12 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                        it = it6;
                        CharSequence charSequence14 = (CharSequence) obj;
                        String str6 = harVar.a;
                        if (str6 == null) {
                        }
                        erVar4 = harVar.d;
                        if (erVar4 instanceof wo) {
                        }
                        fefVar2 = fefVar4;
                        if (dmn0Var3 != null) {
                        }
                        dVar2 = dVar;
                        k7x0Var2 = k7x0Var;
                        dmn0Var = dmn0Var2;
                        if (!it.hasNext()) {
                        }
                    } else if (i == 3) {
                        String str7 = (String) scootersFinishInfoMapper$mapFinishInfoItems$1.L$22;
                        CharSequence charSequence15 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$21;
                        CharSequence charSequence16 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$20;
                        String str8 = (String) scootersFinishInfoMapper$mapFinishInfoItems$1.L$19;
                        FormattedText formattedText5 = (FormattedText) scootersFinishInfoMapper$mapFinishInfoItems$1.L$17;
                        formattedText3 = (FormattedText) scootersFinishInfoMapper$mapFinishInfoItems$1.L$16;
                        er erVar5 = (er) scootersFinishInfoMapper$mapFinishInfoItems$1.L$14;
                        Iterator it7 = (Iterator) scootersFinishInfoMapper$mapFinishInfoItems$1.L$6;
                        ?? r14 = (Collection) scootersFinishInfoMapper$mapFinishInfoItems$1.L$4;
                        fef fefVar9 = (fef) scootersFinishInfoMapper$mapFinishInfoItems$1.L$0;
                        kotlin.b.b(obj);
                        scootersFinishInfoMapper$mapFinishInfoItems$12 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                        charSequence10 = charSequence16;
                        fefVar6 = fefVar9;
                        formattedText = formattedText5;
                        k7x0Var = k7x0Var2;
                        str5 = str7;
                        it4 = it7;
                        charSequence9 = charSequence15;
                        arrayList4 = r14;
                        erVar3 = erVar5;
                        str = str8;
                        CharSequence charSequence17 = (CharSequence) obj;
                        if (formattedText3 == null) {
                        }
                    } else {
                        if (i == 4) {
                            str2 = (String) scootersFinishInfoMapper$mapFinishInfoItems$1.L$23;
                            charSequence8 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$22;
                            charSequence7 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$21;
                            str4 = (String) scootersFinishInfoMapper$mapFinishInfoItems$1.L$20;
                            charSequence6 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$19;
                            formattedText2 = (FormattedText) scootersFinishInfoMapper$mapFinishInfoItems$1.L$17;
                            erVar2 = (er) scootersFinishInfoMapper$mapFinishInfoItems$1.L$14;
                            it3 = (Iterator) scootersFinishInfoMapper$mapFinishInfoItems$1.L$6;
                            ?? r142 = (Collection) scootersFinishInfoMapper$mapFinishInfoItems$1.L$4;
                            fefVar5 = (fef) scootersFinishInfoMapper$mapFinishInfoItems$1.L$0;
                            kotlin.b.b(obj);
                            k7x0Var = k7x0Var2;
                            arrayList3 = r142;
                            er erVar6 = erVar2;
                            str = str4;
                            erVar = erVar6;
                            arrayList2 = arrayList3;
                            scootersFinishInfoMapper$mapFinishInfoItems$13 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                            fefVar3 = fefVar5;
                            formattedText = formattedText2;
                            charSequence = charSequence7;
                            charSequence3 = charSequence6;
                            charSequence2 = charSequence8;
                            charSequence4 = (CharSequence) obj;
                            it2 = it3;
                            ru.yandex.taxi.widget.c cVar2 = dVar2.d;
                            FormattedText c2 = f9s.c(xdfVar, fefVar3, formattedText);
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$0 = fefVar3;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$1 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$2 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$3 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$4 = arrayList2;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$5 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$6 = it2;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$7 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$8 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$9 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$10 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$11 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$12 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$13 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$14 = erVar;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$15 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$16 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$17 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$18 = null;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$19 = charSequence3;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$20 = charSequence4;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$21 = str;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$22 = charSequence;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$23 = charSequence2;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$24 = str2;
                            str3 = str;
                            scootersFinishInfoMapper$mapFinishInfoItems$13.label = 5;
                            dmn0Var2 = null;
                            charSequence5 = charSequence;
                            CharSequence charSequence18 = charSequence2;
                            e = ru.yandex.taxi.widget.c.e(cVar2, c2, null, false, scootersFinishInfoMapper$mapFinishInfoItems$13, 30);
                            if (e != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) scootersFinishInfoMapper$mapFinishInfoItems$1.L$24;
                        CharSequence charSequence19 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$23;
                        CharSequence charSequence20 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$22;
                        String str9 = (String) scootersFinishInfoMapper$mapFinishInfoItems$1.L$21;
                        CharSequence charSequence21 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$20;
                        CharSequence charSequence22 = (CharSequence) scootersFinishInfoMapper$mapFinishInfoItems$1.L$19;
                        erVar = (er) scootersFinishInfoMapper$mapFinishInfoItems$1.L$14;
                        Iterator it8 = (Iterator) scootersFinishInfoMapper$mapFinishInfoItems$1.L$6;
                        ?? r11 = (Collection) scootersFinishInfoMapper$mapFinishInfoItems$1.L$4;
                        fef fefVar10 = (fef) scootersFinishInfoMapper$mapFinishInfoItems$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence23 = charSequence21;
                        CharSequence charSequence24 = charSequence22;
                        k7x0Var = k7x0Var2;
                        Iterator it9 = it8;
                        charSequence5 = charSequence20;
                        dmn0Var2 = null;
                        fefVar4 = fefVar10;
                        str3 = str9;
                        CharSequence charSequence25 = charSequence19;
                        ArrayList arrayList5 = r11;
                        scootersFinishInfoMapper$mapFinishInfoItems$12 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                        dmn0Var3 = new cmn0(charSequence25, charSequence5, str3, new s7n0(charSequence24, charSequence23, (CharSequence) obj, ((qp) erVar).a.e, str2, "ScootersFinishItemDialogCard"));
                        arrayList = arrayList5;
                        it = it9;
                        fefVar2 = fefVar4;
                        if (dmn0Var3 != null) {
                            arrayList.add(dmn0Var3);
                        }
                        dVar2 = dVar;
                        k7x0Var2 = k7x0Var;
                        dmn0Var = dmn0Var2;
                        if (!it.hasNext()) {
                            return arrayList;
                        }
                        harVar2 = (har) it.next();
                        FormattedText formattedText6 = harVar2.b;
                        if (formattedText6 != null) {
                            FormattedText formattedText7 = harVar2.c;
                            if (formattedText7 == null) {
                                formattedText7 = FormattedText.c;
                            }
                            FormattedText formattedText8 = formattedText7;
                            ru.yandex.taxi.widget.c cVar3 = dVar2.d;
                            FormattedText c3 = f9s.c(xdfVar, fefVar2, formattedText6);
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$0 = fefVar2;
                            dmn0 dmn0Var4 = dmn0Var;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$1 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$2 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$3 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$4 = arrayList;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$5 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$6 = it;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$7 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$8 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$9 = harVar2;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$10 = formattedText8;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$11 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$12 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$13 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$14 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$15 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$16 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$17 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$18 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$19 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$20 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$21 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$22 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$23 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.L$24 = dmn0Var4;
                            scootersFinishInfoMapper$mapFinishInfoItems$12.label = 1;
                            Object e3 = ru.yandex.taxi.widget.c.e(cVar3, c3, null, false, scootersFinishInfoMapper$mapFinishInfoItems$12, 30);
                            if (e3 != coroutineSingletons) {
                                fefVar4 = fefVar2;
                                obj = e3;
                                formattedText4 = formattedText8;
                                CharSequence charSequence122 = (CharSequence) obj;
                                ru.yandex.taxi.widget.c cVar4 = dVar2.d;
                                FormattedText c4 = f9s.c(xdfVar, fefVar4, formattedText4);
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$0 = fefVar4;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$1 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$2 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$3 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$4 = arrayList;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$5 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$6 = it;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$7 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$8 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$9 = harVar2;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$10 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$11 = null;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$12 = charSequence122;
                                scootersFinishInfoMapper$mapFinishInfoItems$12.label = 2;
                                e2 = ru.yandex.taxi.widget.c.e(cVar4, c4, null, false, scootersFinishInfoMapper$mapFinishInfoItems$12, 30);
                                if (e2 != coroutineSingletons) {
                                    charSequence11 = charSequence122;
                                    obj = e2;
                                    harVar = harVar2;
                                    CharSequence charSequence142 = (CharSequence) obj;
                                    String str62 = harVar.a;
                                    String a = str62 == null ? ((m7x0) k7x0Var2).a(str62) : null;
                                    erVar4 = harVar.d;
                                    if (erVar4 instanceof wo) {
                                        charSequence9 = charSequence11;
                                        String str10 = a;
                                        if (erVar4 instanceof qp) {
                                            qp.a aVar = ((qp) erVar4).a;
                                            FormattedText formattedText9 = aVar.b;
                                            FormattedText formattedText10 = aVar.c;
                                            formattedText = aVar.d;
                                            if (formattedText9 == null || formattedText == null) {
                                                k7x0Var = k7x0Var2;
                                                dmn0Var2 = null;
                                                dmn0Var3 = new dmn0(charSequence9, charSequence142, str10);
                                            } else {
                                                String str11 = aVar.a;
                                                k7x0Var = k7x0Var2;
                                                String a2 = str11 != null ? ((m7x0) k7x0Var).a(str11) : null;
                                                ru.yandex.taxi.widget.c cVar5 = dVar2.d;
                                                FormattedText c5 = f9s.c(xdfVar, fefVar4, formattedText9);
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$0 = fefVar4;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$1 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$2 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$3 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$4 = arrayList;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$5 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$6 = it;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$7 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$8 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$9 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$10 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$11 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$12 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$13 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$14 = erVar4;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$15 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$16 = formattedText10;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$17 = formattedText;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$18 = null;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$19 = str10;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$20 = charSequence142;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$21 = charSequence9;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.L$22 = a2;
                                                scootersFinishInfoMapper$mapFinishInfoItems$12.label = 3;
                                                String str12 = a2;
                                                Object e4 = ru.yandex.taxi.widget.c.e(cVar5, c5, null, false, scootersFinishInfoMapper$mapFinishInfoItems$12, 30);
                                                if (e4 != coroutineSingletons) {
                                                    Iterator it10 = it;
                                                    charSequence10 = charSequence142;
                                                    obj = e4;
                                                    it4 = it10;
                                                    arrayList4 = arrayList;
                                                    fefVar6 = fefVar4;
                                                    formattedText3 = formattedText10;
                                                    erVar3 = erVar4;
                                                    str = str10;
                                                    str5 = str12;
                                                    CharSequence charSequence172 = (CharSequence) obj;
                                                    if (formattedText3 == null) {
                                                        FormattedText c6 = f9s.c(xdfVar, fefVar6, formattedText3);
                                                        ru.yandex.taxi.widget.c cVar6 = dVar2.d;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$0 = fefVar6;
                                                        fef fefVar11 = fefVar6;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$1 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$2 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$3 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$4 = arrayList4;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$5 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$6 = it4;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$7 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$8 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$9 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$10 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$11 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$12 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$13 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$14 = erVar3;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$15 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$16 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$17 = formattedText;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$18 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$19 = charSequence172;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$20 = str;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$21 = charSequence10;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$22 = charSequence9;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$23 = str5;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.L$24 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$12.label = 4;
                                                        ArrayList arrayList6 = arrayList4;
                                                        Iterator it11 = it4;
                                                        Object e5 = ru.yandex.taxi.widget.c.e(cVar6, c6, null, false, scootersFinishInfoMapper$mapFinishInfoItems$12, 30);
                                                        if (e5 != coroutineSingletons) {
                                                            charSequence7 = charSequence10;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$1 = scootersFinishInfoMapper$mapFinishInfoItems$12;
                                                            str4 = str;
                                                            charSequence8 = charSequence9;
                                                            erVar2 = erVar3;
                                                            formattedText2 = formattedText;
                                                            fefVar5 = fefVar11;
                                                            arrayList3 = arrayList6;
                                                            it3 = it11;
                                                            charSequence6 = charSequence172;
                                                            obj = e5;
                                                            str2 = str5;
                                                            er erVar62 = erVar2;
                                                            str = str4;
                                                            erVar = erVar62;
                                                            arrayList2 = arrayList3;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                                                            fefVar3 = fefVar5;
                                                            formattedText = formattedText2;
                                                            charSequence = charSequence7;
                                                            charSequence3 = charSequence6;
                                                            charSequence2 = charSequence8;
                                                            charSequence4 = (CharSequence) obj;
                                                            it2 = it3;
                                                            ru.yandex.taxi.widget.c cVar22 = dVar2.d;
                                                            FormattedText c22 = f9s.c(xdfVar, fefVar3, formattedText);
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$0 = fefVar3;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$1 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$2 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$3 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$4 = arrayList2;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$5 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$6 = it2;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$7 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$8 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$9 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$10 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$11 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$12 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$13 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$14 = erVar;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$15 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$16 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$17 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$18 = null;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$19 = charSequence3;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$20 = charSequence4;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$21 = str;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$22 = charSequence;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$23 = charSequence2;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.L$24 = str2;
                                                            str3 = str;
                                                            scootersFinishInfoMapper$mapFinishInfoItems$13.label = 5;
                                                            dmn0Var2 = null;
                                                            charSequence5 = charSequence;
                                                            CharSequence charSequence182 = charSequence2;
                                                            e = ru.yandex.taxi.widget.c.e(cVar22, c22, null, false, scootersFinishInfoMapper$mapFinishInfoItems$13, 30);
                                                            if (e != coroutineSingletons) {
                                                                ScootersFinishInfoMapper$mapFinishInfoItems$1 scootersFinishInfoMapper$mapFinishInfoItems$14 = scootersFinishInfoMapper$mapFinishInfoItems$13;
                                                                fefVar4 = fefVar3;
                                                                scootersFinishInfoMapper$mapFinishInfoItems$1 = scootersFinishInfoMapper$mapFinishInfoItems$14;
                                                                CharSequence charSequence26 = charSequence3;
                                                                charSequence23 = charSequence4;
                                                                charSequence24 = charSequence26;
                                                                arrayList5 = arrayList2;
                                                                charSequence25 = charSequence182;
                                                                it9 = it2;
                                                                obj = e;
                                                                scootersFinishInfoMapper$mapFinishInfoItems$12 = scootersFinishInfoMapper$mapFinishInfoItems$1;
                                                                dmn0Var3 = new cmn0(charSequence25, charSequence5, str3, new s7n0(charSequence24, charSequence23, (CharSequence) obj, ((qp) erVar).a.e, str2, "ScootersFinishItemDialogCard"));
                                                                arrayList = arrayList5;
                                                                it = it9;
                                                            }
                                                        }
                                                    } else {
                                                        Iterator it12 = it4;
                                                        fef fefVar12 = fefVar6;
                                                        charSequence3 = charSequence172;
                                                        str2 = str5;
                                                        charSequence = charSequence10;
                                                        erVar = erVar3;
                                                        fefVar3 = fefVar12;
                                                        arrayList2 = arrayList4;
                                                        it2 = it12;
                                                        charSequence4 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13 = scootersFinishInfoMapper$mapFinishInfoItems$12;
                                                        charSequence2 = charSequence9;
                                                        ru.yandex.taxi.widget.c cVar222 = dVar2.d;
                                                        FormattedText c222 = f9s.c(xdfVar, fefVar3, formattedText);
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$0 = fefVar3;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$1 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$2 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$3 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$4 = arrayList2;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$5 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$6 = it2;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$7 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$8 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$9 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$10 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$11 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$12 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$13 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$14 = erVar;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$15 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$16 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$17 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$18 = null;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$19 = charSequence3;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$20 = charSequence4;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$21 = str;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$22 = charSequence;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$23 = charSequence2;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.L$24 = str2;
                                                        str3 = str;
                                                        scootersFinishInfoMapper$mapFinishInfoItems$13.label = 5;
                                                        dmn0Var2 = null;
                                                        charSequence5 = charSequence;
                                                        CharSequence charSequence1822 = charSequence2;
                                                        e = ru.yandex.taxi.widget.c.e(cVar222, c222, null, false, scootersFinishInfoMapper$mapFinishInfoItems$13, 30);
                                                        if (e != coroutineSingletons) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            k7x0Var = k7x0Var2;
                                            dmn0Var2 = null;
                                            dmn0Var3 = new dmn0(charSequence9, charSequence142, str10);
                                        }
                                    } else {
                                        wo.a aVar2 = ((wo) erVar4).a;
                                        dmn0Var3 = new bmn0(charSequence11, charSequence142, a, aVar2.a, aVar2.b);
                                        dmn0Var2 = null;
                                        k7x0Var = k7x0Var2;
                                    }
                                    fefVar2 = fefVar4;
                                    if (dmn0Var3 != null) {
                                    }
                                    dVar2 = dVar;
                                    k7x0Var2 = k7x0Var;
                                    dmn0Var = dmn0Var2;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        k7x0Var = k7x0Var2;
                        dmn0Var3 = dmn0Var;
                        dmn0Var2 = dmn0Var3;
                        if (dmn0Var3 != null) {
                        }
                        dVar2 = dVar;
                        k7x0Var2 = k7x0Var;
                        dmn0Var = dmn0Var2;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        scootersFinishInfoMapper$mapFinishInfoItems$1 = new ScootersFinishInfoMapper$mapFinishInfoItems$1(dVar2, continuationImpl);
        Object obj2 = scootersFinishInfoMapper$mapFinishInfoItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishInfoMapper$mapFinishInfoItems$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r14 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, kmu.c.a aVar, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersFinishInfoMapper$mapToStatisticsItem$1 scootersFinishInfoMapper$mapToStatisticsItem$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        xdf xdfVar = dVar.c;
        if (continuationImpl instanceof ScootersFinishInfoMapper$mapToStatisticsItem$1) {
            scootersFinishInfoMapper$mapToStatisticsItem$1 = (ScootersFinishInfoMapper$mapToStatisticsItem$1) continuationImpl;
            int i2 = scootersFinishInfoMapper$mapToStatisticsItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishInfoMapper$mapToStatisticsItem$1.label = i2 - Integer.MIN_VALUE;
                ScootersFinishInfoMapper$mapToStatisticsItem$1 scootersFinishInfoMapper$mapToStatisticsItem$12 = scootersFinishInfoMapper$mapToStatisticsItem$1;
                Object obj = scootersFinishInfoMapper$mapToStatisticsItem$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishInfoMapper$mapToStatisticsItem$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = dVar.d;
                    FormattedText c = f9s.c(xdfVar, fefVar, aVar.a);
                    scootersFinishInfoMapper$mapToStatisticsItem$12.L$0 = aVar;
                    scootersFinishInfoMapper$mapToStatisticsItem$12.L$1 = fefVar;
                    scootersFinishInfoMapper$mapToStatisticsItem$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, c, null, false, scootersFinishInfoMapper$mapToStatisticsItem$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersFinishInfoMapper$mapToStatisticsItem$12.L$2;
                        kotlin.b.b(obj);
                        return new fmn0(charSequence, (CharSequence) obj);
                    }
                    fefVar = (fef) scootersFinishInfoMapper$mapToStatisticsItem$12.L$1;
                    aVar = (kmu.c.a) scootersFinishInfoMapper$mapToStatisticsItem$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = dVar.d;
                FormattedText c2 = f9s.c(xdfVar, fefVar, aVar.b);
                scootersFinishInfoMapper$mapToStatisticsItem$12.L$0 = null;
                scootersFinishInfoMapper$mapToStatisticsItem$12.L$1 = null;
                scootersFinishInfoMapper$mapToStatisticsItem$12.L$2 = charSequence2;
                scootersFinishInfoMapper$mapToStatisticsItem$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(cVar2, c2, null, false, scootersFinishInfoMapper$mapToStatisticsItem$12, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence2;
                    return new fmn0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersFinishInfoMapper$mapToStatisticsItem$1 = new ScootersFinishInfoMapper$mapToStatisticsItem$1(dVar, continuationImpl);
        ScootersFinishInfoMapper$mapToStatisticsItem$1 scootersFinishInfoMapper$mapToStatisticsItem$122 = scootersFinishInfoMapper$mapToStatisticsItem$1;
        Object obj2 = scootersFinishInfoMapper$mapToStatisticsItem$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishInfoMapper$mapToStatisticsItem$122.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar22 = dVar.d;
        FormattedText c22 = f9s.c(xdfVar, fefVar, aVar.b);
        scootersFinishInfoMapper$mapToStatisticsItem$122.L$0 = null;
        scootersFinishInfoMapper$mapToStatisticsItem$122.L$1 = null;
        scootersFinishInfoMapper$mapToStatisticsItem$122.L$2 = charSequence22;
        scootersFinishInfoMapper$mapToStatisticsItem$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(cVar22, c22, null, false, scootersFinishInfoMapper$mapToStatisticsItem$122, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object c(zuo0 zuo0Var, bmu bmuVar, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, Continuation continuation) {
        return bvf0.n(new ScootersFinishInfoMapper$mapToFinishInfo$2(bmuVar, this, zuo0Var, feedbackSettingsParams$Screen, null), continuation);
    }
}
