package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.Y6;
import com.plaid.internal.link.LinkActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.link.LinkActivity$openOutOfProcessWebview$1", f = "LinkActivity.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class G1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LinkActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(LinkActivity linkActivity, Continuation<? super G1> continuation) {
        super(2, continuation);
        this.b = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new G1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new G1(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0345z4 a = LinkActivity.a(this.b);
            this.a = 1;
            obj = a.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null) {
            Y6.a.a("No uri available in pane storage for Out Of Process WebView");
            LinkActivity.a(this.b).a();
            return Unit.INSTANCE;
        }
        C0095a6.a.a(C0095a6.a, "Opening Custom Tab for ".concat(str));
        this.b.a(str);
        LinkActivity.a(this.b).c();
        LinkActivity.c(this.b);
        return Unit.INSTANCE;
    }
}
