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
public final class j4 implements com.yandex.plus.bdui.plus.checkout.content.j {
    public static final /* synthetic */ s9f[] m = {new yxm(j4.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, j4.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0), new yxm(j4.class, "errorCode", "getErrorCode()Ljava/lang/String;", 0), new yxm(j4.class, "errorCodeContentDescription", "getErrorCodeContentDescription()Ljava/lang/String;", 0), new yxm(j4.class, "primaryButtonText", "getPrimaryButtonText()Ljava/lang/String;", 0), new yxm(j4.class, "secondaryButtonText", "getSecondaryButtonText()Ljava/lang/String;", 0)};
    public final com.yandex.plus.core.templating.template.j a;
    public final com.yandex.plus.core.templating.template.j b;
    public final com.yandex.plus.core.templating.template.j c;
    public final com.yandex.plus.core.templating.template.j d;
    public final g4 e;
    public final e f;
    public final com.yandex.plus.core.templating.template.j g;
    public final com.yandex.plus.bdui.action.a h;
    public final com.yandex.plus.core.templating.template.j i;
    public final com.yandex.plus.bdui.action.a j;
    public final com.yandex.plus.bdui.plus.action.f k;
    public final com.yandex.plus.bdui.action.a l;

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j4(r rVar, y3 y3Var, com.yandex.plus.core.templating.template.j jVar, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.core.templating.template.j jVar2, com.yandex.plus.bdui.action.a aVar2) {
        Function1 function1;
        Function1 h4Var;
        lm4 a;
        h4 h4Var2;
        h4 h4Var3;
        lm4 a2;
        h4 h4Var4;
        h4 h4Var5;
        lm4 a3;
        Function1 function12;
        Function1 i4Var;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        e4 e4Var = y3Var.a;
        String str = e4Var.a.a;
        com.yandex.plus.log.api.b bVar2 = rVar.b;
        lm4 a4 = ern.a(String.class);
        Class cls = Boolean.TYPE;
        boolean equals = a4.equals(ern.a(cls));
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        com.yandex.plus.core.templating.template.a aVar3 = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            h4Var = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 12);
        } else if (a4.equals(ern.a(cls8))) {
            h4Var = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 23);
        } else if (a4.equals(ern.a(cls7))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 4);
        } else if (a4.equals(ern.a(cls6))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 10);
        } else if (a4.equals(ern.a(cls5))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 11);
        } else if (a4.equals(ern.a(BigInteger.class))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 12);
        } else if (a4.equals(ern.a(cls4))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 13);
        } else if (a4.equals(ern.a(cls3))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 14);
        } else if (a4.equals(ern.a(BigDecimal.class))) {
            h4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 15);
        } else if (a4.equals(ern.a(cls2))) {
            h4Var = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 2);
        } else {
            if (!a4.equals(ern.a(String.class))) {
                function1 = null;
                if (function1 == null) {
                    wct.o(1, function1);
                } else {
                    function1 = null;
                }
                lm4 a5 = ern.a(String.class);
                Class b = a5.b();
                b.getClass();
                this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a5, b, ern.c(String.class)), bVar, str, bVar2, function1);
                v3 v3Var = e4Var.a;
                v3 v3Var2 = e4Var.a;
                String str2 = v3Var.b;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 4);
                } else if (a.equals(ern.a(cls8))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 5);
                } else if (a.equals(ern.a(cls7))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 6);
                } else if (a.equals(ern.a(cls6))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 7);
                } else if (a.equals(ern.a(cls5))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 8);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 9);
                } else if (a.equals(ern.a(cls4))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 10);
                } else if (a.equals(ern.a(cls3))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 11);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 13);
                } else if (a.equals(ern.a(cls2))) {
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 14);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        h4Var2 = null;
                        if (h4Var2 != null) {
                            wct.o(1, h4Var2);
                        } else {
                            h4Var2 = null;
                        }
                        lm4 a6 = ern.a(String.class);
                        Class b2 = a6.b();
                        b2.getClass();
                        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b2, ern.c(String.class)), bVar, str2, bVar2, h4Var2);
                        String str3 = v3Var2.c;
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 16);
                        } else if (a2.equals(ern.a(cls8))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 17);
                        } else if (a2.equals(ern.a(cls7))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 18);
                        } else if (a2.equals(ern.a(cls6))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 19);
                        } else if (a2.equals(ern.a(cls5))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 20);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 21);
                        } else if (a2.equals(ern.a(cls4))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 22);
                        } else if (a2.equals(ern.a(cls3))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 24);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 25);
                        } else if (a2.equals(ern.a(cls2))) {
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 26);
                        } else {
                            if (!a2.equals(ern.a(String.class))) {
                                h4Var4 = null;
                                if (h4Var4 == null) {
                                    wct.o(1, h4Var4);
                                } else {
                                    h4Var4 = null;
                                }
                                lm4 a7 = ern.a(String.class);
                                Class b3 = a7.b();
                                b3.getClass();
                                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a7, b3, ern.c(String.class)), bVar, str3, bVar2, h4Var4);
                                String str4 = v3Var2.d;
                                a3 = ern.a(String.class);
                                if (!a3.equals(ern.a(cls))) {
                                    i4Var = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 28);
                                } else if (a3.equals(ern.a(cls8))) {
                                    i4Var = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 29);
                                } else if (a3.equals(ern.a(cls7))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 0);
                                } else if (a3.equals(ern.a(cls6))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 1);
                                } else if (a3.equals(ern.a(cls5))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 2);
                                } else if (a3.equals(ern.a(BigInteger.class))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 3);
                                } else if (a3.equals(ern.a(cls4))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 5);
                                } else if (a3.equals(ern.a(cls3))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 6);
                                } else if (a3.equals(ern.a(BigDecimal.class))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 7);
                                } else if (a3.equals(ern.a(cls2))) {
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 8);
                                } else {
                                    if (!a3.equals(ern.a(String.class))) {
                                        function12 = null;
                                        if (function12 != null) {
                                            wct.o(1, function12);
                                        } else {
                                            function12 = null;
                                        }
                                        lm4 a8 = ern.a(String.class);
                                        Class b4 = a8.b();
                                        b4.getClass();
                                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8, b4, ern.c(String.class)), bVar, str4, bVar2, function12);
                                        b4 b4Var = v3Var2.e;
                                        this.e = b4Var != null ? new g4(rVar, b4Var) : null;
                                        c cVar = v3Var2.h;
                                        this.f = cVar != null ? new e(rVar, cVar) : null;
                                        this.g = jVar;
                                        this.h = aVar;
                                        this.i = jVar2;
                                        this.j = aVar2;
                                        this.k = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.d.a, null));
                                        this.l = e4Var.b.c;
                                    }
                                    i4Var = new i4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 9);
                                }
                                function12 = i4Var;
                                if (function12 != null) {
                                }
                                lm4 a82 = ern.a(String.class);
                                Class b42 = a82.b();
                                b42.getClass();
                                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a82, b42, ern.c(String.class)), bVar, str4, bVar2, function12);
                                b4 b4Var2 = v3Var2.e;
                                this.e = b4Var2 != null ? new g4(rVar, b4Var2) : null;
                                c cVar2 = v3Var2.h;
                                this.f = cVar2 != null ? new e(rVar, cVar2) : null;
                                this.g = jVar;
                                this.h = aVar;
                                this.i = jVar2;
                                this.j = aVar2;
                                this.k = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.d.a, null));
                                this.l = e4Var.b.c;
                            }
                            h4Var5 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 27);
                        }
                        h4Var4 = h4Var5;
                        if (h4Var4 == null) {
                        }
                        lm4 a72 = ern.a(String.class);
                        Class b32 = a72.b();
                        b32.getClass();
                        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a72, b32, ern.c(String.class)), bVar, str3, bVar2, h4Var4);
                        String str42 = v3Var2.d;
                        a3 = ern.a(String.class);
                        if (!a3.equals(ern.a(cls))) {
                        }
                        function12 = i4Var;
                        if (function12 != null) {
                        }
                        lm4 a822 = ern.a(String.class);
                        Class b422 = a822.b();
                        b422.getClass();
                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a822, b422, ern.c(String.class)), bVar, str42, bVar2, function12);
                        b4 b4Var22 = v3Var2.e;
                        this.e = b4Var22 != null ? new g4(rVar, b4Var22) : null;
                        c cVar22 = v3Var2.h;
                        this.f = cVar22 != null ? new e(rVar, cVar22) : null;
                        this.g = jVar;
                        this.h = aVar;
                        this.i = jVar2;
                        this.j = aVar2;
                        this.k = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.d.a, null));
                        this.l = e4Var.b.c;
                    }
                    h4Var3 = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 15);
                }
                h4Var2 = h4Var3;
                if (h4Var2 != null) {
                }
                lm4 a62 = ern.a(String.class);
                Class b22 = a62.b();
                b22.getClass();
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b22, ern.c(String.class)), bVar, str2, bVar2, h4Var2);
                String str32 = v3Var2.c;
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                h4Var4 = h4Var5;
                if (h4Var4 == null) {
                }
                lm4 a722 = ern.a(String.class);
                Class b322 = a722.b();
                b322.getClass();
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a722, b322, ern.c(String.class)), bVar, str32, bVar2, h4Var4);
                String str422 = v3Var2.d;
                a3 = ern.a(String.class);
                if (!a3.equals(ern.a(cls))) {
                }
                function12 = i4Var;
                if (function12 != null) {
                }
                lm4 a8222 = ern.a(String.class);
                Class b4222 = a8222.b();
                b4222.getClass();
                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8222, b4222, ern.c(String.class)), bVar, str422, bVar2, function12);
                b4 b4Var222 = v3Var2.e;
                this.e = b4Var222 != null ? new g4(rVar, b4Var222) : null;
                c cVar222 = v3Var2.h;
                this.f = cVar222 != null ? new e(rVar, cVar222) : null;
                this.g = jVar;
                this.h = aVar;
                this.i = jVar2;
                this.j = aVar2;
                this.k = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.d.a, null));
                this.l = e4Var.b.c;
            }
            h4Var = new h4(1, aVar3, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 3);
        }
        function1 = h4Var;
        if (function1 == null) {
        }
        lm4 a52 = ern.a(String.class);
        Class b5 = a52.b();
        b5.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a52, b5, ern.c(String.class)), bVar, str, bVar2, function1);
        v3 v3Var3 = e4Var.a;
        v3 v3Var22 = e4Var.a;
        String str22 = v3Var3.b;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        h4Var2 = h4Var3;
        if (h4Var2 != null) {
        }
        lm4 a622 = ern.a(String.class);
        Class b222 = a622.b();
        b222.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a622, b222, ern.c(String.class)), bVar, str22, bVar2, h4Var2);
        String str322 = v3Var22.c;
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        h4Var4 = h4Var5;
        if (h4Var4 == null) {
        }
        lm4 a7222 = ern.a(String.class);
        Class b3222 = a7222.b();
        b3222.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a7222, b3222, ern.c(String.class)), bVar, str322, bVar2, h4Var4);
        String str4222 = v3Var22.d;
        a3 = ern.a(String.class);
        if (!a3.equals(ern.a(cls))) {
        }
        function12 = i4Var;
        if (function12 != null) {
        }
        lm4 a82222 = ern.a(String.class);
        Class b42222 = a82222.b();
        b42222.getClass();
        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a82222, b42222, ern.c(String.class)), bVar, str4222, bVar2, function12);
        b4 b4Var2222 = v3Var22.e;
        this.e = b4Var2222 != null ? new g4(rVar, b4Var2222) : null;
        c cVar2222 = v3Var22.h;
        this.f = cVar2222 != null ? new e(rVar, cVar2222) : null;
        this.g = jVar;
        this.h = aVar;
        this.i = jVar2;
        this.j = aVar2;
        this.k = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.d.a, null));
        this.l = e4Var.b.c;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.l;
    }
}
