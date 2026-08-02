package ru.yandex.taxi.favorites.list.ui;

import defpackage.avj0;
import defpackage.bjp;
import defpackage.ffp;
import defpackage.kyh0;
import defpackage.mhp;
import defpackage.ny61;
import defpackage.qx2;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public b(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        if (r14.emit(r7, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FavoritesPresenter$loadAddresses$$inlined$map$1$2$1 favoritesPresenter$loadAddresses$$inlined$map$1$2$1;
        int i;
        List list;
        vpr vprVar;
        mhp mhpVar;
        bjp bjpVar;
        if (continuation instanceof FavoritesPresenter$loadAddresses$$inlined$map$1$2$1) {
            favoritesPresenter$loadAddresses$$inlined$map$1$2$1 = (FavoritesPresenter$loadAddresses$$inlined$map$1$2$1) continuation;
            int i2 = favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoritesPresenter$loadAddresses$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label;
                f fVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = (List) obj;
                    ru.yandex.taxi.favorites.domain.e eVar = fVar.x;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$0 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$1 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$2 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$4 = vprVar2;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$5 = null;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$6 = list2;
                    favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label = 1;
                    obj2 = eVar.a(favoritesPresenter$loadAddresses$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        list = list2;
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
                List list3 = (List) favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$6;
                vprVar = (vpr) favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                list = list3;
                mhpVar = (mhp) obj2;
                if (mhpVar != null) {
                    bjpVar = null;
                } else {
                    ffp ffpVar = mhpVar.a;
                    if (fVar.G) {
                        fVar.G = false;
                        qx2 qx2Var = fVar.E;
                        List list4 = ffpVar.a;
                        qx2Var.getClass();
                        qx2Var.d(qx2.a(list4));
                    }
                    String str = ffpVar.c;
                    if (str.length() == 0) {
                        str = ((avj0) fVar.A).h(kyh0.favorites_screen_title);
                    }
                    bjpVar = new bjp(ffpVar.a, list, str, mhpVar.b, ffpVar.d);
                    fVar.I = bjpVar;
                }
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$0 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$1 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$2 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$3 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$4 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$5 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$6 = null;
                favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label = 2;
            }
        }
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1 = new FavoritesPresenter$loadAddresses$$inlined$map$1$2$1(this, continuation);
        Object obj22 = favoritesPresenter$loadAddresses$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label;
        f fVar2 = this.b;
        if (i != 0) {
        }
        mhpVar = (mhp) obj22;
        if (mhpVar != null) {
        }
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$0 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$1 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$2 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$3 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$4 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$5 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.L$6 = null;
        favoritesPresenter$loadAddresses$$inlined$map$1$2$1.label = 2;
    }
}
