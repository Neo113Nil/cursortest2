package com.yandex.plus.bdui.plus.content;

import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
import defpackage.btf;
import defpackage.ern;
import defpackage.jyr;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class s extends b {
    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a c;
    public static final /* synthetic */ s9f[] d;
    public static final jyr e;
    public final com.yandex.plus.core.templating.template.j b;

    static {
        yxm yxmVar = new yxm(s.class, "text", "getText()Ljava/lang/String;", 0);
        ern.a.getClass();
        d = new s9f[]{yxmVar};
        c = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
        e = btf.b(new y5(27));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.yandex.plus.core.templating.parser.b bVar, String str, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.log.api.b bVar2) {
        super(aVar, (y) e.getValue());
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        c.getClass();
        lm4 a = ern.a(String.class);
        boolean equals = a.equals(ern.a(Boolean.TYPE));
        m mVar = null;
        com.yandex.plus.core.templating.template.a aVar2 = com.yandex.plus.core.templating.template.a.a;
        m mVar2 = equals ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 14) : a.equals(ern.a(Byte.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 15) : a.equals(ern.a(Short.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 16) : a.equals(ern.a(Integer.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 17) : a.equals(ern.a(Long.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 18) : a.equals(ern.a(BigInteger.class)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 19) : a.equals(ern.a(Float.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 20) : a.equals(ern.a(Double.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 21) : a.equals(ern.a(BigDecimal.class)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 22) : a.equals(ern.a(Character.TYPE)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 12) : a.equals(ern.a(String.class)) ? new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 13) : null;
        if (mVar2 != null) {
            wct.o(1, mVar2);
            mVar = mVar2;
        }
        lm4 a2 = ern.a(String.class);
        Class b = a2.b();
        b.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a2, b, ern.b(String.class)), bVar, str, bVar2, mVar);
    }

    @Override // com.yandex.plus.bdui.plus.content.b
    public final String a() {
        return (String) this.b.d(d[0]);
    }
}
