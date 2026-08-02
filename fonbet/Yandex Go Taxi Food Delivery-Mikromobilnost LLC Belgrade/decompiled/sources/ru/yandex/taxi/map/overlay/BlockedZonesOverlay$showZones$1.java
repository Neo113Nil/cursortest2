package ru.yandex.taxi.map.overlay;

import defpackage.d56;
import defpackage.g050;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.BlockedZonesOverlay$showZones$1", f = "BlockedZonesOverlay.kt", l = {222, 62, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BlockedZonesOverlay$showZones$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<d56> $models;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedZonesOverlay$showZones$1(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$models = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockedZonesOverlay$showZones$1(this.this$0, this.$models, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockedZonesOverlay$showZones$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (ru.yandex.taxi.map.overlay.b.Ig(r3, (defpackage.n56) r9, r8) != r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        g050 g050Var;
        b bVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            th = th;
            bVar = r1;
        }
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                bVar2 = this.this$0;
                kotlinx.coroutines.sync.a aVar = bVar2.A;
                this.L$0 = aVar;
                this.L$1 = bVar2;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    g050Var = aVar;
                }
                return coroutineSingletons;
            }
            if (r1 == 1) {
                bVar2 = (b) this.L$1;
                g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (r1 != 2) {
                    if (r1 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) this.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        jst.e.k(th, "Failed to update blocked zones");
                        bVar.Kg();
                        return zy11.a;
                    }
                    return zy11.a;
                }
                b bVar4 = (b) this.L$2;
                bVar3 = (b) this.L$1;
                kotlin.b.b(obj);
                r1 = bVar4;
                this.L$0 = null;
                this.L$1 = r1;
                this.L$2 = null;
                this.label = 3;
            }
            Set M0 = kotlin.collections.a.M0(bVar2.y.keySet());
            g050Var.d(null);
            b bVar5 = this.this$0;
            List<d56> list = this.$models;
            bVar5.w.getClass();
            sjh sjhVar = uyj.a;
            BlockedZonesOverlay$showZones$1$1$result$1 blockedZonesOverlay$showZones$1$1$result$1 = new BlockedZonesOverlay$showZones$1$1$result$1(bVar5, M0, list, null);
            this.L$0 = null;
            this.L$1 = bVar5;
            this.L$2 = bVar5;
            this.label = 2;
            obj = tje.k0(sjhVar, blockedZonesOverlay$showZones$1$1$result$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar3 = bVar5;
            r1 = bVar5;
            this.L$0 = null;
            this.L$1 = r1;
            this.L$2 = null;
            this.label = 3;
        } catch (Throwable th3) {
            g050Var.d(null);
            throw th3;
        }
    }
}
