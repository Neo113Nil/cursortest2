package ru.yandex.taxi.preorder.tollroad.compose.interactor;

import defpackage.ntk0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wtk0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1 roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1) {
            roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1 = (RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    boolean z2 = list instanceof Collection;
                    boolean z3 = false;
                    if (!z2 || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((ntk0) it.next()).k) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!z2 || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((ntk0) it2.next()).i) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    wtk0 wtk0Var = new wtk0(z, z3);
                    roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(wtk0Var, roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1 = new RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
