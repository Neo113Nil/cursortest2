package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.auth.LegacyAccountType;
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
public final class e {
    public static final /* synthetic */ s9f[] d = {new yxm(e.class, "avatarUrl", "getAvatarUrl()Ljava/lang/String;", 0), f1d.c(ern.a, e.class, LegacyAccountType.STRING_LOGIN, "getLogin()Ljava/lang/String;", 0)};
    public final com.yandex.plus.core.templating.template.j a;
    public final boolean b;
    public final com.yandex.plus.core.templating.template.j c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(r rVar, c cVar) {
        Function1 function1;
        Function1 cVar2;
        lm4 a;
        Function1 function12;
        Function1 dVar;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        String str = cVar.a;
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
            cVar2 = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 27);
        } else if (a2.equals(ern.a(cls8))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 1);
        } else if (a2.equals(ern.a(cls7))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 2);
        } else if (a2.equals(ern.a(cls6))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 3);
        } else if (a2.equals(ern.a(cls5))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 4);
        } else if (a2.equals(ern.a(BigInteger.class))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 5);
        } else if (a2.equals(ern.a(cls4))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 6);
        } else if (a2.equals(ern.a(cls3))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 7);
        } else if (a2.equals(ern.a(BigDecimal.class))) {
            cVar2 = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 8);
        } else if (a2.equals(ern.a(cls2))) {
            cVar2 = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 17);
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
                this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a3, b, ern.c(String.class)), bVar, str, bVar2, function1);
                this.b = cVar.b;
                com.yandex.plus.core.templating.parser.b bVar3 = rVar.e;
                String str2 = cVar.c;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 19);
                } else if (a.equals(ern.a(cls8))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 20);
                } else if (a.equals(ern.a(cls7))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 21);
                } else if (a.equals(ern.a(cls6))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 22);
                } else if (a.equals(ern.a(cls5))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 23);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 24);
                } else if (a.equals(ern.a(cls4))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 25);
                } else if (a.equals(ern.a(cls3))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 26);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 28);
                } else if (a.equals(ern.a(cls2))) {
                    dVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 29);
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
                        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b2, ern.c(String.class)), bVar3, str2, bVar2, function12);
                    }
                    dVar = new d(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 0);
                }
                function12 = dVar;
                if (function12 != null) {
                }
                lm4 a42 = ern.a(String.class);
                Class b22 = a42.b();
                b22.getClass();
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b22, ern.c(String.class)), bVar3, str2, bVar2, function12);
            }
            cVar2 = new com.yandex.passport.internal.ui.challenge.vpn.c(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 18);
        }
        function1 = cVar2;
        if (function1 == null) {
        }
        lm4 a32 = ern.a(String.class);
        Class b3 = a32.b();
        b3.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a32, b3, ern.c(String.class)), bVar, str, bVar2, function1);
        this.b = cVar.b;
        com.yandex.plus.core.templating.parser.b bVar32 = rVar.e;
        String str22 = cVar.c;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        function12 = dVar;
        if (function12 != null) {
        }
        lm4 a422 = ern.a(String.class);
        Class b222 = a422.b();
        b222.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a422, b222, ern.c(String.class)), bVar32, str22, bVar2, function12);
    }
}
