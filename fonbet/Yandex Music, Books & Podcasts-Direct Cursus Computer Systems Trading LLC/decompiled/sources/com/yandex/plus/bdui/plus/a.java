package com.yandex.plus.bdui.plus;

import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.action.serializer.e0;
import com.yandex.plus.bdui.plus.action.serializer.g;
import com.yandex.plus.bdui.plus.action.serializer.h;
import com.yandex.plus.bdui.plus.action.serializer.k;
import com.yandex.plus.bdui.plus.action.serializer.n;
import com.yandex.plus.bdui.plus.checkout.action.serializer.c0;
import com.yandex.plus.bdui.plus.checkout.action.serializer.f;
import com.yandex.plus.bdui.plus.checkout.action.serializer.i0;
import com.yandex.plus.bdui.plus.checkout.action.serializer.o0;
import com.yandex.plus.bdui.plus.checkout.action.serializer.w;
import com.yandex.plus.bdui.plus.checkout.content.controller.b0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.h8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.i2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p6;
import com.yandex.plus.bdui.plus.checkout.content.serializer.s4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.t8;
import com.yandex.plus.bdui.plus.shared.serializer.j;
import com.yandex.plus.bdui.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.log.api.b b;

    public /* synthetic */ a(com.yandex.plus.log.api.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) obj;
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) obj2;
                sVar.getClass();
                function0.getClass();
                com.yandex.plus.log.api.b bVar = this.b;
                bVar.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function0, com.yandex.plus.bdui.plus.shared.d.Companion.serializer(), bVar, "PlusActionsSharedDataSerializer", 15);
            case 1:
                Function0 function02 = (Function0) obj2;
                sVar.getClass();
                function02.getClass();
                com.yandex.plus.log.api.b bVar2 = this.b;
                bVar2.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function02, com.yandex.plus.bdui.plus.action.serializer.c.Companion.serializer(), bVar2, "PlusAuthorizeActionSerializer", 0);
            case 2:
                Function0 function03 = (Function0) obj2;
                sVar.getClass();
                function03.getClass();
                com.yandex.plus.log.api.b bVar3 = this.b;
                bVar3.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function03, e0.Companion.serializer(), bVar3, "PlusSharedActionSerializer", 4);
            case 3:
                m mVar = (m) obj2;
                sVar.getClass();
                mVar.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.controller.e(mVar, this.b);
            case 4:
                Function0 function04 = (Function0) obj2;
                sVar.getClass();
                function04.getClass();
                com.yandex.plus.log.api.b bVar4 = this.b;
                bVar4.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function04, i2.Companion.serializer(), bVar4, "PlusPayCloseContentSerializer", 10);
            case 5:
                m mVar2 = (m) obj2;
                sVar.getClass();
                mVar2.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.controller.m(mVar2, this.b);
            case 6:
                Function0 function05 = (Function0) obj2;
                sVar.getClass();
                function05.getClass();
                com.yandex.plus.log.api.b bVar5 = this.b;
                bVar5.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function05, s4.Companion.serializer(), bVar5, "PlusPayGetInAppInfoContentSerializer", 11);
            case 7:
                Function0 function06 = (Function0) obj2;
                sVar.getClass();
                function06.getClass();
                com.yandex.plus.log.api.b bVar6 = this.b;
                bVar6.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function06, f.Companion.serializer(), bVar6, "PlusPayGooglePlayCompletePurchaseActionSerializer", 5);
            case 8:
                Function0 function07 = (Function0) obj2;
                sVar.getClass();
                function07.getClass();
                com.yandex.plus.log.api.b bVar7 = this.b;
                bVar7.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function07, w.Companion.serializer(), bVar7, "PlusPayGooglePlayPurchaseActionSerializer", 6);
            case 9:
                Function0 function08 = (Function0) obj2;
                sVar.getClass();
                function08.getClass();
                com.yandex.plus.log.api.b bVar8 = this.b;
                bVar8.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function08, c0.Companion.serializer(), bVar8, "PlusPayGooglePlayRestorePurchasesActionSerializer", 7);
            case 10:
                Function0 function09 = (Function0) obj2;
                sVar.getClass();
                function09.getClass();
                com.yandex.plus.log.api.b bVar9 = this.b;
                bVar9.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function09, i0.Companion.serializer(), bVar9, "PlusPayOpenUrlActionSerializer", 8);
            case 11:
                m mVar3 = (m) obj2;
                sVar.getClass();
                mVar3.getClass();
                return new b0(mVar3, this.b);
            case 12:
                Function0 function010 = (Function0) obj2;
                sVar.getClass();
                function010.getClass();
                com.yandex.plus.log.api.b bVar10 = this.b;
                bVar10.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function010, p6.Companion.serializer(), bVar10, "PlusPayPurchaseContentSerializer", 12);
            case 13:
                Function0 function011 = (Function0) obj2;
                sVar.getClass();
                function011.getClass();
                com.yandex.plus.log.api.b bVar11 = this.b;
                bVar11.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function011, o0.Companion.serializer(), bVar11, "PlusPayShareActionSerializer", 9);
            case 14:
                Function0 function012 = (Function0) obj2;
                sVar.getClass();
                function012.getClass();
                com.yandex.plus.log.api.b bVar12 = this.b;
                bVar12.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function012, h8.Companion.serializer(), bVar12, "PlusPayUserAddNewCardContentSerializer", 13);
            case 15:
                Function0 function013 = (Function0) obj2;
                sVar.getClass();
                function013.getClass();
                com.yandex.plus.log.api.b bVar13 = this.b;
                bVar13.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function013, t8.Companion.serializer(), bVar13, "PlusPayUserAddNewSbpContentSerializer", 14);
            case 16:
                Function0 function014 = (Function0) obj2;
                sVar.getClass();
                function014.getClass();
                com.yandex.plus.log.api.b bVar14 = this.b;
                bVar14.getClass();
                return new h(function014, g.Companion.serializer(), bVar14, "PlusCloseActionSerializer");
            case 17:
                Function0 function015 = (Function0) obj2;
                sVar.getClass();
                function015.getClass();
                com.yandex.plus.log.api.b bVar15 = this.b;
                bVar15.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function015, k.Companion.serializer(), bVar15, "PlusDelayActionSerializer", 1);
            case 18:
                Function0 function016 = (Function0) obj2;
                sVar.getClass();
                function016.getClass();
                com.yandex.plus.log.api.b bVar16 = this.b;
                bVar16.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function016, n.Companion.serializer(), bVar16, "PlusMultiActionSerializer", 2);
            case 19:
                Function0 function017 = (Function0) obj2;
                sVar.getClass();
                function017.getClass();
                com.yandex.plus.log.api.b bVar17 = this.b;
                bVar17.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function017, com.yandex.plus.bdui.plus.action.serializer.b0.Companion.serializer(), bVar17, "PlusSendAnalyticsActionSerializer", 3);
            default:
                Function0 function018 = (Function0) obj2;
                sVar.getClass();
                function018.getClass();
                com.yandex.plus.log.api.b bVar18 = this.b;
                bVar18.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.d(function018, j.Companion.serializer(), bVar18, "PlusScenarioStepIdSharedDataSerializer", 16);
        }
    }
}
