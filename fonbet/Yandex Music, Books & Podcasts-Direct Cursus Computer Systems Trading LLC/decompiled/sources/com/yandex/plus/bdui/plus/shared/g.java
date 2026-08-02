package com.yandex.plus.bdui.plus.shared;

import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.core.reflect.NotTraversableField;
import com.yandex.plus.core.templating.template.k;
import defpackage.btf;
import defpackage.ern;
import defpackage.jyr;
import defpackage.s9f;
import defpackage.uah;
import defpackage.yxm;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements com.yandex.plus.bdui.shared.a {
    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a c;
    public static final /* synthetic */ s9f[] d;
    public static final jyr e;
    public final Map a;
    public final k b;

    @NotTraversableField
    @NotNull
    private final com.yandex.plus.log.api.b logger;

    @NotTraversableField
    @NotNull
    private final com.yandex.plus.core.templating.parser.b templateParser;

    static {
        yxm yxmVar = new yxm(g.class, "payload", "getPayload()Ljava/util/Map;", 0);
        ern.a.getClass();
        d = new s9f[]{yxmVar};
        c = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
        e = btf.b(new com.yandex.plus.bdui.plus.content.serializer.b(28));
    }

    public g(com.yandex.plus.core.templating.parser.b bVar, Map map, com.yandex.plus.log.api.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.templateParser = bVar;
        this.a = map;
        this.logger = bVar2;
        this.b = new k(new com.yandex.plus.core.templating.render.c(new com.yandex.plus.bdui.plus.templating.render.a(bVar, 1), com.yandex.plus.bdui.plus.templating.render.b.c, map, bVar2, "PlusPayloadSharedData", "PlusPayload"));
    }

    @Override // com.yandex.plus.bdui.shared.a
    public final com.yandex.plus.bdui.shared.a a(com.yandex.plus.bdui.shared.a aVar) {
        aVar.getClass();
        g gVar = aVar instanceof g ? (g) aVar : null;
        return gVar != null ? new g(this.templateParser, uah.i(this.a, gVar.a), this.logger) : this;
    }

    @Override // com.yandex.plus.bdui.shared.a
    public final com.yandex.plus.bdui.shared.a copy() {
        return new g(this.templateParser, this.a, this.logger);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        c.getClass();
        return ((y) e.getValue()).a(this, obj);
    }

    public final int hashCode() {
        c.getClass();
        return ((y) e.getValue()).b(0, this);
    }
}
