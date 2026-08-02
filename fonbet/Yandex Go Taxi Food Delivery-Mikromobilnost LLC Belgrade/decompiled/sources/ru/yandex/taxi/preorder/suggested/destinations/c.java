package ru.yandex.taxi.preorder.suggested.destinations;

import com.yandex.go.mainscreen.superapp.address.ExpectedDestinationsApi;
import defpackage.am2;
import defpackage.aqo;
import defpackage.ck;
import defpackage.cmt;
import defpackage.dqo;
import defpackage.eqe;
import defpackage.fc00;
import defpackage.ffx;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.rol0;
import defpackage.tt2;
import defpackage.uui;
import defpackage.uyj;
import defpackage.xpo;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.am.g;

/* loaded from: classes9.dex */
public final class c {
    public final tt2 a;
    public final g b;
    public final ru.yandex.taxi.launch.c c;
    public final eqe d;
    public final i3y e;
    public am2 f;
    public final Object g = new Object();
    public final n0 h;
    public final n0 i;

    public c(on2 on2Var, tt2 tt2Var, g gVar, ru.yandex.taxi.launch.c cVar, eqe eqeVar) {
        this.a = tt2Var;
        this.b = gVar;
        this.c = cVar;
        this.d = eqeVar;
        this.e = kotlin.a.a(new ck(on2Var, 8));
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.h = ffx.b(1, 1, bufferOverflow);
        this.i = ffx.b(1, 1, bufferOverflow);
    }

    public static final xpo a(c cVar, aqo aqoVar) {
        synchronized (cVar.g) {
            am2 am2Var = cVar.f;
            if (am2Var == null || !am2Var.m(aqoVar.a(), aqoVar.b())) {
                return null;
            }
            return (xpo) am2Var.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, aqo aqoVar, boolean z, ContinuationImpl continuationImpl) {
        ExpectedDestinationsHelper$getExpectedDestinationsFromServer$1 expectedDestinationsHelper$getExpectedDestinationsFromServer$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof ExpectedDestinationsHelper$getExpectedDestinationsFromServer$1) {
            expectedDestinationsHelper$getExpectedDestinationsFromServer$1 = (ExpectedDestinationsHelper$getExpectedDestinationsFromServer$1) continuationImpl;
            int i2 = expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expectedDestinationsHelper$getExpectedDestinationsFromServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label;
                am2 am2Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.launch.c cVar2 = cVar.c;
                    expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$0 = aqoVar;
                    expectedDestinationsHelper$getExpectedDestinationsFromServer$1.Z$0 = z;
                    expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label = 1;
                    obj = cVar2.c(expectedDestinationsHelper$getExpectedDestinationsFromServer$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aqoVar = (aqo) expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$0;
                        kotlin.b.b(obj);
                        xpo xpoVar = (xpo) obj;
                        synchronized (cVar.g) {
                            try {
                                if (xpoVar.getC() != null) {
                                    am2Var = new am2();
                                    am2Var.a = xpoVar;
                                    am2Var.b = aqoVar.a();
                                    am2Var.c = aqoVar.b();
                                }
                                cVar.f = am2Var;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xpoVar;
                    }
                    z = expectedDestinationsHelper$getExpectedDestinationsFromServer$1.Z$0;
                    aqoVar = (aqo) expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$0;
                    kotlin.b.b(obj);
                }
                cmt<xpo> a = ((ExpectedDestinationsApi) cVar.e.getValue()).a(new dqo(aqoVar.a(), (String) obj, aqoVar.c(), aqoVar.b()));
                expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$0 = aqoVar;
                expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$1 = null;
                expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$2 = null;
                expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$3 = null;
                expectedDestinationsHelper$getExpectedDestinationsFromServer$1.Z$0 = z;
                if (z) {
                    expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label = 3;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, expectedDestinationsHelper$getExpectedDestinationsFromServer$1);
                } else {
                    expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.d(a, expectedDestinationsHelper$getExpectedDestinationsFromServer$1);
                }
            }
        }
        expectedDestinationsHelper$getExpectedDestinationsFromServer$1 = new ExpectedDestinationsHelper$getExpectedDestinationsFromServer$1(cVar, continuationImpl);
        Object obj2 = expectedDestinationsHelper$getExpectedDestinationsFromServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expectedDestinationsHelper$getExpectedDestinationsFromServer$1.label;
        am2 am2Var2 = null;
        if (i != 0) {
        }
        cmt<xpo> a2 = ((ExpectedDestinationsApi) cVar.e.getValue()).a(new dqo(aqoVar.a(), (String) obj2, aqoVar.c(), aqoVar.b()));
        expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$0 = aqoVar;
        expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$1 = null;
        expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$2 = null;
        expectedDestinationsHelper$getExpectedDestinationsFromServer$1.L$3 = null;
        expectedDestinationsHelper$getExpectedDestinationsFromServer$1.Z$0 = z;
        if (z) {
        }
    }

    public static ArrayList c(int i, List list) {
        return i <= 0 ? new ArrayList(list) : new ArrayList(list.subList(0, (int) Math.min(i, list.size())));
    }

    public final Object d(zzs zzsVar, String str, String str2, Continuation continuation) {
        this.i.g(fc00.c);
        b bVar = new b(new rol0(new ExpectedDestinationsHelper$expectedDestinations$1(this, new aqo(zzsVar, str, str2), null)), this);
        this.a.getClass();
        return new o(e.F(bVar, uyj.a), new ExpectedDestinationsHelper$requestExpectedDestinations$$inlined$safeCollect$1()).collect(new uui(13, this), continuation);
    }
}
