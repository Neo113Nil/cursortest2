package ru.yandex.taxi.statebar.router;

import defpackage.b9p;
import defpackage.c9p;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.statebar.router.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.statebar.router.ServerErrorDialogRouterImpl$onLaunch$1", f = "ServerErrorDialogRouterImpl.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ServerErrorDialogRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerErrorDialogRouterImpl$onLaunch$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServerErrorDialogRouterImpl$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerErrorDialogRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            b.b(obj);
            c9p c9pVar = this.this$0.E;
            this.label = 1;
            obj = c9pVar.a.b(this);
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
        boolean z = ((b9p) obj).b;
        final a aVar = this.this$0;
        if (z) {
            final int i3 = 0;
            aVar.F = aVar.D.a().setMessage(kyh0.common_server_error).setPositiveButton(kyh0.dialog_common_ok, new Runnable() { // from class: ptq0
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    a aVar2 = aVar;
                    switch (i4) {
                        case 0:
                            aVar2.r(new qu(9));
                            break;
                        default:
                            aVar2.r(new qu(9));
                            break;
                    }
                }
            }).setDismissListener(new Runnable() { // from class: ptq0
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i2;
                    a aVar2 = aVar;
                    switch (i4) {
                        case 0:
                            aVar2.r(new qu(9));
                            break;
                        default:
                            aVar2.r(new qu(9));
                            break;
                    }
                }
            }).show();
        } else {
            aVar.r(new qu(9));
        }
        return zy11.a;
    }
}
