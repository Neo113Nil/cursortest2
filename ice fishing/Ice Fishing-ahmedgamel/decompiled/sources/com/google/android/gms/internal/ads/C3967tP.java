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
import com.google.android.gms.internal.consent_sdk.C4323b;
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

/* renamed from: com.google.android.gms.internal.ads.tP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3967tP extends SP implements InterfaceC2999bO {

    /* renamed from: f1, reason: collision with root package name */
    public final Context f35064f1;

    /* renamed from: g1, reason: collision with root package name */
    public final S0.l f35065g1;

    /* renamed from: h1, reason: collision with root package name */
    public final C3859rP f35066h1;

    /* renamed from: i1, reason: collision with root package name */
    public final LP f35067i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f35068j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f35069k1;

    /* renamed from: l1, reason: collision with root package name */
    public DP f35070l1;

    /* renamed from: m1, reason: collision with root package name */
    public DP f35071m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f35072n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f35073o1;
    public boolean p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f35074q1;
    public boolean r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f35075s1;

    /* renamed from: t1, reason: collision with root package name */
    public boolean f35076t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f35077u1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3967tP(Context context, C3216fa c3216fa, Handler handler, HN hn, C3859rP c3859rP) {
        super(context.getApplicationContext(), 1, c3216fa, r0);
        C3107dP c3107dP = C3107dP.f30547z;
        LP lp = Build.VERSION.SDK_INT >= 35 ? new LP(0) : null;
        this.f35064f1 = context.getApplicationContext();
        this.f35066h1 = c3859rP;
        this.f35067i1 = lp;
        this.f35075s1 = -1000;
        this.f35065g1 = new S0.l(26, handler, hn);
        this.f35077u1 = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean I() {
        return this.f35066h1.t();
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean J() {
        if (!this.f28231S0) {
            return false;
        }
        C3859rP c3859rP = this.f35066h1;
        if (c3859rP.l()) {
            return c3859rP.f34367K && !c3859rP.t();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r4.isEmpty() ? null : (com.google.android.gms.internal.ads.PP) r4.get(0)) != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // com.google.android.gms.internal.ads.SP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(C3107dP c3107dP, DP dp) {
        int i;
        C3322hP c3322hP;
        C3523lC b9;
        boolean z6;
        String str = dp.f25176o;
        if (!H4.a(str)) {
            return 128;
        }
        int i4 = 1;
        int i6 = dp.f25161P;
        boolean z9 = i6 == 0;
        C3859rP c3859rP = this.f35066h1;
        if (z9) {
            if (i6 != 0) {
                List a9 = ZP.a(com.anythink.basead.exoplayer.k.o.f9251w, false, false);
            }
            c3859rP.getClass();
            TO a10 = c3859rP.f34395p.a(c3859rP.n(dp));
            I2 i22 = new I2();
            i22.f26176a = a10.f28519a;
            i22.f26177b = a10.f28520b;
            i22.f26178c = a10.f28521c;
            OO b10 = i22.b();
            if (b10.f27383a) {
                i = true != b10.f27384b ? 512 : 1536;
                if (b10.f27385c) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (c3859rP.p(dp) != 0) {
                return i | 172;
            }
            if (com.anythink.basead.exoplayer.k.o.f9251w.equals(str) || c3859rP.p(dp) != 0) {
                c3322hP = new C3322hP();
                c3322hP.e(com.anythink.basead.exoplayer.k.o.f9251w);
                c3322hP.f31538G = dp.f25154H;
                c3322hP.f31540I = dp.J;
                c3322hP.J = 2;
                if (c3859rP.p(new DP(c3322hP)) != 0) {
                    if (dp.f25176o == null) {
                        b9 = C3523lC.f32525x;
                    } else {
                        if (c3859rP.p(dp) != 0) {
                            List a11 = ZP.a(com.anythink.basead.exoplayer.k.o.f9251w, false, false);
                            PP pp = a11.isEmpty() ? null : (PP) a11.get(0);
                            if (pp != null) {
                                b9 = RB.j(pp);
                            }
                        }
                        b9 = ZP.b(c3107dP, dp, false, false);
                    }
                    if (!b9.isEmpty()) {
                        if (z9) {
                            PP pp2 = (PP) b9.get(0);
                            Context context = this.f35064f1;
                            boolean b11 = pp2.b(context, dp);
                            if (!b11) {
                                for (int i9 = 1; i9 < b9.f32527w; i9++) {
                                    PP pp3 = (PP) b9.get(i9);
                                    if (pp3.b(context, dp)) {
                                        b11 = true;
                                        z6 = false;
                                        pp2 = pp3;
                                        break;
                                    }
                                }
                            }
                            z6 = true;
                            int i10 = true != b11 ? 3 : 4;
                            int i11 = 8;
                            if (b11 && pp2.c(dp)) {
                                i11 = 16;
                            }
                            return i10 | i11 | 32 | (true != pp2.f27603g ? 0 : 64) | (true != z6 ? 0 : 128) | i;
                        }
                        i4 = 2;
                    }
                }
            }
            return i4 | 128;
        }
        i = 0;
        if (com.anythink.basead.exoplayer.k.o.f9251w.equals(str)) {
        }
        c3322hP = new C3322hP();
        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9251w);
        c3322hP.f31538G = dp.f25154H;
        c3322hP.f31540I = dp.J;
        c3322hP.J = 2;
        if (c3859rP.p(new DP(c3322hP)) != 0) {
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final ArrayList O(C3107dP c3107dP, DP dp) {
        C3523lC b9;
        if (dp.f25176o == null) {
            b9 = C3523lC.f32525x;
        } else {
            if (this.f35066h1.p(dp) != 0) {
                List a9 = ZP.a(com.anythink.basead.exoplayer.k.o.f9251w, false, false);
                PP pp = a9.isEmpty() ? null : (PP) a9.get(0);
                if (pp != null) {
                    b9 = RB.j(pp);
                }
            }
            b9 = ZP.b(c3107dP, dp, false, false);
        }
        HashMap hashMap = ZP.f29665a;
        ArrayList arrayList = new ArrayList(b9);
        Collections.sort(arrayList, new VP(new WP(this.f35064f1, dp)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean Q(DP dp) {
        l();
        return this.f35066h1.p(dp) != 0;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final C3887s R(PP pp, DP dp, float f2) {
        int i;
        DP[] dpArr = this.f28200C;
        dpArr.getClass();
        int length = dpArr.length;
        String str = pp.f27597a;
        "OMX.google.raw.decoder".equals(str);
        int i4 = dp.f25177p;
        int i6 = 0;
        if (length != 1) {
            for (DP dp2 : dpArr) {
                if (pp.d(dp, dp2).f35941d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i4 = Math.max(i4, dp2.f25177p);
                }
            }
        }
        this.f35068j1 = i4;
        int i9 = Build.VERSION.SDK_INT;
        this.f35069k1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i10 = this.f35068j1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", pp.f27599c);
        int i11 = dp.f25154H;
        mediaFormat.setInteger("channel-count", i11);
        int i12 = dp.J;
        mediaFormat.setInteger("sample-rate", i12);
        AbstractC2991bG.i(mediaFormat, dp.f25179r);
        AbstractC2991bG.s(mediaFormat, "max-input-size", i10);
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f2);
        }
        String str2 = dp.f25176o;
        if ("audio/ac4".equals(str2)) {
            Pair c9 = AbstractC4305zm.c(dp);
            if (c9 != null) {
                AbstractC2991bG.s(mediaFormat, "profile", ((Integer) c9.first).intValue());
                AbstractC2991bG.s(mediaFormat, "level", ((Integer) c9.second).intValue());
            }
            if (i9 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        C3322hP c3322hP = new C3322hP();
        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9251w);
        c3322hP.f31538G = i11;
        c3322hP.f31540I = i12;
        c3322hP.J = 4;
        DP dp3 = new DP(c3322hP);
        C3859rP c3859rP = this.f35066h1;
        if (c3859rP.p(dp3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i9 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i9 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f35075s1));
        }
        DP dp4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            C4323b c4323b = c3859rP.f34395p;
            KO ko = c4323b != null ? (KO) c4323b.f36421e : null;
            int i13 = 12;
            if (ko == null) {
                AbstractC2991bG.y("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                XB xb = AbstractC3913sP.f34740a;
                Iterator it = ko.f26674d.iterator();
                while (true) {
                    AbstractC3522lB abstractC3522lB = (AbstractC3522lB) it;
                    if (!abstractC3522lB.hasNext()) {
                        i = 0;
                        break;
                    }
                    Integer num = (Integer) abstractC3522lB.next();
                    i = num.intValue();
                    if (AbstractC3913sP.f34740a.contains(num)) {
                        break;
                    }
                }
                if (i != 0) {
                    i13 = i;
                } else {
                    Iterator it2 = ko.f26673c.iterator();
                    while (true) {
                        AbstractC3522lB abstractC3522lB2 = (AbstractC3522lB) it2;
                        if (!abstractC3522lB2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) abstractC3522lB2.next();
                        int intValue = num2.intValue();
                        if (AbstractC3913sP.f34740a.contains(num2)) {
                            i6 = intValue;
                            break;
                        }
                    }
                    if (i6 != 0) {
                        i13 = i6;
                    }
                }
                int bitCount = Integer.bitCount(i13);
                mediaFormat.setInteger("channel-mask", i13);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        i0(mediaFormat);
        if (com.anythink.basead.exoplayer.k.o.f9251w.equals(pp.f27598b) && !com.anythink.basead.exoplayer.k.o.f9251w.equals(str2)) {
            dp4 = dp;
        }
        this.f35071m1 = dp4;
        return new C3887s(pp, mediaFormat, dp, null, this.f35067i1, 12);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final C4235yN S(PP pp, DP dp, DP dp2, boolean z6) {
        int i;
        int i4;
        C4235yN d9 = pp.d(dp, dp2);
        boolean z9 = this.f28249i0 == null && Q(dp2);
        int i6 = d9.f35942e;
        if (z9) {
            i6 |= 32768;
        }
        "OMX.google.raw.decoder".equals(pp.f27597a);
        if (dp2.f25177p > this.f35068j1) {
            i6 |= 64;
        }
        if (i6 != 0) {
            i = 0;
            i4 = i6;
        } else {
            i = d9.f35941d;
            i4 = 0;
        }
        return new C4235yN(pp.f27597a, dp, dp2, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final long T(long j6) {
        long w3;
        C3859rP c3859rP = this.f35066h1;
        boolean z6 = c3859rP.t() && this.f35077u1 != com.anythink.basead.exoplayer.b.f7168b;
        if (this.f35076t1) {
            if (!c3859rP.l()) {
                w3 = -9223372036854775807L;
            } else if (c3859rP.f34393n.n()) {
                w3 = AbstractC3182eu.v(((VO) c3859rP.f34393n.f33688e).f28988b, c3859rP.f34397r.f32035a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = c3859rP.f34397r.f32035a.getBufferSizeInFrames();
                int Q8 = MA.Q(((VO) c3859rP.f34393n.f33688e).f28987a);
                AbstractC2792Sd.H(Q8 != -2147483647);
                w3 = AbstractC3182eu.w(bufferSizeInFrames, 1000000L, Q8, RoundingMode.DOWN);
            }
            if (this.r1 && z6 && w3 != com.anythink.basead.exoplayer.b.f7168b) {
                float min = Math.min(w3, this.f35077u1 - j6);
                C3947t5 c3947t5 = c3859rP.f34401v;
                return Math.max(10000L, (long) ((min / (c3947t5 != null ? c3947t5.f35002a : 1.0f)) / 2.0f));
            }
        } else if (z6 || this.f28231S0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final float U(float f2, DP dp, DP[] dpArr) {
        int i = -1;
        for (DP dp2 : dpArr) {
            int i4 = dp2.J;
            if (i4 != -1) {
                i = Math.max(i, i4);
            }
        }
        if (i == -1) {
            MediaFormat mediaFormat = this.f28256p0;
            i = (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) ? -1 : mediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f2;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void V(String str, long j6, long j9) {
        S0.l lVar = this.f35065g1;
        Handler handler = (Handler) lVar.f2926u;
        if (handler != null) {
            handler.post(new WO(lVar, str, j6, j9));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void W(String str) {
        S0.l lVar = this.f35065g1;
        Handler handler = (Handler) lVar.f2926u;
        if (handler != null) {
            handler.post(new WO(lVar, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void X(Exception exc) {
        AbstractC2991bG.J("MediaCodecAudioRenderer", "Audio codec error", exc);
        S0.l lVar = this.f35065g1;
        Handler handler = (Handler) lVar.f2926u;
        if (handler != null) {
            handler.post(new WO(lVar, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final C4235yN Y(S0.l lVar) {
        DP dp = (DP) lVar.f2927v;
        dp.getClass();
        this.f35070l1 = dp;
        C4235yN Y = super.Y(lVar);
        S0.l lVar2 = this.f35065g1;
        Handler handler = (Handler) lVar2.f2926u;
        if (handler != null) {
            handler.post(new RunnableC3888s0(15, lVar2, dp, Y));
        }
        return Y;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void Z(DP dp, MediaFormat mediaFormat) {
        int integer;
        C3860rQ c3860rQ;
        DP dp2 = this.f35071m1;
        RC rc = null;
        if (dp2 != null) {
            dp = dp2;
        } else if (this.f28254n0 != null) {
            mediaFormat.getClass();
            int integer2 = com.anythink.basead.exoplayer.k.o.f9251w.equals(dp.f25176o) ? dp.f25156K : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? AbstractC3182eu.b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            int integer3 = mediaFormat.getInteger("channel-count");
            int i = dp.f25155I;
            if (i == -1 || dp.f25154H != integer3) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer3) {
                i = integer;
            }
            C3322hP c3322hP = new C3322hP();
            c3322hP.e(com.anythink.basead.exoplayer.k.o.f9251w);
            c3322hP.J = integer2;
            c3322hP.f31541K = dp.f25157L;
            c3322hP.f31542L = dp.f25158M;
            c3322hP.f31555k = dp.f25173l;
            c3322hP.f31546a = dp.f25163a;
            c3322hP.f31547b = dp.f25164b;
            c3322hP.f31548c = RB.n(dp.f25165c);
            c3322hP.f31549d = dp.f25166d;
            c3322hP.f31550e = dp.f25167e;
            c3322hP.f31551f = dp.f25168f;
            c3322hP.f31538G = integer3;
            c3322hP.f31539H = i;
            c3322hP.f31540I = mediaFormat.getInteger("sample-rate");
            dp = new DP(c3322hP);
            if (this.f35069k1) {
                int i4 = dp.f25154H;
                if (i4 == 3) {
                    rc = AbstractC3674o1.f33620a;
                } else if (i4 == 5) {
                    rc = AbstractC3674o1.f33621b;
                } else if (i4 == 6) {
                    rc = AbstractC3674o1.f33622c;
                } else if (i4 == 7) {
                    rc = AbstractC3674o1.f33623d;
                } else if (i4 != 8) {
                    RC rc2 = AbstractC3674o1.f33620a;
                } else {
                    rc = AbstractC3674o1.f33624e;
                }
            }
        }
        try {
            int i6 = Build.VERSION.SDK_INT;
            boolean z6 = true;
            if (i6 >= 29) {
                if (this.f28206F0) {
                    l();
                }
                AbstractC2792Sd.H(i6 >= 29);
            }
            C3859rP c3859rP = this.f35066h1;
            ME me = new ME(dp);
            me.f27062c = rc;
            AbstractC3627n8 abstractC3627n8 = this.f28211I;
            me.f27063d = abstractC3627n8;
            me.f27064e = this.J;
            if (!abstractC3627n8.g() && (c3860rQ = (C3860rQ) me.f27064e) != null) {
                if (((AbstractC3627n8) me.f27063d).e(c3860rQ.f34406a) == -1) {
                    z6 = false;
                }
                AbstractC2792Sd.i(z6);
            }
            c3859rP.q(new YO(me));
            j0(this.f28255o0);
        } catch (ZO e9) {
            throw n(e9, e9.f29664n, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final void a(C3947t5 c3947t5) {
        C3859rP c3859rP = this.f35066h1;
        c3859rP.getClass();
        float f2 = c3947t5.f35002a;
        String str = AbstractC3182eu.f30782a;
        C3947t5 c3947t52 = new C3947t5(Math.max(0.1f, Math.min(f2, 8.0f)), Math.max(0.1f, Math.min(c3947t5.f35003b, 8.0f)));
        c3859rP.f34401v = c3947t52;
        C3806qP c3806qP = new C3806qP(c3947t52, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b);
        if (c3859rP.l()) {
            c3859rP.f34399t = c3806qP;
        } else {
            c3859rP.f34400u = c3806qP;
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void a0() {
        this.f35066h1.f34360C = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3697oO
    public final void b(int i, Object obj) {
        LP lp;
        C3859rP c3859rP = this.f35066h1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (c3859rP.f34364G != floatValue) {
                c3859rP.f34364G = floatValue;
                if (c3859rP.l()) {
                    c3859rP.f34397r.f32035a.setVolume(c3859rP.f34364G);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C2764Qj c2764Qj = (C2764Qj) obj;
            c2764Qj.getClass();
            if (c3859rP.f34398s.equals(c2764Qj)) {
                return;
            }
            c3859rP.f34398s = c2764Qj;
            c3859rP.j();
            return;
        }
        if (i == 6) {
            C3016bo c3016bo = (C3016bo) obj;
            c3016bo.getClass();
            if (c3859rP.f34373Q.equals(c3016bo)) {
                return;
            }
            if (c3859rP.f34397r != null) {
                c3859rP.f34373Q.getClass();
            }
            c3859rP.f34373Q = c3016bo;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            c3859rP.f34374R = audioDeviceInfo;
            C3428jP c3428jP = c3859rP.f34397r;
            if (c3428jP != null) {
                c3428jP.f32035a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f35075s1 = ((Integer) obj).intValue();
            MP mp = this.f28254n0;
            if (mp == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f35075s1));
            mp.m(bundle);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            int i4 = c3859rP.f34375S;
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (i4 == intValue) {
                return;
            }
            c3859rP.f34375S = intValue;
            c3859rP.j();
            return;
        }
        if (i == 9) {
            obj.getClass();
            c3859rP.f34402w = ((Boolean) obj).booleanValue();
            C3806qP c3806qP = new C3806qP(c3859rP.f34401v, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b);
            if (c3859rP.l()) {
                c3859rP.f34399t = c3806qP;
                return;
            } else {
                c3859rP.f34400u = c3806qP;
                return;
            }
        }
        if (i != 10) {
            if (i != 11) {
                return;
            }
            QN qn = (QN) obj;
            qn.getClass();
            this.f28250j0 = qn;
            return;
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        if (c3859rP.f34372P) {
            if (c3859rP.f34371O == intValue2) {
                c3859rP.f34372P = false;
            }
            if (Build.VERSION.SDK_INT >= 35 || (lp = this.f35067i1) == null) {
            }
            lp.k(intValue2);
            return;
        }
        if (c3859rP.f34371O != intValue2) {
            c3859rP.f34371O = intValue2;
            c3859rP.j();
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean b0(long j6, long j9, MP mp, ByteBuffer byteBuffer, int i, int i4, int i6, long j10, boolean z6, boolean z9, DP dp) {
        byteBuffer.getClass();
        this.f35077u1 = com.anythink.basead.exoplayer.b.f7168b;
        if (this.f35071m1 != null && (i4 & 2) != 0) {
            mp.getClass();
            mp.t(i);
            return true;
        }
        C3859rP c3859rP = this.f35066h1;
        if (z6) {
            if (mp != null) {
                mp.t(i);
            }
            this.f28235U0.f35779f += i6;
            c3859rP.f34360C = true;
            return true;
        }
        try {
            if (!c3859rP.s(j10, byteBuffer, i6)) {
                this.f35077u1 = j10;
                return false;
            }
            if (mp != null) {
                mp.t(i);
            }
            this.f28235U0.f35778e += i6;
            return true;
        } catch (C2946aP e9) {
            DP dp2 = this.f35070l1;
            if (this.f28206F0) {
                l();
            }
            throw n(e9, dp2, false, 5001);
        } catch (C3000bP e10) {
            if (this.f28206F0) {
                l();
            }
            throw n(e10, dp, e10.f30080u, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void c(long j6, boolean z6, boolean z9) {
        super.c(j6, z6, z9);
        this.f35066h1.a();
        this.f35072n1 = j6;
        this.f35077u1 = com.anythink.basead.exoplayer.b.f7168b;
        this.f35074q1 = false;
        this.r1 = false;
        this.f35073o1 = true;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void c0(C4127wN c4127wN) {
        S0.l lVar = this.f35065g1;
        Handler handler = (Handler) lVar.f2926u;
        if (handler != null) {
            handler.post(new RunnableC3071cq(27, lVar, c4127wN));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void d() {
        this.f35066h1.r();
        this.f35076t1 = true;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void d0() {
        try {
            C3859rP c3859rP = this.f35066h1;
            if (!c3859rP.f34367K && c3859rP.l() && c3859rP.g()) {
                c3859rP.o();
                c3859rP.f34367K = true;
            }
            long j6 = this.f28237V0.f27967f;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                this.f35077u1 = j6;
            }
        } catch (C3000bP e9) {
            throw n(e9, e9.f30081v, e9.f30080u, true != this.f28206F0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void e() {
        w0();
        this.f35076t1 = false;
        C3859rP c3859rP = this.f35066h1;
        c3859rP.f34370N = false;
        if (c3859rP.l()) {
            C3428jP c3428jP = c3859rP.f34397r;
            C3482kP c3482kP = c3428jP.f32039e;
            c3482kP.f32212k = 0L;
            c3482kP.f32221t = 0;
            c3482kP.f32220s = 0;
            c3482kP.f32213l = 0L;
            c3482kP.f32226y = com.anythink.basead.exoplayer.b.f7168b;
            c3482kP.f32227z = com.anythink.basead.exoplayer.b.f7168b;
            if (c3482kP.f32222u == com.anythink.basead.exoplayer.b.f7168b) {
                c3482kP.f32210h.a(0);
            }
            c3482kP.f32224w = c3482kP.d();
            if (!c3428jP.f32043j || c3428jP.b()) {
                c3428jP.f32035a.pause();
            }
        }
        this.r1 = false;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void e0(long j6) {
        this.f35066h1.f34363F = j6;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void f() {
        S0.l lVar = this.f35065g1;
        this.p1 = true;
        this.f35070l1 = null;
        this.f35077u1 = com.anythink.basead.exoplayer.b.f7168b;
        this.r1 = false;
        try {
            try {
                this.f35066h1.a();
                super.f();
                C4181xN c4181xN = this.f28235U0;
                lVar.getClass();
                synchronized (c4181xN) {
                }
                Handler handler = (Handler) lVar.f2926u;
                if (handler != null) {
                    handler.post(new RunnableC3071cq(28, lVar, c4181xN));
                }
            } catch (Throwable th) {
                super.f();
                C4181xN c4181xN2 = this.f28235U0;
                lVar.getClass();
                synchronized (c4181xN2) {
                    Handler handler2 = (Handler) lVar.f2926u;
                    if (handler2 != null) {
                        handler2.post(new RunnableC3071cq(28, lVar, c4181xN2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            C4181xN c4181xN3 = this.f28235U0;
            lVar.getClass();
            synchronized (c4181xN3) {
                Handler handler3 = (Handler) lVar.f2926u;
                if (handler3 != null) {
                    handler3.post(new RunnableC3071cq(28, lVar, c4181xN3));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void f0(C4019uN c4019uN) {
        DP dp;
        if (Build.VERSION.SDK_INT < 29 || (dp = c4019uN.f35300c) == null || !Objects.equals(dp.f25176o, com.anythink.basead.exoplayer.k.o.f9213H) || !this.f28206F0) {
            return;
        }
        ByteBuffer byteBuffer = c4019uN.f35304g;
        byteBuffer.getClass();
        c4019uN.f35300c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            C3428jP c3428jP = this.f35066h1.f34397r;
            if (c3428jP != null) {
                c3428jP.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final boolean g() {
        boolean z6 = this.f35074q1;
        this.f35074q1 = false;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final long h() {
        if (this.f28196A == 2) {
            w0();
        }
        return this.f35072n1;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void i() {
        C3859rP c3859rP = this.f35066h1;
        this.f35074q1 = false;
        this.r1 = false;
        this.f35077u1 = com.anythink.basead.exoplayer.b.f7168b;
        try {
            try {
                this.f28206F0 = false;
                g0();
                x();
                if (this.p1) {
                    this.p1 = false;
                    c3859rP.b();
                }
            } finally {
                this.f28249i0 = null;
            }
        } catch (Throwable th) {
            if (this.p1) {
                this.p1 = false;
                c3859rP.b();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final C3947t5 j() {
        return this.f35066h1.f34401v;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void k() {
        LP lp;
        M m9;
        K k9;
        Handler handler;
        C4323b c4323b = this.f35066h1.f34395p;
        C3553lp c3553lp = (C3553lp) c4323b.f36419c;
        if (c3553lp != null) {
            c3553lp.e();
        }
        C2521Ce c2521Ce = (C2521Ce) c4323b.f36422f;
        if (c2521Ce != null && c2521Ce.f24909u) {
            c2521Ce.f24905B = null;
            Context context = c2521Ce.f24908n;
            AbstractC2659Kg.b(context).unregisterAudioDeviceCallback((LO) c2521Ce.f24912x);
            if (Build.VERSION.SDK_INT >= 32 && (m9 = (M) c2521Ce.f24904A) != null) {
                Spatializer spatializer = m9.f26994a;
                if (spatializer != null && (k9 = m9.f26997d) != null && (handler = m9.f26996c) != null) {
                    spatializer.removeOnSpatializerStateChangedListener(k9);
                    handler.removeCallbacksAndMessages(null);
                }
                c2521Ce.f24904A = null;
            }
            context.unregisterReceiver((Q0.d) c2521Ce.f24913y);
            MO mo = (MO) c2521Ce.f24914z;
            if (mo != null) {
                mo.f27084a.unregisterContentObserver(mo);
            }
            c2521Ce.f24909u = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (lp = this.f35067i1) == null) {
            return;
        }
        ((HashSet) lp.f26916u).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) lp.f26917v;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final String p() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final InterfaceC2999bO s0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void u0(boolean z6, boolean z9) {
        C4181xN c4181xN = new C4181xN();
        this.f28235U0 = c4181xN;
        S0.l lVar = this.f35065g1;
        Handler handler = (Handler) lVar.f2926u;
        if (handler != null) {
            handler.post(new WO(lVar, c4181xN, 8));
        }
        l();
        IO io = this.f28269y;
        io.getClass();
        C3859rP c3859rP = this.f35066h1;
        c3859rP.f34390k = io;
        V2 v22 = this.f28271z;
        v22.getClass();
        c3859rP.f34395p.f36420d = v22;
        c3859rP.f34391l = new C3557lt(this);
    }

    public final void w0() {
        long j6;
        ArrayDeque arrayDeque;
        long j9;
        J();
        C3859rP c3859rP = this.f35066h1;
        if (!c3859rP.l() || c3859rP.f34361D) {
            j6 = Long.MIN_VALUE;
        } else {
            long min = Math.min(c3859rP.f34397r.f32039e.a(), AbstractC3182eu.v(((VO) c3859rP.f34393n.f33688e).f28988b, c3859rP.m()));
            while (true) {
                arrayDeque = c3859rP.f34387g;
                if (arrayDeque.isEmpty() || min < ((C3806qP) arrayDeque.getFirst()).f34023c) {
                    break;
                } else {
                    c3859rP.f34400u = (C3806qP) arrayDeque.remove();
                }
            }
            C3806qP c3806qP = c3859rP.f34400u;
            long j10 = min - c3806qP.f34023c;
            long y7 = AbstractC3182eu.y(j10, c3806qP.f34021a.f35002a);
            boolean isEmpty = arrayDeque.isEmpty();
            C3504ku c3504ku = c3859rP.f34380X;
            if (isEmpty) {
                C3064cj c3064cj = (C3064cj) c3504ku.f32447w;
                if (c3064cj.i()) {
                    if (c3064cj.f30333n >= 1024) {
                        long j11 = c3064cj.f30332m;
                        c3064cj.f30329j.getClass();
                        long c9 = j11 - (r12.i.c() * (r12.f27102j * r12.f27095b));
                        int i = c3064cj.f30328h.f33536a;
                        int i4 = c3064cj.f30327g.f33536a;
                        j10 = i == i4 ? AbstractC3182eu.w(j10, c9, c3064cj.f30333n, RoundingMode.DOWN) : AbstractC3182eu.w(j10, c9 * i, c3064cj.f30333n * i4, RoundingMode.DOWN);
                    } else {
                        j10 = (long) (c3064cj.f30323c * j10);
                    }
                }
                C3806qP c3806qP2 = c3859rP.f34400u;
                j9 = c3806qP2.f34022b + j10;
                c3806qP2.f34024d = j10 - y7;
            } else {
                C3806qP c3806qP3 = c3859rP.f34400u;
                j9 = c3806qP3.f34022b + y7 + c3806qP3.f34024d;
            }
            long j12 = ((C4021uP) c3504ku.f32446v).f35311l;
            j6 = AbstractC3182eu.v(((VO) c3859rP.f34393n.f33688e).f28988b, j12) + j9;
            long j13 = c3859rP.f34377U;
            if (j12 > j13) {
                long v9 = AbstractC3182eu.v(((VO) c3859rP.f34393n.f33688e).f28988b, j12 - j13);
                c3859rP.f34377U = j12;
                c3859rP.f34378V += v9;
                if (c3859rP.f34379W == null) {
                    c3859rP.f34379W = new Handler(Looper.myLooper());
                }
                c3859rP.f34379W.removeCallbacksAndMessages(null);
                c3859rP.f34379W.postDelayed(new RunnableC3830qw(17, c3859rP), 100L);
            }
        }
        if (j6 != Long.MIN_VALUE) {
            if (!this.f35073o1) {
                j6 = Math.max(this.f35072n1, j6);
            }
            this.f35072n1 = j6;
            this.f35073o1 = false;
        }
    }
}
