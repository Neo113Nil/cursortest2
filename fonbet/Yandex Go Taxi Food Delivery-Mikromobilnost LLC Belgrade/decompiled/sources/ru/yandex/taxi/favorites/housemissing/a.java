package ru.yandex.taxi.favorites.housemissing;

import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        b bVar = this.a;
        tje.N(bVar.Jg(), null, null, new HouseMissingPresenter$renderState$1(bVar, null), 3);
        return zy11.a;
    }
}
