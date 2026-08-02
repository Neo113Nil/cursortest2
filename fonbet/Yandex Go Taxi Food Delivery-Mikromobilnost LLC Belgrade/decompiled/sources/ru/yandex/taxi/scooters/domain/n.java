package ru.yandex.taxi.scooters.domain;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import com.yandex.go.scooters.ble.api.ScootersBleProtocol;
import defpackage.a60;
import defpackage.c1n0;
import defpackage.e4b1;
import defpackage.f1n0;
import defpackage.h1n0;
import defpackage.nqi0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.q9o;
import defpackage.r40;
import defpackage.t6o0;
import defpackage.tls;
import defpackage.vu;
import defpackage.w1n0;
import defpackage.y50;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.domain.model.ScootersBleIsNotAvailableException;

/* loaded from: classes6.dex */
public final class n {
    public final y50 a;
    public final f1n0 b;
    public final oep0 c;
    public final ru.yandex.taxi.activity.g d;
    public final c1n0 e;
    public final vu f;

    public n(y50 y50Var, f1n0 f1n0Var, oep0 oep0Var, ru.yandex.taxi.activity.g gVar, c1n0 c1n0Var, vu vuVar) {
        this.a = y50Var;
        this.b = f1n0Var;
        this.c = oep0Var;
        this.d = gVar;
        this.e = c1n0Var;
        this.f = vuVar;
    }

