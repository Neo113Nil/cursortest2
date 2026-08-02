package ru.yandex.taxi.persuggest.source;

import defpackage.mdh;
import defpackage.o270;
import defpackage.o9j0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes6.dex */
public interface g {
    static Object a(g gVar, o9j0 o9j0Var, Action action, SuspendLambda suspendLambda, int i) {
        if ((i & 2) != 0) {
            action = Action.PIN_DROP;
        }
        o270 o270Var = (o270) gVar;
        o270Var.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OneTimeRequestFinalSuggestInteractorImpl$requestFs$2(o270Var, o9j0Var, null, action, null), suspendLambda);
    }
}
