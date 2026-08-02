package ru.yandex.taxi.scooters.domain;

import defpackage.a650;
import defpackage.avj0;
import defpackage.bbn0;
import defpackage.e4b1;
import defpackage.gjo;
import defpackage.ixi;
import defpackage.jl40;
import defpackage.jqm0;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.lto0;
import defpackage.nme;
import defpackage.ny61;
import defpackage.o9o;
import defpackage.q9o;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ukn0;
import defpackage.umm0;
import defpackage.wls;
import defpackage.y1b1;
import defpackage.y7o;
import defpackage.z56;
import defpackage.zuj0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ControlAction;
import ru.yandex.taxi.scooters.data.model.EvolveState;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.data.y;
import ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersCarControlFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersTryByBleException;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException;

/* loaded from: classes6.dex */
public final class b {
    public final zuj0 a;
    public final ru.yandex.taxi.scooters.data.mapper.c b;
    public final ru.yandex.taxi.scooters.data.b c;
    public final ukn0 d;
    public final ru.yandex.taxi.scooters.data.l e;
    public final e f;
    public final bbn0 g;
    public final y h;

    public b(zuj0 zuj0Var, ru.yandex.taxi.scooters.data.mapper.c cVar, ru.yandex.taxi.scooters.data.b bVar, ukn0 ukn0Var, ru.yandex.taxi.scooters.data.l lVar, e eVar, bbn0 bbn0Var, y yVar) {
        this.a = zuj0Var;
        this.b = cVar;
        this.c = bVar;
        this.d = ukn0Var;
        this.e = lVar;
        this.f = eVar;
        this.g = bbn0Var;
        this.h = yVar;
    }

