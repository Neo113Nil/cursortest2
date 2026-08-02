package ru.yandex.taxi.favorites.list.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.o;

/* loaded from: classes5.dex */
public final class c implements tpr {
    public final /* synthetic */ o a;
    public final /* synthetic */ f b;

    public c(o oVar, f fVar) {
        this.a = oVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FavoritesPresenter$loadAddresses$$inlined$map$1$1 favoritesPresenter$loadAddresses$$inlined$map$1$1;
        int i;
        if (continuation instanceof FavoritesPresenter$loadAddresses$$inlined$map$1$1) {
            favoritesPresenter$loadAddresses$$inlined$map$1$1 = (FavoritesPresenter$loadAddresses$$inlined$map$1$1) continuation;
            int i2 = favoritesPresenter$loadAddresses$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPresenter$loadAddresses$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPresenter$loadAddresses$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPresenter$loadAddresses$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    favoritesPresenter$loadAddresses$$inlined$map$1$1.L$0 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$1.L$1 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$1.L$2 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, favoritesPresenter$loadAddresses$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        favoritesPresenter$loadAddresses$$inlined$map$1$1 = new FavoritesPresenter$loadAddresses$$inlined$map$1$1(this, continuation);
        Object obj2 = favoritesPresenter$loadAddresses$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPresenter$loadAddresses$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
