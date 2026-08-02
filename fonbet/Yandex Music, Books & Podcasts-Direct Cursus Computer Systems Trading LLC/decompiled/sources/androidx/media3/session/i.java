package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import defpackage.ahh;
import defpackage.alp;
import defpackage.blp;
import defpackage.bnp;
import defpackage.chp;
import defpackage.clp;
import defpackage.cmh;
import defpackage.cr;
import defpackage.cy1;
import defpackage.d8l;
import defpackage.dsh;
import defpackage.dvt;
import defpackage.fmq;
import defpackage.fth;
import defpackage.gal;
import defpackage.gvh;
import defpackage.i8l;
import defpackage.ith;
import defpackage.iwe;
import defpackage.j9l;
import defpackage.jde;
import defpackage.jr1;
import defpackage.jth;
import defpackage.juc;
import defpackage.jyr;
import defpackage.kth;
import defpackage.l83;
import defpackage.lcg;
import defpackage.leu;
import defpackage.lrl;
import defpackage.m78;
import defpackage.mth;
import defpackage.mzb;
import defpackage.nsh;
import defpackage.nuh;
import defpackage.okh;
import defpackage.p08;
import defpackage.ps1;
import defpackage.pv7;
import defpackage.q56;
import defpackage.qzc;
import defpackage.rdl;
import defpackage.srb;
import defpackage.ssg;
import defpackage.sth;
import defpackage.ump;
import defpackage.urh;
import defpackage.vq1;
import defpackage.vrh;
import defpackage.wrh;
import defpackage.wvs;
import defpackage.xgc;
import defpackage.xkh;
import defpackage.xop;
import defpackage.xq0;
import defpackage.yde;
import defpackage.yfh;
import defpackage.ynh;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class i {
    public static final ump E = new ump(1);
    public boolean A;
    public final yde B;
    public yde C;
    public Bundle D;
    public final Object a = new Object();
    public final Uri b;
    public final ith c;
    public final ahh d;
    public final cr e;
    public final Context f;
    public final gvh g;
    public final sth h;
    public final String i;
    public final bnp j;
    public final mzb k;
    public final Handler l;
    public final yfh m;
    public final fth n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final yde r;
    public rdl s;
    public lrl t;
    public final PendingIntent u;
    public jth v;
    public qzc w;
    public nuh x;
    public boolean y;
    public final long z;

    public i(mzb mzbVar, Context context, i8l i8lVar, PendingIntent pendingIntent, yde ydeVar, yde ydeVar2, yde ydeVar3, cr crVar, Bundle bundle, Bundle bundle2, yfh yfhVar) {
        vq1.Y("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + dvt.b + "]");
        this.k = mzbVar;
        this.f = context;
        this.i = "";
        this.u = pendingIntent;
        this.B = ydeVar;
        this.C = ydeVar2;
        this.r = ydeVar3;
        this.e = crVar;
        this.D = bundle2;
        this.m = yfhVar;
        this.p = true;
        this.q = true;
        gvh gvhVar = new gvh(this);
        this.g = gvhVar;
        this.o = new Handler(Looper.getMainLooper());
        Looper X = i8lVar.X();
        Handler handler = new Handler(X);
        this.l = handler;
        this.s = rdl.F;
        this.c = new ith(this, X);
        this.d = new ahh(this, X);
        Uri build = new Uri.Builder().scheme(i.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = build;
        sth sthVar = new sth(this, build, handler, bundle);
        this.h = sthVar;
        this.j = new bnp(Process.myUid(), 1006001300, 4, context.getPackageName(), gvhVar, bundle, (MediaSession.Token) ((dsh) sthVar.l.b).c.b);
        d8l d8lVar = urh.f;
        blp blpVar = urh.e;
        lrl lrlVar = new lrl(i8lVar);
        lrlVar.c = ydeVar;
        lrlVar.d = ydeVar2;
        lrlVar.e = blpVar;
        lrlVar.f = d8lVar;
        lrlVar.b = new Bundle(bundle2);
        if (!ydeVar2.isEmpty()) {
            lrlVar.q1();
        }
        this.t = lrlVar;
        dvt.c0(handler, new juc(24, this, lrlVar));
        this.z = 3000L;
        this.n = new fth(this, 1);
        dvt.c0(handler, new fth(this, 2));
    }

    public static boolean l(wrh wrhVar) {
        return wrhVar != null && wrhVar.b == 0 && Objects.equals(wrhVar.a.a.a, "com.android.systemui");
    }

    public final boolean a(KeyEvent keyEvent, boolean z, boolean z2) {
        q56 q56Var;
        wrh f = this.k.a.f();
        f.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            q56Var = new q56(this, f, 3);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!this.t.g0()) {
                                q56Var = new q56(this, f, 2);
                                break;
                            } else {
                                q56Var = new q56(this, f, 1);
                                break;
                            }
                        case 86:
                            q56Var = new q56(this, f, 9);
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            q56Var = new q56(this, f, 8);
                            break;
                        case 90:
                            q56Var = new q56(this, f, 7);
                            break;
                        default:
                            return false;
                    }
                }
                q56Var = new q56(this, f, 6);
            }
            q56Var = new q56(this, f, 5);
        } else {
            q56Var = new q56(this, f, 4);
        }
        dvt.c0(this.l, new srb(this, z2, f, q56Var, 2));
        return true;
    }

    public final lcg b(wrh wrhVar, kth kthVar) {
        int i;
        lcg lcgVar;
        gvh gvhVar = this.g;
        try {
            ps1 E2 = gvhVar.i.E(wrhVar);
            if (E2 != null) {
                chp b = E2.b(E);
                i = b.h;
                lcgVar = b;
            } else {
                if (!i(wrhVar)) {
                    return leu.S(new ump(-100));
                }
                i = 0;
                lcgVar = leu.S(new ump(0));
            }
            vrh vrhVar = wrhVar.d;
            if (vrhVar != null) {
                kthVar.a(vrhVar, i);
            }
            return lcgVar;
        } catch (DeadObjectException unused) {
            gvhVar.i.U(wrhVar);
            return leu.S(new ump(-100));
        } catch (RemoteException e) {
            vq1.o0("MediaSessionImpl", "Exception in ".concat(wrhVar.toString()), e);
            return leu.S(new ump(-1));
        }
    }

    public final void c(wrh wrhVar, kth kthVar) {
        int i;
        gvh gvhVar = this.g;
        try {
            ps1 E2 = gvhVar.i.E(wrhVar);
            if (E2 != null) {
                i = E2.c();
            } else if (!i(wrhVar)) {
                return;
            } else {
                i = 0;
            }
            vrh vrhVar = wrhVar.d;
            if (vrhVar != null) {
                kthVar.a(vrhVar, i);
            }
        } catch (DeadObjectException unused) {
            gvhVar.i.U(wrhVar);
        } catch (RemoteException e) {
            vq1.o0("MediaSessionImpl", "Exception in ".concat(wrhVar.toString()), e);
        }
    }

    public final void d(kth kthVar) {
        yde x = this.g.i.x();
        for (int i = 0; i < x.size(); i++) {
            c((wrh) x.get(i), kthVar);
        }
        try {
            kthVar.a(this.h.j, 0);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.g.i.x());
        boolean z = this.A;
        sth sthVar = this.h;
        if (!z) {
            arrayList.addAll(sthVar.g.x());
            return arrayList;
        }
        yde x = sthVar.g.x();
        for (int i = 0; i < x.size(); i++) {
            wrh wrhVar = (wrh) x.get(i);
            if (!l(wrhVar)) {
                arrayList.add(wrhVar);
            }
        }
        return arrayList;
    }

    public final wrh f() {
        yde x = this.g.i.x();
        for (int i = 0; i < x.size(); i++) {
            wrh wrhVar = (wrh) x.get(i);
            if (j(wrhVar)) {
                return wrhVar;
            }
        }
        return null;
    }

    public final void g(d8l d8lVar) {
        this.c.a(false, false);
        d(new cmh(d8lVar));
        try {
            m78 m78Var = this.h.j;
            p08 p08Var = this.s.q;
            m78Var.w();
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void h(wrh wrhVar, boolean z) {
        if (q()) {
            boolean z2 = this.t.V0(16) && this.t.M0() != null;
            boolean z3 = this.t.V0(31) || this.t.V0(20);
            wrh u = u(wrhVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            vq1.A(!false);
            sparseBooleanArray.append(1, true);
            vq1.A(!false);
            d8l d8lVar = new d8l(new xgc(sparseBooleanArray));
            if (z2 || !z3) {
                if (!z2) {
                    vq1.n0("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                dvt.P(this.t);
                if (z) {
                    r(u);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            jde jdeVar = new jde();
            jdeVar.m(unsupportedOperationException);
            jdeVar.a(new pv7(jdeVar, new fmq(this, u, z, d8lVar), false, 9), new xkh(2, this));
        }
    }

    public final boolean i(wrh wrhVar) {
        return this.g.i.I(wrhVar) || this.h.g.I(wrhVar);
    }

    public final boolean j(wrh wrhVar) {
        return Objects.equals(wrhVar.a.a.a, this.f.getPackageName()) && wrhVar.b != 0 && new Bundle(wrhVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.y;
        }
        return z;
    }

    public final lcg m(wrh wrhVar, List list) {
        return this.e.Q(this.k, u(wrhVar), list);
    }

    public final urh n(wrh wrhVar) {
        if (this.A && l(wrhVar)) {
            blp blpVar = urh.e;
            blp blpVar2 = this.t.e;
            blpVar2.getClass();
            d8l d8lVar = this.t.f;
            d8lVar.getClass();
            yde ydeVar = this.t.c;
            yde v = ydeVar == null ? null : yde.v(ydeVar);
            yde ydeVar2 = this.t.d;
            return new urh(blpVar2, d8lVar, v, ydeVar2 != null ? yde.v(ydeVar2) : null);
        }
        cr crVar = this.e;
        crVar.getClass();
        mzb mzbVar = this.k;
        mzbVar.getClass();
        ssg.a(3, "SessionCallback", "onConnect(" + wrhVar + ")", null);
        blp blpVar3 = ((j9l) crVar.b).s.f;
        if (Intrinsics.d(blpVar3, blp.b)) {
            blpVar3 = null;
        }
        if (blpVar3 == null) {
            blpVar3 = ((clp) ((jyr) crVar.i).getValue()).b;
        }
        urh urhVar = new urh(blpVar3, gal.a, null, null);
        if (j(wrhVar)) {
            this.A = true;
            yde ydeVar3 = urhVar.d;
            if (ydeVar3 == null) {
                ydeVar3 = mzbVar.a.C;
            }
            if (ydeVar3.isEmpty()) {
                lrl lrlVar = this.t;
                yde ydeVar4 = urhVar.c;
                if (ydeVar4 == null) {
                    ydeVar4 = mzbVar.a.B;
                }
                lrlVar.c = ydeVar4;
            } else {
                x(ydeVar3);
            }
            w(urhVar.a, urhVar.b);
        }
        return urhVar;
    }

    public final lcg o(wrh wrhVar, alp alpVar, Bundle bundle) {
        return this.e.V(this.k, u(wrhVar), alpVar, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(wrh wrhVar, Intent intent) {
        boolean z;
        int i = wrhVar.b;
        Bundle extras = intent.getExtras();
        cy1 cy1Var = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            Context context = this.f;
            if ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEvent != null && keyEvent.getAction() == 0) {
                y();
                this.e.getClass();
                int keyCode = keyEvent.getKeyCode();
                boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
                ahh ahhVar = this.d;
                if (keyCode != 79 && keyCode != 85) {
                    cy1 cy1Var2 = (cy1) ahhVar.b;
                    if (cy1Var2 != null) {
                        ahhVar.removeCallbacks(cy1Var2);
                        cy1 cy1Var3 = (cy1) ahhVar.b;
                        ahhVar.b = null;
                        cy1Var = cy1Var3;
                    }
                    if (cy1Var != null) {
                        dvt.c0(ahhVar, cy1Var);
                    }
                } else if (!hasSystemFeature && i == 0 && keyEvent.getRepeatCount() == 0) {
                    cy1 cy1Var4 = (cy1) ahhVar.b;
                    if (cy1Var4 == null) {
                        cy1 cy1Var5 = new cy1(21, ahhVar, wrhVar, keyEvent);
                        ahhVar.b = cy1Var5;
                        ahhVar.postDelayed(cy1Var5, ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    if (cy1Var4 != null) {
                        ahhVar.removeCallbacks(cy1Var4);
                        ahhVar.b = null;
                    }
                    z = true;
                    if (!this.A) {
                        return a(keyEvent, z, intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false));
                    }
                    sth sthVar = this.h;
                    if ((keyCode == 85 || keyCode == 79) && z) {
                        sthVar.V();
                        return true;
                    }
                    if (i != 0) {
                        ((okh) ((iwe) sthVar.l.c).b).a.dispatchMediaButtonEvent(keyEvent);
                        return true;
                    }
                } else {
                    cy1 cy1Var6 = (cy1) ahhVar.b;
                    if (cy1Var6 != null) {
                        ahhVar.removeCallbacks(cy1Var6);
                        cy1 cy1Var7 = (cy1) ahhVar.b;
                        ahhVar.b = null;
                        cy1Var = cy1Var7;
                    }
                    if (cy1Var != null) {
                        dvt.c0(ahhVar, cy1Var);
                    }
                }
                z = false;
                if (!this.A) {
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            xop xopVar = new xop();
            this.o.post(new juc(23, this, xopVar));
            try {
                return ((Boolean) xopVar.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                wvs.m(e);
                return false;
            }
        }
        qzc qzcVar = this.w;
        if (qzcVar != null) {
            MediaSessionService mediaSessionService = (MediaSessionService) qzcVar.b;
            int i = dvt.a;
            if (i >= 31 && i < 33) {
                int i2 = MediaSessionService.g;
                if (!mediaSessionService.c(null).b()) {
                    return mediaSessionService.h(this.k, true);
                }
            }
        }
        return true;
    }

    public final void r(wrh wrhVar) {
        u(wrhVar);
        this.e.getClass();
    }

    public final xop s(wrh wrhVar, List list, final int i, final long j) {
        return dvt.l0(this.e.Q(this.k, u(wrhVar), list), new jr1() { // from class: trh
            @Override // defpackage.jr1
            /* renamed from: apply */
            public final lcg mo34apply(Object obj) {
                return leu.S(new xrh(i, j, (List) obj));
            }
        });
    }

    public final void t() {
        String str;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.6.1] [");
        sb.append(dvt.b);
        sb.append("] [");
        HashSet hashSet = ynh.a;
        synchronized (ynh.class) {
            str = ynh.b;
        }
        sb.append(str);
        sb.append("]");
        vq1.Y("MediaSessionImpl", sb.toString());
        synchronized (this.a) {
            try {
                if (this.y) {
                    return;
                }
                this.y = true;
                ahh ahhVar = this.d;
                cy1 cy1Var = (cy1) ahhVar.b;
                if (cy1Var != null) {
                    ahhVar.removeCallbacks(cy1Var);
                    ahhVar.b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    dvt.c0(this.l, new fth(this, 0));
                } catch (Exception e) {
                    vq1.o0("MediaSessionImpl", "Exception thrown while closing", e);
                }
                sth sthVar = this.h;
                ComponentName componentName = sthVar.n;
                i iVar = sthVar.h;
                nsh nshVar = sthVar.l;
                if (dvt.a < 31) {
                    if (componentName == null) {
                        ((dsh) nshVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", iVar.b);
                        intent.setComponent(componentName);
                        ((dsh) nshVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(iVar.f, 0, intent, sth.s));
                    }
                }
                l83 l83Var = sthVar.m;
                if (l83Var != null) {
                    iVar.f.unregisterReceiver(l83Var);
                }
                dsh dshVar = (dsh) nshVar.b;
                MediaSession mediaSession = dshVar.a;
                dshVar.f.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                dshVar.b.a.set(null);
                mediaSession.release();
                gvh gvhVar = this.g;
                Iterator it = gvhVar.i.x().iterator();
                while (it.hasNext()) {
                    vrh vrhVar = ((wrh) it.next()).d;
                    if (vrhVar != null) {
                        try {
                            vrhVar.d();
                        } catch (RemoteException unused) {
                        }
                    }
                }
                Iterator it2 = gvhVar.j.iterator();
                while (it2.hasNext()) {
                    vrh vrhVar2 = ((wrh) it2.next()).d;
                    if (vrhVar2 != null) {
                        try {
                            vrhVar2.d();
                        } catch (RemoteException unused2) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wrh u(wrh wrhVar) {
        if (!this.A || !l(wrhVar)) {
            return wrhVar;
        }
        wrh f = f();
        f.getClass();
        return f;
    }

    public final void v() {
        Handler handler = this.l;
        fth fthVar = this.n;
        handler.removeCallbacks(fthVar);
        if (this.q) {
            long j = this.z;
            if (j > 0) {
                if (this.t.e() || this.t.f()) {
                    handler.postDelayed(fthVar, j);
                }
            }
        }
    }

    public final void w(blp blpVar, d8l d8lVar) {
        boolean z = this.t.f.a(17) != d8lVar.a(17);
        lrl lrlVar = this.t;
        lrlVar.e = blpVar;
        lrlVar.f = d8lVar;
        boolean isEmpty = lrlVar.d.isEmpty();
        sth sthVar = this.h;
        if (!isEmpty) {
            boolean z2 = lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
            boolean z3 = lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
            lrlVar.q1();
            if (lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z2 || lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z3) {
                ((dsh) sthVar.l.b).a.setExtras(this.t.b);
            }
        }
        lrl lrlVar2 = this.t;
        if (z) {
            dvt.c0(sthVar.h.l, new mth(sthVar, lrlVar2, 0));
        } else {
            sthVar.q0(lrlVar2);
        }
    }

    public final void x(yde ydeVar) {
        lrl lrlVar = this.t;
        lrlVar.d = ydeVar;
        boolean z = lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        lrlVar.q1();
        if (lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && lrlVar.b.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        nsh nshVar = this.h.l;
        ((dsh) nshVar.b).a.setExtras(this.t.b);
    }

    public final void y() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        xq0.q("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
