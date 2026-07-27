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
public final class HO implements InterfaceC4213yO {

    /* renamed from: C, reason: collision with root package name */
    public String f25267C;

    /* renamed from: D, reason: collision with root package name */
    public PlaybackMetrics.Builder f25268D;

    /* renamed from: G, reason: collision with root package name */
    public DN f25271G;

    /* renamed from: H, reason: collision with root package name */
    public S0.e f25272H;

    /* renamed from: I, reason: collision with root package name */
    public S0.e f25273I;
    public S0.e J;

    /* renamed from: K, reason: collision with root package name */
    public DP f25274K;

    /* renamed from: L, reason: collision with root package name */
    public DP f25275L;

    /* renamed from: M, reason: collision with root package name */
    public DP f25276M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f25277N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f25278O;

    /* renamed from: P, reason: collision with root package name */
    public int f25279P;

    /* renamed from: Q, reason: collision with root package name */
    public int f25280Q;

    /* renamed from: R, reason: collision with root package name */
    public int f25281R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f25282S;

    /* renamed from: n, reason: collision with root package name */
    public final Context f25283n;

    /* renamed from: v, reason: collision with root package name */
    public final DO f25285v;

    /* renamed from: w, reason: collision with root package name */
    public final PlaybackSession f25286w;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f25284u = AbstractC3043cl.j();

    /* renamed from: y, reason: collision with root package name */
    public final U7 f25288y = new U7();

    /* renamed from: z, reason: collision with root package name */
    public final K7 f25289z = new K7();

    /* renamed from: B, reason: collision with root package name */
    public final HashMap f25266B = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f25265A = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final long f25287x = SystemClock.elapsedRealtime();

    /* renamed from: E, reason: collision with root package name */
    public int f25269E = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f25270F = 0;

