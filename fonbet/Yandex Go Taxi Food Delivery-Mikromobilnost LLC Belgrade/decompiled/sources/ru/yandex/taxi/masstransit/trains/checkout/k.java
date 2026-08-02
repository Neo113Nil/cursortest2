package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.avj0;
import defpackage.be40;
import defpackage.ce40;
import defpackage.d9s;
import defpackage.db40;
import defpackage.di40;
import defpackage.ei40;
import defpackage.fef;
import defpackage.fi40;
import defpackage.gi40;
import defpackage.hb40;
import defpackage.ib40;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mja1;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ud40;
import defpackage.vb40;
import defpackage.wf40;
import defpackage.wh40;
import defpackage.wi70;
import defpackage.xdf;
import defpackage.y940;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class k {
    public final ru.yandex.taxi.widget.c a;
    public final xdf b;
    public final zuj0 c;

    public k(xdf xdfVar, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
        this.b = xdfVar;
        this.c = zuj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r10 == r13) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k kVar, vb40.e eVar, vb40.e eVar2, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object i2;
        CharSequence charSequence;
        vb40.e eVar3;
        Object i3;
        CharSequence charSequence2;
        Object i4;
        CharSequence charSequence3;
        CharSequence charSequence4;
        kVar.getClass();
        ru.yandex.taxi.widget.c cVar = kVar.a;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1) continuationImpl;
            int i5 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = i5 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = eVar.b;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = eVar;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = eVar2;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2;
                            eVar2 = (vb40.e) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1;
                            kotlin.b.b(obj);
                            eVar3 = eVar2;
                            CharSequence charSequence5 = (CharSequence) obj;
                            FormattedText formattedText2 = eVar3.a;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = eVar3;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2 = charSequence;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$3 = charSequence5;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 3;
                            i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
                            if (i3 != coroutineSingletons) {
                                charSequence2 = charSequence5;
                                obj = i3;
                                CharSequence charSequence6 = (CharSequence) obj;
                                FormattedText formattedText3 = eVar3.b;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2 = charSequence;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$3 = charSequence2;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$4 = charSequence6;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 4;
                                i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
                                if (i4 != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence4 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$4;
                            charSequence2 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$3;
                            charSequence3 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2;
                            kotlin.b.b(obj);
                            return new di40(charSequence2, charSequence3, charSequence4, (CharSequence) obj);
                        }
                        CharSequence charSequence7 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$3;
                        CharSequence charSequence8 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2;
                        eVar3 = (vb40.e) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1;
                        kotlin.b.b(obj);
                        charSequence2 = charSequence7;
                        charSequence = charSequence8;
                        CharSequence charSequence62 = (CharSequence) obj;
                        FormattedText formattedText32 = eVar3.b;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2 = charSequence;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$3 = charSequence2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$4 = charSequence62;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 4;
                        i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText32, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
                        if (i4 != coroutineSingletons) {
                            charSequence3 = charSequence;
                            charSequence4 = charSequence62;
                            obj = i4;
                            return new di40(charSequence2, charSequence3, charSequence4, (CharSequence) obj);
                        }
                        return coroutineSingletons;
                    }
                    eVar2 = (vb40.e) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1;
                    eVar = (vb40.e) mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence9 = (CharSequence) obj;
                FormattedText formattedText4 = eVar.a;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = null;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = eVar2;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2 = charSequence9;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
                if (i2 != coroutineSingletons) {
                    charSequence = charSequence9;
                    obj = i2;
                    eVar3 = eVar2;
                    CharSequence charSequence52 = (CharSequence) obj;
                    FormattedText formattedText22 = eVar3.a;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = eVar3;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2 = charSequence;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$3 = charSequence52;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 3;
                    i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
                    if (i3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1(kVar, continuationImpl);
        Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label;
        if (i != 0) {
        }
        CharSequence charSequence92 = (CharSequence) obj2;
        FormattedText formattedText42 = eVar.a;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$0 = null;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$1 = eVar2;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.L$2 = charSequence92;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText42, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDateSection$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e3, code lost:
    
        if (r0 == r2) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x031e -> B:12:0x032b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(k kVar, vb40.f fVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1;
        Map map;
        ovi0 a;
        int i;
        Object obj;
        Object i2;
        vb40.f fVar2;
        CharSequence charSequence;
        ovi0 ovi0Var;
        Object obj2;
        CharSequence charSequence2;
        vb40.b bVar;
        Boolean bool;
        CharSequence charSequence3;
        Boolean bool2;
        vb40.f fVar3;
        ovi0 ovi0Var2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        FormattedText formattedText;
        Object i3;
        vb40.b bVar2;
        vb40.f fVar4;
        ovi0 ovi0Var3;
        CharSequence charSequence6;
        CharSequence charSequence7;
        Boolean bool3;
        CharSequence charSequence8;
        CharSequence charSequence9;
        vb40.c cVar;
        FormattedText formattedText2;
        Object obj3;
        vb40.b bVar3;
        vb40.f fVar5;
        ovi0 ovi0Var4;
        CharSequence charSequence10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        vb40.c cVar2;
        FormattedText formattedText3;
        CharSequence charSequence13;
        Object obj4;
        Boolean bool4;
        CharSequence charSequence14;
        vb40.b bVar4;
        CharSequence charSequence15;
        ArrayList arrayList;
        vb40.c cVar3;
        List list;
        ArrayList arrayList2;
        Iterator it;
        vb40.d dVar;
        ovi0 ovi0Var5;
        Object obj5;
        CharSequence charSequence16;
        String str;
        Boolean bool5;
        Iterator it2;
        CharSequence charSequence17;
        ArrayList arrayList3;
        CharSequence charSequence18;
        CharSequence charSequence19;
        CharSequence charSequence20;
        ArrayList arrayList4;
        Object obj6;
        Object i4;
        ArrayList arrayList5;
        ovi0 ovi0Var6;
        CharSequence charSequence21;
        Object obj7;
        Iterator it3;
        CharSequence charSequence22;
        MtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$12;
        ArrayList arrayList6;
        vb40.f fVar6 = fVar;
        kVar.getClass();
        ru.yandex.taxi.widget.c cVar4 = kVar.a;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1) continuationImpl;
            int i5 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = i5 - Integer.MIN_VALUE;
                Object obj8 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label) {
                    case 0:
                        kotlin.b.b(obj8);
                        String str2 = fVar6.a;
                        map = null;
                        a = str2 != null ? mja1.a(str2, null, 6) : null;
                        FormattedText formattedText4 = fVar6.b;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = fVar6;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = a;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 1;
                        i = 30;
                        Object i6 = ru.yandex.taxi.widget.c.i(cVar4, formattedText4, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                        if (i6 != coroutineSingletons) {
                            obj = i6;
                            CharSequence charSequence23 = (CharSequence) obj;
                            FormattedText formattedText5 = fVar6.c;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = fVar6;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = a;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = charSequence23;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 2;
                            i2 = ru.yandex.taxi.widget.c.i(cVar4, formattedText5, map, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, i);
                            if (i2 != coroutineSingletons) {
                                fVar2 = fVar6;
                                charSequence = charSequence23;
                                ovi0Var = a;
                                obj2 = i2;
                                charSequence2 = (CharSequence) obj2;
                                bVar = fVar2.d;
                                bool = bVar == null ? bVar.c : null;
                                if (bVar == null && (formattedText = bVar.a) != null) {
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = fVar2;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = ovi0Var;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3 = charSequence;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4 = charSequence2;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5 = bool;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 3;
                                    i3 = ru.yandex.taxi.widget.c.i(cVar4, formattedText, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                                    break;
                                } else {
                                    CharSequence charSequence24 = charSequence;
                                    charSequence3 = charSequence2;
                                    bool2 = bool;
                                    fVar3 = fVar2;
                                    ovi0Var2 = ovi0Var;
                                    charSequence4 = charSequence24;
                                    charSequence5 = null;
                                    bVar2 = fVar3.d;
                                    if (bVar2 != null || (cVar = bVar2.b) == null || (formattedText2 = cVar.a) == null) {
                                        fVar4 = fVar3;
                                        ovi0Var3 = ovi0Var2;
                                        charSequence6 = charSequence4;
                                        charSequence7 = charSequence3;
                                        bool3 = bool2;
                                        charSequence8 = charSequence5;
                                        charSequence9 = null;
                                        bVar3 = fVar4.d;
                                        if (bVar3 != null || (cVar2 = bVar3.b) == null || (formattedText3 = cVar2.b) == null) {
                                            fVar5 = fVar4;
                                            ovi0Var4 = ovi0Var3;
                                            charSequence10 = charSequence6;
                                            charSequence11 = charSequence7;
                                            charSequence12 = null;
                                            bVar4 = fVar5.d;
                                            if (bVar4 != null || (cVar3 = bVar4.b) == null || (list = cVar3.c) == null) {
                                                charSequence15 = charSequence10;
                                                arrayList = null;
                                                return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                                            }
                                            List list2 = list;
                                            arrayList2 = new ArrayList(tcc.n(list2, 10));
                                            it = list2.iterator();
                                            if (it.hasNext()) {
                                                dVar = (vb40.d) it.next();
                                                String str3 = dVar.a;
                                                FormattedText formattedText6 = dVar.b;
                                                obj5 = null;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = null;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = null;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = null;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3 = arrayList2;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4 = it;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5 = null;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6 = dVar;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7 = str3;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$8 = ovi0Var4;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$9 = charSequence10;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$10 = charSequence11;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$11 = bool3;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$12 = charSequence8;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$13 = charSequence9;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$14 = charSequence12;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$15 = arrayList2;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$16 = null;
                                                CharSequence charSequence25 = charSequence9;
                                                mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 6;
                                                Object i7 = ru.yandex.taxi.widget.c.i(cVar4, formattedText6, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                                                if (i7 != coroutineSingletons) {
                                                    ovi0Var5 = ovi0Var4;
                                                    obj6 = i7;
                                                    charSequence19 = charSequence25;
                                                    charSequence18 = charSequence10;
                                                    arrayList3 = arrayList2;
                                                    bool5 = bool3;
                                                    charSequence20 = charSequence12;
                                                    str = str3;
                                                    charSequence17 = charSequence11;
                                                    it2 = it;
                                                    charSequence16 = charSequence8;
                                                    arrayList4 = arrayList3;
                                                    CharSequence charSequence26 = (CharSequence) obj6;
                                                    FormattedText formattedText7 = dVar.c;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = obj5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = obj5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = obj5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3 = arrayList3;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4 = it2;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5 = obj5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6 = obj5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7 = str;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$8 = charSequence26;
                                                    ovi0 ovi0Var7 = ovi0Var5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$9 = ovi0Var7;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$10 = charSequence18;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$11 = charSequence17;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$12 = bool5;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$13 = charSequence16;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$14 = charSequence19;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$15 = charSequence20;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$16 = arrayList4;
                                                    mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 7;
                                                    ArrayList arrayList7 = arrayList4;
                                                    i4 = ru.yandex.taxi.widget.c.i(cVar4, formattedText7, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                                                    if (i4 != coroutineSingletons) {
                                                        arrayList5 = arrayList3;
                                                        charSequence10 = charSequence18;
                                                        ovi0Var6 = ovi0Var7;
                                                        charSequence21 = charSequence26;
                                                        obj7 = i4;
                                                        it3 = it2;
                                                        charSequence22 = charSequence20;
                                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$12 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1;
                                                        arrayList6 = arrayList7;
                                                        arrayList6.add(new ce40(charSequence21, (CharSequence) obj7, str));
                                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$12;
                                                        charSequence12 = charSequence22;
                                                        charSequence9 = charSequence19;
                                                        charSequence8 = charSequence16;
                                                        bool3 = bool5;
                                                        it = it3;
                                                        charSequence11 = charSequence17;
                                                        ovi0Var4 = ovi0Var6;
                                                        arrayList2 = arrayList5;
                                                        coroutineSingletons = coroutineSingletons;
                                                        if (it.hasNext()) {
                                                            charSequence15 = charSequence10;
                                                            arrayList = arrayList2;
                                                            charSequence9 = charSequence9;
                                                            return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = fVar4;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = ovi0Var3;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3 = charSequence6;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4 = charSequence7;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5 = bool3;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6 = charSequence8;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7 = charSequence9;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 5;
                                            Object i8 = ru.yandex.taxi.widget.c.i(cVar4, formattedText3, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                                            if (i8 != coroutineSingletons) {
                                                CharSequence charSequence27 = charSequence8;
                                                charSequence13 = charSequence9;
                                                obj4 = i8;
                                                fVar5 = fVar4;
                                                ovi0Var4 = ovi0Var3;
                                                charSequence10 = charSequence6;
                                                charSequence11 = charSequence7;
                                                bool4 = bool3;
                                                charSequence14 = charSequence27;
                                                Boolean bool6 = bool4;
                                                charSequence12 = (CharSequence) obj4;
                                                charSequence9 = charSequence13;
                                                charSequence8 = charSequence14;
                                                bool3 = bool6;
                                                bVar4 = fVar5.d;
                                                if (bVar4 != null) {
                                                }
                                                charSequence15 = charSequence10;
                                                arrayList = null;
                                                return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                                            }
                                        }
                                    } else {
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = fVar3;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = ovi0Var2;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3 = charSequence4;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4 = charSequence3;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5 = bool2;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6 = charSequence5;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 4;
                                        Object i9 = ru.yandex.taxi.widget.c.i(cVar4, formattedText2, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                                        if (i9 != coroutineSingletons) {
                                            Boolean bool7 = bool2;
                                            charSequence8 = charSequence5;
                                            obj3 = i9;
                                            fVar4 = fVar3;
                                            ovi0Var3 = ovi0Var2;
                                            charSequence6 = charSequence4;
                                            charSequence7 = charSequence3;
                                            bool3 = bool7;
                                            charSequence9 = (CharSequence) obj3;
                                            bVar3 = fVar4.d;
                                            if (bVar3 != null) {
                                            }
                                            fVar5 = fVar4;
                                            ovi0Var4 = ovi0Var3;
                                            charSequence10 = charSequence6;
                                            charSequence11 = charSequence7;
                                            charSequence12 = null;
                                            bVar4 = fVar5.d;
                                            if (bVar4 != null) {
                                            }
                                            charSequence15 = charSequence10;
                                            arrayList = null;
                                            return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        obj = obj8;
                        a = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1;
                        fVar6 = (vb40.f) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0;
                        kotlin.b.b(obj);
                        map = null;
                        i = 30;
                        CharSequence charSequence232 = (CharSequence) obj;
                        FormattedText formattedText52 = fVar6.c;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = fVar6;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = a;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = charSequence232;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 2;
                        i2 = ru.yandex.taxi.widget.c.i(cVar4, formattedText52, map, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, i);
                        if (i2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        CharSequence charSequence28 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2;
                        ovi0 ovi0Var8 = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1;
                        vb40.f fVar7 = (vb40.f) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0;
                        kotlin.b.b(obj8);
                        ovi0Var = ovi0Var8;
                        fVar2 = fVar7;
                        charSequence = charSequence28;
                        obj2 = obj8;
                        charSequence2 = (CharSequence) obj2;
                        bVar = fVar2.d;
                        if (bVar == null) {
                        }
                        if (bVar == null) {
                            break;
                        }
                        CharSequence charSequence242 = charSequence;
                        charSequence3 = charSequence2;
                        bool2 = bool;
                        fVar3 = fVar2;
                        ovi0Var2 = ovi0Var;
                        charSequence4 = charSequence242;
                        charSequence5 = null;
                        bVar2 = fVar3.d;
                        if (bVar2 != null) {
                            break;
                        }
                        fVar4 = fVar3;
                        ovi0Var3 = ovi0Var2;
                        charSequence6 = charSequence4;
                        charSequence7 = charSequence3;
                        bool3 = bool2;
                        charSequence8 = charSequence5;
                        charSequence9 = null;
                        bVar3 = fVar4.d;
                        if (bVar3 != null) {
                        }
                        fVar5 = fVar4;
                        ovi0Var4 = ovi0Var3;
                        charSequence10 = charSequence6;
                        charSequence11 = charSequence7;
                        charSequence12 = null;
                        bVar4 = fVar5.d;
                        if (bVar4 != null) {
                        }
                        charSequence15 = charSequence10;
                        arrayList = null;
                        return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                    case 3:
                        Boolean bool8 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5;
                        charSequence2 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4;
                        charSequence = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3;
                        ovi0Var = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2;
                        fVar2 = (vb40.f) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0;
                        kotlin.b.b(obj8);
                        bool = bool8;
                        i3 = obj8;
                        charSequence5 = (CharSequence) i3;
                        CharSequence charSequence29 = charSequence;
                        charSequence3 = charSequence2;
                        bool2 = bool;
                        fVar3 = fVar2;
                        ovi0Var2 = ovi0Var;
                        charSequence4 = charSequence29;
                        bVar2 = fVar3.d;
                        if (bVar2 != null) {
                        }
                        fVar4 = fVar3;
                        ovi0Var3 = ovi0Var2;
                        charSequence6 = charSequence4;
                        charSequence7 = charSequence3;
                        bool3 = bool2;
                        charSequence8 = charSequence5;
                        charSequence9 = null;
                        bVar3 = fVar4.d;
                        if (bVar3 != null) {
                        }
                        fVar5 = fVar4;
                        ovi0Var4 = ovi0Var3;
                        charSequence10 = charSequence6;
                        charSequence11 = charSequence7;
                        charSequence12 = null;
                        bVar4 = fVar5.d;
                        if (bVar4 != null) {
                        }
                        charSequence15 = charSequence10;
                        arrayList = null;
                        return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                    case 4:
                        CharSequence charSequence30 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6;
                        Boolean bool9 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5;
                        CharSequence charSequence31 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4;
                        CharSequence charSequence32 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3;
                        ovi0 ovi0Var9 = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2;
                        vb40.f fVar8 = (vb40.f) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0;
                        kotlin.b.b(obj8);
                        fVar4 = fVar8;
                        ovi0Var3 = ovi0Var9;
                        charSequence6 = charSequence32;
                        charSequence7 = charSequence31;
                        bool3 = bool9;
                        charSequence8 = charSequence30;
                        obj3 = obj8;
                        charSequence9 = (CharSequence) obj3;
                        bVar3 = fVar4.d;
                        if (bVar3 != null) {
                        }
                        fVar5 = fVar4;
                        ovi0Var4 = ovi0Var3;
                        charSequence10 = charSequence6;
                        charSequence11 = charSequence7;
                        charSequence12 = null;
                        bVar4 = fVar5.d;
                        if (bVar4 != null) {
                        }
                        charSequence15 = charSequence10;
                        arrayList = null;
                        return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                    case 5:
                        CharSequence charSequence33 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7;
                        CharSequence charSequence34 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6;
                        Boolean bool10 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5;
                        CharSequence charSequence35 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4;
                        CharSequence charSequence36 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3;
                        ovi0 ovi0Var10 = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2;
                        vb40.f fVar9 = (vb40.f) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0;
                        kotlin.b.b(obj8);
                        fVar5 = fVar9;
                        ovi0Var4 = ovi0Var10;
                        charSequence10 = charSequence36;
                        charSequence11 = charSequence35;
                        bool4 = bool10;
                        charSequence14 = charSequence34;
                        charSequence13 = charSequence33;
                        obj4 = obj8;
                        Boolean bool62 = bool4;
                        charSequence12 = (CharSequence) obj4;
                        charSequence9 = charSequence13;
                        charSequence8 = charSequence14;
                        bool3 = bool62;
                        bVar4 = fVar5.d;
                        if (bVar4 != null) {
                        }
                        charSequence15 = charSequence10;
                        arrayList = null;
                        return new gi40(ovi0Var4, charSequence15, charSequence11, bool3, charSequence8, new be40(charSequence9, charSequence12, arrayList));
                    case 6:
                        ?? r0 = (Collection) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$15;
                        CharSequence charSequence37 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$14;
                        CharSequence charSequence38 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$13;
                        CharSequence charSequence39 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$12;
                        Boolean bool11 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$11;
                        CharSequence charSequence40 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$10;
                        CharSequence charSequence41 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$9;
                        ovi0 ovi0Var11 = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$8;
                        String str4 = (String) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7;
                        dVar = (vb40.d) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6;
                        Iterator it4 = (Iterator) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4;
                        ?? r14 = (Collection) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3;
                        kotlin.b.b(obj8);
                        ovi0Var5 = ovi0Var11;
                        obj5 = null;
                        charSequence16 = charSequence39;
                        str = str4;
                        bool5 = bool11;
                        it2 = it4;
                        charSequence17 = charSequence40;
                        arrayList3 = r14;
                        charSequence18 = charSequence41;
                        charSequence19 = charSequence38;
                        charSequence20 = charSequence37;
                        arrayList4 = r0;
                        obj6 = obj8;
                        CharSequence charSequence262 = (CharSequence) obj6;
                        FormattedText formattedText72 = dVar.c;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$0 = obj5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$1 = obj5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$2 = obj5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3 = arrayList3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4 = it2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$5 = obj5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$6 = obj5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7 = str;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$8 = charSequence262;
                        ovi0 ovi0Var72 = ovi0Var5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$9 = ovi0Var72;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$10 = charSequence18;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$11 = charSequence17;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$12 = bool5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$13 = charSequence16;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$14 = charSequence19;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$15 = charSequence20;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$16 = arrayList4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label = 7;
                        ArrayList arrayList72 = arrayList4;
                        i4 = ru.yandex.taxi.widget.c.i(cVar4, formattedText72, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1, 30);
                        if (i4 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                        ?? r1 = (Collection) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$16;
                        CharSequence charSequence42 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$15;
                        charSequence19 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$14;
                        charSequence16 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$13;
                        bool5 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$12;
                        CharSequence charSequence43 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$11;
                        CharSequence charSequence44 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$10;
                        ovi0Var6 = (ovi0) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$9;
                        CharSequence charSequence45 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$8;
                        str = (String) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$7;
                        Iterator it5 = (Iterator) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$4;
                        ?? r8 = (Collection) mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.L$3;
                        obj7 = obj8;
                        kotlin.b.b(obj7);
                        charSequence21 = charSequence45;
                        arrayList5 = r8;
                        charSequence10 = charSequence44;
                        charSequence17 = charSequence43;
                        it3 = it5;
                        charSequence22 = charSequence42;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$12 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1;
                        arrayList6 = r1;
                        arrayList6.add(new ce40(charSequence21, (CharSequence) obj7, str));
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$12;
                        charSequence12 = charSequence22;
                        charSequence9 = charSequence19;
                        charSequence8 = charSequence16;
                        bool3 = bool5;
                        it = it3;
                        charSequence11 = charSequence17;
                        ovi0Var4 = ovi0Var6;
                        arrayList2 = arrayList5;
                        coroutineSingletons = coroutineSingletons;
                        if (it.hasNext()) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1(kVar, continuationImpl);
        Object obj82 = mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (mtTrainCheckoutScreenDataDtoToStateMapper$mapDetailsSection$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(k kVar, db40 db40Var, vb40.j jVar, Boolean bool, CharSequence charSequence, CharSequence charSequence2, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1;
        int i;
        vb40.i iVar;
        vb40.i iVar2;
        Boolean bool2;
        CharSequence charSequence3;
        vb40.i iVar3;
        Boolean bool3;
        vb40.i iVar4;
        Boolean bool4;
        CharSequence charSequence4;
        db40 db40Var2;
        int i2;
        CharSequence charSequence5;
        FormattedText formattedText;
        Object obj;
        Boolean bool5;
        vb40.i iVar5;
        CharSequence charSequence6;
        vb40.i iVar6;
        CharSequence charSequence7;
        Boolean bool6;
        CharSequence charSequence8;
        FormattedText formattedText2;
        CharSequence charSequence9;
        vb40.i iVar7;
        vb40.i iVar8;
        Boolean bool7;
        CharSequence charSequence10;
        Object obj2;
        Integer num;
        Integer num2;
        zuj0 zuj0Var;
        Integer num3;
        CoroutineSingletons coroutineSingletons;
        Integer num4;
        Boolean bool8;
        Boolean bool9;
        ru.yandex.taxi.widget.c cVar;
        vb40.i iVar9;
        Boolean bool10;
        ru.yandex.taxi.widget.c cVar2;
        CoroutineSingletons coroutineSingletons2;
        CharSequence charSequence11;
        Boolean bool11;
        Integer num5;
        CharSequence charSequence12;
        Integer num6;
        CharSequence charSequence13;
        CharSequence charSequence14;
        Integer num7;
        int i3;
        ru.yandex.taxi.widget.c cVar3;
        CoroutineSingletons coroutineSingletons3;
        vb40.i iVar10;
        Boolean bool12;
        CharSequence charSequence15;
        Integer num8;
        Integer num9;
        Object obj3;
        Boolean bool13;
        Integer num10;
        Boolean bool14;
        CharSequence charSequence16;
        CharSequence charSequence17;
        Boolean bool15;
        CharSequence charSequence18;
        CharSequence charSequence19;
        FormattedText formattedText3;
        Object i4;
        int i5;
        CharSequence charSequence20;
        Boolean bool16;
        CharSequence charSequence21;
        CharSequence charSequence22;
        Boolean bool17;
        zuj0 zuj0Var2 = kVar.c;
        ru.yandex.taxi.widget.c cVar4 = kVar.a;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1) continuationImpl;
            int i6 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label = i6 - Integer.MIN_VALUE;
                Object obj4 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    iVar = jVar.a;
                    iVar2 = jVar.b;
                    int i7 = (db40Var == null || !db40Var.a) ? 0 : 1;
                    bool2 = iVar != null ? iVar.e : null;
                    if (iVar != null && (formattedText = iVar.a) != null) {
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$0 = db40Var;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2 = bool;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3 = charSequence;
                        charSequence3 = charSequence2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4 = charSequence3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5 = iVar;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6 = iVar2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7 = bool2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0 = i7;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label = 1;
                        Object i8 = ru.yandex.taxi.widget.c.i(cVar4, formattedText, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1, 30);
                        if (i8 != coroutineSingletons4) {
                            bool4 = bool;
                            db40Var2 = db40Var;
                            i2 = i7;
                            obj = i8;
                            charSequence4 = charSequence;
                        }
                        return coroutineSingletons4;
                    }
                    charSequence3 = charSequence2;
                    iVar3 = iVar2;
                    bool3 = bool2;
                    iVar4 = iVar;
                    bool4 = bool;
                    charSequence4 = charSequence;
                    db40Var2 = db40Var;
                    i2 = i7;
                    charSequence5 = null;
                    if (iVar4 != null || (formattedText2 = iVar4.b) == null) {
                        bool5 = bool3;
                        iVar5 = iVar4;
                        charSequence6 = charSequence3;
                        iVar6 = iVar3;
                        charSequence7 = charSequence5;
                        bool6 = bool4;
                        charSequence8 = null;
                        if (db40Var2 != null) {
                        }
                        if (db40Var2 != null) {
                        }
                        if (iVar5 != null) {
                        }
                        if (iVar5 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        int i9 = i2;
                        iVar9 = iVar5;
                        bool10 = bool9;
                        cVar2 = cVar;
                        coroutineSingletons2 = coroutineSingletons;
                        charSequence11 = charSequence6;
                        bool11 = bool5;
                        num5 = num3;
                        charSequence12 = charSequence4;
                        num6 = num;
                        charSequence13 = null;
                        charSequence14 = charSequence7;
                        num7 = num4;
                        i3 = i9;
                        if (iVar9 != null) {
                        }
                        bool13 = bool10;
                        num10 = null;
                        bool14 = bool11;
                        charSequence16 = charSequence13;
                        charSequence17 = null;
                        bool15 = bool8;
                        charSequence18 = charSequence12;
                        charSequence19 = charSequence11;
                        if (iVar6 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        avj0 avj0Var = (avj0) zuj0Var;
                        return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var.h(kyh0.shuttle_seats_plus_button), avj0Var.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                    }
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$0 = db40Var2;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$1 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2 = bool4;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3 = charSequence4;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4 = charSequence3;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5 = iVar4;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6 = iVar3;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7 = bool3;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8 = charSequence5;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$9 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0 = i2;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label = 2;
                    Object i10 = ru.yandex.taxi.widget.c.i(cVar4, formattedText2, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1, 30);
                    if (i10 != coroutineSingletons4) {
                        charSequence9 = charSequence4;
                        iVar7 = iVar4;
                        iVar8 = iVar3;
                        bool7 = bool3;
                        charSequence10 = charSequence5;
                        obj2 = i10;
                        Boolean bool18 = bool4;
                        charSequence8 = (CharSequence) obj2;
                        bool6 = bool18;
                        CharSequence charSequence23 = charSequence3;
                        iVar6 = iVar8;
                        charSequence6 = charSequence23;
                        bool5 = bool7;
                        charSequence7 = charSequence10;
                        iVar5 = iVar7;
                        charSequence4 = charSequence9;
                        if (db40Var2 != null) {
                        }
                        if (db40Var2 != null) {
                        }
                        if (iVar5 != null) {
                        }
                        if (iVar5 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        int i92 = i2;
                        iVar9 = iVar5;
                        bool10 = bool9;
                        cVar2 = cVar;
                        coroutineSingletons2 = coroutineSingletons;
                        charSequence11 = charSequence6;
                        bool11 = bool5;
                        num5 = num3;
                        charSequence12 = charSequence4;
                        num6 = num;
                        charSequence13 = null;
                        charSequence14 = charSequence7;
                        num7 = num4;
                        i3 = i92;
                        if (iVar9 != null) {
                        }
                        bool13 = bool10;
                        num10 = null;
                        bool14 = bool11;
                        charSequence16 = charSequence13;
                        charSequence17 = null;
                        bool15 = bool8;
                        charSequence18 = charSequence12;
                        charSequence19 = charSequence11;
                        if (iVar6 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        avj0 avj0Var2 = (avj0) zuj0Var;
                        return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var2.h(kyh0.shuttle_seats_plus_button), avj0Var2.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                    }
                    return coroutineSingletons4;
                }
                if (i != 1) {
                    if (i == 2) {
                        int i11 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0;
                        CharSequence charSequence24 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8;
                        Boolean bool19 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7;
                        vb40.i iVar11 = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6;
                        vb40.i iVar12 = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5;
                        CharSequence charSequence25 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4;
                        charSequence9 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3;
                        bool4 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2;
                        db40Var2 = (db40) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$0;
                        kotlin.b.b(obj4);
                        charSequence3 = charSequence25;
                        iVar7 = iVar12;
                        iVar8 = iVar11;
                        bool7 = bool19;
                        charSequence10 = charSequence24;
                        i2 = i11;
                        obj2 = obj4;
                        Boolean bool182 = bool4;
                        charSequence8 = (CharSequence) obj2;
                        bool6 = bool182;
                        CharSequence charSequence232 = charSequence3;
                        iVar6 = iVar8;
                        charSequence6 = charSequence232;
                        bool5 = bool7;
                        charSequence7 = charSequence10;
                        iVar5 = iVar7;
                        charSequence4 = charSequence9;
                        num = db40Var2 != null ? new Integer(db40Var2.c) : null;
                        num2 = db40Var2 != null ? new Integer(db40Var2.d) : null;
                        if (iVar5 != null) {
                            zuj0Var = zuj0Var2;
                            num3 = new Integer(iVar5.c);
                        } else {
                            zuj0Var = zuj0Var2;
                            num3 = null;
                        }
                        if (iVar5 != null) {
                            coroutineSingletons = coroutineSingletons4;
                            num4 = new Integer(iVar5.d);
                        } else {
                            coroutineSingletons = coroutineSingletons4;
                            num4 = null;
                        }
                        bool8 = iVar6 != null ? iVar6.e : null;
                        if (iVar6 != null) {
                            FormattedText formattedText4 = iVar6.a;
                            if (formattedText4 != null) {
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$0 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$1 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2 = bool6;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3 = charSequence4;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4 = charSequence6;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5 = iVar5;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6 = iVar6;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7 = bool5;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8 = charSequence7;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$9 = charSequence8;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$10 = num;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$11 = num2;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$12 = num3;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$13 = num4;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$14 = bool8;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$15 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0 = i2;
                                Boolean bool20 = bool6;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label = 3;
                                int i12 = i2;
                                cVar3 = cVar4;
                                vb40.i iVar13 = iVar5;
                                Object i13 = ru.yandex.taxi.widget.c.i(cVar3, formattedText4, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1, 30);
                                coroutineSingletons3 = coroutineSingletons;
                                if (i13 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                iVar9 = iVar13;
                                iVar10 = iVar6;
                                bool12 = bool5;
                                charSequence15 = charSequence7;
                                num8 = num3;
                                num9 = num4;
                                i3 = i12;
                                obj3 = i13;
                                bool10 = bool20;
                                CharSequence charSequence26 = charSequence15;
                                charSequence12 = charSequence4;
                                num6 = num;
                                charSequence14 = charSequence26;
                                cVar2 = cVar3;
                                bool11 = bool12;
                                iVar6 = iVar10;
                                coroutineSingletons2 = coroutineSingletons3;
                                charSequence11 = charSequence6;
                                num5 = num8;
                                num7 = num9;
                                charSequence13 = (CharSequence) obj3;
                                if (iVar9 != null) {
                                }
                                bool13 = bool10;
                                num10 = null;
                                bool14 = bool11;
                                charSequence16 = charSequence13;
                                charSequence17 = null;
                                bool15 = bool8;
                                charSequence18 = charSequence12;
                                charSequence19 = charSequence11;
                                if (iVar6 != null) {
                                }
                                if (iVar6 != null) {
                                }
                                avj0 avj0Var22 = (avj0) zuj0Var;
                                return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var22.h(kyh0.shuttle_seats_plus_button), avj0Var22.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                            }
                            bool9 = bool6;
                            cVar = cVar4;
                        } else {
                            bool9 = bool6;
                            cVar = cVar4;
                        }
                        int i922 = i2;
                        iVar9 = iVar5;
                        bool10 = bool9;
                        cVar2 = cVar;
                        coroutineSingletons2 = coroutineSingletons;
                        charSequence11 = charSequence6;
                        bool11 = bool5;
                        num5 = num3;
                        charSequence12 = charSequence4;
                        num6 = num;
                        charSequence13 = null;
                        charSequence14 = charSequence7;
                        num7 = num4;
                        i3 = i922;
                        if (iVar9 != null) {
                        }
                        bool13 = bool10;
                        num10 = null;
                        bool14 = bool11;
                        charSequence16 = charSequence13;
                        charSequence17 = null;
                        bool15 = bool8;
                        charSequence18 = charSequence12;
                        charSequence19 = charSequence11;
                        if (iVar6 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        avj0 avj0Var222 = (avj0) zuj0Var;
                        return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var222.h(kyh0.shuttle_seats_plus_button), avj0Var222.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0;
                        charSequence20 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$15;
                        bool16 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$14;
                        Integer num11 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$13;
                        Integer num12 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$12;
                        Integer num13 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$11;
                        num6 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$10;
                        CharSequence charSequence27 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$9;
                        charSequence14 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8;
                        Boolean bool21 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7;
                        vb40.i iVar14 = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6;
                        charSequence22 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4;
                        charSequence21 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3;
                        Boolean bool22 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2;
                        kotlin.b.b(obj4);
                        zuj0Var = zuj0Var2;
                        bool17 = bool21;
                        i4 = obj4;
                        bool13 = bool22;
                        iVar6 = iVar14;
                        charSequence8 = charSequence27;
                        num2 = num13;
                        num5 = num12;
                        num7 = num11;
                        num10 = null;
                        charSequence17 = (CharSequence) i4;
                        charSequence16 = charSequence20;
                        bool15 = bool16;
                        bool14 = bool17;
                        charSequence18 = charSequence21;
                        charSequence19 = charSequence22;
                        i3 = i5;
                        avj0 avj0Var2222 = (avj0) zuj0Var;
                        return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var2222.h(kyh0.shuttle_seats_plus_button), avj0Var2222.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                    }
                    obj3 = obj4;
                    int i14 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0;
                    Boolean bool23 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$14;
                    Integer num14 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$13;
                    num8 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$12;
                    num2 = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$11;
                    num = (Integer) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$10;
                    charSequence8 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$9;
                    CharSequence charSequence28 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8;
                    Boolean bool24 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7;
                    vb40.i iVar15 = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6;
                    vb40.i iVar16 = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5;
                    charSequence6 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4;
                    CharSequence charSequence29 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3;
                    Boolean bool25 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2;
                    kotlin.b.b(obj3);
                    zuj0Var = zuj0Var2;
                    cVar3 = cVar4;
                    iVar9 = iVar16;
                    iVar10 = iVar15;
                    charSequence4 = charSequence29;
                    num9 = num14;
                    coroutineSingletons3 = coroutineSingletons4;
                    bool12 = bool24;
                    i3 = i14;
                    charSequence15 = charSequence28;
                    bool8 = bool23;
                    bool10 = bool25;
                    CharSequence charSequence262 = charSequence15;
                    charSequence12 = charSequence4;
                    num6 = num;
                    charSequence14 = charSequence262;
                    cVar2 = cVar3;
                    bool11 = bool12;
                    iVar6 = iVar10;
                    coroutineSingletons2 = coroutineSingletons3;
                    charSequence11 = charSequence6;
                    num5 = num8;
                    num7 = num9;
                    charSequence13 = (CharSequence) obj3;
                    if (iVar9 != null || (formattedText3 = iVar9.b) == null) {
                        bool13 = bool10;
                        num10 = null;
                        bool14 = bool11;
                        charSequence16 = charSequence13;
                        charSequence17 = null;
                        bool15 = bool8;
                        charSequence18 = charSequence12;
                        charSequence19 = charSequence11;
                        if (iVar6 != null) {
                        }
                        if (iVar6 != null) {
                        }
                        avj0 avj0Var22222 = (avj0) zuj0Var;
                        return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var22222.h(kyh0.shuttle_seats_plus_button), avj0Var22222.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                    }
                    num10 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$0 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$1 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2 = bool10;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3 = charSequence12;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4 = charSequence11;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6 = iVar6;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7 = bool11;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$8 = charSequence14;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$9 = charSequence8;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$10 = num6;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$11 = num2;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$12 = num5;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$13 = num7;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$14 = bool8;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$15 = charSequence13;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$16 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0 = i3;
                    Boolean bool26 = bool11;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label = 4;
                    bool13 = bool10;
                    CharSequence charSequence30 = charSequence11;
                    i4 = ru.yandex.taxi.widget.c.i(cVar2, formattedText3, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1, 30);
                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                    if (i4 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    i5 = i3;
                    charSequence20 = charSequence13;
                    bool16 = bool8;
                    charSequence21 = charSequence12;
                    charSequence22 = charSequence30;
                    bool17 = bool26;
                    charSequence17 = (CharSequence) i4;
                    charSequence16 = charSequence20;
                    bool15 = bool16;
                    bool14 = bool17;
                    charSequence18 = charSequence21;
                    charSequence19 = charSequence22;
                    i3 = i5;
                    if (iVar6 != null) {
                    }
                    if (iVar6 != null) {
                    }
                    avj0 avj0Var222222 = (avj0) zuj0Var;
                    return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var222222.h(kyh0.shuttle_seats_plus_button), avj0Var222222.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
                }
                int i15 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.I$0;
                Boolean bool27 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$7;
                iVar2 = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$6;
                iVar = (vb40.i) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$5;
                CharSequence charSequence31 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$4;
                charSequence4 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$3;
                bool4 = (Boolean) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$2;
                db40Var2 = (db40) mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.L$0;
                kotlin.b.b(obj4);
                charSequence3 = charSequence31;
                bool2 = bool27;
                i2 = i15;
                obj = obj4;
                charSequence5 = (CharSequence) obj;
                vb40.i iVar17 = iVar;
                iVar3 = iVar2;
                bool3 = bool2;
                iVar4 = iVar17;
                if (iVar4 != null) {
                }
                bool5 = bool3;
                iVar5 = iVar4;
                charSequence6 = charSequence3;
                iVar6 = iVar3;
                charSequence7 = charSequence5;
                bool6 = bool4;
                charSequence8 = null;
                if (db40Var2 != null) {
                }
                if (db40Var2 != null) {
                }
                if (iVar5 != null) {
                }
                if (iVar5 != null) {
                }
                if (iVar6 != null) {
                }
                if (iVar6 != null) {
                }
                int i9222 = i2;
                iVar9 = iVar5;
                bool10 = bool9;
                cVar2 = cVar;
                coroutineSingletons2 = coroutineSingletons;
                charSequence11 = charSequence6;
                bool11 = bool5;
                num5 = num3;
                charSequence12 = charSequence4;
                num6 = num;
                charSequence13 = null;
                charSequence14 = charSequence7;
                num7 = num4;
                i3 = i9222;
                if (iVar9 != null) {
                }
                bool13 = bool10;
                num10 = null;
                bool14 = bool11;
                charSequence16 = charSequence13;
                charSequence17 = null;
                bool15 = bool8;
                charSequence18 = charSequence12;
                charSequence19 = charSequence11;
                if (iVar6 != null) {
                }
                if (iVar6 != null) {
                }
                avj0 avj0Var2222222 = (avj0) zuj0Var;
                return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var2222222.h(kyh0.shuttle_seats_plus_button), avj0Var2222222.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1(kVar, continuationImpl);
        Object obj42 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$mapPassengersCounter$1.label;
        if (i != 0) {
        }
        charSequence5 = (CharSequence) obj;
        vb40.i iVar172 = iVar;
        iVar3 = iVar2;
        bool3 = bool2;
        iVar4 = iVar172;
        if (iVar4 != null) {
        }
        bool5 = bool3;
        iVar5 = iVar4;
        charSequence6 = charSequence3;
        iVar6 = iVar3;
        charSequence7 = charSequence5;
        bool6 = bool4;
        charSequence8 = null;
        if (db40Var2 != null) {
        }
        if (db40Var2 != null) {
        }
        if (iVar5 != null) {
        }
        if (iVar5 != null) {
        }
        if (iVar6 != null) {
        }
        if (iVar6 != null) {
        }
        int i92222 = i2;
        iVar9 = iVar5;
        bool10 = bool9;
        cVar2 = cVar;
        coroutineSingletons2 = coroutineSingletons;
        charSequence11 = charSequence6;
        bool11 = bool5;
        num5 = num3;
        charSequence12 = charSequence4;
        num6 = num;
        charSequence13 = null;
        charSequence14 = charSequence7;
        num7 = num4;
        i3 = i92222;
        if (iVar9 != null) {
        }
        bool13 = bool10;
        num10 = null;
        bool14 = bool11;
        charSequence16 = charSequence13;
        charSequence17 = null;
        bool15 = bool8;
        charSequence18 = charSequence12;
        charSequence19 = charSequence11;
        if (iVar6 != null) {
        }
        if (iVar6 != null) {
        }
        avj0 avj0Var22222222 = (avj0) zuj0Var;
        return new ei40(i3 != 0, charSequence18, bool13, charSequence19, bool14, charSequence14, charSequence8, num6, num5, num7, avj0Var22222222.h(kyh0.shuttle_seats_plus_button), avj0Var22222222.h(kyh0.shuttle_seats_minus_button), bool15, charSequence16, charSequence17, num2, iVar6 != null ? new Integer(iVar6.c) : num10, iVar6 != null ? new Integer(iVar6.d) : num10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (r15 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(k kVar, vb40.k kVar2, ib40 ib40Var, fef fefVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1;
        Object obj;
        int i;
        Object g;
        vb40.k kVar3;
        CharSequence charSequence;
        ib40 ib40Var2;
        fef fefVar2;
        Object i2;
        ib40 ib40Var3;
        CharSequence charSequence2;
        vb40.k kVar4;
        CharSequence charSequence3;
        Object i3;
        wi70 wi70Var;
        kVar.getClass();
        ru.yandex.taxi.widget.c cVar = kVar.a;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1) continuationImpl;
            int i4 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = kVar2.a;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = kVar2;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = ib40Var;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = fefVar;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3;
                            fefVar2 = (fef) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2;
                            ib40 ib40Var4 = (ib40) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1;
                            vb40.k kVar5 = (vb40.k) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0;
                            kotlin.b.b(obj2);
                            ib40Var2 = ib40Var4;
                            kVar3 = kVar5;
                            g = obj2;
                            CharSequence charSequence4 = (CharSequence) g;
                            FormattedText formattedText2 = kVar3.c;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = kVar3;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = ib40Var2;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3 = charSequence;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$4 = charSequence4;
                            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 3;
                            i2 = kVar.i(formattedText2, fefVar2, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1);
                            if (i2 != obj) {
                                ib40 ib40Var5 = ib40Var2;
                                obj2 = i2;
                                ib40Var3 = ib40Var5;
                                vb40.k kVar6 = kVar3;
                                charSequence2 = charSequence;
                                kVar4 = kVar6;
                                charSequence3 = charSequence4;
                                wi70 wi70Var2 = (wi70) obj2;
                                FormattedText formattedText3 = kVar4.d;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3 = charSequence2;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$4 = charSequence3;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$5 = wi70Var2;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$6 = ib40Var3;
                                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 4;
                                i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1, 30);
                                if (i3 != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ib40Var3 = (ib40) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$6;
                            wi70 wi70Var3 = (wi70) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$5;
                            charSequence3 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$4;
                            charSequence2 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3;
                            kotlin.b.b(obj2);
                            wi70Var = wi70Var3;
                            return new y940(new hb40(charSequence2, charSequence3, wi70Var, ib40Var3, (CharSequence) obj2, false));
                        }
                        CharSequence charSequence5 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$4;
                        CharSequence charSequence6 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3;
                        ib40 ib40Var6 = (ib40) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1;
                        vb40.k kVar7 = (vb40.k) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0;
                        kotlin.b.b(obj2);
                        charSequence3 = charSequence5;
                        ib40Var3 = ib40Var6;
                        charSequence2 = charSequence6;
                        kVar4 = kVar7;
                        wi70 wi70Var22 = (wi70) obj2;
                        FormattedText formattedText32 = kVar4.d;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3 = charSequence2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$4 = charSequence3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$5 = wi70Var22;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$6 = ib40Var3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 4;
                        i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText32, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1, 30);
                        if (i3 != obj) {
                            wi70Var = wi70Var22;
                            obj2 = i3;
                            return new y940(new hb40(charSequence2, charSequence3, wi70Var, ib40Var3, (CharSequence) obj2, false));
                        }
                        return obj;
                    }
                    fefVar = (fef) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2;
                    ib40Var = (ib40) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1;
                    kVar2 = (vb40.k) mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence7 = (CharSequence) obj2;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = kVar2;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = ib40Var;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = fefVar;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3 = charSequence7;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 2;
                g = kVar.g(kVar2, fefVar, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1);
                if (g != obj) {
                    fef fefVar3 = fefVar;
                    kVar3 = kVar2;
                    charSequence = charSequence7;
                    ib40Var2 = ib40Var;
                    fefVar2 = fefVar3;
                    CharSequence charSequence42 = (CharSequence) g;
                    FormattedText formattedText22 = kVar3.c;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = kVar3;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = ib40Var2;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3 = charSequence;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$4 = charSequence42;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 3;
                    i2 = kVar.i(formattedText22, fefVar2, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1);
                    if (i2 != obj) {
                    }
                }
                return obj;
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1(kVar, continuationImpl);
        Object obj22 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj22;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$0 = kVar2;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$1 = ib40Var;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$2 = fefVar;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.L$3 = charSequence72;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1.label = 2;
        g = kVar.g(kVar2, fefVar, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentInfoSection$1);
        if (g != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r8 == r10) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(k kVar, vb40.l lVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object i2;
        CharSequence charSequence;
        kVar.getClass();
        ru.yandex.taxi.widget.c cVar = kVar.a;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1) continuationImpl;
            int i3 = mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = lVar.a;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$0 = lVar;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$1;
                        kotlin.b.b(obj);
                        return new wf40(charSequence, (CharSequence) obj);
                    }
                    lVar = (vb40.l) mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText formattedText2 = lVar.b;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$0 = null;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$1 = charSequence2;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1, 30);
                if (i2 != coroutineSingletons) {
                    charSequence = charSequence2;
                    obj = i2;
                    return new wf40(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1(kVar, continuationImpl);
        Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText formattedText22 = lVar.b;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$0 = null;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.L$1 = charSequence22;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r7 == r10) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(k kVar, vb40.o oVar, String str, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object i2;
        CharSequence charSequence;
        vb40.o oVar2;
        kVar.getClass();
        ru.yandex.taxi.widget.c cVar = kVar.a;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1) continuationImpl;
            int i3 = mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = oVar.a;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$0 = oVar;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$1 = str;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence2 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$2;
                        str = (String) mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$1;
                        oVar2 = (vb40.o) mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$0;
                        kotlin.b.b(obj);
                        charSequence = charSequence2;
                        return new wh40(charSequence, (CharSequence) obj, oVar2.d, str, 1);
                    }
                    str = (String) mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$1;
                    oVar = (vb40.o) mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                FormattedText formattedText2 = jl40.l(oVar.b, FormattedText.c) ? oVar.b : oVar.c;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$0 = oVar;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$1 = str;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$2 = charSequence3;
                mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1, 30);
                if (i2 != coroutineSingletons) {
                    charSequence = charSequence3;
                    oVar2 = oVar;
                    obj = i2;
                    return new wh40(charSequence, (CharSequence) obj, oVar2.d, str, 1);
                }
                return coroutineSingletons;
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1(kVar, continuationImpl);
        Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        if (jl40.l(oVar.b, FormattedText.c)) {
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$0 = oVar;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$1 = str;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.L$2 = charSequence32;
        mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapTariffSection$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(vb40.k kVar, fef fefVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1 mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1;
        int i;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1) continuationImpl;
            int i2 = mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (fefVar == null) {
                        return "";
                    }
                    FormattedText c = d9s.c(kVar.b, this.b, fefVar, true);
                    mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.L$0 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.L$1 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.L$2 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.L$3 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.a, c, null, mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? "" : charSequence;
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1(this, continuationImpl);
        Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$formatPaymentPrice$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0350, code lost:
    
        if (r3 != r8) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v9, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v4, types: [noh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, vb40 vb40Var, ib40 ib40Var, db40 db40Var, fef fefVar, tse tseVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$map$1 mtTrainCheckoutScreenDataDtoToStateMapper$map$1;
        MtTrainCheckoutScreenDataDtoToStateMapper$map$1 mtTrainCheckoutScreenDataDtoToStateMapper$map$12;
        qoh h;
        qoh h2;
        noh h3;
        CharSequence h4;
        CharSequence charSequence;
        noh nohVar;
        noh nohVar2;
        Object k;
        CharSequence charSequence2;
        gi40 gi40Var;
        noh nohVar3;
        CharSequence charSequence3;
        noh nohVar4;
        noh nohVar5;
        noh nohVar6;
        Object k2;
        gi40 gi40Var2;
        noh nohVar7;
        CharSequence charSequence4;
        wf40 wf40Var;
        noh nohVar8;
        noh nohVar9;
        CharSequence charSequence5;
        Object k3;
        noh nohVar10;
        di40 di40Var;
        noh nohVar11;
        fi40 fi40Var;
        ei40 ei40Var;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$map$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$map$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$map$1) continuationImpl;
            int i = mtTrainCheckoutScreenDataDtoToStateMapper$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$map$1.label = i - Integer.MIN_VALUE;
                mtTrainCheckoutScreenDataDtoToStateMapper$map$12 = mtTrainCheckoutScreenDataDtoToStateMapper$map$1;
                Object obj = mtTrainCheckoutScreenDataDtoToStateMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label) {
                    case 0:
                        kotlin.b.b(obj);
                        qoh h5 = tje.h(tseVar, null, null, new MtTrainCheckoutScreenDataDtoToStateMapper$map$transportState$1(this, vb40Var, null), 3);
                        qoh h6 = tje.h(tseVar, null, null, new MtTrainCheckoutScreenDataDtoToStateMapper$map$routeState$1(this, vb40Var, null), 3);
                        h = tje.h(tseVar, null, null, new MtTrainCheckoutScreenDataDtoToStateMapper$map$activePeriodState$1(this, vb40Var, null), 3);
                        qoh h7 = tje.h(tseVar, null, null, new MtTrainCheckoutScreenDataDtoToStateMapper$map$tariffState$1(db40Var, vb40Var, null, this), 3);
                        h2 = tje.h(tseVar, null, null, new MtTrainCheckoutScreenDataDtoToStateMapper$map$ticketsCountState$1(db40Var, vb40Var, null, this), 3);
                        h3 = tje.h(tseVar, null, null, new MtTrainCheckoutScreenDataDtoToStateMapper$map$bottomBarState$1(this, vb40Var, ib40Var, fefVar, null), 3);
                        h4 = ((avj0) this.c).h(kyh0.masstransit_vertical_trains_local_time_everywhere);
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = h6;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = h;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = h7;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = h2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = h3;
                        charSequence = str;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = h4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 1;
                        obj = h5.s(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                        if (obj != coroutineSingletons) {
                            nohVar = h6;
                            nohVar2 = h7;
                            gi40 gi40Var3 = (gi40) obj;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = h;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = nohVar2;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = h2;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = h3;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = h4;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var3;
                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 2;
                            k = nohVar.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                            if (k != coroutineSingletons) {
                                CharSequence charSequence6 = charSequence;
                                charSequence2 = h4;
                                gi40Var = gi40Var3;
                                obj = k;
                                nohVar3 = h3;
                                charSequence3 = charSequence6;
                                nohVar4 = nohVar2;
                                nohVar5 = h;
                                nohVar6 = h2;
                                wf40 wf40Var2 = (wf40) obj;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = nohVar4;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = nohVar6;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = nohVar3;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence3;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence2;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = wf40Var2;
                                mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 3;
                                k2 = nohVar5.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                                if (k2 != coroutineSingletons) {
                                    CharSequence charSequence7 = charSequence3;
                                    gi40Var2 = gi40Var;
                                    nohVar7 = nohVar3;
                                    charSequence4 = charSequence2;
                                    wf40Var = wf40Var2;
                                    obj = k2;
                                    nohVar8 = nohVar4;
                                    nohVar9 = nohVar6;
                                    charSequence5 = charSequence7;
                                    di40 di40Var2 = (di40) obj;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = null;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = nohVar9;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = nohVar7;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence5;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence4;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var2;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = wf40Var;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16 = di40Var2;
                                    mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 4;
                                    k3 = nohVar8.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                                    if (k3 != coroutineSingletons) {
                                        noh nohVar12 = nohVar9;
                                        nohVar10 = nohVar7;
                                        di40Var = di40Var2;
                                        obj = k3;
                                        nohVar11 = nohVar12;
                                        fi40 fi40Var2 = new fi40(wf40Var, di40Var, (wh40) obj);
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = nohVar10;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence5;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence4;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var2;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = fi40Var2;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16 = null;
                                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 5;
                                        obj = nohVar11.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                                        if (obj != coroutineSingletons) {
                                            fi40Var = fi40Var2;
                                            ei40Var = (ei40) obj;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = null;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence5;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence4;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var2;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = fi40Var;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16 = ei40Var;
                                            mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 6;
                                            obj = nohVar10.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        h4 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13;
                        charSequence = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12;
                        h3 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11;
                        ?? r4 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10;
                        nohVar2 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9;
                        ?? r6 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8;
                        nohVar = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7;
                        kotlin.b.b(obj);
                        h2 = r4;
                        h = r6;
                        gi40 gi40Var32 = (gi40) obj;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = h;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = nohVar2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = h2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = h3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = h4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var32;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 2;
                        k = nohVar.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                        if (k != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        gi40Var = (gi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14;
                        charSequence2 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13;
                        charSequence3 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12;
                        nohVar3 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11;
                        nohVar6 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10;
                        nohVar4 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9;
                        nohVar5 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8;
                        kotlin.b.b(obj);
                        wf40 wf40Var22 = (wf40) obj;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = nohVar4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = nohVar6;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = nohVar3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence3;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = wf40Var22;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 3;
                        k2 = nohVar5.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                        if (k2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        wf40 wf40Var3 = (wf40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15;
                        gi40 gi40Var4 = (gi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14;
                        CharSequence charSequence8 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13;
                        CharSequence charSequence9 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12;
                        noh nohVar13 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11;
                        nohVar9 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10;
                        nohVar8 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9;
                        kotlin.b.b(obj);
                        wf40Var = wf40Var3;
                        nohVar7 = nohVar13;
                        charSequence5 = charSequence9;
                        charSequence4 = charSequence8;
                        gi40Var2 = gi40Var4;
                        di40 di40Var22 = (di40) obj;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = nohVar9;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = nohVar7;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = wf40Var;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16 = di40Var22;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 4;
                        k3 = nohVar8.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                        if (k3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        di40Var = (di40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16;
                        wf40Var = (wf40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15;
                        gi40Var2 = (gi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14;
                        charSequence4 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13;
                        charSequence5 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12;
                        nohVar10 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11;
                        nohVar11 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10;
                        kotlin.b.b(obj);
                        fi40 fi40Var22 = new fi40(wf40Var, di40Var, (wh40) obj);
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = nohVar10;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = fi40Var22;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 5;
                        obj = nohVar11.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        fi40 fi40Var3 = (fi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15;
                        gi40 gi40Var5 = (gi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14;
                        CharSequence charSequence10 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13;
                        CharSequence charSequence11 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12;
                        noh nohVar14 = (noh) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11;
                        kotlin.b.b(obj);
                        nohVar10 = nohVar14;
                        charSequence5 = charSequence11;
                        charSequence4 = charSequence10;
                        gi40Var2 = gi40Var5;
                        fi40Var = fi40Var3;
                        ei40Var = (ei40) obj;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$0 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$1 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$2 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$3 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$4 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$5 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$6 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$7 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$8 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$9 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$10 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$11 = null;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12 = charSequence5;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13 = charSequence4;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14 = gi40Var2;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15 = fi40Var;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16 = ei40Var;
                        mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label = 6;
                        obj = nohVar10.k(mtTrainCheckoutScreenDataDtoToStateMapper$map$12);
                        break;
                    case 6:
                        ei40Var = (ei40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$16;
                        fi40Var = (fi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$15;
                        gi40Var2 = (gi40) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$14;
                        charSequence4 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$13;
                        charSequence5 = (CharSequence) mtTrainCheckoutScreenDataDtoToStateMapper$map$12.L$12;
                        kotlin.b.b(obj);
                        return new ud40(charSequence5, charSequence4, gi40Var2, fi40Var, ei40Var, (y940) obj);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$map$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$map$1(this, continuationImpl);
        mtTrainCheckoutScreenDataDtoToStateMapper$map$12 = mtTrainCheckoutScreenDataDtoToStateMapper$map$1;
        Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$map$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (mtTrainCheckoutScreenDataDtoToStateMapper$map$12.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(FormattedText formattedText, fef fefVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1 mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1;
        int i;
        if (continuationImpl instanceof MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1) {
            mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1 = (MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1) continuationImpl;
            int i2 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText c = d9s.c(formattedText, this.b, fefVar, true);
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.L$0 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.L$1 = null;
                    mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.a, c, null, mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return new wi70(122, charSequence, charSequence, false);
            }
        }
        mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1 = new MtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1(this, continuationImpl);
        Object obj2 = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutScreenDataDtoToStateMapper$mapPaymentButton$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        return new wi70(122, charSequence2, charSequence2, false);
    }
}
