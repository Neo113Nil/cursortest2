package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.plus.core.reflect.TraversableCollectionField;
import defpackage.ern;
import defpackage.f1d;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.v75;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class f2 implements com.yandex.plus.bdui.plus.checkout.content.e {
    public static final /* synthetic */ s9f[] s = {new yxm(f2.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, f2.class, "paymentText", "getPaymentText()Ljava/lang/String;", 0), new yxm(f2.class, "paymentDescription", "getPaymentDescription()Ljava/lang/String;", 0), new yxm(f2.class, "buttonText", "getButtonText()Ljava/lang/String;", 0)};
    public final com.yandex.plus.core.templating.template.j a;
    public final List b;
    public final List c;
    public final com.yandex.plus.bdui.plus.checkout.content.c d;
    public final com.yandex.plus.core.templating.template.j e;
    public final com.yandex.plus.core.templating.template.j f;
    public final com.yandex.plus.core.templating.template.j g;
    public final e h;
    public final String i;
    public final boolean j;
    public final com.yandex.passport.common.network.n k;
    public final com.yandex.plus.bdui.action.a l;
    public final com.yandex.plus.bdui.action.a m;
    public final com.yandex.plus.bdui.action.a n;
    public final com.yandex.plus.bdui.action.a o;
    public final com.yandex.plus.bdui.action.a p;

    @TraversableCollectionField
    private final List<d2> products;
    public final com.yandex.plus.bdui.action.a q;
    public final com.yandex.plus.bdui.action.a r;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f2(r rVar, p0 p0Var, ArrayList arrayList, List list, List list2, com.yandex.plus.bdui.plus.checkout.content.c cVar, e eVar) {
        Function1 function1;
        Function1 c2Var;
        lm4 a;
        c2 c2Var2;
        c2 c2Var3;
        lm4 a2;
        Function1 function12;
        Function1 e2Var;
        lm4 a3;
        e2 e2Var2;
        e2 e2Var3;
        m0 m0Var;
        com.yandex.passport.common.network.n nVar;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        c1 c1Var = p0Var.a;
        String str = c1Var.a.c;
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
        com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 22);
        } else if (a4.equals(ern.a(cls8))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 3);
        } else if (a4.equals(ern.a(cls7))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 14);
        } else if (a4.equals(ern.a(cls6))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 20);
        } else if (a4.equals(ern.a(cls5))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 21);
        } else if (a4.equals(ern.a(BigInteger.class))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 22);
        } else if (a4.equals(ern.a(cls4))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 23);
        } else if (a4.equals(ern.a(cls3))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 24);
        } else if (a4.equals(ern.a(BigDecimal.class))) {
            c2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 25);
        } else if (a4.equals(ern.a(cls2))) {
            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 12);
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
                this.products = arrayList;
                this.b = list;
                this.c = list2;
                this.d = cVar;
                t0 t0Var = c1Var.a;
                t0 t0Var2 = c1Var.a;
                String str2 = t0Var.d;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 14);
                } else if (a.equals(ern.a(cls8))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 15);
                } else if (a.equals(ern.a(cls7))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 16);
                } else if (a.equals(ern.a(cls6))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 17);
                } else if (a.equals(ern.a(cls5))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 18);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 19);
                } else if (a.equals(ern.a(cls4))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 20);
                } else if (a.equals(ern.a(cls3))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 21);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 23);
                } else if (a.equals(ern.a(cls2))) {
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 24);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        c2Var2 = null;
                        if (c2Var2 != null) {
                            wct.o(1, c2Var2);
                        } else {
                            c2Var2 = null;
                        }
                        lm4 a6 = ern.a(String.class);
                        Class b2 = a6.b();
                        b2.getClass();
                        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b2, ern.c(String.class)), bVar, str2, bVar2, c2Var2);
                        String str3 = t0Var2.g;
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            e2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 26);
                        } else if (a2.equals(ern.a(cls8))) {
                            e2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 27);
                        } else if (a2.equals(ern.a(cls7))) {
                            e2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 28);
                        } else if (a2.equals(ern.a(cls6))) {
                            e2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 29);
                        } else if (a2.equals(ern.a(cls5))) {
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 0);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 1);
                        } else if (a2.equals(ern.a(cls4))) {
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 2);
                        } else if (a2.equals(ern.a(cls3))) {
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 4);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 5);
                        } else if (a2.equals(ern.a(cls2))) {
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 6);
                        } else {
                            if (!a2.equals(ern.a(String.class))) {
                                function12 = null;
                                if (function12 == null) {
                                    wct.o(1, function12);
                                } else {
                                    function12 = null;
                                }
                                lm4 a7 = ern.a(String.class);
                                Class b3 = a7.b();
                                b3.getClass();
                                this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a7, b3, ern.c(String.class)), bVar, str3, bVar2, function12);
                                String str4 = t0Var2.h;
                                a3 = ern.a(String.class);
                                if (!a3.equals(ern.a(cls))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 8);
                                } else if (a3.equals(ern.a(cls8))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 9);
                                } else if (a3.equals(ern.a(cls7))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 10);
                                } else if (a3.equals(ern.a(cls6))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 11);
                                } else if (a3.equals(ern.a(cls5))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 12);
                                } else if (a3.equals(ern.a(BigInteger.class))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 13);
                                } else if (a3.equals(ern.a(cls4))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 15);
                                } else if (a3.equals(ern.a(cls3))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 16);
                                } else if (a3.equals(ern.a(BigDecimal.class))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 17);
                                } else if (a3.equals(ern.a(cls2))) {
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 18);
                                } else {
                                    if (!a3.equals(ern.a(String.class))) {
                                        e2Var2 = null;
                                        if (e2Var2 != null) {
                                            wct.o(1, e2Var2);
                                        } else {
                                            e2Var2 = null;
                                        }
                                        lm4 a8 = ern.a(String.class);
                                        Class b4 = a8.b();
                                        b4.getClass();
                                        this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8, b4, ern.c(String.class)), bVar, str4, bVar2, e2Var2);
                                        this.h = eVar;
                                        this.i = t0Var2.k;
                                        Boolean bool = t0Var2.m;
                                        this.j = bool != null ? bool.booleanValue() : false;
                                        m0Var = t0Var2.n;
                                        if (m0Var != null) {
                                            List<j0> list3 = m0Var.a;
                                            ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                                            for (j0 j0Var : list3) {
                                                z0 z0Var = j0Var.l;
                                                arrayList2.add(new z1(j0Var, z0Var != null ? new com.yandex.plus.bdui.plus.checkout.content.d(z0Var.a, z0Var.b) : null));
                                            }
                                            z0 z0Var2 = m0Var.e;
                                            nVar = new com.yandex.passport.common.network.n(28, arrayList2, z0Var2 != null ? new com.yandex.plus.bdui.plus.checkout.content.d(z0Var2.a, z0Var2.b) : null);
                                        } else {
                                            nVar = null;
                                        }
                                        this.k = nVar;
                                        g0 g0Var = c1Var.b;
                                        this.l = g0Var.a;
                                        this.m = g0Var.b;
                                        this.n = g0Var.c;
                                        this.o = g0Var.d;
                                        this.p = g0Var.e;
                                        this.q = g0Var.f;
                                        this.r = g0Var.g;
                                    }
                                    e2Var3 = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 19);
                                }
                                e2Var2 = e2Var3;
                                if (e2Var2 != null) {
                                }
                                lm4 a82 = ern.a(String.class);
                                Class b42 = a82.b();
                                b42.getClass();
                                this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a82, b42, ern.c(String.class)), bVar, str4, bVar2, e2Var2);
                                this.h = eVar;
                                this.i = t0Var2.k;
                                Boolean bool2 = t0Var2.m;
                                this.j = bool2 != null ? bool2.booleanValue() : false;
                                m0Var = t0Var2.n;
                                if (m0Var != null) {
                                }
                                this.k = nVar;
                                g0 g0Var2 = c1Var.b;
                                this.l = g0Var2.a;
                                this.m = g0Var2.b;
                                this.n = g0Var2.c;
                                this.o = g0Var2.d;
                                this.p = g0Var2.e;
                                this.q = g0Var2.f;
                                this.r = g0Var2.g;
                            }
                            e2Var = new e2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 7);
                        }
                        function12 = e2Var;
                        if (function12 == null) {
                        }
                        lm4 a72 = ern.a(String.class);
                        Class b32 = a72.b();
                        b32.getClass();
                        this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a72, b32, ern.c(String.class)), bVar, str3, bVar2, function12);
                        String str42 = t0Var2.h;
                        a3 = ern.a(String.class);
                        if (!a3.equals(ern.a(cls))) {
                        }
                        e2Var2 = e2Var3;
                        if (e2Var2 != null) {
                        }
                        lm4 a822 = ern.a(String.class);
                        Class b422 = a822.b();
                        b422.getClass();
                        this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a822, b422, ern.c(String.class)), bVar, str42, bVar2, e2Var2);
                        this.h = eVar;
                        this.i = t0Var2.k;
                        Boolean bool22 = t0Var2.m;
                        this.j = bool22 != null ? bool22.booleanValue() : false;
                        m0Var = t0Var2.n;
                        if (m0Var != null) {
                        }
                        this.k = nVar;
                        g0 g0Var22 = c1Var.b;
                        this.l = g0Var22.a;
                        this.m = g0Var22.b;
                        this.n = g0Var22.c;
                        this.o = g0Var22.d;
                        this.p = g0Var22.e;
                        this.q = g0Var22.f;
                        this.r = g0Var22.g;
                    }
                    c2Var3 = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 25);
                }
                c2Var2 = c2Var3;
                if (c2Var2 != null) {
                }
                lm4 a62 = ern.a(String.class);
                Class b22 = a62.b();
                b22.getClass();
                this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b22, ern.c(String.class)), bVar, str2, bVar2, c2Var2);
                String str32 = t0Var2.g;
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                function12 = e2Var;
                if (function12 == null) {
                }
                lm4 a722 = ern.a(String.class);
                Class b322 = a722.b();
                b322.getClass();
                this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a722, b322, ern.c(String.class)), bVar, str32, bVar2, function12);
                String str422 = t0Var2.h;
                a3 = ern.a(String.class);
                if (!a3.equals(ern.a(cls))) {
                }
                e2Var2 = e2Var3;
                if (e2Var2 != null) {
                }
                lm4 a8222 = ern.a(String.class);
                Class b4222 = a8222.b();
                b4222.getClass();
                this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8222, b4222, ern.c(String.class)), bVar, str422, bVar2, e2Var2);
                this.h = eVar;
                this.i = t0Var2.k;
                Boolean bool222 = t0Var2.m;
                this.j = bool222 != null ? bool222.booleanValue() : false;
                m0Var = t0Var2.n;
                if (m0Var != null) {
                }
                this.k = nVar;
                g0 g0Var222 = c1Var.b;
                this.l = g0Var222.a;
                this.m = g0Var222.b;
                this.n = g0Var222.c;
                this.o = g0Var222.d;
                this.p = g0Var222.e;
                this.q = g0Var222.f;
                this.r = g0Var222.g;
            }
            c2Var = new c2(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 13);
        }
        function1 = c2Var;
        if (function1 == null) {
        }
        lm4 a52 = ern.a(String.class);
        Class b5 = a52.b();
        b5.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a52, b5, ern.c(String.class)), bVar, str, bVar2, function1);
        this.products = arrayList;
        this.b = list;
        this.c = list2;
        this.d = cVar;
        t0 t0Var3 = c1Var.a;
        t0 t0Var22 = c1Var.a;
        String str22 = t0Var3.d;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        c2Var2 = c2Var3;
        if (c2Var2 != null) {
        }
        lm4 a622 = ern.a(String.class);
        Class b222 = a622.b();
        b222.getClass();
        this.e = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a622, b222, ern.c(String.class)), bVar, str22, bVar2, c2Var2);
        String str322 = t0Var22.g;
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        function12 = e2Var;
        if (function12 == null) {
        }
        lm4 a7222 = ern.a(String.class);
        Class b3222 = a7222.b();
        b3222.getClass();
        this.f = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a7222, b3222, ern.c(String.class)), bVar, str322, bVar2, function12);
        String str4222 = t0Var22.h;
        a3 = ern.a(String.class);
        if (!a3.equals(ern.a(cls))) {
        }
        e2Var2 = e2Var3;
        if (e2Var2 != null) {
        }
        lm4 a82222 = ern.a(String.class);
        Class b42222 = a82222.b();
        b42222.getClass();
        this.g = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a82222, b42222, ern.c(String.class)), bVar, str4222, bVar2, e2Var2);
        this.h = eVar;
        this.i = t0Var22.k;
        Boolean bool2222 = t0Var22.m;
        this.j = bool2222 != null ? bool2222.booleanValue() : false;
        m0Var = t0Var22.n;
        if (m0Var != null) {
        }
        this.k = nVar;
        g0 g0Var2222 = c1Var.b;
        this.l = g0Var2222.a;
        this.m = g0Var2222.b;
        this.n = g0Var2222.c;
        this.o = g0Var2222.d;
        this.p = g0Var2222.e;
        this.q = g0Var2222.f;
        this.r = g0Var2222.g;
    }

    public final List a() {
        return this.products;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.r;
    }
}
