package defpackage;

import android.os.SystemClock;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.b0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.x;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class shw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xhw b;
    public final /* synthetic */ ghw c;

    public /* synthetic */ shw(xhw xhwVar, ghw ghwVar, int i) {
        this.a = i;
        this.b = xhwVar;
        this.c = ghwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (defpackage.cxb.e0(r9, r6.j()) != false) goto L18;
     */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        x xVar;
        String str;
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) obj;
                xhw xhwVar = this.b;
                z6n z6nVar = xhwVar.r;
                uiw uiwVar = xhwVar.q;
                c0 d = uiwVar.d();
                z6nVar.getClass();
                c0Var.getClass();
                boolean f0 = cxb.f0(c0Var, d, true);
                String h = f0 ? "same" : z6nVar.h(c0Var, d);
                Continuation continuation2 = null;
                if (f0 && !xhw.c(xhwVar)) {
                    dcw.a.getClass();
                    ssg.a(2, qbw.b, "Skip sending playing status since it doesn't changed relatively last received status", null);
                    return Unit.a;
                }
                ReentrantLock reentrantLock = uiwVar.a;
                reentrantLock.lock();
                try {
                    c0 d2 = uiwVar.d();
                    uiwVar.d = c0Var;
                    uiwVar.e = SystemClock.elapsedRealtime();
                    reentrantLock.unlock();
                    xhw.a(xhwVar, d2, c0Var);
                    Object c = this.c.c("updatePlayingStatus", new wzv(c0Var, h, continuation2, 9), continuation);
                    nm6 nm6Var = nm6.a;
                    if (c != nm6Var) {
                        c = Unit.a;
                    }
                    return c == nm6Var ? c : Unit.a;
                } finally {
                }
            case 1:
                a0 a0Var = (a0) obj;
                xhw xhwVar2 = this.b;
                z6n z6nVar2 = xhwVar2.r;
                uiw uiwVar2 = xhwVar2.q;
                a0 c2 = uiwVar2.c();
                z6nVar2.getClass();
                a0Var.getClass();
                boolean z = true;
                if (a0Var != c2) {
                    if (c2 != null) {
                        c0 k = a0Var.k();
                        k.getClass();
                        if (cxb.f0(k, c2.k(), false)) {
                            x j = a0Var.j();
                            j.getClass();
                            break;
                        }
                    }
                    z = false;
                }
                dfw dfwVar = (dfw) ((hgp) z6nVar2.b).b;
                String str2 = "";
                if (((Boolean) dfwVar.invoke()).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    if (c2 == null) {
                        arrayList.add("brand-new");
                    } else {
                        c0 k2 = a0Var.k();
                        k2.getClass();
                        if (!cxb.f0(k2, c2.k(), false)) {
                            c0 k3 = a0Var.k();
                            k3.getClass();
                            arrayList.add(z6nVar2.h(k3, c2.k()));
                        }
                        x j2 = a0Var.j();
                        j2.getClass();
                        if (!cxb.e0(j2, c2.j())) {
                            x j3 = a0Var.j();
                            j3.getClass();
                            x j4 = c2.j();
                            if (((Boolean) dfwVar.invoke()).booleanValue()) {
                                ArrayList arrayList2 = new ArrayList();
                                if (j4 == null) {
                                    arrayList2.add("brand-new");
                                } else {
                                    if (Intrinsics.d(j3.C(), j4.C())) {
                                        xVar = j3;
                                    } else {
                                        xVar = j3;
                                        arrayList2.add("queue=" + j4.C());
                                    }
                                    if (xVar.r() != j4.r()) {
                                        arrayList2.add("index=" + xVar.r());
                                    }
                                    if (!Intrinsics.d(xVar.y(), j4.y())) {
                                        b0 y = xVar.y();
                                        y.getClass();
                                        b0 y2 = j4.y();
                                        if (((Boolean) dfwVar.invoke()).booleanValue()) {
                                            ArrayList arrayList3 = new ArrayList();
                                            if (y2 == null) {
                                                arrayList3.add("brand-new");
                                            } else if (y.h() != y2.h()) {
                                                int h2 = y.h();
                                                arrayList3.add("repeat=".concat(h2 != 1 ? h2 != 2 ? h2 != 3 ? h2 != 4 ? h2 != 5 ? "null" : "UNRECOGNIZED" : "ALL" : "ONE" : "NONE" : "UNSPECIFIED"));
                                            }
                                            str = hrg.q("Options(", CollectionsKt.X(arrayList3, null, null, null, null, 63), ")");
                                        } else {
                                            str = "";
                                        }
                                        arrayList2.add(str);
                                    }
                                    i0 D = xVar.D();
                                    D.getClass();
                                    if (!cxb.g0(D, j4.D())) {
                                        i0 D2 = xVar.D();
                                        i0 D3 = j4.D();
                                        if (((Boolean) dfwVar.invoke()).booleanValue()) {
                                            ArrayList arrayList4 = new ArrayList();
                                            if (D2 == null) {
                                                arrayList4.add("null");
                                            } else if (D3 == null) {
                                                arrayList4.add("brand-new");
                                            } else if (!Intrinsics.d(D2.j(), D3.j())) {
                                                mse j5 = D2.j();
                                                if (j5 == null || j5.isEmpty()) {
                                                    arrayList4.add("off");
                                                } else {
                                                    mse j6 = D3.j();
                                                    if (j6 == null || j6.isEmpty()) {
                                                        arrayList4.add("on");
                                                    } else if (D2.i() != D3.i()) {
                                                        arrayList4.add("count=" + D2.i());
                                                    } else {
                                                        arrayList4.add("order");
                                                    }
                                                }
                                            }
                                            str2 = hrg.q("Shuffle(", CollectionsKt.X(arrayList4, null, null, null, null, 63), ")");
                                        }
                                        arrayList2.add(str2);
                                    }
                                    if (!Intrinsics.d(cxb.T(xVar), cxb.T(j4))) {
                                        if (xVar.z() != j4.z()) {
                                            arrayList2.add("size=" + xVar.z());
                                        } else {
                                            arrayList2.add("playables");
                                        }
                                    }
                                }
                                str2 = hrg.q("Queue(", CollectionsKt.X(arrayList2, null, null, null, null, 63), ")");
                            }
                            arrayList.add(str2);
                        }
                    }
                    str2 = hrg.q("PlayerState(", CollectionsKt.X(arrayList, null, null, null, null, 63), ")");
                }
                Continuation continuation3 = null;
                if (z && !xhw.c(xhwVar2)) {
                    dcw.a.getClass();
                    ssg.a(2, qbw.b, "Skip sending player state since it doesn't changed relatively last received state", null);
                    return Unit.a;
                }
                uiwVar2.a.lock();
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    a0 c3 = uiwVar2.c();
                    uiwVar2.c = a0Var;
                    uiwVar2.d = a0Var.k();
                    uiwVar2.e = elapsedRealtime;
                    c0 k4 = c3 != null ? c3.k() : null;
                    c0 k5 = a0Var.k();
                    k5.getClass();
                    xhw.a(xhwVar2, k4, k5);
                    Object c4 = this.c.c("updatePlayerState", new wzv(a0Var, str2, continuation3, 8), continuation);
                    nm6 nm6Var2 = nm6.a;
                    if (c4 != nm6Var2) {
                        c4 = Unit.a;
                    }
                    return c4 == nm6Var2 ? c4 : Unit.a;
                } finally {
                }
            default:
                Object b = xhw.b(this.b, this.c, (kot) obj, continuation);
                return b == nm6.a ? b : Unit.a;
        }
    }
}
