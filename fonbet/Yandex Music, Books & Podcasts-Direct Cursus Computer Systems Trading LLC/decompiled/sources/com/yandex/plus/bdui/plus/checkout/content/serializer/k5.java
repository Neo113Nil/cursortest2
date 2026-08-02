package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
public final class k5 extends com.yandex.plus.bdui.plus.checkout.content.l {
    public static final /* synthetic */ s9f[] h = {new yxm(k5.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, k5.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0), new yxm(k5.class, "firstPaymentText", "getFirstPaymentText()Ljava/lang/String;", 0), new yxm(k5.class, "nextPaymentText", "getNextPaymentText()Ljava/lang/String;", 0), new yxm(k5.class, "footerText", "getFooterText()Ljava/lang/String;", 0)};
    public final com.yandex.plus.core.templating.template.j b;
    public final com.yandex.plus.core.templating.template.j c;
    public final com.yandex.plus.core.templating.template.j d;
    public final com.yandex.plus.core.templating.template.j e;
    public final com.yandex.plus.core.templating.template.j f;
    public final com.yandex.plus.bdui.action.a g;

    /* JADX WARN: Removed duplicated region for block: B:100:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k5(r rVar, h5 h5Var) {
        i4 i4Var;
        i4 i4Var2;
        lm4 a;
        Function1 function1;
        Function1 i4Var3;
        lm4 a2;
        Function1 function12;
        Function1 i5Var;
        lm4 a3;
        i5 i5Var2;
        i5 i5Var3;
        lm4 a4;
        Function1 function13;
        Function1 j5Var;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        e5 e5Var = h5Var.a;
        String str = e5Var.a.a;
        com.yandex.plus.log.api.b bVar2 = rVar.b;
        lm4 a5 = ern.a(String.class);
        Class cls = Boolean.TYPE;
        boolean equals = a5.equals(ern.a(cls));
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 18);
        } else if (a5.equals(ern.a(cls8))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 19);
        } else if (a5.equals(ern.a(cls7))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 20);
        } else if (a5.equals(ern.a(cls6))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 21);
        } else if (a5.equals(ern.a(cls5))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 22);
        } else if (a5.equals(ern.a(BigInteger.class))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 23);
        } else if (a5.equals(ern.a(cls4))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 24);
        } else if (a5.equals(ern.a(cls3))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 25);
        } else if (a5.equals(ern.a(BigDecimal.class))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 26);
        } else if (a5.equals(ern.a(cls2))) {
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 16);
        } else {
            if (!a5.equals(ern.a(String.class))) {
                i4Var = null;
                if (i4Var == null) {
                    wct.o(1, i4Var);
                } else {
                    i4Var = null;
                }
                lm4 a6 = ern.a(String.class);
                Class b = a6.b();
                b.getClass();
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b, ern.c(String.class)), bVar, str, bVar2, i4Var);
                b5 b5Var = e5Var.a;
                b5 b5Var2 = e5Var.a;
                String str2 = b5Var.b;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    i4Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 7);
                } else if (a.equals(ern.a(cls8))) {
                    i4Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 18);
                } else if (a.equals(ern.a(cls7))) {
                    i4Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 29);
                } else if (a.equals(ern.a(cls6))) {
                    i4Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 5);
                } else if (a.equals(ern.a(cls5))) {
                    i4Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 6);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    i4Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 7);
                } else if (a.equals(ern.a(cls4))) {
                    i4Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 8);
                } else if (a.equals(ern.a(cls3))) {
                    i4Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 9);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    i4Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 10);
                } else if (a.equals(ern.a(cls2))) {
                    i4Var3 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 27);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        function1 = null;
                        if (function1 != null) {
                            wct.o(1, function1);
                        } else {
                            function1 = null;
                        }
                        lm4 a7 = ern.a(String.class);
                        Class b2 = a7.b();
                        b2.getClass();
                        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a7, b2, ern.b(String.class)), bVar, str2, bVar2, function1);
                        String str3 = b5Var2.c;
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            i5Var = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 29);
                        } else if (a2.equals(ern.a(cls8))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 0);
                        } else if (a2.equals(ern.a(cls7))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 1);
                        } else if (a2.equals(ern.a(cls6))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 2);
                        } else if (a2.equals(ern.a(cls5))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 3);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 4);
                        } else if (a2.equals(ern.a(cls4))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 5);
                        } else if (a2.equals(ern.a(cls3))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 6);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 8);
                        } else if (a2.equals(ern.a(cls2))) {
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 9);
                        } else {
                            if (!a2.equals(ern.a(String.class))) {
                                function12 = null;
                                if (function12 == null) {
                                    wct.o(1, function12);
                                } else {
                                    function12 = null;
                                }
                                lm4 a8 = ern.a(String.class);
                                Class b3 = a8.b();
                                b3.getClass();
                                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8, b3, ern.b(String.class)), bVar, str3, bVar2, function12);
                                String str4 = b5Var2.d;
                                a3 = ern.a(String.class);
                                if (!a3.equals(ern.a(cls))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 11);
                                } else if (a3.equals(ern.a(cls8))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 12);
                                } else if (a3.equals(ern.a(cls7))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 13);
                                } else if (a3.equals(ern.a(cls6))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 14);
                                } else if (a3.equals(ern.a(cls5))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 15);
                                } else if (a3.equals(ern.a(BigInteger.class))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 16);
                                } else if (a3.equals(ern.a(cls4))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 17);
                                } else if (a3.equals(ern.a(cls3))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 19);
                                } else if (a3.equals(ern.a(BigDecimal.class))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 20);
                                } else if (a3.equals(ern.a(cls2))) {
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 21);
                                } else {
                                    if (!a3.equals(ern.a(String.class))) {
                                        i5Var2 = null;
                                        if (i5Var2 != null) {
                                            wct.o(1, i5Var2);
                                        } else {
                                            i5Var2 = null;
                                        }
                                        lm4 a9 = ern.a(String.class);
                                        Class b4 = a9.b();
                                        b4.getClass();
                                        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a9, b4, ern.b(String.class)), bVar, str4, bVar2, i5Var2);
                                        String str5 = b5Var2.e;
                                        a4 = ern.a(String.class);
                                        if (a4.equals(ern.a(cls))) {
                                            j5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 23);
                                        } else if (a4.equals(ern.a(cls8))) {
                                            j5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 24);
                                        } else if (a4.equals(ern.a(cls7))) {
                                            j5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 25);
                                        } else if (a4.equals(ern.a(cls6))) {
                                            j5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 26);
                                        } else if (a4.equals(ern.a(cls5))) {
                                            j5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 27);
                                        } else if (a4.equals(ern.a(BigInteger.class))) {
                                            j5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 28);
                                        } else if (a4.equals(ern.a(cls4))) {
                                            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 0);
                                        } else if (a4.equals(ern.a(cls3))) {
                                            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 1);
                                        } else if (a4.equals(ern.a(BigDecimal.class))) {
                                            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 2);
                                        } else if (a4.equals(ern.a(cls2))) {
                                            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 3);
                                        } else {
                                            if (!a4.equals(ern.a(String.class))) {
                                                function13 = null;
                                                if (function13 == null) {
                                                    wct.o(1, function13);
                                                } else {
                                                    function13 = null;
                                                }
                                                lm4 a10 = ern.a(String.class);
                                                Class b5 = a10.b();
                                                b5.getClass();
                                                this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a10, b5, ern.b(String.class)), bVar, str5, bVar2, function13);
                                                this.g = e5Var.b.a;
                                            }
                                            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 4);
                                        }
                                        function13 = j5Var;
                                        if (function13 == null) {
                                        }
                                        lm4 a102 = ern.a(String.class);
                                        Class b52 = a102.b();
                                        b52.getClass();
                                        this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a102, b52, ern.b(String.class)), bVar, str5, bVar2, function13);
                                        this.g = e5Var.b.a;
                                    }
                                    i5Var3 = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 22);
                                }
                                i5Var2 = i5Var3;
                                if (i5Var2 != null) {
                                }
                                lm4 a92 = ern.a(String.class);
                                Class b42 = a92.b();
                                b42.getClass();
                                this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a92, b42, ern.b(String.class)), bVar, str4, bVar2, i5Var2);
                                String str52 = b5Var2.e;
                                a4 = ern.a(String.class);
                                if (a4.equals(ern.a(cls))) {
                                }
                                function13 = j5Var;
                                if (function13 == null) {
                                }
                                lm4 a1022 = ern.a(String.class);
                                Class b522 = a1022.b();
                                b522.getClass();
                                this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1022, b522, ern.b(String.class)), bVar, str52, bVar2, function13);
                                this.g = e5Var.b.a;
                            }
                            i5Var = new i5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 10);
                        }
                        function12 = i5Var;
                        if (function12 == null) {
                        }
                        lm4 a82 = ern.a(String.class);
                        Class b32 = a82.b();
                        b32.getClass();
                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a82, b32, ern.b(String.class)), bVar, str3, bVar2, function12);
                        String str42 = b5Var2.d;
                        a3 = ern.a(String.class);
                        if (!a3.equals(ern.a(cls))) {
                        }
                        i5Var2 = i5Var3;
                        if (i5Var2 != null) {
                        }
                        lm4 a922 = ern.a(String.class);
                        Class b422 = a922.b();
                        b422.getClass();
                        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a922, b422, ern.b(String.class)), bVar, str42, bVar2, i5Var2);
                        String str522 = b5Var2.e;
                        a4 = ern.a(String.class);
                        if (a4.equals(ern.a(cls))) {
                        }
                        function13 = j5Var;
                        if (function13 == null) {
                        }
                        lm4 a10222 = ern.a(String.class);
                        Class b5222 = a10222.b();
                        b5222.getClass();
                        this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a10222, b5222, ern.b(String.class)), bVar, str522, bVar2, function13);
                        this.g = e5Var.b.a;
                    }
                    i4Var3 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 28);
                }
                function1 = i4Var3;
                if (function1 != null) {
                }
                lm4 a72 = ern.a(String.class);
                Class b22 = a72.b();
                b22.getClass();
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a72, b22, ern.b(String.class)), bVar, str2, bVar2, function1);
                String str32 = b5Var2.c;
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                function12 = i5Var;
                if (function12 == null) {
                }
                lm4 a822 = ern.a(String.class);
                Class b322 = a822.b();
                b322.getClass();
                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a822, b322, ern.b(String.class)), bVar, str32, bVar2, function12);
                String str422 = b5Var2.d;
                a3 = ern.a(String.class);
                if (!a3.equals(ern.a(cls))) {
                }
                i5Var2 = i5Var3;
                if (i5Var2 != null) {
                }
                lm4 a9222 = ern.a(String.class);
                Class b4222 = a9222.b();
                b4222.getClass();
                this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a9222, b4222, ern.b(String.class)), bVar, str422, bVar2, i5Var2);
                String str5222 = b5Var2.e;
                a4 = ern.a(String.class);
                if (a4.equals(ern.a(cls))) {
                }
                function13 = j5Var;
                if (function13 == null) {
                }
                lm4 a102222 = ern.a(String.class);
                Class b52222 = a102222.b();
                b52222.getClass();
                this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a102222, b52222, ern.b(String.class)), bVar, str5222, bVar2, function13);
                this.g = e5Var.b.a;
            }
            i4Var2 = new i4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 17);
        }
        i4Var = i4Var2;
        if (i4Var == null) {
        }
        lm4 a62 = ern.a(String.class);
        Class b6 = a62.b();
        b6.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b6, ern.c(String.class)), bVar, str, bVar2, i4Var);
        b5 b5Var3 = e5Var.a;
        b5 b5Var22 = e5Var.a;
        String str22 = b5Var3.b;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        function1 = i4Var3;
        if (function1 != null) {
        }
        lm4 a722 = ern.a(String.class);
        Class b222 = a722.b();
        b222.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a722, b222, ern.b(String.class)), bVar, str22, bVar2, function1);
        String str322 = b5Var22.c;
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        function12 = i5Var;
        if (function12 == null) {
        }
        lm4 a8222 = ern.a(String.class);
        Class b3222 = a8222.b();
        b3222.getClass();
        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8222, b3222, ern.b(String.class)), bVar, str322, bVar2, function12);
        String str4222 = b5Var22.d;
        a3 = ern.a(String.class);
        if (!a3.equals(ern.a(cls))) {
        }
        i5Var2 = i5Var3;
        if (i5Var2 != null) {
        }
        lm4 a92222 = ern.a(String.class);
        Class b42222 = a92222.b();
        b42222.getClass();
        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a92222, b42222, ern.b(String.class)), bVar, str4222, bVar2, i5Var2);
        String str52222 = b5Var22.e;
        a4 = ern.a(String.class);
        if (a4.equals(ern.a(cls))) {
        }
        function13 = j5Var;
        if (function13 == null) {
        }
        lm4 a1022222 = ern.a(String.class);
        Class b522222 = a1022222.b();
        b522222.getClass();
        this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1022222, b522222, ern.b(String.class)), bVar, str52222, bVar2, function13);
        this.g = e5Var.b.a;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.g;
    }
}
