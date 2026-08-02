package ru.yandex.taxi.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class i implements tpr {
    public final /* synthetic */ ru.yandex.taxi.bugreport.ui.b a;

    public i(ru.yandex.taxi.bugreport.ui.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainMenuItemsInteractorImpl$special$$inlined$map$12$1 mainMenuItemsInteractorImpl$special$$inlined$map$12$1;
        int i;
        if (continuation instanceof MainMenuItemsInteractorImpl$special$$inlined$map$12$1) {
            mainMenuItemsInteractorImpl$special$$inlined$map$12$1 = (MainMenuItemsInteractorImpl$special$$inlined$map$12$1) continuation;
            int i2 = mainMenuItemsInteractorImpl$special$$inlined$map$12$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuItemsInteractorImpl$special$$inlined$map$12$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainMenuItemsInteractorImpl$special$$inlined$map$12$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuItemsInteractorImpl$special$$inlined$map$12$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar);
                    mainMenuItemsInteractorImpl$special$$inlined$map$12$1.L$0 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$12$1.L$1 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$12$1.L$2 = null;
                    mainMenuItemsInteractorImpl$special$$inlined$map$12$1.label = 1;
                    if (this.a.collect(hVar, mainMenuItemsInteractorImpl$special$$inlined$map$12$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mainMenuItemsInteractorImpl$special$$inlined$map$12$1 = new MainMenuItemsInteractorImpl$special$$inlined$map$12$1(this, continuation);
        Object obj2 = mainMenuItemsInteractorImpl$special$$inlined$map$12$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuItemsInteractorImpl$special$$inlined$map$12$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
