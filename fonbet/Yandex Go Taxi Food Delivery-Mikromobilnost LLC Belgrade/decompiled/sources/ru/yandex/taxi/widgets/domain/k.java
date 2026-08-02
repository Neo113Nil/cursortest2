package ru.yandex.taxi.widgets.domain;

import com.yandex.go.shortcuts.dto.response.Layout;
import defpackage.avj0;
import defpackage.d1z;
import defpackage.d4s0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.rfw0;
import defpackage.t3s0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w201;
import defpackage.yaf0;
import defpackage.z451;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ m b;
    public final /* synthetic */ yaf0 c;

    public k(vpr vprVar, m mVar, yaf0 yaf0Var) {
        this.a = vprVar;
        this.b = mVar;
        this.c = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WidgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1 widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WidgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1) {
            widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1 = (WidgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1) continuation;
            int i2 = widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rfw0 rfw0Var = this.b.b;
                    zuj0 zuj0Var = (zuj0) rfw0Var.a;
                    ListBuilder a = rcc.a();
                    for (w201 w201Var : (List) obj) {
                        t3s0 t3s0Var = new t3s0(((avj0) zuj0Var).c(mrg0.go_design_s_space), 0, 12, false);
                        a.add(w201Var);
                        a.add(t3s0Var);
                    }
                    if (((z451) rfw0Var.b).a) {
                        a.add(new t3s0(tje.u(12, ((avj0) zuj0Var).a), 0, 12, false));
                    }
                    ListBuilder j = a.j();
                    d4s0 d4s0Var = new d4s0(Layout.e, d1z.a, EmptyList.a, Collections.unmodifiableList(j), null, this.c, null, null, null, false, 4048);
                    widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.L$0 = null;
                    widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.L$1 = null;
                    widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.L$2 = null;
                    widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.L$3 = null;
                    widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(d4s0Var, widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1) == coroutineSingletons) {
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
        widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1 = new WidgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1(this, continuation);
        Object obj22 = widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsShortcutsViewSource$startScreenType$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
