package ru.yandex.taxi.cashback.model;

import defpackage.h3b0;
import defpackage.h8b0;
import defpackage.i3b0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xdf;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i3b0 b;

    public a(vpr vprVar, i3b0 i3b0Var) {
        this.a = vprVar;
        this.b = i3b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusMenuItemInteractorImpl$special$$inlined$map$1$2$1 plusMenuItemInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PlusMenuItemInteractorImpl$special$$inlined$map$1$2$1) {
            plusMenuItemInteractorImpl$special$$inlined$map$1$2$1 = (PlusMenuItemInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof h8b0) {
                            arrayList.add(obj3);
                        }
                    }
                    h8b0 h8b0Var = (h8b0) kotlin.collections.a.R(arrayList);
                    xdf xdfVar = this.b.a;
                    h3b0 h3b0Var = new h3b0(h8b0Var);
                    plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h3b0Var, plusMenuItemInteractorImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        plusMenuItemInteractorImpl$special$$inlined$map$1$2$1 = new PlusMenuItemInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusMenuItemInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
