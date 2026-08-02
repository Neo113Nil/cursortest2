package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.a;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.audio.c;
import androidx.media3.exoplayer.mediacodec.f;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableList;
import com.squareup.wire.internal.MathMethodsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class qb10 extends wb10 implements kb10 {
    public final Context H0;
    public final h0w I0;
    public final ch3 J0;
    public final f K0;
    public int L0;
    public boolean M0;
    public boolean N0;
    public a O0;
    public a P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public int p1;
    public boolean v1;
    public long x1;
    public boolean y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb10(Context context, mb10 mb10Var, xb10 xb10Var, boolean z, Handler handler, xg3 xg3Var, ch3 ch3Var) {
        super(1, mb10Var, xb10Var, z, 44100.0f);
        f fVar = tw21.a >= 35 ? new f() : null;
        this.H0 = context.getApplicationContext();
        this.J0 = ch3Var;
        this.K0 = fVar;
        this.p1 = -1000;
        this.I0 = new h0w(handler, xg3Var);
        this.x1 = -9223372036854775807L;
        ((c) ch3Var).s = new i4u(this);
    }

    @Override // defpackage.wb10
    public final void E(Exception exc) {
        lk91.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        h0w h0wVar = this.I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new tg3(h0wVar, exc, 0));
        }
    }

    @Override // defpackage.wb10
    public final void F(long j, long j2, String str) {
        h0w h0wVar = this.I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new ug3(h0wVar, str, j, j2, 0));
        }
    }

    @Override // defpackage.wb10
    public final void G(String str) {
        h0w h0wVar = this.I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new hc(26, h0wVar, str));
        }
    }

    @Override // defpackage.wb10
    public final qyg H(o7s o7sVar) {
        a aVar = o7sVar.b;
        aVar.getClass();
        this.O0 = aVar;
        qyg H = super.H(o7sVar);
        h0w h0wVar = this.I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new d1(2, h0wVar, aVar, H));
        }
        return H;
    }

    @Override // defpackage.wb10
    public final void I(a aVar, MediaFormat mediaFormat) {
        a aVar2 = this.P0;
        int[] iArr = null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (this.N != null) {
            mediaFormat.getClass();
            String str = aVar.n;
            int i = aVar.D;
            int F = "audio/raw".equals(str) ? aVar.F : (tw21.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? tw21.F(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            f7s f7sVar = new f7s();
            f7sVar.m = eh20.q("audio/raw");
            f7sVar.E = F;
            f7sVar.F = aVar.G;
            f7sVar.G = aVar.H;
            f7sVar.k = aVar.l;
            f7sVar.a = aVar.a;
            f7sVar.b = aVar.b;
            f7sVar.c = ImmutableList.l(aVar.c);
            f7sVar.d = aVar.d;
            f7sVar.e = aVar.e;
            f7sVar.f = aVar.f;
            f7sVar.C = mediaFormat.getInteger("channel-count");
            f7sVar.D = mediaFormat.getInteger("sample-rate");
            aVar = new a(f7sVar);
            boolean z = this.M0;
            int i2 = aVar.D;
            if (z && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.N0) {
                iArr = xj91.a(i2);
            }
        }
        try {
            int i4 = tw21.a;
            ch3 ch3Var = this.J0;
            if (i4 >= 29) {
                if (!this.l0 || getConfiguration().a == 0) {
                    ((c) ch3Var).C(0);
                } else {
                    ((c) ch3Var).C(getConfiguration().a);
                }
            }
            ((c) ch3Var).d(aVar, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw createRendererException(e, e.format, 5001);
        }
    }

    @Override // defpackage.wb10
    public final void J() {
        this.J0.getClass();
    }

    @Override // defpackage.wb10
    public final void L() {
        ((c) this.J0).M = true;
    }

    @Override // defpackage.wb10
    public final boolean P(long j, long j2, pb10 pb10Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, a aVar) {
        byteBuffer.getClass();
        this.x1 = -9223372036854775807L;
        if (this.P0 != null && (i2 & 2) != 0) {
            pb10Var.getClass();
            pb10Var.b(i);
            return true;
        }
        ch3 ch3Var = this.J0;
        if (z) {
            if (pb10Var != null) {
                pb10Var.b(i);
            }
            this.C0.f += i3;
            ((c) ch3Var).M = true;
            return true;
        }
        try {
            if (!((c) ch3Var).n(j3, byteBuffer, i3)) {
                this.x1 = j3;
                return false;
            }
            if (pb10Var != null) {
                pb10Var.b(i);
            }
            this.C0.e += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            throw createRendererException(e, this.O0, e.isRecoverable, (!this.l0 || getConfiguration().a == 0) ? 5001 : 5004);
        } catch (AudioSink$WriteException e2) {
            throw createRendererException(e2, aVar, e2.isRecoverable, (!this.l0 || getConfiguration().a == 0) ? 5002 : 5003);
        }
    }

    @Override // defpackage.wb10
    public final void S() {
        try {
            c cVar = (c) this.J0;
            if (!cVar.T && cVar.q() && cVar.f()) {
                cVar.v();
                cVar.T = true;
            }
            long j = this.w0;
            if (j != -9223372036854775807L) {
                this.x1 = j;
            }
            this.y1 = true;
        } catch (AudioSink$WriteException e) {
            throw createRendererException(e, e.format, e.isRecoverable, this.l0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.wb10
    public final boolean a0(a aVar) {
        if (getConfiguration().a != 0) {
            int f0 = f0(aVar);
            if ((f0 & 512) != 0) {
                if (getConfiguration().a == 2 || (f0 & 1024) != 0) {
                    return true;
                }
                if (aVar.G == 0 && aVar.H == 0) {
                    return true;
                }
            }
        }
        return ((c) this.J0).F(aVar);
    }

    @Override // defpackage.kb10
    public final boolean b() {
        boolean z = this.T0;
        this.T0 = false;
        return z;
    }

    @Override // defpackage.wb10
    public final int b0(xb10 xb10Var, a aVar) {
        int i;
        sb10 i2;
        boolean z;
        boolean z2 = true;
        int a = iyi0.a(1, 0, 0, 0);
        String str = aVar.n;
        String str2 = aVar.n;
        if (!eh20.l(str)) {
            return iyi0.a(0, 0, 0, 0);
        }
        int i3 = aVar.M;
        boolean z3 = i3 != 0;
        boolean z4 = i3 == 0 || i3 == 2;
        int i4 = 8;
        ch3 ch3Var = this.J0;
        if (!z4 || (z3 && fd10.i() == null)) {
            i = 0;
        } else {
            int f0 = f0(aVar);
            if (((c) ch3Var).F(aVar)) {
                return iyi0.a(4, 8, 32, f0);
            }
            i = f0;
        }
        if (!"audio/raw".equals(str2) || ((c) ch3Var).F(aVar)) {
            c cVar = (c) ch3Var;
            if (cVar.F(tw21.G(2, aVar.D, aVar.E))) {
                List p = str2 == null ? ImmutableList.p() : (!cVar.F(aVar) || (i2 = fd10.i()) == null) ? fd10.g(xb10Var, aVar, false, false) : ImmutableList.r(i2);
                if (!((AbstractCollection) p).isEmpty()) {
                    if (!z4) {
                        return iyi0.a(2, 0, 0, 0);
                    }
                    sb10 sb10Var = (sb10) p.get(0);
                    boolean e = sb10Var.e(aVar);
                    if (!e) {
                        for (int i5 = 1; i5 < p.size(); i5++) {
                            sb10 sb10Var2 = (sb10) p.get(i5);
                            if (sb10Var2.e(aVar)) {
                                z = false;
                                sb10Var = sb10Var2;
                                break;
                            }
                        }
                    }
                    z = true;
                    z2 = e;
                    int i6 = z2 ? 4 : 3;
                    if (z2 && sb10Var.g(aVar)) {
                        i4 = 16;
                    }
                    return iyi0.d(i6, i4, 32, sb10Var.h ? 64 : 0, z ? 128 : 0, i);
                }
            }
        }
        return a;
    }

    public final int f0(a aVar) {
        hg3 j = ((c) this.J0).j(aVar);
        if (!j.a) {
            return 0;
        }
        int i = j.b ? HProv.ALG_TYPE_BLOCK : 512;
        return j.c ? i | 2048 : i;
    }

    @Override // defpackage.kb10
    public final long g() {
        if (getState() == 2) {
            h0();
        }
        return this.Q0;
    }

    public final int g0(sb10 sb10Var, a aVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(sb10Var.a) || (i = tw21.a) >= 24 || (i == 23 && tw21.U(this.H0))) {
            return aVar.o;
        }
        return -1;
    }

    @Override // defpackage.a95, defpackage.fyi0
    public final kb10 getMediaClock() {
        return this;
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.kb10
    /* renamed from: getPlaybackParameters */
    public final lxc0 mo496getPlaybackParameters() {
        return ((c) this.J0).D;
    }

    public final void h0() {
        isEnded();
        long i = ((c) this.J0).i();
        if (i != Long.MIN_VALUE) {
            if (!this.R0) {
                i = Math.max(this.Q0, i);
            }
            this.Q0 = i;
            this.R0 = false;
        }
    }

    @Override // defpackage.wb10, defpackage.a95, defpackage.xyc0
    public final void handleMessage(int i, Object obj) {
        ddf ddfVar;
        f fVar;
        ch3 ch3Var = this.J0;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            c cVar = (c) ch3Var;
            if (cVar.P != floatValue) {
                cVar.P = floatValue;
                if (cVar.q()) {
                    cVar.w.setVolume(cVar.P);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            ue3 ue3Var = (ue3) obj;
            ue3Var.getClass();
            ((c) ch3Var).z(ue3Var);
            return;
        }
        if (i == 6) {
            ga4 ga4Var = (ga4) obj;
            ga4Var.getClass();
            ((c) ch3Var).B(ga4Var);
            return;
        }
        if (i == 12) {
            if (tw21.a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                c cVar2 = (c) ch3Var;
                if (audioDeviceInfo == null) {
                    ddfVar = null;
                } else {
                    cVar2.getClass();
                    ddfVar = new ddf(22, audioDeviceInfo);
                }
                cVar2.a0 = ddfVar;
                androidx.media3.exoplayer.audio.a aVar = cVar2.y;
                if (aVar != null) {
                    aVar.b(audioDeviceInfo);
                }
                AudioTrack audioTrack = cVar2.w;
                if (audioTrack != null) {
                    ddf ddfVar2 = cVar2.a0;
                    audioTrack.setPreferredDevice(ddfVar2 != null ? (AudioDeviceInfo) ddfVar2.b : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.p1 = ((Integer) obj).intValue();
            pb10 pb10Var = this.N;
            if (pb10Var != null && tw21.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.p1));
                pb10Var.setParameters(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c cVar3 = (c) ch3Var;
            cVar3.E = ((Boolean) obj).booleanValue();
            g6h g6hVar = new g6h(cVar3.G() ? lxc0.d : cVar3.D, -9223372036854775807L, -9223372036854775807L);
            if (cVar3.q()) {
                cVar3.B = g6hVar;
                return;
            } else {
                cVar3.C = g6hVar;
                return;
            }
        }
        if (i != 10) {
            super.handleMessage(i, obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        c cVar4 = (c) ch3Var;
        if (cVar4.Y != intValue) {
            cVar4.Y = intValue;
            cVar4.X = intValue != 0;
            cVar4.g();
        }
        if (tw21.a < 35 || (fVar = this.K0) == null) {
            return;
        }
        fVar.c(intValue);
    }

    @Override // defpackage.a95, defpackage.fyi0
    public final boolean isEnded() {
        if (!this.y0) {
            return false;
        }
        c cVar = (c) this.J0;
        if (cVar.q()) {
            return cVar.T && !cVar.o();
        }
        return true;
    }

    @Override // defpackage.wb10, defpackage.fyi0
    public final boolean isReady() {
        return ((c) this.J0).o() || super.isReady();
    }

    @Override // defpackage.wb10
    public final qyg j(sb10 sb10Var, a aVar, a aVar2) {
        qyg b = sb10Var.b(aVar, aVar2);
        int i = b.e;
        if (this.H == null && a0(aVar2)) {
            i |= 32768;
        }
        if (g0(sb10Var, aVar2) > this.L0) {
            i |= 64;
        }
        int i2 = i;
        return new qyg(sb10Var.a, aVar, aVar2, i2 != 0 ? 0 : b.d, i2);
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onDisabled() {
        h0w h0wVar = this.I0;
        this.S0 = true;
        this.O0 = null;
        this.x1 = -9223372036854775807L;
        this.y1 = false;
        try {
            ((c) this.J0).g();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        kyg kygVar = this.C0;
        h0w h0wVar = this.I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new qg3(h0wVar, kygVar, 0));
        }
        boolean z3 = getConfiguration().b;
        ch3 ch3Var = this.J0;
        if (z3) {
            c cVar = (c) ch3Var;
            d6z.x(cVar.X);
            if (!cVar.b0) {
                cVar.b0 = true;
                cVar.g();
            }
        } else {
            c cVar2 = (c) ch3Var;
            if (cVar2.b0) {
                cVar2.b0 = false;
                cVar2.g();
            }
        }
        c cVar3 = (c) ch3Var;
        cVar3.r = getPlayerId();
        cVar3.h.I = getClock();
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onPositionReset(long j, boolean z) {
        super.onPositionReset(j, z);
        ((c) this.J0).g();
        this.Q0 = j;
        this.x1 = -9223372036854775807L;
        this.y1 = false;
        this.T0 = false;
        this.R0 = true;
    }

    @Override // defpackage.a95
    public final void onRelease() {
        f fVar;
        ((c) this.J0).x();
        if (tw21.a < 35 || (fVar = this.K0) == null) {
            return;
        }
        fVar.a.clear();
        LoudnessCodecController loudnessCodecController = fVar.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onReset() {
        ch3 ch3Var = this.J0;
        this.T0 = false;
        this.x1 = -9223372036854775807L;
        this.y1 = false;
        try {
            super.onReset();
        } finally {
            if (this.S0) {
                this.S0 = false;
                ((c) ch3Var).y();
            }
        }
    }

    @Override // defpackage.a95
    public final void onStarted() {
        ((c) this.J0).u();
        this.v1 = true;
    }

    @Override // defpackage.a95
    public final void onStopped() {
        h0();
        this.v1 = false;
        ((c) this.J0).t();
    }

    @Override // defpackage.kb10
    public final void setPlaybackParameters(lxc0 lxc0Var) {
        ((c) this.J0).E(lxc0Var);
    }

    @Override // defpackage.wb10
    public final float u(float f, a[] aVarArr) {
        int i = -1;
        for (a aVar : aVarArr) {
            int i2 = aVar.E;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.wb10
    public final ArrayList v(xb10 xb10Var, a aVar, boolean z) {
        sb10 i;
        return fd10.h(aVar, aVar.n == null ? ImmutableList.p() : (!((c) this.J0).F(aVar) || (i = fd10.i()) == null) ? fd10.g(xb10Var, aVar, z, false) : ImmutableList.r(i));
    }

    @Override // defpackage.wb10
    public final long w(long j, long j2) {
        if (this.x1 != -9223372036854775807L) {
            long h = ((c) this.J0).h();
            if (this.y1 || h != -9223372036854775807L) {
                long j3 = this.x1 - j;
                if (h != -9223372036854775807L) {
                    j3 = Math.min(h, j3);
                }
                long j4 = (long) ((j3 / (mo496getPlaybackParameters() != null ? mo496getPlaybackParameters().a : 1.0f)) / 2.0f);
                if (this.v1) {
                    ((o2x0) getClock()).getClass();
                    j4 -= tw21.W(SystemClock.elapsedRealtime()) - j2;
                }
                return Math.max(10000L, j4);
            }
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if ("AXON 7 mini".equals(r7) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    @Override // defpackage.wb10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lb10 x(sb10 sb10Var, a aVar, MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        a[] streamFormats = getStreamFormats();
        int g0 = g0(sb10Var, aVar);
        String str = sb10Var.a;
        if (streamFormats.length != 1) {
            for (a aVar2 : streamFormats) {
                if (sb10Var.b(aVar, aVar2).d != 0) {
                    g0 = Math.max(g0, g0(sb10Var, aVar2));
                }
            }
        }
        this.L0 = g0;
        int i = tw21.a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.M0 = z;
                this.N0 = !str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
                String str3 = sb10Var.c;
                int i2 = this.L0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i3 = aVar.D;
                String str4 = aVar.n;
                mediaFormat.setInteger("channel-count", i3);
                int i4 = aVar.E;
                mediaFormat.setInteger("sample-rate", i4);
                sd10.c(mediaFormat, aVar.q);
                sd10.b(mediaFormat, "max-input-size", i2);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str5 = Build.MODEL;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (i <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24) {
                    if (((c) this.J0).k(tw21.G(4, aVar.D, i4)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.p1));
                }
                this.P0 = ("audio/raw".equals(sb10Var.b) || "audio/raw".equals(str4)) ? null : aVar;
                return new lb10(sb10Var, mediaFormat, aVar, null, mediaCrypto, this.K0);
            }
        }
        z = false;
        this.M0 = z;
        this.N0 = !str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str32 = sb10Var.c;
        int i22 = this.L0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i32 = aVar.D;
        String str42 = aVar.n;
        mediaFormat.setInteger("channel-count", i32);
        int i42 = aVar.E;
        mediaFormat.setInteger("sample-rate", i42);
        sd10.c(mediaFormat, aVar.q);
        sd10.b(mediaFormat, "max-input-size", i22);
        if (i >= 23) {
        }
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
        }
        if (i >= 32) {
        }
        if (i >= 35) {
        }
        this.P0 = ("audio/raw".equals(sb10Var.b) || "audio/raw".equals(str42)) ? null : aVar;
        return new lb10(sb10Var, mediaFormat, aVar, null, mediaCrypto, this.K0);
    }

    @Override // defpackage.wb10
    public final void y(nyg nygVar) {
        a aVar;
        f6h f6hVar;
        if (tw21.a < 29 || (aVar = nygVar.b) == null || !Objects.equals(aVar.n, "audio/opus") || !this.l0) {
            return;
        }
        ByteBuffer byteBuffer = nygVar.z;
        byteBuffer.getClass();
        a aVar2 = nygVar.b;
        aVar2.getClass();
        int i = aVar2.G;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / MathMethodsKt.NANOS_PER_SECOND);
            c cVar = (c) this.J0;
            AudioTrack audioTrack = cVar.w;
            if (audioTrack == null || !c.r(audioTrack) || (f6hVar = cVar.u) == null || !f6hVar.k) {
                return;
            }
            cVar.w.setOffloadDelayPadding(i, i2);
        }
    }
}
