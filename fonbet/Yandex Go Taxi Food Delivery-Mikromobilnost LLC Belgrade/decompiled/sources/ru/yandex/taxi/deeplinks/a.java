package ru.yandex.taxi.deeplinks;

import defpackage.dms;
import defpackage.hn11;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vje;
import defpackage.vu2;
import defpackage.z0h;
import defpackage.zls;

/* loaded from: classes9.dex */
public abstract class a {
    public static final zls a(vu2 vu2Var) {
        return new IntentHandlerKt$processAppLink$1(vu2Var, null);
    }

    public static final dms b(z0h z0hVar) {
        return new IntentHandlerKt$processDeeplink$1(z0hVar, null);
    }

    public static pzt0 c(tse tseVar, b bVar, vje vjeVar) {
        return tje.N(tseVar, null, null, new ContextIntentHandlerRepository$Companion$registerIntentHandler$1(bVar, vjeVar, null), 3);
    }

    public static void d(tse tseVar, b bVar, hn11 hn11Var) {
        tje.N(tseVar, null, null, new ContextIntentHandlerRepository$Companion$registerTypedDeeplinkHandler$1(bVar, hn11Var, null), 3);
    }
}
