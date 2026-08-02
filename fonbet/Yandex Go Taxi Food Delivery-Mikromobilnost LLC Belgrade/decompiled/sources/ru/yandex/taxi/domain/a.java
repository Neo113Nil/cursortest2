package ru.yandex.taxi.domain;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.snr0;
import defpackage.tmr0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1 mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1;
        int i;
        Object obj2;
        Boolean valueOf;
        if (continuation instanceof MainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1) {
            mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1 = (MainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Pair pair = (Pair) obj;
                    List list = (List) pair.getFirst();
                    List list2 = (List) pair.getSecond();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((tmr0) obj2).a, SharedAccountType.FAMILY.getTypeId())) {
                            break;
                        }
                    }
                    tmr0 tmr0Var = (tmr0) obj2;
                    if (tmr0Var == null) {
                        valueOf = Boolean.FALSE;
                    } else {
                        List list3 = list2;
                        boolean z = false;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (jl40.l(((snr0) it2.next()).c.getTypeId(), tmr0Var.a)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        valueOf = Boolean.valueOf(z);
                    }
                    mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1 = new MainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj32 = mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuItemsInteractorImpl$_get_isFamilyAccountAvailableFlow_$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