    public static /* synthetic */ Object j(b bVar, String str, EvolveState evolveState, String str2, ContinuationImpl continuationImpl, int i) {
        return bVar.i(str, evolveState, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : Boolean.TRUE, null, continuationImpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|(1:(1:(1:(1:(2:14|15)(5:17|18|19|20|21))(5:22|23|(1:34)|27|(3:29|(5:32|18|19|20|21)|31)(4:33|19|20|21)))(4:35|36|(6:38|23|(1:25)|34|27|(0)(0))|31))(3:39|40|41))(3:42|43|(1:31)(1:45))))|51|6|7|8|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        r10.L$0 = null;
        r10.L$1 = null;
        r10.L$2 = null;
        r10.label = 2;
        r0 = r17.b.c(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (r0 != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1 scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1;
        int i;
        y7o y7oVar;
        String str;
        ScootersErrorCode scootersErrorCode;
        zzs zzsVar;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        zzs zzsVar2;
        ScootersErrorCode scootersErrorCode2;
        Boolean bool2;
        String str5;
        String str6;
        zzs zzsVar3;
        ScootersErrorCode scootersErrorCode3;
        if (continuationImpl instanceof ScootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1) {
            scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1 = (ScootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1) continuationImpl;
            int i2 = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1.label = i2 - Integer.MIN_VALUE;
                ScootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1 scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12 = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1;
                Object obj = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.label;
                lto0 lto0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.scooters.data.l lVar = this.e;
                    String sessionId = zuo0Var.getSessionId();
                    EvolveState evolveState = EvolveState.RESERVATION;
                    Boolean bool3 = Boolean.TRUE;
                    Boolean bool4 = Boolean.FALSE;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$0 = null;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.label = 1;
                    Object a = lVar.a(sessionId, evolveState, bool3, null, bool4, null, scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i == 2) {
                    kotlin.b.b(obj);
                    y7oVar = (y7o) obj;
                    String str7 = y7oVar.a;
                    String str8 = y7oVar.b;
                    zzs zzsVar4 = y7oVar.c;
                    ScootersErrorCode scootersErrorCode4 = y7oVar.d;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$0 = null;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$1 = null;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$2 = null;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$3 = y7oVar;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$4 = scootersErrorCode4;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$5 = zzsVar4;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$6 = str8;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$7 = str7;
                    scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.label = 3;
                    Object b = this.d.a.b(scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12);
                    if (b != coroutineSingletons) {
                        str = str7;
                        obj = b;
                        scootersErrorCode = scootersErrorCode4;
                        zzsVar = zzsVar4;
                        str2 = str8;
                        a650 a650Var = ((g0) obj).g;
                        Boolean valueOf = Boolean.valueOf(a650Var == null && jl40.l(a650Var.c, Boolean.TRUE));
                        if (!jl40.l(y7oVar.e, Boolean.FALSE)) {
                        }
                    }
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bool2 = (Boolean) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$8;
                    str5 = (String) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$7;
                    str6 = (String) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$6;
                    zzsVar3 = (zzs) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$5;
                    scootersErrorCode3 = (ScootersErrorCode) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$4;
                    kotlin.b.b(obj);
                    lto0Var = (lto0) obj;
                    bool = bool2;
                    str3 = str5;
                    str4 = str6;
                    zzsVar2 = zzsVar3;
                    scootersErrorCode2 = scootersErrorCode3;
                    throw new ScootersEvolvingFailedException(str3, str4, zzsVar2, scootersErrorCode2, bool, lto0Var, true);
                }
                str = (String) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$7;
                str2 = (String) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$6;
                zzsVar = (zzs) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$5;
                scootersErrorCode = (ScootersErrorCode) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$4;
                y7oVar = (y7o) scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$3;
                kotlin.b.b(obj);
                a650 a650Var2 = ((g0) obj).g;
                Boolean valueOf2 = Boolean.valueOf(a650Var2 == null && jl40.l(a650Var2.c, Boolean.TRUE));
                if (!jl40.l(y7oVar.e, Boolean.FALSE)) {
                    bool = valueOf2;
                    str3 = str;
                    str4 = str2;
                    zzsVar2 = zzsVar;
                    scootersErrorCode2 = scootersErrorCode;
                    throw new ScootersEvolvingFailedException(str3, str4, zzsVar2, scootersErrorCode2, bool, lto0Var, true);
                }
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$0 = null;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$1 = null;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$2 = null;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$3 = null;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$4 = scootersErrorCode;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$5 = zzsVar;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$6 = str2;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$7 = str;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.L$8 = valueOf2;
                scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12.label = 4;
                Object d = this.h.d(scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$12);
                if (d != coroutineSingletons) {
                    bool2 = valueOf2;
                    obj = d;
                    str5 = str;
                    str6 = str2;
                    zzsVar3 = zzsVar;
                    scootersErrorCode3 = scootersErrorCode;
                    lto0Var = (lto0) obj;
                    bool = bool2;
                    str3 = str5;
                    str4 = str6;
                    zzsVar2 = zzsVar3;
                    scootersErrorCode2 = scootersErrorCode3;
                    throw new ScootersEvolvingFailedException(str3, str4, zzsVar2, scootersErrorCode2, bool, lto0Var, true);
                }
            }
        }
        scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1 = new ScootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1(this, continuationImpl);
        ScootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1 scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$122 = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$1;
        Object obj2 = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$checkWhetherItIsPossibleToCompleteOrder$122.label;
        lto0 lto0Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        if (j(r1, r2, r3, r4, r5, 16) != r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (j(r1, r2, r3, r14, r5, 8) == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jqm0 jqm0Var, zuo0 zuo0Var, String str, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$completeOrder$1 scootersActiveOrderInteractor$completeOrder$1;
        int i;
        b bVar;
        Throwable th;
        String str2;
        try {
            if (continuationImpl instanceof ScootersActiveOrderInteractor$completeOrder$1) {
                scootersActiveOrderInteractor$completeOrder$1 = (ScootersActiveOrderInteractor$completeOrder$1) continuationImpl;
                int i2 = scootersActiveOrderInteractor$completeOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersActiveOrderInteractor$completeOrder$1.label = i2 - Integer.MIN_VALUE;
                    ScootersActiveOrderInteractor$completeOrder$1 scootersActiveOrderInteractor$completeOrder$12 = scootersActiveOrderInteractor$completeOrder$1;
                    Object obj = scootersActiveOrderInteractor$completeOrder$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersActiveOrderInteractor$completeOrder$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        try {
                            String sessionId = zuo0Var.getSessionId();
                            EvolveState evolveState = EvolveState.RESERVATION;
                            scootersActiveOrderInteractor$completeOrder$12.L$0 = jqm0Var;
                            scootersActiveOrderInteractor$completeOrder$12.L$1 = zuo0Var;
                            scootersActiveOrderInteractor$completeOrder$12.L$2 = str;
                            scootersActiveOrderInteractor$completeOrder$12.label = 1;
                            bVar = this;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                str = str;
                                if (th instanceof ScootersTryByBleException) {
                                    throw th;
                                }
                                ScootersActiveOrderInteractor$completeOrder$3$1 scootersActiveOrderInteractor$completeOrder$3$1 = new ScootersActiveOrderInteractor$completeOrder$3$1(th, null);
                                scootersActiveOrderInteractor$completeOrder$12.L$0 = null;
                                scootersActiveOrderInteractor$completeOrder$12.L$1 = zuo0Var;
                                scootersActiveOrderInteractor$completeOrder$12.L$2 = str;
                                scootersActiveOrderInteractor$completeOrder$12.L$3 = null;
                                scootersActiveOrderInteractor$completeOrder$12.L$4 = null;
                                scootersActiveOrderInteractor$completeOrder$12.label = 2;
                                if (bVar.g(jqm0Var, scootersActiveOrderInteractor$completeOrder$3$1, scootersActiveOrderInteractor$completeOrder$12) != coroutineSingletons) {
                                    str2 = str;
                                    String sessionId2 = zuo0Var.getSessionId();
                                    EvolveState evolveState2 = EvolveState.RESERVATION;
                                    scootersActiveOrderInteractor$completeOrder$12.L$0 = null;
                                    scootersActiveOrderInteractor$completeOrder$12.L$1 = null;
                                    scootersActiveOrderInteractor$completeOrder$12.L$2 = null;
                                    scootersActiveOrderInteractor$completeOrder$12.L$3 = null;
                                    scootersActiveOrderInteractor$completeOrder$12.L$4 = null;
                                    scootersActiveOrderInteractor$completeOrder$12.label = 3;
                                }
                                return coroutineSingletons;
                            }
                        } catch (Throwable th3) {
                            bVar = this;
                            th = th3;
                        }
                    } else if (i == 1) {
                        str = (String) scootersActiveOrderInteractor$completeOrder$12.L$2;
                        zuo0Var = (zuo0) scootersActiveOrderInteractor$completeOrder$12.L$1;
                        jqm0Var = (jqm0) scootersActiveOrderInteractor$completeOrder$12.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = this;
                            if (th instanceof ScootersTryByBleException) {
                            }
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        String str3 = (String) scootersActiveOrderInteractor$completeOrder$12.L$2;
                        zuo0Var = (zuo0) scootersActiveOrderInteractor$completeOrder$12.L$1;
                        kotlin.b.b(obj);
                        bVar = this;
                        str2 = str3;
                        String sessionId22 = zuo0Var.getSessionId();
                        EvolveState evolveState22 = EvolveState.RESERVATION;
                        scootersActiveOrderInteractor$completeOrder$12.L$0 = null;
                        scootersActiveOrderInteractor$completeOrder$12.L$1 = null;
                        scootersActiveOrderInteractor$completeOrder$12.L$2 = null;
                        scootersActiveOrderInteractor$completeOrder$12.L$3 = null;
                        scootersActiveOrderInteractor$completeOrder$12.L$4 = null;
                        scootersActiveOrderInteractor$completeOrder$12.label = 3;
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        scootersActiveOrderInteractor$completeOrder$1 = new ScootersActiveOrderInteractor$completeOrder$1(this, continuationImpl);
        ScootersActiveOrderInteractor$completeOrder$1 scootersActiveOrderInteractor$completeOrder$122 = scootersActiveOrderInteractor$completeOrder$1;
        Object obj2 = scootersActiveOrderInteractor$completeOrder$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$completeOrder$122.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (j(r1, r2, r3, null, r5, 20) != r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        if (j(r1, r2, r3, "accept", r5, 8) == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(jqm0 jqm0Var, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$completeOrderForce$1 scootersActiveOrderInteractor$completeOrderForce$1;
        int i;
        b bVar;
        Throwable th;
        zuo0 zuo0Var2;
        try {
            if (continuationImpl instanceof ScootersActiveOrderInteractor$completeOrderForce$1) {
                scootersActiveOrderInteractor$completeOrderForce$1 = (ScootersActiveOrderInteractor$completeOrderForce$1) continuationImpl;
                int i2 = scootersActiveOrderInteractor$completeOrderForce$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersActiveOrderInteractor$completeOrderForce$1.label = i2 - Integer.MIN_VALUE;
                    ScootersActiveOrderInteractor$completeOrderForce$1 scootersActiveOrderInteractor$completeOrderForce$12 = scootersActiveOrderInteractor$completeOrderForce$1;
                    Object obj = scootersActiveOrderInteractor$completeOrderForce$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersActiveOrderInteractor$completeOrderForce$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        try {
                            String sessionId = zuo0Var.getSessionId();
                            EvolveState evolveState = EvolveState.RESERVATION;
                            scootersActiveOrderInteractor$completeOrderForce$12.L$0 = jqm0Var;
                            scootersActiveOrderInteractor$completeOrderForce$12.L$1 = zuo0Var;
                            scootersActiveOrderInteractor$completeOrderForce$12.label = 1;
                            bVar = this;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (th instanceof ScootersTryByBleException) {
                                    throw th;
                                }
                                ScootersActiveOrderInteractor$completeOrderForce$3$1 scootersActiveOrderInteractor$completeOrderForce$3$1 = new ScootersActiveOrderInteractor$completeOrderForce$3$1(th, null);
                                scootersActiveOrderInteractor$completeOrderForce$12.L$0 = null;
                                scootersActiveOrderInteractor$completeOrderForce$12.L$1 = zuo0Var;
                                scootersActiveOrderInteractor$completeOrderForce$12.L$2 = null;
                                scootersActiveOrderInteractor$completeOrderForce$12.L$3 = null;
                                scootersActiveOrderInteractor$completeOrderForce$12.label = 2;
                                if (bVar.g(jqm0Var, scootersActiveOrderInteractor$completeOrderForce$3$1, scootersActiveOrderInteractor$completeOrderForce$12) != coroutineSingletons) {
                                    zuo0Var2 = zuo0Var;
                                    String sessionId2 = zuo0Var2.getSessionId();
                                    EvolveState evolveState2 = EvolveState.RESERVATION;
                                    scootersActiveOrderInteractor$completeOrderForce$12.L$0 = null;
                                    scootersActiveOrderInteractor$completeOrderForce$12.L$1 = null;
                                    scootersActiveOrderInteractor$completeOrderForce$12.L$2 = null;
                                    scootersActiveOrderInteractor$completeOrderForce$12.L$3 = null;
                                    scootersActiveOrderInteractor$completeOrderForce$12.label = 3;
                                }
                                return coroutineSingletons;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = this;
                        }
                    } else if (i == 1) {
                        zuo0Var = (zuo0) scootersActiveOrderInteractor$completeOrderForce$12.L$1;
                        jqm0Var = (jqm0) scootersActiveOrderInteractor$completeOrderForce$12.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = this;
                            if (th instanceof ScootersTryByBleException) {
                            }
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        zuo0Var2 = (zuo0) scootersActiveOrderInteractor$completeOrderForce$12.L$1;
                        kotlin.b.b(obj);
                        bVar = this;
                        String sessionId22 = zuo0Var2.getSessionId();
                        EvolveState evolveState22 = EvolveState.RESERVATION;
                        scootersActiveOrderInteractor$completeOrderForce$12.L$0 = null;
                        scootersActiveOrderInteractor$completeOrderForce$12.L$1 = null;
                        scootersActiveOrderInteractor$completeOrderForce$12.L$2 = null;
                        scootersActiveOrderInteractor$completeOrderForce$12.L$3 = null;
                        scootersActiveOrderInteractor$completeOrderForce$12.label = 3;
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        scootersActiveOrderInteractor$completeOrderForce$1 = new ScootersActiveOrderInteractor$completeOrderForce$1(this, continuationImpl);
        ScootersActiveOrderInteractor$completeOrderForce$1 scootersActiveOrderInteractor$completeOrderForce$122 = scootersActiveOrderInteractor$completeOrderForce$1;
        Object obj2 = scootersActiveOrderInteractor$completeOrderForce$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$completeOrderForce$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$depositHoldPollingIntervals$1 scootersActiveOrderInteractor$depositHoldPollingIntervals$1;
        int i;
        ixi ixiVar;
        List list;
        if (continuationImpl instanceof ScootersActiveOrderInteractor$depositHoldPollingIntervals$1) {
            scootersActiveOrderInteractor$depositHoldPollingIntervals$1 = (ScootersActiveOrderInteractor$depositHoldPollingIntervals$1) continuationImpl;
            int i2 = scootersActiveOrderInteractor$depositHoldPollingIntervals$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderInteractor$depositHoldPollingIntervals$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActiveOrderInteractor$depositHoldPollingIntervals$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderInteractor$depositHoldPollingIntervals$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersActiveOrderInteractor$depositHoldPollingIntervals$1.label = 1;
                    obj = this.d.a.b(scootersActiveOrderInteractor$depositHoldPollingIntervals$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ixiVar = ((g0) obj).l;
                List list2 = ixiVar == null ? ixiVar.b : null;
                if (y1b1.a(ixiVar) || (list = list2) == null || list.isEmpty()) {
                    return null;
                }
                List list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Long(TimeUnit.SECONDS.toMillis(((Number) it.next()).longValue())));
                }
                return arrayList;
            }
        }
        scootersActiveOrderInteractor$depositHoldPollingIntervals$1 = new ScootersActiveOrderInteractor$depositHoldPollingIntervals$1(this, continuationImpl);
        Object obj2 = scootersActiveOrderInteractor$depositHoldPollingIntervals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$depositHoldPollingIntervals$1.label;
        if (i != 0) {
        }
        ixiVar = ((g0) obj2).l;
        if (ixiVar == null) {
        }
        if (y1b1.a(ixiVar)) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(2:23|24))(2:27|28)|25|14|15))|41|6|7|8|(0)(0)|25|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (j(r8, r2, r3, null, r5, 20) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r8 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if ((r0 instanceof ru.yandex.taxi.scooters.domain.model.ScootersTryByBleException) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r0 = new ru.yandex.taxi.scooters.domain.ScootersActiveOrderInteractor$evolveToNextState$3$1(r0, r10, null);
        r5.L$0 = null;
        r5.L$1 = r10;
        r5.L$2 = null;
        r5.L$3 = null;
        r5.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r8.g(r9, r0, r5) != r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        r9 = r10;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ru.yandex.taxi.scooters.domain.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ru.yandex.taxi.scooters.domain.b] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(jqm0 jqm0Var, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$evolveToNextState$1 scootersActiveOrderInteractor$evolveToNextState$1;
        int i;
        if (continuationImpl instanceof ScootersActiveOrderInteractor$evolveToNextState$1) {
            scootersActiveOrderInteractor$evolveToNextState$1 = (ScootersActiveOrderInteractor$evolveToNextState$1) continuationImpl;
            int i2 = scootersActiveOrderInteractor$evolveToNextState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderInteractor$evolveToNextState$1.label = i2 - Integer.MIN_VALUE;
                ScootersActiveOrderInteractor$evolveToNextState$1 scootersActiveOrderInteractor$evolveToNextState$12 = scootersActiveOrderInteractor$evolveToNextState$1;
                Object obj = scootersActiveOrderInteractor$evolveToNextState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderInteractor$evolveToNextState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    umm0 umm0Var = new umm0(9);
                    ScootersActiveOrderInteractor$evolveToNextState$2$2 scootersActiveOrderInteractor$evolveToNextState$2$2 = new ScootersActiveOrderInteractor$evolveToNextState$2$2(this, zuo0Var, null);
                    scootersActiveOrderInteractor$evolveToNextState$12.L$0 = jqm0Var;
                    scootersActiveOrderInteractor$evolveToNextState$12.L$1 = zuo0Var;
                    scootersActiveOrderInteractor$evolveToNextState$12.label = 1;
                    Object f = f(umm0Var, scootersActiveOrderInteractor$evolveToNextState$2$2, scootersActiveOrderInteractor$evolveToNextState$12);
                    this = f;
                } else if (i == 1) {
                    zuo0Var = (zuo0) scootersActiveOrderInteractor$evolveToNextState$12.L$1;
                    jqm0Var = (jqm0) scootersActiveOrderInteractor$evolveToNextState$12.L$0;
                    kotlin.b.b(obj);
                    this = this;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    zuo0 zuo0Var2 = (zuo0) scootersActiveOrderInteractor$evolveToNextState$12.L$1;
                    kotlin.b.b(obj);
                    ?? r8 = this;
                    String sessionId = zuo0Var2.getSessionId();
                    EvolveState c = e4b1.c(zuo0Var2);
                    scootersActiveOrderInteractor$evolveToNextState$12.L$0 = null;
                    scootersActiveOrderInteractor$evolveToNextState$12.L$1 = null;
                    scootersActiveOrderInteractor$evolveToNextState$12.L$2 = null;
                    scootersActiveOrderInteractor$evolveToNextState$12.L$3 = null;
                    scootersActiveOrderInteractor$evolveToNextState$12.label = 3;
                }
                return zy11.a;
            }
        }
        scootersActiveOrderInteractor$evolveToNextState$1 = new ScootersActiveOrderInteractor$evolveToNextState$1(this, continuationImpl);
        ScootersActiveOrderInteractor$evolveToNextState$1 scootersActiveOrderInteractor$evolveToNextState$122 = scootersActiveOrderInteractor$evolveToNextState$1;
        Object obj2 = scootersActiveOrderInteractor$evolveToNextState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$evolveToNextState$122.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ru.yandex.taxi.scooters.domain.b] */
    /* JADX WARN: Type inference failed for: r9v3, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(umm0 umm0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$evolveToNextStateRequest$1 scootersActiveOrderInteractor$evolveToNextStateRequest$1;
        int i;
        umm0 umm0Var2;
        List list;
        if (continuationImpl instanceof ScootersActiveOrderInteractor$evolveToNextStateRequest$1) {
            scootersActiveOrderInteractor$evolveToNextStateRequest$1 = (ScootersActiveOrderInteractor$evolveToNextStateRequest$1) continuationImpl;
            int i2 = scootersActiveOrderInteractor$evolveToNextStateRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderInteractor$evolveToNextStateRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActiveOrderInteractor$evolveToNextStateRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderInteractor$evolveToNextStateRequest$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$0 = umm0Var;
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$1 = tlsVar;
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.label = 1;
                    obj = d(scootersActiveOrderInteractor$evolveToNextStateRequest$1);
                    umm0Var2 = umm0Var;
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    tlsVar = (tls) scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$1;
                    ?? r9 = (tls) scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$0;
                    kotlin.b.b(obj);
                    umm0Var2 = r9;
                }
                list = (List) obj;
                if (list == null) {
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$0 = null;
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$1 = null;
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$2 = null;
                    scootersActiveOrderInteractor$evolveToNextStateRequest$1.label = 2;
                    return new com.yandex.go.coroutines.f(Integer.MAX_VALUE, new o9o(list), tlsVar, umm0Var2).a(scootersActiveOrderInteractor$evolveToNextStateRequest$1) == obj2 ? obj2 : zy11Var;
                }
                scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$0 = null;
                scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$1 = null;
                scootersActiveOrderInteractor$evolveToNextStateRequest$1.L$2 = null;
                scootersActiveOrderInteractor$evolveToNextStateRequest$1.label = 3;
                if (new com.yandex.go.coroutines.f(Integer.MAX_VALUE, new q9o(1000L), tlsVar, umm0Var2).a(scootersActiveOrderInteractor$evolveToNextStateRequest$1) == obj2) {
                }
            }
        }
        scootersActiveOrderInteractor$evolveToNextStateRequest$1 = new ScootersActiveOrderInteractor$evolveToNextStateRequest$1(this, continuationImpl);
        Object obj3 = scootersActiveOrderInteractor$evolveToNextStateRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$evolveToNextStateRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(jqm0 jqm0Var, wls wlsVar, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$handleBleUsage$1 scootersActiveOrderInteractor$handleBleUsage$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersActiveOrderInteractor$handleBleUsage$1) {
                scootersActiveOrderInteractor$handleBleUsage$1 = (ScootersActiveOrderInteractor$handleBleUsage$1) continuationImpl;
                int i2 = scootersActiveOrderInteractor$handleBleUsage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersActiveOrderInteractor$handleBleUsage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersActiveOrderInteractor$handleBleUsage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersActiveOrderInteractor$handleBleUsage$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (jqm0Var.c()) {
                            scootersActiveOrderInteractor$handleBleUsage$1.L$0 = jqm0Var;
                            scootersActiveOrderInteractor$handleBleUsage$1.L$1 = wlsVar;
                            scootersActiveOrderInteractor$handleBleUsage$1.label = 1;
                            if (jqm0Var.b(scootersActiveOrderInteractor$handleBleUsage$1) == coroutineSingletons) {
                            }
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    wlsVar = (wls) scootersActiveOrderInteractor$handleBleUsage$1.L$1;
                    jqm0Var = (jqm0) scootersActiveOrderInteractor$handleBleUsage$1.L$0;
                    kotlin.b.b(obj);
                    scootersActiveOrderInteractor$handleBleUsage$1.L$0 = null;
                    scootersActiveOrderInteractor$handleBleUsage$1.L$1 = null;
                    scootersActiveOrderInteractor$handleBleUsage$1.label = 2;
                    return jqm0Var.a(wlsVar, scootersActiveOrderInteractor$handleBleUsage$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }
            if (i != 0) {
            }
            scootersActiveOrderInteractor$handleBleUsage$1.L$0 = null;
            scootersActiveOrderInteractor$handleBleUsage$1.L$1 = null;
            scootersActiveOrderInteractor$handleBleUsage$1.label = 2;
            if (jqm0Var.a(wlsVar, scootersActiveOrderInteractor$handleBleUsage$1) != coroutineSingletons) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (th instanceof AbortAttemptByBleException) {
                throw th;
            }
            jst.e.j(th);
            int i3 = kyh0.scooters_ble_attempt_failure_title;
            avj0 avj0Var = (avj0) this.a;
            throw new ScootersBleAttemptFailedException(avj0Var.h(i3), avj0Var.h(kyh0.scooters_ble_attempt_failure_subtitle));
        }
        scootersActiveOrderInteractor$handleBleUsage$1 = new ScootersActiveOrderInteractor$handleBleUsage$1(this, continuationImpl);
        Object obj2 = scootersActiveOrderInteractor$handleBleUsage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$handleBleUsage$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(2:26|(1:(1:(2:30|31)(4:32|33|34|35))(5:36|37|38|21|22))(3:39|40|41))(2:9|(1:11)(3:13|14|(2:16|17)))|18|(3:20|21|22)(2:23|24)))|58|6|7|(0)(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if ((r12 instanceof ru.yandex.taxi.scooters.domain.model.ScootersTryByBleException) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        r2 = new ru.yandex.taxi.scooters.domain.ScootersActiveOrderInteractor$openLock$3$1(r12, null);
        r0.L$0 = null;
        r0.L$1 = r11;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (g(r10, r2, r0) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        defpackage.jst.e.k(r12, "Error while car control request");
        r9 = r9.b;
        r0.L$0 = null;
        r0.L$1 = r11;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
        r12 = r9.c(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        if (r12 != r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8 A[Catch: all -> 0x006e, CancellationException -> 0x0070, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0070, all -> 0x006e, blocks: (B:41:0x006a, B:18:0x00a8, B:23:0x00b8, B:24:0x00c1, B:14:0x0090), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /* JADX WARN: Type inference failed for: r9v0, types: [ru.yandex.taxi.scooters.domain.b] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9, types: [zuo0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(jqm0 jqm0Var, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$openLock$1 scootersActiveOrderInteractor$openLock$1;
        int i;
        String sessionId;
        z56 z56Var;
        if (continuationImpl instanceof ScootersActiveOrderInteractor$openLock$1) {
            scootersActiveOrderInteractor$openLock$1 = (ScootersActiveOrderInteractor$openLock$1) continuationImpl;
            int i2 = scootersActiveOrderInteractor$openLock$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderInteractor$openLock$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActiveOrderInteractor$openLock$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderInteractor$openLock$1.label;
                zy11 zy11Var = zy11.a;
                bbn0 bbn0Var = this.g;
                if (i == 0) {
                    try {
                        if (i != 1) {
                            if (i == 2) {
                                zuo0 zuo0Var2 = (zuo0) scootersActiveOrderInteractor$openLock$1.L$1;
                                kotlin.b.b(obj);
                                sessionId = zuo0Var2.getSessionId();
                                bbn0Var.d(Boolean.FALSE, sessionId);
                                return zy11Var;
                            }
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            throw new ScootersCarControlFailedException(((y7o) obj).d);
                        }
                        zuo0Var = (zuo0) scootersActiveOrderInteractor$openLock$1.L$1;
                        jqm0Var = (jqm0) scootersActiveOrderInteractor$openLock$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th) {
                            th = th;
                            this = zuo0Var;
                            bbn0Var.d(Boolean.FALSE, this.getSessionId());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    kotlin.b.b(obj);
                    if (((Boolean) bbn0Var.b(zuo0Var.getSessionId())).booleanValue()) {
                        return zy11Var;
                    }
                    bbn0Var.d(Boolean.TRUE, zuo0Var.getSessionId());
                    ru.yandex.taxi.scooters.data.b bVar = this.c;
                    String j = zuo0Var.j();
                    scootersActiveOrderInteractor$openLock$1.L$0 = jqm0Var;
                    scootersActiveOrderInteractor$openLock$1.L$1 = zuo0Var;
                    scootersActiveOrderInteractor$openLock$1.label = 1;
                    bVar.getClass();
                    obj = bVar.a(j, ControlAction.OPEN_LOCK, scootersActiveOrderInteractor$openLock$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                z56Var = ((nme) obj).a;
                if (z56Var == null) {
                    throw new ScootersTryByBleException(z56Var.a, z56Var.b);
                }
                sessionId = zuo0Var.getSessionId();
                bbn0Var.d(Boolean.FALSE, sessionId);
                return zy11Var;
            }
        }
        scootersActiveOrderInteractor$openLock$1 = new ScootersActiveOrderInteractor$openLock$1(this, continuationImpl);
        Object obj2 = scootersActiveOrderInteractor$openLock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$openLock$1.label;
        zy11 zy11Var2 = zy11.a;
        bbn0 bbn0Var2 = this.g;
        if (i == 0) {
        }
        z56Var = ((nme) obj2).a;
        if (z56Var == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(5:5|6|7|8|9))|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x008a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x008b, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0243, code lost:
    
        r10.L$0 = null;
        r10.L$1 = null;
        r10.L$2 = null;
        r10.L$3 = null;
        r10.L$4 = null;
        r10.L$5 = r1;
        r10.L$6 = null;
        r10.L$7 = null;
        r10.L$8 = null;
        r10.L$9 = null;
        r10.L$10 = null;
        r10.L$11 = null;
        r10.L$12 = null;
        r10.label = 6;
        r0 = r12.a.a(r10);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0266, code lost:
    
        if (r0 != r2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0165, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0166, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0200 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:19:0x0085, B:20:0x022a, B:22:0x0232, B:25:0x023b, B:26:0x0240, B:29:0x00be, B:30:0x01d2, B:32:0x01d8, B:35:0x01e5, B:38:0x0200, B:45:0x00df, B:46:0x019a, B:67:0x0174, B:69:0x0178, B:72:0x0241, B:86:0x0242, B:57:0x0114, B:58:0x0143, B:63:0x0167, B:64:0x0170, B:75:0x0120), top: B:8:0x002b, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149 A[Catch: all -> 0x0164, CancellationException -> 0x0165, TRY_ENTER, TryCatch #8 {CancellationException -> 0x0165, all -> 0x0164, blocks: (B:51:0x00fc, B:52:0x0162, B:60:0x0149), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167 A[Catch: all -> 0x0118, CancellationException -> 0x011a, TRY_ENTER, TryCatch #3 {all -> 0x0118, blocks: (B:57:0x0114, B:58:0x0143, B:63:0x0167, B:64:0x0170), top: B:56:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0178 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:19:0x0085, B:20:0x022a, B:22:0x0232, B:25:0x023b, B:26:0x0240, B:29:0x00be, B:30:0x01d2, B:32:0x01d8, B:35:0x01e5, B:38:0x0200, B:45:0x00df, B:46:0x019a, B:67:0x0174, B:69:0x0178, B:72:0x0241, B:86:0x0242, B:57:0x0114, B:58:0x0143, B:63:0x0167, B:64:0x0170, B:75:0x0120), top: B:8:0x002b, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:19:0x0085, B:20:0x022a, B:22:0x0232, B:25:0x023b, B:26:0x0240, B:29:0x00be, B:30:0x01d2, B:32:0x01d8, B:35:0x01e5, B:38:0x0200, B:45:0x00df, B:46:0x019a, B:67:0x0174, B:69:0x0178, B:72:0x0241, B:86:0x0242, B:57:0x0114, B:58:0x0143, B:63:0x0167, B:64:0x0170, B:75:0x0120), top: B:8:0x002b, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [ru.yandex.taxi.scooters.domain.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, EvolveState evolveState, String str2, Boolean bool, Boolean bool2, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1 scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1;
        int i;
        EvolveState evolveState2;
        z56 z56Var;
        y7o y7oVar;
        String str3;
        zzs zzsVar;
        ScootersErrorCode scootersErrorCode;
        Object b;
        String str4;
        EvolveState evolveState3;
        Boolean bool3;
        EvolveState evolveState4;
        Boolean bool4;
        lto0 lto0Var;
        ?? r1 = this;
        try {
            try {
                if (continuationImpl instanceof ScootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1) {
                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1 = (ScootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1) continuationImpl;
                    int i2 = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1.label = i2 - Integer.MIN_VALUE;
                        ScootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1 scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12 = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1;
                        Object obj = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label;
                        e eVar = r1.f;
                        zy11 zy11Var = zy11.a;
                        switch (i) {
                            case 0:
                                kotlin.b.b(obj);
                                try {
                                    ru.yandex.taxi.scooters.data.l lVar = r1.e;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$0 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1 = evolveState;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$2 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$3 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$4 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label = 1;
                                    obj = lVar.a(str, evolveState, null, str2, bool, bool2, scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12);
                                    if (obj != coroutineSingletons) {
                                        evolveState2 = evolveState;
                                        z56Var = ((gjo) obj).a;
                                        if (z56Var == null) {
                                            throw new ScootersTryByBleException(z56Var.a, z56Var.b);
                                        }
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$0 = null;
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1 = null;
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$2 = null;
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$3 = null;
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$4 = null;
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$5 = zy11Var;
                                        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label = 2;
                                        obj = eVar.a.a(scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12);
                                        if (obj == coroutineSingletons) {
                                        }
                                        return zy11Var;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    evolveState2 = evolveState;
                                    if (!(th instanceof ScootersTryByBleException)) {
                                        throw th;
                                    }
                                    jst.e.k(th, "Error while evolve state");
                                    ru.yandex.taxi.scooters.data.mapper.c cVar = r1.b;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$0 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1 = evolveState2;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$2 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$3 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$4 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$5 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$6 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label = 3;
                                    obj = cVar.c(th, scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    y7oVar = (y7o) obj;
                                    String str5 = y7oVar.a;
                                    str3 = y7oVar.b;
                                    zzsVar = y7oVar.c;
                                    scootersErrorCode = y7oVar.d;
                                    ukn0 ukn0Var = r1.d;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$0 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1 = evolveState2;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$2 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$3 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$4 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$5 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$6 = y7oVar;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$7 = scootersErrorCode;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$8 = zzsVar;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$9 = str3;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$10 = str5;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$11 = null;
                                    scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label = 4;
                                    b = ukn0Var.a.b(scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12);
                                    if (b != coroutineSingletons) {
                                    }
                                }
                                return coroutineSingletons;
                            case 1:
                                evolveState2 = (EvolveState) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1;
                                try {
                                    kotlin.b.b(obj);
                                    z56Var = ((gjo) obj).a;
                                    if (z56Var == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (!(th instanceof ScootersTryByBleException)) {
                                    }
                                }
                                break;
                            case 2:
                                kotlin.b.b(obj);
                                return zy11Var;
                            case 3:
                                evolveState2 = (EvolveState) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1;
                                kotlin.b.b(obj);
                                y7oVar = (y7o) obj;
                                String str52 = y7oVar.a;
                                str3 = y7oVar.b;
                                zzsVar = y7oVar.c;
                                scootersErrorCode = y7oVar.d;
                                ukn0 ukn0Var2 = r1.d;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$0 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1 = evolveState2;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$2 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$3 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$4 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$5 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$6 = y7oVar;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$7 = scootersErrorCode;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$8 = zzsVar;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$9 = str3;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$10 = str52;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$11 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label = 4;
                                b = ukn0Var2.a.b(scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12);
                                if (b != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                EvolveState evolveState5 = evolveState2;
                                str4 = str52;
                                obj = b;
                                evolveState3 = evolveState5;
                                a650 a650Var = ((g0) obj).g;
                                Boolean valueOf = Boolean.valueOf(a650Var == null && jl40.l(a650Var.c, Boolean.TRUE));
                                if (!jl40.l(y7oVar.e, Boolean.FALSE)) {
                                    bool4 = valueOf;
                                    lto0Var = null;
                                    throw new ScootersEvolvingFailedException(str4, str3, zzsVar, scootersErrorCode, bool4, lto0Var, evolveState3 == EvolveState.RESERVATION);
                                }
                                y yVar = r1.h;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$0 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1 = evolveState3;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$2 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$3 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$4 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$5 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$6 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$7 = scootersErrorCode;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$8 = zzsVar;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$9 = str3;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$10 = str4;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$11 = null;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$12 = valueOf;
                                scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.label = 5;
                                Object d = yVar.d(scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12);
                                if (d == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                bool3 = valueOf;
                                obj = d;
                                evolveState4 = evolveState3;
                                lto0Var = (lto0) obj;
                                bool4 = bool3;
                                evolveState3 = evolveState4;
                                throw new ScootersEvolvingFailedException(str4, str3, zzsVar, scootersErrorCode, bool4, lto0Var, evolveState3 == EvolveState.RESERVATION);
                            case 4:
                                str4 = (String) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$10;
                                str3 = (String) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$9;
                                zzsVar = (zzs) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$8;
                                scootersErrorCode = (ScootersErrorCode) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$7;
                                y7oVar = (y7o) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$6;
                                evolveState3 = (EvolveState) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1;
                                kotlin.b.b(obj);
                                a650 a650Var2 = ((g0) obj).g;
                                if (a650Var2 == null) {
                                    break;
                                }
                                Boolean valueOf2 = Boolean.valueOf(a650Var2 == null && jl40.l(a650Var2.c, Boolean.TRUE));
                                if (!jl40.l(y7oVar.e, Boolean.FALSE)) {
                                }
                                break;
                            case 5:
                                bool3 = (Boolean) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$12;
                                str4 = (String) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$10;
                                str3 = (String) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$9;
                                zzsVar = (zzs) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$8;
                                scootersErrorCode = (ScootersErrorCode) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$7;
                                evolveState4 = (EvolveState) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$1;
                                kotlin.b.b(obj);
                                lto0Var = (lto0) obj;
                                bool4 = bool3;
                                evolveState3 = evolveState4;
                                throw new ScootersEvolvingFailedException(str4, str3, zzsVar, scootersErrorCode, bool4, lto0Var, evolveState3 == EvolveState.RESERVATION);
                            case 6:
                                Throwable th3 = (Throwable) scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$12.L$5;
                                kotlin.b.b(obj);
                                r1 = th3;
                                throw r1;
                            default:
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (i) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused) {
            throw r1;
        }
        scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1 = new ScootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1(r1, continuationImpl);
        ScootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1 scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$122 = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$1;
        Object obj2 = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$tryEvolveToAndRequestSessionState$122.label;
        e eVar2 = r1.f;
        zy11 zy11Var2 = zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(2:26|(1:(1:(2:30|31)(4:32|33|34|35))(5:36|37|38|21|22))(3:39|40|41))(2:9|(1:11)(3:13|14|(2:16|17)))|18|(3:20|21|22)(2:23|24)))|58|6|7|(0)(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if ((r12 instanceof ru.yandex.taxi.scooters.domain.model.ScootersTryByBleException) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        r2 = new ru.yandex.taxi.scooters.domain.ScootersActiveOrderInteractor$whereIsCommand$3$1(r12, null);
        r0.L$0 = null;
        r0.L$1 = r11;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (g(r10, r2, r0) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        defpackage.jst.e.k(r12, "Error while car control request");
        r9 = r9.b;
        r0.L$0 = null;
        r0.L$1 = r11;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
        r12 = r9.c(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        if (r12 != r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8 A[Catch: all -> 0x006e, CancellationException -> 0x0070, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0070, all -> 0x006e, blocks: (B:41:0x006a, B:18:0x00a8, B:23:0x00b8, B:24:0x00c1, B:14:0x0090), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /* JADX WARN: Type inference failed for: r9v0, types: [ru.yandex.taxi.scooters.domain.b] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9, types: [zuo0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(jqm0 jqm0Var, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersActiveOrderInteractor$whereIsCommand$1 scootersActiveOrderInteractor$whereIsCommand$1;
        int i;
        String sessionId;
        z56 z56Var;
        if (continuationImpl instanceof ScootersActiveOrderInteractor$whereIsCommand$1) {
            scootersActiveOrderInteractor$whereIsCommand$1 = (ScootersActiveOrderInteractor$whereIsCommand$1) continuationImpl;
            int i2 = scootersActiveOrderInteractor$whereIsCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderInteractor$whereIsCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActiveOrderInteractor$whereIsCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderInteractor$whereIsCommand$1.label;
                zy11 zy11Var = zy11.a;
                bbn0 bbn0Var = this.g;
                if (i == 0) {
                    try {
                        if (i != 1) {
                            if (i == 2) {
                                zuo0 zuo0Var2 = (zuo0) scootersActiveOrderInteractor$whereIsCommand$1.L$1;
                                kotlin.b.b(obj);
                                sessionId = zuo0Var2.getSessionId();
                                bbn0Var.d(Boolean.FALSE, sessionId);
                                return zy11Var;
                            }
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            throw new ScootersCarControlFailedException(((y7o) obj).d);
                        }
                        zuo0Var = (zuo0) scootersActiveOrderInteractor$whereIsCommand$1.L$1;
                        jqm0Var = (jqm0) scootersActiveOrderInteractor$whereIsCommand$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th) {
                            th = th;
                            this = zuo0Var;
                            bbn0Var.d(Boolean.FALSE, this.getSessionId());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    kotlin.b.b(obj);
                    if (((Boolean) bbn0Var.b(zuo0Var.getSessionId())).booleanValue()) {
                        return zy11Var;
                    }
                    bbn0Var.d(Boolean.TRUE, zuo0Var.getSessionId());
                    ru.yandex.taxi.scooters.data.b bVar = this.c;
                    String j = zuo0Var.j();
                    scootersActiveOrderInteractor$whereIsCommand$1.L$0 = jqm0Var;
                    scootersActiveOrderInteractor$whereIsCommand$1.L$1 = zuo0Var;
                    scootersActiveOrderInteractor$whereIsCommand$1.label = 1;
                    bVar.getClass();
                    obj = bVar.a(j, ControlAction.WHERE_IS, scootersActiveOrderInteractor$whereIsCommand$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                z56Var = ((nme) obj).a;
                if (z56Var == null) {
                    throw new ScootersTryByBleException(z56Var.a, z56Var.b);
                }
                sessionId = zuo0Var.getSessionId();
                bbn0Var.d(Boolean.FALSE, sessionId);
                return zy11Var;
            }
        }
        scootersActiveOrderInteractor$whereIsCommand$1 = new ScootersActiveOrderInteractor$whereIsCommand$1(this, continuationImpl);
        Object obj2 = scootersActiveOrderInteractor$whereIsCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderInteractor$whereIsCommand$1.label;
        zy11 zy11Var2 = zy11.a;
        bbn0 bbn0Var2 = this.g;
        if (i == 0) {
        }
        z56Var = ((nme) obj2).a;
        if (z56Var == null) {
        }
    }
}
