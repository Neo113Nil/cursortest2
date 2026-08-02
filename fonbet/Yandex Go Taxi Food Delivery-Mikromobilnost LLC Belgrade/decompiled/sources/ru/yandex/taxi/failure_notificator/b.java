package ru.yandex.taxi.failure_notificator;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.avj0;
import defpackage.b9p;
import defpackage.bl60;
import defpackage.bvf0;
import defpackage.c9p;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.g050;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.hhf;
import defpackage.ike;
import defpackage.j9s0;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rs50;
import defpackage.sjh;
import defpackage.spt;
import defpackage.ss50;
import defpackage.tje;
import defpackage.ts50;
import defpackage.tt2;
import defpackage.us50;
import defpackage.uyj;
import defpackage.v060;
import defpackage.w511;
import defpackage.x060;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;

/* loaded from: classes9.dex */
public final class b implements hhf {
    public pzt0 A;
    public final AtomicReference B;
    public volatile us50 C;
    public volatile j9s0 D;
    public pzt0 E;
    public pzt0 F;
    public final ConcurrentHashMap.KeySetView G;
    public final kotlinx.coroutines.sync.a H;
    public final zuj0 a;
    public final c b;
    public final spt c;
    public final c9p w;
    public final ike x;
    public final r0 y;
    public final gci0 z;