    public HO(Context context, PlaybackSession playbackSession) {
        this.f25283n = context.getApplicationContext();
        this.f25286w = playbackSession;
        DO r12 = new DO();
        this.f25285v = r12;
        r12.f24397d = this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void a(int i) {
        if (i == 1) {
            this.f25277N = true;
        }
    }

    public final void c(int i, long j6, DP dp, int i6) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = GO.s(i).setTimeSinceCreatedMillis(j6 - this.f25287x);
        if (dp != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i6 != 1 ? 1 : 2);
            String str = dp.f24430n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = dp.f24431o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = dp.f24427k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = dp.f24426j;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = dp.f24438v;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = dp.f24439w;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = dp.f24409H;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = dp.J;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = dp.f24421d;
            if (str4 != null) {
                String str5 = AbstractC3159eu.f29993a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f3 = dp.f24442z;
            if (f3 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f3);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f25282S = true;
        build = timeSinceCreatedMillis.build();
        this.f25284u.execute(new RunnableC3048cq(24, this, build));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ) {
        PlaybackMetrics.Builder builder = this.f25268D;
        if (c3676oQ == null) {
            return;
        }
        int e9 = abstractC3604n8.e(c3676oQ.f32905a);
        char c9 = 65535;
        if (e9 != -1) {
            K7 k72 = this.f25289z;
            int i = 0;
            abstractC3604n8.d(e9, k72, false);
            int i6 = k72.f25867c;
            U7 u72 = this.f25288y;
            abstractC3604n8.b(i6, u72, 0L);
            L0 l02 = u72.f27894b.f29185b;
            if (l02 != null) {
                String str = AbstractC3159eu.f29993a;
                Uri uri = l02.f26006a;
                String scheme = uri.getScheme();
                if (scheme == null || !(AbstractC3043cl.D("rtsp", scheme) || AbstractC3043cl.D("rtspt", scheme))) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (lastIndexOf >= 0) {
                            String f3 = AbstractC3043cl.f(lastPathSegment.substring(lastIndexOf + 1));
                            switch (f3.hashCode()) {
                                case 104579:
                                    if (f3.equals("ism")) {
                                        c9 = 2;
                                        break;
                                    }
                                    break;
                                case 108321:
                                    if (f3.equals("mpd")) {
                                        c9 = 0;
                                        break;
                                    }
                                    break;
                                case 3242057:
                                    if (f3.equals("isml")) {
                                        c9 = 3;
                                        break;
                                    }
                                    break;
                                case 3299913:
                                    if (f3.equals("m3u8")) {
                                        c9 = 1;
                                        break;
                                    }
                                    break;
                            }
                            int i9 = c9 != 0 ? c9 != 1 ? (c9 == 2 || c9 == 3) ? 1 : 4 : 2 : 0;
                            if (i9 != 4) {
                                i = i9;
                            }
                        }
                        String path = uri.getPath();
                        path.getClass();
                        Matcher matcher = AbstractC3159eu.f29995c.matcher(path);
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
            long j6 = u72.f27901j;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b && !u72.i && !u72.f27899g && !u72.b()) {
                builder.setMediaDurationMillis(AbstractC3159eu.t(j6));
            }
            builder.setPlaybackType(true != u72.b() ? 1 : 2);
            this.f25282S = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void f(C4159xO c4159xO, int i, long j6) {
        C3676oQ c3676oQ = c4159xO.f35007d;
        if (c3676oQ != null) {
            String a9 = this.f25285v.a(c4159xO.f35005b, c3676oQ);
            HashMap hashMap = this.f25266B;
            Long l9 = (Long) hashMap.get(a9);
            HashMap hashMap2 = this.f25265A;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(C4051vO c4051vO, S0.s sVar) {
        ?? r82;
        int i;
        PN pn;
        int i6;
        HO ho;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        boolean z3;
        DP dp;
        int i9;
        int i10;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        EO eo;
        int i11;
        int i12;
        int i13 = 26;
        if (((XO) sVar.f2840u).f28523a.size() == 0) {
            return;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < ((XO) sVar.f2840u).f28523a.size(); i15++) {
            SparseBooleanArray sparseBooleanArray = ((XO) sVar.f2840u).f28523a;
            AbstractC2772Sd.K(i15, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i15);
            C4159xO c4159xO = (C4159xO) ((SparseArray) sVar.f2841v).get(keyAt);
            c4159xO.getClass();
            if (keyAt == 0) {
                DO r13 = this.f25285v;
                synchronized (r13) {
                    try {
                        if (r13.f24397d == null) {
                            throw null;
                        }
                        AbstractC3604n8 abstractC3604n8 = r13.f24398e;
                        r13.f24398e = c4159xO.f35005b;
                        Iterator it = r13.f24396c.values().iterator();
                        while (it.hasNext()) {
                            CO co = (CO) it.next();
                            if (co.a(abstractC3604n8, r13.f24398e) && !co.b(c4159xO)) {
                            }
                            it.remove();
                            if (co.f24109a.equals(r13.f24399f)) {
                                r13.d(co);
                            }
                            if (co.f24113e) {
                                r13.f24397d.p(c4159xO, co.f24109a);
                            }
                        }
                        r13.c(c4159xO);
                    } finally {
                    }
                }
            } else if (keyAt == 11) {
                DO r42 = this.f25285v;
                synchronized (r42) {
                    try {
                        if (r42.f24397d == null) {
                            throw null;
                        }
                        Iterator it2 = r42.f24396c.values().iterator();
                        while (it2.hasNext()) {
                            CO co2 = (CO) it2.next();
                            if (co2.b(c4159xO)) {
                                it2.remove();
                                if (co2.f24109a.equals(r42.f24399f)) {
                                    r42.d(co2);
                                }
                                if (co2.f24113e) {
                                    r42.f24397d.p(c4159xO, co2.f24109a);
                                }
                            }
                        }
                        r42.c(c4159xO);
                    } finally {
                    }
                }
            } else {
                this.f25285v.b(c4159xO);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sVar.s(0)) {
            C4159xO c4159xO2 = (C4159xO) ((SparseArray) sVar.f2841v).get(0);
            c4159xO2.getClass();
            if (this.f25268D != null) {
                e(c4159xO2.f35005b, c4159xO2.f35007d);
            }
        }
        if (sVar.s(2) && this.f25268D != null) {
            RB rb = c4051vO.Q1().f34843a;
            int size = rb.size();
            int i16 = 0;
            loop3: while (true) {
                if (i16 >= size) {
                    eo = null;
                    break;
                }
                C3140eb c3140eb = (C3140eb) rb.get(i16);
                while (true) {
                    i12 = i16 + 1;
                    if (i14 < c3140eb.f29941a) {
                        if (c3140eb.f29945e[i14] && (eo = c3140eb.f29942b.f23638d[i14].f24435s) != null) {
                            break loop3;
                        } else {
                            i14++;
                        }
                    }
                }
                i16 = i12;
                i14 = 0;
            }
            if (eo != null) {
                PlaybackMetrics.Builder builder = this.f25268D;
                String str = AbstractC3159eu.f29993a;
                PlaybackMetrics.Builder b9 = FO.b(builder);
                int i17 = 0;
                while (true) {
                    if (i17 >= eo.f24612w) {
                        i11 = 1;
                        break;
                    }
                    UUID uuid = eo.f24609n[i17].f23671u;
                    if (uuid.equals(Yw.f28763d)) {
                        i11 = 3;
                        break;
                    } else if (uuid.equals(Yw.f28764e)) {
                        i11 = 2;
                        break;
                    } else {
                        if (uuid.equals(Yw.f28762c)) {
                            i11 = 6;
                            break;
                        }
                        i17++;
                    }
                }
                b9.setDrmType(i11);
            }
        }
        if (sVar.s(1011)) {
            this.f25281R++;
        }
        DN dn = this.f25271G;
        if (dn != null) {
            Context context = this.f25283n;
            int i18 = dn.f24386n;
            if (i18 == 1001) {
                i9 = 20;
            } else {
                boolean z6 = dn.f24388v == 1;
                int i19 = dn.f24392z;
                Throwable cause = dn.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof VL) {
                        i10 = ((VL) cause).f28136v;
                        i9 = 5;
                    } else if (cause instanceof U4) {
                        i10 = 0;
                        i9 = 11;
                    } else {
                        boolean z9 = cause instanceof C3886sL;
                        if (z9 || (cause instanceof AbstractC3781qN)) {
                            if (C3640nr.a(context).b() == 1) {
                                i9 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i10 = 0;
                                    i9 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    i10 = 0;
                                    i9 = 7;
                                } else if (z9 && ((C3886sL) cause).f33970u == 1) {
                                    i10 = 0;
                                    i9 = 4;
                                } else {
                                    i10 = 0;
                                    i9 = 8;
                                }
                            }
                        } else if (i18 == 1002) {
                            i9 = 21;
                        } else if (cause instanceof C4214yP) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                i10 = AbstractC3159eu.k(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (AbstractC3159eu.g(i10)) {
                                    case 6002:
                                        i9 = 24;
                                        break;
                                    case 6003:
                                        i9 = 28;
                                        break;
                                    case 6004:
                                        i9 = 25;
                                        break;
                                    case 6005:
                                        i9 = 26;
                                        break;
                                    default:
                                        i9 = 27;
                                        break;
                                }
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i9 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i9 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i9 = 29;
                            } else {
                                if (!(cause3 instanceof CP)) {
                                    i9 = 30;
                                }
                                i10 = 0;
                                i9 = 23;
                            }
                        } else if ((cause instanceof DK) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            i9 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                        } else {
                            i9 = 9;
                        }
                    }
                    timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f25287x);
                    errorCode = timeSinceCreatedMillis3.setErrorCode(i9);
                    subErrorCode = errorCode.setSubErrorCode(i10);
                    exception = subErrorCode.setException(dn);
                    build3 = exception.build();
                    this.f25284u.execute(new RunnableC3048cq(i13, this, build3));
                    this.f25282S = true;
                    this.f25271G = null;
                } else {
                    if (z6) {
                        i9 = 35;
                        if (i19 != 0) {
                        }
                    }
                    if (z6 && i19 == 3) {
                        i9 = 15;
                    } else {
                        if (!z6 || i19 != 2) {
                            if (cause instanceof PP) {
                                i10 = AbstractC3159eu.k(((PP) cause).f26817v);
                                i9 = 13;
                            } else {
                                i9 = 14;
                                if (cause instanceof NP) {
                                    i10 = ((NP) cause).f26489n;
                                } else if (!(cause instanceof OutOfMemoryError)) {
                                    if (cause instanceof C2923aP) {
                                        i9 = 17;
                                    } else if (cause instanceof C2977bP) {
                                        i10 = ((C2977bP) cause).f29291n;
                                        i9 = 18;
                                    } else if (cause instanceof MediaCodec.CryptoException) {
                                        i10 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        switch (AbstractC3159eu.g(i10)) {
                                        }
                                    } else {
                                        i10 = 0;
                                        i9 = 22;
                                    }
                                }
                            }
                            timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f25287x);
                            errorCode = timeSinceCreatedMillis3.setErrorCode(i9);
                            subErrorCode = errorCode.setSubErrorCode(i10);
                            exception = subErrorCode.setException(dn);
                            build3 = exception.build();
                            this.f25284u.execute(new RunnableC3048cq(i13, this, build3));
                            this.f25282S = true;
                            this.f25271G = null;
                        }
                        i10 = 0;
                        i9 = 23;
                        timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f25287x);
                        errorCode = timeSinceCreatedMillis3.setErrorCode(i9);
                        subErrorCode = errorCode.setSubErrorCode(i10);
                        exception = subErrorCode.setException(dn);
                        build3 = exception.build();
                        this.f25284u.execute(new RunnableC3048cq(i13, this, build3));
                        this.f25282S = true;
                        this.f25271G = null;
                    }
                }
            }
            i10 = 0;
            timeSinceCreatedMillis3 = GO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f25287x);
            errorCode = timeSinceCreatedMillis3.setErrorCode(i9);
            subErrorCode = errorCode.setSubErrorCode(i10);
            exception = subErrorCode.setException(dn);
            build3 = exception.build();
            this.f25284u.execute(new RunnableC3048cq(i13, this, build3));
            this.f25282S = true;
            this.f25271G = null;
        }
        if (sVar.s(2)) {
            C4109wb Q12 = c4051vO.Q1();
            boolean a9 = Q12.a(2);
            boolean a10 = Q12.a(1);
            boolean a11 = Q12.a(3);
            if (a9 || a10) {
                z3 = a11;
            } else if (a11) {
                z3 = true;
            }
            if (a9) {
                dp = null;
            } else {
                dp = null;
                if (!Objects.equals(this.f25274K, null)) {
                    int i20 = this.f25274K == null ? 1 : 0;
                    this.f25274K = null;
                    c(1, elapsedRealtime, null, i20);
                }
            }
            if (!a10 && !Objects.equals(this.f25275L, dp)) {
                int i21 = this.f25275L == null ? 1 : 0;
                this.f25275L = dp;
                c(0, elapsedRealtime, dp, i21);
            }
            if (!z3 && !Objects.equals(this.f25276M, dp)) {
                int i22 = this.f25276M == null ? 1 : 0;
                this.f25276M = dp;
                c(2, elapsedRealtime, dp, i22);
            }
            r82 = dp;
            if (q(this.f25272H)) {
                DP dp2 = (DP) this.f25272H.f2781u;
                if (dp2.f24439w != -1) {
                    if (!Objects.equals(this.f25274K, dp2)) {
                        int i23 = this.f25274K == null ? 1 : 0;
                        this.f25274K = dp2;
                        c(1, elapsedRealtime, dp2, i23);
                    }
                    this.f25272H = r82;
                }
            }
            if (q(this.f25273I)) {
                DP dp3 = (DP) this.f25273I.f2781u;
                if (!Objects.equals(this.f25275L, dp3)) {
                    int i24 = this.f25275L == null ? 1 : 0;
                    this.f25275L = dp3;
                    c(0, elapsedRealtime, dp3, i24);
                }
                this.f25273I = r82;
            }
            if (q(this.J)) {
                DP dp4 = (DP) this.J.f2781u;
                if (!Objects.equals(this.f25276M, dp4)) {
                    int i25 = this.f25276M == null ? 1 : 0;
                    this.f25276M = dp4;
                    c(2, elapsedRealtime, dp4, i25);
                }
                this.J = r82;
            }
            switch (C3640nr.a(this.f25283n).b()) {
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
            if (i != this.f25270F) {
                this.f25270F = i;
                networkType = GO.h().setNetworkType(i);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f25287x);
                build2 = timeSinceCreatedMillis2.build();
                this.f25284u.execute(new RunnableC3048cq(22, this, build2));
            }
            if (c4051vO.u1() != 2) {
                this.f25277N = false;
            }
            c4051vO.f34696w.b();
            pn = c4051vO.f34695v;
            pn.P0();
            if (pn.f26771D0.f31953f != null) {
                this.f25278O = false;
            } else if (sVar.s(10)) {
                this.f25278O = true;
            }
            int u12 = c4051vO.u1();
            if (!this.f25277N) {
                i6 = 5;
            } else if (this.f25278O) {
                i6 = 13;
            } else if (u12 == 4) {
                i6 = 11;
            } else {
                i6 = 12;
                if (u12 == 2) {
                    int i26 = this.f25269E;
                    i6 = (i26 == 0 || i26 == 2 || i26 == 12) ? 2 : !c4051vO.A1() ? 7 : c4051vO.w1() != 0 ? 10 : 6;
                } else if (u12 == 3) {
                    i6 = !c4051vO.A1() ? 4 : c4051vO.w1() != 0 ? 9 : 3;
                } else if (u12 != 1 || this.f25269E == 0) {
                    i6 = this.f25269E;
                }
            }
            if (this.f25269E != i6) {
                this.f25269E = i6;
                this.f25282S = true;
                state = GO.r().setState(this.f25269E);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f25287x);
                build = timeSinceCreatedMillis.build();
                this.f25284u.execute(new RunnableC3048cq(23, this, build));
            }
            if (sVar.s(1028)) {
                return;
            }
            DO r22 = this.f25285v;
            C4159xO c4159xO3 = (C4159xO) ((SparseArray) sVar.f2841v).get(1028);
            c4159xO3.getClass();
            synchronized (r22) {
                try {
                    String str2 = r22.f24399f;
                    if (str2 != null) {
                        CO co3 = (CO) r22.f24396c.get(str2);
                        if (co3 == null) {
                            throw r82;
                        }
                        r22.d(co3);
                    }
                    Iterator it3 = r22.f24396c.values().iterator();
                    while (it3.hasNext()) {
                        CO co4 = (CO) it3.next();
                        it3.remove();
                        if (co4.f24113e && (ho = r22.f24397d) != null) {
                            ho.p(c4159xO3, co4.f24109a);
                        }
                    }
                } finally {
                }
            }
            return;
        }
        r82 = 0;
        if (q(this.f25272H)) {
        }
        if (q(this.f25273I)) {
        }
        if (q(this.J)) {
        }
        switch (C3640nr.a(this.f25283n).b()) {
        }
        if (i != this.f25270F) {
        }
        if (c4051vO.u1() != 2) {
        }
        c4051vO.f34696w.b();
        pn = c4051vO.f34695v;
        pn.P0();
        if (pn.f26771D0.f31953f != null) {
        }
        int u122 = c4051vO.u1();
        if (!this.f25277N) {
        }
        if (this.f25269E != i6) {
        }
        if (sVar.s(1028)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void h(C4158xN c4158xN) {
        this.f25279P += c4158xN.f34999g;
        this.f25280Q += c4158xN.f34997e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void i(C3035cd c3035cd) {
        S0.e eVar = this.f25272H;
        if (eVar != null) {
            DP dp = (DP) eVar.f2781u;
            if (dp.f24439w == -1) {
                C3299hP c3299hP = new C3299hP(dp);
                c3299hP.f30799u = c3035cd.f29501a;
                c3299hP.f30800v = c3035cd.f29502b;
                this.f25272H = new S0.e(25, new DP(c3299hP), (String) eVar.f2782v);
            }
        }
    }

    public final void l() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f25268D;
        if (builder != null && this.f25282S) {
            builder.setAudioUnderrunCount(this.f25281R);
            this.f25268D.setVideoFramesDropped(this.f25279P);
            this.f25268D.setVideoFramesPlayed(this.f25280Q);
            Long l9 = (Long) this.f25265A.get(this.f25267C);
            this.f25268D.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f25266B.get(this.f25267C);
            this.f25268D.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f25268D.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            build = this.f25268D.build();
            this.f25284u.execute(new RunnableC3048cq(25, this, build));
        }
        this.f25268D = null;
        this.f25267C = null;
        this.f25281R = 0;
        this.f25279P = 0;
        this.f25280Q = 0;
        this.f25274K = null;
        this.f25275L = null;
        this.f25276M = null;
        this.f25282S = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void m(C4159xO c4159xO, C3514lQ c3514lQ) {
        C3676oQ c3676oQ = c4159xO.f35007d;
        if (c3676oQ == null) {
            return;
        }
        DP dp = c3514lQ.f31765b;
        dp.getClass();
        S0.e eVar = new S0.e(25, dp, this.f25285v.a(c4159xO.f35005b, c3676oQ));
        int i = c3514lQ.f31764a;
        if (i != 0) {
            if (i == 1) {
                this.f25273I = eVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.J = eVar;
                return;
            }
        }
        this.f25272H = eVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void o(DN dn) {
        this.f25271G = dn;
    }

    public final void p(C4159xO c4159xO, String str) {
        C3676oQ c3676oQ = c4159xO.f35007d;
        if ((c3676oQ == null || !c3676oQ.b()) && str.equals(this.f25267C)) {
            l();
        }
        this.f25265A.remove(str);
        this.f25266B.remove(str);
    }

    public final boolean q(S0.e eVar) {
        String str;
        if (eVar == null) {
            return false;
        }
        DO r02 = this.f25285v;
        String str2 = (String) eVar.f2782v;
        synchronized (r02) {
            str = r02.f24399f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void n(IOException iOException) {
    }
}
