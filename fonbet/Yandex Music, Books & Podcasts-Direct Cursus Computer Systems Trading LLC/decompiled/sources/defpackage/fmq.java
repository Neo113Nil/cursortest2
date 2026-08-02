package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import androidx.media3.session.i;
import com.google.android.gms.tasks.Task;
import com.yandex.messenger.websdk.internal.view.BackHandlingFrameLayout;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public class fmq implements iih, kzc {
    public static volatile fmq e;
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public fmq(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.c = Collections.newSetFromMap(new WeakHashMap());
                this.d = new HashSet();
                break;
            case 12:
                this.c = new Object();
                break;
            default:
                this.c = new ReentrantLock();
                this.d = new ArrayList();
                break;
        }
    }

    public static fmq y(Context context) {
        if (e == null) {
            synchronized (fmq.class) {
                try {
                    if (e == null) {
                        e = new fmq(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public void A() {
        View rootView;
        BackHandlingFrameLayout backHandlingFrameLayout = (BackHandlingFrameLayout) this.c;
        if (this.b) {
            boolean z = backHandlingFrameLayout.isShown() && ((wi2) this.d) != null;
            if (backHandlingFrameLayout.hasWindowFocus()) {
                boolean hasFocus = backHandlingFrameLayout.hasFocus();
                backHandlingFrameLayout.setFocusable(this.b);
                backHandlingFrameLayout.setFocusableInTouchMode(this.b);
                if (z) {
                    backHandlingFrameLayout.requestFocus();
                } else {
                    if (!hasFocus || (rootView = backHandlingFrameLayout.getRootView()) == null) {
                        return;
                    }
                    rootView.requestFocus(33);
                }
            }
        }
    }

    public void B() {
        boolean tryAcquire = ((Semaphore) this.d).tryAcquire();
        ((AbstractSelector) this.c).wakeup();
        if (tryAcquire) {
            synchronized (this) {
                try {
                    if (this.b) {
                        return;
                    }
                    this.b = true;
                    for (int i = 0; i < 100; i++) {
                        try {
                            try {
                                if (((Semaphore) this.d).tryAcquire(10L, TimeUnit.MILLISECONDS)) {
                                    synchronized (this) {
                                        this.b = false;
                                    }
                                    return;
                                }
                            } catch (InterruptedException unused) {
                            }
                            ((AbstractSelector) this.c).wakeup();
                        } catch (Throwable th) {
                            synchronized (this) {
                                this.b = false;
                                throw th;
                            }
                        }
                    }
                    synchronized (this) {
                        this.b = false;
                    }
                } finally {
                }
            }
        }
    }

    public void C(pjx pjxVar) {
        synchronized (this.c) {
            try {
                if (((ArrayDeque) this.d) == null) {
                    this.d = new ArrayDeque();
                }
                ((ArrayDeque) this.d).add(pjxVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void D(Task task) {
        pjx pjxVar;
        synchronized (this.c) {
            if (((ArrayDeque) this.d) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.c) {
                        try {
                            pjxVar = (pjx) ((ArrayDeque) this.d).poll();
                            if (pjxVar == null) {
                                this.b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    pjxVar.a(task);
                }
            }
        }
    }

    @Override // defpackage.iih
    public void a() {
        uzg uzgVar = (uzg) this.d;
        dkh dkhVar = (dkh) this.c;
        if (!this.b) {
            dkhVar.a();
            return;
        }
        try {
            int i = dvt.a;
            if (i >= 30 && i < 33) {
                dkhVar.stop();
            }
            if (i >= 35 && uzgVar != null) {
                uzgVar.c(dkhVar.q());
            }
            dkhVar.a();
        } catch (Throwable th) {
            if (dvt.a >= 35 && uzgVar != null) {
                uzgVar.c(dkhVar.q());
            }
            dkhVar.a();
            throw th;
        }
    }

    @Override // defpackage.iih
    public void b(Bundle bundle) {
        ((dkh) this.c).b(bundle);
    }

    @Override // defpackage.iih
    public void c(int i, int i2, long j, int i3) {
        ((dkh) this.c).c(i, i2, j, i3);
    }

    @Override // defpackage.iih
    public MediaFormat d() {
        return ((dkh) this.c).d();
    }

    @Override // defpackage.iih
    public void e() {
        ((dkh) this.c).e();
    }

    @Override // defpackage.iih
    public void f(int i, nv6 nv6Var, long j, int i2) {
        ((dkh) this.c).p(i, nv6Var.i, j, i2);
    }

    @Override // defpackage.iih
    public void flush() {
        ((dkh) this.c).flush();
    }

    @Override // defpackage.iih
    public void g(int i) {
        ((dkh) this.c).g(i);
    }

    @Override // defpackage.iih
    public PersistableBundle h() {
        return ((dkh) this.c).h();
    }

    @Override // defpackage.iih
    public ByteBuffer i(int i) {
        return ((dkh) this.c).i(i);
    }

    @Override // defpackage.iih
    public void j(Surface surface) {
        ((dkh) this.c).j(surface);
    }

    @Override // defpackage.iih
    public void k(int i) {
        ((dkh) this.c).k(i);
    }

    @Override // defpackage.iih
    public void l(int i, long j) {
        ((dkh) this.c).l(i, j);
    }

    @Override // defpackage.iih
    public ByteBuffer m(int i) {
        return ((dkh) this.c).m(i);
    }

    @Override // defpackage.iih
    public void o(ckh ckhVar, Handler handler) {
        ((dkh) this.c).s(new qt1(this, ckhVar, 2), handler);
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
        i iVar = (i) this.d;
        if (th instanceof UnsupportedOperationException) {
            vq1.o0("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            vq1.L("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
        }
        dvt.P(iVar.t);
        if (this.b) {
            iVar.r((wrh) this.c);
        }
    }

    @Override // defpackage.kzc
    public void onSuccess(Object obj) {
        i iVar = (i) this.d;
        wrh wrhVar = (wrh) this.c;
        boolean z = this.b;
        vwh.f(iVar.t, (xrh) obj);
        dvt.P(iVar.t);
        if (z) {
            iVar.r(wrhVar);
        }
    }

    @Override // defpackage.iih
    public int s() {
        return ((dkh) this.c).f();
    }

    @Override // defpackage.iih
    public int t(MediaCodec.BufferInfo bufferInfo) {
        int o;
        do {
            o = ((dkh) this.c).o(bufferInfo);
        } while (o == -3);
        return o;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("{numRequests=");
                sb.append(((Set) this.c).size());
                sb.append(", isPaused=");
                return ouj.r(sb, this.b, "}");
            default:
                return super.toString();
        }
    }

    public boolean u(long j) {
        Object obj;
        List list = (List) ((aqd) this.d).b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ywf.u(((nfm) obj).a, j)) {
                break;
            }
            i++;
        }
        nfm nfmVar = (nfm) obj;
        if (nfmVar != null) {
            return nfmVar.h;
        }
        return false;
    }

    public void v() {
        ((zi3) this.c).o(new CancellationException("onBack cancelled"), true);
        ((rar) this.d).g(null);
    }

    public boolean w(e0o e0oVar) {
        boolean z = true;
        if (e0oVar == null) {
            return true;
        }
        boolean remove = ((Set) this.c).remove(e0oVar);
        if (!((HashSet) this.d).remove(e0oVar) && !remove) {
            z = false;
        }
        if (z) {
            e0oVar.clear();
        }
        return z;
    }

    public boolean x(MotionEvent motionEvent) {
        int[] iArr = (int[]) this.d;
        View J = v7g.J((View) this.c);
        if (J == null) {
            return false;
        }
        J.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float rawX = (motionEvent.getRawX() - motionEvent.getX()) - f;
        float rawY = (motionEvent.getRawY() - motionEvent.getY()) - f2;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        try {
            obtain.offsetLocation(rawX, rawY);
            return J.dispatchTouchEvent(obtain);
        } finally {
            obtain.recycle();
        }
    }

    public void z() {
        if (this.b || ((HashSet) this.d).isEmpty()) {
            return;
        }
        z0j z0jVar = (z0j) this.c;
        u76 u76Var = (u76) z0jVar.d;
        boolean z = false;
        z0jVar.b = ((ConnectivityManager) u76Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) u76Var.get()).registerDefaultNetworkCallback((xd0) z0jVar.e);
            z = true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
        }
        this.b = z;
    }

    public fmq(View view) {
        this.a = 10;
        this.c = view;
        this.d = new int[2];
    }

    public fmq(BackHandlingFrameLayout backHandlingFrameLayout) {
        this.a = 1;
        this.c = backHandlingFrameLayout;
        this.b = false;
    }

    public fmq(String str, js6 js6Var, boolean z) {
        this.a = 3;
        this.d = js6Var;
        this.c = str == null ? js6Var.getClass().getName() : str;
        this.b = z;
    }

    public fmq(ovg ovgVar, aqd aqdVar) {
        this.a = 4;
        this.c = ovgVar;
        this.d = aqdVar;
    }

    public /* synthetic */ fmq(int i, boolean z) {
        this.a = i;
    }

    public fmq(dkh dkhVar, uzg uzgVar, boolean z) {
        this.a = 2;
        this.c = dkhVar;
        this.d = uzgVar;
        if (dvt.a >= 35 && uzgVar != null) {
            uzgVar.a(dkhVar.q());
        }
        this.b = z;
    }

    public fmq(Context context) {
        this.a = 0;
        this.d = new HashSet();
        this.c = new z0j(new u76(new qe(context)), new emq(this));
    }

    public fmq(mm6 mm6Var, boolean z, Function2 function2, slm slmVar) {
        this.a = 7;
        this.b = z;
        this.c = men.g(-2, 4, oi3.a);
        this.d = x97.y(mm6Var, null, null, new rfg(slmVar, function2, this, (Continuation) null, 15), 3);
    }

    public fmq(i iVar, wrh wrhVar, boolean z, d8l d8lVar) {
        this.a = 6;
        this.d = iVar;
        this.c = wrhVar;
        this.b = z;
    }
}
