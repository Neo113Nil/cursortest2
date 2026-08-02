package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes4.dex */
public final class l implements com.yandex.plus.bdui.plus.content.e {
    public static final /* synthetic */ s9f[] c;
    public final String a;
    public final com.yandex.plus.core.templating.template.j b;

    static {
        yxm yxmVar = new yxm(l.class, Constants.KEY_VALUE, "getValue()Ljava/lang/Double;", 0);
        ern.a.getClass();
        c = new s9f[]{yxmVar};
    }

    public l(String str, com.yandex.plus.core.templating.template.j jVar) {
        this.a = str;
        this.b = jVar;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final Object getValue() {
        return (Double) this.b.d(c[0]);
    }
}
