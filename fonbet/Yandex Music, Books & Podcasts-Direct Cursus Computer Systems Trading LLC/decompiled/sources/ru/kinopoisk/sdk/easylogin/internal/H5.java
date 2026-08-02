package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.discovery.provider.SSDPDiscoveryProvider;
import com.connectsdk.service.WebOSTVService;
import defpackage.aur;
import defpackage.ltm;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.uif;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y7g;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.G5;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastExplorer$discover$1", f = "LgCastExplorer.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class H5 extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
    public G5.a a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ G5 d;

    public static final class a extends uif implements Function0<Unit> {
        public final /* synthetic */ G5 a;
        public final /* synthetic */ G5.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G5 g5, G5.a aVar) {
            super(0);
            this.a = g5;
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            N5 n5 = this.a.a;
            G5.a aVar = this.b;
            try {
                r7o r7oVar = z7o.b;
                n5.getClass();
                aVar.getClass();
                ((DiscoveryManager) n5.b.getValue()).removeListener(aVar);
                ((DiscoveryManager) n5.b.getValue()).stop();
            } catch (Throwable unused) {
                r7o r7oVar2 = z7o.b;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5(G5 g5, Continuation<? super H5> continuation) {
        super(2, continuation);
        this.d = g5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        H5 h5 = new H5(this.d, continuation);
        h5.c = obj;
        return h5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        H5 h5 = new H5(this.d, (Continuation) obj2);
        h5.c = (ltm) obj;
        return h5.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ltm] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ltm] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        G5.a aVar;
        Throwable th;
        nm6 nm6Var = nm6.a;
        int i = this.b;
        if (i == 0) {
            qgg.h0(obj);
            r1 = (ltm) this.c;
            G5.a aVar2 = new G5.a(r1);
            try {
                N5 n5 = this.d.a;
                n5.getClass();
                ((DiscoveryManager) n5.b.getValue()).addListener(aVar2);
                DiscoveryManager discoveryManager = (DiscoveryManager) n5.b.getValue();
                discoveryManager.setPairingLevel(DiscoveryManager.PairingLevel.OFF);
                discoveryManager.registerDeviceService(WebOSTVService.class, SSDPDiscoveryProvider.class);
                discoveryManager.setServiceIntegration(true);
                discoveryManager.start();
                a aVar3 = new a(this.d, aVar2);
                this.c = r1;
                this.a = aVar2;
                this.b = 1;
                if (y7g.q(r1, aVar3, this) == nm6Var) {
                    return nm6Var;
                }
            } catch (Throwable th2) {
                aVar = aVar2;
                th = th2;
                N5 n52 = this.d.a;
                n52.getClass();
                aVar.getClass();
                ((DiscoveryManager) n52.b.getValue()).removeListener(aVar);
                ((oc4) r1).p0(th);
                return Unit.a;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.a;
            r1 = (ltm) this.c;
            try {
                qgg.h0(obj);
            } catch (Throwable th3) {
                th = th3;
                N5 n522 = this.d.a;
                n522.getClass();
                aVar.getClass();
                ((DiscoveryManager) n522.b.getValue()).removeListener(aVar);
                ((oc4) r1).p0(th);
                return Unit.a;
            }
        }
        return Unit.a;
    }
}
