package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.ern;
import defpackage.f1d;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class z2 implements com.yandex.plus.bdui.plus.checkout.content.h {
    public static final /* synthetic */ s9f[] m = {new yxm(z2.class, "acceptButtonText", "getAcceptButtonText()Ljava/lang/String;", 0), f1d.c(ern.a, z2.class, "rejectButtonText", "getRejectButtonText()Ljava/lang/String;", 0)};
    public final e a;
    public final com.yandex.plus.core.data.common.y b;
    public final PlusPayRichText c;
    public final PlusPayRichText d;
    public final ArrayList e;
    public final com.yandex.plus.core.templating.template.j f;
    public final com.yandex.plus.core.templating.template.j g;
    public final PlusPayRichText h;
    public final com.yandex.plus.bdui.action.a i;
    public final com.yandex.plus.bdui.action.a j;
    public final com.yandex.plus.bdui.action.a k;
    public final com.yandex.plus.bdui.action.a l;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z2(e eVar, com.yandex.plus.core.data.common.y yVar, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, ArrayList arrayList, r rVar, r2 r2Var, PlusPayRichText plusPayRichText3) {
        Function1 function1;
        Function1 e2Var;
        lm4 a;
        Function1 function12;
        Function1 y2Var;
        this.a = eVar;
        this.b = yVar;
        this.c = plusPayRichText;
        this.d = plusPayRichText2;
        this.e = arrayList;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        x2 x2Var = r2Var.a;
        String str = x2Var.a.e;
        com.yandex.plus.log.api.b bVar2 = rVar.b;
        lm4 a2 = ern.a(String.class);
        Class cls = Boolean.TYPE;
        boolean equals = a2.equals(ern.a(cls));
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 6);
        } else if (a2.equals(ern.a(cls8))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 10);
        } else if (a2.equals(ern.a(cls7))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 11);
        } else if (a2.equals(ern.a(cls6))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 12);
        } else if (a2.equals(ern.a(cls5))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 13);
        } else if (a2.equals(ern.a(BigInteger.class))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 14);
        } else if (a2.equals(ern.a(cls4))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 15);
        } else if (a2.equals(ern.a(cls3))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 16);
        } else if (a2.equals(ern.a(BigDecimal.class))) {
            e2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 17);
        } else if (a2.equals(ern.a(cls2))) {
            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 26);
        } else {
            if (!a2.equals(ern.a(String.class))) {
                function1 = null;
                if (function1 == null) {
                    wct.o(1, function1);
                } else {
                    function1 = null;
                }
                lm4 a3 = ern.a(String.class);
                Class b = a3.b();
                b.getClass();
                this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a3, b, ern.c(String.class)), bVar, str, bVar2, function1);
                String str2 = x2Var.a.f;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    y2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 28);
                } else if (a.equals(ern.a(cls8))) {
                    y2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 29);
                } else if (a.equals(ern.a(cls7))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 0);
                } else if (a.equals(ern.a(cls6))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 1);
                } else if (a.equals(ern.a(cls5))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 2);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 3);
                } else if (a.equals(ern.a(cls4))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 4);
                } else if (a.equals(ern.a(cls3))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 5);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 7);
                } else if (a.equals(ern.a(cls2))) {
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 8);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        function12 = null;
                        if (function12 != null) {
                            wct.o(1, function12);
                        } else {
                            function12 = null;
                        }
                        lm4 a4 = ern.a(String.class);
                        Class b2 = a4.b();
                        b2.getClass();
                        this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b2, ern.c(String.class)), bVar, str2, bVar2, function12);
                        this.h = plusPayRichText3;
                        l2 l2Var = x2Var.b;
                        this.i = l2Var.a;
                        this.j = l2Var.b;
                        this.k = l2Var.c;
                        this.l = l2Var.d;
                    }
                    y2Var = new y2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 9);
                }
                function12 = y2Var;
                if (function12 != null) {
                }
                lm4 a42 = ern.a(String.class);
                Class b22 = a42.b();
                b22.getClass();
                this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b22, ern.c(String.class)), bVar, str2, bVar2, function12);
                this.h = plusPayRichText3;
                l2 l2Var2 = x2Var.b;
                this.i = l2Var2.a;
                this.j = l2Var2.b;
                this.k = l2Var2.c;
                this.l = l2Var2.d;
            }
            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 27);
        }
        function1 = e2Var;
        if (function1 == null) {
        }
        lm4 a32 = ern.a(String.class);
        Class b3 = a32.b();
        b3.getClass();
        this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a32, b3, ern.c(String.class)), bVar, str, bVar2, function1);
        String str22 = x2Var.a.f;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        function12 = y2Var;
        if (function12 != null) {
        }
        lm4 a422 = ern.a(String.class);
        Class b222 = a422.b();
        b222.getClass();
        this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a422, b222, ern.c(String.class)), bVar, str22, bVar2, function12);
        this.h = plusPayRichText3;
        l2 l2Var22 = x2Var.b;
        this.i = l2Var22.a;
        this.j = l2Var22.b;
        this.k = l2Var22.c;
        this.l = l2Var22.d;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.l;
    }
}
