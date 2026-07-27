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
public final class UO implements LO {

    /* renamed from: C, reason: collision with root package name */
    public String f27975C;

    /* renamed from: D, reason: collision with root package name */
    public PlaybackMetrics.Builder f27976D;

    /* renamed from: G, reason: collision with root package name */
    public RN f27979G;

    /* renamed from: H, reason: collision with root package name */
    public C4164xG f27980H;

    /* renamed from: I, reason: collision with root package name */
    public C4164xG f27981I;
    public C4164xG J;

    /* renamed from: K, reason: collision with root package name */
    public TP f27982K;

    /* renamed from: L, reason: collision with root package name */
    public TP f27983L;

    /* renamed from: M, reason: collision with root package name */
    public TP f27984M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f27985N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f27986O;

    /* renamed from: P, reason: collision with root package name */
    public int f27987P;

    /* renamed from: Q, reason: collision with root package name */
    public int f27988Q;

    /* renamed from: R, reason: collision with root package name */
    public int f27989R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f27990S;

    /* renamed from: n, reason: collision with root package name */
    public final Context f27991n;

    /* renamed from: v, reason: collision with root package name */
    public final QO f27993v;

    /* renamed from: w, reason: collision with root package name */
    public final PlaybackSession f27994w;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f27992u = AbstractC3217fl.j();

    /* renamed from: y, reason: collision with root package name */
    public final Y7 f27996y = new Y7();

    /* renamed from: z, reason: collision with root package name */
    public final L7 f27997z = new L7();

    /* renamed from: B, reason: collision with root package name */
    public final HashMap f27974B = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f27973A = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final long f27995x = SystemClock.elapsedRealtime();

    /* renamed from: E, reason: collision with root package name */
    public int f27977E = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f27978F = 0;

