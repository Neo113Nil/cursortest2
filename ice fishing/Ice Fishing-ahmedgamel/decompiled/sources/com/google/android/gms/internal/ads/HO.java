package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class HO implements InterfaceC4236yO {

    /* renamed from: C, reason: collision with root package name */
    public String f26039C;

    /* renamed from: D, reason: collision with root package name */
    public PlaybackMetrics.Builder f26040D;

    /* renamed from: G, reason: collision with root package name */
    public DN f26043G;

    /* renamed from: H, reason: collision with root package name */
    public S0.e f26044H;

    /* renamed from: I, reason: collision with root package name */
    public S0.e f26045I;
    public S0.e J;

    /* renamed from: K, reason: collision with root package name */
    public DP f26046K;

    /* renamed from: L, reason: collision with root package name */
    public DP f26047L;

    /* renamed from: M, reason: collision with root package name */
    public DP f26048M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f26049N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f26050O;

    /* renamed from: P, reason: collision with root package name */
    public int f26051P;

    /* renamed from: Q, reason: collision with root package name */
    public int f26052Q;

    /* renamed from: R, reason: collision with root package name */
    public int f26053R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f26054S;

    /* renamed from: n, reason: collision with root package name */
    public final Context f26055n;

    /* renamed from: v, reason: collision with root package name */
    public final DO f26057v;

    /* renamed from: w, reason: collision with root package name */
    public final PlaybackSession f26058w;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f26056u = AbstractC3066cl.j();

    /* renamed from: y, reason: collision with root package name */
    public final U7 f26060y = new U7();

    /* renamed from: z, reason: collision with root package name */
    public final K7 f26061z = new K7();

    /* renamed from: B, reason: collision with root package name */
    public final HashMap f26038B = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f26037A = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final long f26059x = SystemClock.elapsedRealtime();

    /* renamed from: E, reason: collision with root package name */
    public int f26041E = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f26042F = 0;

    public HO(Context context, PlaybackSession playbackSession) {
        this.f26055n = context.getApplicationContext();
        this.f26058w = playbackSession;
        DO r1 = new DO();
        this.f26057v = r1;
        r1.f25142d = this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void a(int i) {
        if (i == 1) {
            this.f26049N = true;
        }
    }

    public final void c(int i, long j6, DP dp, int i4) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = GO.s(i).setTimeSinceCreatedMillis(j6 - this.f26059x);
        if (dp != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i4 != 1 ? 1 : 2);
            String str = dp.f25175n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = dp.f25176o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = dp.f25172k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i6 = dp.f25171j;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i9 = dp.f25183v;
            if (i9 != -1) {
                timeSinceCreatedMillis.setWidth(i9);
            }
            int i10 = dp.f25184w;
            if (i10 != -1) {
                timeSinceCreatedMillis.setHeight(i10);
            }
            int i11 = dp.f25154H;
            if (i11 != -1) {
                timeSinceCreatedMillis.setChannelCount(i11);
            }
            int i12 = dp.J;
            if (i12 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i12);
            }
            String str4 = dp.f25166d;
            if (str4 != null) {
                String str5 = AbstractC3182eu.f30782a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = dp.f25187z;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f26054S = true;
        build = timeSinceCreatedMillis.build();
        this.f26056u.execute(new RunnableC3071cq(24, this, build));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ) {
        PlaybackMetrics.Builder builder = this.f26040D;
        if (c3860rQ == null) {
            return;
        }
        int e9 = abstractC3627n8.e(c3860rQ.f34406a);
        char c9 = 65535;
        if (e9 != -1) {
            K7 k72 = this.f26061z;
            int i = 0;
            abstractC3627n8.d(e9, k72, false);
            int i4 = k72.f26619c;
            U7 u72 = this.f26060y;
            abstractC3627n8.b(i4, u72, 0L);
            L0 l02 = u72.f28691b.f29973b;
            if (l02 != null) {
                String str = AbstractC3182eu.f30782a;
                Uri uri = l02.f26806a;
                String scheme = uri.getScheme();
                if (scheme == null || !(AbstractC3066cl.D("rtsp", scheme) || AbstractC3066cl.D("rtspt", scheme))) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (lastIndexOf >= 0) {
                            String f2 = AbstractC3066cl.f(lastPathSegment.substring(lastIndexOf + 1));
                            switch (f2.hashCode()) {
                                case 104579:
                                    if (f2.equals("ism")) {
                                        c9 = 2;
                                        break;
                                    }
                                    break;
                                case 108321:
                                    if (f2.equals("mpd")) {
                                        c9 = 0;
                                        break;
                                    }
                                    break;
                                case 3242057:
                                    if (f2.equals("isml")) {
                                        c9 = 3;
                                        break;
                                    }
                                    break;
                                case 3299913:
                                    if (f2.equals("m3u8")) {
                                        c9 = 1;
                                        break;
                                    }
                                    break;
                            }
                            int i6 = c9 != 0 ? c9 != 1 ? (c9 == 2 || c9 == 3) ? 1 : 4 : 2 : 0;
                            if (i6 != 4) {
                                i = i6;
                            }
                        }
                        String path = uri.getPath();
                        path.getClass();
                        Matcher matcher = AbstractC3182eu.f30784c.matcher(path);
                        if (matcher.matches()) {
                            String group = matcher.group(2);
                            if (group != null) {
                                if (!group.contains("format=mpd-time-csf")) {
                                    if (group.contains("format=m3u8-aapl")) {
                                        i = 2;
                                    }
                                }
                            }
                            i = 1;
                        }
                    }
                    i = 4;
                } else {
                    i = 3;
                }
                i = i != 0 ? i != 1 ? i != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            long j6 = u72.f28698j;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b && !u72.i && !u72.f28696g && !u72.b()) {
                builder.setMediaDurationMillis(AbstractC3182eu.t(j6));
            }
            builder.setPlaybackType(true != u72.b() ? 1 : 2);
            this.f26054S = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void f(C4182xO c4182xO, int i, long j6) {
        C3860rQ c3860rQ = c4182xO.f35788d;
        if (c3860rQ != null) {
            String a9 = this.f26057v.a(c4182xO.f35786b, c3860rQ);
            HashMap hashMap = this.f26038B;
            Long l9 = (Long) hashMap.get(a9);
            HashMap hashMap2 = this.f26037A;
            Long l10 = (Long) hashMap2.get(a9);
            hashMap.put(a9, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j6));
            hashMap2.put(a9, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x02af, code lost:
    
        if (r12 != 1) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0211 A[PHI: r5
      0x0211: PHI (r5v38 int) = (r5v28 int), (r5v60 int) binds: [B:233:0x0304, B:163:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0215 A[PHI: r5
      0x0215: PHI (r5v37 int) = (r5v28 int), (r5v60 int) binds: [B:233:0x0304, B:163:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0218 A[PHI: r5
      0x0218: PHI (r5v36 int) = (r5v28 int), (r5v60 int) binds: [B:233:0x0304, B:163:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c A[PHI: r5
      0x021c: PHI (r5v35 int) = (r5v28 int), (r5v60 int) binds: [B:233:0x0304, B:163:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0220 A[PHI: r5
      0x0220: PHI (r5v34 int) = (r5v28 int), (r5v60 int) binds: [B:233:0x0304, B:163:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0563 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x043f  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [S0.e, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(C4074vO c4074vO, S0.s sVar) {
        ?? r82;
        int i;
        PN pn;
        int i4;
        HO ho;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        boolean z6;
        DP dp;
        int i6;
        int i9;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        EO eo;
        int i10;
        int i11;
        int i12 = 26;
        if (((XO) sVar.f2969u).f29303a.size() == 0) {
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < ((XO) sVar.f2969u).f29303a.size(); i14++) {
            SparseBooleanArray sparseBooleanArray = ((XO) sVar.f2969u).f29303a;
            AbstractC2792Sd.K(i14, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i14);
            C4182xO c4182xO = (C4182xO) ((SparseArray) sVar.f2970v).get(keyAt);
            c4182xO.getClass();
            if (keyAt == 0) {
                DO r13 = this.f26057v;
                synchronized (r13) {
                    try {
                        if (r13.f25142d == null) {
                            throw null;
                        }
                        AbstractC3627n8 abstractC3627n8 = r13.f25143e;
                        r13.f25143e = c4182xO.f35786b;
                        Iterator it = r13.f25141c.values().iterator();
                        while (it.hasNext()) {
                            CO co = (CO) it.next();
                            if (co.a(abstractC3627n8, r13.f25143e) && !co.b(c4182xO)) {
                            }
                            it.remove();
                            if (co.f24872a.equals(r13.f25144f)) {
                                r13.d(co);
                            }
                            if (co.f24876e) {
                                r13.f25142d.p(c4182xO, co.f24872a);
                            }
                        }
                        r13.c(c4182xO);
                    } finally {
                    }
                }
            } else if (keyAt == 11) {
                DO r42 = this.f26057v;
                synchronized (r42) {
                    try {
                        if (r42.f25142d == null) {
                            throw null;
                        }
                        Iterator it2 = r42.f25141c.values().iterator();
                        while (it2.hasNext()) {
                            CO co2 = (CO) it2.next();
                            if (co2.b(c4182xO)) {
                                it2.remove();
                                if (co2.f24872a.equals(r42.f25144f)) {
                                    r42.d(co2);
                                }
                                if (co2.f24876e) {
                                    r42.f25142d.p(c4182xO, co2.f24872a);
                                }
                            }
                        }
                        r42.c(c4182xO);
                    } finally {
                    }
                }
            } else {
                this.f26057v.b(c4182xO);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sVar.s(0)) {
            C4182xO c4182xO2 = (C4182xO) ((SparseArray) sVar.f2970v).get(0);
            c4182xO2.getClass();
            if (this.f26040D != null) {
                e(c4182xO2.f35786b, c4182xO2.f35788d);
            }
        }
        if (sVar.s(2) && this.f26040D != null) {
            RB rb = c4074vO.R1().f35620a;
            int size = rb.size();
            int i15 = 0;
            loop3: while (true) {
                if (i15 >= size) {
                    eo = null;
                    break;
                }
                C3163eb c3163eb = (C3163eb) rb.get(i15);
                while (true) {
                    i11 = i15 + 1;
                    if (i13 < c3163eb.f30732a) {
                        if (c3163eb.f30736e[i13] && (eo = c3163eb.f30733b.f24418d[i13].f25180s) != null) {
                            break loop3;
                        } else {
                            i13++;
                        }
                    }
                }
                i15 = i11;
                i13 = 0;
            }
            if (eo != null) {
                PlaybackMetrics.Builder builder = this.f26040D;
                String str = AbstractC3182eu.f30782a;
                PlaybackMetrics.Builder b9 = FO.b(builder);
                int i16 = 0;
                while (true) {
                    if (i16 >= eo.f25373w) {
                        i10 = 1;
                        break;
                    }
                    UUID uuid = eo.f25370n[i16].f24451u;
                    if (uuid.equals(Yw.f29543d)) {
                        i10 = 3;
                        break;
                    } else if (uuid.equals(Yw.f29544e)) {
                        i10 = 2;
                        break;
                    } else {
                        if (uuid.equals(Yw.f29542c)) {
                            i10 = 6;
                            break;
                        }
                        i16++;
                    }
                }
                b9.setDrmType(i10);
            }
        }
        if (sVar.s(1011)) {
            this.f26053R++;
        }
        DN dn = this.f26043G;
        if (dn != null) {
            Context context = this.f26055n;
            int i17 = dn.f25131n;
            if (i17 == 1001) {
                i6 = 20;
            } else {
                boolean z9 = dn.f25133v == 1;
                int i18 = dn.f25137z;
                Throwable cause = dn.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof VL) {
                        i9 = ((VL) cause).f28933v;
                        i6 = 5;
                    } else if (cause instanceof U4) {
                        i9 = 0;
                        i6 = 11;
                    } else {
                        boolean z10 = cause instanceof C3909sL;
                        if (z10 || (cause instanceof AbstractC3804qN)) {
                            if (C3663nr.a(context).b() == 1) {
                                i6 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i9 = 0;
                                    i6 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    i9 = 0;
                                    i6 = 7;
                                } else if (z10 && ((C3909sL) cause).f34738u == 1) {
                                    i9 = 0;
                                    i6 = 4;
                                } else {
                                    i9 = 0;
                                    i6 = 8;
                                }
                            }
                        } else if (i17 == 1002) {
                            i6 = 21;
                        } else if (cause instanceof C4237yP) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                i9 = AbstractC3182eu.k(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (AbstractC3182eu.g(i9)) {
                                    case 6002:
                                        i6 = 24;
                                        break;
                                    case 6003:
                                        i6 = 28;
                                        break;
                                    case 6004:
                                        i6 = 25;
                                        break;
                                    case 6005:
                                        i6 = 26;
                                        break;
                                    default:
                                        i6 = 27;
                                        break;
                                }
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i6 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i6 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i6 = 29;
                            } else {
                                if (!(cause3 instanceof CP)) {
                                    i6 = 30;
                                }
                                i9 = 0;
                                i6 = 23;
                            }
                        } else if ((cause instanceof DK) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            i6 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                        } else {
                            i6 = 9;
                        }
                    }
                    timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f26059x);
                    errorCode = timeSinceCreatedMillis3.setErrorCode(i6);
                    subErrorCode = errorCode.setSubErrorCode(i9);
                    exception = subErrorCode.setException(dn);
                    build3 = exception.build();
                    this.f26056u.execute(new RunnableC3071cq(i12, this, build3));
                    this.f26054S = true;
                    this.f26043G = null;
                } else {
                    if (z9) {
                        i6 = 35;
                        if (i18 != 0) {
                        }
                    }
                    if (z9 && i18 == 3) {
                        i6 = 15;
                    } else {
                        if (!z9 || i18 != 2) {
                            if (cause instanceof QP) {
                                i9 = AbstractC3182eu.k(((QP) cause).f27813v);
                                i6 = 13;
                            } else {
                                i6 = 14;
                                if (cause instanceof OP) {
                                    i9 = ((OP) cause).f27386n;
                                } else if (!(cause instanceof OutOfMemoryError)) {
                                    if (cause instanceof C2946aP) {
                                        i6 = 17;
                                    } else if (cause instanceof C3000bP) {
                                        i9 = ((C3000bP) cause).f30079n;
                                        i6 = 18;
                                    } else if (cause instanceof MediaCodec.CryptoException) {
                                        i9 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        switch (AbstractC3182eu.g(i9)) {
                                        }
                                    } else {
                                        i9 = 0;
                                        i6 = 22;
                                    }
                                }
                            }
                            timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f26059x);
                            errorCode = timeSinceCreatedMillis3.setErrorCode(i6);
                            subErrorCode = errorCode.setSubErrorCode(i9);
                            exception = subErrorCode.setException(dn);
                            build3 = exception.build();
                            this.f26056u.execute(new RunnableC3071cq(i12, this, build3));
                            this.f26054S = true;
                            this.f26043G = null;
                        }
                        i9 = 0;
                        i6 = 23;
                        timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f26059x);
                        errorCode = timeSinceCreatedMillis3.setErrorCode(i6);
                        subErrorCode = errorCode.setSubErrorCode(i9);
                        exception = subErrorCode.setException(dn);
                        build3 = exception.build();
                        this.f26056u.execute(new RunnableC3071cq(i12, this, build3));
                        this.f26054S = true;
                        this.f26043G = null;
                    }
                }
            }
            i9 = 0;
            timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f26059x);
            errorCode = timeSinceCreatedMillis3.setErrorCode(i6);
            subErrorCode = errorCode.setSubErrorCode(i9);
            exception = subErrorCode.setException(dn);
            build3 = exception.build();
            this.f26056u.execute(new RunnableC3071cq(i12, this, build3));
            this.f26054S = true;
            this.f26043G = null;
        }
        if (sVar.s(2)) {
            C4132wb R1 = c4074vO.R1();
            boolean a9 = R1.a(2);
            boolean a10 = R1.a(1);
            boolean a11 = R1.a(3);
            if (a9 || a10) {
                z6 = a11;
            } else if (a11) {
                z6 = true;
            }
            if (a9) {
                dp = null;
            } else {
                dp = null;
                if (!Objects.equals(this.f26046K, null)) {
                    int i19 = this.f26046K == null ? 1 : 0;
                    this.f26046K = null;
                    c(1, elapsedRealtime, null, i19);
                }
            }
            if (!a10 && !Objects.equals(this.f26047L, dp)) {
                int i20 = this.f26047L == null ? 1 : 0;
                this.f26047L = dp;
                c(0, elapsedRealtime, dp, i20);
            }
            if (!z6 && !Objects.equals(this.f26048M, dp)) {
                int i21 = this.f26048M == null ? 1 : 0;
                this.f26048M = dp;
                c(2, elapsedRealtime, dp, i21);
            }
            r82 = dp;
            if (q(this.f26044H)) {
                DP dp2 = (DP) this.f26044H.f2908u;
                if (dp2.f25184w != -1) {
                    if (!Objects.equals(this.f26046K, dp2)) {
                        int i22 = this.f26046K == null ? 1 : 0;
                        this.f26046K = dp2;
                        c(1, elapsedRealtime, dp2, i22);
                    }
                    this.f26044H = r82;
                }
            }
            if (q(this.f26045I)) {
                DP dp3 = (DP) this.f26045I.f2908u;
                if (!Objects.equals(this.f26047L, dp3)) {
                    int i23 = this.f26047L == null ? 1 : 0;
                    this.f26047L = dp3;
                    c(0, elapsedRealtime, dp3, i23);
                }
                this.f26045I = r82;
            }
            if (q(this.J)) {
                DP dp4 = (DP) this.J.f2908u;
                if (!Objects.equals(this.f26048M, dp4)) {
                    int i24 = this.f26048M == null ? 1 : 0;
                    this.f26048M = dp4;
                    c(2, elapsedRealtime, dp4, i24);
                }
                this.J = r82;
            }
            switch (C3663nr.a(this.f26055n).b()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 9;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                case 8:
                default:
                    i = 1;
                    break;
                case 7:
                    i = 3;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 7;
                    break;
            }
            if (i != this.f26042F) {
                this.f26042F = i;
                networkType = GO.h().setNetworkType(i);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f26059x);
                build2 = timeSinceCreatedMillis2.build();
                this.f26056u.execute(new RunnableC3071cq(22, this, build2));
            }
            if (c4074vO.u1() != 2) {
                this.f26049N = false;
            }
            c4074vO.f35459w.b();
            pn = c4074vO.f35458v;
            pn.O0();
            if (pn.f27592y0.f32733f != null) {
                this.f26050O = false;
            } else if (sVar.s(10)) {
                this.f26050O = true;
            }
            int u12 = c4074vO.u1();
            if (!this.f26049N) {
                i4 = 5;
            } else if (this.f26050O) {
                i4 = 13;
            } else if (u12 == 4) {
                i4 = 11;
            } else {
                i4 = 12;
                if (u12 == 2) {
                    int i25 = this.f26041E;
                    i4 = (i25 == 0 || i25 == 2 || i25 == 12) ? 2 : !c4074vO.A1() ? 7 : c4074vO.w1() != 0 ? 10 : 6;
                } else if (u12 == 3) {
                    i4 = !c4074vO.A1() ? 4 : c4074vO.w1() != 0 ? 9 : 3;
                } else if (u12 != 1 || this.f26041E == 0) {
                    i4 = this.f26041E;
                }
            }
            if (this.f26041E != i4) {
                this.f26041E = i4;
                this.f26054S = true;
                state = GO.r().setState(this.f26041E);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f26059x);
                build = timeSinceCreatedMillis.build();
                this.f26056u.execute(new RunnableC3071cq(23, this, build));
            }
            if (sVar.s(1028)) {
                return;
            }
            DO r22 = this.f26057v;
            C4182xO c4182xO3 = (C4182xO) ((SparseArray) sVar.f2970v).get(1028);
            c4182xO3.getClass();
            synchronized (r22) {
                try {
                    String str2 = r22.f25144f;
                    if (str2 != null) {
                        CO co3 = (CO) r22.f25141c.get(str2);
                        if (co3 == null) {
                            throw r82;
                        }
                        r22.d(co3);
                    }
                    Iterator it3 = r22.f25141c.values().iterator();
                    while (it3.hasNext()) {
                        CO co4 = (CO) it3.next();
                        it3.remove();
                        if (co4.f24876e && (ho = r22.f25142d) != null) {
                            ho.p(c4182xO3, co4.f24872a);
                        }
                    }
                } finally {
                }
            }
            return;
        }
        r82 = 0;
        if (q(this.f26044H)) {
        }
        if (q(this.f26045I)) {
        }
        if (q(this.J)) {
        }
        switch (C3663nr.a(this.f26055n).b()) {
        }
        if (i != this.f26042F) {
        }
        if (c4074vO.u1() != 2) {
        }
        c4074vO.f35459w.b();
        pn = c4074vO.f35458v;
        pn.O0();
        if (pn.f27592y0.f32733f != null) {
        }
        int u122 = c4074vO.u1();
        if (!this.f26049N) {
        }
        if (this.f26041E != i4) {
        }
        if (sVar.s(1028)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void h(C4181xN c4181xN) {
        this.f26051P += c4181xN.f35780g;
        this.f26052Q += c4181xN.f35778e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void i(C3058cd c3058cd) {
        S0.e eVar = this.f26044H;
        if (eVar != null) {
            DP dp = (DP) eVar.f2908u;
            if (dp.f25184w == -1) {
                C3322hP c3322hP = new C3322hP(dp);
                c3322hP.f31565u = c3058cd.f30286a;
                c3322hP.f31566v = c3058cd.f30287b;
                this.f26044H = new S0.e(29, new DP(c3322hP), (String) eVar.f2909v);
            }
        }
    }

    public final void l() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f26040D;
        if (builder != null && this.f26054S) {
            builder.setAudioUnderrunCount(this.f26053R);
            this.f26040D.setVideoFramesDropped(this.f26051P);
            this.f26040D.setVideoFramesPlayed(this.f26052Q);
            Long l9 = (Long) this.f26037A.get(this.f26039C);
            this.f26040D.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f26038B.get(this.f26039C);
            this.f26040D.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f26040D.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            build = this.f26040D.build();
            this.f26056u.execute(new RunnableC3071cq(25, this, build));
        }
        this.f26040D = null;
        this.f26039C = null;
        this.f26053R = 0;
        this.f26051P = 0;
        this.f26052Q = 0;
        this.f26046K = null;
        this.f26047L = null;
        this.f26048M = null;
        this.f26054S = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void m(C4182xO c4182xO, C3699oQ c3699oQ) {
        C3860rQ c3860rQ = c4182xO.f35788d;
        if (c3860rQ == null) {
            return;
        }
        DP dp = c3699oQ.f33693b;
        dp.getClass();
        S0.e eVar = new S0.e(29, dp, this.f26057v.a(c4182xO.f35786b, c3860rQ));
        int i = c3699oQ.f33692a;
        if (i != 0) {
            if (i == 1) {
                this.f26045I = eVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.J = eVar;
                return;
            }
        }
        this.f26044H = eVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void o(DN dn) {
        this.f26043G = dn;
    }

    public final void p(C4182xO c4182xO, String str) {
        C3860rQ c3860rQ = c4182xO.f35788d;
        if ((c3860rQ == null || !c3860rQ.b()) && str.equals(this.f26039C)) {
            l();
        }
        this.f26037A.remove(str);
        this.f26038B.remove(str);
    }

    public final boolean q(S0.e eVar) {
        String str;
        if (eVar == null) {
            return false;
        }
        DO r02 = this.f26057v;
        String str2 = (String) eVar.f2909v;
        synchronized (r02) {
            str = r02.f25144f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void n(IOException iOException) {
    }
}
