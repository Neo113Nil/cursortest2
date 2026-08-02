package ru.yandex.taxi.delivery.impl.paid_insurance;

import defpackage.bhi;
import defpackage.fhi;
import defpackage.hhi;
import defpackage.ihi;
import defpackage.k7x0;
import defpackage.lhi;
import defpackage.m7x0;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.t990;
import defpackage.tcc;
import defpackage.u990;
import defpackage.v990;
import defpackage.w511;
import defpackage.w990;
import defpackage.x990;
import defpackage.xgi;
import defpackage.ygi;
import defpackage.zgi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.PaidInsuranceScreen$Companion$ButtonStyle;
import ru.yandex.taxi.tariffs.model.ButtonStyleModel;

/* loaded from: classes5.dex */
public final class c {
    public final k7x0 a;
    public final n3h b;
    public final ygi c;
    public final d d;
    public final ru.yandex.taxi.widget.c e;

    public c(k7x0 k7x0Var, n3h n3hVar, ygi ygiVar, d dVar, ru.yandex.taxi.widget.c cVar) {
        this.a = k7x0Var;
        this.b = n3hVar;
        this.c = ygiVar;
        this.d = dVar;
        this.e = cVar;
    }

    public static PaidInsuranceScreen$Companion$ButtonStyle b(ButtonStyleModel buttonStyleModel) {
        int i = bhi.b[buttonStyleModel.ordinal()];
        if (i == 1) {
            return PaidInsuranceScreen$Companion$ButtonStyle.MAIN;
        }
        if (i == 2) {
            return PaidInsuranceScreen$Companion$ButtonStyle.MINOR;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x02e3 -> B:112:0x02ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaidInsuranceScreenSource paidInsuranceScreenSource, ContinuationImpl continuationImpl) {
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$1;
        List list;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$12;
        String str;
        List list2;
        ihi ihiVar;
        PaidInsuranceScreenSource paidInsuranceScreenSource2;
        List list3;
        Iterator it;
        Collection collection;
        ihi ihiVar2;
        lhi lhiVar;
        v990 v990Var;
        PaidInsuranceScreenSource paidInsuranceScreenSource3;
        lhi lhiVar2;
        ihi ihiVar3;
        List list4;
        PaidInsuranceScreenSource paidInsuranceScreenSource4;
        Collection collection2;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$13;
        PaidInsuranceScreenSource paidInsuranceScreenSource5;
        String str2;
        ihi ihiVar4;
        String str3;
        fhi fhiVar;
        String a;
        xgi xgiVar;
        w990 w990Var;
        String str4;
        u990 u990Var;
        List list5;
        String str5;
        List list6;
        String str6;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$14;
        hhi hhiVar;
        String str7;
        List list7;
        String str8;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$15;
        List list8;
        fhi fhiVar2;
        w990 w990Var2;
        CharSequence charSequence3;
        FormattedText formattedText2;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$16;
        String str9;
        CharSequence charSequence4;
        List list9;
        List list10;
        v990 v990Var2;
        String str10;
        w990 w990Var3;
        w990 w990Var4;
        String str11;
        v990 v990Var3;
        List list11;
        List list12;
        String str12;
        hhi hhiVar2;
        CharSequence charSequence5;
        String str13;
        Object e;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$17;
        hhi hhiVar3;
        t990 t990Var;
        CharSequence charSequence6;
        FormattedText formattedText3;
        CharSequence charSequence7;
        String str14;
        String str15;
        String str16;
        v990 v990Var4;
        List list13;
        List list14;
        hhi hhiVar4;
        CharSequence charSequence8;
        w990 w990Var5;
        t990 t990Var2;
        u990 u990Var2;
        CharSequence charSequence9;
        FormattedText formattedText4;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$18;
        String str17;
        CharSequence charSequence10;
        w990 w990Var6;
        String str18;
        v990 v990Var5;
        List list15;
        List list16;
        String str19;
        fhi fhiVar3;
        CharSequence charSequence11;
        String str20;
        Object e2;
        DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$19;
        fhi fhiVar4;
        t990 t990Var3;
        CharSequence charSequence12;
        FormattedText formattedText5;
        CharSequence charSequence13;
        String str21;
        String str22;
        String str23;
        v990 v990Var6;
        List list17;
        List list18;
        fhi fhiVar5;
        CharSequence charSequence14;
        w990 w990Var7;
        t990 t990Var4;
        if (continuationImpl instanceof DeliveryPaidInsurancePresenter$getArgs$1) {
            deliveryPaidInsurancePresenter$getArgs$1 = (DeliveryPaidInsurancePresenter$getArgs$1) continuationImpl;
            int i = deliveryPaidInsurancePresenter$getArgs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deliveryPaidInsurancePresenter$getArgs$1.label = i - Integer.MIN_VALUE;
                Object obj = deliveryPaidInsurancePresenter$getArgs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (deliveryPaidInsurancePresenter$getArgs$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        zgi a2 = this.c.a();
                        ihi ihiVar5 = a2 != null ? a2.b : null;
                        if (ihiVar5 == null) {
                            return null;
                        }
                        String str24 = ihiVar5.b;
                        list = ihiVar5.d;
                        List list19 = ihiVar5.e;
                        if (list19 != null) {
                            List list20 = list19;
                            ArrayList arrayList = new ArrayList(tcc.n(list20, 10));
                            deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$1;
                            str = str24;
                            list3 = list;
                            it = list20.iterator();
                            collection = arrayList;
                            ihiVar2 = ihiVar5;
                            paidInsuranceScreenSource2 = paidInsuranceScreenSource;
                            if (it.hasNext()) {
                                FormattedText formattedText6 = (FormattedText) it.next();
                                deliveryPaidInsurancePresenter$getArgs$12.L$0 = paidInsuranceScreenSource2;
                                deliveryPaidInsurancePresenter$getArgs$12.L$1 = ihiVar2;
                                deliveryPaidInsurancePresenter$getArgs$12.L$2 = null;
                                deliveryPaidInsurancePresenter$getArgs$12.L$3 = null;
                                deliveryPaidInsurancePresenter$getArgs$12.L$4 = collection;
                                deliveryPaidInsurancePresenter$getArgs$12.L$5 = it;
                                deliveryPaidInsurancePresenter$getArgs$12.L$6 = null;
                                deliveryPaidInsurancePresenter$getArgs$12.L$7 = null;
                                deliveryPaidInsurancePresenter$getArgs$12.L$8 = str;
                                deliveryPaidInsurancePresenter$getArgs$12.L$9 = list3;
                                deliveryPaidInsurancePresenter$getArgs$12.L$10 = collection;
                                deliveryPaidInsurancePresenter$getArgs$12.label = 1;
                                Iterator it2 = it;
                                ihi ihiVar6 = ihiVar2;
                                Object e3 = ru.yandex.taxi.widget.c.e(this.e, formattedText6, null, false, deliveryPaidInsurancePresenter$getArgs$12, 30);
                                if (e3 != coroutineSingletons) {
                                    paidInsuranceScreenSource4 = paidInsuranceScreenSource2;
                                    collection2 = collection;
                                    obj = e3;
                                    it = it2;
                                    ihiVar2 = ihiVar6;
                                    collection.add((CharSequence) obj);
                                    collection = collection2;
                                    paidInsuranceScreenSource2 = paidInsuranceScreenSource4;
                                    if (it.hasNext()) {
                                        list2 = (List) collection;
                                        list = list3;
                                        ihiVar = ihiVar2;
                                        lhiVar = ihiVar.c;
                                        if (lhiVar == null) {
                                            FormattedText formattedText7 = lhiVar.a;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$0 = paidInsuranceScreenSource2;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$1 = ihiVar;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$2 = lhiVar;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$3 = str;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$4 = list;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$5 = list2;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$6 = null;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$7 = null;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$8 = null;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$9 = null;
                                            deliveryPaidInsurancePresenter$getArgs$12.L$10 = null;
                                            deliveryPaidInsurancePresenter$getArgs$12.label = 2;
                                            List list21 = list;
                                            Object e4 = ru.yandex.taxi.widget.c.e(this.e, formattedText7, null, false, deliveryPaidInsurancePresenter$getArgs$12, 30);
                                            if (e4 != coroutineSingletons) {
                                                paidInsuranceScreenSource3 = paidInsuranceScreenSource2;
                                                obj = e4;
                                                lhiVar2 = lhiVar;
                                                ihiVar3 = ihiVar;
                                                list4 = list21;
                                                CharSequence charSequence15 = (CharSequence) obj;
                                                formattedText = lhiVar2.b;
                                                if (formattedText == null) {
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$0 = paidInsuranceScreenSource3;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$1 = ihiVar3;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$2 = null;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$3 = charSequence15;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$4 = null;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$5 = str;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$6 = list4;
                                                    deliveryPaidInsurancePresenter$getArgs$12.L$7 = list2;
                                                    deliveryPaidInsurancePresenter$getArgs$12.label = 3;
                                                    ihi ihiVar7 = ihiVar3;
                                                    PaidInsuranceScreenSource paidInsuranceScreenSource6 = paidInsuranceScreenSource3;
                                                    Object e5 = ru.yandex.taxi.widget.c.e(this.e, formattedText, null, false, deliveryPaidInsurancePresenter$getArgs$12, 30);
                                                    if (e5 != coroutineSingletons) {
                                                        charSequence = charSequence15;
                                                        obj = e5;
                                                        str2 = str;
                                                        ihiVar4 = ihiVar7;
                                                        list = list4;
                                                        deliveryPaidInsurancePresenter$getArgs$1 = deliveryPaidInsurancePresenter$getArgs$12;
                                                        paidInsuranceScreenSource5 = paidInsuranceScreenSource6;
                                                        charSequence2 = (CharSequence) obj;
                                                        str = str2;
                                                        deliveryPaidInsurancePresenter$getArgs$13 = deliveryPaidInsurancePresenter$getArgs$1;
                                                        ihiVar = ihiVar4;
                                                        v990Var = new v990(charSequence, charSequence2);
                                                        paidInsuranceScreenSource2 = paidInsuranceScreenSource5;
                                                        deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$13;
                                                        str3 = str;
                                                        String str25 = ihiVar.a;
                                                        fhiVar = ihiVar.h;
                                                        k7x0 k7x0Var = this.a;
                                                        a = str25 == null ? ((m7x0) k7x0Var).a(str25) : null;
                                                        xgiVar = ihiVar.f;
                                                        if (xgiVar == null) {
                                                            String str26 = xgiVar.b;
                                                            String str27 = xgiVar.c;
                                                            String str28 = xgiVar.a;
                                                            if (str28 == null && str27 == null && str26 == null) {
                                                                w990Var2 = null;
                                                            } else {
                                                                if (str28 == null) {
                                                                    str28 = "";
                                                                }
                                                                w990Var2 = new w990(str28, str27, str26 != null ? ((m7x0) k7x0Var).a(str26) : null);
                                                            }
                                                            w990Var = w990Var2;
                                                        } else {
                                                            w990Var = null;
                                                        }
                                                        str4 = ihiVar.g;
                                                        if (fhiVar != null) {
                                                            u990Var = null;
                                                            return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                                                        }
                                                        int i2 = bhi.a[paidInsuranceScreenSource2.ordinal()];
                                                        if (i2 == 1) {
                                                            hhi hhiVar5 = fhiVar.b;
                                                            if (hhiVar5 == null) {
                                                                return null;
                                                            }
                                                            FormattedText formattedText8 = hhiVar5.a.a;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$0 = null;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$1 = null;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$2 = null;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$3 = hhiVar5;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$4 = str3;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$5 = list;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$6 = list2;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$7 = v990Var;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$8 = a;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$9 = w990Var;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$10 = str4;
                                                            deliveryPaidInsurancePresenter$getArgs$12.label = 4;
                                                            DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$110 = deliveryPaidInsurancePresenter$getArgs$12;
                                                            Object e6 = ru.yandex.taxi.widget.c.e(this.e, formattedText8, null, false, deliveryPaidInsurancePresenter$getArgs$110, 30);
                                                            if (e6 != coroutineSingletons) {
                                                                list5 = list2;
                                                                str5 = a;
                                                                list6 = list;
                                                                str6 = str3;
                                                                deliveryPaidInsurancePresenter$getArgs$14 = deliveryPaidInsurancePresenter$getArgs$110;
                                                                hhiVar = hhiVar5;
                                                                obj = e6;
                                                                w990 w990Var8 = w990Var;
                                                                charSequence3 = (CharSequence) obj;
                                                                formattedText2 = hhiVar.a.b;
                                                                if (formattedText2 == null) {
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$0 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$1 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$2 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$3 = hhiVar;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$4 = charSequence3;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$5 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$6 = str6;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$7 = list6;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$8 = list5;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$9 = v990Var;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$10 = str5;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$11 = w990Var8;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.L$12 = str4;
                                                                    deliveryPaidInsurancePresenter$getArgs$14.label = 5;
                                                                    hhi hhiVar6 = hhiVar;
                                                                    Object e7 = ru.yandex.taxi.widget.c.e(this.e, formattedText2, null, false, deliveryPaidInsurancePresenter$getArgs$14, 30);
                                                                    if (e7 != coroutineSingletons) {
                                                                        w990Var4 = w990Var8;
                                                                        str11 = str5;
                                                                        v990Var3 = v990Var;
                                                                        list11 = list5;
                                                                        list12 = list6;
                                                                        str12 = str6;
                                                                        hhiVar2 = hhiVar6;
                                                                        charSequence5 = charSequence3;
                                                                        obj = e7;
                                                                        str13 = str4;
                                                                        deliveryPaidInsurancePresenter$getArgs$1 = deliveryPaidInsurancePresenter$getArgs$14;
                                                                        String str29 = str11;
                                                                        charSequence4 = (CharSequence) obj;
                                                                        charSequence3 = charSequence5;
                                                                        str10 = str29;
                                                                        String str30 = str12;
                                                                        w990Var3 = w990Var4;
                                                                        str9 = str30;
                                                                        list10 = list11;
                                                                        list9 = list12;
                                                                        deliveryPaidInsurancePresenter$getArgs$16 = deliveryPaidInsurancePresenter$getArgs$1;
                                                                        str4 = str13;
                                                                        hhiVar = hhiVar2;
                                                                        v990Var2 = v990Var3;
                                                                        t990 t990Var5 = new t990(charSequence3, charSequence4, b(hhiVar.a.c));
                                                                        FormattedText formattedText9 = hhiVar.b.a;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$0 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$1 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$2 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$3 = hhiVar;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$4 = t990Var5;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$5 = str9;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$6 = list9;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$7 = list10;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$8 = v990Var2;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$9 = str10;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$10 = w990Var3;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$11 = str4;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.L$12 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$16.label = 6;
                                                                        String str31 = str9;
                                                                        e = ru.yandex.taxi.widget.c.e(this.e, formattedText9, null, false, deliveryPaidInsurancePresenter$getArgs$16, 30);
                                                                        if (e != coroutineSingletons) {
                                                                            str3 = str31;
                                                                            obj = e;
                                                                            deliveryPaidInsurancePresenter$getArgs$17 = deliveryPaidInsurancePresenter$getArgs$16;
                                                                            hhiVar3 = hhiVar;
                                                                            t990Var = t990Var5;
                                                                            charSequence6 = (CharSequence) obj;
                                                                            formattedText3 = hhiVar3.b.b;
                                                                            if (formattedText3 != null) {
                                                                                charSequence7 = null;
                                                                                u990Var2 = new u990(t990Var, new t990(charSequence6, charSequence7, b(hhiVar3.b.c)));
                                                                                w990Var = w990Var3;
                                                                                a = str10;
                                                                                v990Var = v990Var2;
                                                                                list2 = list10;
                                                                                list = list9;
                                                                                u990Var = u990Var2;
                                                                                return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                                                                            }
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$0 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$1 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$2 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$3 = hhiVar3;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$4 = t990Var;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$5 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$6 = charSequence6;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$7 = str3;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$8 = list9;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$9 = list10;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$10 = v990Var2;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$11 = str10;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$12 = w990Var3;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.L$13 = str4;
                                                                            deliveryPaidInsurancePresenter$getArgs$17.label = 7;
                                                                            t990 t990Var6 = t990Var;
                                                                            hhi hhiVar7 = hhiVar3;
                                                                            Object e8 = ru.yandex.taxi.widget.c.e(this.e, formattedText3, null, false, deliveryPaidInsurancePresenter$getArgs$17, 30);
                                                                            if (e8 != coroutineSingletons) {
                                                                                str14 = str4;
                                                                                str15 = str3;
                                                                                str16 = str10;
                                                                                v990Var4 = v990Var2;
                                                                                list13 = list10;
                                                                                list14 = list9;
                                                                                hhiVar4 = hhiVar7;
                                                                                charSequence8 = charSequence6;
                                                                                obj = e8;
                                                                                w990Var5 = w990Var3;
                                                                                t990Var2 = t990Var6;
                                                                                t990 t990Var7 = t990Var2;
                                                                                w990Var3 = w990Var5;
                                                                                t990Var = t990Var7;
                                                                                hhi hhiVar8 = hhiVar4;
                                                                                str10 = str16;
                                                                                hhiVar3 = hhiVar8;
                                                                                str4 = str14;
                                                                                v990Var2 = v990Var4;
                                                                                list10 = list13;
                                                                                list9 = list14;
                                                                                charSequence7 = (CharSequence) obj;
                                                                                charSequence6 = charSequence8;
                                                                                str3 = str15;
                                                                                u990Var2 = new u990(t990Var, new t990(charSequence6, charSequence7, b(hhiVar3.b.c)));
                                                                                w990Var = w990Var3;
                                                                                a = str10;
                                                                                v990Var = v990Var2;
                                                                                list2 = list10;
                                                                                list = list9;
                                                                                u990Var = u990Var2;
                                                                                return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    deliveryPaidInsurancePresenter$getArgs$16 = deliveryPaidInsurancePresenter$getArgs$14;
                                                                    str9 = str6;
                                                                    charSequence4 = null;
                                                                    list9 = list6;
                                                                    list10 = list5;
                                                                    v990Var2 = v990Var;
                                                                    str10 = str5;
                                                                    w990Var3 = w990Var8;
                                                                    t990 t990Var52 = new t990(charSequence3, charSequence4, b(hhiVar.a.c));
                                                                    FormattedText formattedText92 = hhiVar.b.a;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$0 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$1 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$2 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$3 = hhiVar;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$4 = t990Var52;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$5 = str9;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$6 = list9;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$7 = list10;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$8 = v990Var2;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$9 = str10;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$10 = w990Var3;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$11 = str4;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.L$12 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$16.label = 6;
                                                                    String str312 = str9;
                                                                    e = ru.yandex.taxi.widget.c.e(this.e, formattedText92, null, false, deliveryPaidInsurancePresenter$getArgs$16, 30);
                                                                    if (e != coroutineSingletons) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (i2 != 2) {
                                                                w511.b();
                                                                return null;
                                                            }
                                                            FormattedText formattedText10 = fhiVar.a.a.a;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$0 = null;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$1 = null;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$2 = fhiVar;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$3 = str3;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$4 = list;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$5 = list2;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$6 = v990Var;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$7 = a;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$8 = w990Var;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$9 = str4;
                                                            deliveryPaidInsurancePresenter$getArgs$12.L$10 = null;
                                                            deliveryPaidInsurancePresenter$getArgs$12.label = 8;
                                                            DeliveryPaidInsurancePresenter$getArgs$1 deliveryPaidInsurancePresenter$getArgs$111 = deliveryPaidInsurancePresenter$getArgs$12;
                                                            Object e9 = ru.yandex.taxi.widget.c.e(this.e, formattedText10, null, false, deliveryPaidInsurancePresenter$getArgs$111, 30);
                                                            if (e9 != coroutineSingletons) {
                                                                str7 = a;
                                                                list7 = list;
                                                                str8 = str3;
                                                                deliveryPaidInsurancePresenter$getArgs$15 = deliveryPaidInsurancePresenter$getArgs$111;
                                                                list8 = list2;
                                                                fhiVar2 = fhiVar;
                                                                obj = e9;
                                                                w990 w990Var9 = w990Var;
                                                                charSequence9 = (CharSequence) obj;
                                                                formattedText4 = fhiVar2.a.a.b;
                                                                if (formattedText4 == null) {
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$0 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$1 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$2 = fhiVar2;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$3 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$4 = charSequence9;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$5 = str8;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$6 = list7;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$7 = list8;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$8 = v990Var;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$9 = str7;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$10 = w990Var9;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.L$11 = str4;
                                                                    deliveryPaidInsurancePresenter$getArgs$15.label = 9;
                                                                    fhi fhiVar6 = fhiVar2;
                                                                    Object e10 = ru.yandex.taxi.widget.c.e(this.e, formattedText4, null, false, deliveryPaidInsurancePresenter$getArgs$15, 30);
                                                                    if (e10 != coroutineSingletons) {
                                                                        w990Var6 = w990Var9;
                                                                        str18 = str7;
                                                                        v990Var5 = v990Var;
                                                                        list15 = list8;
                                                                        list16 = list7;
                                                                        str19 = str8;
                                                                        fhiVar3 = fhiVar6;
                                                                        charSequence11 = charSequence9;
                                                                        obj = e10;
                                                                        str20 = str4;
                                                                        deliveryPaidInsurancePresenter$getArgs$1 = deliveryPaidInsurancePresenter$getArgs$15;
                                                                        list9 = list16;
                                                                        w990Var3 = w990Var6;
                                                                        str17 = str19;
                                                                        str10 = str18;
                                                                        charSequence10 = (CharSequence) obj;
                                                                        charSequence9 = charSequence11;
                                                                        v990Var2 = v990Var5;
                                                                        deliveryPaidInsurancePresenter$getArgs$18 = deliveryPaidInsurancePresenter$getArgs$1;
                                                                        str4 = str20;
                                                                        fhiVar2 = fhiVar3;
                                                                        list10 = list15;
                                                                        t990 t990Var8 = new t990(charSequence9, charSequence10, b(fhiVar2.a.a.c));
                                                                        FormattedText formattedText11 = fhiVar2.a.b.a;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$0 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$1 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$2 = fhiVar2;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$3 = t990Var8;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$4 = str17;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$5 = list9;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$6 = list10;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$7 = v990Var2;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$8 = str10;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$9 = w990Var3;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$10 = str4;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.L$11 = null;
                                                                        deliveryPaidInsurancePresenter$getArgs$18.label = 10;
                                                                        String str32 = str17;
                                                                        e2 = ru.yandex.taxi.widget.c.e(this.e, formattedText11, null, false, deliveryPaidInsurancePresenter$getArgs$18, 30);
                                                                        if (e2 != coroutineSingletons) {
                                                                            str3 = str32;
                                                                            obj = e2;
                                                                            deliveryPaidInsurancePresenter$getArgs$19 = deliveryPaidInsurancePresenter$getArgs$18;
                                                                            fhiVar4 = fhiVar2;
                                                                            t990Var3 = t990Var8;
                                                                            charSequence12 = (CharSequence) obj;
                                                                            formattedText5 = fhiVar4.a.b.b;
                                                                            if (formattedText5 != null) {
                                                                                charSequence13 = null;
                                                                                u990Var2 = new u990(t990Var3, new t990(charSequence12, charSequence13, b(fhiVar4.a.b.c)));
                                                                                w990Var = w990Var3;
                                                                                a = str10;
                                                                                v990Var = v990Var2;
                                                                                list2 = list10;
                                                                                list = list9;
                                                                                u990Var = u990Var2;
                                                                                return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                                                                            }
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$0 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$1 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$2 = fhiVar4;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$3 = null;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$4 = t990Var3;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$5 = charSequence12;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$6 = str3;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$7 = list9;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$8 = list10;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$9 = v990Var2;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$10 = str10;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$11 = w990Var3;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.L$12 = str4;
                                                                            deliveryPaidInsurancePresenter$getArgs$19.label = 11;
                                                                            t990 t990Var9 = t990Var3;
                                                                            fhi fhiVar7 = fhiVar4;
                                                                            Object e11 = ru.yandex.taxi.widget.c.e(this.e, formattedText5, null, false, deliveryPaidInsurancePresenter$getArgs$19, 30);
                                                                            if (e11 != coroutineSingletons) {
                                                                                str21 = str4;
                                                                                str22 = str3;
                                                                                str23 = str10;
                                                                                v990Var6 = v990Var2;
                                                                                list17 = list10;
                                                                                list18 = list9;
                                                                                fhiVar5 = fhiVar7;
                                                                                charSequence14 = charSequence12;
                                                                                obj = e11;
                                                                                w990Var7 = w990Var3;
                                                                                t990Var4 = t990Var9;
                                                                                t990 t990Var10 = t990Var4;
                                                                                w990Var3 = w990Var7;
                                                                                t990Var3 = t990Var10;
                                                                                fhi fhiVar8 = fhiVar5;
                                                                                str10 = str23;
                                                                                fhiVar4 = fhiVar8;
                                                                                str4 = str21;
                                                                                v990Var2 = v990Var6;
                                                                                list10 = list17;
                                                                                list9 = list18;
                                                                                charSequence13 = (CharSequence) obj;
                                                                                charSequence12 = charSequence14;
                                                                                str3 = str22;
                                                                                u990Var2 = new u990(t990Var3, new t990(charSequence12, charSequence13, b(fhiVar4.a.b.c)));
                                                                                w990Var = w990Var3;
                                                                                a = str10;
                                                                                v990Var = v990Var2;
                                                                                list2 = list10;
                                                                                list = list9;
                                                                                u990Var = u990Var2;
                                                                                return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    deliveryPaidInsurancePresenter$getArgs$18 = deliveryPaidInsurancePresenter$getArgs$15;
                                                                    str17 = str8;
                                                                    charSequence10 = null;
                                                                    list9 = list7;
                                                                    list10 = list8;
                                                                    v990Var2 = v990Var;
                                                                    str10 = str7;
                                                                    w990Var3 = w990Var9;
                                                                    t990 t990Var82 = new t990(charSequence9, charSequence10, b(fhiVar2.a.a.c));
                                                                    FormattedText formattedText112 = fhiVar2.a.b.a;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$0 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$1 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$2 = fhiVar2;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$3 = t990Var82;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$4 = str17;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$5 = list9;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$6 = list10;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$7 = v990Var2;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$8 = str10;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$9 = w990Var3;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$10 = str4;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.L$11 = null;
                                                                    deliveryPaidInsurancePresenter$getArgs$18.label = 10;
                                                                    String str322 = str17;
                                                                    e2 = ru.yandex.taxi.widget.c.e(this.e, formattedText112, null, false, deliveryPaidInsurancePresenter$getArgs$18, 30);
                                                                    if (e2 != coroutineSingletons) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    ihi ihiVar8 = ihiVar3;
                                                    PaidInsuranceScreenSource paidInsuranceScreenSource7 = paidInsuranceScreenSource3;
                                                    charSequence = charSequence15;
                                                    list = list4;
                                                    charSequence2 = null;
                                                    deliveryPaidInsurancePresenter$getArgs$13 = deliveryPaidInsurancePresenter$getArgs$12;
                                                    ihiVar = ihiVar8;
                                                    paidInsuranceScreenSource5 = paidInsuranceScreenSource7;
                                                    v990Var = new v990(charSequence, charSequence2);
                                                    paidInsuranceScreenSource2 = paidInsuranceScreenSource5;
                                                    deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$13;
                                                    str3 = str;
                                                    String str252 = ihiVar.a;
                                                    fhiVar = ihiVar.h;
                                                    k7x0 k7x0Var2 = this.a;
                                                    if (str252 == null) {
                                                    }
                                                    xgiVar = ihiVar.f;
                                                    if (xgiVar == null) {
                                                    }
                                                    str4 = ihiVar.g;
                                                    if (fhiVar != null) {
                                                    }
                                                }
                                            }
                                        } else {
                                            v990Var = null;
                                            str3 = str;
                                            String str2522 = ihiVar.a;
                                            fhiVar = ihiVar.h;
                                            k7x0 k7x0Var22 = this.a;
                                            if (str2522 == null) {
                                            }
                                            xgiVar = ihiVar.f;
                                            if (xgiVar == null) {
                                            }
                                            str4 = ihiVar.g;
                                            if (fhiVar != null) {
                                            }
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                        } else {
                            deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$1;
                            str = str24;
                            list2 = null;
                            ihiVar = ihiVar5;
                            paidInsuranceScreenSource2 = paidInsuranceScreenSource;
                            lhiVar = ihiVar.c;
                            if (lhiVar == null) {
                            }
                        }
                    case 1:
                        collection = (Collection) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        List list22 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        String str33 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        Iterator it3 = (Iterator) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        collection2 = (Collection) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        ihi ihiVar9 = (ihi) deliveryPaidInsurancePresenter$getArgs$1.L$1;
                        paidInsuranceScreenSource4 = (PaidInsuranceScreenSource) deliveryPaidInsurancePresenter$getArgs$1.L$0;
                        kotlin.b.b(obj);
                        str = str33;
                        ihiVar2 = ihiVar9;
                        deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$1;
                        list3 = list22;
                        it = it3;
                        collection.add((CharSequence) obj);
                        collection = collection2;
                        paidInsuranceScreenSource2 = paidInsuranceScreenSource4;
                        if (it.hasNext()) {
                        }
                        break;
                    case 2:
                        list2 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        List list23 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        String str34 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        lhiVar2 = (lhi) deliveryPaidInsurancePresenter$getArgs$1.L$2;
                        ihi ihiVar10 = (ihi) deliveryPaidInsurancePresenter$getArgs$1.L$1;
                        PaidInsuranceScreenSource paidInsuranceScreenSource8 = (PaidInsuranceScreenSource) deliveryPaidInsurancePresenter$getArgs$1.L$0;
                        kotlin.b.b(obj);
                        str = str34;
                        paidInsuranceScreenSource3 = paidInsuranceScreenSource8;
                        deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$1;
                        list4 = list23;
                        ihiVar3 = ihiVar10;
                        CharSequence charSequence152 = (CharSequence) obj;
                        formattedText = lhiVar2.b;
                        if (formattedText == null) {
                        }
                        break;
                    case 3:
                        list2 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        list = (List) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        str2 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        charSequence = (CharSequence) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        ihiVar4 = (ihi) deliveryPaidInsurancePresenter$getArgs$1.L$1;
                        paidInsuranceScreenSource5 = (PaidInsuranceScreenSource) deliveryPaidInsurancePresenter$getArgs$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        str = str2;
                        deliveryPaidInsurancePresenter$getArgs$13 = deliveryPaidInsurancePresenter$getArgs$1;
                        ihiVar = ihiVar4;
                        v990Var = new v990(charSequence, charSequence2);
                        paidInsuranceScreenSource2 = paidInsuranceScreenSource5;
                        deliveryPaidInsurancePresenter$getArgs$12 = deliveryPaidInsurancePresenter$getArgs$13;
                        str3 = str;
                        String str25222 = ihiVar.a;
                        fhiVar = ihiVar.h;
                        k7x0 k7x0Var222 = this.a;
                        if (str25222 == null) {
                        }
                        xgiVar = ihiVar.f;
                        if (xgiVar == null) {
                        }
                        str4 = ihiVar.g;
                        if (fhiVar != null) {
                        }
                        break;
                    case 4:
                        String str35 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        w990Var = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        String str36 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        v990 v990Var7 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        List list24 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        List list25 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        String str37 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        hhi hhiVar9 = (hhi) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        kotlin.b.b(obj);
                        deliveryPaidInsurancePresenter$getArgs$14 = deliveryPaidInsurancePresenter$getArgs$1;
                        str4 = str35;
                        list5 = list24;
                        list6 = list25;
                        str6 = str37;
                        hhiVar = hhiVar9;
                        str5 = str36;
                        v990Var = v990Var7;
                        w990 w990Var82 = w990Var;
                        charSequence3 = (CharSequence) obj;
                        formattedText2 = hhiVar.a.b;
                        if (formattedText2 == null) {
                        }
                        break;
                    case 5:
                        str13 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$12;
                        w990Var4 = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$11;
                        str11 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        v990Var3 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        list11 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        list12 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        str12 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        charSequence5 = (CharSequence) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        hhiVar2 = (hhi) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        kotlin.b.b(obj);
                        String str292 = str11;
                        charSequence4 = (CharSequence) obj;
                        charSequence3 = charSequence5;
                        str10 = str292;
                        String str302 = str12;
                        w990Var3 = w990Var4;
                        str9 = str302;
                        list10 = list11;
                        list9 = list12;
                        deliveryPaidInsurancePresenter$getArgs$16 = deliveryPaidInsurancePresenter$getArgs$1;
                        str4 = str13;
                        hhiVar = hhiVar2;
                        v990Var2 = v990Var3;
                        t990 t990Var522 = new t990(charSequence3, charSequence4, b(hhiVar.a.c));
                        FormattedText formattedText922 = hhiVar.b.a;
                        deliveryPaidInsurancePresenter$getArgs$16.L$0 = null;
                        deliveryPaidInsurancePresenter$getArgs$16.L$1 = null;
                        deliveryPaidInsurancePresenter$getArgs$16.L$2 = null;
                        deliveryPaidInsurancePresenter$getArgs$16.L$3 = hhiVar;
                        deliveryPaidInsurancePresenter$getArgs$16.L$4 = t990Var522;
                        deliveryPaidInsurancePresenter$getArgs$16.L$5 = str9;
                        deliveryPaidInsurancePresenter$getArgs$16.L$6 = list9;
                        deliveryPaidInsurancePresenter$getArgs$16.L$7 = list10;
                        deliveryPaidInsurancePresenter$getArgs$16.L$8 = v990Var2;
                        deliveryPaidInsurancePresenter$getArgs$16.L$9 = str10;
                        deliveryPaidInsurancePresenter$getArgs$16.L$10 = w990Var3;
                        deliveryPaidInsurancePresenter$getArgs$16.L$11 = str4;
                        deliveryPaidInsurancePresenter$getArgs$16.L$12 = null;
                        deliveryPaidInsurancePresenter$getArgs$16.label = 6;
                        String str3122 = str9;
                        e = ru.yandex.taxi.widget.c.e(this.e, formattedText922, null, false, deliveryPaidInsurancePresenter$getArgs$16, 30);
                        if (e != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        String str38 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$11;
                        w990 w990Var10 = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        String str39 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        v990 v990Var8 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        List list26 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        List list27 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        String str40 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        t990 t990Var11 = (t990) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        hhi hhiVar10 = (hhi) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        kotlin.b.b(obj);
                        deliveryPaidInsurancePresenter$getArgs$17 = deliveryPaidInsurancePresenter$getArgs$1;
                        str4 = str38;
                        list10 = list26;
                        list9 = list27;
                        str3 = str40;
                        t990Var = t990Var11;
                        w990Var3 = w990Var10;
                        str10 = str39;
                        hhiVar3 = hhiVar10;
                        v990Var2 = v990Var8;
                        charSequence6 = (CharSequence) obj;
                        formattedText3 = hhiVar3.b.b;
                        if (formattedText3 != null) {
                        }
                        break;
                    case 7:
                        str14 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$13;
                        w990Var5 = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$12;
                        str16 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$11;
                        v990Var4 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        list13 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        list14 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        str15 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        charSequence8 = (CharSequence) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        t990Var2 = (t990) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        hhiVar4 = (hhi) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        kotlin.b.b(obj);
                        t990 t990Var72 = t990Var2;
                        w990Var3 = w990Var5;
                        t990Var = t990Var72;
                        hhi hhiVar82 = hhiVar4;
                        str10 = str16;
                        hhiVar3 = hhiVar82;
                        str4 = str14;
                        v990Var2 = v990Var4;
                        list10 = list13;
                        list9 = list14;
                        charSequence7 = (CharSequence) obj;
                        charSequence6 = charSequence8;
                        str3 = str15;
                        u990Var2 = new u990(t990Var, new t990(charSequence6, charSequence7, b(hhiVar3.b.c)));
                        w990Var = w990Var3;
                        a = str10;
                        v990Var = v990Var2;
                        list2 = list10;
                        list = list9;
                        u990Var = u990Var2;
                        return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                    case 8:
                        String str41 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        w990Var = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        String str42 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        v990 v990Var9 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        List list28 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        List list29 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        String str43 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        fhi fhiVar9 = (fhi) deliveryPaidInsurancePresenter$getArgs$1.L$2;
                        kotlin.b.b(obj);
                        deliveryPaidInsurancePresenter$getArgs$15 = deliveryPaidInsurancePresenter$getArgs$1;
                        str4 = str41;
                        list7 = list29;
                        str8 = str43;
                        fhiVar2 = fhiVar9;
                        str7 = str42;
                        v990Var = v990Var9;
                        list8 = list28;
                        w990 w990Var92 = w990Var;
                        charSequence9 = (CharSequence) obj;
                        formattedText4 = fhiVar2.a.a.b;
                        if (formattedText4 == null) {
                        }
                        break;
                    case 9:
                        str20 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$11;
                        w990Var6 = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        str18 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        v990Var5 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        list15 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        list16 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        str19 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        charSequence11 = (CharSequence) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        fhiVar3 = (fhi) deliveryPaidInsurancePresenter$getArgs$1.L$2;
                        kotlin.b.b(obj);
                        list9 = list16;
                        w990Var3 = w990Var6;
                        str17 = str19;
                        str10 = str18;
                        charSequence10 = (CharSequence) obj;
                        charSequence9 = charSequence11;
                        v990Var2 = v990Var5;
                        deliveryPaidInsurancePresenter$getArgs$18 = deliveryPaidInsurancePresenter$getArgs$1;
                        str4 = str20;
                        fhiVar2 = fhiVar3;
                        list10 = list15;
                        t990 t990Var822 = new t990(charSequence9, charSequence10, b(fhiVar2.a.a.c));
                        FormattedText formattedText1122 = fhiVar2.a.b.a;
                        deliveryPaidInsurancePresenter$getArgs$18.L$0 = null;
                        deliveryPaidInsurancePresenter$getArgs$18.L$1 = null;
                        deliveryPaidInsurancePresenter$getArgs$18.L$2 = fhiVar2;
                        deliveryPaidInsurancePresenter$getArgs$18.L$3 = t990Var822;
                        deliveryPaidInsurancePresenter$getArgs$18.L$4 = str17;
                        deliveryPaidInsurancePresenter$getArgs$18.L$5 = list9;
                        deliveryPaidInsurancePresenter$getArgs$18.L$6 = list10;
                        deliveryPaidInsurancePresenter$getArgs$18.L$7 = v990Var2;
                        deliveryPaidInsurancePresenter$getArgs$18.L$8 = str10;
                        deliveryPaidInsurancePresenter$getArgs$18.L$9 = w990Var3;
                        deliveryPaidInsurancePresenter$getArgs$18.L$10 = str4;
                        deliveryPaidInsurancePresenter$getArgs$18.L$11 = null;
                        deliveryPaidInsurancePresenter$getArgs$18.label = 10;
                        String str3222 = str17;
                        e2 = ru.yandex.taxi.widget.c.e(this.e, formattedText1122, null, false, deliveryPaidInsurancePresenter$getArgs$18, 30);
                        if (e2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 10:
                        String str44 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        w990 w990Var11 = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        String str45 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        v990 v990Var10 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        List list30 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        List list31 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        String str46 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        t990 t990Var12 = (t990) deliveryPaidInsurancePresenter$getArgs$1.L$3;
                        fhi fhiVar10 = (fhi) deliveryPaidInsurancePresenter$getArgs$1.L$2;
                        kotlin.b.b(obj);
                        deliveryPaidInsurancePresenter$getArgs$19 = deliveryPaidInsurancePresenter$getArgs$1;
                        str4 = str44;
                        list10 = list30;
                        list9 = list31;
                        str3 = str46;
                        t990Var3 = t990Var12;
                        w990Var3 = w990Var11;
                        str10 = str45;
                        fhiVar4 = fhiVar10;
                        v990Var2 = v990Var10;
                        charSequence12 = (CharSequence) obj;
                        formattedText5 = fhiVar4.a.b.b;
                        if (formattedText5 != null) {
                        }
                        break;
                    case 11:
                        str21 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$12;
                        w990Var7 = (w990) deliveryPaidInsurancePresenter$getArgs$1.L$11;
                        str23 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$10;
                        v990Var6 = (v990) deliveryPaidInsurancePresenter$getArgs$1.L$9;
                        list17 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$8;
                        list18 = (List) deliveryPaidInsurancePresenter$getArgs$1.L$7;
                        str22 = (String) deliveryPaidInsurancePresenter$getArgs$1.L$6;
                        charSequence14 = (CharSequence) deliveryPaidInsurancePresenter$getArgs$1.L$5;
                        t990Var4 = (t990) deliveryPaidInsurancePresenter$getArgs$1.L$4;
                        fhiVar5 = (fhi) deliveryPaidInsurancePresenter$getArgs$1.L$2;
                        kotlin.b.b(obj);
                        t990 t990Var102 = t990Var4;
                        w990Var3 = w990Var7;
                        t990Var3 = t990Var102;
                        fhi fhiVar82 = fhiVar5;
                        str10 = str23;
                        fhiVar4 = fhiVar82;
                        str4 = str21;
                        v990Var2 = v990Var6;
                        list10 = list17;
                        list9 = list18;
                        charSequence13 = (CharSequence) obj;
                        charSequence12 = charSequence14;
                        str3 = str22;
                        u990Var2 = new u990(t990Var3, new t990(charSequence12, charSequence13, b(fhiVar4.a.b.c)));
                        w990Var = w990Var3;
                        a = str10;
                        v990Var = v990Var2;
                        list2 = list10;
                        list = list9;
                        u990Var = u990Var2;
                        return new x990(str3, list, list2, v990Var, a, w990Var, str4, u990Var, ((Boolean) this.d.c.getValue()).booleanValue());
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        deliveryPaidInsurancePresenter$getArgs$1 = new DeliveryPaidInsurancePresenter$getArgs$1(this, continuationImpl);
        Object obj2 = deliveryPaidInsurancePresenter$getArgs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (deliveryPaidInsurancePresenter$getArgs$1.label) {
        }
    }
}
