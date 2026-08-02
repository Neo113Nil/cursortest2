package ru.yandex.taxi.superapp.orders;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.uxx0;
import defpackage.xzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.appdelegates.SupportedOrderType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public final class a {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        GetActiveOrdersInteractor$getOrders$1 getActiveOrdersInteractor$getOrders$1;
        Object obj;
        int i;
        xzs xzsVar;
        xzs xzsVar2;
        if (continuationImpl instanceof GetActiveOrdersInteractor$getOrders$1) {
            getActiveOrdersInteractor$getOrders$1 = (GetActiveOrdersInteractor$getOrders$1) continuationImpl;
            int i2 = getActiveOrdersInteractor$getOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getActiveOrdersInteractor$getOrders$1.label = i2 - Integer.MIN_VALUE;
                obj = getActiveOrdersInteractor$getOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getActiveOrdersInteractor$getOrders$1.label;
                if (i != 0) {
                    b.b(obj);
                    g gVar = this.a;
                    getActiveOrdersInteractor$getOrders$1.label = 1;
                    gVar.getClass();
                    SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
                    obj = gVar.b.q(getActiveOrdersInteractor$getOrders$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return EmptyList.a;
                }
                List list = this.a.a().a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    o2y0 o2y0Var = (o2y0) obj2;
                    if (o2y0Var.c() != DriveState.CANCELLED && o2y0Var.c() != DriveState.COMPLETE && o2y0Var.c() != DriveState.FAILED && o2y0Var.c() != DriveState.EXPIRED) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o2y0 o2y0Var2 = (o2y0) it.next();
                    Address h = o2y0Var2.b().t().h();
                    Address b = o2y0Var2.b().t().b();
                    boolean z = o2y0Var2.b().b.M != null;
                    if (h != null) {
                        Double valueOf = Double.valueOf(h.B().a);
                        Double valueOf2 = Double.valueOf(h.B().b);
                        String favoriteId = h.getFavoriteId();
                        FavoriteAddressDatumType datumType = h.getDatumType();
                        xzsVar = new xzs(valueOf, valueOf2, favoriteId, datumType != null ? datumType.name() : null, h.c2());
                    } else {
                        xzsVar = null;
                    }
                    if (b != null) {
                        Double valueOf3 = Double.valueOf(b.B().a);
                        Double valueOf4 = Double.valueOf(b.B().b);
                        String favoriteId2 = b.getFavoriteId();
                        FavoriteAddressDatumType datumType2 = b.getDatumType();
                        xzsVar2 = new xzs(valueOf3, valueOf4, favoriteId2, datumType2 != null ? datumType2.name() : null, b.c2());
                    } else {
                        xzsVar2 = null;
                    }
                    arrayList2.add(new uxx0(xzsVar, xzsVar2, Boolean.valueOf(z), o2y0Var2.b().h.b.name()));
                }
                return arrayList2;
            }
        }
        getActiveOrdersInteractor$getOrders$1 = new GetActiveOrdersInteractor$getOrders$1(this, continuationImpl);
        obj = getActiveOrdersInteractor$getOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getActiveOrdersInteractor$getOrders$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
