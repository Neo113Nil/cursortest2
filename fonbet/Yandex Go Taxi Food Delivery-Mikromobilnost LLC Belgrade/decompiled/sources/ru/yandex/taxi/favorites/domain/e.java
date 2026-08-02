package ru.yandex.taxi.favorites.domain;

import defpackage.efp;
import defpackage.ffp;
import defpackage.khp;
import defpackage.mhp;
import defpackage.ny61;
import defpackage.sjp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class e {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final sjp b;
    public final ru.yandex.taxi.favorites.rides.save_modal.domain.c c;
    public final ru.yandex.taxi.favorites.rides.delete_modal.data.a d;

    public e(ru.yandex.taxi.favorites.data.repo.a aVar, sjp sjpVar, ru.yandex.taxi.favorites.rides.save_modal.domain.c cVar, ru.yandex.taxi.favorites.rides.delete_modal.data.a aVar2) {
        this.a = aVar;
        this.b = sjpVar;
        this.c = cVar;
        this.d = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FavoriteRidesAndAddressesInteractor$getFavorites$1 favoriteRidesAndAddressesInteractor$getFavorites$1;
        int i;
        boolean booleanValue;
        efp efpVar;
        khp.a aVar;
        if (continuationImpl instanceof FavoriteRidesAndAddressesInteractor$getFavorites$1) {
            favoriteRidesAndAddressesInteractor$getFavorites$1 = (FavoriteRidesAndAddressesInteractor$getFavorites$1) continuationImpl;
            int i2 = favoriteRidesAndAddressesInteractor$getFavorites$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteRidesAndAddressesInteractor$getFavorites$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteRidesAndAddressesInteractor$getFavorites$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteRidesAndAddressesInteractor$getFavorites$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    favoriteRidesAndAddressesInteractor$getFavorites$1.label = 1;
                    obj = this.b.b.b(favoriteRidesAndAddressesInteractor$getFavorites$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            ffp ffpVar = (ffp) obj;
                            if (ffpVar != null) {
                                return new mhp(ffpVar, null);
                            }
                            return null;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        khp khpVar = (khp) obj;
                        if (khpVar != null && (efpVar = khpVar.a) != null && (aVar = khpVar.b) != null && aVar.a.a != FormattedText.c) {
                            return new mhp(new ffp(efpVar.a, efpVar.b, efpVar.c, efpVar.e), aVar);
                        }
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                ru.yandex.taxi.favorites.data.repo.a aVar2 = this.a;
                if (booleanValue) {
                    favoriteRidesAndAddressesInteractor$getFavorites$1.label = 2;
                    obj = aVar2.c(false, favoriteRidesAndAddressesInteractor$getFavorites$1);
                } else {
                    favoriteRidesAndAddressesInteractor$getFavorites$1.label = 3;
                    obj = aVar2.e(favoriteRidesAndAddressesInteractor$getFavorites$1);
                }
                return coroutineSingletons;
            }
        }
        favoriteRidesAndAddressesInteractor$getFavorites$1 = new FavoriteRidesAndAddressesInteractor$getFavorites$1(this, continuationImpl);
        Object obj2 = favoriteRidesAndAddressesInteractor$getFavorites$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteRidesAndAddressesInteractor$getFavorites$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        ru.yandex.taxi.favorites.data.repo.a aVar22 = this.a;
        if (booleanValue) {
        }
        return coroutineSingletons2;
    }

    public final d b() {
        return new d(new b(new m0(this.d.d, this.c.e, new FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$1(3, null))));
    }
}
