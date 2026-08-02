package com.yandex.plus.home.feature.webviews.internal;

import defpackage.brr;
import defpackage.e5b;
import defpackage.ern;
import defpackage.t75;
import defpackage.tf6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.bdui.plus.auth.a aVar, tf6 tf6Var) {
        this.b = fVar;
        this.c = bVar;
        this.d = aVar;
        this.e = tf6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                com.yandex.plus.home.feature.webviews.internal.bridge.c cVar = (com.yandex.plus.home.feature.webviews.internal.bridge.c) this.b;
                Function0 function0 = (Function0) this.c;
                brr brrVar = (brr) this.e;
                Function0 function02 = (Function0) this.d;
                com.yandex.plus.webview.core.g gVar = (com.yandex.plus.webview.core.g) obj;
                gVar.getClass();
                gVar.a(new com.yandex.plus.home.feature.webviews.internal.bridge.d(cVar));
                gVar.a(new com.yandex.plus.home.feature.webviews.internal.bridge.e(new f(0, brrVar), false));
                gVar.a(new c(new f(1, function02)));
                if (function0 != null) {
                    gVar.a(new com.yandex.plus.home.feature.webviews.internal.stories.a(function0));
                }
                return Unit.a;
            default:
                com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) this.b;
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.c;
                com.yandex.plus.bdui.plus.auth.a aVar = (com.yandex.plus.bdui.plus.auth.a) this.d;
                tf6 tf6Var = (tf6) this.e;
                ((com.yandex.plus.bdui.plus.analytics.c) obj).getClass();
                int i = 0;
                com.yandex.plus.bdui.plus.b bVar2 = new com.yandex.plus.bdui.plus.b(fVar, bVar, i);
                com.yandex.plus.bdui.plus.c cVar2 = new com.yandex.plus.bdui.plus.c(i, aVar, tf6Var, bVar);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return t75.c(new com.yandex.plus.bdui.content.c("PlusAuthorize", bVar2, ern.a(com.yandex.plus.bdui.plus.content.a.class), cVar2, e5bVar));
        }
    }

    public /* synthetic */ e(com.yandex.plus.home.feature.webviews.internal.bridge.c cVar, Function0 function0, brr brrVar, Function0 function02) {
        this.b = cVar;
        this.c = function0;
        this.e = brrVar;
        this.d = function02;
    }
}
