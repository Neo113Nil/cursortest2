package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.session.i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class m78 implements w68, kzc, vrh {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public m78(StationId stationId) {
        stationId.getClass();
        this.b = stationId;
        this.c = l18.b.b(hag.I(b5d.class), false);
        this.d = new ReentrantLock();
        this.e = new LinkedHashMap();
        this.a = 2000L;
    }

    public void A(hoh hohVar) {
        sth sthVar = (sth) this.e;
        nsh nshVar = sthVar.l;
        CharSequence queueTitle = ((okh) ((iwe) nshVar.c).b).a.getQueueTitle();
        CharSequence charSequence = hohVar.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        lrl lrlVar = sthVar.h.t;
        if (!lrlVar.f.a(17) || !lrlVar.f0().a(17)) {
            charSequence = null;
        }
        ((dsh) nshVar.b).a.setQueueTitle(charSequence);
    }

    public void B() {
        ((dbu) ((y7l) this.e).f.b).d(0);
    }

    public void C(boolean z) {
        ((dbu) ((y7l) this.e).f.b).e = z ? 1 : 0;
    }

    public void D() {
        ((dbu) ((y7l) this.e).f.b).f();
    }

    public void E() {
        ((dbu) ((y7l) this.e).f.b).g();
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public void F(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            sth r0 = (defpackage.sth) r0
            nsh r0 = r0.l
            int r5 = defpackage.rwf.n(r5)
            java.lang.Object r0 = r0.b
            dsh r0 = (defpackage.dsh) r0
            int r1 = r0.j
            if (r1 == r5) goto L39
            r0.j = r5
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            android.os.RemoteCallbackList r2 = r0.f     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L2d
            int r2 = r2 + (-1)
        L1f:
            android.os.RemoteCallbackList r3 = r0.f
            if (r2 < 0) goto L32
            android.os.IInterface r3 = r3.getBroadcastItem(r2)     // Catch: java.lang.Throwable -> L2d
            x8e r3 = (defpackage.x8e) r3     // Catch: java.lang.Throwable -> L2d
            r3.b(r5)     // Catch: java.lang.Throwable -> L2d android.os.RemoteException -> L2f
            goto L2f
        L2d:
            r5 = move-exception
            goto L37
        L2f:
            int r2 = r2 + (-1)
            goto L1f
        L32:
            r3.finishBroadcast()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L39
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r5
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m78.F(int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public void G(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            sth r0 = (defpackage.sth) r0
            nsh r0 = r0.l
            hee r1 = defpackage.rwf.a
            java.lang.Object r0 = r0.b
            dsh r0 = (defpackage.dsh) r0
            int r1 = r0.k
            if (r1 == r5) goto L37
            r0.k = r5
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            android.os.RemoteCallbackList r2 = r0.f     // Catch: java.lang.Throwable -> L2b
            int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L2b
            int r2 = r2 + (-1)
        L1d:
            android.os.RemoteCallbackList r3 = r0.f
            if (r2 < 0) goto L30
            android.os.IInterface r3 = r3.getBroadcastItem(r2)     // Catch: java.lang.Throwable -> L2b
            x8e r3 = (defpackage.x8e) r3     // Catch: java.lang.Throwable -> L2b
            r3.B(r5)     // Catch: java.lang.Throwable -> L2b android.os.RemoteException -> L2d
            goto L2d
        L2b:
            r5 = move-exception
            goto L35
        L2d:
            int r2 = r2 + (-1)
            goto L1d
        L30:
            r3.finishBroadcast()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            goto L37
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r5
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m78.G(boolean):void");
    }

    public void H(sis sisVar) {
        R(sisVar);
        Q();
    }

    public void I() {
        y7l y7lVar = (y7l) this.e;
        if (y7lVar.k == 2) {
            return;
        }
        hzr hzrVar = y7lVar.i;
        if (hzrVar != null) {
            hzrVar.a.removeCallbacksAndMessages(null);
        }
        y7lVar.j = null;
        y7lVar.k = 2;
    }

    public void J(int i) {
        gbu gbuVar = ((dbu) ((y7l) this.e).f.b).b;
        if (gbuVar.j == i) {
            return;
        }
        gbuVar.j = i;
        gbuVar.d(true);
    }

    public void K(Surface surface, kmq kmqVar) {
        y7l y7lVar = (y7l) this.e;
        Pair pair = y7lVar.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((kmq) y7lVar.j.second).equals(kmqVar)) {
            return;
        }
        y7lVar.j = Pair.create(surface, kmqVar);
        int i = kmqVar.a;
    }

    public void L(float f) {
        ((dbu) ((y7l) this.e).f.b).k(f);
    }

    public void M(long j, long j2) {
        y7l y7lVar = (y7l) this.e;
        lis lisVar = y7lVar.b;
        long j3 = this.a;
        lisVar.a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
        y7lVar.m = j2;
        y7lVar.f.d(0L, j2);
    }

    public void N(List list) {
        if (((qsn) this.b).equals(list)) {
            return;
        }
        y7l y7lVar = (y7l) this.e;
        y7lVar.c.getClass();
        tde tdeVar = new tde(4);
        tdeVar.c(list);
        tdeVar.c(y7lVar.e);
        this.b = tdeVar.f();
        dsc dscVar = (dsc) this.c;
        if (dscVar == null) {
            return;
        }
        bsc a = dscVar.a();
        q85 q85Var = dscVar.B;
        if (q85Var == null || !q85Var.d()) {
            q85Var = q85.h;
        }
        a.A = q85Var;
        a.a();
        vq1.B(null);
        throw null;
    }

    public void O(abu abuVar) {
        ((y7l) this.e).f.i = abuVar;
    }

    public void P() {
        y7l y7lVar = (y7l) this.e;
        if (y7lVar.l >= this.a) {
            long j = ((hbu) y7lVar.f.d).g;
        }
    }

    public void Q() {
        Bitmap bitmap;
        gnh gnhVar;
        sth sthVar = (sth) this.e;
        i iVar = sthVar.h;
        lrl lrlVar = iVar.t;
        onh m1 = lrlVar.m1();
        hoh o1 = lrlVar.o1();
        long j = -9223372036854775807L;
        if ((!lrlVar.V0(16) || !lrlVar.h1()) && lrlVar.V0(16)) {
            j = lrlVar.getDuration();
        }
        String str = m1 != null ? m1.a : "";
        Uri uri = (m1 == null || (gnhVar = m1.b) == null) ? null : gnhVar.a;
        if (Objects.equals((hoh) this.b, o1) && Objects.equals((String) this.c, str) && Objects.equals((Uri) this.d, uri) && this.a == j) {
            return;
        }
        this.c = str;
        this.d = uri;
        this.b = o1;
        this.a = j;
        lcg e0 = iVar.m.e0(o1);
        if (e0 != null) {
            sthVar.q = null;
            if (e0.isDone()) {
                try {
                    bitmap = (Bitmap) leu.O(e0);
                } catch (CancellationException | ExecutionException e) {
                    vq1.n0("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
                sth.h0(sthVar.l, rwf.l(o1, str, uri, j, bitmap));
            }
            m78 m78Var = new m78();
            m78Var.e = this;
            m78Var.b = o1;
            m78Var.c = str;
            m78Var.d = uri;
            m78Var.a = j;
            sthVar.q = m78Var;
            Handler handler = iVar.l;
            Objects.requireNonNull(handler);
            e0.a(new pv7(e0, m78Var, false, 9), new dk7(handler, 0));
        }
        bitmap = null;
        sth.h0(sthVar.l, rwf.l(o1, str, uri, j, bitmap));
    }

    public void R(sis sisVar) {
        sth sthVar = (sth) this.e;
        i iVar = sthVar.h;
        lrl lrlVar = iVar.t;
        if (!lrlVar.f.a(17) || !lrlVar.f0().a(17) || sisVar.p()) {
            sth.j0(sthVar.l, null);
            return;
        }
        hee heeVar = rwf.a;
        ArrayList arrayList = new ArrayList();
        ris risVar = new ris();
        for (int i = 0; i < sisVar.o(); i++) {
            arrayList.add(sisVar.m(i, risVar, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        r8 r8Var = new r8(this, new AtomicInteger(0), arrayList, arrayList2, 6);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((onh) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                r8Var.run();
            } else {
                lcg d = iVar.m.d(bArr);
                arrayList2.add(d);
                Handler handler = iVar.l;
                Objects.requireNonNull(handler);
                d.a(r8Var, new dk7(handler, 0));
            }
        }
    }

    @Override // defpackage.w68
    public void b(daf dafVar, es6 es6Var) {
        y68 y68Var;
        boolean z;
        String H = ((atn) this.b).H(dafVar);
        qne qneVar = (qne) this.d;
        synchronized (qneVar) {
            y68Var = (y68) ((HashMap) qneVar.a).get(H);
            if (y68Var == null) {
                ozw ozwVar = (ozw) qneVar.b;
                synchronized (((ArrayDeque) ozwVar.b)) {
                    y68Var = (y68) ((ArrayDeque) ozwVar.b).poll();
                }
                if (y68Var == null) {
                    y68Var = new y68();
                }
                ((HashMap) qneVar.a).put(H, y68Var);
            }
            y68Var.b++;
        }
        y68Var.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + H + " for for Key: " + dafVar);
            }
            try {
                j78 r = r();
                if (r.D(H) == null) {
                    z0j o = r.o(H);
                    if (o == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(H));
                    }
                    try {
                        if (((m6b) es6Var.a).A(es6Var.b, o.Q(), (pwj) es6Var.c)) {
                            j78.a((j78) o.e, o, true);
                            o.b = true;
                        }
                        if (!z) {
                            try {
                                o.l();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!o.b) {
                            try {
                                o.l();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            ((qne) this.d).x(H);
        }
    }

    @Override // defpackage.vrh
    public void c(List list, int i) {
        sth sthVar = (sth) this.e;
        sthVar.q0(sthVar.h.t);
    }

    @Override // defpackage.vrh
    public void e(int i, alp alpVar) {
        Bundle bundle = Bundle.EMPTY;
        nsh nshVar = ((sth) this.e).l;
        String str = alpVar.b;
        nshVar.getClass();
        if (TextUtils.isEmpty(str)) {
            xq0.x("event cannot be null or empty");
        } else {
            ((dsh) nshVar.b).a.sendSessionEvent(str, bundle);
        }
    }

    @Override // defpackage.vrh
    public void g(int i, Bundle bundle) {
        sth sthVar = (sth) this.e;
        nsh nshVar = sthVar.l;
        i iVar = sthVar.h;
        lrl lrlVar = iVar.t;
        lrlVar.getClass();
        vq1.v(!bundle.containsKey("EXO_SPEED"));
        vq1.v(!bundle.containsKey("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"));
        lrlVar.b = new Bundle(bundle);
        if (!lrlVar.d.isEmpty()) {
            lrlVar.q1();
        }
        ((dsh) nshVar.b).a.setExtras(lrlVar.b);
        nshVar.Q(iVar.t.i1());
    }

    @Override // defpackage.vrh
    public void h(int i, tmp tmpVar, boolean z, boolean z2, int i2) {
        sth sthVar = (sth) this.e;
        sthVar.q0(sthVar.h.t);
    }

    @Override // defpackage.vrh
    public void i(List list, int i) {
        sth sthVar = (sth) this.e;
        sthVar.q0(sthVar.h.t);
    }

    @Override // defpackage.vrh
    public void j(int i, d8l d8lVar) {
        sth sthVar = (sth) this.e;
        lrl lrlVar = sthVar.h.t;
        sth.i0(sthVar, lrlVar);
        sthVar.q0(lrlVar);
    }

    @Override // defpackage.w68
    public File l(daf dafVar) {
        String H = ((atn) this.b).H(dafVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + H + " for for Key: " + dafVar);
        }
        try {
            efo D = r().D(H);
            if (D != null) {
                return ((File[]) D.b)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public void o() {
        y7l y7lVar = (y7l) this.e;
        int i = kmq.c.a;
        y7lVar.j = null;
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
        if (this != ((sth) ((m78) this.e).e).q) {
            return;
        }
        vq1.n0("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    @Override // defpackage.kzc
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        sth sthVar = (sth) ((m78) this.e).e;
        if (this != sthVar.q) {
            return;
        }
        sth.h0(sthVar.l, rwf.l((hoh) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        i iVar = sthVar.h;
        dvt.c0(iVar.o, new fth(iVar, 3));
    }

    public void p() {
        dbu dbuVar = (dbu) ((y7l) this.e).f.b;
        if (dbuVar.e == 0) {
            dbuVar.e = 1;
        }
    }

    public void q(boolean z) {
        this.a = -9223372036854775807L;
        y7l y7lVar = (y7l) this.e;
        tyi tyiVar = y7lVar.f;
        lis lisVar = y7lVar.b;
        if (y7lVar.k == 1) {
            if (z) {
                ((dbu) tyiVar.b).h();
            }
            hbu hbuVar = (hbu) tyiVar.d;
            lis lisVar2 = hbuVar.d;
            n8n n8nVar = hbuVar.f;
            n8nVar.b = 0;
            n8nVar.c = 0;
            hbuVar.g = -9223372036854775807L;
            lis lisVar3 = hbuVar.e;
            if (lisVar3.h() > 0) {
                vq1.v(lisVar3.h() > 0);
                while (lisVar3.h() > 1) {
                    lisVar3.e();
                }
                Object e = lisVar3.e();
                e.getClass();
                lisVar3.a(0L, (Long) e);
            }
            if (lisVar2.h() > 0) {
                vq1.v(lisVar2.h() > 0);
                while (lisVar2.h() > 1) {
                    lisVar2.e();
                }
                Object e2 = lisVar2.e();
                e2.getClass();
                lisVar2.a(0L, (tcu) e2);
            }
            ((ArrayDeque) tyiVar.e).clear();
            while (lisVar.h() > 1) {
                lisVar.e();
            }
            if (lisVar.h() == 1) {
                Long l = (Long) lisVar.e();
                l.getClass();
                tyiVar.d(l.longValue(), y7lVar.m);
            }
            y7lVar.l = -9223372036854775807L;
            hzr hzrVar = y7lVar.i;
            vq1.B(hzrVar);
            hzrVar.e(new jq(y7lVar));
        }
    }

    public synchronized j78 r() {
        try {
            if (((j78) this.e) == null) {
                this.e = j78.I((File) this.c, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (j78) this.e;
    }

    public Surface s() {
        vq1.A(false);
        vq1.B(null);
        throw null;
    }

    public boolean t(dsc dscVar) {
        y7l y7lVar = (y7l) this.e;
        vq1.A(y7lVar.k == 0);
        q85 q85Var = dscVar.B;
        if (q85Var == null || !q85Var.d()) {
            q85Var = q85.h;
        }
        if (q85Var.c != 7 || dvt.a < 34) {
        }
        dzr dzrVar = y7lVar.g;
        Looper myLooper = Looper.myLooper();
        vq1.B(myLooper);
        y7lVar.i = dzrVar.a(myLooper, null);
        try {
            y7lVar.c.a();
            throw null;
        } catch (bbu e) {
            throw new rcu(e, dscVar);
        }
    }

    public void u(boolean z) {
        ((dbu) ((y7l) this.e).f.b).c(z);
    }

    public void v(dv1 dv1Var) {
        sth sthVar = (sth) this.e;
        if (sthVar.h.t.n0().a == 0) {
            int u = rwf.u(dv1Var);
            dsh dshVar = (dsh) sthVar.l.b;
            dshVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(u);
            dshVar.a.setPlaybackToLocal(builder.build());
        }
    }

    public void w() {
        int i;
        krl krlVar;
        sth sthVar = (sth) this.e;
        nsh nshVar = sthVar.l;
        lrl lrlVar = sthVar.h.t;
        if (lrlVar.n0().a == 0) {
            krlVar = null;
        } else {
            d8l f0 = lrlVar.f0();
            if (f0.a.a(26, 34)) {
                i = f0.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(lrlVar.a.X());
            int c0 = lrlVar.V0(23) ? lrlVar.c0() : 0;
            p08 n0 = lrlVar.n0();
            krlVar = new krl(lrlVar, i, n0.c, c0, n0.d, handler);
        }
        sthVar.o = krlVar;
        if (krlVar != null) {
            ((dsh) nshVar.b).a.setPlaybackToRemote(krlVar.a());
            return;
        }
        int u = rwf.u(lrlVar.V0(21) ? lrlVar.m0() : dv1.g);
        dsh dshVar = (dsh) nshVar.b;
        dshVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(u);
        dshVar.a.setPlaybackToLocal(builder.build());
    }

    public void x(dsc dscVar, List list) {
        vq1.A(false);
        y7l y7lVar = (y7l) this.e;
        y7lVar.c.getClass();
        tde tdeVar = new tde(4);
        tdeVar.c(list);
        tdeVar.c(y7lVar.e);
        this.b = tdeVar.f();
        this.c = dscVar;
        bsc a = dscVar.a();
        q85 q85Var = dscVar.B;
        if (q85Var == null || !q85Var.d()) {
            q85Var = q85.h;
        }
        a.A = q85Var;
        a.a();
        vq1.B(null);
        throw null;
    }

    public void y(onh onhVar) {
        Q();
        sth sthVar = (sth) this.e;
        nsh nshVar = sthVar.l;
        if (onhVar == null) {
            ((dsh) nshVar.b).a.setRatingType(0);
        } else {
            ((dsh) nshVar.b).a.setRatingType(rwf.v(onhVar.d.i));
        }
        sthVar.q0(sthVar.h.t);
    }

    public void z(int i, lrl lrlVar) {
        sth sthVar = (sth) this.e;
        H(lrlVar.n1());
        A(lrlVar.V0(18) ? lrlVar.u0() : hoh.K);
        lrlVar.o1();
        Q();
        G(lrlVar.C0());
        F(lrlVar.g());
        lrlVar.n0();
        w();
        ((dsh) sthVar.l.b).a.setExtras(lrlVar.b);
        sth.i0(sthVar, lrlVar);
        y(lrlVar.m1());
    }

    @Override // defpackage.vrh
    public void d() {
    }

    public m78() {
        this.b = new AtomicLong(0L);
        this.c = new AtomicLong(0L);
        this.d = new AtomicInteger(0);
        this.e = new AtomicInteger(0);
    }

    public m78(y7l y7lVar, Context context) {
        this.e = y7lVar;
        dvt.U(context);
        ude udeVar = yde.b;
        this.b = qsn.e;
        this.a = -9223372036854775807L;
        this.d = y7l.o;
    }
}
