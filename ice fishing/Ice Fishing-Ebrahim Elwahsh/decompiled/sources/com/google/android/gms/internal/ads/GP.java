package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class GP extends AbstractC3149eQ implements InterfaceC3687oO {

    /* renamed from: A1, reason: collision with root package name */
    public long f25154A1;

    /* renamed from: l1, reason: collision with root package name */
    public final Context f25155l1;

    /* renamed from: m1, reason: collision with root package name */
    public final C3932t0 f25156m1;
    public final EP n1;

    /* renamed from: o1, reason: collision with root package name */
    public final C4164xG f25157o1;
    public int p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f25158q1;

    /* renamed from: r1, reason: collision with root package name */
    public TP f25159r1;

    /* renamed from: s1, reason: collision with root package name */
    public TP f25160s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f25161t1;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f25162u1;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f25163v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f25164w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f25165x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f25166y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f25167z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GP(Context context, C3042ca c3042ca, Handler handler, VN vn, EP ep) {
        super(context.getApplicationContext(), 1, c3042ca, r4, 44100.0f);
        C3796qP c3796qP = C3796qP.f33728z;
        C4164xG c4164xG = Build.VERSION.SDK_INT >= 35 ? new C4164xG(15) : null;
        this.f25155l1 = context.getApplicationContext();
        this.n1 = ep;
        this.f25157o1 = c4164xG;
        this.f25166y1 = -1000;
        this.f25156m1 = new C3932t0(handler, vn, 1);
        this.f25154A1 = com.anythink.basead.exoplayer.b.f6539b;
        ep.f24752l = new Mt(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean H() {
        return this.n1.t();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean I() {
        if (!this.f30401Y0) {
            return false;
        }
        EP ep = this.n1;
        if (ep.l()) {
            return ep.f24728K && !ep.t();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r4.isEmpty() ? null : (com.google.android.gms.internal.ads.C2986bQ) r4.get(0)) != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int L(C3796qP c3796qP, TP tp) {
        int i;
        C4065vP c4065vP;
        C3675oC b9;
        boolean z8;
        String str = tp.f27776o;
        if (!K4.a(str)) {
            return 128;
        }
        int i4 = 1;
        int i9 = tp.f27761O;
        boolean z9 = i9 == 0;
        EP ep = this.n1;
        if (z9) {
            if (i9 != 0) {
                List a9 = AbstractC3419jQ.a(com.anythink.basead.exoplayer.k.o.f8622w, false, false);
            }
            ep.getClass();
            C3258gP a10 = ep.f24756p.a(ep.n(tp));
            G2 g22 = new G2();
            g22.f25091a = a10.f31006a;
            g22.f25092b = a10.f31007b;
            g22.f25093c = a10.f31008c;
            C2985bP b10 = g22.b();
            if (b10.f29487a) {
                i = true != b10.f29488b ? 512 : 1536;
                if (b10.f29489c) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (ep.p(tp) != 0) {
                return i | 172;
            }
            if (com.anythink.basead.exoplayer.k.o.f8622w.equals(str) || ep.p(tp) != 0) {
                c4065vP = new C4065vP();
                c4065vP.e(com.anythink.basead.exoplayer.k.o.f8622w);
                c4065vP.f34765F = tp.f27754G;
                c4065vP.f34767H = tp.f27756I;
                c4065vP.f34768I = 2;
                if (ep.p(new TP(c4065vP)) != 0) {
                    if (tp.f27776o == null) {
                        b9 = C3675oC.f33115x;
                    } else {
                        if (ep.p(tp) != 0) {
                            List a11 = AbstractC3419jQ.a(com.anythink.basead.exoplayer.k.o.f8622w, false, false);
                            C2986bQ c2986bQ = a11.isEmpty() ? null : (C2986bQ) a11.get(0);
                            if (c2986bQ != null) {
                                b9 = UB.j(c2986bQ);
                            }
                        }
                        b9 = AbstractC3419jQ.b(c3796qP, tp, false, false);
                    }
                    if (!b9.isEmpty()) {
                        if (z9) {
                            C2986bQ c2986bQ2 = (C2986bQ) b9.get(0);
                            Context context = this.f25155l1;
                            boolean b11 = c2986bQ2.b(context, tp);
                            if (!b11) {
                                for (int i10 = 1; i10 < b9.f33117w; i10++) {
                                    C2986bQ c2986bQ3 = (C2986bQ) b9.get(i10);
                                    if (c2986bQ3.b(context, tp)) {
                                        b11 = true;
                                        z8 = false;
                                        c2986bQ2 = c2986bQ3;
                                        break;
                                    }
                                }
                            }
                            z8 = true;
                            int i11 = true != b11 ? 3 : 4;
                            int i12 = 8;
                            if (b11 && c2986bQ2.c(tp)) {
                                i12 = 16;
                            }
                            return i11 | i12 | 32 | (true != c2986bQ2.f29496g ? 0 : 64) | (true != z8 ? 0 : 128) | i;
                        }
                        i4 = 2;
                    }
                }
            }
            return i4 | 128;
        }
        i = 0;
        if (com.anythink.basead.exoplayer.k.o.f8622w.equals(str)) {
        }
        c4065vP = new C4065vP();
        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8622w);
        c4065vP.f34765F = tp.f27754G;
        c4065vP.f34767H = tp.f27756I;
        c4065vP.f34768I = 2;
        if (ep.p(new TP(c4065vP)) != 0) {
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final ArrayList N(C3796qP c3796qP, TP tp) {
        C3675oC b9;
        if (tp.f27776o == null) {
            b9 = C3675oC.f33115x;
        } else {
            if (this.n1.p(tp) != 0) {
                List a9 = AbstractC3419jQ.a(com.anythink.basead.exoplayer.k.o.f8622w, false, false);
                C2986bQ c2986bQ = a9.isEmpty() ? null : (C2986bQ) a9.get(0);
                if (c2986bQ != null) {
                    b9 = UB.j(c2986bQ);
                }
            }
            b9 = AbstractC3419jQ.b(c3796qP, tp, false, false);
        }
        HashMap hashMap = AbstractC3419jQ.f32115a;
        ArrayList arrayList = new ArrayList(b9);
        Collections.sort(arrayList, new C3313hQ(new C4164xG(16, this.f25155l1, tp)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean P(TP tp) {
        l();
        return this.n1.p(tp) != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final r Q(C2986bQ c2986bQ, TP tp, float f6) {
        int i;
        TP[] tpArr = this.f30359C;
        tpArr.getClass();
        int length = tpArr.length;
        String str = c2986bQ.f29490a;
        "OMX.google.raw.decoder".equals(str);
        int i4 = tp.f27777p;
        int i9 = 0;
        if (length != 1) {
            for (TP tp2 : tpArr) {
                if (c2986bQ.d(tp, tp2).f26334d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i4 = Math.max(i4, tp2.f27777p);
                }
            }
        }
        this.p1 = i4;
        int i10 = Build.VERSION.SDK_INT;
        this.f25158q1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i11 = this.p1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c2986bQ.f29492c);
        int i12 = tp.f27754G;
        mediaFormat.setInteger("channel-count", i12);
        int i13 = tp.f27756I;
        mediaFormat.setInteger("sample-rate", i13);
        AbstractC3217fl.m(mediaFormat, tp.f27779r);
        AbstractC3217fl.x(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger("priority", 0);
        if (f6 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f6);
        }
        String str2 = tp.f27776o;
        if ("audio/ac4".equals(str2)) {
            Pair b9 = AbstractC4295zm.b(tp);
            if (b9 != null) {
                AbstractC3217fl.x(mediaFormat, "profile", ((Integer) b9.first).intValue());
                AbstractC3217fl.x(mediaFormat, "level", ((Integer) b9.second).intValue());
            }
            if (i10 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        C4065vP c4065vP = new C4065vP();
        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8622w);
        c4065vP.f34765F = i12;
        c4065vP.f34767H = i13;
        c4065vP.f34768I = 4;
        TP tp3 = new TP(c4065vP);
        EP ep = this.n1;
        if (ep.p(tp3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f25166y1));
        }
        TP tp4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            C4313b c4313b = ep.f24756p;
            XO xo = c4313b != null ? (XO) c4313b.f35815e : null;
            int i14 = 12;
            if (xo == null) {
                AbstractC3217fl.I("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                AbstractC2917aC abstractC2917aC = FP.f24961a;
                Iterator it = xo.f28648d.iterator();
                while (true) {
                    AbstractC3674oB abstractC3674oB = (AbstractC3674oB) it;
                    if (!abstractC3674oB.hasNext()) {
                        i = 0;
                        break;
                    }
                    Integer num = (Integer) abstractC3674oB.next();
                    i = num.intValue();
                    if (FP.f24961a.contains(num)) {
                        break;
                    }
                }
                if (i != 0) {
                    i14 = i;
                } else {
                    Iterator it2 = xo.f28647c.iterator();
                    while (true) {
                        AbstractC3674oB abstractC3674oB2 = (AbstractC3674oB) it2;
                        if (!abstractC3674oB2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) abstractC3674oB2.next();
                        int intValue = num2.intValue();
                        if (FP.f24961a.contains(num2)) {
                            i9 = intValue;
                            break;
                        }
                    }
                    if (i9 != 0) {
                        i14 = i9;
                    }
                }
                int bitCount = Integer.bitCount(i14);
                mediaFormat.setInteger("channel-mask", i14);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        h0(mediaFormat);
        if (com.anythink.basead.exoplayer.k.o.f8622w.equals(c2986bQ.f29491b) && !com.anythink.basead.exoplayer.k.o.f8622w.equals(str2)) {
            tp4 = tp;
        }
        this.f25160s1 = tp4;
        return new r(c2986bQ, mediaFormat, tp, null, this.f25157o1, 12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final MN R(C2986bQ c2986bQ, TP tp, TP tp2, boolean z8) {
        int i;
        int i4;
        MN d2 = c2986bQ.d(tp, tp2);
        boolean z9 = this.f30416o0 == null && P(tp2);
        int i9 = d2.f26335e;
        if (z9) {
            i9 |= 32768;
        }
        "OMX.google.raw.decoder".equals(c2986bQ.f29490a);
        if (tp2.f27777p > this.p1) {
            i9 |= 64;
        }
        if (i9 != 0) {
            i = 0;
            i4 = i9;
        } else {
            i = d2.f26334d;
            i4 = 0;
        }
        return new MN(c2986bQ.f29490a, tp, tp2, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final long S(long j9) {
        long w9;
        EP ep = this.n1;
        boolean z8 = ep.t() && this.f25154A1 != com.anythink.basead.exoplayer.b.f6539b;
        if (this.f25167z1) {
            if (!ep.l()) {
                w9 = -9223372036854775807L;
            } else if (ep.f24754n.n()) {
                w9 = AbstractC3548lu.v(((C3366iP) ep.f24754n.f24039e).f31385b, ep.f24758r.f34984a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = ep.f24758r.f34984a.getBufferSizeInFrames();
                int M8 = AbstractC2720Pd.M(((C3366iP) ep.f24754n.f24039e).f31384a);
                PA.T(M8 != -2147483647);
                w9 = AbstractC3548lu.w(bufferSizeInFrames, 1000000L, M8, RoundingMode.DOWN);
            }
            if (this.f25165x1 && z8 && w9 != com.anythink.basead.exoplayer.b.f6539b) {
                float min = Math.min(w9, this.f25154A1 - j9);
                C4045v5 c4045v5 = ep.f24762v;
                return Math.max(10000L, (long) ((min / (c4045v5 != null ? c4045v5.f34712a : 1.0f)) / 2.0f));
            }
        } else if (z8 || this.f30401Y0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final float T(float f6, TP tp, TP[] tpArr) {
        int i = -1;
        for (TP tp2 : tpArr) {
            int i4 = tp2.f27756I;
            if (i4 != -1) {
                i = Math.max(i, i4);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void U(String str, long j9, long j10) {
        C3932t0 c3932t0 = this.f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3418jP(c3932t0, str, j9, j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void V(String str) {
        C3932t0 c3932t0 = this.f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3418jP(c3932t0, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void W(Exception exc) {
        AbstractC3217fl.X("MediaCodecAudioRenderer", "Audio codec error", exc);
        C3932t0 c3932t0 = this.f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3418jP(c3932t0, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final MN X(C4164xG c4164xG) {
        TP tp = (TP) c4164xG.f35133v;
        tp.getClass();
        this.f25159r1 = tp;
        MN X8 = super.X(c4164xG);
        C3932t0 c3932t0 = this.f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3771q0(c3932t0, tp, X8, 15));
        }
        return X8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void Y(TP tp, MediaFormat mediaFormat) {
        int integer;
        BQ bq;
        TP tp2 = this.f25160s1;
        TC tc = null;
        if (tp2 != null) {
            tp = tp2;
        } else if (this.f30421t0 != null) {
            mediaFormat.getClass();
            int integer2 = com.anythink.basead.exoplayer.k.o.f8622w.equals(tp.f27776o) ? tp.J : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? AbstractC3548lu.b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            int integer3 = mediaFormat.getInteger("channel-count");
            int i = tp.f27755H;
            if (i == -1 || tp.f27754G != integer3) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer3) {
                i = integer;
            }
            C4065vP c4065vP = new C4065vP();
            c4065vP.e(com.anythink.basead.exoplayer.k.o.f8622w);
            c4065vP.f34768I = integer2;
            c4065vP.J = tp.f27757K;
            c4065vP.f34769K = tp.f27758L;
            c4065vP.f34782k = tp.f27773l;
            c4065vP.f34773a = tp.f27763a;
            c4065vP.f34774b = tp.f27764b;
            c4065vP.f34775c = UB.n(tp.f27765c);
            c4065vP.f34776d = tp.f27766d;
            c4065vP.f34777e = tp.f27767e;
            c4065vP.f34778f = tp.f27768f;
            c4065vP.f34765F = integer3;
            c4065vP.f34766G = i;
            c4065vP.f34767H = mediaFormat.getInteger("sample-rate");
            tp = new TP(c4065vP);
            if (this.f25158q1) {
                int i4 = tp.f27754G;
                if (i4 == 3) {
                    tc = AbstractC3556m1.f32640a;
                } else if (i4 == 5) {
                    tc = AbstractC3556m1.f32641b;
                } else if (i4 == 6) {
                    tc = AbstractC3556m1.f32642c;
                } else if (i4 == 7) {
                    tc = AbstractC3556m1.f32643d;
                } else if (i4 != 8) {
                    TC tc2 = AbstractC3556m1.f32640a;
                } else {
                    tc = AbstractC3556m1.f32644e;
                }
            }
        }
        try {
            int i9 = Build.VERSION.SDK_INT;
            boolean z8 = true;
            if (i9 >= 29) {
                if (this.f30376L0) {
                    l();
                }
                PA.T(i9 >= 29);
            }
            EP ep = this.n1;
            PE pe = new PE(tp);
            pe.f26883c = tc;
            AbstractC3832r8 abstractC3832r8 = this.f30370I;
            pe.f26884d = abstractC3832r8;
            pe.f26885e = this.J;
            if (!abstractC3832r8.g() && (bq = (BQ) pe.f26885e) != null) {
                if (((AbstractC3832r8) pe.f26884d).e(bq.f24043a) == -1) {
                    z8 = false;
                }
                PA.n(z8);
            }
            ep.q(new C3472kP(pe));
        } catch (C3580mP e6) {
            throw m(e6, e6.f32694n, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void Z() {
        this.n1.f24721C = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void a(long j9, boolean z8, boolean z9) {
        super.a(j9, z8, z9);
        this.n1.a();
        this.f25161t1 = j9;
        this.f25154A1 = com.anythink.basead.exoplayer.b.f6539b;
        this.f25164w1 = false;
        this.f25165x1 = false;
        this.f25162u1 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean a0(long j9, long j10, YP yp, ByteBuffer byteBuffer, int i, int i4, int i9, long j11, boolean z8, boolean z9, TP tp) {
        byteBuffer.getClass();
        this.f25154A1 = com.anythink.basead.exoplayer.b.f6539b;
        if (this.f25160s1 != null && (i4 & 2) != 0) {
            yp.getClass();
            yp.D(i);
            return true;
        }
        EP ep = this.n1;
        if (z8) {
            if (yp != null) {
                yp.D(i);
            }
            this.f30404a1.f26152f += i9;
            ep.f24721C = true;
            return true;
        }
        try {
            if (!ep.s(j11, byteBuffer, i9)) {
                this.f25154A1 = j11;
                return false;
            }
            if (yp != null) {
                yp.D(i);
            }
            this.f30404a1.f26151e += i9;
            return true;
        } catch (C3634nP e6) {
            TP tp2 = this.f25159r1;
            if (this.f30376L0) {
                l();
            }
            throw m(e6, tp2, false, 5001);
        } catch (C3688oP e9) {
            if (this.f30376L0) {
                l();
            }
            throw m(e9, tp, e9.f33141u, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final void b(C4045v5 c4045v5) {
        EP ep = this.n1;
        ep.getClass();
        float f6 = c4045v5.f34712a;
        String str = AbstractC3548lu.f32613a;
        C4045v5 c4045v52 = new C4045v5(Math.max(0.1f, Math.min(f6, 8.0f)), Math.max(0.1f, Math.min(c4045v5.f34713b, 8.0f)));
        ep.f24762v = c4045v52;
        DP dp = new DP(c4045v52, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b);
        if (ep.l()) {
            ep.f24760t = dp;
        } else {
            ep.f24761u = dp;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void b0(KN kn) {
        C3932t0 c3932t0 = this.f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3329hp(28, c3932t0, kn));
        }
    }

    @Override // com.google.android.gms.internal.ads.BO
    public final void c(int i, Object obj) {
        C4164xG c4164xG;
        EP ep = this.n1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (ep.f24725G != floatValue) {
                ep.f24725G = floatValue;
                if (ep.l()) {
                    ep.f24758r.f34984a.setVolume(ep.f24725G);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C2777Sj c2777Sj = (C2777Sj) obj;
            c2777Sj.getClass();
            if (ep.f24759s.equals(c2777Sj)) {
                return;
            }
            ep.f24759s = c2777Sj;
            ep.j();
            return;
        }
        if (i == 6) {
            C3488ko c3488ko = (C3488ko) obj;
            c3488ko.getClass();
            if (ep.f24734Q.equals(c3488ko)) {
                return;
            }
            if (ep.f24758r != null) {
                ep.f24734Q.getClass();
            }
            ep.f24734Q = c3488ko;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            ep.f24735R = audioDeviceInfo;
            C4119wP c4119wP = ep.f24758r;
            if (c4119wP != null) {
                c4119wP.f34984a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f25166y1 = ((Integer) obj).intValue();
            YP yp = this.f30421t0;
            if (yp == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f25166y1));
            yp.g(bundle);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            int i4 = ep.f24736S;
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (i4 == intValue) {
                return;
            }
            ep.f24736S = intValue;
            ep.j();
            return;
        }
        if (i == 9) {
            obj.getClass();
            ep.f24763w = ((Boolean) obj).booleanValue();
            DP dp = new DP(ep.f24762v, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b);
            if (ep.l()) {
                ep.f24760t = dp;
                return;
            } else {
                ep.f24761u = dp;
                return;
            }
        }
        if (i != 10) {
            if (i != 11) {
                return;
            }
            C3147eO c3147eO = (C3147eO) obj;
            c3147eO.getClass();
            this.f30417p0 = c3147eO;
            return;
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        if (ep.f24733P) {
            if (ep.f24732O == intValue2) {
                ep.f24733P = false;
            }
            if (Build.VERSION.SDK_INT >= 35 || (c4164xG = this.f25157o1) == null) {
            }
            c4164xG.L(intValue2);
            return;
        }
        if (ep.f24732O != intValue2) {
            ep.f24732O = intValue2;
            ep.j();
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void c0() {
        try {
            EP ep = this.n1;
            if (!ep.f24728K && ep.l() && ep.g()) {
                ep.o();
                ep.f24728K = true;
            }
            long j9 = this.f30405b1.f30059f;
            if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                this.f25154A1 = j9;
            }
        } catch (C3688oP e6) {
            throw m(e6, e6.f33142v, e6.f33141u, true != this.f30376L0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void d() {
        this.n1.r();
        this.f25167z1 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void d0(long j9) {
        this.n1.f24724F = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final long e() {
        if (this.f30355A == 2) {
            v0();
        }
        return this.f25161t1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void e0(IN in) {
        TP tp;
        if (Build.VERSION.SDK_INT < 29 || (tp = in.f25550c) == null || !Objects.equals(tp.f27776o, com.anythink.basead.exoplayer.k.o.f8584H) || !this.f30376L0) {
            return;
        }
        ByteBuffer byteBuffer = in.f25554g;
        byteBuffer.getClass();
        in.f25550c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            C4119wP c4119wP = this.n1.f24758r;
            if (c4119wP != null) {
                c4119wP.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void f() {
        v0();
        this.f25167z1 = false;
        EP ep = this.n1;
        ep.f24731N = false;
        if (ep.l()) {
            C4119wP c4119wP = ep.f24758r;
            C4173xP c4173xP = c4119wP.f34988e;
            c4173xP.f35158k = 0L;
            c4173xP.f35167t = 0;
            c4173xP.f35166s = 0;
            c4173xP.f35159l = 0L;
            c4173xP.f35172y = com.anythink.basead.exoplayer.b.f6539b;
            c4173xP.f35173z = com.anythink.basead.exoplayer.b.f6539b;
            if (c4173xP.f35168u == com.anythink.basead.exoplayer.b.f6539b) {
                c4173xP.f35156h.a(0);
            }
            c4173xP.f35170w = c4173xP.d();
            if (!c4119wP.f34992j || c4119wP.b()) {
                c4119wP.f34984a.pause();
            }
        }
        this.f25165x1 = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final boolean g() {
        boolean z8 = this.f25164w1;
        this.f25164w1 = false;
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final C4045v5 h() {
        return this.n1.f24762v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void i() {
        C3932t0 c3932t0 = this.f25156m1;
        this.f25163v1 = true;
        this.f25159r1 = null;
        this.f25154A1 = com.anythink.basead.exoplayer.b.f6539b;
        this.f25165x1 = false;
        try {
            try {
                this.n1.a();
                super.i();
                LN ln = this.f30404a1;
                c3932t0.getClass();
                synchronized (ln) {
                }
                Handler handler = c3932t0.f34332a;
                if (handler != null) {
                    handler.post(new RunnableC3329hp(29, c3932t0, ln));
                }
            } catch (Throwable th) {
                super.i();
                LN ln2 = this.f30404a1;
                c3932t0.getClass();
                synchronized (ln2) {
                    Handler handler2 = c3932t0.f34332a;
                    if (handler2 != null) {
                        handler2.post(new RunnableC3329hp(29, c3932t0, ln2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            LN ln3 = this.f30404a1;
            c3932t0.getClass();
            synchronized (ln3) {
                Handler handler3 = c3932t0.f34332a;
                if (handler3 != null) {
                    handler3.post(new RunnableC3329hp(29, c3932t0, ln3));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void j() {
        EP ep = this.n1;
        this.f25164w1 = false;
        this.f25165x1 = false;
        this.f25154A1 = com.anythink.basead.exoplayer.b.f6539b;
        try {
            try {
                this.f30376L0 = false;
                f0();
                w();
                if (this.f25163v1) {
                    this.f25163v1 = false;
                    ep.b();
                }
            } finally {
                this.f30416o0 = null;
            }
        } catch (Throwable th) {
            if (this.f25163v1) {
                this.f25163v1 = false;
                ep.b();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void k() {
        C4164xG c4164xG;
        L l9;
        J j9;
        Handler handler;
        C4313b c4313b = this.n1.f24756p;
        C3759pp c3759pp = (C3759pp) c4313b.f35813c;
        if (c3759pp != null) {
            c3759pp.e();
        }
        C4287ze c4287ze = (C4287ze) c4313b.f35816f;
        if (c4287ze != null && c4287ze.f35573u) {
            c4287ze.f35569B = null;
            Context context = c4287ze.f35572n;
            AbstractC2655Lg.b(context).unregisterAudioDeviceCallback((YO) c4287ze.f35576x);
            if (Build.VERSION.SDK_INT >= 32 && (l9 = (L) c4287ze.f35568A) != null) {
                Spatializer spatializer = l9.f26078a;
                if (spatializer != null && (j9 = l9.f26081d) != null && (handler = l9.f26080c) != null) {
                    spatializer.removeOnSpatializerStateChangedListener(j9);
                    handler.removeCallbacksAndMessages(null);
                }
                c4287ze.f35568A = null;
            }
            context.unregisterReceiver((Q0.d) c4287ze.f35577y);
            ZO zo = (ZO) c4287ze.f35578z;
            if (zo != null) {
                zo.f28984a.unregisterContentObserver(zo);
            }
            c4287ze.f35573u = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (c4164xG = this.f25157o1) == null) {
            return;
        }
        ((HashSet) c4164xG.f35132u).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c4164xG.f35133v;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final String o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final InterfaceC3687oO r0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void t0(boolean z8, boolean z9) {
        LN ln = new LN();
        this.f30404a1 = ln;
        C3932t0 c3932t0 = this.f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3418jP(c3932t0, ln, 8));
        }
        l();
        VO vo = this.f30430y;
        vo.getClass();
        EP ep = this.n1;
        ep.f24751k = vo;
        T2 t22 = this.f30432z;
        t22.getClass();
        ep.f24756p.f35814d = t22;
    }

    public final void v0() {
        long j9;
        ArrayDeque arrayDeque;
        long j10;
        I();
        EP ep = this.n1;
        if (!ep.l() || ep.f24722D) {
            j9 = Long.MIN_VALUE;
        } else {
            long min = Math.min(ep.f24758r.f34988e.a(), AbstractC3548lu.v(((C3366iP) ep.f24754n.f24039e).f31385b, ep.m()));
            while (true) {
                arrayDeque = ep.f24748g;
                if (arrayDeque.isEmpty() || min < ((DP) arrayDeque.getFirst()).f24439c) {
                    break;
                } else {
                    ep.f24761u = (DP) arrayDeque.remove();
                }
            }
            DP dp = ep.f24761u;
            long j11 = min - dp.f24439c;
            long y6 = AbstractC3548lu.y(j11, dp.f24437a.f34712a);
            boolean isEmpty = arrayDeque.isEmpty();
            C3602mu c3602mu = ep.f24741X;
            if (isEmpty) {
                C3160ej c3160ej = (C3160ej) c3602mu.f32776w;
                if (c3160ej.i()) {
                    if (c3160ej.f30474n >= 1024) {
                        long j12 = c3160ej.f30473m;
                        c3160ej.f30470j.getClass();
                        long a9 = j12 - (r12.i.a() * (r12.f27408j * r12.f27401b));
                        int i = c3160ej.f30469h.f33431a;
                        int i4 = c3160ej.f30468g.f33431a;
                        j11 = i == i4 ? AbstractC3548lu.w(j11, a9, c3160ej.f30474n, RoundingMode.DOWN) : AbstractC3548lu.w(j11, a9 * i, c3160ej.f30474n * i4, RoundingMode.DOWN);
                    } else {
                        j11 = (long) (c3160ej.f30464c * j11);
                    }
                }
                DP dp2 = ep.f24761u;
                j10 = dp2.f24438b + j11;
                dp2.f24440d = j11 - y6;
            } else {
                DP dp3 = ep.f24761u;
                j10 = dp3.f24438b + y6 + dp3.f24440d;
            }
            long j13 = ((HP) c3602mu.f32775v).f25366l;
            j9 = AbstractC3548lu.v(((C3366iP) ep.f24754n.f24039e).f31385b, j13) + j10;
            long j14 = ep.f24738U;
            if (j13 > j14) {
                long v6 = AbstractC3548lu.v(((C3366iP) ep.f24754n.f24039e).f31385b, j13 - j14);
                ep.f24738U = j13;
                ep.f24739V += v6;
                if (ep.f24740W == null) {
                    ep.f24740W = new Handler(Looper.myLooper());
                }
                ep.f24740W.removeCallbacksAndMessages(null);
                ep.f24740W.postDelayed(new RunnableC3873rw(17, ep), 100L);
            }
        }
        if (j9 != Long.MIN_VALUE) {
            if (!this.f25162u1) {
                j9 = Math.max(this.f25161t1, j9);
            }
            this.f25161t1 = j9;
            this.f25162u1 = false;
        }
    }
}
