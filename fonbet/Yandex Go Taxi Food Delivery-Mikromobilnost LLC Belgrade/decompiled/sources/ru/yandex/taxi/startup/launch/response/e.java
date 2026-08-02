package ru.yandex.taxi.startup.launch.response;

import defpackage.ffx;
import defpackage.fxx;
import defpackage.h3y;
import defpackage.j35;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.startup.launch.k;

/* loaded from: classes10.dex */
public final class e {
    public final h3y a;
    public final h3y b;
    public final k c;
    public final tt2 d;
    public final n0 e;
    public final n0 f;
    public final AtomicInteger g;

    public e(h3y h3yVar, h3y h3yVar2, k kVar, tt2 tt2Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = kVar;
        this.d = tt2Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.e = b;
        this.f = b;
        this.g = new AtomicInteger();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, int i, owx owxVar, ContinuationImpl continuationImpl) {
        LaunchResponseProcessor$process$4 launchResponseProcessor$process$4;
        int i2;
        owx owxVar2;
        Iterator it;
        int i3;
        owx owxVar3;
        k kVar = eVar.c;
        if (continuationImpl instanceof LaunchResponseProcessor$process$4) {
            launchResponseProcessor$process$4 = (LaunchResponseProcessor$process$4) continuationImpl;
            int i4 = launchResponseProcessor$process$4.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                launchResponseProcessor$process$4.label = i4 - Integer.MIN_VALUE;
                Object obj = launchResponseProcessor$process$4.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = launchResponseProcessor$process$4.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    kVar.d(i);
                    owxVar2 = owxVar;
                    it = v4r0.h((Set) eVar.a.get(), (Iterable) eVar.b.get()).iterator();
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = launchResponseProcessor$process$4.I$0;
                        owxVar3 = (owx) launchResponseProcessor$process$4.L$0;
                        kotlin.b.b(obj);
                        kVar.g(i3);
                        return owxVar3;
                    }
                    i = launchResponseProcessor$process$4.I$0;
                    it = (Iterator) launchResponseProcessor$process$4.L$2;
                    owx owxVar4 = (owx) launchResponseProcessor$process$4.L$0;
                    kotlin.b.b(obj);
                    owxVar2 = owxVar4;
                }
                while (true) {
                    if (it.hasNext()) {
                        launchResponseProcessor$process$4.L$0 = owxVar2;
                        launchResponseProcessor$process$4.L$1 = null;
                        launchResponseProcessor$process$4.L$2 = null;
                        launchResponseProcessor$process$4.L$3 = null;
                        launchResponseProcessor$process$4.I$0 = i;
                        launchResponseProcessor$process$4.label = 2;
                        kVar.i(i);
                        if (eVar.e.emit(new fxx(owxVar2), launchResponseProcessor$process$4) != obj2) {
                            i3 = i;
                            owxVar3 = owxVar2;
                        }
                    } else {
                        j35 j35Var = (j35) it.next();
                        String name = j35Var.getName();
                        tls launchResponseProcessor$process$5 = new LaunchResponseProcessor$process$5(j35Var, owxVar2, null);
                        launchResponseProcessor$process$4.L$0 = owxVar2;
                        launchResponseProcessor$process$4.L$1 = null;
                        launchResponseProcessor$process$4.L$2 = it;
                        launchResponseProcessor$process$4.L$3 = null;
                        launchResponseProcessor$process$4.I$0 = i;
                        launchResponseProcessor$process$4.label = 1;
                        if (eVar.c(i, name, launchResponseProcessor$process$5, launchResponseProcessor$process$4) == obj2) {
                            break;
                        }
                    }
                }
                return obj2;
            }
        }
        launchResponseProcessor$process$4 = new LaunchResponseProcessor$process$4(eVar, continuationImpl);
        Object obj3 = launchResponseProcessor$process$4.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = launchResponseProcessor$process$4.label;
        if (i2 != 0) {
        }
        while (true) {
            if (it.hasNext()) {
            }
        }
        return obj22;
    }

    public final Object b(owx owxVar, Continuation continuation) {
        this.d.getClass();
        return tje.k0(uyj.a, new LaunchResponseProcessor$process$3(this, owxVar, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r5.h(r6, r7);
        defpackage.jst.e.k(r8, "Failed to process launch response in delegate " + r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, String str, tls tlsVar, ContinuationImpl continuationImpl) {
        LaunchResponseProcessor$processOnDelegate$1 launchResponseProcessor$processOnDelegate$1;
        int i2;
        if (continuationImpl instanceof LaunchResponseProcessor$processOnDelegate$1) {
            launchResponseProcessor$processOnDelegate$1 = (LaunchResponseProcessor$processOnDelegate$1) continuationImpl;
            int i3 = launchResponseProcessor$processOnDelegate$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                launchResponseProcessor$processOnDelegate$1.label = i3 - Integer.MIN_VALUE;
                Object obj = launchResponseProcessor$processOnDelegate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = launchResponseProcessor$processOnDelegate$1.label;
                k kVar = this.c;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    kVar.c(i, str);
                    launchResponseProcessor$processOnDelegate$1.L$0 = str;
                    launchResponseProcessor$processOnDelegate$1.L$1 = null;
                    launchResponseProcessor$processOnDelegate$1.I$0 = i;
                    launchResponseProcessor$processOnDelegate$1.label = 1;
                    if (((LaunchResponseProcessor$process$5) tlsVar).invoke(launchResponseProcessor$processOnDelegate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = launchResponseProcessor$processOnDelegate$1.I$0;
                    str = (String) launchResponseProcessor$processOnDelegate$1.L$0;
                    kotlin.b.b(obj);
                }
                kVar.f(i, str);
                return zy11.a;
            }
        }
        launchResponseProcessor$processOnDelegate$1 = new LaunchResponseProcessor$processOnDelegate$1(this, continuationImpl);
        Object obj2 = launchResponseProcessor$processOnDelegate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = launchResponseProcessor$processOnDelegate$1.label;
        k kVar2 = this.c;
        if (i2 != 0) {
        }
        kVar2.f(i, str);
        return zy11.a;
    }
}
