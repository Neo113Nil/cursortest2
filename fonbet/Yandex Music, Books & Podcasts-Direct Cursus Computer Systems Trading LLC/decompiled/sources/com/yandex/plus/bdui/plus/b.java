package com.yandex.plus.bdui.plus;

import com.yandex.plus.bdui.plus.action.serializer.r;
import com.yandex.plus.bdui.plus.checkout.content.serializer.e7;
import com.yandex.plus.bdui.plus.checkout.content.serializer.h5;
import com.yandex.plus.bdui.plus.checkout.content.serializer.i3;
import com.yandex.plus.bdui.plus.checkout.content.serializer.k;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.r2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.s7;
import com.yandex.plus.bdui.plus.checkout.content.serializer.w5;
import com.yandex.plus.bdui.plus.checkout.content.serializer.y3;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.bdui.plus.content.serializer.u0;
import com.yandex.plus.bdui.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ com.yandex.plus.log.api.b c;

    public /* synthetic */ b(f fVar, com.yandex.plus.log.api.b bVar, int i) {
        this.a = i;
        this.b = fVar;
        this.c = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) obj;
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) obj2;
                sVar.getClass();
                function0.getClass();
                return new r(function0, this.b, this.c, 3);
            case 1:
                Function0 function02 = (Function0) obj2;
                sVar.getClass();
                function02.getClass();
                return new u0(function02, this.b, this.c);
            case 2:
                Function0 function03 = (Function0) obj2;
                sVar.getClass();
                function03.getClass();
                return new r(function03, this.b, this.c, 4);
            case 3:
                Function0 function04 = (Function0) obj2;
                sVar.getClass();
                function04.getClass();
                return new r(function04, this.b, this.c, 5);
            case 4:
                Function0 function05 = (Function0) obj2;
                sVar.getClass();
                function05.getClass();
                com.yandex.plus.log.api.b bVar = this.c;
                bVar.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function05, k.Companion.serializer(), this.b, bVar, "PlusPayAppBarContentSerializer", 0);
            case 5:
                Function0 function06 = (Function0) obj2;
                sVar.getClass();
                function06.getClass();
                return new r(function06, this.b, this.c, 2);
            case 6:
                Function0 function07 = (Function0) obj2;
                sVar.getClass();
                function07.getClass();
                com.yandex.plus.log.api.b bVar2 = this.c;
                bVar2.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function07, p0.Companion.serializer(), this.b, bVar2, "PlusPayCheckoutContentSerializer", 1);
            case 7:
                Function0 function08 = (Function0) obj2;
                sVar.getClass();
                function08.getClass();
                com.yandex.plus.log.api.b bVar3 = this.c;
                bVar3.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function08, r2.Companion.serializer(), this.b, bVar3, "PlusPayClosingOfferContentSerializer", 2);
            case 8:
                Function0 function09 = (Function0) obj2;
                sVar.getClass();
                function09.getClass();
                com.yandex.plus.log.api.b bVar4 = this.c;
                bVar4.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function09, i3.Companion.serializer(), this.b, bVar4, "PlusPayCounterOffersContentSerializer", 3);
            case 9:
                Function0 function010 = (Function0) obj2;
                sVar.getClass();
                function010.getClass();
                com.yandex.plus.log.api.b bVar5 = this.c;
                bVar5.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function010, y3.Companion.serializer(), this.b, bVar5, "PlusPayErrorContentSerializer", 4);
            case 10:
                Function0 function011 = (Function0) obj2;
                sVar.getClass();
                function011.getClass();
                com.yandex.plus.log.api.b bVar6 = this.c;
                bVar6.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function011, h5.Companion.serializer(), this.b, bVar6, "PlusPayPollingContentSerializer", 5);
            case 11:
                Function0 function012 = (Function0) obj2;
                sVar.getClass();
                function012.getClass();
                com.yandex.plus.log.api.b bVar7 = this.c;
                bVar7.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function012, w5.Companion.serializer(), this.b, bVar7, "PlusPayPresaleContentSerializer", 6);
            case 12:
                Function0 function013 = (Function0) obj2;
                sVar.getClass();
                function013.getClass();
                com.yandex.plus.log.api.b bVar8 = this.c;
                bVar8.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function013, e7.Companion.serializer(), this.b, bVar8, "PlusPaySuccessContentSerializer", 7);
            case 13:
                Function0 function014 = (Function0) obj2;
                sVar.getClass();
                function014.getClass();
                com.yandex.plus.log.api.b bVar9 = this.c;
                bVar9.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.serializer.r(function014, s7.Companion.serializer(), this.b, bVar9, "PlusPayUpsaleContentSerializer", 8);
            case 14:
                Function0 function015 = (Function0) obj2;
                sVar.getClass();
                function015.getClass();
                return new r(function015, this.b, this.c, 6);
            default:
                Function0 function016 = (Function0) obj2;
                sVar.getClass();
                function016.getClass();
                return new r(function016, this.b, this.c, 7);
        }
    }
}
