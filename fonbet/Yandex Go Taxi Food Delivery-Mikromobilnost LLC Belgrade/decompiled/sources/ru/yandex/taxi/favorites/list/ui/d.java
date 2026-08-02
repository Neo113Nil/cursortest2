package ru.yandex.taxi.favorites.list.ui;

import defpackage.bjp;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FavoritesPresenter$loadAddresses$$inlined$map$2$2$1 favoritesPresenter$loadAddresses$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof FavoritesPresenter$loadAddresses$$inlined$map$2$2$1) {
            favoritesPresenter$loadAddresses$$inlined$map$2$2$1 = (FavoritesPresenter$loadAddresses$$inlined$map$2$2$1) continuation;
            int i2 = favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoritesPresenter$loadAddresses$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    bjp bjpVar = (bjp) pair.getFirst();
                    ThemeType themeType = (ThemeType) pair.getSecond();
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$0 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$1 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$2 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$4 = vprVar2;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$5 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$6 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$7 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label = 1;
                    obj2 = this.b.Qg(bjpVar, themeType, favoritesPresenter$loadAddresses$$inlined$map$2$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$4;
                kotlin.b.b(obj2);
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$0 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$1 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$2 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$3 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$4 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$5 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$6 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$7 = null;
                favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label = 2;
            }
        }
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1 = new FavoritesPresenter$loadAddresses$$inlined$map$2$2$1(this, continuation);
        Object obj22 = favoritesPresenter$loadAddresses$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$0 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$1 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$2 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$3 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$4 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$5 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$6 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.L$7 = null;
        favoritesPresenter$loadAddresses$$inlined$map$2$2$1.label = 2;
    }
}
