package ru.yandex.taxi.settings.account;

import com.yandex.go.account.phonish_upgrade.l;
import defpackage.l1s;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b implements tpr {
    public final /* synthetic */ l a;
    public final /* synthetic */ l1s b;

    public b(l lVar, l1s l1sVar) {
        this.a = lVar;
        this.b = l1sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1 forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1) {
            forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1 = (ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1 = new ForcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forcePhonishUpgradeMenuItemInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
