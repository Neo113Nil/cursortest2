package ru.yandex.taxi.masstransit.stoproute.ui;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bms;
import defpackage.diu0;
import defpackage.fiu0;
import defpackage.giu0;
import defpackage.mvg;
import defpackage.n340;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v3l0;
import defpackage.w511;
import defpackage.x3l0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lx3l0;", "routeInfo", "", "", "Lru/yandex/taxi/masstransit/model/VariantStyle;", "styles", "", "expandedItems", "Lgiu0;", "<anonymous>", "(Lx3l0;Ljava/util/Map;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.ui.MtStopRouteUiStateInteractor$initializeData$6", f = "MtStopRouteUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteUiStateInteractor$initializeData$6 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteUiStateInteractor$initializeData$6(g gVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MtStopRouteUiStateInteractor$initializeData$6 mtStopRouteUiStateInteractor$initializeData$6 = new MtStopRouteUiStateInteractor$initializeData$6(this.this$0, (Continuation) obj4);
        mtStopRouteUiStateInteractor$initializeData$6.L$0 = (x3l0) obj;
        mtStopRouteUiStateInteractor$initializeData$6.L$1 = (Map) obj2;
        mtStopRouteUiStateInteractor$initializeData$6.L$2 = (List) obj3;
        return mtStopRouteUiStateInteractor$initializeData$6.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        AppColor$Palette appColor$Palette;
        x3l0 x3l0Var = (x3l0) this.L$0;
        Map map = (Map) this.L$1;
        List list = (List) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        ru.yandex.taxi.masstransit.stoproute.mapper.a aVar = gVar.f;
        int c = aVar.c(x3l0Var, map);
        ArrayList arrayList = x3l0Var.c;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((v3l0) it.next()).c) {
                i = i3;
                break;
            }
            i3++;
        }
        int f = scc.f(arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (Object obj2 : arrayList) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            v3l0 v3l0Var = (v3l0) obj2;
            String str = v3l0Var.d;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            LineState lineState = i == -1 ? i2 == 0 ? LineState.NONE_TO_MAIN : i2 == f ? LineState.MAIN_TO_NONE : LineState.MAIN_POINT : (i2 == 0 && i == 0) ? LineState.NONE_TO_MAIN : i2 == 0 ? LineState.NONE_TO_SECONDARY : (i2 == f && i == f) ? LineState.SECONDARY_TO_NONE_POINT_MAIN : i2 == f ? LineState.MAIN_TO_NONE : i2 == i ? LineState.SECONDARY_TO_MAIN : i2 < i ? LineState.SECONDARY_POINT : LineState.MAIN_POINT;
            ArrayList arrayList3 = arrayList2;
            String str3 = v3l0Var.a;
            String str4 = v3l0Var.b;
            switch (n340.a[lineState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    appColor$Palette = AppColor$Palette.TextMinor;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    appColor$Palette = AppColor$Palette.Text;
                    break;
                default:
                    w511.b();
                    return null;
            }
            AppColor$Palette appColor$Palette2 = appColor$Palette;
            int i5 = c;
            c = i5;
            arrayList3.add(new fiu0(str3, lineState, str4, appColor$Palette2, str2, i5));
            arrayList2 = arrayList3;
            i2 = i4;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof giu0) {
                arrayList4.add(next);
            }
        }
        List arrayList5 = new ArrayList(arrayList4);
        aVar.a(arrayList5, "past stops", i + 2, f - 2, c, false);
        aVar.a(arrayList5, "future stops", 1, i - 1, c, true);
        if (list.isEmpty()) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 instanceof diu0) {
                    arrayList6.add(next2);
                }
            }
            Iterator it4 = arrayList6.iterator();
            List list2 = arrayList5;
            while (it4.hasNext()) {
                list2 = gVar.b(list2, (diu0) it4.next());
            }
            return list2;
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            if (next3 instanceof diu0) {
                arrayList7.add(next3);
            }
        }
        for (diu0 diu0Var : kotlin.collections.a.q0(arrayList7)) {
            if (!list.contains(diu0Var.a)) {
                arrayList5 = gVar.b(arrayList5, diu0Var);
            }
        }
        return arrayList5;
    }
}
