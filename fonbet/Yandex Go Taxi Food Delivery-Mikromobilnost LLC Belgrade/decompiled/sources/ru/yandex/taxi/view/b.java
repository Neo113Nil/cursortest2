package ru.yandex.taxi.view;

import defpackage.ae0;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;
    public final /* synthetic */ ae0 b;

    public b(c cVar, ae0 ae0Var) {
        this.a = cVar;
        this.b = ae0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.I.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new AddFavoritesModalViewPresenter$attachView$3$1$1(this.b, booleanValue, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
