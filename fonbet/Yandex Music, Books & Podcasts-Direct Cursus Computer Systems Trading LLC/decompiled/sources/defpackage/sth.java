package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.media3.session.i;
import com.yandex.pulse.metrics.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sth extends bsh {
    public static final int s;
    public final g06 g;
    public final i h;
    public final zth i;
    public final m78 j;
    public final tt1 k;
    public final nsh l;
    public final l83 m;
    public final ComponentName n;
    public krl o;
    public volatile long p;
    public m78 q;
    public int r;

    static {
        s = dvt.a >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r1.equals(r0) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sth(i iVar, Uri uri, Handler handler, Bundle bundle) {
        super(0);
        ComponentName componentName;
        ComponentName n0;
        PendingIntent foregroundService;
        this.h = iVar;
        Context context = iVar.f;
        this.i = zth.a(context);
        m78 m78Var = new m78();
        m78Var.e = this;
        m78Var.b = hoh.K;
        m78Var.c = "";
        m78Var.a = -9223372036854775807L;
        this.j = m78Var;
        g06 g06Var = new g06(iVar);
        this.g = g06Var;
        this.p = 300000L;
        this.k = new tt1(iVar.l.getLooper(), g06Var);
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        boolean z = true;
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!queryBroadcastReceivers.isEmpty()) {
                dlh.d(queryBroadcastReceivers.size(), "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found ");
                throw null;
            }
            componentName = null;
        }
        this.n = componentName;
        if (componentName == null || dvt.a < 31) {
            n0 = n0(context, "androidx.media3.session.MediaLibraryService");
            n0 = n0 == null ? n0(context, "androidx.media3.session.MediaSessionService") : n0;
            if (n0 != null) {
            }
        } else {
            n0 = componentName;
        }
        z = false;
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (n0 == null) {
            l83 l83Var = new l83(12, this);
            this.m = l83Var;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uri.getScheme());
            if (dvt.a < 33) {
                context.registerReceiver(l83Var, intentFilter);
            } else {
                context.registerReceiver(l83Var, intentFilter, 4);
            }
            intent2.setPackage(context.getPackageName());
            foregroundService = PendingIntent.getBroadcast(context, 0, intent2, s);
            n0 = new ComponentName(context, context.getClass());
        } else {
            intent2.setComponent(n0);
            foregroundService = z ? dvt.a >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, s) : PendingIntent.getService(context, 0, intent2, s) : PendingIntent.getBroadcast(context, 0, intent2, s);
            this.m = null;
        }
        String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", iVar.i});
        ComponentName componentName2 = n0;
        int i = dvt.a;
        nsh nshVar = new nsh(context, join, i >= 31 ? null : componentName2, i < 31 ? foregroundService : null, bundle);
        this.l = nshVar;
        if (i >= 31 && componentName != null) {
            rf0.B(nshVar, componentName);
        }
        PendingIntent pendingIntent = iVar.u;
        if (pendingIntent != null) {
            ((dsh) nshVar.b).a.setSessionActivity(pendingIntent);
        }
        ((dsh) nshVar.b).c(this, handler);
    }

    public static void h0(nsh nshVar, ioh iohVar) {
        dsh dshVar = (dsh) nshVar.b;
        dshVar.i = iohVar;
        MediaSession mediaSession = dshVar.a;
        MediaMetadata mediaMetadata = iohVar.b;
        if (mediaMetadata == null) {
            Parcel obtain = Parcel.obtain();
            try {
                iohVar.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                iohVar.b = mediaMetadata2;
                obtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public static void i0(sth sthVar, lrl lrlVar) {
        int i = lrlVar.V0(20) ? 4 : 0;
        if (sthVar.r != i) {
            sthVar.r = i;
            ((dsh) sthVar.l.b).a.setFlags(i | 3);
        }
    }

    public static void j0(nsh nshVar, ArrayList arrayList) {
        if (arrayList != null) {
            nshVar.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ksh kshVar = (ksh) it.next();
                if (kshVar == null) {
                    xq0.x("queue shouldn't have null items");
                    return;
                }
                long j = kshVar.b;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", dfi.d(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        dsh dshVar = (dsh) nshVar.b;
        MediaSession mediaSession = dshVar.a;
        dshVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ksh kshVar2 = (ksh) it2.next();
            MediaSession.QueueItem queueItem = kshVar2.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(kshVar2.a.d(), kshVar2.b);
                kshVar2.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static onh k0(String str, Uri uri, String str2, Bundle bundle) {
        xmh xmhVar = new xmh();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        qsn qsnVar2 = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        t1f t1fVar = new t1f(8, false);
        t1fVar.b = uri;
        t1fVar.c = str2;
        t1fVar.d = bundle;
        return new onh(str3, new anh(xmhVar), null, new fnh(dnhVar), hoh.K, new jnh(t1fVar));
    }

    public static ComponentName n0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.bsh
    public final void A() {
        l0(1, new nth(this, 9), ((dsh) this.l.b).b(), false);
    }

    @Override // defpackage.bsh
    public final void D(String str, Bundle bundle) {
        o0(k0(str, null, null, bundle), true);
    }

    @Override // defpackage.bsh
    public final void E(String str, Bundle bundle) {
        o0(k0(null, null, str, bundle), true);
    }

    @Override // defpackage.bsh
    public final void F(Uri uri, Bundle bundle) {
        o0(k0(null, uri, null, bundle), true);
    }

    @Override // defpackage.bsh
    public final void G() {
        l0(2, new nth(this, 4), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void H(String str, Bundle bundle) {
        o0(k0(str, null, null, bundle), false);
    }

    @Override // defpackage.bsh
    public final void I(String str, Bundle bundle) {
        o0(k0(null, null, str, bundle), false);
    }

    @Override // defpackage.bsh
    public final void J(Uri uri, Bundle bundle) {
        o0(k0(null, uri, null, bundle), false);
    }

    @Override // defpackage.bsh
    public final void K(pmh pmhVar) {
        if (pmhVar == null) {
            return;
        }
        l0(20, new v13(26, this, pmhVar), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void M() {
        l0(11, new nth(this, 2), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void N(long j) {
        l0(5, new lth(this, j, 1), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void Q(float f) {
        if (f <= 0.0f) {
            return;
        }
        l0(13, new oj7(this, f), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void R(iin iinVar) {
        S(iinVar);
    }

    @Override // defpackage.bsh
    public final void S(iin iinVar) {
        gin o = rwf.o(iinVar);
        if (o != null) {
            m0(null, 40010, new v13(25, this, o), ((dsh) this.l.b).b());
            return;
        }
        vq1.n0("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + iinVar);
    }

    @Override // defpackage.bsh
    public final void T(int i) {
        l0(15, new oth(this, i, 0), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void U(int i) {
        l0(14, new oth(this, i, 1), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void V() {
        boolean V0 = this.h.t.V0(9);
        nsh nshVar = this.l;
        if (V0) {
            l0(9, new nth(this, 7), ((dsh) nshVar.b).b(), true);
        } else {
            l0(8, new nth(this, 8), ((dsh) nshVar.b).b(), true);
        }
    }

    @Override // defpackage.bsh
    public final void Y() {
        boolean V0 = this.h.t.V0(7);
        nsh nshVar = this.l;
        if (V0) {
            l0(7, new nth(this, 0), ((dsh) nshVar.b).b(), true);
        } else {
            l0(6, new nth(this, 1), ((dsh) nshVar.b).b(), true);
        }
    }

    @Override // defpackage.bsh
    public final void b0(long j) {
        if (j < 0) {
            return;
        }
        l0(10, new lth(this, j, 0), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final void c0() {
        l0(3, new nth(this, 5), ((dsh) this.l.b).b(), true);
    }

    public final void l0(final int i, final rth rthVar, final xth xthVar, final boolean z) {
        i iVar = this.h;
        if (iVar.k()) {
            return;
        }
        if (xthVar != null) {
            dvt.c0(iVar.l, new Runnable() { // from class: pth
                @Override // java.lang.Runnable
                public final void run() {
                    rth rthVar2 = rthVar;
                    sth sthVar = sth.this;
                    i iVar2 = sthVar.h;
                    if (iVar2.k()) {
                        return;
                    }
                    boolean isActive = ((dsh) sthVar.l.b).a.isActive();
                    int i2 = i;
                    xth xthVar2 = xthVar;
                    if (!isActive) {
                        StringBuilder q = k5r.q(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        q.append(xthVar2.a.b);
                        vq1.n0("MediaSessionLegacyStub", q.toString());
                        return;
                    }
                    wrh p0 = sthVar.p0(xthVar2);
                    if (!sthVar.g.J(p0, i2)) {
                        if (i2 != 1 || iVar2.t.g0()) {
                            return;
                        }
                        vq1.n0("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    if (iVar2.e.W(iVar2.k, iVar2.u(p0), i2) != 0) {
                        return;
                    }
                    try {
                        rthVar2.a(p0);
                    } catch (RemoteException e) {
                        vq1.o0("MediaSessionLegacyStub", "Exception in " + p0, e);
                    }
                    if (z) {
                        new SparseBooleanArray().append(i2, true);
                        iVar2.r(p0);
                    }
                }
            });
            return;
        }
        vq1.H("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void m0(alp alpVar, int i, rth rthVar, xth xthVar) {
        if (xthVar != null) {
            dvt.c0(this.h.l, new ylh(this, alpVar, i, xthVar, rthVar));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = alpVar;
        if (alpVar == null) {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        vq1.H("MediaSessionLegacyStub", sb.toString());
    }

    @Override // defpackage.bsh
    public final void o(pmh pmhVar) {
        if (pmhVar != null) {
            l0(20, new nj7(this, pmhVar, -1, 4), ((dsh) this.l.b).b(), false);
        }
    }

    public final void o0(onh onhVar, boolean z) {
        l0(31, new h6c(this, onhVar, z), ((dsh) this.l.b).b(), false);
    }

    @Override // defpackage.bsh
    public final void p(pmh pmhVar, int i) {
        if (pmhVar != null) {
            if (i == -1 || i >= 0) {
                l0(20, new nj7(this, pmhVar, i, 4), ((dsh) this.l.b).b(), false);
            }
        }
    }

    public final wrh p0(xth xthVar) {
        wrh y = this.g.y(xthVar);
        if (y == null) {
            wrh wrhVar = new wrh(xthVar, 0, 0, this.i.b(xthVar), new qth(xthVar), Bundle.EMPTY);
            urh n = this.h.n(wrhVar);
            this.g.e(xthVar, wrhVar, n.a, n.b);
            y = wrhVar;
        }
        tt1 tt1Var = this.k;
        long j = this.p;
        tt1Var.removeMessages(c.FINITE_SUM_FIELD_NUMBER, y);
        tt1Var.sendMessageDelayed(tt1Var.obtainMessage(c.FINITE_SUM_FIELD_NUMBER, y), j);
        return y;
    }

    @Override // defpackage.bsh
    public final void q(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.h.j.b());
        } else {
            alp alpVar = new alp(Bundle.EMPTY, str);
            m0(alpVar, 0, new os7(this, alpVar, bundle, resultReceiver, 1), ((dsh) this.l.b).b());
        }
    }

    public final void q0(lrl lrlVar) {
        dvt.c0(this.h.l, new mth(this, lrlVar, 1));
    }

    @Override // defpackage.bsh
    public final void s(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        alp alpVar = new alp(Bundle.EMPTY, str);
        m0(alpVar, 0, new u13(10, this, alpVar, bundle), ((dsh) this.l.b).b());
    }

    @Override // defpackage.bsh
    public final void t() {
        l0(12, new nth(this, 3), ((dsh) this.l.b).b(), true);
    }

    @Override // defpackage.bsh
    public final boolean v(Intent intent) {
        xth b = ((dsh) this.l.b).b();
        b.getClass();
        return this.h.p(new wrh(b, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.bsh
    public final void w() {
        l0(1, new nth(this, 10), ((dsh) this.l.b).b(), true);
    }
}