    public UO(Context context, PlaybackSession playbackSession) {
        this.f27991n = context.getApplicationContext();
        this.f27994w = playbackSession;
        QO qo = new QO();
        this.f27993v = qo;
        qo.f27153d = this;
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void a(int i) {
        if (i == 1) {
            this.f27985N = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x02a1, code lost:
    
        if (r12 != 1) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206 A[PHI: r5
      0x0206: PHI (r5v37 int) = (r5v27 int), (r5v60 int) binds: [B:233:0x02f6, B:163:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209 A[PHI: r5
      0x0209: PHI (r5v36 int) = (r5v27 int), (r5v60 int) binds: [B:233:0x02f6, B:163:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020d A[PHI: r5
      0x020d: PHI (r5v35 int) = (r5v27 int), (r5v60 int) binds: [B:233:0x02f6, B:163:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0211 A[PHI: r5
      0x0211: PHI (r5v34 int) = (r5v27 int), (r5v60 int) binds: [B:233:0x02f6, B:163:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0556 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0432  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.xG, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.google.android.gms.internal.ads.LO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(IO io, C4164xG c4164xG) {
        ?? r82;
        int i;
        C3093dO c3093dO;
        int i4;
        UO uo;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        boolean z8;
        TP tp;
        int i9;
        int errorCode;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        RO ro;
        int i10;
        int i11;
        int i12 = 27;
        if (((C3526lP) c4164xG.f35132u).f32566a.size() == 0) {
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < ((C3526lP) c4164xG.f35132u).f32566a.size(); i14++) {
            int a9 = ((C3526lP) c4164xG.f35132u).a(i14);
            KO ko = (KO) ((SparseArray) c4164xG.f35133v).get(a9);
            ko.getClass();
            if (a9 == 0) {
                QO qo = this.f27993v;
                synchronized (qo) {
                    try {
                        if (qo.f27153d == null) {
                            throw null;
                        }
                        AbstractC3832r8 abstractC3832r8 = qo.f27154e;
                        qo.f27154e = ko.f25960b;
                        Iterator it = qo.f27152c.values().iterator();
                        while (it.hasNext()) {
                            PO po = (PO) it.next();
                            if (po.a(abstractC3832r8, qo.f27154e) && !po.b(ko)) {
                            }
                            it.remove();
                            if (po.f26921a.equals(qo.f27155f)) {
                                qo.d(po);
                            }
                            if (po.f26925e) {
                                qo.f27153d.p(ko, po.f26921a);
                            }
                        }
                        qo.c(ko);
                    } finally {
                    }
                }
            } else if (a9 == 11) {
                QO qo2 = this.f27993v;
                synchronized (qo2) {
                    try {
                        if (qo2.f27153d == null) {
                            throw null;
                        }
                        Iterator it2 = qo2.f27152c.values().iterator();
                        while (it2.hasNext()) {
                            PO po2 = (PO) it2.next();
                            if (po2.b(ko)) {
                                it2.remove();
                                if (po2.f26921a.equals(qo2.f27155f)) {
                                    qo2.d(po2);
                                }
                                if (po2.f26925e) {
                                    qo2.f27153d.p(ko, po2.f26921a);
                                }
                            }
                        }
                        qo2.c(ko);
                    } finally {
                    }
                }
            } else {
                this.f27993v.b(ko);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c4164xG.Q(0)) {
            KO ko2 = (KO) ((SparseArray) c4164xG.f35133v).get(0);
            ko2.getClass();
            if (this.f27976D != null) {
                g(ko2.f25960b, ko2.f25962d);
            }
        }
        if (c4164xG.Q(2) && this.f27976D != null) {
            UB ub = io.v1().f35187a;
            int size = ub.size();
            int i15 = 0;
            loop3: while (true) {
                if (i15 >= size) {
                    ro = null;
                    break;
                }
                C3207fb c3207fb = (C3207fb) ub.get(i15);
                while (true) {
                    i11 = i15 + 1;
                    if (i13 < c3207fb.f30725a) {
                        if (c3207fb.f30729e[i13] && (ro = c3207fb.f30726b.f24000d[i13].f27780s) != null) {
                            break loop3;
                        } else {
                            i13++;
                        }
                    }
                }
                i15 = i11;
                i13 = 0;
            }
            if (ro != null) {
                PlaybackMetrics.Builder builder = this.f27976D;
                String str = AbstractC3548lu.f32613a;
                PlaybackMetrics.Builder b9 = SO.b(builder);
                int i16 = 0;
                while (true) {
                    if (i16 >= ro.f27360w) {
                        i10 = 1;
                        break;
                    }
                    UUID uuid = ro.f27357n[i16].f26539u;
                    if (uuid.equals(AbstractC3389ix.f32031d)) {
                        i10 = 3;
                        break;
                    } else if (uuid.equals(AbstractC3389ix.f32032e)) {
                        i10 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC3389ix.f32030c)) {
                            i10 = 6;
                            break;
                        }
                        i16++;
                    }
                }
                b9.setDrmType(i10);
            }
        }
        if (c4164xG.Q(1011)) {
            this.f27989R++;
        }
        RN rn = this.f27979G;
        if (rn != null) {
            Context context = this.f27991n;
            int i17 = rn.f27350n;
            if (i17 == 1001) {
                i9 = 20;
            } else {
                boolean z9 = rn.f27352v == 1;
                int i18 = rn.f27356z;
                Throwable cause = rn.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof C3309hM) {
                        errorCode = ((C3309hM) cause).f31230v;
                        i9 = 5;
                    } else if (cause instanceof W4) {
                        errorCode = 0;
                        i9 = 11;
                    } else {
                        boolean z10 = cause instanceof AL;
                        if (z10 || (cause instanceof EN)) {
                            if (C3976tr.a(context).b() == 1) {
                                i9 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    errorCode = 0;
                                    i9 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    errorCode = 0;
                                    i9 = 7;
                                } else if (z10 && ((AL) cause).f23863u == 1) {
                                    errorCode = 0;
                                    i9 = 4;
                                } else {
                                    errorCode = 0;
                                    i9 = 8;
                                }
                            }
                        } else if (i17 == 1002) {
                            i9 = 21;
                        } else if (cause instanceof LP) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = AbstractC3548lu.k(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (AbstractC3548lu.g(errorCode)) {
                                    case 6002:
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
                                errorCode = 0;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i9 = 29;
                            } else {
                                if (!(cause3 instanceof PP)) {
                                    i9 = 30;
                                }
                                errorCode = 0;
                                i9 = 23;
                            }
                            i9 = 24;
                        } else if ((cause instanceof MK) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            i9 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                        } else {
                            i9 = 9;
                        }
                    }
                    timeSinceCreatedMillis3 = TO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f27995x);
                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i9);
                    subErrorCode = errorCode2.setSubErrorCode(errorCode);
                    exception = subErrorCode.setException(rn);
                    build3 = exception.build();
                    this.f27992u.execute(new RunnableC3329hp(i12, this, build3));
                    this.f27990S = true;
                    this.f27979G = null;
                } else {
                    if (z9) {
                        i9 = 35;
                        if (i18 != 0) {
                        }
                    }
                    if (z9 && i18 == 3) {
                        i9 = 15;
                    } else {
                        if (!z9 || i18 != 2) {
                            if (cause instanceof C3040cQ) {
                                errorCode = AbstractC3548lu.k(((C3040cQ) cause).f29708v);
                                i9 = 13;
                            } else {
                                i9 = 14;
                                if (cause instanceof C2931aQ) {
                                    errorCode = ((C2931aQ) cause).f29206n;
                                } else if (!(cause instanceof OutOfMemoryError)) {
                                    if (cause instanceof C3634nP) {
                                        i9 = 17;
                                    } else if (cause instanceof C3688oP) {
                                        errorCode = ((C3688oP) cause).f33140n;
                                        i9 = 18;
                                    } else if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        switch (AbstractC3548lu.g(errorCode)) {
                                            case 6002:
                                                i9 = 24;
                                                break;
                                        }
                                    } else {
                                        i9 = 22;
                                    }
                                }
                            }
                            timeSinceCreatedMillis3 = TO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f27995x);
                            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i9);
                            subErrorCode = errorCode2.setSubErrorCode(errorCode);
                            exception = subErrorCode.setException(rn);
                            build3 = exception.build();
                            this.f27992u.execute(new RunnableC3329hp(i12, this, build3));
                            this.f27990S = true;
                            this.f27979G = null;
                        }
                        errorCode = 0;
                        i9 = 23;
                        timeSinceCreatedMillis3 = TO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f27995x);
                        errorCode2 = timeSinceCreatedMillis3.setErrorCode(i9);
                        subErrorCode = errorCode2.setSubErrorCode(errorCode);
                        exception = subErrorCode.setException(rn);
                        build3 = exception.build();
                        this.f27992u.execute(new RunnableC3329hp(i12, this, build3));
                        this.f27990S = true;
                        this.f27979G = null;
                    }
                }
            }
            errorCode = 0;
            timeSinceCreatedMillis3 = TO.k().setTimeSinceCreatedMillis(elapsedRealtime - this.f27995x);
            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i9);
            subErrorCode = errorCode2.setSubErrorCode(errorCode);
            exception = subErrorCode.setException(rn);
            build3 = exception.build();
            this.f27992u.execute(new RunnableC3329hp(i12, this, build3));
            this.f27990S = true;
            this.f27979G = null;
        }
        if (c4164xG.Q(2)) {
            C4176xb v12 = io.v1();
            boolean a10 = v12.a(2);
            boolean a11 = v12.a(1);
            boolean a12 = v12.a(3);
            if (a10 || a11) {
                z8 = a12;
            } else if (a12) {
                z8 = true;
            }
            if (a10) {
                tp = null;
            } else {
                tp = null;
                if (!Objects.equals(this.f27982K, null)) {
                    int i19 = this.f27982K == null ? 1 : 0;
                    this.f27982K = null;
                    e(1, elapsedRealtime, null, i19);
                }
            }
            if (!a11 && !Objects.equals(this.f27983L, tp)) {
                int i20 = this.f27983L == null ? 1 : 0;
                this.f27983L = tp;
                e(0, elapsedRealtime, tp, i20);
            }
            if (!z8 && !Objects.equals(this.f27984M, tp)) {
                int i21 = this.f27984M == null ? 1 : 0;
                this.f27984M = tp;
                e(2, elapsedRealtime, tp, i21);
            }
            r82 = tp;
            if (r(this.f27980H)) {
                TP tp2 = (TP) this.f27980H.f35132u;
                if (tp2.f27784w != -1) {
                    if (!Objects.equals(this.f27982K, tp2)) {
                        int i22 = this.f27982K == null ? 1 : 0;
                        this.f27982K = tp2;
                        e(1, elapsedRealtime, tp2, i22);
                    }
                    this.f27980H = r82;
                }
            }
            if (r(this.f27981I)) {
                TP tp3 = (TP) this.f27981I.f35132u;
                if (!Objects.equals(this.f27983L, tp3)) {
                    int i23 = this.f27983L == null ? 1 : 0;
                    this.f27983L = tp3;
                    e(0, elapsedRealtime, tp3, i23);
                }
                this.f27981I = r82;
            }
            if (r(this.J)) {
                TP tp4 = (TP) this.J.f35132u;
                if (!Objects.equals(this.f27984M, tp4)) {
                    int i24 = this.f27984M == null ? 1 : 0;
                    this.f27984M = tp4;
                    e(2, elapsedRealtime, tp4, i24);
                }
                this.J = r82;
            }
            switch (C3976tr.a(this.f27991n).b()) {
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
            if (i != this.f27978F) {
                this.f27978F = i;
                networkType = TO.h().setNetworkType(i);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f27995x);
                build2 = timeSinceCreatedMillis2.build();
                this.f27992u.execute(new RunnableC3329hp(23, this, build2));
            }
            if (io.m1() != 2) {
                this.f27985N = false;
            }
            io.f25557w.b();
            c3093dO = io.f25556v;
            c3093dO.P0();
            if (c3093dO.f30014G0.f35535f != null) {
                this.f27986O = false;
            } else if (c4164xG.Q(10)) {
                this.f27986O = true;
            }
            int m12 = io.m1();
            if (!this.f27985N) {
                i4 = 5;
            } else if (this.f27986O) {
                i4 = 13;
            } else if (m12 == 4) {
                i4 = 11;
            } else {
                i4 = 12;
                if (m12 == 2) {
                    int i25 = this.f27977E;
                    i4 = (i25 == 0 || i25 == 2 || i25 == 12) ? 2 : !io.p1() ? 7 : io.n1() != 0 ? 10 : 6;
                } else if (m12 == 3) {
                    i4 = !io.p1() ? 4 : io.n1() != 0 ? 9 : 3;
                } else if (m12 != 1 || this.f27977E == 0) {
                    i4 = this.f27977E;
                }
            }
            if (this.f27977E != i4) {
                this.f27977E = i4;
                this.f27990S = true;
                state = TO.q().setState(this.f27977E);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f27995x);
                build = timeSinceCreatedMillis.build();
                this.f27992u.execute(new RunnableC3329hp(24, this, build));
            }
            if (c4164xG.Q(1028)) {
                return;
            }
            QO qo3 = this.f27993v;
            KO ko3 = (KO) ((SparseArray) c4164xG.f35133v).get(1028);
            ko3.getClass();
            synchronized (qo3) {
                try {
                    String str2 = qo3.f27155f;
                    if (str2 != null) {
                        PO po3 = (PO) qo3.f27152c.get(str2);
                        if (po3 == null) {
                            throw r82;
                        }
                        qo3.d(po3);
                    }
                    Iterator it3 = qo3.f27152c.values().iterator();
                    while (it3.hasNext()) {
                        PO po4 = (PO) it3.next();
                        it3.remove();
                        if (po4.f26925e && (uo = qo3.f27153d) != null) {
                            uo.p(ko3, po4.f26921a);
                        }
                    }
                } finally {
                }
            }
            return;
        }
        r82 = 0;
        if (r(this.f27980H)) {
        }
        if (r(this.f27981I)) {
        }
        if (r(this.J)) {
        }
        switch (C3976tr.a(this.f27991n).b()) {
        }
        if (i != this.f27978F) {
        }
        if (io.m1() != 2) {
        }
        io.f25557w.b();
        c3093dO = io.f25556v;
        c3093dO.P0();
        if (c3093dO.f30014G0.f35535f != null) {
        }
        int m122 = io.m1();
        if (!this.f27985N) {
        }
        if (this.f27977E != i4) {
        }
        if (c4164xG.Q(1028)) {
        }
    }

    public final void e(int i, long j9, TP tp, int i4) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = TO.r(i).setTimeSinceCreatedMillis(j9 - this.f27995x);
        if (tp != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i4 != 1 ? 1 : 2);
            String str = tp.f27775n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = tp.f27776o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = tp.f27772k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = tp.f27771j;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = tp.f27783v;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = tp.f27784w;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = tp.f27754G;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = tp.f27756I;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = tp.f27766d;
            if (str4 != null) {
                String str5 = AbstractC3548lu.f32613a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f6 = tp.f27787z;
            if (f6 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f6);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f27990S = true;
        build = timeSinceCreatedMillis.build();
        this.f27992u.execute(new RunnableC3329hp(25, this, build));
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void f(KO ko, C4228yQ c4228yQ) {
        BQ bq = ko.f25962d;
        if (bq == null) {
            return;
        }
        TP tp = c4228yQ.f35346b;
        tp.getClass();
        C4164xG c4164xG = new C4164xG(13, tp, this.f27993v.a(ko.f25960b, bq));
        int i = c4228yQ.f35345a;
        if (i != 0) {
            if (i == 1) {
                this.f27981I = c4164xG;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.J = c4164xG;
                return;
            }
        }
        this.f27980H = c4164xG;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void g(AbstractC3832r8 abstractC3832r8, BQ bq) {
        PlaybackMetrics.Builder builder = this.f27976D;
        if (bq == null) {
            return;
        }
        int e6 = abstractC3832r8.e(bq.f24043a);
        char c4 = 65535;
        if (e6 != -1) {
            L7 l72 = this.f27997z;
            int i = 0;
            abstractC3832r8.d(e6, l72, false);
            int i4 = l72.f26108c;
            Y7 y72 = this.f27996y;
            abstractC3832r8.b(i4, y72, 0L);
            N0 n02 = y72.f28795b.f30939b;
            if (n02 != null) {
                String str = AbstractC3548lu.f32613a;
                Uri uri = n02.f26409a;
                String scheme = uri.getScheme();
                if (scheme == null || !(AbstractC3035cL.D("rtsp", scheme) || AbstractC3035cL.D("rtspt", scheme))) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (lastIndexOf >= 0) {
                            String f6 = AbstractC3035cL.f(lastPathSegment.substring(lastIndexOf + 1));
                            switch (f6.hashCode()) {
                                case 104579:
                                    if (f6.equals("ism")) {
                                        c4 = 2;
                                        break;
                                    }
                                    break;
                                case 108321:
                                    if (f6.equals("mpd")) {
                                        c4 = 0;
                                        break;
                                    }
                                    break;
                                case 3242057:
                                    if (f6.equals("isml")) {
                                        c4 = 3;
                                        break;
                                    }
                                    break;
                                case 3299913:
                                    if (f6.equals("m3u8")) {
                                        c4 = 1;
                                        break;
                                    }
                                    break;
                            }
                            int i9 = c4 != 0 ? c4 != 1 ? (c4 == 2 || c4 == 3) ? 1 : 4 : 2 : 0;
                            if (i9 != 4) {
                                i = i9;
                            }
                        }
                        String path = uri.getPath();
                        path.getClass();
                        Matcher matcher = AbstractC3548lu.f32615c.matcher(path);
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
            long j9 = y72.f28802j;
            if (j9 != com.anythink.basead.exoplayer.b.f6539b && !y72.i && !y72.f28800g && !y72.b()) {
                builder.setMediaDurationMillis(AbstractC3548lu.t(j9));
            }
            builder.setPlaybackType(true != y72.b() ? 1 : 2);
            this.f27990S = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void h(C3100dd c3100dd) {
        C4164xG c4164xG = this.f27980H;
        if (c4164xG != null) {
            TP tp = (TP) c4164xG.f35132u;
            if (tp.f27784w == -1) {
                C4065vP c4065vP = new C4065vP(tp);
                c4065vP.f34792u = c3100dd.f30071a;
                c4065vP.f34793v = c3100dd.f30072b;
                this.f27980H = new C4164xG(13, new TP(c4065vP), (String) c4164xG.f35133v);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void i(RN rn) {
        this.f27979G = rn;
    }

    public final void k() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f27976D;
        if (builder != null && this.f27990S) {
            builder.setAudioUnderrunCount(this.f27989R);
            this.f27976D.setVideoFramesDropped(this.f27987P);
            this.f27976D.setVideoFramesPlayed(this.f27988Q);
            Long l9 = (Long) this.f27973A.get(this.f27975C);
            this.f27976D.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f27974B.get(this.f27975C);
            this.f27976D.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f27976D.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            build = this.f27976D.build();
            this.f27992u.execute(new RunnableC3329hp(26, this, build));
        }
        this.f27976D = null;
        this.f27975C = null;
        this.f27989R = 0;
        this.f27987P = 0;
        this.f27988Q = 0;
        this.f27982K = null;
        this.f27983L = null;
        this.f27984M = null;
        this.f27990S = false;
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void m(KO ko, int i, long j9) {
        BQ bq = ko.f25962d;
        if (bq != null) {
            String a9 = this.f27993v.a(ko.f25960b, bq);
            HashMap hashMap = this.f27974B;
            Long l9 = (Long) hashMap.get(a9);
            HashMap hashMap2 = this.f27973A;
            Long l10 = (Long) hashMap2.get(a9);
            hashMap.put(a9, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j9));
            hashMap2.put(a9, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void n(LN ln) {
        this.f27987P += ln.f26153g;
        this.f27988Q += ln.f26151e;
    }

    public final void p(KO ko, String str) {
        BQ bq = ko.f25962d;
        if ((bq == null || !bq.b()) && str.equals(this.f27975C)) {
            k();
        }
        this.f27973A.remove(str);
        this.f27974B.remove(str);
    }

    public final boolean r(C4164xG c4164xG) {
        String str;
        if (c4164xG == null) {
            return false;
        }
        QO qo = this.f27993v;
        String str2 = (String) c4164xG.f35133v;
        synchronized (qo) {
            str = qo.f27155f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void o(IOException iOException) {
    }
}
