package defpackage;

import android.animation.ValueAnimator;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import android.view.View;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t5(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0362, code lost:
    
        if (r3.remove(r2) != null) goto L127;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jhh] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SocketChannel socketChannel;
        SelectionKey selectionKey;
        String[] f;
        int i;
        onx onxVar;
        String str = 0;
        str = 0;
        r3 = null;
        xmp xmpVar = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((koj) this.e).e((sgr) this.b, (no4) this.c, (s2i) this.d);
                return;
            case 1:
                ws1 ws1Var = (ws1) this.b;
                if (ws1Var.isCancelled()) {
                    return;
                }
                ws1Var.i = (m56) this.c;
                try {
                    socketChannel = SocketChannel.open();
                    ws1Var.h = socketChannel;
                    try {
                        socketChannel.configureBlocking(false);
                        selectionKey = socketChannel.register((AbstractSelector) ((ys1) this.e).a.c, 8);
                        try {
                            selectionKey.attach(ws1Var);
                            socketChannel.connect((InetSocketAddress) this.d);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (selectionKey != null) {
                                selectionKey.cancel();
                            }
                            wdg.H(socketChannel);
                            ws1Var.k(new RuntimeException(th), null);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        selectionKey = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    socketChannel = null;
                    selectionKey = null;
                }
            case 2:
                View view = (View) this.c;
                int width = view.getWidth();
                qv9 qv9Var = (qv9) this.d;
                xd9 xd9Var = qv9Var.a;
                xzb xzbVar = (xzb) this.e;
                view.setPivotX(vq2.G(view, width, xd9Var, xzbVar));
                view.setPivotY(vq2.G(view, view.getHeight(), qv9Var.b, xzbVar));
                return;
            case 3:
                q54 q54Var = (q54) ((sld) this.e).b;
                rxh rxhVar = (rxh) this.c;
                p54 p54Var = (p54) this.b;
                if (p54Var != null) {
                    q54Var.z = true;
                    p54Var.b.c(false);
                    q54Var.z = false;
                }
                if (rxhVar.isEnabled() && rxhVar.hasSubMenu()) {
                    ((hxh) this.d).q(rxhVar, null, 4);
                    return;
                }
                return;
            case 4:
                ((oo4) ((qv7) this.e).b).n((sgr) this.b, (no4) this.c, (s2i) this.d);
                return;
            case 5:
                String str2 = (String) this.c;
                IBinder binder = ((Messenger) ((mka) this.b).a).getBinder();
                awc awcVar = (awc) this.e;
                jhh jhhVar = (jhh) ((nuh) awcVar.a).e.get(binder);
                if (jhhVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str2);
                    return;
                }
                HashMap hashMap = jhhVar.f;
                nuh nuhVar = (nuh) awcVar.a;
                IBinder iBinder = (IBinder) this.d;
                try {
                    if (iBinder == null) {
                        r4 = hashMap.remove(str2) == null ? 0 : 1;
                    } else {
                        List list = (List) hashMap.get(str2);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((z4k) it.next()).a) {
                                    it.remove();
                                    i2 = 1;
                                }
                            }
                            if (list.size() == 0) {
                                hashMap.remove(str2);
                            }
                        }
                        nuhVar.f = null;
                        r4 = i2;
                    }
                    if (r4 == 0) {
                        Log.w("MBServiceCompat", "removeSubscription called for " + str2 + " which is not subscribed");
                        return;
                    }
                    return;
                } finally {
                    nuhVar.f = null;
                }
            case 6:
                String str3 = (String) this.c;
                khh khhVar = (khh) ((bih) ((n7b) this.e).a).d.get(((Messenger) ((h4b) this.b).a).getBinder());
                if (khhVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str3);
                    return;
                }
                HashMap hashMap2 = khhVar.e;
                IBinder iBinder2 = (IBinder) this.d;
                if (iBinder2 == null) {
                    break;
                } else {
                    List list2 = (List) hashMap2.get(str3);
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (iBinder2 == ((z4k) it2.next()).a) {
                                it2.remove();
                                i2 = 1;
                            }
                        }
                        if (list2.size() == 0) {
                            hashMap2.remove(str3);
                        }
                    }
                }
                r4 = i2;
                if (r4 == 0) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + str3 + " which is not subscribed");
                    return;
                }
                return;
            case 7:
                ((oxa) this.b).u((yqh) this.e, (dqh) this.c, (Collection) this.d);
                return;
            case 8:
                ((oxa) this.b).u((yqh) this.e, (dqh) this.c, (ArrayList) this.d);
                return;
            case 9:
                x7h x7hVar = (x7h) this.e;
                x7hVar.z = true;
                x7hVar.u.n((sgr) this.b, (no4) this.c, (s2i) this.d);
                return;
            case 10:
                synchronized (((d8q) this.e)) {
                    try {
                        if (((b8q) this.b).b == 0) {
                            try {
                                ((c8q) this.c).l(this.d);
                                ((d8q) this.e).a.remove((c8q) this.c);
                                if (((d8q) this.e).a.isEmpty()) {
                                    ((d8q) this.e).c.shutdown();
                                    ((d8q) this.e).c = null;
                                }
                            } catch (Throwable th4) {
                                ((d8q) this.e).a.remove((c8q) this.c);
                                if (((d8q) this.e).a.isEmpty()) {
                                    ((d8q) this.e).c.shutdown();
                                    ((d8q) this.e).c = null;
                                }
                                throw th4;
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                String str4 = (String) this.d;
                Set set = bp6.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    String n = gvt.n(j3c.b());
                    if (n == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = n.toLowerCase();
                    lowerCase.getClass();
                    float[] f2 = o6c.f(lowerCase, (JSONObject) this.c);
                    ofu ofuVar = (ofu) this.b;
                    if (!set.contains(ofu.class)) {
                        try {
                            str = ofuVar.d;
                        } catch (Throwable th5) {
                            bp6.a(ofu.class, th5);
                        }
                    }
                    String v = o6c.v(str4, str, lowerCase);
                    if (f2 == null || (f = oci.f(2, new float[][]{f2}, new String[]{v})) == null) {
                        return;
                    }
                    String str5 = f[0];
                    qlm.a((String) this.e, str5);
                    if (Intrinsics.d(str5, "other")) {
                        return;
                    }
                    HashSet hashSet = ofu.e;
                    jkl.d(str5, str4, f2);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th6) {
                    bp6.a(this, th6);
                    return;
                }
            case 12:
                rpv.i((View) this.b, (vpv) this.c, (nur) this.d);
                ((ValueAnimator) this.e).start();
                return;
            default:
                h3x h3xVar = (h3x) this.b;
                irh irhVar = (irh) this.c;
                irh irhVar2 = (irh) this.d;
                vs3 vs3Var = (vs3) this.e;
                b4x b4xVar = h3xVar.a;
                b4xVar.getClass();
                msg msgVar = b4x.i;
                Set set2 = b4xVar.b;
                if (new HashSet(set2).isEmpty()) {
                    msgVar.b("No need to prepare transfer without any callback", new Object[0]);
                    vs3Var.a(null);
                    return;
                }
                if (irhVar.l != 1) {
                    msgVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    vs3Var.a(null);
                    return;
                }
                xun a = b4xVar.a();
                if (a == null || !a.h()) {
                    msgVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    vs3Var.a(null);
                    return;
                }
                msgVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (irhVar2.l == 0) {
                    zix.a(rgx.CAST_TRANSFER_TO_LOCAL_USED);
                    i = 1;
                } else {
                    i = CastDevice.e(irhVar2.s) == null ? 3 : 2;
                }
                b4xVar.e = i;
                b4xVar.g = vs3Var;
                msgVar.b("notify transferring with type = %d", Integer.valueOf(i));
                Iterator it3 = new HashSet(set2).iterator();
                while (it3.hasNext()) {
                    ifx ifxVar = (ifx) it3.next();
                    int i3 = b4xVar.e;
                    switch (ifxVar.a) {
                        case 0:
                            zfx.j.b("onTransferring with type = %d", Integer.valueOf(i3));
                            zfx zfxVar = (zfx) ifxVar.b;
                            zfxVar.i = true;
                            zfxVar.c();
                            nhx b = zfxVar.c.b(zfxVar.g);
                            hhx n2 = ihx.n(b.d());
                            n2.c();
                            ihx.y((ihx) n2.b, i3);
                            b.e((ihx) n2.b());
                            zfxVar.a.a((ohx) b.b(), 230);
                            break;
                        default:
                            w2r w2rVar = new w2r(10);
                            tao taoVar = (tao) ifxVar.b;
                            w2rVar.d = Boolean.valueOf(((s0x) taoVar.b).i == 2);
                            tao.w(taoVar, new l5x(w2rVar));
                            mox x = taoVar.x();
                            g0x g0xVar = new g0x(new jsg(i3, 17));
                            g0xVar.c = x.h;
                            x.c.add(g0xVar);
                            break;
                    }
                }
                b4xVar.h = null;
                y1g.B("Must be called from the main thread.");
                if (a.y()) {
                    a.g = new i8s();
                    xun.l.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a.d();
                    owh e = a.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a2 = a.a();
                        bph bphVar = e.v;
                        double d2 = e.d;
                        if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                            xq0.x("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                            return;
                        }
                        xmpVar = new xmp(new coh(d, bphVar, bool, a2, d2, e.k, e.o, null, null, null, null, 0L), null);
                    }
                    i8s i8sVar = a.g;
                    if (xmpVar != null) {
                        i8sVar.b(xmpVar);
                    } else {
                        i8sVar.a(new s1x());
                    }
                    onxVar = a.g.a;
                } else {
                    onxVar = ywf.v(new s1x());
                }
                q3x q3xVar = new q3x(i2, b4xVar);
                onxVar.getClass();
                onxVar.d(j8s.a, q3xVar);
                onxVar.n(new z6n(21, b4xVar));
                fsn fsnVar = b4xVar.c;
                y1g.G(fsnVar);
                t3x t3xVar = b4xVar.d;
                y1g.G(t3xVar);
                fsnVar.postDelayed(t3xVar, 10000L);
                return;
        }
    }

    public /* synthetic */ t5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
