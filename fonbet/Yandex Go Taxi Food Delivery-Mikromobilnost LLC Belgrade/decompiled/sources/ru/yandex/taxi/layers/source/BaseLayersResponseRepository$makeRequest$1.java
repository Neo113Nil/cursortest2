package ru.yandex.taxi.layers.source;

import defpackage.azx;
import defpackage.bzx;
import defpackage.g8e;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbzx;", "T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.BaseLayersResponseRepository$makeRequest$1", f = "BaseLayersResponseRepository.kt", l = {41, 49, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BaseLayersResponseRepository$makeRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ azx $params;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLayersResponseRepository$makeRequest$1(c cVar, azx azxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$params = azxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseLayersResponseRepository$makeRequest$1 baseLayersResponseRepository$makeRequest$1 = new BaseLayersResponseRepository$makeRequest$1(this.this$0, this.$params, continuation);
        baseLayersResponseRepository$makeRequest$1.L$0 = obj;
        return baseLayersResponseRepository$makeRequest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseLayersResponseRepository$makeRequest$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r11) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r0.emit(r2, r11) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r12 != null) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00c1 -> B:16:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bzx bzxVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                bzx bzxVar2 = (bzx) obj;
                boolean z = (bzxVar2.getA() == null || bzxVar2.getE() == null || bzxVar2.getB() == null || bzxVar2.getC() == null || bzxVar2.getD() == null) ? false : true;
                if (!z) {
                    g8e.A(jst.e, "Some required fields of LayersResponse are null");
                }
                if (!z) {
                    obj = null;
                }
                bzxVar = (bzx) obj;
                if (bzxVar != null) {
                    this.L$0 = vprVar;
                    this.L$1 = bzxVar;
                    this.label = 2;
                }
                return zy11.a;
            }
            if (i == 2) {
                bzxVar = (bzx) this.L$1;
                kotlin.b.b(obj);
                this.this$0.d(bzxVar, this.$params.a());
                Long g = bzxVar.getG();
                if (g == null) {
                    c cVar = this.this$0;
                    Long d = bzxVar.getD();
                    cVar.getClass();
                    g = d == null ? null : Long.valueOf(d.longValue() * 1000);
                }
                long longValue = g.longValue();
                this.L$0 = vprVar;
                this.L$1 = null;
                this.J$0 = longValue;
                this.label = 3;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        kotlin.b.b(obj);
        c cVar2 = this.this$0;
        azx azxVar = this.$params;
        this.L$0 = vprVar;
        this.L$1 = null;
        this.label = 1;
        obj = cVar2.c(azxVar, this);
    }
}
