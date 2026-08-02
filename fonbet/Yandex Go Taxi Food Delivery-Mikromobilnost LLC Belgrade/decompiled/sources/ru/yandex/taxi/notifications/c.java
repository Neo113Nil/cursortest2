package ru.yandex.taxi.notifications;

import defpackage.h3y;
import defpackage.jst;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c {
    public final h3y a;

    public c(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, String str, ContinuationImpl continuationImpl) {
        NotificationImageLoader$getImage$1 notificationImageLoader$getImage$1;
        int i;
        try {
            if (continuationImpl instanceof NotificationImageLoader$getImage$1) {
                notificationImageLoader$getImage$1 = (NotificationImageLoader$getImage$1) continuationImpl;
                int i2 = notificationImageLoader$getImage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    notificationImageLoader$getImage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = notificationImageLoader$getImage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = notificationImageLoader$getImage$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    if (str == null) {
                        return null;
                    }
                    NotificationImageLoader$getImage$2 notificationImageLoader$getImage$2 = new NotificationImageLoader$getImage$2(this, str, null);
                    notificationImageLoader$getImage$1.L$0 = null;
                    notificationImageLoader$getImage$1.J$0 = j;
                    notificationImageLoader$getImage$1.label = 1;
                    Object x = kotlinx.coroutines.a.x(j, notificationImageLoader$getImage$2, notificationImageLoader$getImage$1);
                    return x == coroutineSingletons ? coroutineSingletons : x;
                }
            }
            if (i == 0) {
            }
        } catch (Exception e) {
            jst.e.k(e, "Error fetching image");
            return null;
        }
        notificationImageLoader$getImage$1 = new NotificationImageLoader$getImage$1(this, continuationImpl);
        Object obj2 = notificationImageLoader$getImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationImageLoader$getImage$1.label;
    }
}
