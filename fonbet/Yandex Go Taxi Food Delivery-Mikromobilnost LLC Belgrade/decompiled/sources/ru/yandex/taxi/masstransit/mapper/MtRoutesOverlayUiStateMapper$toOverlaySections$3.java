package ru.yandex.taxi.masstransit.mapper;

import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bl00;
import defpackage.bt11;
import defpackage.fj40;
import defpackage.gdc;
import defpackage.hj40;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qm30;
import defpackage.tcc;
import defpackage.tm30;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfj40;", "section", "", "Ltm30;", "<anonymous>", "(Lfj40;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.mapper.MtRoutesOverlayUiStateMapper$toOverlaySections$3", f = "MtRoutesOverlayUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesOverlayUiStateMapper$toOverlaySections$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesOverlayUiStateMapper$toOverlaySections$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtRoutesOverlayUiStateMapper$toOverlaySections$3 mtRoutesOverlayUiStateMapper$toOverlaySections$3 = new MtRoutesOverlayUiStateMapper$toOverlaySections$3(this.this$0, continuation);
        mtRoutesOverlayUiStateMapper$toOverlaySections$3.L$0 = obj;
        return mtRoutesOverlayUiStateMapper$toOverlaySections$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesOverlayUiStateMapper$toOverlaySections$3) create((fj40) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fj40 fj40Var = (fj40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        eVar.getClass();
        if (fj40Var.e().size() < 3) {
            return EmptyList.a;
        }
        List subList = fj40Var.e().subList(1, fj40Var.e().size() - 1);
        ArrayList arrayList = new ArrayList(tcc.n(subList, 10));
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(new tm30(((hj40) it.next()).d, new bl00(ImageProvider.fromBitmap(bt11.a(eVar.a, new gdc(mqg0.white))), new IconStyle()), qm30.a));
        }
        return arrayList;
    }
}
