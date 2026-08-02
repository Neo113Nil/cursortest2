package ru.yandex.taxi.preorder.source.mode.interactor;

import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d dVar = this.a;
        dVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1(dVar, booleanValue, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
