package ru.yandex.taxi.logistics.sdk.concurrency;

import defpackage.jq6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.concurrency.Actor$1", f = "Actor.kt", l = {22, 23, 24, 25}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class Actor$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Actor$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Actor$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Actor$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r9.a(r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r9.b(r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r2 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (r9 != r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008c -> B:8:0x0058). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq6 jq6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
            bVar.getClass();
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            jq6Var = (jq6) this.L$0;
            kotlin.b.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                return zy11Var;
            }
            a aVar = (a) jq6Var.b();
            this.L$0 = jq6Var;
            this.L$1 = null;
            this.label = 3;
        } else if (i == 3) {
            jq6Var = (jq6) this.L$0;
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            this.L$0 = jq6Var;
            this.L$1 = null;
            this.label = 4;
        } else {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jq6Var = (jq6) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = jq6Var;
            this.L$1 = null;
            this.label = 2;
            obj = jq6Var.a(this);
        }
        kotlinx.coroutines.channels.a aVar2 = this.this$0.b;
        aVar2.getClass();
        jq6Var = new jq6(aVar2);
        this.L$0 = jq6Var;
        this.L$1 = null;
        this.label = 2;
        obj = jq6Var.a(this);
    }
}
