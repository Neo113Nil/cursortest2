package ru.yandex.taxi.notifications;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.jst;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.z180;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.notifications.OrderNotificationImageRepository$requestImage$1$1", f = "OrderNotificationImageRepository.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderNotificationImageRepository$requestImage$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $tag;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderNotificationImageRepository$requestImage$1$1(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$tag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderNotificationImageRepository$requestImage$1$1(this.this$0, this.$tag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderNotificationImageRepository$requestImage$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar = this.this$0;
                map = gVar.h;
                String str2 = this.$tag;
                g16 b = gVar.a.b().b(((m7x0) this.this$0.b).a(this.$tag));
                this.L$0 = map;
                this.L$1 = str2;
                this.label = 1;
                obj = b.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$1;
                map = (Map) this.L$0;
                kotlin.b.b(obj);
            }
            map.put(str, new z180((Bitmap) obj));
            this.this$0.i.g(zy11Var);
            return zy11Var;
        } catch (Exception e) {
            this.this$0.g.getClass();
            xby.l(jst.e, "ExtendedNotification.Error", null, e, "error fetching image", 2);
            this.this$0.h.remove(this.$tag);
            if (e instanceof CancellationException) {
                throw e;
            }
            return zy11Var;
        }
    }
}
