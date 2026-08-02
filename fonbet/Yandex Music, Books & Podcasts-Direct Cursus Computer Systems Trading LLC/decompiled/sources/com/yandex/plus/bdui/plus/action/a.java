package com.yandex.plus.bdui.plus.action;

import com.yandex.plus.core.reflect.NotTraversableField;
import defpackage.ern;
import defpackage.s9f;
import defpackage.w40;
import defpackage.yxm;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class a implements s {
    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a c;
    public static final /* synthetic */ s9f[] d;
    public final com.yandex.plus.bdui.query.g a;
    public final com.yandex.plus.core.templating.template.k b;

    @NotTraversableField
    @NotNull
    private final y renderablesHelper;

    static {
        yxm yxmVar = new yxm(a.class, "query", "getQuery()Lcom/yandex/plus/bdui/query/Query;", 0);
        ern.a.getClass();
        d = new s9f[]{yxmVar};
        c = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
    }

    public a(com.yandex.plus.bdui.query.c cVar, com.yandex.plus.core.templating.parser.b bVar, com.yandex.plus.bdui.query.g gVar, y yVar, com.yandex.plus.log.api.b bVar2) {
        bVar.getClass();
        gVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.a = gVar;
        this.renderablesHelper = yVar;
        this.b = new com.yandex.plus.core.templating.template.k(new com.yandex.plus.bdui.templating.render.h(new com.yandex.plus.bdui.plus.templating.render.a(bVar, 2), new com.yandex.plus.bdui.plus.content.controller.f(new w40(3, cVar, com.yandex.plus.bdui.query.c.class, "create", "create(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/yandex/plus/bdui/query/Query;", 0, 14), bVar2), gVar, bVar2, "QueryRenderableAdapterImpl", "Query"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.renderablesHelper.a(this, obj);
    }

    public int hashCode() {
        return this.renderablesHelper.b(0, this);
    }
}
