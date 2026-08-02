package defpackage;

import android.media.session.MediaSession;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class e8h implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public e8h(Function1 function1, kxt kxtVar) {
        this.a = 24;
        this.b = (uif) function1;
        this.c = kxtVar;
    }

    private final void b() {
        t4w t4wVar;
        htm htmVar = ((fzr) this.c).a.f;
        String str = (String) this.b;
        synchronized (htmVar.k) {
            try {
                n5w c = htmVar.c(str);
                t4wVar = c != null ? c.a : null;
            } finally {
            }
        }
        if (t4wVar == null || Intrinsics.d(fa6.j, t4wVar.j)) {
            return;
        }
        synchronized (((fzr) this.c).c) {
            ((fzr) this.c).f.put(bzf.A(t4wVar), t4wVar);
            fzr fzrVar = (fzr) this.c;
            ((fzr) this.c).g.put(bzf.A(t4wVar), r3w.a(fzrVar.h, t4wVar, fzrVar.b.b, fzrVar));
        }
    }

    public void a() {
        Socket socket;
        Socket socket2;
        qcv qcvVar = (qcv) this.c;
        try {
            socket = qcvVar.socket;
            if (socket != null) {
                socket2 = qcvVar.socket;
                socket2.close();
            }
        } catch (IOException e) {
            qcvVar.onWebsocketError((qcv) this.b, e);
        }
    }

    public void c() {
        tcv tcvVar;
        OutputStream outputStream;
        OutputStream outputStream2;
        tcv tcvVar2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        qcv qcvVar = (qcv) this.c;
        while (!Thread.interrupted()) {
            try {
                tcvVar2 = qcvVar.engine;
                ByteBuffer byteBuffer = (ByteBuffer) tcvVar2.b.take();
                outputStream3 = qcvVar.ostream;
                outputStream3.write(byteBuffer.array(), 0, byteBuffer.limit());
                outputStream4 = qcvVar.ostream;
                outputStream4.flush();
            } catch (InterruptedException unused) {
                tcvVar = qcvVar.engine;
                Iterator it = tcvVar.b.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer2 = (ByteBuffer) it.next();
                    outputStream = qcvVar.ostream;
                    outputStream.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                    outputStream2 = qcvVar.ostream;
                    outputStream2.flush();
                }
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        defpackage.lhp.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((lhp) this.c).b) {
                    if (!z) {
                        lhp lhpVar = (lhp) this.c;
                        if (lhpVar.c != 4) {
                            lhpVar.d++;
                            lhpVar.c = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((lhp) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((lhp) this.c).c = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x03e0, code lost:
    
        if (r2 != false) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167 A[Catch: all -> 0x016b, Exception -> 0x016d, TryCatch #1 {Exception -> 0x016d, blocks: (B:88:0x0155, B:92:0x0167, B:93:0x016f, B:95:0x017f, B:102:0x019e, B:110:0x017c, B:115:0x0161), top: B:87:0x0155, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v152, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        Timer timer;
        String str;
        g8e g8eVar;
        int i3 = 2;
        boolean z = true;
        Thread thread = null;
        r4 = null;
        String str2 = null;
        r4 = null;
        vjp vjpVar = null;
        r4 = null;
        r4 = null;
        vjp vjpVar2 = null;
        r0o r0oVar = 0;
        switch (this.a) {
            case 0:
                f8h f8hVar = (f8h) this.b;
                g8h g8hVar = (g8h) this.c;
                j8h j8hVar = g8hVar.d;
                if (g8hVar.a.get() != j8h.i0) {
                    f8hVar.j();
                    return;
                }
                if (j8hVar.A == null) {
                    j8hVar.A = new LinkedHashSet();
                    j8hVar.Y.F(j8hVar.B, true);
                }
                j8hVar.A.add(f8hVar);
                return;
            case 1:
                ((yn4) this.c).run();
                f8h f8hVar2 = (f8h) this.b;
                f8hVar2.n.d.m.execute(new gv7(f8hVar2, i3));
                return;
            case 2:
                gs4 gs4Var = (gs4) this.c;
                msh mshVar = (msh) this.b;
                ArrayList arrayList = (ArrayList) gs4Var.a;
                if (!arrayList.isEmpty()) {
                    d9e d = mshVar.d();
                    if (d != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", d.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                mhh mhhVar = (mhh) gs4Var.b;
                mhhVar.getClass();
                MediaSession.Token token = (MediaSession.Token) mshVar.b;
                token.getClass();
                mhhVar.setSessionToken(token);
                return;
            case 3:
                dn9 dn9Var = (dn9) this.c;
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.b;
                ArrayList arrayList2 = (ArrayList) dn9Var.b;
                if (!arrayList2.isEmpty()) {
                    e9e d2 = mediaSessionCompat$Token.d();
                    if (d2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((Bundle) it2.next()).putBinder("extra_session_binder", d2.asBinder());
                        }
                    }
                    arrayList2.clear();
                }
                ((mhh) dn9Var.c).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.b);
                return;
            case 4:
                dn9 dn9Var2 = (dn9) this.c;
                bih bihVar = (bih) dn9Var2.e;
                bih bihVar2 = (bih) dn9Var2.e;
                Iterator it3 = ((uy0) bihVar.d.keySet()).iterator();
                while (true) {
                    ty0 ty0Var = (ty0) it3;
                    if (!ty0Var.hasNext()) {
                        return;
                    }
                    khh khhVar = (khh) bihVar2.d.get((IBinder) ty0Var.next());
                    String str3 = (String) this.b;
                    List<z4k> list = (List) khhVar.e.get(str3);
                    if (list != null) {
                        for (z4k z4kVar : list) {
                            Bundle bundle = (Bundle) z4kVar.b;
                            int i4 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                            int i5 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            if (i4 == -1 || i5 == -1) {
                                i = 0;
                                i2 = Integer.MAX_VALUE;
                            } else {
                                i = i4 * i5;
                                i2 = (i5 + i) - 1;
                            }
                            if (Integer.MAX_VALUE >= i && i2 >= 0) {
                                bihVar2.e(str3, khhVar, (Bundle) z4kVar.b);
                            }
                        }
                    }
                }
                break;
            case 5:
                Set set = bp6.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    View view = (View) this.c;
                    if (view instanceof EditText) {
                        i3i i3iVar = (i3i) this.b;
                        if (set.contains(i3i.class)) {
                            return;
                        }
                        try {
                            i3iVar.b(view);
                            return;
                        } catch (Throwable th) {
                            bp6.a(i3i.class, th);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    bp6.a(this, th2);
                    return;
                }
            case 6:
                it1 it1Var = (it1) this.c;
                Object obj = this.b;
                boolean z2 = it1Var.c.get();
                dzw dzwVar = it1Var.e;
                if (z2) {
                    if (dzwVar.h == it1Var) {
                        SystemClock.uptimeMillis();
                        dzwVar.h = null;
                        dzwVar.b();
                    }
                } else if (dzwVar.g != it1Var) {
                    if (dzwVar.h == it1Var) {
                        SystemClock.uptimeMillis();
                        dzwVar.h = null;
                        dzwVar.b();
                    }
                } else if (!dzwVar.c) {
                    SystemClock.uptimeMillis();
                    dzwVar.g = null;
                    sgg sggVar = dzwVar.a;
                    if (sggVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            sggVar.l(obj);
                        } else {
                            sggVar.m(obj);
                        }
                    }
                }
                it1Var.b = 3;
                return;
            case 7:
                Set set2 = bp6.a;
                if (set2.contains(this)) {
                    return;
                }
                try {
                    String str4 = (String) this.b;
                    List c = t75.c((ht0) this.c);
                    Boolean bool = ovn.a;
                    if (set2.contains(ovn.class)) {
                        return;
                    }
                    try {
                        c.getClass();
                        ovn.b.Q(str4, c, 2);
                        return;
                    } catch (Throwable th3) {
                        bp6.a(ovn.class, th3);
                        return;
                    }
                } catch (Throwable th4) {
                    bp6.a(this, th4);
                    return;
                }
            case 8:
                zt3 zt3Var = (zt3) this.b;
                if (zt3Var.w()) {
                    mc4 mc4Var = (mc4) ((dow) this.c).b;
                    mc4Var.getClass();
                    r76 i6 = ((t7h) mc4Var).i(false);
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(i6);
                    return;
                }
                return;
            case 9:
                ((eqc) this.b).accept(this.c);
                return;
            case 10:
                ((zt3) this.c).E((uob) this.b, Unit.a);
                return;
            case 11:
                synchronized (((x7h) ((e8h) this.c).c).i) {
                    try {
                        e8h e8hVar = (e8h) this.c;
                        if (!((r0o) e8hVar.b).b) {
                            x7h x7hVar = (x7h) e8hVar.c;
                            x7hVar.o = x7hVar.o.a((lao) this.b);
                            x7h x7hVar2 = (x7h) ((e8h) this.c).c;
                            if (x7hVar2.i(x7hVar2.o)) {
                                mao maoVar = ((x7h) ((e8h) this.c).c).m;
                                if (maoVar != null) {
                                    if (maoVar.d.get() > maoVar.b) {
                                        break;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                x7h x7hVar3 = (x7h) ((e8h) this.c).c;
                                r0o r0oVar2 = new r0o(x7hVar3.i);
                                x7hVar3.w = r0oVar2;
                                thread = r0oVar2;
                                z = false;
                                r0oVar = thread;
                            }
                            x7h x7hVar4 = (x7h) ((e8h) this.c).c;
                            iao iaoVar = x7hVar4.o;
                            if (!iaoVar.h) {
                                iaoVar = new iao(iaoVar.b, iaoVar.c, iaoVar.d, iaoVar.f, iaoVar.g, iaoVar.a, true, iaoVar.e);
                            }
                            x7hVar4.o = iaoVar;
                            ((x7h) ((e8h) this.c).c).w = null;
                            z = false;
                            r0oVar = thread;
                        }
                    } finally {
                    }
                }
                if (z) {
                    lao laoVar = (lao) this.b;
                    laoVar.a.v0(new jtc((x7h) ((e8h) this.c).c, laoVar));
                    ((lao) this.b).a.f(sgr.f.i("Unneeded hedging"));
                    return;
                } else {
                    if (r0oVar != 0) {
                        x7h x7hVar5 = (x7h) ((e8h) this.c).c;
                        r0oVar.d(x7hVar5.d.schedule(new e8h(12, x7hVar5, r0oVar), x7hVar5.g.b, TimeUnit.NANOSECONDS));
                    }
                    ((x7h) ((e8h) this.c).c).g((lao) this.b);
                    return;
                }
            case 12:
                x7h x7hVar6 = (x7h) this.c;
                lao d3 = x7hVar6.d(x7hVar6.o.e, false);
                if (d3 == null) {
                    return;
                }
                ((x7h) this.c).b.execute(new e8h(11, this, d3));
                return;
            case 13:
                ((x7h) ((jtc) this.c).b).u.d((s2i) this.b);
                return;
            case 14:
                ((x7h) ((jtc) this.c).b).u.t((ljr) this.b);
                return;
            case 15:
                View view2 = (View) this.b;
                int left = view2.getLeft();
                lyo lyoVar = (lyo) this.c;
                lyoVar.smoothScrollTo(left - ((lyoVar.getWidth() - view2.getWidth()) / 2), 0);
                lyoVar.a = null;
                return;
            case 16:
                tao taoVar = ((dzo) ((pwe) this.c).a).f;
                if (taoVar != null) {
                    vjp vjpVar3 = (vjp) this.b;
                    Boolean bool2 = vjpVar3.g;
                    String str5 = vjpVar3.a;
                    if (!bool2.booleanValue() && taoVar.i(str5).booleanValue()) {
                        taoVar.v(vjpVar3, Boolean.TRUE);
                        if (((Boolean) taoVar.d).booleanValue()) {
                            vjpVar2 = taoVar.f(str5);
                        }
                    }
                    if (vjpVar2 != null) {
                        ((dzo) ((pwe) this.c).a).l.onLost(vjpVar2);
                    }
                }
                if (((dzo) ((pwe) this.c).a).k != null) {
                    ((dzo) ((pwe) this.c).a).k.onFound((vjp) this.b);
                    return;
                }
                return;
            case 17:
                if (((dzo) this.c).l != null) {
                    ((dzo) this.c).l.onLost((vjp) this.b);
                    tao taoVar2 = ((dzo) this.c).f;
                    if (taoVar2 != null) {
                        vjp vjpVar4 = (vjp) this.b;
                        Boolean bool3 = vjpVar4.g;
                        String str6 = vjpVar4.a;
                        if (!bool3.booleanValue() && taoVar2.i(str6).booleanValue()) {
                            taoVar2.v(vjpVar4, Boolean.FALSE);
                            vjpVar = taoVar2.f(str6);
                        }
                        if (vjpVar != null) {
                            ((dzo) this.c).k.onFound(vjpVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                try {
                    d();
                    return;
                } catch (Error e) {
                    synchronized (((lhp) this.c).b) {
                        ((lhp) this.c).c = 1;
                        throw e;
                    }
                }
            case 19:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((qhp) this.b).e) {
                        ((qhp) this.b).a();
                    }
                    return;
                } catch (Throwable th5) {
                    synchronized (((qhp) this.b).e) {
                        ((qhp) this.b).a();
                        throw th5;
                    }
                }
            case 20:
                ((qe6) this.b).Q((Throwable) this.c);
                return;
            case 21:
                n3m n3mVar = (n3m) this.c;
                n3mVar.e = new xd0(6, this);
                ((ConnectivityManager) n3mVar.d).registerNetworkCallback(new NetworkRequest.Builder().build(), (xd0) n3mVar.e);
                return;
            case 22:
                b();
                return;
            case 23:
                kxt kxtVar = (kxt) this.c;
                rxt rxtVar = (rxt) this.b;
                Iterator it4 = CollectionsKt.w0(rxtVar.h.values()).iterator();
                while (it4.hasNext()) {
                    ((Function1) it4.next()).invoke(kxtVar);
                }
                ckj ckjVar = (ckj) rxtVar.f.get(kxtVar.c());
                if (ckjVar != null) {
                    akj akjVar = new akj(ckjVar);
                    while (akjVar.hasNext()) {
                        ((Function1) akjVar.next()).invoke(kxtVar);
                    }
                    return;
                }
                return;
            case 24:
                ((uif) this.b).invoke((kxt) this.c);
                return;
            case 25:
                seu seuVar = (seu) this.b;
                Set set3 = bp6.a;
                try {
                    if (set3.contains(this)) {
                        return;
                    }
                    try {
                        if (!set3.contains(seu.class)) {
                            try {
                                timer = seuVar.c;
                            } catch (Throwable th6) {
                                bp6.a(seu.class, th6);
                            }
                            if (timer != null) {
                                timer.cancel();
                            }
                            if (!bp6.a.contains(seu.class)) {
                                try {
                                    seuVar.d = null;
                                } catch (Throwable th7) {
                                    bp6.a(seu.class, th7);
                                }
                            }
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate((fbr) this.c, 0L, 1000);
                            if (bp6.a.contains(seu.class)) {
                                try {
                                    seuVar.c = timer2;
                                    return;
                                } catch (Throwable th8) {
                                    bp6.a(seu.class, th8);
                                    return;
                                }
                            }
                            return;
                        }
                        timer = null;
                        if (timer != null) {
                        }
                        if (!bp6.a.contains(seu.class)) {
                        }
                        Timer timer22 = new Timer();
                        timer22.scheduleAtFixedRate((fbr) this.c, 0L, 1000);
                        if (bp6.a.contains(seu.class)) {
                        }
                    } catch (Exception e2) {
                        Log.e(seu.a(), "Error scheduling indexing job", e2);
                        return;
                    }
                } catch (Throwable th9) {
                    bp6.a(this, th9);
                    return;
                }
            case 26:
                seu seuVar2 = (seu) this.b;
                String str7 = (String) this.c;
                Set set4 = bp6.a;
                if (set4.contains(this)) {
                    return;
                }
                try {
                    str7.getClass();
                    byte[] bytes = str7.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.getClass();
                        messageDigest.update(bytes);
                        byte[] digest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            sb.append(Integer.toHexString((b >> 4) & 15));
                            sb.append(Integer.toHexString(b & 15));
                        }
                        str = sb.toString();
                    } catch (NoSuchAlgorithmException unused) {
                        str = null;
                    }
                    Date date = ja.l;
                    ja N = n7w.N();
                    if (str != null) {
                        if (!set4.contains(seu.class)) {
                            try {
                                str2 = seuVar2.d;
                            } catch (Throwable th10) {
                                bp6.a(seu.class, th10);
                            }
                        }
                        if (str.equals(str2)) {
                            return;
                        }
                    }
                    String str8 = seu.e;
                    seuVar2.b(wdg.F(str7, N, j3c.c()), str);
                    return;
                } catch (Throwable th11) {
                    bp6.a(this, th11);
                    return;
                }
            case 27:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    HashSet hashSet = ofu.e;
                    jkl.d((String) this.b, (String) this.c, new float[0]);
                    return;
                } catch (Throwable th12) {
                    bp6.a(this, th12);
                    return;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                qcv qcvVar = (qcv) this.c;
                Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
                try {
                    try {
                        c();
                    } catch (IOException e3) {
                        qcv.access$000(qcvVar, e3);
                    }
                    return;
                } finally {
                    a();
                    qcvVar.writeThread = null;
                }
            default:
                h66 h66Var = (h66) this.b;
                cxw cxwVar = (cxw) this.c;
                fo0 fo0Var = cxwVar.a;
                axw axwVar = (axw) cxwVar.f.j.get(cxwVar.b);
                if (axwVar == null) {
                    return;
                }
                if (!h66Var.e()) {
                    axwVar.m(h66Var, null);
                    return;
                }
                cxwVar.e = true;
                if (fo0Var.e()) {
                    if (!cxwVar.e || (g8eVar = cxwVar.c) == null) {
                        return;
                    }
                    fo0Var.f(g8eVar, cxwVar.d);
                    return;
                }
                try {
                    fo0Var.f(null, fo0Var.g());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    fo0Var.b("Failed to get service from broker.");
                    axwVar.m(new h66(10), null);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 18:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((lhp) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e8h(zt3 zt3Var, qqn qqnVar, dow dowVar) {
        this.a = 8;
        this.b = zt3Var;
        this.c = dowVar;
    }

    public /* synthetic */ e8h(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ e8h(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public e8h(lhp lhpVar) {
        this.a = 18;
        this.c = lhpVar;
    }
}
