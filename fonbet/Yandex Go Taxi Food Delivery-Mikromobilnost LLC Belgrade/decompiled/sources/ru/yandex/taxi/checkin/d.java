package ru.yandex.taxi.checkin;

import com.yandex.go.taxi.order.y;
import defpackage.bvf0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pz40;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zn1;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d {
    public final y a;
    public final com.yandex.go.taxi.order.repositories.c b;
    public final tt2 c;
    public final i3y d;
    public final ike e = bvf0.b();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();

    public d(y yVar, com.yandex.go.taxi.order.repositories.c cVar, tt2 tt2Var, on2 on2Var) {
        this.a = yVar;
        this.b = cVar;
        this.c = tt2Var;
        this.d = kotlin.a.a(new zn1(on2Var, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, String str2, ContinuationImpl continuationImpl) {
        CheckInRepository$tryCheckIn$1 checkInRepository$tryCheckIn$1;
        int i;
        pz40 pz40Var;
        pz40 pz40Var2;
        Throwable th;
        dVar.getClass();
        try {
            if (continuationImpl instanceof CheckInRepository$tryCheckIn$1) {
                checkInRepository$tryCheckIn$1 = (CheckInRepository$tryCheckIn$1) continuationImpl;
                int i2 = checkInRepository$tryCheckIn$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    checkInRepository$tryCheckIn$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = checkInRepository$tryCheckIn$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = checkInRepository$tryCheckIn$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        LinkedHashMap linkedHashMap = dVar.h;
                        pz40Var = (pz40) linkedHashMap.get(str);
                        if (pz40Var == null) {
                            pz40Var = bvf0.c(CheckInButtonState.IDLE);
                            linkedHashMap.put(str, pz40Var);
                        }
                        try {
                            ((r0) pz40Var).l(CheckInButtonState.LOADING);
                            dVar.c.getClass();
                            sjh sjhVar = uyj.a;
                            mdh mdhVar = mdh.b;
                            CheckInRepository$tryCheckIn$2$1 checkInRepository$tryCheckIn$2$1 = new CheckInRepository$tryCheckIn$2$1(dVar, str, str2, null);
                            checkInRepository$tryCheckIn$1.L$0 = str;
                            checkInRepository$tryCheckIn$1.L$1 = null;
                            checkInRepository$tryCheckIn$1.L$2 = pz40Var;
                            checkInRepository$tryCheckIn$1.label = 1;
                            if (tje.k0(mdhVar, checkInRepository$tryCheckIn$2$1, checkInRepository$tryCheckIn$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            pz40Var2 = pz40Var;
                            jst.e.k(th, "cannot check in!");
                            ((r0) pz40Var2).l(CheckInButtonState.IDLE);
                            return zy11.a;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pz40Var2 = (pz40) checkInRepository$tryCheckIn$1.L$2;
                        String str3 = (String) checkInRepository$tryCheckIn$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            pz40Var = pz40Var2;
                            str = str3;
                        } catch (Throwable th3) {
                            th = th3;
                            jst.e.k(th, "cannot check in!");
                            ((r0) pz40Var2).l(CheckInButtonState.IDLE);
                            return zy11.a;
                        }
                    }
                    dVar.a.j(0L, str);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            dVar.a.j(0L, str);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        checkInRepository$tryCheckIn$1 = new CheckInRepository$tryCheckIn$1(dVar, continuationImpl);
        Object obj2 = checkInRepository$tryCheckIn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkInRepository$tryCheckIn$1.label;
    }
}
