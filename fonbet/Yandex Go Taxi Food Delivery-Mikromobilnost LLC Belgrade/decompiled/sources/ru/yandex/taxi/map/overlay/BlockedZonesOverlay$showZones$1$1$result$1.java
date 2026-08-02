package ru.yandex.taxi.map.overlay;

import defpackage.d56;
import defpackage.j63;
import defpackage.jst;
import defpackage.mvg;
import defpackage.n56;
import defpackage.ny61;
import defpackage.o56;
import defpackage.r53;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln56;", "<anonymous>", "(Ltse;)Ln56;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.BlockedZonesOverlay$showZones$1$1$result$1", f = "BlockedZonesOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BlockedZonesOverlay$showZones$1$1$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<d56> $models;
    final /* synthetic */ Set<d56> $shownZones;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedZonesOverlay$showZones$1$1$result$1(b bVar, Set set, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$shownZones = set;
        this.$models = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockedZonesOverlay$showZones$1$1$result$1(this.this$0, this.$shownZones, this.$models, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockedZonesOverlay$showZones$1$1$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        Set<d56> set = this.$shownZones;
        List<d56> list = this.$models;
        bVar.getClass();
        j63 j63Var = new j63(0);
        kotlin.collections.a.N(list, j63Var);
        Set<d56> set2 = set;
        j63Var.removeAll(set2);
        j63 j63Var2 = new j63(set2);
        j63Var2.removeAll(list);
        ArrayList arrayList = new ArrayList();
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            d56 d56Var = (d56) r53Var.next();
            try {
                o56 Lg = b.Lg(d56Var);
                if (Lg != null) {
                    arrayList.add(Lg);
                }
            } catch (Exception e) {
                jst.e.k(e, String.format("Failed to draw polygon from zone [%s]", Arrays.copyOf(new Object[]{d56Var.f}, 1)));
            }
        }
        return new n56(j63Var2, arrayList);
    }
}
