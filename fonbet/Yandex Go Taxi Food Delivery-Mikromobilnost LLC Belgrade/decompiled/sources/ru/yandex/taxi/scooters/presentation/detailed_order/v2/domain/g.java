package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.ny61;
import defpackage.o8p0;
import defpackage.p8p0;
import defpackage.qwo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;

/* loaded from: classes6.dex */
public final class g {
    public final qwo0 a;
    public final p b;
    public final u c;
    public final h d;
    public final ru.yandex.taxi.scooters.domain.e e;
    public final p8p0 f;
    public final ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d g;

    public g(qwo0 qwo0Var, p pVar, u uVar, h hVar, ru.yandex.taxi.scooters.domain.e eVar, p8p0 p8p0Var, ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d dVar) {
        this.a = qwo0Var;
        this.b = pVar;
        this.c = uVar;
        this.d = hVar;
        this.e = eVar;
        this.f = p8p0Var;
        this.g = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r10 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, String str, ContinuationImpl continuationImpl) {
        ScootersVoluntarySlowdownInteractor$handleForOrder$1 scootersVoluntarySlowdownInteractor$handleForOrder$1;
        Object obj;
        int i;
        o8p0 o8p0Var;
        qwo0 qwo0Var = gVar.a;
        if (continuationImpl instanceof ScootersVoluntarySlowdownInteractor$handleForOrder$1) {
            scootersVoluntarySlowdownInteractor$handleForOrder$1 = (ScootersVoluntarySlowdownInteractor$handleForOrder$1) continuationImpl;
            int i2 = scootersVoluntarySlowdownInteractor$handleForOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVoluntarySlowdownInteractor$handleForOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersVoluntarySlowdownInteractor$handleForOrder$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVoluntarySlowdownInteractor$handleForOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (gVar.d.a().d && !((Boolean) qwo0Var.v.getValue(qwo0Var, qwo0.B[20])).booleanValue()) {
                        p8p0 p8p0Var = gVar.f;
                        scootersVoluntarySlowdownInteractor$handleForOrder$1.L$0 = str;
                        scootersVoluntarySlowdownInteractor$handleForOrder$1.label = 1;
                        obj2 = p8p0Var.a.b(scootersVoluntarySlowdownInteractor$handleForOrder$1);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                str = (String) scootersVoluntarySlowdownInteractor$handleForOrder$1.L$0;
                kotlin.b.b(obj2);
                o8p0Var = (o8p0) obj2;
                if (o8p0Var.b && o8p0Var.h) {
                    qwo0Var.v.setValue(qwo0Var, qwo0.B[20], Boolean.TRUE);
                    scootersVoluntarySlowdownInteractor$handleForOrder$1.L$0 = null;
                    scootersVoluntarySlowdownInteractor$handleForOrder$1.L$1 = null;
                    scootersVoluntarySlowdownInteractor$handleForOrder$1.label = 2;
                    Object e = gVar.e(str, scootersVoluntarySlowdownInteractor$handleForOrder$1, true);
                    return e != obj ? obj : e;
                }
                return zy11.a;
            }
        }
        scootersVoluntarySlowdownInteractor$handleForOrder$1 = new ScootersVoluntarySlowdownInteractor$handleForOrder$1(gVar, continuationImpl);
        Object obj22 = scootersVoluntarySlowdownInteractor$handleForOrder$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVoluntarySlowdownInteractor$handleForOrder$1.label;
        if (i != 0) {
        }
        o8p0Var = (o8p0) obj22;
        if (o8p0Var.b) {
            qwo0Var.v.setValue(qwo0Var, qwo0.B[20], Boolean.TRUE);
            scootersVoluntarySlowdownInteractor$handleForOrder$1.L$0 = null;
            scootersVoluntarySlowdownInteractor$handleForOrder$1.L$1 = null;
            scootersVoluntarySlowdownInteractor$handleForOrder$1.label = 2;
            Object e2 = gVar.e(str, scootersVoluntarySlowdownInteractor$handleForOrder$1, true);
            if (e2 != obj) {
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(1:28)|21|(1:23)(1:27)|24))|33|6|7|(0)(0)|21|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r9 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ScootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1 scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1) {
            scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1 = (ScootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1) continuationImpl;
            int i2 = scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label;
                ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d dVar = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dVar.b.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.TURNING_OFF);
                    ScootersSlowdown.Reason reason = ScootersSlowdown.Reason.TRAINING_MODE;
                    scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.L$0 = null;
                    scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label = 1;
                    obj = this.b.a(str, reason, scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    dVar.b.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.ON);
                } else {
                    dVar.b.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.OFF);
                }
                ru.yandex.taxi.scooters.domain.e eVar = this.e;
                scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.L$0 = null;
                scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.Z$0 = booleanValue;
                scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label = 2;
                obj = eVar.a.a(scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1);
            }
        }
        scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1 = new ScootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1(this, continuationImpl);
        Object obj2 = scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label;
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d dVar2 = this.g;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        ru.yandex.taxi.scooters.domain.e eVar2 = this.e;
        scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.L$0 = null;
        scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.Z$0 = booleanValue;
        scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1.label = 2;
        obj2 = eVar2.a.a(scootersVoluntarySlowdownInteractor$cancelVoluntarySlowdown$1);
    }

    public final Object c(Continuation continuation) {
        return kotlinx.coroutines.flow.e.k(this.c.a(), new ScootersVoluntarySlowdownInteractor$handleSlowdownPreactivationForNewbie$2(this, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(1:28)|21|(1:23)(1:27)|24))|33|6|7|(0)(0)|21|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r10 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, String str, ContinuationImpl continuationImpl) {
        ScootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1 scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1;
        int i2;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1) {
            scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1 = (ScootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1) continuationImpl;
            int i3 = scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label;
                ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d dVar = this.g;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    dVar.b.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.TURNING_ON);
                    ScootersSlowdown.Reason reason = ScootersSlowdown.Reason.TRAINING_MODE;
                    scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.L$0 = null;
                    scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.I$0 = i;
                    scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label = 1;
                    obj = this.b.c(str, reason, i, scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    i = scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.I$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    dVar.b.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.OFF);
                } else {
                    dVar.b.g(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.ON);
                }
                ru.yandex.taxi.scooters.domain.e eVar = this.e;
                scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.L$0 = null;
                scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.I$0 = i;
                scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.Z$0 = booleanValue;
                scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label = 2;
                obj = eVar.a.a(scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1);
            }
        }
        scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1 = new ScootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1(this, continuationImpl);
        Object obj2 = scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label;
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d dVar2 = this.g;
        if (i2 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        ru.yandex.taxi.scooters.domain.e eVar2 = this.e;
        scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.L$0 = null;
        scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.I$0 = i;
        scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.Z$0 = booleanValue;
        scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1.label = 2;
        obj2 = eVar2.a.a(scootersVoluntarySlowdownInteractor$planVoluntarySlowdown$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl, boolean z) {
        ScootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1 scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1;
        int i;
        o8p0 o8p0Var;
        Integer num;
        if (continuationImpl instanceof ScootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1) {
            scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1 = (ScootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1) continuationImpl;
            int i2 = scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.L$0 = str;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.Z$0 = z;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label = 1;
                    obj = this.f.a.b(scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z = scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.Z$0;
                    str = (String) scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.L$0;
                    kotlin.b.b(obj);
                }
                o8p0Var = (o8p0) obj;
                if (o8p0Var.b || (num = o8p0Var.g) == null) {
                    return zy11.a;
                }
                if (z) {
                    int intValue = num.intValue();
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.L$0 = null;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.L$1 = null;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.Z$0 = z;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label = 2;
                    Object d = d(intValue, str, scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1);
                    if (d != obj2) {
                        return d;
                    }
                } else {
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.L$0 = null;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.L$1 = null;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.Z$0 = z;
                    scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label = 3;
                    Object b = b(str, scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1);
                    if (b != obj2) {
                        return b;
                    }
                }
                return obj2;
            }
        }
        scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1 = new ScootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1(this, continuationImpl);
        Object obj3 = scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1.label;
        if (i != 0) {
        }
        o8p0Var = (o8p0) obj3;
        if (o8p0Var.b) {
        }
        return zy11.a;
    }
}
