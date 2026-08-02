package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class g implements com.yandex.plus.bdui.plus.content.g {
    public static final /* synthetic */ s9f[] c;
    public final String a;
    public final com.yandex.plus.core.templating.template.k b;

    static {
        yxm yxmVar = new yxm(g.class, Constants.KEY_VALUE, "getValue()Lorg/json/JSONArray;", 0);
        ern.a.getClass();
        c = new s9f[]{yxmVar};
    }

    public g(String str, com.yandex.plus.core.templating.template.k kVar) {
        this.a = str;
        this.b = kVar;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final String getName() {
        throw null;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final Object getValue() {
        return (JSONArray) this.b.d(c[0]);
    }
}
