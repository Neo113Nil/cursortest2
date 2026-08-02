package ru.yandex.taxi.favorites.rides.save_modal.domain;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.jl40;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.on2;
import defpackage.xgp;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.favorites.data.api.FavoritesApi;
import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;

/* loaded from: classes5.dex */
public final class c {
    public final on2 a;
    public final n20 b;
    public final i3y c = kotlin.a.a(new iik0(22, this));
    public final r0 d;
    public final gci0 e;

    public c(on2 on2Var, n20 n20Var) {
        this.a = on2Var;
        this.b = n20Var;
        r0 c = bvf0.c(null);
        this.d = c;
        this.e = e.d(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r9, null, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        SaveFavoriteRideRepository$createRide$1 saveFavoriteRideRepository$createRide$1;
        int i;
        Iterator it;
        Object obj;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof SaveFavoriteRideRepository$createRide$1) {
            saveFavoriteRideRepository$createRide$1 = (SaveFavoriteRideRepository$createRide$1) continuationImpl;
            int i2 = saveFavoriteRideRepository$createRide$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideRepository$createRide$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = saveFavoriteRideRepository$createRide$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideRepository$createRide$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    saveFavoriteRideRepository$createRide$1.L$0 = str;
                    saveFavoriteRideRepository$createRide$1.L$1 = str2;
                    saveFavoriteRideRepository$createRide$1.L$2 = str3;
                    saveFavoriteRideRepository$createRide$1.label = 1;
                    obj2 = ((com.yandex.go.taxi.order.provider.a) this.b).k(saveFavoriteRideRepository$createRide$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    str3 = (String) saveFavoriteRideRepository$createRide$1.L$2;
                    str2 = (String) saveFavoriteRideRepository$createRide$1.L$1;
                    str = (String) saveFavoriteRideRepository$createRide$1.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((o2y0) obj).b().a, str)) {
                        break;
                    }
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        taxiOrder.a(new ChangeOrderState$Pending(null, ChangeOrderState$Source.SAVE_RIDE));
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                }
                cmt<zy11> h = ((FavoritesApi) this.c.getValue()).h(new xgp(str, str2, str3));
                saveFavoriteRideRepository$createRide$1.L$0 = null;
                saveFavoriteRideRepository$createRide$1.L$1 = null;
                saveFavoriteRideRepository$createRide$1.L$2 = null;
                saveFavoriteRideRepository$createRide$1.label = 2;
            }
        }
        saveFavoriteRideRepository$createRide$1 = new SaveFavoriteRideRepository$createRide$1(this, continuationImpl);
        Object obj22 = saveFavoriteRideRepository$createRide$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideRepository$createRide$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj;
        if (o2y0Var != null) {
        }
        cmt<zy11> h2 = ((FavoritesApi) this.c.getValue()).h(new xgp(str, str2, str3));
        saveFavoriteRideRepository$createRide$1.L$0 = null;
        saveFavoriteRideRepository$createRide$1.L$1 = null;
        saveFavoriteRideRepository$createRide$1.L$2 = null;
        saveFavoriteRideRepository$createRide$1.label = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(4:17|18|(2:20|(1:22))|13))(2:23|24))(2:31|32)|25|26|(1:28)|18|(0)|13))|38|6|7|(0)(0)|25|26|(0)|18|(0)|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (d(r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r11 = new kotlin.Result.Failure(r10);
        r10 = r9;
        r9 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, zy11] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ru.yandex.taxi.favorites.rides.save_modal.domain.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        SaveFavoriteRideRepository$createRideRequest$1 saveFavoriteRideRepository$createRideRequest$1;
        int i;
        String str4;
        boolean z;
        Object obj;
        String str5;
        if (continuationImpl instanceof SaveFavoriteRideRepository$createRideRequest$1) {
            saveFavoriteRideRepository$createRideRequest$1 = (SaveFavoriteRideRepository$createRideRequest$1) continuationImpl;
            int i2 = saveFavoriteRideRepository$createRideRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideRepository$createRideRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = saveFavoriteRideRepository$createRideRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideRepository$createRideRequest$1.label;
                ?? r3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.d.l(ResponseState.LOADING);
                    saveFavoriteRideRepository$createRideRequest$1.L$0 = str;
                    saveFavoriteRideRepository$createRideRequest$1.L$1 = null;
                    saveFavoriteRideRepository$createRideRequest$1.L$2 = null;
                    saveFavoriteRideRepository$createRideRequest$1.label = 1;
                    Object a = a(str, str2, str3, saveFavoriteRideRepository$createRideRequest$1);
                    str5 = str;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return r3;
                        }
                        Object obj3 = saveFavoriteRideRepository$createRideRequest$1.L$3;
                        str4 = (String) saveFavoriteRideRepository$createRideRequest$1.L$0;
                        kotlin.b.b(obj2);
                        obj = obj3;
                        if (Result.a(obj) != null) {
                            saveFavoriteRideRepository$createRideRequest$1.L$0 = null;
                            saveFavoriteRideRepository$createRideRequest$1.L$1 = null;
                            saveFavoriteRideRepository$createRideRequest$1.L$2 = null;
                            saveFavoriteRideRepository$createRideRequest$1.L$3 = obj;
                            saveFavoriteRideRepository$createRideRequest$1.L$4 = null;
                            saveFavoriteRideRepository$createRideRequest$1.label = 3;
                            if (c(str4, saveFavoriteRideRepository$createRideRequest$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return r3;
                    }
                    String str6 = (String) saveFavoriteRideRepository$createRideRequest$1.L$0;
                    kotlin.b.b(obj2);
                    str5 = str6;
                }
                str4 = str5;
                str = r3;
                Object obj4 = str;
                z = obj4 instanceof Result.Failure;
                obj = obj4;
                if (!z) {
                    saveFavoriteRideRepository$createRideRequest$1.L$0 = str4;
                    saveFavoriteRideRepository$createRideRequest$1.L$1 = null;
                    saveFavoriteRideRepository$createRideRequest$1.L$2 = null;
                    saveFavoriteRideRepository$createRideRequest$1.L$3 = obj4;
                    saveFavoriteRideRepository$createRideRequest$1.L$4 = null;
                    saveFavoriteRideRepository$createRideRequest$1.label = 2;
                    obj = obj4;
                }
                if (Result.a(obj) != null) {
                }
                return r3;
            }
        }
        saveFavoriteRideRepository$createRideRequest$1 = new SaveFavoriteRideRepository$createRideRequest$1(this, continuationImpl);
        Object obj22 = saveFavoriteRideRepository$createRideRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideRepository$createRideRequest$1.label;
        ?? r32 = zy11.a;
        if (i != 0) {
        }
        str4 = str5;
        str = r32;
        Object obj42 = str;
        z = obj42 instanceof Result.Failure;
        obj = obj42;
        if (!z) {
        }
        if (Result.a(obj) != null) {
        }
        return r32;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        SaveFavoriteRideRepository$onFailureCreateRide$1 saveFavoriteRideRepository$onFailureCreateRide$1;
        int i;
        Iterator it;
        Object obj;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof SaveFavoriteRideRepository$onFailureCreateRide$1) {
            saveFavoriteRideRepository$onFailureCreateRide$1 = (SaveFavoriteRideRepository$onFailureCreateRide$1) continuationImpl;
            int i2 = saveFavoriteRideRepository$onFailureCreateRide$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideRepository$onFailureCreateRide$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = saveFavoriteRideRepository$onFailureCreateRide$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideRepository$onFailureCreateRide$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.d.l(ResponseState.ERROR);
                    saveFavoriteRideRepository$onFailureCreateRide$1.L$0 = str;
                    saveFavoriteRideRepository$onFailureCreateRide$1.label = 1;
                    obj2 = ((com.yandex.go.taxi.order.provider.a) this.b).k(saveFavoriteRideRepository$onFailureCreateRide$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) saveFavoriteRideRepository$onFailureCreateRide$1.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((o2y0) obj).b().a, str)) {
                        break;
                    }
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.SAVE_RIDE));
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                }
                return zy11.a;
            }
        }
        saveFavoriteRideRepository$onFailureCreateRide$1 = new SaveFavoriteRideRepository$onFailureCreateRide$1(this, continuationImpl);
        Object obj22 = saveFavoriteRideRepository$onFailureCreateRide$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideRepository$onFailureCreateRide$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj;
        if (o2y0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        SaveFavoriteRideRepository$onSuccessCreateRide$1 saveFavoriteRideRepository$onSuccessCreateRide$1;
        int i;
        String str2;
        Iterator it;
        Object obj;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof SaveFavoriteRideRepository$onSuccessCreateRide$1) {
            saveFavoriteRideRepository$onSuccessCreateRide$1 = (SaveFavoriteRideRepository$onSuccessCreateRide$1) continuationImpl;
            int i2 = saveFavoriteRideRepository$onSuccessCreateRide$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideRepository$onSuccessCreateRide$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = saveFavoriteRideRepository$onSuccessCreateRide$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideRepository$onSuccessCreateRide$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.d.l(ResponseState.LOADED);
                    n20 n20Var = this.b;
                    saveFavoriteRideRepository$onSuccessCreateRide$1.L$0 = str;
                    saveFavoriteRideRepository$onSuccessCreateRide$1.label = 1;
                    Object k = ((com.yandex.go.taxi.order.provider.a) n20Var).k(saveFavoriteRideRepository$onSuccessCreateRide$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = k;
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) saveFavoriteRideRepository$onSuccessCreateRide$1.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((o2y0) obj).b().a, str2)) {
                        break;
                    }
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        taxiOrder.getClass();
                        synchronized (taxiOrder) {
                            TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                            taxiOrderLocalData.getClass();
                            taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -5, 16777215);
                        }
                        taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.SAVE_RIDE));
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                }
                return zy11.a;
            }
        }
        saveFavoriteRideRepository$onSuccessCreateRide$1 = new SaveFavoriteRideRepository$onSuccessCreateRide$1(this, continuationImpl);
        Object obj22 = saveFavoriteRideRepository$onSuccessCreateRide$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideRepository$onSuccessCreateRide$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj;
        if (o2y0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(1:15)|16|(1:18)|19))|32|6|7|(0)(0)|12|13|(0)|16|(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        SaveFavoriteRideRepository$updateRideRequest$1 saveFavoriteRideRepository$updateRideRequest$1;
        int i;
        Object failure;
        if (continuationImpl instanceof SaveFavoriteRideRepository$updateRideRequest$1) {
            saveFavoriteRideRepository$updateRideRequest$1 = (SaveFavoriteRideRepository$updateRideRequest$1) continuationImpl;
            int i2 = saveFavoriteRideRepository$updateRideRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideRepository$updateRideRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = saveFavoriteRideRepository$updateRideRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideRepository$updateRideRequest$1.label;
                zy11 zy11Var = zy11.a;
                r0 r0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0Var.l(ResponseState.LOADING);
                    cmt<zy11> a = ((FavoritesApi) this.c.getValue()).a(new xgp(str, str2, str3));
                    saveFavoriteRideRepository$updateRideRequest$1.L$0 = null;
                    saveFavoriteRideRepository$updateRideRequest$1.L$1 = null;
                    saveFavoriteRideRepository$updateRideRequest$1.L$2 = null;
                    saveFavoriteRideRepository$updateRideRequest$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(a, null, saveFavoriteRideRepository$updateRideRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
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
        saveFavoriteRideRepository$updateRideRequest$1 = new SaveFavoriteRideRepository$updateRideRequest$1(this, continuationImpl);
        Object obj2 = saveFavoriteRideRepository$updateRideRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideRepository$updateRideRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        r0 r0Var2 = this.d;
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
