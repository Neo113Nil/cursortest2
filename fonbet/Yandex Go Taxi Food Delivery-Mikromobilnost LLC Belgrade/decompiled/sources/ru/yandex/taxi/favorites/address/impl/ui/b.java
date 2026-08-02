package ru.yandex.taxi.favorites.address.impl.ui;

import com.adjust.sdk.Constants;
import defpackage.bvf0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.ndl0;
import defpackage.ndp;
import defpackage.ny61;
import defpackage.ogp;
import defpackage.qe0;
import defpackage.re0;
import defpackage.se0;
import defpackage.sep;
import defpackage.te0;
import defpackage.tep;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ue0;
import defpackage.uep;
import defpackage.ve0;
import defpackage.w511;
import defpackage.we0;
import defpackage.xe0;
import defpackage.ydp;
import defpackage.ye0;
import defpackage.yt11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.favorites.address.impl.domain.c;
import ru.yandex.taxi.favorites.address.impl.domain.d;
import ru.yandex.taxi.favorites.address.impl.domain.e;

/* loaded from: classes5.dex */
public final class b implements yt11 {
    public final ru.yandex.taxi.favorites.address.impl.domain.b a;
    public final ogp b;
    public final d c;
    public final ru.yandex.taxi.favorites.address.impl.domain.a d;
    public final c e;
    public final e f;
    public final ndl0 g;
    public final r0 h;
    public final mth i;
    public String j;

    public b(ru.yandex.taxi.favorites.address.impl.domain.b bVar, ogp ogpVar, d dVar, ru.yandex.taxi.favorites.address.impl.domain.a aVar, c cVar, e eVar, ndl0 ndl0Var) {
        this.a = bVar;
        this.b = ogpVar;
        this.c = dVar;
        this.d = aVar;
        this.e = cVar;
        this.f = eVar;
        this.g = ndl0Var;
        r0 c = bvf0.c(null);
        this.h = c;
        this.i = new mth(kotlinx.coroutines.flow.e.d(c), 6);
        this.j = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r8 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, sep sepVar, ContinuationImpl continuationImpl) {
        FavoriteAddressUiStateInteractor$handleViewOpened$1 favoriteAddressUiStateInteractor$handleViewOpened$1;
        int i;
        String str;
        bVar.getClass();
        if (continuationImpl instanceof FavoriteAddressUiStateInteractor$handleViewOpened$1) {
            favoriteAddressUiStateInteractor$handleViewOpened$1 = (FavoriteAddressUiStateInteractor$handleViewOpened$1) continuationImpl;
            int i2 = favoriteAddressUiStateInteractor$handleViewOpened$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressUiStateInteractor$handleViewOpened$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteAddressUiStateInteractor$handleViewOpened$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressUiStateInteractor$handleViewOpened$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ydp ydpVar = sepVar.a;
                    ye0 ye0Var = ydpVar.e;
                    if (ye0Var != null) {
                        if (ye0Var instanceof te0) {
                            str = "order_notification";
                        } else if (ye0Var instanceof ve0) {
                            str = Constants.DEEPLINK;
                        } else if (ye0Var instanceof se0) {
                            str = "selected_location_menu";
                        } else if (ye0Var instanceof we0) {
                            str = "sharing";
                        } else if (ye0Var instanceof qe0) {
                            str = "favorites";
                        } else if ((ye0Var instanceof ue0) || (ye0Var instanceof xe0)) {
                            str = "search";
                        } else {
                            if (!(ye0Var instanceof re0)) {
                                w511.b();
                                return null;
                            }
                            str = ye0Var.a;
                        }
                    }
                    str = ydpVar.d;
                    bVar.j = str;
                    ru.yandex.taxi.favorites.address.impl.domain.b bVar2 = bVar.a;
                    favoriteAddressUiStateInteractor$handleViewOpened$1.L$0 = null;
                    favoriteAddressUiStateInteractor$handleViewOpened$1.label = 1;
                    obj = bVar2.a(ydpVar, favoriteAddressUiStateInteractor$handleViewOpened$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new jqr((tpr) obj, new FavoriteAddressUiStateInteractor$handleViewOpened$2(bVar, null), 3);
            }
        }
        favoriteAddressUiStateInteractor$handleViewOpened$1 = new FavoriteAddressUiStateInteractor$handleViewOpened$1(bVar, continuationImpl);
        Object obj2 = favoriteAddressUiStateInteractor$handleViewOpened$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressUiStateInteractor$handleViewOpened$1.label;
        if (i != 0) {
        }
        return new jqr((tpr) obj2, new FavoriteAddressUiStateInteractor$handleViewOpened$2(bVar, null), 3);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.i;
    }

    public final uep c() {
        return (uep) this.h.getValue();
    }

    public final void d(tep tepVar, tse tseVar, ndp ndpVar) {
        tje.N(tseVar, null, null, new FavoriteAddressUiStateInteractor$handleAction$1(tepVar, this, ndpVar, null), 3);
    }
}
