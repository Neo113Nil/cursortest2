package com.yandex.plus.pay.ui.core.debug.internal.common.di;

import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.ui.core.debug.internal.d;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.j;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.i;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.k;
import defpackage.dq7;
import defpackage.is6;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        is6 is6Var = (is6) obj;
        switch (this.a) {
            case 0:
                is6Var.getClass();
                return new d((com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b) this.b.f.getValue());
            case 1:
                is6Var.getClass();
                b bVar = this.b;
                return new i(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(bVar.a.d()), (com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b) bVar.f.getValue());
            case 2:
                is6Var.getClass();
                b bVar2 = this.b;
                com.yandex.plus.pay.ui.core.debug.api.b bVar3 = bVar2.a;
                com.yandex.plus.pay.ui.core.debug.api.a d = bVar3.d();
                com.yandex.plus.pay.log.impl.b bVar4 = bVar2.b;
                com.yandex.plus.pay.ui.core.debug.internal.domain.log.a aVar = (com.yandex.plus.pay.ui.core.debug.internal.domain.log.a) bVar2.g.getValue();
                com.yandex.plus.pay.ui.common.api.a aVar2 = bVar2.c;
                n nVar = new n(0, bVar3, com.yandex.plus.pay.ui.core.debug.api.b.class, "getTheme", "getTheme()Lcom/yandex/plus/ui/core/theme/PlusTheme;", 0, 23);
                ((com.yandex.plus.core.dispatcher.a) bVar2.d).getClass();
                dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                d.getClass();
                bVar4.getClass();
                aVar.getClass();
                aVar2.getClass();
                dq7Var.getClass();
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                bVar5.a = d;
                bVar5.b = bVar4;
                bVar5.d = aVar;
                bVar5.e = aVar2;
                bVar5.f = nVar;
                bVar5.c = dq7Var;
                return new j(bVar5, (com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b) bVar2.f.getValue());
            default:
                is6Var.getClass();
                b bVar6 = this.b;
                return new k(CollectionsKt.w0(bVar6.b.b.d), new y(bVar6.c.a(), (com.yandex.plus.pay.ui.core.debug.internal.domain.log.a) bVar6.g.getValue()), (com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b) bVar6.f.getValue());
        }
    }
}
