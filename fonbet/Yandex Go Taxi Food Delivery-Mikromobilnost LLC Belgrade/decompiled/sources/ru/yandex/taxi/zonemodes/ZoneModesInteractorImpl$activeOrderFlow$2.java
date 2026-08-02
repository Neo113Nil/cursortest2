package ru.yandex.taxi.zonemodes;

import defpackage.mvg;
import defpackage.n20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lo2y0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesInteractorImpl$activeOrderFlow$2", f = "ZoneModesInteractorImpl.kt", l = {HProv.PP_INFO, HProv.PP_INFO, 119, 119, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ZoneModesInteractorImpl$activeOrderFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesInteractorImpl$activeOrderFlow$2(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoneModesInteractorImpl$activeOrderFlow$2 zoneModesInteractorImpl$activeOrderFlow$2 = new ZoneModesInteractorImpl$activeOrderFlow$2(this.this$0, continuation);
        zoneModesInteractorImpl$activeOrderFlow$2.L$0 = obj;
        return zoneModesInteractorImpl$activeOrderFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneModesInteractorImpl$activeOrderFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (r0.emit(null, r9) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r10 == r1) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n20 n20Var = this.this$0.e;
            this.L$0 = vprVar;
            this.label = 1;
            com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) n20Var;
            obj = ((Boolean) aVar.f.b.a.getValue()).booleanValue() ? aVar.q(this) : Boolean.FALSE;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                n20 n20Var2 = this.this$0.e;
                this.L$0 = null;
                this.L$1 = vprVar;
                this.label = 3;
                obj = ((com.yandex.go.taxi.order.provider.a) n20Var2).t(this);
            }
            this.L$0 = null;
            this.label = 5;
        } else {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
        if (!((Boolean) obj).booleanValue()) {
            n20 n20Var3 = this.this$0.e;
            this.L$0 = vprVar;
            this.label = 2;
            obj = ((com.yandex.go.taxi.order.provider.a) n20Var3).q(this);
        }
        this.L$0 = null;
        this.label = 5;
    }
}
