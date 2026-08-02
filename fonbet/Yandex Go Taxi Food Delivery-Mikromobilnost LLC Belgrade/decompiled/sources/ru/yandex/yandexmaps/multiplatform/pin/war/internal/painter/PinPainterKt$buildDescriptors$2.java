package ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter;

import defpackage.c3c0;
import defpackage.fyb0;
import defpackage.kvb0;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zxb0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lzxb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.PinPainterKt$buildDescriptors$2", f = "PinPainter.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinPainterKt$buildDescriptors$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<kvb0> $covered;
    final /* synthetic */ boolean $isWarVisible;
    final /* synthetic */ List<qzb0> $selected;
    final /* synthetic */ List<mwb0> $visitedIds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPainterKt$buildDescriptors$2(List list, List list2, boolean z, List list3, Continuation continuation) {
        super(2, continuation);
        this.$selected = list;
        this.$covered = list2;
        this.$isWarVisible = z;
        this.$visitedIds = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinPainterKt$buildDescriptors$2(this.$selected, this.$covered, this.$isWarVisible, this.$visitedIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinPainterKt$buildDescriptors$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PinVisualState pinVisualState;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<qzb0> list2 = this.$selected;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qzb0) it.next()).a);
        }
        List<kvb0> list3 = this.$covered;
        boolean z = this.$isWarVisible;
        List<mwb0> list4 = this.$visitedIds;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        for (kvb0 kvb0Var : list3) {
            qzb0 qzb0Var = kvb0Var.a;
            PinState pinState = kvb0Var.b;
            c3c0 c3c0Var = kvb0Var.c;
            if (!z) {
                pinVisualState = PinVisualState.INVISIBLE;
            } else if (arrayList.contains(qzb0Var.a)) {
                pinVisualState = PinVisualState.SELECTED;
            } else {
                switch (fyb0.b[pinState.ordinal()]) {
                    case 1:
                        pinVisualState = PinVisualState.INVISIBLE;
                        break;
                    case 2:
                        pinVisualState = PinVisualState.DUST;
                        break;
                    case 3:
                        pinVisualState = PinVisualState.ICON;
                        break;
                    case 4:
                        pinVisualState = PinVisualState.CLUSTER;
                        break;
                    case 5:
                        pinVisualState = PinVisualState.SUPERCLUSTER;
                        break;
                    case 6:
                        pinVisualState = PinVisualState.ICON_LABEL_S;
                        break;
                    case 7:
                        pinVisualState = PinVisualState.ICON_LABEL_M;
                        break;
                    default:
                        w511.b();
                        return null;
                }
            }
            PinVisualState pinVisualState2 = pinVisualState;
            switch (fyb0.a[pinVisualState2.ordinal()]) {
                case 1:
                    list = EmptyList.a;
                    break;
                case 2:
                    list = Collections.singletonList(PlacemarkType.DUST);
                    break;
                case 3:
                    list = Collections.singletonList(PlacemarkType.ICON);
                    break;
                case 4:
                    list = Collections.singletonList(PlacemarkType.CLUSTER);
                    break;
                case 5:
                    list = Collections.singletonList(PlacemarkType.SUPERCLUSTER);
                    break;
                case 6:
                    list = scc.g(PlacemarkType.LABEL_S, PlacemarkType.ICON_OVERLAY);
                    break;
                case 7:
                    list = scc.g(PlacemarkType.LABEL_M, PlacemarkType.ICON_OVERLAY);
                    break;
                case 8:
                    list = Collections.singletonList(PlacemarkType.SELECTED);
                    break;
                default:
                    w511.b();
                    return null;
            }
            arrayList2.add(new zxb0(qzb0Var, pinVisualState2, list, c3c0Var, list4.contains(qzb0Var.a)));
        }
        return arrayList2;
    }
}
