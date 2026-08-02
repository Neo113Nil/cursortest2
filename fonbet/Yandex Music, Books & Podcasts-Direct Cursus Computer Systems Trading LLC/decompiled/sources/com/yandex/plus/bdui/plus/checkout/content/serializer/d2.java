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
public final class d2 {
    public static final /* synthetic */ s9f[] f = {new yxm(d2.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, d2.class, "subTitle", "getSubTitle()Ljava/lang/String;", 0), new yxm(d2.class, "text", "getText()Ljava/lang/String;", 0)};
    public final String a;
    public final com.yandex.plus.core.data.common.y b;
    public final com.yandex.plus.core.templating.template.j c;
    public final com.yandex.plus.core.templating.template.j d;
    public final com.yandex.plus.core.templating.template.j e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d2(x1 x1Var, com.yandex.plus.core.data.common.y yVar, r rVar) {
        Function1 function1;
        Function1 dVar;
        lm4 a;
        d dVar2;
        d dVar3;
        lm4 a2;
        Function1 function12;
        Function1 c2Var;
        this.a = x1Var.a;
        this.b = yVar;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        String str = x1Var.b;
        com.yandex.plus.log.api.b bVar2 = rVar.b;
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
            dVar = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 19);
        } else if (a3.equals(ern.a(cls8))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 0);
        } else if (a3.equals(ern.a(cls7))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 5);
        } else if (a3.equals(ern.a(cls6))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 6);
        } else if (a3.equals(ern.a(cls5))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 7);
        } else if (a3.equals(ern.a(BigInteger.class))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 8);
        } else if (a3.equals(ern.a(cls4))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 9);
        } else if (a3.equals(ern.a(cls3))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 10);
        } else if (a3.equals(ern.a(BigDecimal.class))) {
            dVar = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 11);
        } else if (a3.equals(ern.a(cls2))) {
            dVar = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 9);
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
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b, ern.b(String.class)), bVar, str, bVar2, function1);
                String str2 = x1Var.c;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 11);
                } else if (a.equals(ern.a(cls8))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 12);
                } else if (a.equals(ern.a(cls7))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 13);
                } else if (a.equals(ern.a(cls6))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 14);
                } else if (a.equals(ern.a(cls5))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 15);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 16);
                } else if (a.equals(ern.a(cls4))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 17);
                } else if (a.equals(ern.a(cls3))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 18);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 20);
                } else if (a.equals(ern.a(cls2))) {
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 21);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        dVar2 = null;
                        if (dVar2 != null) {
                            wct.o(1, dVar2);
                        } else {
                            dVar2 = null;
                        }
                        lm4 a5 = ern.a(String.class);
                        Class b2 = a5.b();
                        b2.getClass();
                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a5, b2, ern.b(String.class)), bVar, str2, bVar2, dVar2);
                        String str3 = x1Var.d;
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 23);
                        } else if (a2.equals(ern.a(cls8))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 24);
                        } else if (a2.equals(ern.a(cls7))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 25);
                        } else if (a2.equals(ern.a(cls6))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 26);
                        } else if (a2.equals(ern.a(cls5))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 27);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 28);
                        } else if (a2.equals(ern.a(cls4))) {
                            c2Var = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 29);
                        } else if (a2.equals(ern.a(cls3))) {
                            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 1);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 2);
                        } else if (a2.equals(ern.a(cls2))) {
                            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 3);
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
                                this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b3, ern.b(String.class)), bVar, str3, bVar2, function12);
                            }
                            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 4);
                        }
                        function12 = c2Var;
                        if (function12 == null) {
                        }
                        lm4 a62 = ern.a(String.class);
                        Class b32 = a62.b();
                        b32.getClass();
                        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b32, ern.b(String.class)), bVar, str3, bVar2, function12);
                    }
                    dVar3 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 22);
                }
                dVar2 = dVar3;
                if (dVar2 != null) {
                }
                lm4 a52 = ern.a(String.class);
                Class b22 = a52.b();
                b22.getClass();
                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a52, b22, ern.b(String.class)), bVar, str2, bVar2, dVar2);
                String str32 = x1Var.d;
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                function12 = c2Var;
                if (function12 == null) {
                }
                lm4 a622 = ern.a(String.class);
                Class b322 = a622.b();
                b322.getClass();
                this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a622, b322, ern.b(String.class)), bVar, str32, bVar2, function12);
            }
            dVar = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 10);
        }
        function1 = dVar;
        if (function1 == null) {
        }
        lm4 a42 = ern.a(String.class);
        Class b4 = a42.b();
        b4.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b4, ern.b(String.class)), bVar, str, bVar2, function1);
        String str22 = x1Var.c;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        dVar2 = dVar3;
        if (dVar2 != null) {
        }
        lm4 a522 = ern.a(String.class);
        Class b222 = a522.b();
        b222.getClass();
        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a522, b222, ern.b(String.class)), bVar, str22, bVar2, dVar2);
        String str322 = x1Var.d;
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        function12 = c2Var;
        if (function12 == null) {
        }
        lm4 a6222 = ern.a(String.class);
        Class b3222 = a6222.b();
        b3222.getClass();
        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6222, b3222, ern.b(String.class)), bVar, str322, bVar2, function12);
    }
}
