package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import android.content.Context;
import android.content.Intent;
import defpackage.jst;
import defpackage.ky2;
import defpackage.ny61;
import defpackage.vvo0;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.model.ScootersPermissionsNotGranted;
import ru.yandex.taxi.scooters.domain.o;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;
import ru.yandex.taxi.scooters.presentation.share_location.ScootersShareLocationService;

/* loaded from: classes6.dex */
public final class f {
    public final Context a;
    public final ky2 b;
    public final o c;
    public final vvo0 d;
    public final Intent e;

    public f(Context context, ky2 ky2Var, o oVar, vvo0 vvo0Var) {
        this.a = context;
        this.b = ky2Var;
        this.c = oVar;
        this.d = vvo0Var;
        this.e = new Intent(context, (Class<?>) ScootersShareLocationService.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersShareLocationServiceInteractor$startService$1 scootersShareLocationServiceInteractor$startService$1;
        int i;
        zy11 zy11Var = zy11.a;
        try {
            if (continuationImpl instanceof ScootersShareLocationServiceInteractor$startService$1) {
                scootersShareLocationServiceInteractor$startService$1 = (ScootersShareLocationServiceInteractor$startService$1) continuationImpl;
                int i2 = scootersShareLocationServiceInteractor$startService$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersShareLocationServiceInteractor$startService$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersShareLocationServiceInteractor$startService$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersShareLocationServiceInteractor$startService$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (!this.c.b.a.b()) {
                            o oVar = this.c;
                            scootersShareLocationServiceInteractor$startService$1.label = 1;
                            if (oVar.b(scootersShareLocationServiceInteractor$startService$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        if (this.b.a) {
                            try {
                                this.d.c.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.TURNING_ON);
                                this.a.startForegroundService(this.e);
                                return zy11Var;
                            } catch (Exception e) {
                                this.d.c.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.OFF);
                                zgz.a("Unable to start share location foreground service", e);
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (this.b.a) {
                    }
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            if (this.b.a) {
            }
            return zy11Var;
        } catch (ScootersPermissionsNotGranted unused) {
            jst.e.getClass();
            return zy11Var;
        }
        scootersShareLocationServiceInteractor$startService$1 = new ScootersShareLocationServiceInteractor$startService$1(this, continuationImpl);
        Object obj2 = scootersShareLocationServiceInteractor$startService$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationServiceInteractor$startService$1.label;
    }
}
