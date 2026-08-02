package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import com.yandex.messenger.websdk.api.Authentication;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.ffx;
import defpackage.jm3;
import defpackage.mvg;
import defpackage.ni3;
import defpackage.ny61;
import defpackage.o220;
import defpackage.rk3;
import defpackage.vpr;
import defpackage.x501;
import defpackage.zk3;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.MessengerInteractor$special$$inlined$flatMapLatest$1", f = "MessengerInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class MessengerInteractor$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerInteractor$special$$inlined$flatMapLatest$1(Continuation continuation, i iVar) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MessengerInteractor$special$$inlined$flatMapLatest$1 messengerInteractor$special$$inlined$flatMapLatest$1 = new MessengerInteractor$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        messengerInteractor$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        messengerInteractor$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return messengerInteractor$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Authentication a;
        String str;
        Authentication a2;
        Authentication a3;
        ni3 ni3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            ChatRequest chatRequest = (ChatRequest) this.L$1;
            n0 c = ffx.c(1, 0, null, 6);
            Cancelable cancelable = this.this$0.d;
            if (cancelable != null) {
                cancelable.cancel();
            }
            i iVar = this.this$0;
            x501 x501Var = iVar.a;
            try {
                zk3 zk3Var = (zk3) iVar.c.h.a.getValue();
                rk3 rk3Var = zk3Var instanceof rk3 ? (rk3) zk3Var : null;
                str = (rk3Var == null || (ni3Var = rk3Var.a) == null) ? null : ni3Var.a;
            } catch (Exception unused) {
                WebMessenger webMessenger = x501Var.a;
                if (webMessenger != null && (a = webMessenger.a()) != null) {
                    ((jm3) a).b();
                }
            }
            if (str != null && str.length() != 0) {
                WebMessenger webMessenger2 = x501Var.a;
                if (webMessenger2 != null && (a3 = webMessenger2.a()) != null) {
                    ((jm3) a3).c(str);
                }
                i iVar2 = this.this$0;
                WebMessenger webMessenger3 = iVar2.a.a;
                iVar2.d = webMessenger3 == null ? webMessenger3.b(chatRequest, new o220(c, 0), new o220(c, 1)) : null;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(c, vprVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            WebMessenger webMessenger4 = x501Var.a;
            if (webMessenger4 != null && (a2 = webMessenger4.a()) != null) {
                ((jm3) a2).b();
            }
            i iVar22 = this.this$0;
            WebMessenger webMessenger32 = iVar22.a.a;
            iVar22.d = webMessenger32 == null ? webMessenger32.b(chatRequest, new o220(c, 0), new o220(c, 1)) : null;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(c, vprVar, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
