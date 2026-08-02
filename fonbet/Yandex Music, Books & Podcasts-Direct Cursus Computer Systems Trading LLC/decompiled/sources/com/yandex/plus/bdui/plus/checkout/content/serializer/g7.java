package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.connectsdk.service.DeviceService;
import defpackage.ern;
import defpackage.f1d;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class g7 implements com.yandex.plus.bdui.plus.checkout.content.p {
    public static final /* synthetic */ s9f[] i = {new yxm(g7.class, "title", "getTitle()Ljava/lang/String;", 0), f1d.c(ern.a, g7.class, DeviceService.KEY_DESC, "getDescription()Ljava/lang/String;", 0), new yxm(g7.class, "buttonText", "getButtonText()Ljava/lang/String;", 0)};
    public final List a;
    public final com.yandex.plus.core.templating.template.j b;
    public final com.yandex.plus.core.templating.template.j c;
    public final com.yandex.plus.core.templating.template.j d;
    public final e e;
    public final com.yandex.plus.bdui.action.a f;
    public final com.yandex.plus.bdui.plus.action.f g;
    public final com.yandex.plus.bdui.action.a h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g7(List list, r rVar, e7 e7Var) {
        Function1 function1;
        Function1 j5Var;
        lm4 a;
        f7 f7Var;
        f7 f7Var2;
        lm4 a2;
        j5 j5Var2;
        j5 j5Var3;
        this.a = list;
        com.yandex.plus.core.templating.parser.b bVar = rVar.e;
        b7 b7Var = e7Var.a;
        String str = b7Var.a.a;
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
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 21);
        } else if (a3.equals(ern.a(cls8))) {
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 25);
        } else if (a3.equals(ern.a(cls7))) {
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 26);
        } else if (a3.equals(ern.a(cls6))) {
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 27);
        } else if (a3.equals(ern.a(cls5))) {
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 28);
        } else if (a3.equals(ern.a(BigInteger.class))) {
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 29);
        } else if (a3.equals(ern.a(cls4))) {
            j5Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 0);
        } else if (a3.equals(ern.a(cls3))) {
            j5Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 1);
        } else if (a3.equals(ern.a(BigDecimal.class))) {
            j5Var = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 2);
        } else if (a3.equals(ern.a(cls2))) {
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 11);
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
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b, ern.c(String.class)), bVar, str, bVar2, function1);
                v6 v6Var = b7Var.a;
                s6 s6Var = b7Var.b;
                v6 v6Var2 = b7Var.a;
                String str2 = v6Var.b;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 5);
                } else if (a.equals(ern.a(cls8))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 6);
                } else if (a.equals(ern.a(cls7))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 7);
                } else if (a.equals(ern.a(cls6))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 8);
                } else if (a.equals(ern.a(cls5))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 9);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 10);
                } else if (a.equals(ern.a(cls4))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 11);
                } else if (a.equals(ern.a(cls3))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 12);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 13);
                } else if (a.equals(ern.a(cls2))) {
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 3);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        f7Var = null;
                        if (f7Var != null) {
                            wct.o(1, f7Var);
                        } else {
                            f7Var = null;
                        }
                        lm4 a5 = ern.a(String.class);
                        Class b2 = a5.b();
                        b2.getClass();
                        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a5, b2, ern.b(String.class)), bVar, str2, bVar2, f7Var);
                        String str3 = v6Var2.c;
                        a2 = ern.a(String.class);
                        if (a2.equals(ern.a(cls))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 13);
                        } else if (a2.equals(ern.a(cls8))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 14);
                        } else if (a2.equals(ern.a(cls7))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 15);
                        } else if (a2.equals(ern.a(cls6))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 16);
                        } else if (a2.equals(ern.a(cls5))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 17);
                        } else if (a2.equals(ern.a(BigInteger.class))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 18);
                        } else if (a2.equals(ern.a(cls4))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 19);
                        } else if (a2.equals(ern.a(cls3))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 20);
                        } else if (a2.equals(ern.a(BigDecimal.class))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 22);
                        } else if (a2.equals(ern.a(cls2))) {
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 23);
                        } else {
                            if (!a2.equals(ern.a(String.class))) {
                                j5Var2 = null;
                                if (j5Var2 == null) {
                                    wct.o(1, j5Var2);
                                } else {
                                    j5Var2 = null;
                                }
                                lm4 a6 = ern.a(String.class);
                                Class b3 = a6.b();
                                b3.getClass();
                                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b3, ern.c(String.class)), bVar, str3, bVar2, j5Var2);
                                c cVar = v6Var2.e;
                                this.e = cVar == null ? new e(rVar, cVar) : null;
                                this.f = s6Var.a;
                                this.g = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.i.a, null));
                                this.h = s6Var.b;
                            }
                            j5Var3 = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 24);
                        }
                        j5Var2 = j5Var3;
                        if (j5Var2 == null) {
                        }
                        lm4 a62 = ern.a(String.class);
                        Class b32 = a62.b();
                        b32.getClass();
                        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b32, ern.c(String.class)), bVar, str3, bVar2, j5Var2);
                        c cVar2 = v6Var2.e;
                        this.e = cVar2 == null ? new e(rVar, cVar2) : null;
                        this.f = s6Var.a;
                        this.g = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.i.a, null));
                        this.h = s6Var.b;
                    }
                    f7Var2 = new f7(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 4);
                }
                f7Var = f7Var2;
                if (f7Var != null) {
                }
                lm4 a52 = ern.a(String.class);
                Class b22 = a52.b();
                b22.getClass();
                this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a52, b22, ern.b(String.class)), bVar, str2, bVar2, f7Var);
                String str32 = v6Var2.c;
                a2 = ern.a(String.class);
                if (a2.equals(ern.a(cls))) {
                }
                j5Var2 = j5Var3;
                if (j5Var2 == null) {
                }
                lm4 a622 = ern.a(String.class);
                Class b322 = a622.b();
                b322.getClass();
                this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a622, b322, ern.c(String.class)), bVar, str32, bVar2, j5Var2);
                c cVar22 = v6Var2.e;
                this.e = cVar22 == null ? new e(rVar, cVar22) : null;
                this.f = s6Var.a;
                this.g = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.i.a, null));
                this.h = s6Var.b;
            }
            j5Var = new j5(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 12);
        }
        function1 = j5Var;
        if (function1 == null) {
        }
        lm4 a42 = ern.a(String.class);
        Class b4 = a42.b();
        b4.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b4, ern.c(String.class)), bVar, str, bVar2, function1);
        v6 v6Var3 = b7Var.a;
        s6 s6Var2 = b7Var.b;
        v6 v6Var22 = b7Var.a;
        String str22 = v6Var3.b;
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        f7Var = f7Var2;
        if (f7Var != null) {
        }
        lm4 a522 = ern.a(String.class);
        Class b222 = a522.b();
        b222.getClass();
        this.c = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a522, b222, ern.b(String.class)), bVar, str22, bVar2, f7Var);
        String str322 = v6Var22.c;
        a2 = ern.a(String.class);
        if (a2.equals(ern.a(cls))) {
        }
        j5Var2 = j5Var3;
        if (j5Var2 == null) {
        }
        lm4 a6222 = ern.a(String.class);
        Class b3222 = a6222.b();
        b3222.getClass();
        this.d = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6222, b3222, ern.c(String.class)), bVar, str322, bVar2, j5Var2);
        c cVar222 = v6Var22.e;
        this.e = cVar222 == null ? new e(rVar, cVar222) : null;
        this.f = s6Var2.a;
        this.g = new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.i.a, null));
        this.h = s6Var2.b;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.h;
    }
}
