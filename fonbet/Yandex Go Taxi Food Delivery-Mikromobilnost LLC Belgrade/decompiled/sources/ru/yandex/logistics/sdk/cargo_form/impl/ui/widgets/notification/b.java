package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification;

import defpackage.cj60;
import defpackage.cqs0;
import defpackage.fqs0;
import defpackage.j6s;
import defpackage.ny61;
import defpackage.sk60;
import defpackage.x2s;
import defpackage.xts0;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;

    public b(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cj60 cj60Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        NotificationMapper$map$1 notificationMapper$map$1;
        int i;
        cj60 cj60Var2 = cj60Var;
        if (continuationImpl instanceof NotificationMapper$map$1) {
            notificationMapper$map$1 = (NotificationMapper$map$1) continuationImpl;
            int i2 = notificationMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationMapper$map$1.label = i2 - Integer.MIN_VALUE;
                NotificationMapper$map$1 notificationMapper$map$12 = notificationMapper$map$1;
                Object obj = notificationMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationMapper$map$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xts0 xts0Var = cj60Var2.b;
                    notificationMapper$map$12.L$0 = cj60Var2;
                    notificationMapper$map$12.L$1 = null;
                    notificationMapper$map$12.label = 1;
                    obj = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.q(this.a, xts0Var, j6sVar, null, notificationMapper$map$12, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cj60Var2 = (cj60) notificationMapper$map$12.L$0;
                    kotlin.b.b(obj);
                }
                cqs0 cqs0Var = (cqs0) obj;
                String str = cj60Var2.d;
                fqs0 fqs0Var = cqs0Var.b;
                x2s x2sVar = new x2s(str, kotlin.collections.b.i(new Pair("error_title", fqs0Var.a), new Pair("error_text", fqs0Var.b)));
                cqs0 cqs0Var2 = new cqs0(cqs0Var.a, cqs0Var.b, cqs0Var.c, cqs0Var.d, cqs0Var.e, cqs0Var.f, cqs0Var.g, x2sVar, cqs0Var.i, cqs0Var.j, cqs0Var.k, cqs0Var.l, cqs0Var.m);
                String str2 = cj60Var2.c;
                return new sk60(cqs0Var2, str2 != null ? this.a.g.f(str2) : null, x2sVar, cj60Var2.a);
            }
        }
        notificationMapper$map$1 = new NotificationMapper$map$1(this, continuationImpl);
        NotificationMapper$map$1 notificationMapper$map$122 = notificationMapper$map$1;
        Object obj2 = notificationMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationMapper$map$122.label;
        if (i != 0) {
        }
        cqs0 cqs0Var3 = (cqs0) obj2;
        String str3 = cj60Var2.d;
        fqs0 fqs0Var2 = cqs0Var3.b;
        x2s x2sVar2 = new x2s(str3, kotlin.collections.b.i(new Pair("error_title", fqs0Var2.a), new Pair("error_text", fqs0Var2.b)));
        cqs0 cqs0Var22 = new cqs0(cqs0Var3.a, cqs0Var3.b, cqs0Var3.c, cqs0Var3.d, cqs0Var3.e, cqs0Var3.f, cqs0Var3.g, x2sVar2, cqs0Var3.i, cqs0Var3.j, cqs0Var3.k, cqs0Var3.l, cqs0Var3.m);
        String str22 = cj60Var2.c;
        return new sk60(cqs0Var22, str22 != null ? this.a.g.f(str22) : null, x2sVar2, cj60Var2.a);
    }
}
