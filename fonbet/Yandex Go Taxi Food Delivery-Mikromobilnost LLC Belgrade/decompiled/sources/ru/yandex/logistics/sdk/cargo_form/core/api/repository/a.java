package ru.yandex.logistics.sdk.cargo_form.core.api.repository;

import defpackage.e0l0;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.qv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FormZoneRepository$special$$inlined$map$1$2$1 formZoneRepository$special$$inlined$map$1$2$1;
        int i;
        oo0 oo0Var;
        if (continuation instanceof FormZoneRepository$special$$inlined$map$1$2$1) {
            formZoneRepository$special$$inlined$map$1$2$1 = (FormZoneRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = formZoneRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formZoneRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formZoneRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formZoneRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    qv0 qv0Var = (qv0) kotlin.collections.a.R(((e0l0) obj).a);
                    String str = (qv0Var == null || (oo0Var = qv0Var.a) == null) ? null : oo0Var.h;
                    formZoneRepository$special$$inlined$map$1$2$1.L$0 = null;
                    formZoneRepository$special$$inlined$map$1$2$1.L$1 = null;
                    formZoneRepository$special$$inlined$map$1$2$1.L$2 = null;
                    formZoneRepository$special$$inlined$map$1$2$1.L$3 = null;
                    formZoneRepository$special$$inlined$map$1$2$1.I$0 = 0;
                    formZoneRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, formZoneRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        formZoneRepository$special$$inlined$map$1$2$1 = new FormZoneRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = formZoneRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formZoneRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
