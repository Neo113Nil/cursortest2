package ru.yandex.taxi.domain;

import defpackage.dc61;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class y implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s0 b;

    public y(vpr vprVar, s0 s0Var) {
        this.a = vprVar;
        this.b = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainMenuItemsInteractorImpl$special$$inlined$map$2$2$1 mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof MainMenuItemsInteractorImpl$special$$inlined$map$2$2$1) {
            mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1 = (MainMenuItemsInteractorImpl$special$$inlined$map$2$2$1) continuation;
            int i2 = mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dc61 dc61Var = this.b.e;
                    dc61Var.b.getClass();
                    ru.yandex.taxi.am.g gVar = dc61Var.a;
                    Boolean valueOf = Boolean.valueOf(gVar.f() && gVar.a.Mg());
                    mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.L$0 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.L$1 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.L$2 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.L$3 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1 = new MainMenuItemsInteractorImpl$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuItemsInteractorImpl$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