    public b(Lifecycle lifecycle, tt2 tt2Var, zuj0 zuj0Var, c cVar, com.yandex.go.navigation.screen.c cVar2, spt sptVar, c9p c9pVar) {
        this.a = zuj0Var;
        this.b = cVar;
        this.c = sptVar;
        this.w = c9pVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(mdh.b);
        this.x = a;
        r0 c = bvf0.c(new bl60(15));
        this.y = c;
        this.z = e.d(c);
        this.B = new AtomicReference(Screen.NONE);
        this.C = new ts50(0);
        this.D = spt.b;
        this.G = new ConcurrentHashMap().keySet(zy11.a);
        this.H = gtq0.a();
        cVar2.a(this);
        tje.N(a, null, null, new FailureNotificatorRepository$special$$inlined$safeCollectIn$1(lifecycle.c(), null, this), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x006a, code lost:
    
        if (r13 == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0093, B:34:0x009e), top: B:31:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, us50 us50Var, Continuation continuation) {
        FailureNotificatorRepository$handleEvent$1 failureNotificatorRepository$handleEvent$1;
        Object obj;
        int i;
        us50 us50Var2;
        int i2;
        us50 us50Var3;
        g050 g050Var;
        pzt0 pzt0Var;
        us50 us50Var4;
        ConcurrentHashMap.KeySetView keySetView = bVar.G;
        if (continuation instanceof FailureNotificatorRepository$handleEvent$1) {
            failureNotificatorRepository$handleEvent$1 = (FailureNotificatorRepository$handleEvent$1) continuation;
            int i3 = failureNotificatorRepository$handleEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                failureNotificatorRepository$handleEvent$1.label = i3 - Integer.MIN_VALUE;
                obj = failureNotificatorRepository$handleEvent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = failureNotificatorRepository$handleEvent$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    failureNotificatorRepository$handleEvent$1.L$0 = us50Var;
                    failureNotificatorRepository$handleEvent$1.label = 1;
                    obj = bVar.d(failureNotificatorRepository$handleEvent$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            g050Var = (g050) failureNotificatorRepository$handleEvent$1.L$1;
                            us50Var3 = (us50) failureNotificatorRepository$handleEvent$1.L$0;
                            kotlin.b.b(obj);
                            try {
                                keySetView.remove(us50Var3.b);
                                if (keySetView.isEmpty()) {
                                    bVar.g(us50Var3);
                                }
                                pzt0Var = bVar.E;
                                if (pzt0Var != null) {
                                    pzt0Var.a(null);
                                }
                                return zy11Var;
                            } finally {
                                g050Var.d(null);
                            }
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            us50Var4 = (us50) failureNotificatorRepository$handleEvent$1.L$0;
                            kotlin.b.b(obj);
                            bVar.g(us50Var4);
                            return zy11Var;
                        }
                        i2 = failureNotificatorRepository$handleEvent$1.I$0;
                        us50Var2 = (us50) failureNotificatorRepository$handleEvent$1.L$0;
                        kotlin.b.b(obj);
                        if (i2 >= ((b9p) obj).k) {
                            pzt0 pzt0Var2 = bVar.E;
                            if (pzt0Var2 != null) {
                                pzt0Var2.a(null);
                            }
                            bVar.E = tje.N(bVar.x, null, null, new FailureNotificatorRepository$scheduleShowNotificatorAnyway$1(bVar, us50Var2, null), 3);
                            return zy11Var;
                        }
                        failureNotificatorRepository$handleEvent$1.L$0 = us50Var2;
                        failureNotificatorRepository$handleEvent$1.label = 4;
                        if (bVar.h(us50Var2, failureNotificatorRepository$handleEvent$1) != obj2) {
                            us50Var4 = us50Var2;
                            bVar.g(us50Var4);
                            return zy11Var;
                        }
                        return obj2;
                    }
                    us50Var = (us50) failureNotificatorRepository$handleEvent$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((b9p) obj).b) {
                    us50Var.getClass();
                    if (us50Var instanceof ts50) {
                        if (bVar.f()) {
                            kotlinx.coroutines.sync.a aVar = bVar.H;
                            failureNotificatorRepository$handleEvent$1.L$0 = us50Var;
                            failureNotificatorRepository$handleEvent$1.L$1 = aVar;
                            failureNotificatorRepository$handleEvent$1.label = 2;
                            if (aVar.a(failureNotificatorRepository$handleEvent$1) != obj2) {
                                us50Var3 = us50Var;
                                g050Var = aVar;
                                keySetView.remove(us50Var3.b);
                                if (keySetView.isEmpty()) {
                                }
                            }
                        }
                        pzt0Var = bVar.E;
                        if (pzt0Var != null) {
                        }
                    } else {
                        int i4 = us50Var.a;
                        failureNotificatorRepository$handleEvent$1.L$0 = us50Var;
                        failureNotificatorRepository$handleEvent$1.I$0 = i4;
                        failureNotificatorRepository$handleEvent$1.label = 3;
                        Object d = bVar.d(failureNotificatorRepository$handleEvent$1);
                        if (d != obj2) {
                            us50Var2 = us50Var;
                            i2 = i4;
                            obj = d;
                            if (i2 >= ((b9p) obj).k) {
                            }
                        }
                    }
                    return obj2;
                }
                return zy11Var;
            }
        }
        failureNotificatorRepository$handleEvent$1 = new FailureNotificatorRepository$handleEvent$1(bVar, continuation);
        obj = failureNotificatorRepository$handleEvent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = failureNotificatorRepository$handleEvent$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((b9p) obj).b) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, Continuation continuation) {
        FailureNotificatorRepository$onDestroyed$1 failureNotificatorRepository$onDestroyed$1;
        int i;
        g050 g050Var;
        bVar.getClass();
        try {
            if (continuation instanceof FailureNotificatorRepository$onDestroyed$1) {
                failureNotificatorRepository$onDestroyed$1 = (FailureNotificatorRepository$onDestroyed$1) continuation;
                int i2 = failureNotificatorRepository$onDestroyed$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    failureNotificatorRepository$onDestroyed$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = failureNotificatorRepository$onDestroyed$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = failureNotificatorRepository$onDestroyed$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pzt0 pzt0Var = bVar.F;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        pzt0 pzt0Var2 = bVar.A;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        pzt0 pzt0Var3 = bVar.E;
                        if (pzt0Var3 != null) {
                            pzt0Var3.a(null);
                        }
                        kotlinx.coroutines.sync.a aVar = bVar.H;
                        failureNotificatorRepository$onDestroyed$1.L$0 = aVar;
                        failureNotificatorRepository$onDestroyed$1.label = 1;
                        if (aVar.a(failureNotificatorRepository$onDestroyed$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) failureNotificatorRepository$onDestroyed$1.L$0;
                        kotlin.b.b(obj);
                    }
                    bVar.G.clear();
                    g050Var.d(null);
                    if (bVar.f()) {
                        r0 r0Var = bVar.y;
                        bl60 bl60Var = new bl60(14);
                        r0Var.getClass();
                        r0Var.m(null, bl60Var);
                    }
                    return zy11.a;
                }
            }
            bVar.G.clear();
            g050Var.d(null);
            if (bVar.f()) {
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        failureNotificatorRepository$onDestroyed$1 = new FailureNotificatorRepository$onDestroyed$1(bVar, continuation);
        Object obj2 = failureNotificatorRepository$onDestroyed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = failureNotificatorRepository$onDestroyed$1.label;
        if (i != 0) {
        }
    }

    public static v060 e(us50 us50Var) {
        if (us50Var instanceof rs50) {
            return new v060(us50Var.b, NotificatorReporter$MessageType.NETWORK_ERROR);
        }
        if (us50Var instanceof ss50) {
            return new v060(us50Var.b, NotificatorReporter$MessageType.SERVER_ERROR);
        }
        if (us50Var instanceof ts50) {
            return null;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.hhf
    public final void a(Screen screen) {
        this.B.set(screen);
        if (!f() && !(this.C instanceof ts50)) {
            tje.N(this.x, null, null, new FailureNotificatorRepository$onScreenChanged$1(this, null), 3);
            return;
        }
        us50 us50Var = this.C;
        if (us50Var instanceof rs50) {
            if (this.D.c(screen)) {
                return;
            }
            g(new ts50(0));
        } else if (us50Var instanceof ss50) {
            if (this.D.a(screen)) {
                return;
            }
            g(new ts50(0));
        } else {
            if (us50Var instanceof ts50) {
                return;
            }
            w511.b();
        }
    }

    public final Object d(ContinuationImpl continuationImpl) {
        return this.w.a.b(continuationImpl);
    }

    public final boolean f() {
        return ((bl60) this.z.a.getValue()).a;
    }

    public final void g(us50 us50Var) {
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.F = tje.N(this.x, null, null, new FailureNotificatorRepository$scheduleHideNotificator$1(this, us50Var, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0162, code lost:
    
        if (r12.a(r1) == r2) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a1  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ru.yandex.taxi.failure_notificator.b] */
    /* JADX WARN: Type inference failed for: r11v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(us50 us50Var, ContinuationImpl continuationImpl) {
        FailureNotificatorRepository$showNotificator$1 failureNotificatorRepository$showNotificator$1;
        j9s0 a;
        kotlinx.coroutines.sync.a aVar;
        pz40 pz40Var;
        us50 us50Var2;
        int i;
        String Y;
        Object d;
        String str;
        us50 us50Var3;
        String Y2;
        us50 us50Var4;
        j9s0 j9s0Var;
        pz40 pz40Var2;
        String str2;
        int i2;
        String str3;
        String str4;
        us50 us50Var5;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof FailureNotificatorRepository$showNotificator$1) {
            failureNotificatorRepository$showNotificator$1 = (FailureNotificatorRepository$showNotificator$1) continuationImpl;
            int i3 = failureNotificatorRepository$showNotificator$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                failureNotificatorRepository$showNotificator$1.label = i3 - Integer.MIN_VALUE;
                Object obj = failureNotificatorRepository$showNotificator$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (failureNotificatorRepository$showNotificator$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        a = this.c.a(us50Var.e);
                        this.C = us50Var;
                        this.D = a;
                        if (us50Var instanceof rs50) {
                            if (a.c((Screen) this.B.get()) && !f()) {
                                pzt0 pzt0Var = this.E;
                                if (pzt0Var != null) {
                                    pzt0Var.a(null);
                                }
                                r0 r0Var = this.y;
                                failureNotificatorRepository$showNotificator$1.L$0 = us50Var;
                                failureNotificatorRepository$showNotificator$1.L$1 = null;
                                failureNotificatorRepository$showNotificator$1.L$2 = r0Var;
                                failureNotificatorRepository$showNotificator$1.I$0 = 1;
                                failureNotificatorRepository$showNotificator$1.label = 1;
                                Object d2 = d(failureNotificatorRepository$showNotificator$1);
                                if (d2 != coroutineSingletons) {
                                    pz40Var = r0Var;
                                    obj = d2;
                                    us50Var2 = us50Var;
                                    i = 1;
                                    b9p b9pVar = (b9p) obj;
                                    Y = d6z.Y(b9pVar, b9pVar.e);
                                    if (evu0.J(Y)) {
                                        Y = null;
                                    }
                                    if (Y == null) {
                                        Y = ((avj0) this.a).h(kyh0.no_connection_title);
                                    }
                                    failureNotificatorRepository$showNotificator$1.L$0 = us50Var2;
                                    failureNotificatorRepository$showNotificator$1.L$1 = null;
                                    failureNotificatorRepository$showNotificator$1.L$2 = pz40Var;
                                    failureNotificatorRepository$showNotificator$1.L$3 = Y;
                                    failureNotificatorRepository$showNotificator$1.I$0 = i;
                                    failureNotificatorRepository$showNotificator$1.label = 2;
                                    d = d(failureNotificatorRepository$showNotificator$1);
                                    if (d != coroutineSingletons) {
                                        str = Y;
                                        obj = d;
                                        us50Var3 = us50Var2;
                                        b9p b9pVar2 = (b9p) obj;
                                        Y2 = d6z.Y(b9pVar2, b9pVar2.f);
                                        if (evu0.J(Y2)) {
                                            Y2 = null;
                                        }
                                        if (Y2 == null) {
                                            Y2 = ((avj0) this.a).h(kyh0.no_connection_check_prompt);
                                        }
                                        bl60 bl60Var = new bl60(i != 0, str, Y2, e(us50Var3));
                                        r0 r0Var2 = (r0) pz40Var;
                                        r0Var2.getClass();
                                        r0Var2.m(null, bl60Var);
                                        return zy11Var;
                                    }
                                }
                            }
                            return zy11Var;
                        }
                        if (!(us50Var instanceof ss50)) {
                            if (us50Var instanceof ts50) {
                                jst.e.u("Should not show Notificator on success events!");
                                return zy11Var;
                            }
                            w511.b();
                            return null;
                        }
                        aVar = this.H;
                        failureNotificatorRepository$showNotificator$1.L$0 = us50Var;
                        failureNotificatorRepository$showNotificator$1.L$1 = a;
                        failureNotificatorRepository$showNotificator$1.L$2 = aVar;
                        failureNotificatorRepository$showNotificator$1.label = 3;
                        break;
                        return coroutineSingletons;
                    case 1:
                        i = failureNotificatorRepository$showNotificator$1.I$0;
                        pz40Var = (pz40) failureNotificatorRepository$showNotificator$1.L$2;
                        us50Var2 = (us50) failureNotificatorRepository$showNotificator$1.L$0;
                        kotlin.b.b(obj);
                        b9p b9pVar3 = (b9p) obj;
                        Y = d6z.Y(b9pVar3, b9pVar3.e);
                        if (evu0.J(Y)) {
                        }
                        if (Y == null) {
                        }
                        failureNotificatorRepository$showNotificator$1.L$0 = us50Var2;
                        failureNotificatorRepository$showNotificator$1.L$1 = null;
                        failureNotificatorRepository$showNotificator$1.L$2 = pz40Var;
                        failureNotificatorRepository$showNotificator$1.L$3 = Y;
                        failureNotificatorRepository$showNotificator$1.I$0 = i;
                        failureNotificatorRepository$showNotificator$1.label = 2;
                        d = d(failureNotificatorRepository$showNotificator$1);
                        if (d != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        i = failureNotificatorRepository$showNotificator$1.I$0;
                        str = (String) failureNotificatorRepository$showNotificator$1.L$3;
                        pz40Var = (pz40) failureNotificatorRepository$showNotificator$1.L$2;
                        us50Var3 = (us50) failureNotificatorRepository$showNotificator$1.L$0;
                        kotlin.b.b(obj);
                        b9p b9pVar22 = (b9p) obj;
                        Y2 = d6z.Y(b9pVar22, b9pVar22.f);
                        if (evu0.J(Y2)) {
                        }
                        if (Y2 == null) {
                        }
                        bl60 bl60Var2 = new bl60(i != 0, str, Y2, e(us50Var3));
                        r0 r0Var22 = (r0) pz40Var;
                        r0Var22.getClass();
                        r0Var22.m(null, bl60Var2);
                        return zy11Var;
                    case 3:
                        ?? r11 = (g050) failureNotificatorRepository$showNotificator$1.L$2;
                        a = (j9s0) failureNotificatorRepository$showNotificator$1.L$1;
                        us50 us50Var6 = (us50) failureNotificatorRepository$showNotificator$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r11;
                        us50Var = us50Var6;
                        try {
                            this.G.add(us50Var.b);
                            aVar.d(null);
                            if (a.a((Screen) this.B.get()) && !f()) {
                                failureNotificatorRepository$showNotificator$1.L$0 = us50Var;
                                failureNotificatorRepository$showNotificator$1.L$1 = a;
                                failureNotificatorRepository$showNotificator$1.L$2 = null;
                                failureNotificatorRepository$showNotificator$1.label = 4;
                                obj = d(failureNotificatorRepository$showNotificator$1);
                                if (obj != coroutineSingletons) {
                                    us50Var4 = us50Var;
                                    j9s0Var = a;
                                    if (((b9p) obj).l) {
                                        pzt0 pzt0Var2 = this.E;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        pz40Var2 = this.y;
                                        String str5 = us50Var4.c;
                                        if (str5 == null) {
                                            x060 b = j9s0Var.b();
                                            str5 = b != null ? b.a : null;
                                            if (str5 == null) {
                                                failureNotificatorRepository$showNotificator$1.L$0 = us50Var4;
                                                failureNotificatorRepository$showNotificator$1.L$1 = j9s0Var;
                                                failureNotificatorRepository$showNotificator$1.L$2 = pz40Var2;
                                                failureNotificatorRepository$showNotificator$1.I$0 = 1;
                                                failureNotificatorRepository$showNotificator$1.label = 5;
                                                obj = d(failureNotificatorRepository$showNotificator$1);
                                                if (obj != coroutineSingletons) {
                                                    i2 = 1;
                                                    b9p b9pVar4 = (b9p) obj;
                                                    str2 = d6z.Y(b9pVar4, b9pVar4.c);
                                                    if (evu0.J(str2)) {
                                                        str2 = null;
                                                    }
                                                    if (str2 == null) {
                                                        str2 = ((avj0) this.a).h(kyh0.common_server_error);
                                                    }
                                                    str3 = us50Var4.d;
                                                    if (str3 == null) {
                                                        x060 b2 = j9s0Var.b();
                                                        str3 = b2 != null ? b2.b : null;
                                                        if (str3 == null) {
                                                            failureNotificatorRepository$showNotificator$1.L$0 = us50Var4;
                                                            failureNotificatorRepository$showNotificator$1.L$1 = null;
                                                            failureNotificatorRepository$showNotificator$1.L$2 = pz40Var2;
                                                            failureNotificatorRepository$showNotificator$1.L$3 = str2;
                                                            failureNotificatorRepository$showNotificator$1.I$0 = i2;
                                                            failureNotificatorRepository$showNotificator$1.label = 6;
                                                            Object d3 = d(failureNotificatorRepository$showNotificator$1);
                                                            if (d3 != coroutineSingletons) {
                                                                str4 = str2;
                                                                obj = d3;
                                                                us50Var5 = us50Var4;
                                                                b9p b9pVar5 = (b9p) obj;
                                                                String Y3 = d6z.Y(b9pVar5, b9pVar5.d);
                                                                str3 = evu0.J(Y3) ? Y3 : null;
                                                                if (str3 == null) {
                                                                    str3 = ((avj0) this.a).h(kyh0.common_server_error_description);
                                                                }
                                                                us50Var4 = us50Var5;
                                                                str2 = str4;
                                                            }
                                                        }
                                                    }
                                                    bl60 bl60Var3 = new bl60(i2 != 0, str2, str3, e(us50Var4));
                                                    r0 r0Var3 = (r0) pz40Var2;
                                                    r0Var3.getClass();
                                                    r0Var3.m(null, bl60Var3);
                                                }
                                            }
                                        }
                                        str2 = str5;
                                        i2 = 1;
                                        str3 = us50Var4.d;
                                        if (str3 == null) {
                                        }
                                        bl60 bl60Var32 = new bl60(i2 != 0, str2, str3, e(us50Var4));
                                        r0 r0Var32 = (r0) pz40Var2;
                                        r0Var32.getClass();
                                        r0Var32.m(null, bl60Var32);
                                    }
                                }
                                return coroutineSingletons;
                            }
                            return zy11Var;
                        } catch (Throwable th) {
                            aVar.d(null);
                            throw th;
                        }
                    case 4:
                        j9s0 j9s0Var2 = (j9s0) failureNotificatorRepository$showNotificator$1.L$1;
                        us50 us50Var7 = (us50) failureNotificatorRepository$showNotificator$1.L$0;
                        kotlin.b.b(obj);
                        j9s0Var = j9s0Var2;
                        us50Var4 = us50Var7;
                        if (((b9p) obj).l) {
                        }
                        return zy11Var;
                    case 5:
                        i2 = failureNotificatorRepository$showNotificator$1.I$0;
                        pz40Var2 = (pz40) failureNotificatorRepository$showNotificator$1.L$2;
                        j9s0Var = (j9s0) failureNotificatorRepository$showNotificator$1.L$1;
                        us50Var4 = (us50) failureNotificatorRepository$showNotificator$1.L$0;
                        kotlin.b.b(obj);
                        b9p b9pVar42 = (b9p) obj;
                        str2 = d6z.Y(b9pVar42, b9pVar42.c);
                        if (evu0.J(str2)) {
                        }
                        if (str2 == null) {
                        }
                        str3 = us50Var4.d;
                        if (str3 == null) {
                        }
                        bl60 bl60Var322 = new bl60(i2 != 0, str2, str3, e(us50Var4));
                        r0 r0Var322 = (r0) pz40Var2;
                        r0Var322.getClass();
                        r0Var322.m(null, bl60Var322);
                        return zy11Var;
                    case 6:
                        i2 = failureNotificatorRepository$showNotificator$1.I$0;
                        str4 = (String) failureNotificatorRepository$showNotificator$1.L$3;
                        pz40Var2 = (pz40) failureNotificatorRepository$showNotificator$1.L$2;
                        us50Var5 = (us50) failureNotificatorRepository$showNotificator$1.L$0;
                        kotlin.b.b(obj);
                        b9p b9pVar52 = (b9p) obj;
                        String Y32 = d6z.Y(b9pVar52, b9pVar52.d);
                        if (evu0.J(Y32)) {
                        }
                        if (str3 == null) {
                        }
                        us50Var4 = us50Var5;
                        str2 = str4;
                        bl60 bl60Var3222 = new bl60(i2 != 0, str2, str3, e(us50Var4));
                        r0 r0Var3222 = (r0) pz40Var2;
                        r0Var3222.getClass();
                        r0Var3222.m(null, bl60Var3222);
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        failureNotificatorRepository$showNotificator$1 = new FailureNotificatorRepository$showNotificator$1(this, continuationImpl);
        Object obj2 = failureNotificatorRepository$showNotificator$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (failureNotificatorRepository$showNotificator$1.label) {
        }
    }
}
