package ru.yandex.logistics.cargo_form.async.impl.interactor;

import defpackage.b3s;
import defpackage.bpc;
import defpackage.dpc;
import defpackage.fpc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wa3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.cargo_form.async.impl.interactor.FormAsyncInteractorImpl$launchAsyncProcess$1", f = "FormAsyncInteractorImpl.kt", l = {49, 56, 61, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class FormAsyncInteractorImpl$launchAsyncProcess$1 extends SuspendLambda implements wls {
    final /* synthetic */ wa3 $params;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormAsyncInteractorImpl$launchAsyncProcess$1(wa3 wa3Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$params = wa3Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormAsyncInteractorImpl$launchAsyncProcess$1(this.$params, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormAsyncInteractorImpl$launchAsyncProcess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (r11.a(r5, r6, r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r11 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fpc fpcVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            wa3 wa3Var = this.$params;
            Object obj2 = wa3Var.c;
            if (obj2 != null) {
                this.this$0.c.a(wa3Var.a, new b3s(obj2));
            }
            ru.yandex.logistics.cargo_form.async.impl.data.a aVar = this.this$0.a;
            wa3 wa3Var2 = this.$params;
            String str = wa3Var2.a;
            Object obj3 = wa3Var2.b;
            Object obj4 = wa3Var2.d;
            this.label = 1;
            obj = aVar.b(str, obj3, obj4, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        fpcVar = (fpc) this.L$0;
                        kotlin.b.b(obj);
                        b bVar = this.this$0;
                        String str2 = this.$params.a;
                        Object obj5 = ((dpc) fpcVar).a;
                        this.L$0 = null;
                        this.label = 4;
                        Object collect = bVar.b.a(obj5).collect(new a(bVar, str2), this);
                        if (collect != coroutineSingletons) {
                            collect = zy11Var;
                        }
                        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        fpcVar = (fpc) obj;
        if (fpcVar instanceof bpc) {
            b bVar2 = this.this$0;
            String str3 = this.$params.a;
            this.L$0 = null;
            this.label = 2;
            bVar2.c.b(str3);
            Object e = com.yandex.delivery.utils.dialogmanager.a.e(bVar2.d, (bpc) fpcVar, this);
            if (e != coroutineSingletons) {
                e = zy11Var;
            }
            if (e == coroutineSingletons) {
            }
        } else {
            if (!(fpcVar instanceof dpc)) {
                w511.b();
                return null;
            }
            ru.yandex.logistics.cargo_form.async.impl.storage.b bVar3 = this.this$0.f;
            String str4 = this.$params.a;
            Object obj6 = ((dpc) fpcVar).a;
            this.L$0 = fpcVar;
            this.label = 3;
        }
    }
}
