package ru.yandex.taxi.banners;

import android.view.ViewGroup;
import defpackage.iux0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yes0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$loadBanner$4", f = "BannersController.kt", l = {524}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BannersController$loadBanner$4 extends SuspendLambda implements wls {
    final /* synthetic */ String $bannerId;
    final /* synthetic */ Runnable $onDismissAction;
    final /* synthetic */ Consumer<Throwable> $onErrorAction;
    final /* synthetic */ Consumer<Promotion> $onSuccessAction;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$loadBanner$4(c cVar, String str, Consumer consumer, Runnable runnable, Consumer consumer2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$bannerId = str;
        this.$onSuccessAction = consumer;
        this.$onDismissAction = runnable;
        this.$onErrorAction = consumer2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$loadBanner$4(this.this$0, this.$bannerId, this.$onSuccessAction, this.$onDismissAction, this.$onErrorAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$loadBanner$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Consumer<Promotion> consumer;
        Runnable runnable;
        String str;
        Consumer<Throwable> consumer2;
        Object obj2;
        c cVar2;
        SimpleSpinnerModalView a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                String str2 = this.$bannerId;
                consumer = this.$onSuccessAction;
                runnable = this.$onDismissAction;
                Consumer<Throwable> consumer3 = this.$onErrorAction;
                try {
                    h hVar = cVar.b;
                    this.L$0 = cVar;
                    this.L$1 = consumer;
                    this.L$2 = cVar;
                    this.L$3 = str2;
                    this.L$4 = runnable;
                    this.L$5 = consumer3;
                    this.label = 1;
                    Object d = hVar.d(str2, this);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = d;
                    cVar2 = cVar;
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    consumer2 = consumer3;
                    iux0 iux0Var = (iux0) cVar.h;
                    iux0Var.getClass();
                    iux0Var.c("Error getting banner with id", th, "Error getting banner with id " + str, "CRITICAL");
                    yes0 yes0Var = SimpleSpinnerModalView.Companion;
                    ViewGroup viewGroup = cVar.a.a;
                    yes0Var.getClass();
                    a = yes0.a(viewGroup);
                    if (a != null) {
                        a.dismiss(runnable);
                    }
                    if (consumer2 != null) {
                        consumer2.accept(th);
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                consumer2 = (Consumer) this.L$5;
                runnable = (Runnable) this.L$4;
                str = (String) this.L$3;
                cVar = (c) this.L$2;
                consumer = (Consumer) this.L$1;
                cVar2 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                    obj2 = ((Result) obj).getValue();
                } catch (Throwable th2) {
                    th = th2;
                    iux0 iux0Var2 = (iux0) cVar.h;
                    iux0Var2.getClass();
                    iux0Var2.c("Error getting banner with id", th, "Error getting banner with id " + str, "CRITICAL");
                    yes0 yes0Var2 = SimpleSpinnerModalView.Companion;
                    ViewGroup viewGroup2 = cVar.a.a;
                    yes0Var2.getClass();
                    a = yes0.a(viewGroup2);
                    if (a != null) {
                    }
                    if (consumer2 != null) {
                    }
                    return zy11.a;
                }
            }
            Throwable a2 = Result.a(obj2);
            if (a2 != null) {
                throw a2;
            }
            Promotion promotion = (Promotion) obj2;
            cVar2.getClass();
            yes0 yes0Var3 = SimpleSpinnerModalView.Companion;
            ViewGroup viewGroup3 = cVar2.a.a;
            yes0Var3.getClass();
            yes0.b(viewGroup3);
            if (consumer != null) {
                consumer.accept(promotion);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
