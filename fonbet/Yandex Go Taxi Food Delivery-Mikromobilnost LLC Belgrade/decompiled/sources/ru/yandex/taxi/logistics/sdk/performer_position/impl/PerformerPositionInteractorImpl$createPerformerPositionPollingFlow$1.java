package ru.yandex.taxi.logistics.sdk.performer_position.impl;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cpc;
import defpackage.d6w;
import defpackage.dpc;
import defpackage.epc;
import defpackage.fo2;
import defpackage.fpc;
import defpackage.ixa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lixa0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.performer_position.impl.PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1", f = "PerformerPositionInteractorImpl.kt", l = {58, 61, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 71, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryRef;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deliveryRef = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1 performerPositionInteractorImpl$createPerformerPositionPollingFlow$1 = new PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1(this.this$0, this.$deliveryRef, continuation);
        performerPositionInteractorImpl$createPerformerPositionPollingFlow$1.L$0 = obj;
        return performerPositionInteractorImpl$createPerformerPositionPollingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        if (r0.emit(null, r13) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0056, code lost:
    
        if (r0.emit(null, r13) == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010f -> B:9:0x005b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ixa0 ixa0Var;
        ixa0 ixa0Var2;
        fpc fpcVar;
        fo2 extras;
        long j;
        Long l;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                } else if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixa0 ixa0Var3 = (ixa0) this.L$1;
                    b.b(obj);
                    ixa0Var = ixa0Var3;
                    if (!kotlinx.coroutines.a.p(get_context())) {
                        a aVar = this.this$0;
                        String str = this.$deliveryRef;
                        this.L$0 = vprVar;
                        this.L$1 = ixa0Var;
                        this.L$2 = null;
                        this.label = 2;
                        Object a = a.a(aVar, str, this);
                        if (a != coroutineSingletons) {
                            ixa0Var2 = ixa0Var;
                            obj = a;
                            fpcVar = (fpc) obj;
                            if (fpcVar instanceof dpc) {
                                ixa0 ixa0Var4 = (ixa0) ((dpc) fpcVar).a;
                                a aVar2 = this.this$0;
                                d6w d6wVar = a.f;
                                aVar2.getClass();
                                if (ixa0Var2 == null || ixa0Var2.g <= ixa0Var4.g) {
                                    this.L$0 = vprVar;
                                    this.L$1 = ixa0Var4;
                                    this.L$2 = fpcVar;
                                    this.L$3 = null;
                                    this.label = 3;
                                    if (vprVar.emit(ixa0Var4, this) != coroutineSingletons) {
                                        ixa0Var2 = ixa0Var4;
                                    }
                                }
                                a aVar3 = this.this$0;
                                d6w d6wVar2 = a.f;
                                aVar3.getClass();
                                extras = fpcVar.getExtras();
                                if (extras != null) {
                                    if (l.longValue() <= 0) {
                                    }
                                    if (l != null) {
                                    }
                                }
                                j = 60000;
                                this.L$0 = vprVar;
                                this.L$1 = ixa0Var2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                                }
                            } else {
                                if (fpcVar instanceof cpc) {
                                    d6w d6wVar3 = a.f;
                                    Integer num = ((cpc) fpcVar).b;
                                    if (num != null && d6wVar3.g(num.intValue())) {
                                        this.L$0 = vprVar;
                                        this.L$1 = ixa0Var2;
                                        this.L$2 = fpcVar;
                                        this.label = 4;
                                    }
                                } else if (!(fpcVar instanceof epc)) {
                                    w511.b();
                                    return null;
                                }
                                a aVar32 = this.this$0;
                                d6w d6wVar22 = a.f;
                                aVar32.getClass();
                                extras = fpcVar.getExtras();
                                if (extras != null && (l = extras.a) != null) {
                                    if (l.longValue() <= 0) {
                                        l = null;
                                    }
                                    if (l != null) {
                                        j = l.longValue();
                                        this.L$0 = vprVar;
                                        this.L$1 = ixa0Var2;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 5;
                                        if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                                            ixa0Var = ixa0Var2;
                                        }
                                    }
                                }
                                j = 60000;
                                this.L$0 = vprVar;
                                this.L$1 = ixa0Var2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                                }
                            }
                            if (!kotlinx.coroutines.a.p(get_context())) {
                                return zy11.a;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                fpcVar = (fpc) this.L$2;
                ixa0Var2 = (ixa0) this.L$1;
                b.b(obj);
                a aVar322 = this.this$0;
                d6w d6wVar222 = a.f;
                aVar322.getClass();
                extras = fpcVar.getExtras();
                if (extras != null) {
                }
                j = 60000;
                this.L$0 = vprVar;
                this.L$1 = ixa0Var2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            ixa0 ixa0Var5 = (ixa0) this.L$1;
            b.b(obj);
            ixa0Var2 = ixa0Var5;
            fpcVar = (fpc) obj;
            if (fpcVar instanceof dpc) {
            }
            if (!kotlinx.coroutines.a.p(get_context())) {
            }
        }
        ixa0Var = null;
        if (!kotlinx.coroutines.a.p(get_context())) {
        }
    }
}
