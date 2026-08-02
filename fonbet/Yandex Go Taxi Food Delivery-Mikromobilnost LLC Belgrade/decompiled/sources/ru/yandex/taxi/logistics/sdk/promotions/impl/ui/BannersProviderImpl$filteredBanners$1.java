package ru.yandex.taxi.logistics.sdk.promotions.impl.ui;

import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xq4;
import defpackage.zls;
import defpackage.zrf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzrf0;", "bannersInfo", "", "", "displayedIds", "<anonymous>", "(Lzrf0;Ljava/util/List;)Lzrf0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.ui.BannersProviderImpl$filteredBanners$1", f = "BannersProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersProviderImpl$filteredBanners$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BannersProviderImpl$filteredBanners$1 bannersProviderImpl$filteredBanners$1 = new BannersProviderImpl$filteredBanners$1(3, (Continuation) obj3);
        bannersProviderImpl$filteredBanners$1.L$0 = (zrf0) obj;
        bannersProviderImpl$filteredBanners$1.L$1 = (List) obj2;
        return bannersProviderImpl$filteredBanners$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zrf0 zrf0Var = (zrf0) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list2 = zrf0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            xq4 xq4Var = (xq4) obj2;
            if (list != null) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (evu0.y(xq4Var.a, (String) it.next(), false)) {
                        }
                    }
                }
            }
            arrayList.add(obj2);
        }
        return new zrf0(arrayList, zrf0Var.b);
    }
}
