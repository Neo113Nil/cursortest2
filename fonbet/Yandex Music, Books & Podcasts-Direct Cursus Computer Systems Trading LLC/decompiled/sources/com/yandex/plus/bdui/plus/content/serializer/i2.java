package com.yandex.plus.bdui.plus.content.serializer;

import com.connectsdk.service.DeviceService;
import defpackage.btf;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class i2 extends com.yandex.plus.bdui.plus.content.k {
    public final com.yandex.plus.core.templating.template.j b;
    public final com.yandex.plus.core.templating.template.j c;
    public final com.yandex.plus.core.templating.template.j d;
    public static final /* synthetic */ s9f[] f = {new yxm(i2.class, "text", "getText()Ljava/lang/String;", 0), f1d.c(ern.a, i2.class, DeviceService.KEY_DESC, "getDescription()Ljava/lang/String;", 0), new yxm(i2.class, "retryButtonText", "getRetryButtonText()Ljava/lang/String;", 0)};
    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a e = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
    public static final jyr g = btf.b(new b(22));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2(com.yandex.plus.bdui.plus.content.controller.f fVar, String str, String str2, String str3, com.yandex.plus.bdui.plus.content.s sVar, com.yandex.plus.log.api.b bVar) {
        super(sVar, (com.yandex.plus.bdui.plus.action.y) g.getValue());
        Function1 function1;
        Function1 h1Var;
        lm4 a;
        h2 h2Var;
        h2 h2Var2;
        lm4 a2;
        Function1 function12;
        Function1 h2Var3;
        fVar.getClass();
        str.getClass();
        str3.getClass();
        bVar.getClass();
        e.getClass();
        lm4 a3 = ern.a(String.class);
        Class cls = Boolean.TYPE;
        boolean equals = a3.equals(ern.a(cls));
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 1);
        } else if (a3.equals(ern.a(cls8))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 5);
        } else if (a3.equals(ern.a(cls7))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 6);
        } else if (a3.equals(ern.a(cls6))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 7);
        } else if (a3.equals(ern.a(cls5))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 8);
        } else if (a3.equals(ern.a(BigInteger.class))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 9);
        } else if (a3.equals(ern.a(cls4))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 10);
        } else if (a3.equals(ern.a(cls3))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 11);
        } else if (a3.equals(ern.a(BigDecimal.class))) {
            h1Var = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 12);
        } else if (a3.equals(ern.a(cls2))) {
            h1Var = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 21);
        } else {
            if (!a3.equals(ern.a(String.class))) {
                function1 = null;
                if (function1 == null) {
                    wct.o(1, function1);
                } else {
                    function1 = null;
                }
                lm4 a4 = ern.a(String.class);
                Class b = a4.b();
                b.getClass();
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b, ern.c(String.class)), fVar, str, bVar, function1);
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 15);
                } else if (a.equals(ern.a(cls8))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 16);
                } else if (a.equals(ern.a(cls7))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 17);
                } else if (a.equals(ern.a(cls6))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 18);
                } else if (a.equals(ern.a(cls5))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 19);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 20);
                } else if (a.equals(ern.a(cls4))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 21);
                } else if (a.equals(ern.a(cls3))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 22);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 23);
                } else if (a.equals(ern.a(cls2))) {
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 13);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        h2Var = null;
                        if (h2Var != null) {
                            wct.o(1, h2Var);
                        } else {
                            h2Var = null;
                        }
                        lm4 a5 = ern.a(String.class);
                        Class b2 = a5.b();
                        b2.getClass();
                        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a5, b2, ern.b(String.class)), fVar, str2, bVar, h2Var);
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 23);
                        } else if (a2.equals(ern.a(cls8))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 24);
                        } else if (a2.equals(ern.a(cls7))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 25);
                        } else if (a2.equals(ern.a(cls6))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 26);
                        } else if (a2.equals(ern.a(cls5))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 27);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 28);
                        } else if (a2.equals(ern.a(cls4))) {
                            h2Var3 = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 29);
                        } else if (a2.equals(ern.a(cls3))) {
                            h2Var3 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 0);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            h2Var3 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 2);
                        } else if (a2.equals(ern.a(cls2))) {
                            h2Var3 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 3);
                        } else {
                            if (!a2.equals(ern.a(String.class))) {
                                function12 = null;
                                if (function12 == null) {
                                    wct.o(1, function12);
                                } else {
                                    function12 = null;
                                }
                                lm4 a6 = ern.a(String.class);
                                Class b3 = a6.b();
                                b3.getClass();
                                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b3, ern.c(String.class)), fVar, str3, bVar, function12);
                            }
                            h2Var3 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 4);
                        }
                        function12 = h2Var3;
                        if (function12 == null) {
                        }
                        lm4 a62 = ern.a(String.class);
                        Class b32 = a62.b();
                        b32.getClass();
                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b32, ern.c(String.class)), fVar, str3, bVar, function12);
                    }
                    h2Var2 = new h2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 14);
                }
                h2Var = h2Var2;
                if (h2Var != null) {
                }
                lm4 a52 = ern.a(String.class);
                Class b22 = a52.b();
                b22.getClass();
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a52, b22, ern.b(String.class)), fVar, str2, bVar, h2Var);
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                function12 = h2Var3;
                if (function12 == null) {
                }
                lm4 a622 = ern.a(String.class);
                Class b322 = a622.b();
                b322.getClass();
                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a622, b322, ern.c(String.class)), fVar, str3, bVar, function12);
            }
            h1Var = new h1(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 22);
        }
        function1 = h1Var;
        if (function1 == null) {
        }
        lm4 a42 = ern.a(String.class);
        Class b4 = a42.b();
        b4.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b4, ern.c(String.class)), fVar, str, bVar, function1);
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        h2Var = h2Var2;
        if (h2Var != null) {
        }
        lm4 a522 = ern.a(String.class);
        Class b222 = a522.b();
        b222.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a522, b222, ern.b(String.class)), fVar, str2, bVar, h2Var);
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        function12 = h2Var3;
        if (function12 == null) {
        }
        lm4 a6222 = ern.a(String.class);
        Class b3222 = a6222.b();
        b3222.getClass();
        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6222, b3222, ern.c(String.class)), fVar, str3, bVar, function12);
    }
}
