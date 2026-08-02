package ru.yandex.logistics.sdk.cargo_form.core.impl;

import defpackage.an91;
import defpackage.jg31;
import defpackage.kg31;
import defpackage.l690;
import defpackage.ny61;
import defpackage.o690;
import defpackage.rh4;
import defpackage.scc;
import defpackage.vpr;
import defpackage.x2s;
import defpackage.y3s;
import defpackage.zh4;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y3s b;
    public final /* synthetic */ kg31 c;

    public a(vpr vprVar, y3s y3sVar, kg31 kg31Var) {
        this.a = vprVar;
        this.b = y3sVar;
        this.c = kg31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FormCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1 formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1;
        int i;
        jg31 jg31Var;
        if (continuation instanceof FormCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1) {
            formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1 = (FormCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1) continuation;
            int i2 = formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b.b;
                    aVar.getClass();
                    if (list.isEmpty()) {
                        jg31Var = null;
                    } else {
                        kg31 kg31Var = this.c;
                        rh4 rh4Var = kg31Var.c;
                        zh4 a = rh4Var != null ? aVar.a(rh4Var) : null;
                        float f = kg31Var.d;
                        o690 o690Var = kg31Var.e;
                        l690 i3 = o690Var != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var) : an91.b(0.0f, 0.0f, 3);
                        o690 o690Var2 = kg31Var.f;
                        jg31Var = new jg31(list, a, f, i3, o690Var2 != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var2) : an91.b(0.0f, 0.0f, 3), new x2s(kg31Var.g, null), kg31Var.a);
                    }
                    List h = scc.h(jg31Var);
                    formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.L$0 = null;
                    formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.L$1 = null;
                    formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.L$2 = null;
                    formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.L$3 = null;
                    formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.I$0 = 0;
                    formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h, formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1 = new FormCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formCoreSectionsMapper$compositeWidgetModelFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
