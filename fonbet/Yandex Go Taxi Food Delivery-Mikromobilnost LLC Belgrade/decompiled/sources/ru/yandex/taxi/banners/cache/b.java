package ru.yandex.taxi.banners.cache;

import android.content.Context;
import defpackage.aju0;
import defpackage.asf0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wnt;
import defpackage.ziu0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.c;
import ru.yandex.taxi.promotions.storage.CommunicationsCacheMode;
import ru.yandex.taxi.promotions.storage.RamPromotionsStorage;

/* loaded from: classes9.dex */
public final class b {
    public final c a;
    public final wnt b;
    public final Context c;

    public b(c cVar, wnt wntVar, Context context) {
        this.a = cVar;
        this.b = wntVar;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        StorageFactory$get$1 storageFactory$get$1;
        int i;
        aju0 aju0Var;
        int i2;
        if (continuationImpl instanceof StorageFactory$get$1) {
            storageFactory$get$1 = (StorageFactory$get$1) continuationImpl;
            int i3 = storageFactory$get$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                storageFactory$get$1.label = i3 - Integer.MIN_VALUE;
                Object obj = storageFactory$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storageFactory$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aju0 aju0Var2 = aju0.a;
                    storageFactory$get$1.L$0 = aju0Var2;
                    storageFactory$get$1.label = 1;
                    Enum a = this.a.a(storageFactory$get$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aju0Var = aju0Var2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aju0Var = (aju0) storageFactory$get$1.L$0;
                    kotlin.b.b(obj);
                }
                aju0Var.getClass();
                i2 = ziu0.a[((CommunicationsCacheMode) obj).ordinal()];
                if (i2 != 1) {
                    return new asf0("promotion_banners", this.c, this.b);
                }
                if (i2 == 2) {
                    return new RamPromotionsStorage();
                }
                w511.b();
                return null;
            }
        }
        storageFactory$get$1 = new StorageFactory$get$1(this, continuationImpl);
        Object obj2 = storageFactory$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storageFactory$get$1.label;
        if (i != 0) {
        }
        aju0Var.getClass();
        i2 = ziu0.a[((CommunicationsCacheMode) obj2).ordinal()];
        if (i2 != 1) {
        }
    }
}
