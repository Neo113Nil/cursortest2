package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import defpackage.a0o;
import defpackage.a8w;
import defpackage.au2;
import defpackage.b9w;
import defpackage.c5b;
import defpackage.cy1;
import defpackage.d97;
import defpackage.dnm;
import defpackage.dsc;
import defpackage.dvt;
import defpackage.fnm;
import defpackage.g0e;
import defpackage.hsb;
import defpackage.k5r;
import defpackage.kjr;
import defpackage.l5i;
import defpackage.lf0;
import defpackage.liq;
import defpackage.nb7;
import defpackage.nj;
import defpackage.nnm;
import defpackage.nzd;
import defpackage.pkk;
import defpackage.qah;
import defpackage.sml;
import defpackage.snm;
import defpackage.t75;
import defpackage.tao;
import defpackage.u75;
import defpackage.vp3;
import defpackage.vq1;
import defpackage.whn;
import defpackage.xiu;
import defpackage.xvs;
import defpackage.yk2;
import defpackage.yvs;
import defpackage.zsb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.preload_manager.PreloadException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class k {
    public final liq a;
    public final yk2 b;
    public final xiu c;
    public final tao d;
    public final vp3 e;
    public final Handler f;
    public final LruCache g;
    public final HashMap h;

    public k(liq liqVar, yk2 yk2Var, xiu xiuVar, tao taoVar, vp3 vp3Var, Handler handler) {
        xiuVar.getClass();
        vp3Var.getClass();
        this.a = liqVar;
        this.b = yk2Var;
        this.c = xiuVar;
        this.d = taoVar;
        this.e = vp3Var;
        this.f = handler;
        this.g = new LruCache(64);
        this.h = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0476 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [d97] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r33v1, types: [ru.yandex.video.m3.player.tracks.TrackType] */
    /* JADX WARN: Type inference failed for: r3v15, types: [dsc] */
    /* JADX WARN: Type inference failed for: r3v47, types: [dsc[]] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(k kVar, b9w b9wVar, nnm nnmVar) {
        sml smlVar;
        sml smlVar2;
        ?? r3;
        int length;
        Object next;
        ArrayList arrayList;
        yvs yvsVar;
        boolean z;
        int i;
        xvs xvsVar;
        int i2;
        int i3;
        int i4;
        int i5;
        sml smlVar3;
        sml smlVar4;
        b9w b9wVar2 = b9wVar;
        kVar.getClass();
        Object b = b9wVar2.b();
        StreamType streamType = b instanceof d97 ? StreamType.Dash : b instanceof nzd ? StreamType.Hls : StreamType.Unknown;
        if (streamType == StreamType.Unknown) {
            return t75.c(hsb.e);
        }
        liq liqVar = kVar.a;
        vp3 vp3Var = kVar.e;
        Object b2 = b9wVar2.b();
        vp3Var.getClass();
        int i6 = 2;
        int i7 = 0;
        if (b2 instanceof d97) {
            pkk b3 = ((d97) b2).b(0);
            b3.getClass();
            List list = b3.c;
            list.getClass();
            int i8 = 0;
            loop0: for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    u75.n();
                    throw null;
                }
                nj njVar = (nj) obj;
                if (njVar.b == i6) {
                    List list2 = njVar.c;
                    list2.getClass();
                    int i10 = i7;
                    for (Object obj2 : list2) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            u75.n();
                            throw null;
                        }
                        a0o a0oVar = (a0o) obj2;
                        whn whnVar = a0oVar.e;
                        smlVar = null;
                        dsc dscVar = a0oVar.a;
                        whn d = a0oVar.d();
                        if (whnVar != null || d != null) {
                            if (fnm.b(liqVar, vp3Var, fnm.a(a0oVar, whnVar, d))) {
                                Timber.Companion companion = Timber.INSTANCE;
                                StringBuilder sb = new StringBuilder("preloaded representation holder founded: ");
                                sb.append("Representation: height=" + dscVar.v);
                                sb.append(". Index =");
                                sb.append(i10);
                                companion.d(sb.toString(), new Object[0]);
                                dscVar.getClass();
                                smlVar2 = new sml(dscVar);
                                break loop0;
                            }
                        } else {
                            Timber.Companion companion2 = Timber.INSTANCE;
                            StringBuilder q = k5r.q(i10, "[", "] pendingInitializationUri and pendingIndexUri are null ");
                            q.append("Representation: height=" + dscVar.v);
                            companion2.d(q.toString(), new Object[0]);
                        }
                        i10 = i11;
                    }
                } else {
                    Timber.INSTANCE.d("Not a video adaptation set: " + njVar.b, new Object[0]);
                }
                i8 = i9;
                i6 = 2;
                i7 = 0;
            }
            smlVar = null;
            smlVar2 = smlVar;
        } else {
            smlVar = null;
            if (b2 instanceof nzd) {
                List list3 = ((nzd) b2).a.e;
                list3.getClass();
                int i12 = 0;
                for (Object obj3 : list3) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        u75.n();
                        throw null;
                    }
                    g0e g0eVar = (g0e) obj3;
                    Timber.Companion companion3 = Timber.INSTANCE;
                    companion3.d("mediaPlaylistVariant=" + g0eVar, new Object[0]);
                    if (i12 != 0) {
                        Map map = Collections.EMPTY_MAP;
                        Uri uri = g0eVar.a;
                        vq1.C(uri, "The uri must be set.");
                        if (fnm.b(liqVar, vp3Var, new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 0))) {
                            companion3.d("preloaded playlistUrl founded: " + g0eVar.a, new Object[0]);
                            smlVar2 = new sml(g0eVar.b);
                            break;
                        }
                    }
                    i12 = i13;
                }
            }
            smlVar2 = smlVar;
        }
        Object obj4 = smlVar2 != null ? (dsc) smlVar2.a : smlVar;
        if (obj4 == null) {
            Timber.INSTANCE.d("YandexDownloadHelper.extractPreloadTracks: Preloaded video format not found. Select video format", new Object[0]);
            vq1.A(b9wVar2.g);
            qah qahVar = b9wVar2.k[0];
            qahVar.getClass();
            int i14 = qahVar.a;
            ?? r6 = smlVar;
            int i15 = 0;
            while (i15 < i14) {
                if (qahVar.b[i15] == 2) {
                    r6 = Integer.valueOf(i15);
                    Timber.INSTANCE.d("YandexDownloadHelper.selectTargetVideoFormat: videoRendererIndex found. It is " + r6, new Object[0]);
                }
                i15++;
                r6 = r6;
            }
            if (r6 != 0) {
                int intValue = r6.intValue();
                vq1.A(b9wVar2.g);
                List list4 = b9wVar2.m[0][intValue];
                if (list4.size() > 0 && list4.get(0) != null) {
                    zsb zsbVar = (zsb) list4.get(0);
                    if (zsbVar instanceof a8w) {
                        smlVar4 = ((au2) zsbVar).d[((a8w) zsbVar).x(Long.MIN_VALUE, -9223372036854775807L)];
                        i5 = 0;
                        Timber.INSTANCE.d("YandexDownloadHelper.selectTargetVideoFormat: targetVideoFormat found. It is " + smlVar4, new Object[0]);
                        smlVar3 = smlVar4;
                    }
                }
                smlVar4 = smlVar;
                i5 = 0;
                Timber.INSTANCE.d("YandexDownloadHelper.selectTargetVideoFormat: targetVideoFormat found. It is " + smlVar4, new Object[0]);
                smlVar3 = smlVar4;
            } else {
                i5 = 0;
                smlVar3 = smlVar;
            }
            if (smlVar3 == null) {
                Timber.INSTANCE.d("YandexDownloadHelper.extractPreloadTracks: Target video format not selected", new Object[i5]);
                r3 = smlVar3;
            } else {
                Timber.INSTANCE.d("YandexDownloadHelper.extractPreloadTracks: Target video format selected: " + smlVar3, new Object[i5]);
                r3 = smlVar3;
            }
        } else {
            Timber.INSTANCE.d("YandexDownloadHelper.extractPreloadTracks: Preloaded video format " + obj4, new Object[0]);
            r3 = obj4;
        }
        long d2 = kVar.b.d();
        boolean z2 = nnmVar.j;
        dnm dnmVar = nnmVar.b;
        ArrayList arrayList2 = new ArrayList();
        if (b9wVar2.b == null) {
            length = 0;
        } else {
            vq1.A(b9wVar2.g);
            length = b9wVar2.j.length;
        }
        int i16 = 0;
        while (i16 < length) {
            vq1.A(b9wVar2.g);
            yvs yvsVar2 = b9wVar2.j[i16];
            yvsVar2.getClass();
            int i17 = yvsVar2.a;
            int i18 = 0;
            while (i18 < i17) {
                xvs a = yvsVar2.a(i18);
                int i19 = a.a;
                int i20 = 0;
                while (i20 < i19) {
                    boolean z3 = z2;
                    dsc dscVar2 = a.d[i20];
                    dscVar2.getClass();
                    String str = dscVar2.n;
                    Object obj5 = l5i.k(str) ? TrackType.Audio : l5i.o(str) ? TrackType.Video : l5i.n(str) ? TrackType.Subtitles : smlVar;
                    if (obj5 == null) {
                        yvsVar = yvsVar2;
                        i = i17;
                        i4 = i18;
                        xvsVar = a;
                        i2 = i19;
                        i3 = i20;
                    } else {
                        Object b4 = b9wVar.b();
                        ?? r33 = obj5;
                        ?? r0 = b4 instanceof d97 ? (d97) b4 : smlVar;
                        if (r0 != 0) {
                            z = true;
                            if (r0.d) {
                                yvsVar = yvsVar2;
                                i = i17;
                                String dscVar3 = dscVar2.toString();
                                xvsVar = a;
                                dnmVar.getClass();
                                kjr kjrVar = new kjr(i16, i18, i20);
                                i2 = i19;
                                i3 = i20;
                                boolean z4 = z;
                                i4 = i18;
                                arrayList2.add(new hsb(dscVar3, r33, kjrVar, dscVar2, streamType, z4));
                            }
                        }
                        yvsVar = yvsVar2;
                        z = false;
                        i = i17;
                        String dscVar32 = dscVar2.toString();
                        xvsVar = a;
                        dnmVar.getClass();
                        kjr kjrVar2 = new kjr(i16, i18, i20);
                        i2 = i19;
                        i3 = i20;
                        boolean z42 = z;
                        i4 = i18;
                        arrayList2.add(new hsb(dscVar32, r33, kjrVar2, dscVar2, streamType, z42));
                    }
                    i20 = i3 + 1;
                    yvsVar2 = yvsVar;
                    i18 = i4;
                    z2 = z3;
                    i17 = i;
                    a = xvsVar;
                    i19 = i2;
                }
                i18++;
                z2 = z2;
            }
            i16++;
            b9wVar2 = b9wVar;
        }
        boolean z5 = z2;
        if (r3 == 0) {
            Timber.INSTANCE.d("YandexDownloadHelper.getTrackVariants: fallback. reason targetFormat==null", new Object[0]);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (((hsb) next2).a == TrackType.Video && r3.c.j < d2 * 0.7d) {
                    arrayList3.add(next2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i21 = ((hsb) next).c.j;
                    do {
                        Object next3 = it2.next();
                        int i22 = ((hsb) next3).c.j;
                        if (i21 < i22) {
                            next = next3;
                            i21 = i22;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = smlVar;
            }
            hsb hsbVar = (hsb) next;
            if (hsbVar != null) {
                Timber.INSTANCE.d("YandexDownloadHelper.getTrackVariants: fallback target video found " + hsbVar, new Object[0]);
                arrayList = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next4 = it3.next();
                    hsb hsbVar2 = (hsb) next4;
                    if (hsbVar2.a != TrackType.Video || Intrinsics.d(hsbVar2.c.a, hsbVar.c.a)) {
                        arrayList.add(next4);
                    }
                }
            }
            if (z5) {
                return arrayList2;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj6 : arrayList2) {
                if (((hsb) obj6).a != TrackType.Audio) {
                    arrayList4.add(obj6);
                }
            }
            return arrayList4;
        }
        arrayList = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next5 = it4.next();
            hsb hsbVar3 = (hsb) next5;
            if (hsbVar3.a != TrackType.Video || Intrinsics.d(hsbVar3.c.a, r3.a)) {
                arrayList.add(next5);
            }
        }
        arrayList2 = arrayList;
        if (z5) {
        }
    }

    public static final void b(k kVar, String str, snm snmVar) {
        kVar.getClass();
        Intrinsics.d(Looper.myLooper(), kVar.f.getLooper());
        List list = snmVar.d;
        if (list == null) {
            list = c5b.a;
        }
        List unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.getClass();
        kVar.g.put(str, unmodifiableList);
        kVar.h.remove(str);
        Set set = snmVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(unmodifiableList, null);
        }
        set.clear();
    }

    public final void c(String str, lf0 lf0Var) {
        Timber.INSTANCE.d("Request for cancel, uri = " + str + ", callback = " + lf0Var, new Object[0]);
        dvt.c0(this.f, new cy1(28, str, lf0Var, this));
    }

    public final List d(nnm nnmVar) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.f;
        Intrinsics.d(myLooper, handler.getLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        lf0 lf0Var = new lf0(7, atomicReference, atomicReference2, countDownLatch);
        String str = nnmVar.l;
        Timber.INSTANCE.d("Request for getTracks(), preloadRequest = " + nnmVar + ", callback = " + lf0Var, new Object[0]);
        dvt.c0(handler, new cy1(29, nnmVar, this, lf0Var));
        try {
            if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                c(str, lf0Var);
                throw new PreloadException.ManifestDownloadError("Timeout waiting for manifest download", null, 2, null);
            }
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                throw new PreloadException.ManifestDownloadError("YandexDownloadHelper.prepare signalled an error", exc);
            }
            List list = (List) atomicReference.get();
            if (list == null || list.isEmpty()) {
                throw new PreloadException.EmptyTrackListSelectedError("Track selection returned empty result", null, 2, null);
            }
            return list;
        } catch (InterruptedException e) {
            c(str, lf0Var);
            throw new PreloadException.CanceledOperationException.CanceledManifestDownload("Manifest downloading was interrupted", e);
        }
    }
}
