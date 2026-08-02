package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.ern;
import defpackage.f1d;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class i1 implements com.yandex.plus.bdui.failure.d, com.yandex.plus.bdui.action.j {
    public static final /* synthetic */ s9f[] f = {new yxm(i1.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, i1.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0)};
    public final com.yandex.plus.core.templating.template.j a;
    public final com.yandex.plus.core.templating.template.j b;
    public final com.yandex.plus.bdui.plus.content.s c;
    public final com.yandex.plus.bdui.plus.content.b d;
    public final com.yandex.plus.bdui.action.a e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i1(com.yandex.plus.bdui.plus.action.serializer.r rVar, d1 d1Var, com.yandex.plus.bdui.plus.content.s sVar, com.yandex.plus.bdui.plus.content.s sVar2, com.yandex.plus.bdui.action.a aVar) {
        Function1 function1;
        Function1 h1Var;
        lm4 a;
        h1 h1Var2;
        h1 h1Var3;
        com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) rVar.f;
        String str = d1Var.a.a.a;
        com.yandex.plus.log.api.b bVar = rVar.b;
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
        com.yandex.plus.core.templating.template.a aVar2 = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 9);
        } else if (a2.equals(ern.a(cls8))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 13);
        } else if (a2.equals(ern.a(cls7))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 14);
        } else if (a2.equals(ern.a(cls6))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 15);
        } else if (a2.equals(ern.a(cls5))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 16);
        } else if (a2.equals(ern.a(BigInteger.class))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 17);
        } else if (a2.equals(ern.a(cls4))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 18);
        } else if (a2.equals(ern.a(cls3))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 19);
        } else if (a2.equals(ern.a(BigDecimal.class))) {
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 20);
        } else if (a2.equals(ern.a(cls2))) {
            h1Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 29);
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
                this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a3, b, ern.b(String.class)), fVar, str, bVar, function1);
                String str2 = d1Var.a.a.b;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 1);
                } else if (a.equals(ern.a(cls8))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 2);
                } else if (a.equals(ern.a(cls7))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 3);
                } else if (a.equals(ern.a(cls6))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 4);
                } else if (a.equals(ern.a(cls5))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 5);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 6);
                } else if (a.equals(ern.a(cls4))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 7);
                } else if (a.equals(ern.a(cls3))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 8);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 10);
                } else if (a.equals(ern.a(cls2))) {
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 11);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        h1Var2 = null;
                        if (h1Var2 != null) {
                            wct.o(1, h1Var2);
                        } else {
                            h1Var2 = null;
                        }
                        lm4 a4 = ern.a(String.class);
                        Class b2 = a4.b();
                        b2.getClass();
                        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b2, ern.b(String.class)), fVar, str2, bVar, h1Var2);
                        this.c = sVar;
                        this.d = sVar2;
                        this.e = aVar;
                    }
                    h1Var3 = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 12);
                }
                h1Var2 = h1Var3;
                if (h1Var2 != null) {
                }
                lm4 a42 = ern.a(String.class);
                Class b22 = a42.b();
                b22.getClass();
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b22, ern.b(String.class)), fVar, str2, bVar, h1Var2);
                this.c = sVar;
                this.d = sVar2;
                this.e = aVar;
            }
            h1Var = new h1(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 0);
        }
        function1 = h1Var;
        if (function1 == null) {
        }
        lm4 a32 = ern.a(String.class);
        Class b3 = a32.b();
        b3.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a32, b3, ern.b(String.class)), fVar, str, bVar, function1);
        String str22 = d1Var.a.a.b;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        h1Var2 = h1Var3;
        if (h1Var2 != null) {
        }
        lm4 a422 = ern.a(String.class);
        Class b222 = a422.b();
        b222.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a422, b222, ern.b(String.class)), fVar, str22, bVar, h1Var2);
        this.c = sVar;
        this.d = sVar2;
        this.e = aVar;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.e;
    }
}
