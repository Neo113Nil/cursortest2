package ru.yandex.logistics.cargo_form.async.impl.polling;

import defpackage.bpc;
import defpackage.dpc;
import defpackage.f3s;
import defpackage.fo2;
import defpackage.fpc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lh3s;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.cargo_form.async.impl.polling.FormStatusPollingInteractor$statusFlow$1", f = "FormStatusPollingInteractorImpl.kt", l = {27, 30, 31, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class FormStatusPollingInteractor$statusFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $taskParams;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormStatusPollingInteractor$statusFlow$1(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$taskParams = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormStatusPollingInteractor$statusFlow$1 formStatusPollingInteractor$statusFlow$1 = new FormStatusPollingInteractor$statusFlow$1(this.this$0, this.$taskParams, continuation);
        formStatusPollingInteractor$statusFlow$1.L$0 = obj;
        return formStatusPollingInteractor$statusFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormStatusPollingInteractor$statusFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (kotlinx.coroutines.a.i(r8, r10) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a6 -> B:19:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fpc fpcVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                fpcVar = (fpc) obj;
                if (fpcVar instanceof dpc) {
                    Object obj2 = ((dpc) fpcVar).a;
                    this.L$0 = vprVar;
                    this.L$1 = fpcVar;
                    this.label = 2;
                } else {
                    if (!(fpcVar instanceof bpc)) {
                        w511.b();
                        return null;
                    }
                    f3s f3sVar = new f3s((bpc) fpcVar);
                    this.L$0 = vprVar;
                    this.L$1 = fpcVar;
                    this.label = 3;
                }
                if (kotlinx.coroutines.a.p(get_context())) {
                    return zy11.a;
                }
                ru.yandex.logistics.cargo_form.async.impl.data.b bVar = this.this$0.b;
                Object obj3 = this.$taskParams;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = bVar.b(obj3, this);
            } else if (i == 2 || i == 3) {
                fpcVar = (fpc) this.L$1;
                kotlin.b.b(obj);
                fo2 extras = fpcVar.getExtras();
                Long l = extras != null ? extras.a : null;
                long longValue = l != null ? l.longValue() : 60000L;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            } else {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        kotlin.b.b(obj);
        if (kotlinx.coroutines.a.p(get_context())) {
        }
    }
}
