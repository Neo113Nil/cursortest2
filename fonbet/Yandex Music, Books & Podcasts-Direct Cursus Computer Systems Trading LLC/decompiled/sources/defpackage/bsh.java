package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.yandex.passport.api.y1;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.coroutine.c;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.ui.challenge.b0;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.internal.ui.challenge.s;
import com.yandex.passport.internal.ui.challenge.t;
import com.yandex.passport.internal.ui.challenge.u;
import com.yandex.passport.internal.ui.challenge.v;
import com.yandex.passport.internal.ui.challenge.y;
import com.yandex.passport.internal.ui.challenge.z;
import com.yandex.passport.internal.usecase.f0;
import com.yandex.passport.internal.usecase.g0;
import com.yandex.passport.internal.usecase.h0;
import com.yandex.passport.internal.usecase.i0;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class bsh {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;

    public bsh(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Object();
                this.e = new ash(1, this);
                this.d = new WeakReference(null);
                break;
            default:
                this.b = new Object();
                this.e = new ash(0, this);
                this.d = new WeakReference(null);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        if (r7 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(bsh bshVar, cg6 cg6Var) {
        t tVar;
        int i;
        i0 i0Var;
        s sVar = (s) bshVar.e;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i2 = tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = tVar.j;
                Object obj2 = nm6.a;
                i = tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    f j = bshVar.j();
                    if (j == null) {
                        i0Var = null;
                        if (Intrinsics.d(i0Var, h0.a)) {
                            tVar.l = 2;
                            Object e0 = bshVar.e0(tVar);
                            return e0 == obj2 ? obj2 : e0;
                        }
                        if (!(i0Var instanceof f0) && !(i0Var instanceof g0) && i0Var != null) {
                            b6e.s();
                            return null;
                        }
                        f j2 = bshVar.j();
                        if (j2 != null) {
                            sVar.d(j2);
                        }
                        return i();
                    }
                    tVar.l = 1;
                    obj = sVar.b(j, tVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                i0Var = (i0) obj;
                if (Intrinsics.d(i0Var, h0.a)) {
                }
            }
        }
        tVar = new t(bshVar, cg6Var);
        Object obj3 = tVar.j;
        Object obj22 = nm6.a;
        i = tVar.l;
        if (i != 0) {
        }
        i0Var = (i0) obj3;
        if (Intrinsics.d(i0Var, h0.a)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
    
        if (r8.emit((com.yandex.passport.internal.ui.challenge.a0) r9, r1) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r9 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r0.emit(r8, r1) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r9 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if (r8.g0((com.yandex.passport.internal.usecase.g0) r9, r1) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0076, code lost:
    
        if (r9 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        if (r0.emit(com.yandex.passport.internal.ui.challenge.x.a, r1) == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(bsh bshVar, cg6 cg6Var) {
        u uVar;
        int i;
        i0 i0Var;
        x0q x0qVar = (x0q) bshVar.f;
        if (cg6Var instanceof u) {
            uVar = (u) cg6Var;
            int i2 = uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.m = i2 - Integer.MIN_VALUE;
                Object obj = uVar.k;
                nm6 nm6Var = nm6.a;
                i = uVar.m;
                h0 h0Var = h0.a;
                switch (i) {
                    case 0:
                        qgg.h0(obj);
                        uVar.j = null;
                        uVar.m = 1;
                        break;
                    case 1:
                        qgg.h0(obj);
                        f j = bshVar.j();
                        if (j != null) {
                            if (!bshVar.c) {
                                i0Var = h0Var;
                                break;
                            } else {
                                s sVar = (s) bshVar.e;
                                uVar.j = null;
                                uVar.m = 2;
                                obj = sVar.b(j, uVar);
                                break;
                            }
                        }
                        i0Var = h0Var;
                        if (a.a.isEnabled()) {
                            a.c(b.b, null, "ChallengeState = " + i0Var, 8);
                        }
                        if (i0Var instanceof f0) {
                            y i3 = i();
                            uVar.j = null;
                            uVar.m = 3;
                            break;
                        } else if (i0Var.equals(h0Var)) {
                            uVar.j = bshVar;
                            uVar.m = 4;
                            obj = bshVar.e0(uVar);
                            break;
                        } else {
                            if (!(i0Var instanceof g0)) {
                                b6e.s();
                                return null;
                            }
                            uVar.j = null;
                            uVar.m = 6;
                            break;
                        }
                        return nm6Var;
                    case 2:
                        qgg.h0(obj);
                        i0Var = (i0) obj;
                        break;
                    case 3:
                        qgg.h0(obj);
                        return Unit.a;
                    case 4:
                        bshVar = uVar.j;
                        qgg.h0(obj);
                        x0q x0qVar2 = (x0q) bshVar.f;
                        uVar.j = null;
                        uVar.m = 5;
                        break;
                    case 5:
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        uVar = new u(bshVar, cg6Var);
        Object obj2 = uVar.k;
        nm6 nm6Var2 = nm6.a;
        i = uVar.m;
        h0 h0Var2 = h0.a;
        switch (i) {
        }
    }

    public static y i() {
        return new y(false);
    }

    public void A() {
        int i = this.a;
    }

    public void N(long j) {
        int i = this.a;
    }

    public void V() {
        int i = this.a;
    }

    public void Y() {
        int i = this.a;
    }

    public void d0() {
        boolean z = this.c;
        this.c = false;
        if (!z || this.e == this.b) {
            return;
        }
        w();
    }

    public abstract Object e0(cg6 cg6Var);

    public void f(Object obj) {
        obj.getClass();
        this.e = obj;
        if (this.c) {
            L();
        }
        this.f = g();
    }

    public void f0() {
        boolean z = this.c;
        this.c = true;
        if (z || this.e == this.b) {
            return;
        }
        L();
    }

    public tf6 g() {
        return gld.e(e.c(a4g.n(), (kotlinx.coroutines.a) this.d).plus(new im6(this.e.getClass().getSimpleName())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r9.emit(r10, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (kotlin.Unit.a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g0(g0 g0Var, cg6 cg6Var) {
        v vVar;
        int i;
        bsh bshVar;
        c0 c0Var;
        Object obj;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = vVar.l;
                nm6 nm6Var = nm6.a;
                i = vVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    s sVar = (s) this.e;
                    f j = j();
                    if (j == null) {
                        xq0.q("internal error");
                        return null;
                    }
                    y1 y1Var = (y1) ((b6) this.b).c;
                    vVar.j = this;
                    vVar.n = 1;
                    obj2 = sVar.c(j, g0Var, y1Var, vVar);
                    if (obj2 != nm6Var) {
                        bshVar = this;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    bsh bshVar2 = vVar.j;
                    qgg.h0(obj2);
                    bshVar = bshVar2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    c0Var = vVar.k;
                    bshVar = vVar.j;
                    qgg.h0(obj2);
                    if (c0Var != null) {
                        obj = new z(c0Var);
                        if (obj == null) {
                            obj = i();
                        }
                        x0q x0qVar = (x0q) bshVar.f;
                        vVar.j = null;
                        vVar.k = null;
                        vVar.n = 3;
                    }
                    obj = null;
                    if (obj == null) {
                    }
                    x0q x0qVar2 = (x0q) bshVar.f;
                    vVar.j = null;
                    vVar.k = null;
                    vVar.n = 3;
                }
                c0Var = (c0) obj2;
                if (c0Var != null) {
                    vVar.j = bshVar;
                    vVar.k = c0Var;
                    vVar.n = 2;
                    x97.y(gld.e(vVar.getContext()), null, null, new zy3(this, c0Var, null), 3);
                }
                obj = null;
                if (obj == null) {
                }
                x0q x0qVar22 = (x0q) bshVar.f;
                vVar.j = null;
                vVar.k = null;
                vVar.n = 3;
            }
        }
        vVar = new v(this, cg6Var);
        Object obj22 = vVar.l;
        nm6 nm6Var2 = nm6.a;
        i = vVar.n;
        if (i != 0) {
        }
        c0Var = (c0) obj22;
        if (c0Var != null) {
        }
        obj = null;
        if (obj == null) {
        }
        x0q x0qVar222 = (x0q) bshVar.f;
        vVar.j = null;
        vVar.k = null;
        vVar.n = 3;
    }

    public void h() {
        if (this.c) {
            w();
        }
        this.e = this.b;
        tf6 tf6Var = (tf6) this.f;
        if (tf6Var != null) {
            gld.K(tf6Var, "detach view from presenter", null);
        }
    }

    public abstract f j();

    public mm6 l() {
        tf6 tf6Var = (tf6) this.f;
        if (tf6Var != null) {
            return tf6Var;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Using cancelled scope instead of mainScope");
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "Using cancelled scope instead of mainScope", null);
        tf6 g = g();
        gld.K(g, "Already cancelled", illegalStateException);
        return g;
    }

    public void m(dsh dshVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            i6l i6lVar = dshVar.g;
            long j = i6lVar == null ? 0L : i6lVar.e;
            boolean z = i6lVar != null && i6lVar.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                w();
            } else {
                if (z || !z2) {
                    return;
                }
                A();
            }
        }
    }

    public void n(esh eshVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = eshVar.f;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.e;
            boolean z = playbackStateCompat != null && playbackStateCompat.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                w();
            } else {
                if (z || !z2) {
                    return;
                }
                A();
            }
        }
    }

    public boolean v(Intent intent) {
        dsh dshVar;
        tt1 tt1Var;
        KeyEvent keyEvent;
        esh eshVar;
        tt1 tt1Var2;
        KeyEvent keyEvent2;
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 27) {
                    return false;
                }
                synchronized (this.b) {
                    dshVar = (dsh) ((WeakReference) this.d).get();
                    tt1Var = (tt1) this.f;
                }
                if (dshVar == null || tt1Var == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                    return false;
                }
                xth b = dshVar.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    m(dshVar, tt1Var);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    m(dshVar, tt1Var);
                } else if (this.c) {
                    tt1Var.removeMessages(1);
                    this.c = false;
                    i6l i6lVar = dshVar.g;
                    if (((i6lVar == null ? 0L : i6lVar.e) & 32) != 0) {
                        V();
                    }
                } else {
                    this.c = true;
                    tt1Var.sendMessageDelayed(tt1Var.obtainMessage(1, b), ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            default:
                if (Build.VERSION.SDK_INT >= 27) {
                    return false;
                }
                synchronized (this.b) {
                    eshVar = (esh) ((WeakReference) this.d).get();
                    tt1Var2 = (tt1) this.f;
                }
                if (eshVar == null || tt1Var2 == null || (keyEvent2 = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent2.getAction() != 0) {
                    return false;
                }
                yth b2 = eshVar.b();
                int keyCode2 = keyEvent2.getKeyCode();
                if (keyCode2 != 79 && keyCode2 != 85) {
                    n(eshVar, tt1Var2);
                    return false;
                }
                if (keyEvent2.getRepeatCount() != 0) {
                    n(eshVar, tt1Var2);
                } else if (this.c) {
                    tt1Var2.removeMessages(1);
                    this.c = false;
                    PlaybackStateCompat playbackStateCompat = eshVar.f;
                    if (((playbackStateCompat == null ? 0L : playbackStateCompat.e) & 32) != 0) {
                        V();
                    }
                } else {
                    this.c = true;
                    tt1Var2.sendMessageDelayed(tt1Var2.obtainMessage(1, b2), ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
        }
    }

    public void w() {
        int i = this.a;
    }

    private void B() {
    }

    private void C() {
    }

    private void W() {
    }

    private void X() {
    }

    private void Z() {
    }

    private void a0() {
    }

    private void x() {
    }

    private void y() {
    }

    private void z() {
    }

    public void G() {
    }

    public void L() {
    }

    public void M() {
    }

    public void c0() {
    }

    public void t() {
    }

    private void O(long j) {
    }

    private void P(long j) {
    }

    public void K(pmh pmhVar) {
    }

    public void Q(float f) {
    }

    public void R(iin iinVar) {
    }

    public void S(iin iinVar) {
    }

    public void T(int i) {
    }

    public void U(int i) {
    }

    public void b0(long j) {
    }

    public void o(pmh pmhVar) {
    }

    public void r(String str) {
    }

    public void D(String str, Bundle bundle) {
    }

    public void E(String str, Bundle bundle) {
    }

    public void F(Uri uri, Bundle bundle) {
    }

    public void H(String str, Bundle bundle) {
    }

    public void I(String str, Bundle bundle) {
    }

    public void J(Uri uri, Bundle bundle) {
    }

    public void p(pmh pmhVar, int i) {
    }

    public void s(String str, Bundle bundle) {
    }

    public bsh(b6 b6Var, b0 b0Var, s sVar, boolean z) {
        this.a = 2;
        b6Var.getClass();
        b0Var.getClass();
        sVar.getClass();
        this.b = b6Var;
        this.e = sVar;
        this.c = z;
        this.d = c.a(ot0.F(b0Var));
        this.f = y0q.b(1, 0, null, 6);
    }

    public bsh(Object obj, kotlinx.coroutines.a aVar) {
        this.a = 3;
        aVar.getClass();
        this.b = obj;
        this.e = obj;
        this.d = aVar;
    }

    public void q(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
