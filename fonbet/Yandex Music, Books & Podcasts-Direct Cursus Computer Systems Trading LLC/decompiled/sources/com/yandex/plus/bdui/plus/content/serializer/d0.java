package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.ern;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class d0 implements com.yandex.plus.bdui.plus.content.a {
    public static final /* synthetic */ s9f[] e;
    public final com.yandex.plus.core.templating.template.j a;
    public final com.yandex.plus.bdui.plus.content.s b;
    public final com.yandex.plus.bdui.plus.content.s c;
    public final com.yandex.plus.bdui.action.a d;

    static {
        yxm yxmVar = new yxm(d0.class, "text", "getText()Ljava/lang/String;", 0);
        ern.a.getClass();
        e = new s9f[]{yxmVar};
    }

    public d0(com.yandex.plus.bdui.plus.action.serializer.r rVar, w wVar, com.yandex.plus.bdui.plus.content.s sVar, com.yandex.plus.bdui.plus.content.s sVar2) {
        com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) rVar.f;
        String str = wVar.a.a.a;
        com.yandex.plus.log.api.b bVar = rVar.b;
        lm4 a = ern.a(String.class);
        boolean equals = a.equals(ern.a(Boolean.TYPE));
        m mVar = null;
        com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
        m mVar2 = equals ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 20) : a.equals(ern.a(Byte.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 21) : a.equals(ern.a(Short.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 22) : a.equals(ern.a(Integer.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 23) : a.equals(ern.a(Long.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 24) : a.equals(ern.a(BigInteger.class)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 25) : a.equals(ern.a(Float.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 26) : a.equals(ern.a(Double.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 27) : a.equals(ern.a(BigDecimal.class)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 28) : a.equals(ern.a(Character.TYPE)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 18) : a.equals(ern.a(String.class)) ? new m(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 19) : null;
        if (mVar2 != null) {
            wct.o(1, mVar2);
            mVar = mVar2;
        }
        lm4 a2 = ern.a(String.class);
        Class b = a2.b();
        b.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a2, b, ern.b(String.class)), fVar, str, bVar, mVar);
        this.b = sVar;
        this.c = sVar2;
        this.d = wVar.a.b.c;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.d;
    }
}
