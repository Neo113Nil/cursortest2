package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
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

/* loaded from: classes.dex */
public final class joh implements d80 {
    public int A;
    public boolean B;
    public final Context a;
    public final kp7 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public hzk o;
    public x0 p;
    public x0 q;
    public x0 r;
    public dsc s;
    public dsc t;
    public dsc u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = sj2.u();
    public final ris f = new ris();
    public final ois g = new ois();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public joh(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        kp7 kp7Var = new kp7();
        this.c = kp7Var;
        kp7Var.d = this;
    }

    public static joh N(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new joh(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // defpackage.d80
    public final void A(c80 c80Var, ig7 ig7Var) {
        this.y += ig7Var.g;
        this.z += ig7Var.e;
    }

    @Override // defpackage.d80
    public final void B(int i, c80 c80Var, g8l g8lVar, g8l g8lVar2) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    public final boolean G(x0 x0Var) {
        String str;
        if (x0Var == null) {
            return false;
        }
        String str2 = (String) x0Var.d;
        kp7 kp7Var = this.c;
        synchronized (kp7Var) {
            str = kp7Var.f;
        }
        return str2.equals(str);
    }

    public final void S() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new juc(21, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    @Override // defpackage.d80
    public final void Y(int i, long j, c80 c80Var) {
        uvh uvhVar = c80Var.d;
        if (uvhVar != null) {
            String c = this.c.c(c80Var.b, uvhVar);
            HashMap hashMap = this.i;
            Long l = (Long) hashMap.get(c);
            HashMap hashMap2 = this.h;
            Long l2 = (Long) hashMap2.get(c);
            hashMap.put(c, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(c, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.d80
    public final void c0(c80 c80Var, boh bohVar) {
        uvh uvhVar = c80Var.d;
        if (uvhVar == null) {
            return;
        }
        dsc dscVar = bohVar.c;
        dscVar.getClass();
        int i = bohVar.d;
        sis sisVar = c80Var.b;
        uvhVar.getClass();
        x0 x0Var = new x0(dscVar, i, this.c.c(sisVar, uvhVar), 17);
        int i2 = bohVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = x0Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = x0Var;
                return;
            }
        }
        this.p = x0Var;
    }

    public final LogSessionId f0() {
        return this.d.getSessionId();
    }

    public final void g0(sis sisVar, uvh uvhVar) {
        int b;
        PlaybackMetrics.Builder builder = this.k;
        if (uvhVar == null || (b = sisVar.b(uvhVar.a)) == -1) {
            return;
        }
        ois oisVar = this.g;
        int i = 0;
        sisVar.f(b, oisVar, false);
        int i2 = oisVar.c;
        ris risVar = this.f;
        sisVar.n(i2, risVar);
        gnh gnhVar = risVar.c.b;
        if (gnhVar != null) {
            int R = dvt.R(gnhVar.a, gnhVar.b);
            i = R != 0 ? R != 1 ? R != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (risVar.m != -9223372036854775807L && !risVar.k && !risVar.i && !risVar.a()) {
            builder.setMediaDurationMillis(dvt.m0(risVar.m));
        }
        builder.setPlaybackType(risVar.a() ? 2 : 1);
        this.B = true;
    }

    @Override // defpackage.d80
    public final void j(c80 c80Var, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        this.w = bohVar.a;
    }

    @Override // defpackage.d80
    public final void p0(c80 c80Var, hzk hzkVar) {
        this.o = hzkVar;
    }

    public final void q0(c80 c80Var, String str) {
        uvh uvhVar = c80Var.d;
        if (uvhVar == null || !uvhVar.b()) {
            S();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.1");
            g0(c80Var.b, uvhVar);
        }
    }

    public final void r0(c80 c80Var, String str) {
        uvh uvhVar = c80Var.d;
        if ((uvhVar == null || !uvhVar.b()) && str.equals(this.j)) {
            S();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    @Override // defpackage.d80
    public final void s(c80 c80Var, tcu tcuVar) {
        x0 x0Var = this.p;
        if (x0Var != null) {
            dsc dscVar = (dsc) x0Var.c;
            if (dscVar.v == -1) {
                bsc a = dscVar.a();
                a.t = tcuVar.a;
                a.u = tcuVar.b;
                this.p = new x0(new dsc(a), x0Var.b, (String) x0Var.d, 17);
            }
        }
    }

    public final void s0(int i, long j, dsc dscVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (dscVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = dscVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = dscVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = dscVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = dscVar.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = dscVar.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = dscVar.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = dscVar.D;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = dscVar.E;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = dscVar.d;
            if (str4 != null) {
                int i9 = dvt.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = dscVar.w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new juc(18, this, timeSinceCreatedMillis.build()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0668 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0548  */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48, types: [x0] */
    /* JADX WARN: Type inference failed for: r9v53 */
    @Override // defpackage.d80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(i8l i8lVar, nnk nnkVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        c9n c9nVar;
        c9n c9nVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ?? r9;
        int i12;
        int i13;
        boolean z2;
        joh johVar;
        dsc dscVar;
        pqa pqaVar;
        int i14;
        if (((xgc) nnkVar.a).a.size() == 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            boolean z3 = true;
            if (i15 >= ((xgc) nnkVar.a).a.size()) {
                break;
            }
            int b = ((xgc) nnkVar.a).b(i15);
            c80 c80Var = (c80) ((SparseArray) nnkVar.b).get(b);
            c80Var.getClass();
            kp7 kp7Var = this.c;
            if (b == 0) {
                synchronized (kp7Var) {
                    try {
                        kp7Var.d.getClass();
                        sis sisVar = kp7Var.e;
                        kp7Var.e = c80Var.b;
                        Iterator it = kp7Var.c.values().iterator();
                        while (it.hasNext()) {
                            jp7 jp7Var = (jp7) it.next();
                            if (jp7Var.b(sisVar, kp7Var.e) && !jp7Var.a(c80Var)) {
                            }
                            it.remove();
                            if (jp7Var.e) {
                                if (jp7Var.a.equals(kp7Var.f)) {
                                    kp7Var.a(jp7Var);
                                }
                                kp7Var.d.r0(c80Var, jp7Var.a);
                            }
                        }
                        kp7Var.d(c80Var);
                    } finally {
                    }
                }
            } else if (b == 11) {
                int i16 = this.l;
                synchronized (kp7Var) {
                    try {
                        kp7Var.d.getClass();
                        if (i16 != 0) {
                            z3 = false;
                        }
                        Iterator it2 = kp7Var.c.values().iterator();
                        while (it2.hasNext()) {
                            jp7 jp7Var2 = (jp7) it2.next();
                            if (jp7Var2.a(c80Var)) {
                                it2.remove();
                                if (jp7Var2.e) {
                                    boolean equals = jp7Var2.a.equals(kp7Var.f);
                                    if (z3 && equals) {
                                        boolean z4 = jp7Var2.f;
                                    }
                                    if (equals) {
                                        kp7Var.a(jp7Var2);
                                    }
                                    kp7Var.d.r0(c80Var, jp7Var2.a);
                                }
                            }
                        }
                        kp7Var.d(c80Var);
                    } finally {
                    }
                }
            } else {
                kp7Var.e(c80Var);
            }
            i15++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (nnkVar.h(0)) {
            c80 c80Var2 = (c80) ((SparseArray) nnkVar.b).get(0);
            c80Var2.getClass();
            if (this.k != null) {
                g0(c80Var2.b, c80Var2.d);
            }
        }
        if (nnkVar.h(2) && this.k != null) {
            ude listIterator = i8lVar.O().a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    pqaVar = null;
                    break;
                }
                d3t d3tVar = (d3t) listIterator.next();
                for (int i17 = 0; i17 < d3tVar.a; i17++) {
                    if (d3tVar.e[i17] && (pqaVar = d3tVar.a(i17).r) != null) {
                        break loop3;
                    }
                }
            }
            if (pqaVar != null) {
                PlaybackMetrics.Builder builder = this.k;
                int i18 = dvt.a;
                int i19 = 0;
                while (true) {
                    if (i19 >= pqaVar.d) {
                        i14 = 1;
                        break;
                    }
                    UUID uuid = pqaVar.a[i19].b;
                    if (uuid.equals(un3.d)) {
                        i14 = 3;
                        break;
                    } else if (uuid.equals(un3.e)) {
                        i14 = 2;
                        break;
                    } else {
                        if (uuid.equals(un3.c)) {
                            i14 = 6;
                            break;
                        }
                        i19++;
                    }
                }
                builder.setDrmType(i14);
            }
        }
        if (nnkVar.h(1011)) {
            this.A++;
        }
        hzk hzkVar = this.o;
        int i20 = 7;
        if (hzkVar == null) {
            i9 = 1;
            i10 = 2;
            i5 = 13;
            i2 = 8;
            i3 = 6;
            i4 = 9;
        } else {
            int i21 = hzkVar.a;
            Context context = this.a;
            boolean z5 = this.w == 4;
            if (i21 == 1001) {
                c9nVar = new c9n(20, 0, 7);
            } else {
                if (hzkVar instanceof pqb) {
                    pqb pqbVar = (pqb) hzkVar;
                    z = pqbVar.j == 1;
                    i = pqbVar.n;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = hzkVar.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i22 = 28;
                    i2 = 8;
                    i3 = 6;
                    i4 = 9;
                    if (z && (i == 0 || i == 1)) {
                        c9nVar = new c9n(35, 0, 7);
                    } else if (z && i == 3) {
                        c9nVar = new c9n(15, 0, 7);
                    } else if (z && i == 2) {
                        c9nVar = new c9n(23, 0, 7);
                    } else {
                        if (cause instanceof oih) {
                            i5 = 13;
                            c9nVar2 = new c9n(13, dvt.E(((oih) cause).d), 7);
                        } else {
                            i5 = 13;
                            if (cause instanceof lih) {
                                c9nVar2 = new c9n(14, ((lih) cause).c, 7);
                            } else {
                                if (cause instanceof OutOfMemoryError) {
                                    c9nVar = new c9n(14, 0, 7);
                                } else if (cause instanceof ky1) {
                                    c9nVar2 = new c9n(17, ((ky1) cause).a, 7);
                                } else if (cause instanceof ny1) {
                                    c9nVar2 = new c9n(18, ((ny1) cause).a, 7);
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (dvt.D(errorCode)) {
                                        case 6002:
                                            i22 = 24;
                                            break;
                                        case 6003:
                                            break;
                                        case 6004:
                                            i22 = 25;
                                            break;
                                        case 6005:
                                            i22 = 26;
                                            break;
                                        default:
                                            i22 = 27;
                                            break;
                                    }
                                    c9nVar2 = new c9n(i22, errorCode, 7);
                                } else {
                                    c9nVar = new c9n(22, 0, 7);
                                }
                                this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
                                i9 = 1;
                                this.B = true;
                                this.o = null;
                                i10 = 2;
                            }
                        }
                        c9nVar = c9nVar2;
                        this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
                        i9 = 1;
                        this.B = true;
                        this.o = null;
                        i10 = 2;
                    }
                    i5 = 13;
                    this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
                    i9 = 1;
                    this.B = true;
                    this.o = null;
                    i10 = 2;
                } else if (cause instanceof i6e) {
                    c9nVar = new c9n(5, ((i6e) cause).d, 7);
                } else {
                    if ((cause instanceof h6e) || (cause instanceof r7k)) {
                        i4 = 9;
                        i2 = 8;
                        i3 = 6;
                        c9nVar = new c9n(z5 ? 10 : 11, 0, 7);
                    } else {
                        boolean z6 = cause instanceof g6e;
                        if (z6 || (cause instanceof cft)) {
                            i6 = 9;
                            if (j2j.a(context).b() == 1) {
                                c9nVar = new c9n(3, 0, 7);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i7 = 6;
                                    c9nVar = new c9n(6, 0, 7);
                                } else {
                                    i7 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        c9nVar = new c9n(7, 0, 7);
                                    } else if (z6 && ((g6e) cause).c == 1) {
                                        c9nVar = new c9n(4, 0, 7);
                                    } else {
                                        c9nVar = new c9n(8, 0, 7);
                                        i4 = 9;
                                        i2 = 8;
                                        i3 = 6;
                                    }
                                }
                                i4 = 9;
                                i3 = i7;
                                i5 = 13;
                                i2 = 8;
                                this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
                                i9 = 1;
                                this.B = true;
                                this.o = null;
                                i10 = 2;
                            }
                        } else if (i21 == 1002) {
                            c9nVar = new c9n(21, 0, 7);
                        } else if (cause instanceof yqa) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int E = dvt.E(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (dvt.D(E)) {
                                    case 6002:
                                        i8 = 24;
                                        break;
                                    case 6003:
                                        i8 = 28;
                                        break;
                                    case 6004:
                                        i8 = 25;
                                        break;
                                    case 6005:
                                        i8 = 26;
                                        break;
                                    default:
                                        i8 = 27;
                                        break;
                                }
                                c9nVar = new c9n(i8, E, 7);
                            } else {
                                c9nVar = (dvt.a < 23 || !(cause3 instanceof MediaDrmResetException)) ? cause3 instanceof NotProvisionedException ? new c9n(24, 0, 7) : cause3 instanceof DeniedByServerException ? new c9n(29, 0, 7) : cause3 instanceof kmt ? new c9n(23, 0, 7) : cause3 instanceof rl7 ? new c9n(28, 0, 7) : new c9n(30, 0, 7) : new c9n(27, 0, 7);
                            }
                        } else if ((cause instanceof m9c) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            c9nVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new c9n(32, 0, 7) : new c9n(31, 0, 7);
                        } else {
                            i6 = 9;
                            c9nVar = new c9n(9, 0, 7);
                        }
                        i4 = i6;
                        i5 = 13;
                        i2 = 8;
                        i3 = 6;
                        this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
                        i9 = 1;
                        this.B = true;
                        this.o = null;
                        i10 = 2;
                    }
                    i5 = 13;
                    this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
                    i9 = 1;
                    this.B = true;
                    this.o = null;
                    i10 = 2;
                }
            }
            i5 = 13;
            i2 = 8;
            i3 = 6;
            i4 = 9;
            this.b.execute(new juc(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(c9nVar.b).setSubErrorCode(c9nVar.c).setException(hzkVar).build()));
            i9 = 1;
            this.B = true;
            this.o = null;
            i10 = 2;
        }
        if (nnkVar.h(i10)) {
            e3t O = i8lVar.O();
            boolean a = O.a(i10);
            boolean a2 = O.a(i9);
            boolean a3 = O.a(3);
            if (a || a2 || a3) {
                if (a) {
                    i11 = 5;
                    dscVar = null;
                } else if (Objects.equals(this.s, null)) {
                    i11 = 5;
                    dscVar = null;
                } else {
                    int i23 = this.s == null ? 1 : 0;
                    this.s = null;
                    i11 = 5;
                    dscVar = null;
                    s0(1, elapsedRealtime, null, i23);
                }
                if (!a2 && !Objects.equals(this.t, dscVar)) {
                    int i24 = this.t == null ? 1 : 0;
                    this.t = dscVar;
                    s0(0, elapsedRealtime, dscVar, i24);
                }
                if (!a3 && !Objects.equals(this.u, dscVar)) {
                    int i25 = this.u == null ? 1 : 0;
                    this.u = dscVar;
                    s0(2, elapsedRealtime, dscVar, i25);
                }
                r9 = dscVar;
                if (G(this.p)) {
                    x0 x0Var = this.p;
                    dsc dscVar2 = (dsc) x0Var.c;
                    if (dscVar2.v != -1) {
                        int i26 = x0Var.b;
                        if (!Objects.equals(this.s, dscVar2)) {
                            int i27 = (this.s == null && i26 == 0) ? 1 : i26;
                            this.s = dscVar2;
                            s0(1, elapsedRealtime, dscVar2, i27);
                        }
                        this.p = r9;
                    }
                }
                if (G(this.q)) {
                    x0 x0Var2 = this.q;
                    dsc dscVar3 = (dsc) x0Var2.c;
                    int i28 = x0Var2.b;
                    if (!Objects.equals(this.t, dscVar3)) {
                        int i29 = (this.t == null && i28 == 0) ? 1 : i28;
                        this.t = dscVar3;
                        s0(0, elapsedRealtime, dscVar3, i29);
                    }
                    this.q = r9;
                }
                if (G(this.r)) {
                    x0 x0Var3 = this.r;
                    dsc dscVar4 = (dsc) x0Var3.c;
                    int i30 = x0Var3.b;
                    if (!Objects.equals(this.u, dscVar4)) {
                        int i31 = (this.u == null && i30 == 0) ? 1 : i30;
                        this.u = dscVar4;
                        s0(2, elapsedRealtime, dscVar4, i31);
                    }
                    this.r = r9;
                }
                switch (j2j.a(this.a).b()) {
                    case 0:
                        i12 = 0;
                        break;
                    case 1:
                        i12 = i4;
                        break;
                    case 2:
                        i12 = 2;
                        break;
                    case 3:
                        i12 = 4;
                        break;
                    case 4:
                        i12 = i11;
                        break;
                    case 5:
                        i12 = i3;
                        break;
                    case 6:
                    case 8:
                    default:
                        i12 = 1;
                        break;
                    case 7:
                        i12 = 3;
                        break;
                    case 9:
                        i12 = i2;
                        break;
                    case 10:
                        i12 = 7;
                        break;
                }
                if (i12 != this.n) {
                    this.n = i12;
                    this.b.execute(new juc(19, this, new NetworkEvent.Builder().setNetworkType(i12).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                }
                if (i8lVar.c() != 2) {
                    this.v = false;
                }
                if (i8lVar.k() != null) {
                    this.x = false;
                    i13 = 10;
                } else {
                    i13 = 10;
                    if (nnkVar.h(10)) {
                        this.x = true;
                    }
                }
                int c = i8lVar.c();
                if (!this.v) {
                    if (this.x) {
                        i20 = i5;
                    } else {
                        i11 = 4;
                        if (c == 4) {
                            i20 = 11;
                        } else if (c == 2) {
                            int i32 = this.m;
                            if (i32 == 0 || i32 == 2 || i32 == 12) {
                                i20 = 2;
                            } else if (i8lVar.g0()) {
                                if (i8lVar.U() == 0) {
                                    i20 = i3;
                                }
                                i20 = i13;
                            }
                        } else {
                            i13 = 3;
                            if (c != 3) {
                                z2 = true;
                                i20 = (c != 1 || this.m == 0) ? this.m : 12;
                                if (this.m != i20) {
                                    this.m = i20;
                                    this.B = z2;
                                    this.b.execute(new juc(22, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                                }
                                if (nnkVar.h(1028)) {
                                    return;
                                }
                                kp7 kp7Var2 = this.c;
                                c80 c80Var3 = (c80) ((SparseArray) nnkVar.b).get(1028);
                                c80Var3.getClass();
                                synchronized (kp7Var2) {
                                    try {
                                        String str = kp7Var2.f;
                                        if (str != null) {
                                            jp7 jp7Var3 = (jp7) kp7Var2.c.get(str);
                                            jp7Var3.getClass();
                                            kp7Var2.a(jp7Var3);
                                        }
                                        Iterator it3 = kp7Var2.c.values().iterator();
                                        while (it3.hasNext()) {
                                            jp7 jp7Var4 = (jp7) it3.next();
                                            it3.remove();
                                            if (jp7Var4.e && (johVar = kp7Var2.d) != null) {
                                                johVar.r0(c80Var3, jp7Var4.a);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                return;
                            }
                            if (i8lVar.g0()) {
                                if (i8lVar.U() != 0) {
                                    i20 = i4;
                                }
                                i20 = i13;
                            }
                        }
                    }
                    z2 = true;
                    if (this.m != i20) {
                    }
                    if (nnkVar.h(1028)) {
                    }
                }
                i20 = i11;
                z2 = true;
                if (this.m != i20) {
                }
                if (nnkVar.h(1028)) {
                }
            }
        }
        i11 = 5;
        r9 = 0;
        if (G(this.p)) {
        }
        if (G(this.q)) {
        }
        if (G(this.r)) {
        }
        switch (j2j.a(this.a).b()) {
        }
        if (i12 != this.n) {
        }
        if (i8lVar.c() != 2) {
        }
        if (i8lVar.k() != null) {
        }
        int c2 = i8lVar.c();
        if (!this.v) {
        }
        i20 = i11;
        z2 = true;
        if (this.m != i20) {
        }
        if (nnkVar.h(1028)) {
        }
    }
}
