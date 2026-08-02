package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

import defpackage.c5b;
import defpackage.r7o;
import defpackage.sj;
import defpackage.t7o;
import defpackage.z7o;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class e implements com.yandex.plus.di.c, com.yandex.plus.pay.ui.core.debug.api.b {
    public final i a;
    public final sj b;

    public e(i iVar, sj sjVar) {
        this.a = iVar;
        this.b = sjVar;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.log.impl.b a() {
        return this.a.o;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.ui.core.internal.di.g b() {
        return this.a.g;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.ui.common.api.a c() {
        return (com.yandex.plus.pay.ui.common.api.a) this.a.t.getValue();
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.ui.core.debug.api.a d() {
        Set set;
        i iVar = this.a;
        Long id = ((com.yandex.plus.domain.auth.api.e) iVar.a().n.h.getValue()).getId();
        List list = null;
        String l = id != null ? id.toString() : null;
        String a = iVar.a().s.a();
        iVar.a().getClass();
        String str = iVar.a().j;
        String str2 = iVar.a().a;
        String str3 = l;
        com.yandex.plus.core.config.a aVar = iVar.d;
        Object f = ((com.yandex.plus.experiments.impl.providers.h) iVar.H.getValue()).f();
        r7o r7oVar = z7o.b;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) f;
        if (aVar2 != null && (set = aVar2.d) != null) {
            list = CollectionsKt.w0(set);
        }
        if (list == null) {
            list = c5b.a;
        }
        return new com.yandex.plus.pay.ui.core.debug.api.a(str3, a, str, str2, true, aVar, list);
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.core.dispatcher.b e() {
        return this.a.a().q;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.ui.core.theme.a getTheme() {
        return (com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) this.a.e).a.a.getValue();
    }
}
