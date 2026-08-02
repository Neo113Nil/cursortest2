package ru.yandex.taxi.settings.account;

import defpackage.i1s;
import defpackage.j1s;
import defpackage.jl40;
import defpackage.k1s;
import defpackage.l1s;
import defpackage.n1s;
import defpackage.ny61;
import defpackage.o1s;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l1s b;

    public a(vpr vprVar, l1s l1sVar) {
        this.a = vprVar;
        this.b = l1sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1 forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        Object o1sVar;
        if (continuation instanceof ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1) {
            forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1 = (ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k1s k1sVar = (k1s) obj;
                    this.b.getClass();
                    if (jl40.l(k1sVar, i1s.a)) {
                        o1sVar = n1s.a;
                    } else {
                        if (!(k1sVar instanceof j1s)) {
                            w511.b();
                            return null;
                        }
                        j1s j1sVar = (j1s) k1sVar;
                        o1sVar = new o1s(j1sVar.b(), j1sVar.a());
                    }
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(o1sVar, forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1 = new ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
