package ru.yandex.logistics.sdk.webview.impl.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dj3;
import defpackage.hdu;
import defpackage.mvg;
import defpackage.ni3;
import defpackage.ny61;
import defpackage.ofg;
import defpackage.rk3;
import defpackage.rl41;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zk3;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lrl41;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.webview.impl.ui.DeliveryWebViewViewModel$createConfig$args$1", f = "DeliveryWebViewViewModel.kt", l = {65, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryWebViewViewModel$createConfig$args$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWebViewViewModel$createConfig$args$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryWebViewViewModel$createConfig$args$1 deliveryWebViewViewModel$createConfig$args$1 = new DeliveryWebViewViewModel$createConfig$args$1(this.this$0, continuation);
        deliveryWebViewViewModel$createConfig$args$1.L$0 = obj;
        return deliveryWebViewViewModel$createConfig$args$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryWebViewViewModel$createConfig$args$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r10 == r1) goto L24;
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
            b bVar = this.this$0;
            String str = bVar.b.a;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = b.W(bVar, str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        String str2 = (String) obj;
        hdu hduVar = this.this$0.y;
        zk3 zk3Var = (zk3) ((com.yandex.delivery.utils.auth.impl.a) ((dj3) hduVar.a).a.get()).h.a.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (zk3Var instanceof rk3) {
            ni3 ni3Var = ((rk3) zk3Var).a;
            linkedHashMap.put("Authorization", "Bearer ".concat(ni3Var.a));
            String str3 = ni3Var.b;
            if (str3 != null) {
                linkedHashMap.put("X-YaTaxi-UserId", str3);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sec-ch-prefers-color-scheme", ((ofg) hduVar.b).b() ? "dark" : "light");
        rl41 rl41Var = new rl41(str2, linkedHashMap2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
