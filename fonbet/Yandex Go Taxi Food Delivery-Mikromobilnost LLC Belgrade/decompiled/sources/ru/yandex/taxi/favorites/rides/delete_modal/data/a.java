package ru.yandex.taxi.favorites.rides.delete_modal.data;

import defpackage.amh;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.gci0;
import defpackage.hrh;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.favorites.data.api.FavoritesApi;
import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;

/* loaded from: classes5.dex */
public final class a {
    public final on2 a;
    public final i3y b = kotlin.a.a(new amh(2, this));
    public final r0 c;
    public final gci0 d;

    public a(on2 on2Var) {
        this.a = on2Var;
        r0 c = bvf0.c(null);
        this.c = c;
        this.d = e.d(c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(1:15)|16|(1:18)|19))|32|6|7|(0)(0)|12|13|(0)|16|(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        DeleteFavoriteRideRepository$createRideRequest$1 deleteFavoriteRideRepository$createRideRequest$1;
        int i;
        Object failure;
        if (continuationImpl instanceof DeleteFavoriteRideRepository$createRideRequest$1) {
            deleteFavoriteRideRepository$createRideRequest$1 = (DeleteFavoriteRideRepository$createRideRequest$1) continuationImpl;
            int i2 = deleteFavoriteRideRepository$createRideRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteFavoriteRideRepository$createRideRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteFavoriteRideRepository$createRideRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteFavoriteRideRepository$createRideRequest$1.label;
                zy11 zy11Var = zy11.a;
                r0 r0Var = this.c;
                if (i != 0) {
                    b.b(obj);
                    r0Var.l(ResponseState.LOADING);
                    cmt<zy11> f = ((FavoritesApi) this.b.getValue()).f(new hrh(str));
                    deleteFavoriteRideRepository$createRideRequest$1.L$0 = null;
                    deleteFavoriteRideRepository$createRideRequest$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(f, null, deleteFavoriteRideRepository$createRideRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                failure = zy11Var;
                if (!(failure instanceof Result.Failure)) {
                    r0Var.l(ResponseState.LOADED);
                }
                if (Result.a(failure) != null) {
                    r0Var.l(ResponseState.ERROR);
                }
                return zy11Var;
            }
        }
        deleteFavoriteRideRepository$createRideRequest$1 = new DeleteFavoriteRideRepository$createRideRequest$1(this, continuationImpl);
        Object obj2 = deleteFavoriteRideRepository$createRideRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteFavoriteRideRepository$createRideRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        r0 r0Var2 = this.c;
        if (i != 0) {
        }
        failure = zy11Var2;
        if (!(failure instanceof Result.Failure)) {
        }
        if (Result.a(failure) != null) {
        }
        return zy11Var2;
    }
}
