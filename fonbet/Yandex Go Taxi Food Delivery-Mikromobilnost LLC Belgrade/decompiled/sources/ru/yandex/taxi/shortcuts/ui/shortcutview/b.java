package ru.yandex.taxi.shortcuts.ui.shortcutview;

import defpackage.d4s0;
import defpackage.e6v;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rr00;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d4s0 b;

    public b(vpr vprVar, d4s0 d4s0Var) {
        this.a = vprVar;
        this.b = d4s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShortcutsViewPresenter$attachUiState$$inlined$map$1$2$1 shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1;
        int i;
        e6v e6vVar;
        if (continuation instanceof ShortcutsViewPresenter$attachUiState$$inlined$map$1$2$1) {
            shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1 = (ShortcutsViewPresenter$attachUiState$$inlined$map$1$2$1) continuation;
            int i2 = shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    d4s0 d4s0Var = this.b;
                    List<e6v> list2 = d4s0Var.d;
                    ArrayList arrayList = new ArrayList();
                    for (e6v e6vVar2 : list2) {
                        if (e6vVar2 instanceof w201) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    e6vVar = 0;
                                    break;
                                }
                                e6vVar = it.next();
                                if (jl40.l(((rr00) e6vVar).getId(), ((w201) e6vVar2).getId())) {
                                    break;
                                }
                            }
                            e6vVar2 = e6vVar;
                        }
                        if (e6vVar2 != null) {
                            arrayList.add(e6vVar2);
                        }
                    }
                    d4s0 a = d4s0.a(d4s0Var, arrayList, null, 4087);
                    shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.L$0 = null;
                    shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.L$1 = null;
                    shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.L$2 = null;
                    shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.L$3 = null;
                    shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1) == coroutineSingletons) {
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
        shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1 = new ShortcutsViewPresenter$attachUiState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsViewPresenter$attachUiState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
