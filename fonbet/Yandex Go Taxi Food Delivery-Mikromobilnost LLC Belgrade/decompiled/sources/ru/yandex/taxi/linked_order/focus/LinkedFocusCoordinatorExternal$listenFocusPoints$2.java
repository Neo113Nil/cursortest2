package ru.yandex.taxi.linked_order.focus;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.zls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Lcom/yandex/mapkit/geometry/Point;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.focus.LinkedFocusCoordinatorExternal$listenFocusPoints$2", f = "LinkedFocusCoordinatorExternal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedFocusCoordinatorExternal$listenFocusPoints$2 extends SuspendLambda implements zls {
    final /* synthetic */ String $orderKey;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedFocusCoordinatorExternal$listenFocusPoints$2(a aVar, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$orderKey = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinkedFocusCoordinatorExternal$listenFocusPoints$2 linkedFocusCoordinatorExternal$listenFocusPoints$2 = new LinkedFocusCoordinatorExternal$listenFocusPoints$2(this.this$0, this.$orderKey, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        linkedFocusCoordinatorExternal$listenFocusPoints$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        String str = this.$orderKey;
        HashMap hashMap = aVar.c;
        hashMap.remove(str);
        n0 n0Var = aVar.d;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        if (hashMap.isEmpty()) {
            pzt0 pzt0Var = aVar.e;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            aVar.e = null;
        }
        return zy11Var;
    }
}
