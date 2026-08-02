package ru.yandex.taxi.favorites.list.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.favorites.list.ui.FavoritesPresenter$loadAddresses$$inlined$map$2", f = "FavoritesPresenter.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes5.dex */
public final class FavoritesPresenter$loadAddresses$$inlined$map$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesPresenter$loadAddresses$$inlined$map$2$1(e eVar, Continuation continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