    public static Object c(tls tlsVar, ContinuationImpl continuationImpl) {
        Object a = new com.yandex.go.coroutines.f(3, new q9o(1000L), tlsVar, new nqi0(15)).a(continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final com.yandex.go.scooters.ble.a a() {
        try {
            return this.b.a(ScootersBleProtocol.NINEBOT);
        } catch (IllegalArgumentException e) {
            throw new ScootersBleIsNotAvailableException(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(3:10|11|(2:13|14)(2:16|17))(2:18|19))(1:20))(2:29|(2:31|32)(1:33))|21|22|23|24))|35|6|(0)(0)|21|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.a.a(r7, r6.c, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersOverBleInteractor$ensureRequirements$1 scootersOverBleInteractor$ensureRequirements$1;
        int i;
        if (continuationImpl instanceof ScootersOverBleInteractor$ensureRequirements$1) {
            scootersOverBleInteractor$ensureRequirements$1 = (ScootersOverBleInteractor$ensureRequirements$1) continuationImpl;
            int i2 = scootersOverBleInteractor$ensureRequirements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOverBleInteractor$ensureRequirements$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOverBleInteractor$ensureRequirements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOverBleInteractor$ensureRequirements$1.label;
                c1n0 c1n0Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (c1n0Var.a()) {
                        return Boolean.TRUE;
                    }
                    w1n0 w1n0Var = (w1n0) this.f.get();
                    scootersOverBleInteractor$ensureRequirements$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((r40) obj).a == 0 ? Boolean.FALSE : Boolean.valueOf(c1n0Var.a());
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a60 a60Var = (a60) this.a;
                a60Var.getClass();
                a60Var.e(HProv.PP_DELETE_KEYSET, new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                n0 n0Var = this.d.b;
                scootersOverBleInteractor$ensureRequirements$1.label = 2;
                obj = kotlinx.coroutines.flow.e.y(n0Var, scootersOverBleInteractor$ensureRequirements$1);
            }
        }
        scootersOverBleInteractor$ensureRequirements$1 = new ScootersOverBleInteractor$ensureRequirements$1(this, continuationImpl);
        Object obj2 = scootersOverBleInteractor$ensureRequirements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOverBleInteractor$ensureRequirements$1.label;
        c1n0 c1n0Var2 = this.e;
        if (i != 0) {
        }
        a60 a60Var2 = (a60) this.a;
        a60Var2.getClass();
        a60Var2.e(HProv.PP_DELETE_KEYSET, new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        n0 n0Var2 = this.d.b;
        scootersOverBleInteractor$ensureRequirements$1.label = 2;
        obj2 = kotlinx.coroutines.flow.e.y(n0Var2, scootersOverBleInteractor$ensureRequirements$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersOverBleInteractor$requireBleEnabled$1 scootersOverBleInteractor$requireBleEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersOverBleInteractor$requireBleEnabled$1) {
            scootersOverBleInteractor$requireBleEnabled$1 = (ScootersOverBleInteractor$requireBleEnabled$1) continuationImpl;
            int i2 = scootersOverBleInteractor$requireBleEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOverBleInteractor$requireBleEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersOverBleInteractor$requireBleEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOverBleInteractor$requireBleEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((BluetoothAdapter) this.e.a.getValue()) != null) {
                        scootersOverBleInteractor$requireBleEnabled$1.label = 1;
                        obj = b(scootersOverBleInteractor$requireBleEnabled$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    throw new ScootersBleIsNotAvailableException(null);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                throw new ScootersBleIsNotAvailableException(null);
            }
        }
        scootersOverBleInteractor$requireBleEnabled$1 = new ScootersOverBleInteractor$requireBleEnabled$1(this, continuationImpl);
        obj = scootersOverBleInteractor$requireBleEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOverBleInteractor$requireBleEnabled$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        throw new ScootersBleIsNotAvailableException(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (c(r9, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (d(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        ScootersOverBleInteractor$tryCompleteByBle$1 scootersOverBleInteractor$tryCompleteByBle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        h1n0 a;
        ScootersOverBleInteractor$tryCompleteByBle$2$1 scootersOverBleInteractor$tryCompleteByBle$2$1;
        h1n0 h1n0Var;
        try {
            if (continuationImpl instanceof ScootersOverBleInteractor$tryCompleteByBle$1) {
                scootersOverBleInteractor$tryCompleteByBle$1 = (ScootersOverBleInteractor$tryCompleteByBle$1) continuationImpl;
                int i2 = scootersOverBleInteractor$tryCompleteByBle$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOverBleInteractor$tryCompleteByBle$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersOverBleInteractor$tryCompleteByBle$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOverBleInteractor$tryCompleteByBle$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersOverBleInteractor$tryCompleteByBle$1.L$0 = str;
                        scootersOverBleInteractor$tryCompleteByBle$1.L$1 = str2;
                        scootersOverBleInteractor$tryCompleteByBle$1.label = 1;
                    } else if (i == 1) {
                        str2 = (String) scootersOverBleInteractor$tryCompleteByBle$1.L$1;
                        str = (String) scootersOverBleInteractor$tryCompleteByBle$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            a = (h1n0) scootersOverBleInteractor$tryCompleteByBle$1.L$3;
                            kotlin.b.b(obj);
                            ((com.yandex.go.scooters.ble.a) a).b();
                            return zy11.a;
                        }
                        a = (h1n0) scootersOverBleInteractor$tryCompleteByBle$1.L$3;
                        h1n0Var = (h1n0) scootersOverBleInteractor$tryCompleteByBle$1.L$2;
                        kotlin.b.b(obj);
                        ScootersOverBleInteractor$tryCompleteByBle$2$2 scootersOverBleInteractor$tryCompleteByBle$2$2 = new ScootersOverBleInteractor$tryCompleteByBle$2$2(a, null);
                        scootersOverBleInteractor$tryCompleteByBle$1.L$0 = null;
                        scootersOverBleInteractor$tryCompleteByBle$1.L$1 = null;
                        scootersOverBleInteractor$tryCompleteByBle$1.L$2 = h1n0Var;
                        scootersOverBleInteractor$tryCompleteByBle$1.L$3 = a;
                        scootersOverBleInteractor$tryCompleteByBle$1.label = 3;
                    }
                    a = a();
                    scootersOverBleInteractor$tryCompleteByBle$2$1 = new ScootersOverBleInteractor$tryCompleteByBle$2$1(a, str, str2, null);
                    scootersOverBleInteractor$tryCompleteByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryCompleteByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryCompleteByBle$1.L$2 = a;
                    scootersOverBleInteractor$tryCompleteByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryCompleteByBle$1.label = 2;
                    if (c(scootersOverBleInteractor$tryCompleteByBle$2$1, scootersOverBleInteractor$tryCompleteByBle$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h1n0Var = a;
                    ScootersOverBleInteractor$tryCompleteByBle$2$2 scootersOverBleInteractor$tryCompleteByBle$2$22 = new ScootersOverBleInteractor$tryCompleteByBle$2$2(a, null);
                    scootersOverBleInteractor$tryCompleteByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryCompleteByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryCompleteByBle$1.L$2 = h1n0Var;
                    scootersOverBleInteractor$tryCompleteByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryCompleteByBle$1.label = 3;
                }
            }
            if (i != 0) {
            }
            a = a();
            scootersOverBleInteractor$tryCompleteByBle$2$1 = new ScootersOverBleInteractor$tryCompleteByBle$2$1(a, str, str2, null);
            scootersOverBleInteractor$tryCompleteByBle$1.L$0 = null;
            scootersOverBleInteractor$tryCompleteByBle$1.L$1 = null;
            scootersOverBleInteractor$tryCompleteByBle$1.L$2 = a;
            scootersOverBleInteractor$tryCompleteByBle$1.L$3 = a;
            scootersOverBleInteractor$tryCompleteByBle$1.label = 2;
            if (c(scootersOverBleInteractor$tryCompleteByBle$2$1, scootersOverBleInteractor$tryCompleteByBle$1) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            ((com.yandex.go.scooters.ble.a) this).b();
            throw th;
        }
        scootersOverBleInteractor$tryCompleteByBle$1 = new ScootersOverBleInteractor$tryCompleteByBle$1(this, continuationImpl);
        Object obj2 = scootersOverBleInteractor$tryCompleteByBle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOverBleInteractor$tryCompleteByBle$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (d(r0) == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:15:0x0044, B:16:0x0128, B:23:0x0066, B:24:0x0110, B:29:0x007f, B:30:0x0143, B:32:0x0098, B:33:0x00df, B:38:0x00f2, B:39:0x00f7, B:40:0x00f8, B:43:0x012b, B:47:0x00c5), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersOverBleInteractor$tryEvolveByBle$1 scootersOverBleInteractor$tryEvolveByBle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        h1n0 a;
        ScootersOverBleInteractor$tryEvolveByBle$2$1 scootersOverBleInteractor$tryEvolveByBle$2$1;
        h1n0 h1n0Var;
        zuo0 zuo0Var2;
        int i2;
        try {
            if (continuationImpl instanceof ScootersOverBleInteractor$tryEvolveByBle$1) {
                scootersOverBleInteractor$tryEvolveByBle$1 = (ScootersOverBleInteractor$tryEvolveByBle$1) continuationImpl;
                int i3 = scootersOverBleInteractor$tryEvolveByBle$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    scootersOverBleInteractor$tryEvolveByBle$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = scootersOverBleInteractor$tryEvolveByBle$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOverBleInteractor$tryEvolveByBle$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersOverBleInteractor$tryEvolveByBle$1.L$0 = str;
                        scootersOverBleInteractor$tryEvolveByBle$1.L$1 = str2;
                        scootersOverBleInteractor$tryEvolveByBle$1.L$2 = zuo0Var;
                        scootersOverBleInteractor$tryEvolveByBle$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    a = (h1n0) scootersOverBleInteractor$tryEvolveByBle$1.L$4;
                                    kotlin.b.b(obj);
                                    ((com.yandex.go.scooters.ble.a) a).b();
                                    return zy11.a;
                                }
                                if (i != 4) {
                                    if (i != 5) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    a = (h1n0) scootersOverBleInteractor$tryEvolveByBle$1.L$4;
                                    kotlin.b.b(obj);
                                    ((com.yandex.go.scooters.ble.a) a).b();
                                    return zy11.a;
                                }
                                a = (h1n0) scootersOverBleInteractor$tryEvolveByBle$1.L$4;
                                h1n0Var = (h1n0) scootersOverBleInteractor$tryEvolveByBle$1.L$3;
                                kotlin.b.b(obj);
                                ScootersOverBleInteractor$tryEvolveByBle$2$4 scootersOverBleInteractor$tryEvolveByBle$2$4 = new ScootersOverBleInteractor$tryEvolveByBle$2$4(a, null);
                                scootersOverBleInteractor$tryEvolveByBle$1.L$0 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$1 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$2 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$3 = h1n0Var;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$4 = a;
                                scootersOverBleInteractor$tryEvolveByBle$1.label = 5;
                                obj = c(scootersOverBleInteractor$tryEvolveByBle$2$4, scootersOverBleInteractor$tryEvolveByBle$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                ((com.yandex.go.scooters.ble.a) a).b();
                                return zy11.a;
                            }
                            a = (h1n0) scootersOverBleInteractor$tryEvolveByBle$1.L$4;
                            h1n0Var = (h1n0) scootersOverBleInteractor$tryEvolveByBle$1.L$3;
                            zuo0Var2 = (zuo0) scootersOverBleInteractor$tryEvolveByBle$1.L$2;
                            kotlin.b.b(obj);
                            i2 = t6o0.a[e4b1.c(zuo0Var2).ordinal()];
                            if (i2 == 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ((com.yandex.go.scooters.ble.a) a).b();
                                    return zy11.a;
                                }
                                ScootersOverBleInteractor$tryEvolveByBle$2$3 scootersOverBleInteractor$tryEvolveByBle$2$3 = new ScootersOverBleInteractor$tryEvolveByBle$2$3(a, null);
                                scootersOverBleInteractor$tryEvolveByBle$1.L$0 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$1 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$2 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$3 = h1n0Var;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$4 = a;
                                scootersOverBleInteractor$tryEvolveByBle$1.label = 4;
                                if (c(scootersOverBleInteractor$tryEvolveByBle$2$3, scootersOverBleInteractor$tryEvolveByBle$1) == coroutineSingletons) {
                                }
                                ScootersOverBleInteractor$tryEvolveByBle$2$4 scootersOverBleInteractor$tryEvolveByBle$2$42 = new ScootersOverBleInteractor$tryEvolveByBle$2$4(a, null);
                                scootersOverBleInteractor$tryEvolveByBle$1.L$0 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$1 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$2 = null;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$3 = h1n0Var;
                                scootersOverBleInteractor$tryEvolveByBle$1.L$4 = a;
                                scootersOverBleInteractor$tryEvolveByBle$1.label = 5;
                                obj = c(scootersOverBleInteractor$tryEvolveByBle$2$42, scootersOverBleInteractor$tryEvolveByBle$1);
                                if (obj == coroutineSingletons) {
                                }
                                ((com.yandex.go.scooters.ble.a) a).b();
                                return zy11.a;
                            }
                            ScootersOverBleInteractor$tryEvolveByBle$2$2 scootersOverBleInteractor$tryEvolveByBle$2$2 = new ScootersOverBleInteractor$tryEvolveByBle$2$2(a, null);
                            scootersOverBleInteractor$tryEvolveByBle$1.L$0 = null;
                            scootersOverBleInteractor$tryEvolveByBle$1.L$1 = null;
                            scootersOverBleInteractor$tryEvolveByBle$1.L$2 = null;
                            scootersOverBleInteractor$tryEvolveByBle$1.L$3 = h1n0Var;
                            scootersOverBleInteractor$tryEvolveByBle$1.L$4 = a;
                            scootersOverBleInteractor$tryEvolveByBle$1.label = 3;
                            obj = c(scootersOverBleInteractor$tryEvolveByBle$2$2, scootersOverBleInteractor$tryEvolveByBle$1);
                            return coroutineSingletons;
                        }
                        zuo0Var = (zuo0) scootersOverBleInteractor$tryEvolveByBle$1.L$2;
                        str2 = (String) scootersOverBleInteractor$tryEvolveByBle$1.L$1;
                        str = (String) scootersOverBleInteractor$tryEvolveByBle$1.L$0;
                        kotlin.b.b(obj);
                    }
                    a = a();
                    scootersOverBleInteractor$tryEvolveByBle$2$1 = new ScootersOverBleInteractor$tryEvolveByBle$2$1(a, str, str2, null);
                    scootersOverBleInteractor$tryEvolveByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryEvolveByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryEvolveByBle$1.L$2 = zuo0Var;
                    scootersOverBleInteractor$tryEvolveByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryEvolveByBle$1.L$4 = a;
                    scootersOverBleInteractor$tryEvolveByBle$1.label = 2;
                    if (c(scootersOverBleInteractor$tryEvolveByBle$2$1, scootersOverBleInteractor$tryEvolveByBle$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h1n0Var = a;
                    zuo0Var2 = zuo0Var;
                    i2 = t6o0.a[e4b1.c(zuo0Var2).ordinal()];
                    if (i2 == 1) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            a = a();
            scootersOverBleInteractor$tryEvolveByBle$2$1 = new ScootersOverBleInteractor$tryEvolveByBle$2$1(a, str, str2, null);
            scootersOverBleInteractor$tryEvolveByBle$1.L$0 = null;
            scootersOverBleInteractor$tryEvolveByBle$1.L$1 = null;
            scootersOverBleInteractor$tryEvolveByBle$1.L$2 = zuo0Var;
            scootersOverBleInteractor$tryEvolveByBle$1.L$3 = a;
            scootersOverBleInteractor$tryEvolveByBle$1.L$4 = a;
            scootersOverBleInteractor$tryEvolveByBle$1.label = 2;
            if (c(scootersOverBleInteractor$tryEvolveByBle$2$1, scootersOverBleInteractor$tryEvolveByBle$1) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            ((com.yandex.go.scooters.ble.a) this).b();
            throw th;
        }
        scootersOverBleInteractor$tryEvolveByBle$1 = new ScootersOverBleInteractor$tryEvolveByBle$1(this, continuationImpl);
        Object obj2 = scootersOverBleInteractor$tryEvolveByBle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOverBleInteractor$tryEvolveByBle$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (c(r9, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (d(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) {
        ScootersOverBleInteractor$tryOpenLockByBle$1 scootersOverBleInteractor$tryOpenLockByBle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        h1n0 a;
        ScootersOverBleInteractor$tryOpenLockByBle$2$1 scootersOverBleInteractor$tryOpenLockByBle$2$1;
        h1n0 h1n0Var;
        try {
            if (continuationImpl instanceof ScootersOverBleInteractor$tryOpenLockByBle$1) {
                scootersOverBleInteractor$tryOpenLockByBle$1 = (ScootersOverBleInteractor$tryOpenLockByBle$1) continuationImpl;
                int i2 = scootersOverBleInteractor$tryOpenLockByBle$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOverBleInteractor$tryOpenLockByBle$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersOverBleInteractor$tryOpenLockByBle$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOverBleInteractor$tryOpenLockByBle$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersOverBleInteractor$tryOpenLockByBle$1.L$0 = str;
                        scootersOverBleInteractor$tryOpenLockByBle$1.L$1 = str2;
                        scootersOverBleInteractor$tryOpenLockByBle$1.label = 1;
                    } else if (i == 1) {
                        str2 = (String) scootersOverBleInteractor$tryOpenLockByBle$1.L$1;
                        str = (String) scootersOverBleInteractor$tryOpenLockByBle$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            a = (h1n0) scootersOverBleInteractor$tryOpenLockByBle$1.L$3;
                            kotlin.b.b(obj);
                            ((com.yandex.go.scooters.ble.a) a).b();
                            return zy11.a;
                        }
                        a = (h1n0) scootersOverBleInteractor$tryOpenLockByBle$1.L$3;
                        h1n0Var = (h1n0) scootersOverBleInteractor$tryOpenLockByBle$1.L$2;
                        kotlin.b.b(obj);
                        ScootersOverBleInteractor$tryOpenLockByBle$2$2 scootersOverBleInteractor$tryOpenLockByBle$2$2 = new ScootersOverBleInteractor$tryOpenLockByBle$2$2(a, null);
                        scootersOverBleInteractor$tryOpenLockByBle$1.L$0 = null;
                        scootersOverBleInteractor$tryOpenLockByBle$1.L$1 = null;
                        scootersOverBleInteractor$tryOpenLockByBle$1.L$2 = h1n0Var;
                        scootersOverBleInteractor$tryOpenLockByBle$1.L$3 = a;
                        scootersOverBleInteractor$tryOpenLockByBle$1.label = 3;
                    }
                    a = a();
                    scootersOverBleInteractor$tryOpenLockByBle$2$1 = new ScootersOverBleInteractor$tryOpenLockByBle$2$1(a, str, str2, null);
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$2 = a;
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryOpenLockByBle$1.label = 2;
                    if (c(scootersOverBleInteractor$tryOpenLockByBle$2$1, scootersOverBleInteractor$tryOpenLockByBle$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h1n0Var = a;
                    ScootersOverBleInteractor$tryOpenLockByBle$2$2 scootersOverBleInteractor$tryOpenLockByBle$2$22 = new ScootersOverBleInteractor$tryOpenLockByBle$2$2(a, null);
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$2 = h1n0Var;
                    scootersOverBleInteractor$tryOpenLockByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryOpenLockByBle$1.label = 3;
                }
            }
            if (i != 0) {
            }
            a = a();
            scootersOverBleInteractor$tryOpenLockByBle$2$1 = new ScootersOverBleInteractor$tryOpenLockByBle$2$1(a, str, str2, null);
            scootersOverBleInteractor$tryOpenLockByBle$1.L$0 = null;
            scootersOverBleInteractor$tryOpenLockByBle$1.L$1 = null;
            scootersOverBleInteractor$tryOpenLockByBle$1.L$2 = a;
            scootersOverBleInteractor$tryOpenLockByBle$1.L$3 = a;
            scootersOverBleInteractor$tryOpenLockByBle$1.label = 2;
            if (c(scootersOverBleInteractor$tryOpenLockByBle$2$1, scootersOverBleInteractor$tryOpenLockByBle$1) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            ((com.yandex.go.scooters.ble.a) this).b();
            throw th;
        }
        scootersOverBleInteractor$tryOpenLockByBle$1 = new ScootersOverBleInteractor$tryOpenLockByBle$1(this, continuationImpl);
        Object obj2 = scootersOverBleInteractor$tryOpenLockByBle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOverBleInteractor$tryOpenLockByBle$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (c(r9, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (d(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, ContinuationImpl continuationImpl) {
        ScootersOverBleInteractor$tryWhereIsByBle$1 scootersOverBleInteractor$tryWhereIsByBle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        h1n0 a;
        ScootersOverBleInteractor$tryWhereIsByBle$2$1 scootersOverBleInteractor$tryWhereIsByBle$2$1;
        h1n0 h1n0Var;
        try {
            if (continuationImpl instanceof ScootersOverBleInteractor$tryWhereIsByBle$1) {
                scootersOverBleInteractor$tryWhereIsByBle$1 = (ScootersOverBleInteractor$tryWhereIsByBle$1) continuationImpl;
                int i2 = scootersOverBleInteractor$tryWhereIsByBle$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOverBleInteractor$tryWhereIsByBle$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersOverBleInteractor$tryWhereIsByBle$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOverBleInteractor$tryWhereIsByBle$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersOverBleInteractor$tryWhereIsByBle$1.L$0 = str;
                        scootersOverBleInteractor$tryWhereIsByBle$1.L$1 = str2;
                        scootersOverBleInteractor$tryWhereIsByBle$1.label = 1;
                    } else if (i == 1) {
                        str2 = (String) scootersOverBleInteractor$tryWhereIsByBle$1.L$1;
                        str = (String) scootersOverBleInteractor$tryWhereIsByBle$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            a = (h1n0) scootersOverBleInteractor$tryWhereIsByBle$1.L$3;
                            kotlin.b.b(obj);
                            ((com.yandex.go.scooters.ble.a) a).b();
                            return zy11.a;
                        }
                        a = (h1n0) scootersOverBleInteractor$tryWhereIsByBle$1.L$3;
                        h1n0Var = (h1n0) scootersOverBleInteractor$tryWhereIsByBle$1.L$2;
                        kotlin.b.b(obj);
                        ScootersOverBleInteractor$tryWhereIsByBle$2$2 scootersOverBleInteractor$tryWhereIsByBle$2$2 = new ScootersOverBleInteractor$tryWhereIsByBle$2$2(a, null);
                        scootersOverBleInteractor$tryWhereIsByBle$1.L$0 = null;
                        scootersOverBleInteractor$tryWhereIsByBle$1.L$1 = null;
                        scootersOverBleInteractor$tryWhereIsByBle$1.L$2 = h1n0Var;
                        scootersOverBleInteractor$tryWhereIsByBle$1.L$3 = a;
                        scootersOverBleInteractor$tryWhereIsByBle$1.label = 3;
                    }
                    a = a();
                    scootersOverBleInteractor$tryWhereIsByBle$2$1 = new ScootersOverBleInteractor$tryWhereIsByBle$2$1(a, str, str2, null);
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$2 = a;
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryWhereIsByBle$1.label = 2;
                    if (c(scootersOverBleInteractor$tryWhereIsByBle$2$1, scootersOverBleInteractor$tryWhereIsByBle$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h1n0Var = a;
                    ScootersOverBleInteractor$tryWhereIsByBle$2$2 scootersOverBleInteractor$tryWhereIsByBle$2$22 = new ScootersOverBleInteractor$tryWhereIsByBle$2$2(a, null);
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$0 = null;
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$1 = null;
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$2 = h1n0Var;
                    scootersOverBleInteractor$tryWhereIsByBle$1.L$3 = a;
                    scootersOverBleInteractor$tryWhereIsByBle$1.label = 3;
                }
            }
            if (i != 0) {
            }
            a = a();
            scootersOverBleInteractor$tryWhereIsByBle$2$1 = new ScootersOverBleInteractor$tryWhereIsByBle$2$1(a, str, str2, null);
            scootersOverBleInteractor$tryWhereIsByBle$1.L$0 = null;
            scootersOverBleInteractor$tryWhereIsByBle$1.L$1 = null;
            scootersOverBleInteractor$tryWhereIsByBle$1.L$2 = a;
            scootersOverBleInteractor$tryWhereIsByBle$1.L$3 = a;
            scootersOverBleInteractor$tryWhereIsByBle$1.label = 2;
            if (c(scootersOverBleInteractor$tryWhereIsByBle$2$1, scootersOverBleInteractor$tryWhereIsByBle$1) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            ((com.yandex.go.scooters.ble.a) this).b();
            throw th;
        }
        scootersOverBleInteractor$tryWhereIsByBle$1 = new ScootersOverBleInteractor$tryWhereIsByBle$1(this, continuationImpl);
        Object obj2 = scootersOverBleInteractor$tryWhereIsByBle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOverBleInteractor$tryWhereIsByBle$1.label;
    }
}
