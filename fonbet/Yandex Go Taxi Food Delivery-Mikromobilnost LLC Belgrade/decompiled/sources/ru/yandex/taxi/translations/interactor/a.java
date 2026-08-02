package ru.yandex.taxi.translations.interactor;

import defpackage.ck;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.on2;
import defpackage.oz01;
import defpackage.rz01;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.translations.api.TranslationsApi;

/* loaded from: classes10.dex */
public final class a {
    public final tt2 a;
    public final oz01 b;
    public final i3y c;

    public a(on2 on2Var, tt2 tt2Var, oz01 oz01Var) {
        this.a = tt2Var;
        this.b = oz01Var;
        this.c = kotlin.a.a(new ck(on2Var, 27));
    }

    public final Object a(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new TranslationsLoadInteractor$fetchStrings$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object b(String str, SuspendLambda suspendLambda) {
        return ru.yandex.taxi.network.api.a.a(((TranslationsApi) this.c.getValue()).a(new rz01(str)), null, suspendLambda);
    }
}
