package defpackage;

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
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.a;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class ue10 implements j42 {
    public int A;
    public boolean B;
    public final Context a;
    public final eih c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public o3 p;
    public o3 q;
    public o3 r;
    public a s;
    public a t;
    public a u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = fh4.d();
    public final z8z0 f = new z8z0();
    public final y8z0 g = new y8z0();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public ue10(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        eih eihVar = new eih();
        this.c = eihVar;
        eihVar.d = this;
    }

    public final boolean a(o3 o3Var) {
        String str;
        if (o3Var == null) {
            return false;
        }
        String str2 = (String) o3Var.c;
        eih eihVar = this.c;
        synchronized (eihVar) {
            str = eihVar.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics build;
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
            build = this.k.build();
            this.b.execute(new p500(14, this, build));
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

    public final void c(a9z0 a9z0Var, sf10 sf10Var) {
        int b;
        PlaybackMetrics.Builder builder = this.k;
        if (sf10Var == null || (b = a9z0Var.b(sf10Var.a)) == -1) {
            return;
        }
        y8z0 y8z0Var = this.g;
        int i = 0;
        a9z0Var.g(b, y8z0Var, false);
        int i2 = y8z0Var.c;
        z8z0 z8z0Var = this.f;
        a9z0Var.o(z8z0Var, i2);
        zd10 zd10Var = z8z0Var.b.b;
        if (zd10Var != null) {
            int O = tw21.O(zd10Var.a, zd10Var.b);
            i = O != 0 ? O != 1 ? O != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (z8z0Var.l != -9223372036854775807L && !z8z0Var.j && !z8z0Var.h && !z8z0Var.b()) {
            builder.setMediaDurationMillis(tw21.l0(z8z0Var.l));
        }
        builder.setPlaybackType(z8z0Var.b() ? 2 : 1);
        this.B = true;
    }

    public final void d(h42 h42Var, String str) {
        sf10 sf10Var = h42Var.d;
        if ((sf10Var == null || !sf10Var.b()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void e(int i, long j, a aVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        timeSinceCreatedMillis = te10.g(i).setTimeSinceCreatedMillis(j - this.e);
        if (aVar != null) {
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
            String str = aVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = aVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = aVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = aVar.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = aVar.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = aVar.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = aVar.D;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = aVar.E;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = aVar.d;
            if (str4 != null) {
                int i9 = tw21.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = aVar.w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        build = timeSinceCreatedMillis.build();
        this.b.execute(new p500(11, this, build));
    }

    @Override // defpackage.j42
    public final void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
        sf10 sf10Var = h42Var.d;
        if (sf10Var != null) {
            String c = this.c.c(h42Var.b, sf10Var);
            HashMap hashMap = this.i;
            Long l = (Long) hashMap.get(c);
            HashMap hashMap2 = this.h;
            Long l2 = (Long) hashMap2.get(c);
            hashMap.put(c, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(c, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.j42
    public final void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
        sf10 sf10Var = h42Var.d;
        if (sf10Var == null) {
            return;
        }
        a aVar = he10Var.c;
        aVar.getClass();
        int i = he10Var.d;
        a9z0 a9z0Var = h42Var.b;
        sf10Var.getClass();
        o3 o3Var = new o3(aVar, i, this.c.c(a9z0Var, sf10Var), 10);
        int i2 = he10Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = o3Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = o3Var;
                return;
            }
        }
        this.p = o3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0649 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x052e  */
    @Override // defpackage.j42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onEvents(zxc0 zxc0Var, i42 i42Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        i6z0 i6z0Var;
        i6z0 i6z0Var2;
        int i5;
        int i6;
        int i7;
        i6z0 i6z0Var3;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i8;
        int i9;
        int i10;
        int i11;
        o3 o3Var;
        int i12;
        int i13;
        int i14;
        boolean z2;
        ue10 ue10Var;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        a aVar;
        DrmInitData drmInitData;
        int i15;
        if (i42Var.a.a.size() == 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            boolean z3 = true;
            if (i16 >= i42Var.a.a.size()) {
                break;
            }
            int a = i42Var.a.a(i16);
            h42 h42Var = (h42) i42Var.b.get(a);
            h42Var.getClass();
            eih eihVar = this.c;
            if (a == 0) {
                synchronized (eihVar) {
                    try {
                        eihVar.d.getClass();
                        a9z0 a9z0Var = eihVar.e;
                        eihVar.e = h42Var.b;
                        Iterator it = eihVar.c.values().iterator();
                        while (it.hasNext()) {
                            dih dihVar = (dih) it.next();
                            if (dihVar.b(a9z0Var, eihVar.e) && !dihVar.a(h42Var)) {
                            }
                            it.remove();
                            if (dihVar.e) {
                                if (dihVar.a.equals(eihVar.f)) {
                                    eihVar.a(dihVar);
                                }
                                eihVar.d.d(h42Var, dihVar.a);
                            }
                        }
                        eihVar.d(h42Var);
                    } finally {
                    }
                }
            } else if (a == 11) {
                int i17 = this.l;
                synchronized (eihVar) {
                    try {
                        eihVar.d.getClass();
                        if (i17 != 0) {
                            z3 = false;
                        }
                        Iterator it2 = eihVar.c.values().iterator();
                        while (it2.hasNext()) {
                            dih dihVar2 = (dih) it2.next();
                            if (dihVar2.a(h42Var)) {
                                it2.remove();
                                if (dihVar2.e) {
                                    boolean equals = dihVar2.a.equals(eihVar.f);
                                    if (z3 && equals) {
                                        boolean z4 = dihVar2.f;
                                    }
                                    if (equals) {
                                        eihVar.a(dihVar2);
                                    }
                                    eihVar.d.d(h42Var, dihVar2.a);
                                }
                            }
                        }
                        eihVar.d(h42Var);
                    } finally {
                    }
                }
            } else {
                eihVar.e(h42Var);
            }
            i16++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i42Var.a(0)) {
            h42 h42Var2 = (h42) i42Var.b.get(0);
            h42Var2.getClass();
            if (this.k != null) {
                c(h42Var2.b, h42Var2.d);
            }
        }
        if (i42Var.a(2) && this.k != null) {
            piv listIterator = zxc0Var.getCurrentTracks().a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                q801 q801Var = (q801) listIterator.next();
                for (int i18 = 0; i18 < q801Var.a; i18++) {
                    if (q801Var.e[i18] && (drmInitData = q801Var.a(i18).r) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder g = se10.g(this.k);
                int i19 = 0;
                while (true) {
                    if (i19 >= drmInitData.schemeDataCount) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.get(i19).uuid;
                    if (uuid.equals(b87.d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(b87.e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(b87.c)) {
                            i15 = 6;
                            break;
                        }
                        i19++;
                    }
                }
                g.setDrmType(i15);
            }
        }
        if (i42Var.a(1011)) {
            this.A++;
        }
        PlaybackException playbackException = this.o;
        if (playbackException == null) {
            i9 = 1;
            i10 = 2;
            i8 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 9;
        } else {
            Context context = this.a;
            boolean z5 = this.w == 4;
            if (playbackException.errorCode == 1001) {
                i6z0Var = new i6z0(20, 0, 6);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z = exoPlaybackException.type == 1;
                    i = exoPlaybackException.rendererFormatSupport;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i20 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                        i6z0Var3 = new i6z0(5, ((HttpDataSource$InvalidResponseCodeException) cause).responseCode, 6);
                    } else {
                        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                            i5 = 8;
                            i6 = 9;
                            i7 = 7;
                            i6z0Var = new i6z0(z5 ? 10 : 11, 0, 6);
                        } else {
                            boolean z6 = cause instanceof HttpDataSource$HttpDataSourceException;
                            if (z6 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                                i6 = 9;
                                if (c260.a(context).b() == 1) {
                                    i6z0Var = new i6z0(3, 0, 6);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i6z0Var = new i6z0(6, 0, 6);
                                    } else {
                                        if (cause2 instanceof SocketTimeoutException) {
                                            i7 = 7;
                                            i6z0Var = new i6z0(7, 0, 6);
                                        } else {
                                            i7 = 7;
                                            if (z6 && ((HttpDataSource$HttpDataSourceException) cause).type == 1) {
                                                i6z0Var = new i6z0(4, 0, 6);
                                            } else {
                                                i5 = 8;
                                                i6z0Var = new i6z0(8, 0, 6);
                                            }
                                        }
                                        i4 = 9;
                                        i3 = i7;
                                        i2 = 8;
                                    }
                                }
                            } else if (playbackException.errorCode == 1002) {
                                i6z0Var = new i6z0(21, 0, 6);
                            } else if (cause instanceof DrmSession$DrmSessionException) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int B = tw21.B(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (tw21.A(B)) {
                                        case 6002:
                                            i20 = 24;
                                            break;
                                        case 6003:
                                            i20 = 28;
                                            break;
                                        case 6004:
                                            i20 = 25;
                                            break;
                                        case 6005:
                                            i20 = 26;
                                            break;
                                    }
                                    i6z0Var3 = new i6z0(i20, B, 6);
                                } else {
                                    i6z0Var = (tw21.a < 23 || !(cause3 instanceof MediaDrmResetException)) ? cause3 instanceof NotProvisionedException ? new i6z0(24, 0, 6) : cause3 instanceof DeniedByServerException ? new i6z0(29, 0, 6) : cause3 instanceof UnsupportedDrmException ? new i6z0(23, 0, 6) : cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new i6z0(28, 0, 6) : new i6z0(30, 0, 6) : new i6z0(27, 0, 6);
                                }
                            } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                i6z0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new i6z0(32, 0, 6) : new i6z0(31, 0, 6);
                            } else {
                                i6 = 9;
                                i6z0Var = new i6z0(9, 0, 6);
                            }
                            i4 = i6;
                            i2 = 8;
                            i3 = 7;
                        }
                        i2 = i5;
                        i4 = i6;
                        i3 = i7;
                    }
                    i6z0Var = i6z0Var3;
                } else {
                    i2 = 8;
                    i3 = 7;
                    i4 = 9;
                    if (z && (i == 0 || i == 1)) {
                        i6z0Var = new i6z0(35, 0, 6);
                    } else if (z && i == 3) {
                        i6z0Var = new i6z0(15, 0, 6);
                    } else if (z && i == 2) {
                        i6z0Var = new i6z0(23, 0, 6);
                    } else {
                        if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                            i6z0Var2 = new i6z0(13, tw21.B(((MediaCodecRenderer$DecoderInitializationException) cause).diagnosticInfo), 6);
                        } else if (cause instanceof MediaCodecDecoderException) {
                            i6z0Var2 = new i6z0(14, ((MediaCodecDecoderException) cause).errorCode, 6);
                        } else if (cause instanceof OutOfMemoryError) {
                            i6z0Var = new i6z0(14, 0, 6);
                        } else if (cause instanceof AudioSink$InitializationException) {
                            i6z0Var2 = new i6z0(17, ((AudioSink$InitializationException) cause).audioTrackState, 6);
                        } else if (cause instanceof AudioSink$WriteException) {
                            i6z0Var2 = new i6z0(18, ((AudioSink$WriteException) cause).errorCode, 6);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (tw21.A(errorCode2)) {
                                case 6002:
                                    i20 = 24;
                                    break;
                                case 6003:
                                    i20 = 28;
                                    break;
                                case 6004:
                                    i20 = 25;
                                    break;
                                case 6005:
                                    i20 = 26;
                                    break;
                            }
                            i6z0Var2 = new i6z0(i20, errorCode2, 6);
                        } else {
                            i6z0Var = new i6z0(22, 0, 6);
                        }
                        i6z0Var = i6z0Var2;
                    }
                }
                timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - this.e);
                errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
                subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
                exception = subErrorCode.setException(playbackException);
                build = exception.build();
                i8 = 13;
                this.b.execute(new p500(i8, this, build));
                i9 = 1;
                this.B = true;
                this.o = null;
                i10 = 2;
            }
            i2 = 8;
            i3 = 7;
            i4 = 9;
            timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - this.e);
            errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
            subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
            exception = subErrorCode.setException(playbackException);
            build = exception.build();
            i8 = 13;
            this.b.execute(new p500(i8, this, build));
            i9 = 1;
            this.B = true;
            this.o = null;
            i10 = 2;
        }
        if (i42Var.a(i10)) {
            r801 currentTracks = zxc0Var.getCurrentTracks();
            boolean c = currentTracks.c(i10);
            boolean c2 = currentTracks.c(i9);
            boolean c3 = currentTracks.c(3);
            if (c || c2 || c3) {
                if (c) {
                    i11 = 5;
                    aVar = null;
                } else if (Objects.equals(this.s, null)) {
                    i11 = 5;
                    aVar = null;
                } else {
                    int i21 = this.s == null ? 1 : 0;
                    this.s = null;
                    i11 = 5;
                    aVar = null;
                    e(1, elapsedRealtime, null, i21);
                }
                if (!c2 && !Objects.equals(this.t, aVar)) {
                    int i22 = this.t == null ? 1 : 0;
                    this.t = aVar;
                    e(0, elapsedRealtime, aVar, i22);
                }
                if (!c3 && !Objects.equals(this.u, aVar)) {
                    int i23 = this.u == null ? 1 : 0;
                    this.u = aVar;
                    e(2, elapsedRealtime, aVar, i23);
                }
                o3Var = aVar;
                if (a(this.p)) {
                    o3 o3Var2 = this.p;
                    a aVar2 = (a) o3Var2.w;
                    if (aVar2.v != -1) {
                        int i24 = o3Var2.b;
                        if (!Objects.equals(this.s, aVar2)) {
                            int i25 = (this.s == null && i24 == 0) ? 1 : i24;
                            this.s = aVar2;
                            e(1, elapsedRealtime, aVar2, i25);
                        }
                        this.p = o3Var;
                    }
                }
                if (a(this.q)) {
                    o3 o3Var3 = this.q;
                    a aVar3 = (a) o3Var3.w;
                    int i26 = o3Var3.b;
                    if (!Objects.equals(this.t, aVar3)) {
                        int i27 = (this.t == null && i26 == 0) ? 1 : i26;
                        this.t = aVar3;
                        e(0, elapsedRealtime, aVar3, i27);
                    }
                    this.q = o3Var;
                }
                if (a(this.r)) {
                    o3 o3Var4 = this.r;
                    a aVar4 = (a) o3Var4.w;
                    int i28 = o3Var4.b;
                    if (!Objects.equals(this.u, aVar4)) {
                        int i29 = (this.u == null && i28 == 0) ? 1 : i28;
                        this.u = aVar4;
                        e(2, elapsedRealtime, aVar4, i29);
                    }
                    this.r = o3Var;
                }
                switch (c260.a(this.a).b()) {
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
                        i12 = 6;
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
                        i12 = i3;
                        break;
                }
                int i30 = 12;
                if (i12 != this.n) {
                    this.n = i12;
                    networkType = te10.d().setNetworkType(i12);
                    timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.e);
                    build3 = timeSinceCreatedMillis3.build();
                    this.b.execute(new p500(i30, this, build3));
                }
                if (zxc0Var.getPlaybackState() != 2) {
                    this.v = false;
                }
                if (zxc0Var.getPlayerError() != null) {
                    this.x = false;
                    i13 = 10;
                } else {
                    i13 = 10;
                    if (i42Var.a(10)) {
                        this.x = true;
                    }
                }
                int playbackState = zxc0Var.getPlaybackState();
                if (!this.v) {
                    i14 = i11;
                } else if (this.x) {
                    i14 = i8;
                } else {
                    i14 = 4;
                    if (playbackState == 4) {
                        i14 = 11;
                    } else {
                        int i31 = 2;
                        if (playbackState == 2) {
                            int i32 = this.m;
                            if (i32 != 0 && i32 != 2 && i32 != 12) {
                                i14 = !zxc0Var.getPlayWhenReady() ? i3 : zxc0Var.getPlaybackSuppressionReason() != 0 ? i13 : 6;
                            }
                            i14 = i31;
                        } else {
                            i31 = 3;
                            if (playbackState != 3) {
                                z2 = true;
                                i14 = (playbackState != 1 || this.m == 0) ? this.m : 12;
                                if (this.m != i14) {
                                    this.m = i14;
                                    this.B = z2;
                                    state = te10.f().setState(this.m);
                                    timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - this.e);
                                    build2 = timeSinceCreatedMillis2.build();
                                    this.b.execute(new p500(15, this, build2));
                                }
                                if (i42Var.a(1028)) {
                                    eih eihVar2 = this.c;
                                    h42 h42Var3 = (h42) i42Var.b.get(1028);
                                    h42Var3.getClass();
                                    synchronized (eihVar2) {
                                        try {
                                            String str = eihVar2.f;
                                            if (str != null) {
                                                dih dihVar3 = (dih) eihVar2.c.get(str);
                                                dihVar3.getClass();
                                                eihVar2.a(dihVar3);
                                            }
                                            Iterator it3 = eihVar2.c.values().iterator();
                                            while (it3.hasNext()) {
                                                dih dihVar4 = (dih) it3.next();
                                                it3.remove();
                                                if (dihVar4.e && (ue10Var = eihVar2.d) != null) {
                                                    ue10Var.d(h42Var3, dihVar4.a);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            if (zxc0Var.getPlayWhenReady()) {
                                if (zxc0Var.getPlaybackSuppressionReason() != 0) {
                                    i14 = i4;
                                }
                                i14 = i31;
                            }
                        }
                    }
                }
                z2 = true;
                if (this.m != i14) {
                }
                if (i42Var.a(1028)) {
                }
            }
        }
        i11 = 5;
        o3Var = 0;
        if (a(this.p)) {
        }
        if (a(this.q)) {
        }
        if (a(this.r)) {
        }
        switch (c260.a(this.a).b()) {
        }
        int i302 = 12;
        if (i12 != this.n) {
        }
        if (zxc0Var.getPlaybackState() != 2) {
        }
        if (zxc0Var.getPlayerError() != null) {
        }
        int playbackState2 = zxc0Var.getPlaybackState();
        if (!this.v) {
        }
        z2 = true;
        if (this.m != i14) {
        }
        if (i42Var.a(1028)) {
        }
    }

    @Override // defpackage.j42
    public final void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        this.w = he10Var.a;
    }

    @Override // defpackage.j42
    public final void onPlayerError(h42 h42Var, PlaybackException playbackException) {
        this.o = playbackException;
    }

    @Override // defpackage.j42
    public final void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    @Override // defpackage.j42
    public final void onVideoDisabled(h42 h42Var, kyg kygVar) {
        this.y += kygVar.g;
        this.z += kygVar.e;
    }

    @Override // defpackage.j42
    public final void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
        o3 o3Var = this.p;
        if (o3Var != null) {
            a aVar = (a) o3Var.w;
            if (aVar.v == -1) {
                f7s a = aVar.a();
                a.t = do31Var.a;
                a.u = do31Var.b;
                this.p = new o3(new a(a), o3Var.b, (String) o3Var.c, 10);
            }
        }
    }
}
