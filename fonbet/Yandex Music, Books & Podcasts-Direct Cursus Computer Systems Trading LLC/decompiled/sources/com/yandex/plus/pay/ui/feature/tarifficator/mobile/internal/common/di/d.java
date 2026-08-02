package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.c5b;
import defpackage.dfu;
import defpackage.ern;
import defpackage.nme;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class d implements com.yandex.plus.pay.ui.core.debug.api.b, com.yandex.plus.di.c {
    public final i a;
    public final p b;

    public d(i iVar, p pVar) {
        this.a = iVar;
        this.b = pVar;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.log.impl.b a() {
        return this.a.g;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.ui.core.internal.di.g b() {
        return this.a.t;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.ui.common.api.a c() {
        return this.a.a();
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.pay.ui.core.debug.api.a d() {
        Set set;
        i iVar = this.a;
        Long id = ((com.yandex.plus.domain.auth.api.e) iVar.k.h.getValue()).getId();
        String l = id != null ? id.toString() : null;
        String a = iVar.n.a();
        List list = null;
        String str = iVar.d;
        String str2 = l;
        String str3 = iVar.c;
        com.yandex.plus.core.config.a aVar = iVar.f;
        Object f = iVar.y.f();
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
        return new com.yandex.plus.pay.ui.core.debug.api.a(str2, a, str, str3, false, aVar, list);
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.core.dispatcher.b e() {
        return this.a.i;
    }

    public final nme f() {
        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new j(this.b, 4))}, 1);
        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
    }

    @Override // com.yandex.plus.pay.ui.core.debug.api.b
    public final com.yandex.plus.ui.core.theme.a getTheme() {
        return (com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) this.a.q).a.a.getValue();
    }
}
