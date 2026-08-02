package ru.yandex.taxi.failure_notificator;

import defpackage.b9p;
import defpackage.bl60;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rs50;
import defpackage.ss50;
import defpackage.ts50;
import defpackage.tse;
import defpackage.us50;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.failure_notificator.FailureNotificatorRepository$scheduleHideNotificator$1", f = "FailureNotificatorRepository.kt", l = {227, 229, 266}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FailureNotificatorRepository$scheduleHideNotificator$1 extends SuspendLambda implements wls {
    final /* synthetic */ us50 $networkEvent;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailureNotificatorRepository$scheduleHideNotificator$1(b bVar, us50 us50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$networkEvent = us50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FailureNotificatorRepository$scheduleHideNotificator$1(this.this$0, this.$networkEvent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FailureNotificatorRepository$scheduleHideNotificator$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0037, code lost:
    
        if (r11 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        g050 g050Var;
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            this.label = 1;
            obj = bVar2.d(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    j2 = this.J$0;
                    kotlin.b.b(obj);
                    j = j2;
                    b bVar3 = this.this$0;
                    g050Var = bVar3.H;
                    this.L$0 = g050Var;
                    this.L$1 = bVar3;
                    this.J$0 = j;
                    this.label = 3;
                    if (g050Var.a(this) != coroutineSingletons) {
                        bVar = bVar3;
                        bVar.G.clear();
                        g050Var.d(null);
                        this.this$0.C = new ts50(0);
                        if (this.this$0.f()) {
                        }
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$1;
                g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
                try {
                    bVar.G.clear();
                    g050Var.d(null);
                    this.this$0.C = new ts50(0);
                    if (this.this$0.f()) {
                        pzt0 pzt0Var = this.this$0.E;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        r0 r0Var = this.this$0.y;
                        bl60 bl60Var = new bl60(14);
                        r0Var.getClass();
                        r0Var.m(null, bl60Var);
                    }
                    return zy11.a;
                } catch (Throwable th) {
                    g050Var.d(null);
                    throw th;
                }
            }
            kotlin.b.b(obj);
        }
        b9p b9pVar = (b9p) obj;
        us50 us50Var = this.$networkEvent;
        if (us50Var instanceof ts50) {
            j = b9pVar.i;
        } else if (us50Var instanceof rs50) {
            j = b9pVar.h;
        } else {
            if (!(us50Var instanceof ss50)) {
                b9pVar.getClass();
                w511.b();
                return null;
            }
            j = b9pVar.g;
        }
        if (j > 0) {
            this.J$0 = j;
            this.label = 2;
            if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                j2 = j;
                j = j2;
            }
            return coroutineSingletons;
        }
        b bVar32 = this.this$0;
        g050Var = bVar32.H;
        this.L$0 = g050Var;
        this.L$1 = bVar32;
        this.J$0 = j;
        this.label = 3;
        if (g050Var.a(this) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
