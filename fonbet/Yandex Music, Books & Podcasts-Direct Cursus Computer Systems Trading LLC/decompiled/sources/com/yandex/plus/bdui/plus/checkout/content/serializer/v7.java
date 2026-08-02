package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.plus.pay.internal.model.PlusPayRichText;
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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class v7 implements com.yandex.plus.bdui.plus.checkout.content.q {
    public static final /* synthetic */ s9f[] n = {new yxm(v7.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, v7.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0), new yxm(v7.class, "offerText", "getOfferText()Ljava/lang/String;", 0), new yxm(v7.class, "additionalOfferText", "getAdditionalOfferText()Ljava/lang/String;", 0), new yxm(v7.class, "acceptButtonText", "getAcceptButtonText()Ljava/lang/String;", 0), new yxm(v7.class, "rejectButtonText", "getRejectButtonText()Ljava/lang/String;", 0)};
    public final com.yandex.plus.core.templating.template.j a;
    public final com.yandex.plus.core.templating.template.j b;
    public final com.yandex.plus.core.templating.template.j c;
    public final com.yandex.plus.core.templating.template.j d;
    public final ArrayList e;
    public final String f;
    public final PlusPayRichText g;
    public final com.yandex.plus.core.templating.template.j h;
    public final com.yandex.plus.core.templating.template.j i;
    public final com.yandex.plus.bdui.action.a j;
    public final com.yandex.plus.bdui.action.a k;
    public final com.yandex.plus.bdui.action.a l;
    public final com.yandex.plus.bdui.action.a m;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x05f0 A[LOOP:0: B:27:0x05ea->B:29:0x05f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v7(r rVar, s7 s7Var, PlusPayRichText plusPayRichText) {
        Function1 function1;
        Function1 f7Var;
        lm4 a;
        f7 f7Var2;
        f7 f7Var3;
        lm4 a2;
        Function1 function12;
        Function1 t7Var;
        lm4 a3;
        t7 t7Var2;
        t7 t7Var3;
        Iterator it;
        lm4 a4;
        Function1 function13;
        Function1 u7Var;
        lm4 a5;
        u7 u7Var2;
        u7 u7Var3;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        p7 p7Var = s7Var.a;
        String str = p7Var.a.g;
        com.yandex.plus.log.api.b bVar2 = rVar.b;
        lm4 a6 = ern.a(String.class);
        Class cls = Boolean.TYPE;
        boolean equals = a6.equals(ern.a(cls));
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            f7Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 24);
        } else if (a6.equals(ern.a(cls8))) {
            f7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 5);
        } else if (a6.equals(ern.a(cls7))) {
            f7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 16);
        } else if (a6.equals(ern.a(cls6))) {
            f7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 27);
        } else if (a6.equals(ern.a(cls5))) {
            f7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 8);
        } else if (a6.equals(ern.a(BigInteger.class))) {
            f7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 16);
        } else if (a6.equals(ern.a(cls4))) {
            f7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 17);
        } else if (a6.equals(ern.a(cls3))) {
            f7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 18);
        } else if (a6.equals(ern.a(BigDecimal.class))) {
            f7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 19);
        } else if (a6.equals(ern.a(cls2))) {
            f7Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 14);
        } else {
            if (!a6.equals(ern.a(String.class))) {
                function1 = null;
                if (function1 == null) {
                    wct.o(1, function1);
                } else {
                    function1 = null;
                }
                lm4 a7 = ern.a(String.class);
                Class b = a7.b();
                b.getClass();
                this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a7, b, ern.c(String.class)), bVar, str, bVar2, function1);
                m7 m7Var = p7Var.a;
                m7 m7Var2 = p7Var.a;
                String str2 = m7Var.h;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 16);
                } else if (a.equals(ern.a(cls8))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 17);
                } else if (a.equals(ern.a(cls7))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 18);
                } else if (a.equals(ern.a(cls6))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 19);
                } else if (a.equals(ern.a(cls5))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 20);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 21);
                } else if (a.equals(ern.a(cls4))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 22);
                } else if (a.equals(ern.a(cls3))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 23);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 25);
                } else if (a.equals(ern.a(cls2))) {
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 26);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        f7Var2 = null;
                        if (f7Var2 != null) {
                            wct.o(1, f7Var2);
                        } else {
                            f7Var2 = null;
                        }
                        lm4 a8 = ern.a(String.class);
                        Class b2 = a8.b();
                        b2.getClass();
                        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a8, b2, ern.c(String.class)), bVar, str2, bVar2, f7Var2);
                        String str3 = m7Var2.b;
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            t7Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 28);
                        } else if (a2.equals(ern.a(cls8))) {
                            t7Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 29);
                        } else if (a2.equals(ern.a(cls7))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 0);
                        } else if (a2.equals(ern.a(cls6))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 1);
                        } else if (a2.equals(ern.a(cls5))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 2);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 3);
                        } else if (a2.equals(ern.a(cls4))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 4);
                        } else if (a2.equals(ern.a(cls3))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 6);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 7);
                        } else if (a2.equals(ern.a(cls2))) {
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 8);
                        } else {
                            if (!a2.equals(ern.a(String.class))) {
                                function12 = null;
                                if (function12 == null) {
                                    wct.o(1, function12);
                                } else {
                                    function12 = null;
                                }
                                lm4 a9 = ern.a(String.class);
                                Class b3 = a9.b();
                                b3.getClass();
                                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a9, b3, ern.c(String.class)), bVar, str3, bVar2, function12);
                                String str4 = m7Var2.c;
                                a3 = ern.a(String.class);
                                if (!a3.equals(ern.a(cls))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 10);
                                } else if (a3.equals(ern.a(cls8))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 11);
                                } else if (a3.equals(ern.a(cls7))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 12);
                                } else if (a3.equals(ern.a(cls6))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 13);
                                } else if (a3.equals(ern.a(cls5))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 14);
                                } else if (a3.equals(ern.a(BigInteger.class))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 15);
                                } else if (a3.equals(ern.a(cls4))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 17);
                                } else if (a3.equals(ern.a(cls3))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 18);
                                } else if (a3.equals(ern.a(BigDecimal.class))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 19);
                                } else if (a3.equals(ern.a(cls2))) {
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 20);
                                } else {
                                    if (!a3.equals(ern.a(String.class))) {
                                        t7Var2 = null;
                                        if (t7Var2 != null) {
                                            wct.o(1, t7Var2);
                                        } else {
                                            t7Var2 = null;
                                        }
                                        lm4 a10 = ern.a(String.class);
                                        Class b4 = a10.b();
                                        b4.getClass();
                                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a10, b4, ern.c(String.class)), bVar, str4, bVar2, t7Var2);
                                        List list = m7Var2.a;
                                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.c((CharSequence) it.next()));
                                        }
                                        this.e = arrayList;
                                        this.f = m7Var2.f;
                                        this.g = plusPayRichText;
                                        String str5 = m7Var2.d;
                                        a4 = ern.a(String.class);
                                        if (a4.equals(ern.a(cls))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 22);
                                        } else if (a4.equals(ern.a(cls8))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 23);
                                        } else if (a4.equals(ern.a(cls7))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 24);
                                        } else if (a4.equals(ern.a(cls6))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 25);
                                        } else if (a4.equals(ern.a(cls5))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 26);
                                        } else if (a4.equals(ern.a(BigInteger.class))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 28);
                                        } else if (a4.equals(ern.a(cls4))) {
                                            u7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 29);
                                        } else if (a4.equals(ern.a(cls3))) {
                                            u7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 0);
                                        } else if (a4.equals(ern.a(BigDecimal.class))) {
                                            u7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 1);
                                        } else if (a4.equals(ern.a(cls2))) {
                                            u7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 2);
                                        } else {
                                            if (!a4.equals(ern.a(String.class))) {
                                                function13 = null;
                                                if (function13 == null) {
                                                    wct.o(1, function13);
                                                } else {
                                                    function13 = null;
                                                }
                                                lm4 a11 = ern.a(String.class);
                                                Class b5 = a11.b();
                                                b5.getClass();
                                                this.h = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a11, b5, ern.c(String.class)), bVar, str5, bVar2, function13);
                                                String str6 = m7Var2.e;
                                                a5 = ern.a(String.class);
                                                if (!a5.equals(ern.a(cls))) {
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 4);
                                                } else if (a5.equals(ern.a(cls8))) {
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 5);
                                                } else if (a5.equals(ern.a(cls7))) {
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 6);
                                                } else if (a5.equals(ern.a(cls6))) {
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 7);
                                                } else if (a5.equals(ern.a(cls5))) {
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 9);
                                                } else if (a5.equals(ern.a(BigInteger.class))) {
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 10);
                                                } else {
                                                    if (!a5.equals(ern.a(cls4))) {
                                                        u7Var2 = a5.equals(ern.a(cls3)) ? new u7(12) : a5.equals(ern.a(BigDecimal.class)) ? new u7(13) : a5.equals(ern.a(cls2)) ? new u7(14) : a5.equals(ern.a(String.class)) ? new u7(15) : null;
                                                        if (u7Var2 != null) {
                                                            wct.o(1, u7Var2);
                                                        } else {
                                                            u7Var2 = null;
                                                        }
                                                        lm4 a12 = ern.a(String.class);
                                                        Class b6 = a12.b();
                                                        b6.getClass();
                                                        this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a12, b6, ern.c(String.class)), bVar, str6, bVar2, u7Var2);
                                                        j7 j7Var = p7Var.b;
                                                        this.j = j7Var.a;
                                                        this.k = j7Var.b;
                                                        j7 j7Var2 = s7Var.a.b;
                                                        this.l = j7Var2.c;
                                                        this.m = j7Var2.d;
                                                    }
                                                    u7Var3 = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 11);
                                                }
                                                u7Var2 = u7Var3;
                                                if (u7Var2 != null) {
                                                }
                                                lm4 a122 = ern.a(String.class);
                                                Class b62 = a122.b();
                                                b62.getClass();
                                                this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a122, b62, ern.c(String.class)), bVar, str6, bVar2, u7Var2);
                                                j7 j7Var3 = p7Var.b;
                                                this.j = j7Var3.a;
                                                this.k = j7Var3.b;
                                                j7 j7Var22 = s7Var.a.b;
                                                this.l = j7Var22.c;
                                                this.m = j7Var22.d;
                                            }
                                            u7Var = new u7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 3);
                                        }
                                        function13 = u7Var;
                                        if (function13 == null) {
                                        }
                                        lm4 a112 = ern.a(String.class);
                                        Class b52 = a112.b();
                                        b52.getClass();
                                        this.h = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a112, b52, ern.c(String.class)), bVar, str5, bVar2, function13);
                                        String str62 = m7Var2.e;
                                        a5 = ern.a(String.class);
                                        if (!a5.equals(ern.a(cls))) {
                                        }
                                        u7Var2 = u7Var3;
                                        if (u7Var2 != null) {
                                        }
                                        lm4 a1222 = ern.a(String.class);
                                        Class b622 = a1222.b();
                                        b622.getClass();
                                        this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1222, b622, ern.c(String.class)), bVar, str62, bVar2, u7Var2);
                                        j7 j7Var32 = p7Var.b;
                                        this.j = j7Var32.a;
                                        this.k = j7Var32.b;
                                        j7 j7Var222 = s7Var.a.b;
                                        this.l = j7Var222.c;
                                        this.m = j7Var222.d;
                                    }
                                    t7Var3 = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 21);
                                }
                                t7Var2 = t7Var3;
                                if (t7Var2 != null) {
                                }
                                lm4 a102 = ern.a(String.class);
                                Class b42 = a102.b();
                                b42.getClass();
                                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a102, b42, ern.c(String.class)), bVar, str4, bVar2, t7Var2);
                                List list2 = m7Var2.a;
                                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                                it = list2.iterator();
                                while (it.hasNext()) {
                                }
                                this.e = arrayList2;
                                this.f = m7Var2.f;
                                this.g = plusPayRichText;
                                String str52 = m7Var2.d;
                                a4 = ern.a(String.class);
                                if (a4.equals(ern.a(cls))) {
                                }
                                function13 = u7Var;
                                if (function13 == null) {
                                }
                                lm4 a1122 = ern.a(String.class);
                                Class b522 = a1122.b();
                                b522.getClass();
                                this.h = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1122, b522, ern.c(String.class)), bVar, str52, bVar2, function13);
                                String str622 = m7Var2.e;
                                a5 = ern.a(String.class);
                                if (!a5.equals(ern.a(cls))) {
                                }
                                u7Var2 = u7Var3;
                                if (u7Var2 != null) {
                                }
                                lm4 a12222 = ern.a(String.class);
                                Class b6222 = a12222.b();
                                b6222.getClass();
                                this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a12222, b6222, ern.c(String.class)), bVar, str622, bVar2, u7Var2);
                                j7 j7Var322 = p7Var.b;
                                this.j = j7Var322.a;
                                this.k = j7Var322.b;
                                j7 j7Var2222 = s7Var.a.b;
                                this.l = j7Var2222.c;
                                this.m = j7Var2222.d;
                            }
                            t7Var = new t7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 9);
                        }
                        function12 = t7Var;
                        if (function12 == null) {
                        }
                        lm4 a92 = ern.a(String.class);
                        Class b32 = a92.b();
                        b32.getClass();
                        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a92, b32, ern.c(String.class)), bVar, str3, bVar2, function12);
                        String str42 = m7Var2.c;
                        a3 = ern.a(String.class);
                        if (!a3.equals(ern.a(cls))) {
                        }
                        t7Var2 = t7Var3;
                        if (t7Var2 != null) {
                        }
                        lm4 a1022 = ern.a(String.class);
                        Class b422 = a1022.b();
                        b422.getClass();
                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1022, b422, ern.c(String.class)), bVar, str42, bVar2, t7Var2);
                        List list22 = m7Var2.a;
                        ArrayList arrayList22 = new ArrayList(v75.o(list22, 10));
                        it = list22.iterator();
                        while (it.hasNext()) {
                        }
                        this.e = arrayList22;
                        this.f = m7Var2.f;
                        this.g = plusPayRichText;
                        String str522 = m7Var2.d;
                        a4 = ern.a(String.class);
                        if (a4.equals(ern.a(cls))) {
                        }
                        function13 = u7Var;
                        if (function13 == null) {
                        }
                        lm4 a11222 = ern.a(String.class);
                        Class b5222 = a11222.b();
                        b5222.getClass();
                        this.h = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a11222, b5222, ern.c(String.class)), bVar, str522, bVar2, function13);
                        String str6222 = m7Var2.e;
                        a5 = ern.a(String.class);
                        if (!a5.equals(ern.a(cls))) {
                        }
                        u7Var2 = u7Var3;
                        if (u7Var2 != null) {
                        }
                        lm4 a122222 = ern.a(String.class);
                        Class b62222 = a122222.b();
                        b62222.getClass();
                        this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a122222, b62222, ern.c(String.class)), bVar, str6222, bVar2, u7Var2);
                        j7 j7Var3222 = p7Var.b;
                        this.j = j7Var3222.a;
                        this.k = j7Var3222.b;
                        j7 j7Var22222 = s7Var.a.b;
                        this.l = j7Var22222.c;
                        this.m = j7Var22222.d;
                    }
                    f7Var3 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 27);
                }
                f7Var2 = f7Var3;
                if (f7Var2 != null) {
                }
                lm4 a82 = ern.a(String.class);
                Class b22 = a82.b();
                b22.getClass();
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a82, b22, ern.c(String.class)), bVar, str2, bVar2, f7Var2);
                String str32 = m7Var2.b;
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                function12 = t7Var;
                if (function12 == null) {
                }
                lm4 a922 = ern.a(String.class);
                Class b322 = a922.b();
                b322.getClass();
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a922, b322, ern.c(String.class)), bVar, str32, bVar2, function12);
                String str422 = m7Var2.c;
                a3 = ern.a(String.class);
                if (!a3.equals(ern.a(cls))) {
                }
                t7Var2 = t7Var3;
                if (t7Var2 != null) {
                }
                lm4 a10222 = ern.a(String.class);
                Class b4222 = a10222.b();
                b4222.getClass();
                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a10222, b4222, ern.c(String.class)), bVar, str422, bVar2, t7Var2);
                List list222 = m7Var2.a;
                ArrayList arrayList222 = new ArrayList(v75.o(list222, 10));
                it = list222.iterator();
                while (it.hasNext()) {
                }
                this.e = arrayList222;
                this.f = m7Var2.f;
                this.g = plusPayRichText;
                String str5222 = m7Var2.d;
                a4 = ern.a(String.class);
                if (a4.equals(ern.a(cls))) {
                }
                function13 = u7Var;
                if (function13 == null) {
                }
                lm4 a112222 = ern.a(String.class);
                Class b52222 = a112222.b();
                b52222.getClass();
                this.h = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a112222, b52222, ern.c(String.class)), bVar, str5222, bVar2, function13);
                String str62222 = m7Var2.e;
                a5 = ern.a(String.class);
                if (!a5.equals(ern.a(cls))) {
                }
                u7Var2 = u7Var3;
                if (u7Var2 != null) {
                }
                lm4 a1222222 = ern.a(String.class);
                Class b622222 = a1222222.b();
                b622222.getClass();
                this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1222222, b622222, ern.c(String.class)), bVar, str62222, bVar2, u7Var2);
                j7 j7Var32222 = p7Var.b;
                this.j = j7Var32222.a;
                this.k = j7Var32222.b;
                j7 j7Var222222 = s7Var.a.b;
                this.l = j7Var222222.c;
                this.m = j7Var222222.d;
            }
            f7Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 15);
        }
        function1 = f7Var;
        if (function1 == null) {
        }
        lm4 a72 = ern.a(String.class);
        Class b7 = a72.b();
        b7.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a72, b7, ern.c(String.class)), bVar, str, bVar2, function1);
        m7 m7Var3 = p7Var.a;
        m7 m7Var22 = p7Var.a;
        String str22 = m7Var3.h;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        f7Var2 = f7Var3;
        if (f7Var2 != null) {
        }
        lm4 a822 = ern.a(String.class);
        Class b222 = a822.b();
        b222.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a822, b222, ern.c(String.class)), bVar, str22, bVar2, f7Var2);
        String str322 = m7Var22.b;
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        function12 = t7Var;
        if (function12 == null) {
        }
        lm4 a9222 = ern.a(String.class);
        Class b3222 = a9222.b();
        b3222.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a9222, b3222, ern.c(String.class)), bVar, str322, bVar2, function12);
        String str4222 = m7Var22.c;
        a3 = ern.a(String.class);
        if (!a3.equals(ern.a(cls))) {
        }
        t7Var2 = t7Var3;
        if (t7Var2 != null) {
        }
        lm4 a102222 = ern.a(String.class);
        Class b42222 = a102222.b();
        b42222.getClass();
        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a102222, b42222, ern.c(String.class)), bVar, str4222, bVar2, t7Var2);
        List list2222 = m7Var22.a;
        ArrayList arrayList2222 = new ArrayList(v75.o(list2222, 10));
        it = list2222.iterator();
        while (it.hasNext()) {
        }
        this.e = arrayList2222;
        this.f = m7Var22.f;
        this.g = plusPayRichText;
        String str52222 = m7Var22.d;
        a4 = ern.a(String.class);
        if (a4.equals(ern.a(cls))) {
        }
        function13 = u7Var;
        if (function13 == null) {
        }
        lm4 a1122222 = ern.a(String.class);
        Class b522222 = a1122222.b();
        b522222.getClass();
        this.h = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1122222, b522222, ern.c(String.class)), bVar, str52222, bVar2, function13);
        String str622222 = m7Var22.e;
        a5 = ern.a(String.class);
        if (!a5.equals(ern.a(cls))) {
        }
        u7Var2 = u7Var3;
        if (u7Var2 != null) {
        }
        lm4 a12222222 = ern.a(String.class);
        Class b6222222 = a12222222.b();
        b6222222.getClass();
        this.i = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a12222222, b6222222, ern.c(String.class)), bVar, str622222, bVar2, u7Var2);
        j7 j7Var322222 = p7Var.b;
        this.j = j7Var322222.a;
        this.k = j7Var322222.b;
        j7 j7Var2222222 = s7Var.a.b;
        this.l = j7Var2222222.c;
        this.m = j7Var2222222.d;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.m;
    }
}
