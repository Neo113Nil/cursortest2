package com.yandex.plus.bdui.plus.analytics;

import defpackage.su4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public abstract class a implements com.yandex.plus.bdui.analytics.a {
    public final Function1 a;
    public final com.yandex.plus.log.api.b b;
    public final String c;

    public a(Function1 function1, com.yandex.plus.log.api.b bVar, String str) {
        bVar.getClass();
        this.a = function1;
        this.b = bVar;
        this.c = str;
    }

    public final void b(Object obj, com.yandex.plus.bdui.analytics.c cVar, Function2 function2) {
        cVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        boolean b = bVar.b(aVar);
        String str = this.c;
        if (b) {
            bVar.c(aVar, str, "prepareAndSendEvent(); event = " + cVar);
        }
        Function1 function1 = this.a;
        if (function1 != null) {
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, "prepareAndSendEvent(); filter event...");
            }
            cVar = (com.yandex.plus.bdui.analytics.c) function1.invoke(cVar);
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, su4.o(new StringBuilder("prepareAndSendEvent(); event "), cVar != null ? "allowed" : "declined", "} by filter"));
            }
        } else if (bVar.b(aVar)) {
            bVar.c(aVar, str, "prepareAndSendEvent(); filter not defined so use event");
        }
        if (cVar != null) {
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, "prepareAndSendEvent(); send event = " + cVar);
            }
            function2.invoke(obj, cVar);
        }
    }
}
