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
import com.google.android.gms.internal.consent_sdk.C4300b;
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
public final class C3944tP extends RP implements InterfaceC2976bO {

    /* renamed from: k1, reason: collision with root package name */
    public final Context f34278k1;

    /* renamed from: l1, reason: collision with root package name */
    public final S0.l f34279l1;

    /* renamed from: m1, reason: collision with root package name */
    public final C3836rP f34280m1;
    public final S0.c n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f34281o1;
    public boolean p1;

    /* renamed from: q1, reason: collision with root package name */
    public DP f34282q1;

    /* renamed from: r1, reason: collision with root package name */
    public DP f34283r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f34284s1;

    /* renamed from: t1, reason: collision with root package name */
    public boolean f34285t1;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f34286u1;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f34287v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f34288w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f34289x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f34290y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f34291z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3944tP(Context context, C3193fa c3193fa, Handler handler, HN hn, C3836rP c3836rP) {
        super(context.getApplicationContext(), 1, c3193fa, r0);
        C3084dP c3084dP = C3084dP.f29775z;
        S0.c cVar = Build.VERSION.SDK_INT >= 35 ? new S0.c(27) : null;
        this.f34278k1 = context.getApplicationContext();
        this.f34280m1 = c3836rP;
        this.n1 = cVar;
        this.f34289x1 = -1000;
        this.f34279l1 = new S0.l(23, handler, hn);
        this.f34291z1 = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean I() {
        return this.f34280m1.t();
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean J() {
        if (!this.f27251X0) {
            return false;
        }
        C3836rP c3836rP = this.f34280m1;
        if (c3836rP.l()) {
            return c3836rP.f33599K && !c3836rP.t();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r4.isEmpty() ? null : (com.google.android.gms.internal.ads.OP) r4.get(0)) != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // com.google.android.gms.internal.ads.RP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(C3084dP c3084dP, DP dp) {
        int i;
        C3299hP c3299hP;
        C3500lC b9;
        boolean z3;
        String str = dp.f24431o;
        if (!H4.a(str)) {
            return 128;
        }
        int i6 = 1;
        int i9 = dp.f24416P;
        boolean z6 = i9 == 0;
        C3836rP c3836rP = this.f34280m1;
        if (z6) {
            if (i9 != 0) {
                List a9 = WP.a(com.anythink.basead.exoplayer.k.o.f8465w, false, false);
            }
            c3836rP.getClass();
            TO a10 = c3836rP.f33627p.a(c3836rP.n(dp));
            I2 i22 = new I2();
            i22.f25433a = a10.f27736a;
            i22.f25434b = a10.f27737b;
            i22.f25435c = a10.f27738c;
            OO b10 = i22.b();
            if (b10.f26601a) {
                i = true != b10.f26602b ? 512 : 1536;
                if (b10.f26603c) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (c3836rP.p(dp) != 0) {
                return i | 172;
            }
            if (com.anythink.basead.exoplayer.k.o.f8465w.equals(str) || c3836rP.p(dp) != 0) {
                c3299hP = new C3299hP();
                c3299hP.e(com.anythink.basead.exoplayer.k.o.f8465w);
                c3299hP.f30772G = dp.f24409H;
                c3299hP.f30774I = dp.J;
                c3299hP.J = 2;
                if (c3836rP.p(new DP(c3299hP)) != 0) {
                    if (dp.f24431o == null) {
                        b9 = C3500lC.f31745x;
                    } else {
                        if (c3836rP.p(dp) != 0) {
                            List a11 = WP.a(com.anythink.basead.exoplayer.k.o.f8465w, false, false);
                            OP op = a11.isEmpty() ? null : (OP) a11.get(0);
                            if (op != null) {
                                b9 = RB.j(op);
                            }
                        }
                        b9 = WP.b(c3084dP, dp, false, false);
                    }
                    if (!b9.isEmpty()) {
                        if (z6) {
                            OP op2 = (OP) b9.get(0);
                            Context context = this.f34278k1;
                            boolean b11 = op2.b(context, dp);
                            if (!b11) {
                                for (int i10 = 1; i10 < b9.f31747w; i10++) {
                                    OP op3 = (OP) b9.get(i10);
                                    if (op3.b(context, dp)) {
                                        b11 = true;
                                        z3 = false;
                                        op2 = op3;
                                        break;
                                    }
                                }
                            }
                            z3 = true;
                            int i11 = true != b11 ? 3 : 4;
                            int i12 = 8;
                            if (b11 && op2.c(dp)) {
                                i12 = 16;
                            }
                            return i11 | i12 | 32 | (true != op2.f26610g ? 0 : 64) | (true != z3 ? 0 : 128) | i;
                        }
                        i6 = 2;
                    }
                }
            }
            return i6 | 128;
        }
        i = 0;
        if (com.anythink.basead.exoplayer.k.o.f8465w.equals(str)) {
        }
        c3299hP = new C3299hP();
        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8465w);
        c3299hP.f30772G = dp.f24409H;
        c3299hP.f30774I = dp.J;
        c3299hP.J = 2;
        if (c3836rP.p(new DP(c3299hP)) != 0) {
        }
        return i6 | 128;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final ArrayList O(C3084dP c3084dP, DP dp) {
        C3500lC b9;
        if (dp.f24431o == null) {
            b9 = C3500lC.f31745x;
        } else {
            if (this.f34280m1.p(dp) != 0) {
                List a9 = WP.a(com.anythink.basead.exoplayer.k.o.f8465w, false, false);
                OP op = a9.isEmpty() ? null : (OP) a9.get(0);
                if (op != null) {
                    b9 = RB.j(op);
                }
            }
            b9 = WP.b(c3084dP, dp, false, false);
        }
        HashMap hashMap = WP.f28354a;
        ArrayList arrayList = new ArrayList(b9);
        Collections.sort(arrayList, new UP(new S0.e(26, this.f34278k1, dp)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean Q(DP dp) {
        l();
        return this.f34280m1.p(dp) != 0;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final C3864s R(OP op, DP dp, float f3) {
        int i;
        DP[] dpArr = this.f27210C;
        dpArr.getClass();
        int length = dpArr.length;
        String str = op.f26604a;
        "OMX.google.raw.decoder".equals(str);
        int i6 = dp.f24432p;
        int i9 = 0;
        if (length != 1) {
            for (DP dp2 : dpArr) {
                if (op.d(dp, dp2).f35155d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i6 = Math.max(i6, dp2.f24432p);
                }
            }
        }
        this.f34281o1 = i6;
        int i10 = Build.VERSION.SDK_INT;
        this.p1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i11 = this.f34281o1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", op.f26606c);
        int i12 = dp.f24409H;
        mediaFormat.setInteger("channel-count", i12);
        int i13 = dp.J;
        mediaFormat.setInteger("sample-rate", i13);
        AbstractC2968bG.i(mediaFormat, dp.f24434r);
        AbstractC2968bG.s(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger("priority", 0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f3);
        }
        String str2 = dp.f24431o;
        if ("audio/ac4".equals(str2)) {
            Pair c9 = AbstractC4228ym.c(dp);
            if (c9 != null) {
                AbstractC2968bG.s(mediaFormat, "profile", ((Integer) c9.first).intValue());
                AbstractC2968bG.s(mediaFormat, "level", ((Integer) c9.second).intValue());
            }
            if (i10 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        C3299hP c3299hP = new C3299hP();
        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8465w);
        c3299hP.f30772G = i12;
        c3299hP.f30774I = i13;
        c3299hP.J = 4;
        DP dp3 = new DP(c3299hP);
        C3836rP c3836rP = this.f34280m1;
        if (c3836rP.p(dp3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f34289x1));
        }
        DP dp4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            C4300b c4300b = c3836rP.f33627p;
            KO ko = c4300b != null ? (KO) c4300b.f35652e : null;
            int i14 = 12;
            if (ko == null) {
                AbstractC2968bG.y("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                XB xb = AbstractC3890sP.f33972a;
                Iterator it = ko.f25922d.iterator();
                while (true) {
                    AbstractC3499lB abstractC3499lB = (AbstractC3499lB) it;
                    if (!abstractC3499lB.hasNext()) {
                        i = 0;
                        break;
                    }
                    Integer num = (Integer) abstractC3499lB.next();
                    i = num.intValue();
                    if (AbstractC3890sP.f33972a.contains(num)) {
                        break;
                    }
                }
                if (i != 0) {
                    i14 = i;
                } else {
                    Iterator it2 = ko.f25921c.iterator();
                    while (true) {
                        AbstractC3499lB abstractC3499lB2 = (AbstractC3499lB) it2;
                        if (!abstractC3499lB2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) abstractC3499lB2.next();
                        int intValue = num2.intValue();
                        if (AbstractC3890sP.f33972a.contains(num2)) {
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
        i0(mediaFormat);
        if (com.anythink.basead.exoplayer.k.o.f8465w.equals(op.f26605b) && !com.anythink.basead.exoplayer.k.o.f8465w.equals(str2)) {
            dp4 = dp;
        }
        this.f34283r1 = dp4;
        return new C3864s(op, mediaFormat, dp, null, this.n1, 12);
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final C4212yN S(OP op, DP dp, DP dp2, boolean z3) {
        int i;
        int i6;
        C4212yN d2 = op.d(dp, dp2);
        boolean z6 = this.f27265n0 == null && Q(dp2);
        int i9 = d2.f35156e;
        if (z6) {
            i9 |= 32768;
        }
        "OMX.google.raw.decoder".equals(op.f26604a);
        if (dp2.f24432p > this.f34281o1) {
            i9 |= 64;
        }
        if (i9 != 0) {
            i = 0;
            i6 = i9;
        } else {
            i = d2.f35155d;
            i6 = 0;
        }
        return new C4212yN(op.f26604a, dp, dp2, i, i6);
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final long T(long j6) {
        long w6;
        C3836rP c3836rP = this.f34280m1;
        boolean z3 = c3836rP.t() && this.f34291z1 != com.anythink.basead.exoplayer.b.f6382b;
        if (this.f34290y1) {
            if (!c3836rP.l()) {
                w6 = -9223372036854775807L;
            } else if (c3836rP.f33625n.n()) {
                w6 = AbstractC3159eu.v(((VO) c3836rP.f33625n.f32901e).f28192b, c3836rP.f33629r.f31248a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = c3836rP.f33629r.f31248a.getBufferSizeInFrames();
                int Q8 = MA.Q(((VO) c3836rP.f33625n.f32901e).f28191a);
                AbstractC2772Sd.H(Q8 != -2147483647);
                w6 = AbstractC3159eu.w(bufferSizeInFrames, 1000000L, Q8, RoundingMode.DOWN);
            }
            if (this.f34288w1 && z3 && w6 != com.anythink.basead.exoplayer.b.f6382b) {
                float min = Math.min(w6, this.f34291z1 - j6);
                C3924t5 c3924t5 = c3836rP.f33633v;
                return Math.max(10000L, (long) ((min / (c3924t5 != null ? c3924t5.f34216a : 1.0f)) / 2.0f));
            }
        } else if (z3 || this.f27251X0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final float U(float f3, DP dp, DP[] dpArr) {
        int i = -1;
        for (DP dp2 : dpArr) {
            int i6 = dp2.J;
            if (i6 != -1) {
                i = Math.max(i, i6);
            }
        }
        if (i == -1) {
            MediaFormat mediaFormat = this.f27273u0;
            i = (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) ? -1 : mediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f3;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void V(String str, long j6, long j9) {
        S0.l lVar = this.f34279l1;
        Handler handler = (Handler) lVar.f2797u;
        if (handler != null) {
            handler.post(new WO(lVar, str, j6, j9));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void W(String str) {
        S0.l lVar = this.f34279l1;
        Handler handler = (Handler) lVar.f2797u;
        if (handler != null) {
            handler.post(new WO(lVar, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void X(Exception exc) {
        AbstractC2968bG.J("MediaCodecAudioRenderer", "Audio codec error", exc);
        S0.l lVar = this.f34279l1;
        Handler handler = (Handler) lVar.f2797u;
        if (handler != null) {
            handler.post(new WO(lVar, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final C4212yN Y(S0.l lVar) {
        DP dp = (DP) lVar.f2798v;
        dp.getClass();
        this.f34282q1 = dp;
        C4212yN Y = super.Y(lVar);
        S0.l lVar2 = this.f34279l1;
        Handler handler = (Handler) lVar2.f2797u;
        if (handler != null) {
            handler.post(new RunnableC3865s0(15, lVar2, dp, Y));
        }
        return Y;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void Z(DP dp, MediaFormat mediaFormat) {
        int integer;
        C3676oQ c3676oQ;
        DP dp2 = this.f34283r1;
        RC rc = null;
        if (dp2 != null) {
            dp = dp2;
        } else if (this.f27270s0 != null) {
            mediaFormat.getClass();
            int integer2 = com.anythink.basead.exoplayer.k.o.f8465w.equals(dp.f24431o) ? dp.f24411K : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? AbstractC3159eu.b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            int integer3 = mediaFormat.getInteger("channel-count");
            int i = dp.f24410I;
            if (i == -1 || dp.f24409H != integer3) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer3) {
                i = integer;
            }
            C3299hP c3299hP = new C3299hP();
            c3299hP.e(com.anythink.basead.exoplayer.k.o.f8465w);
            c3299hP.J = integer2;
            c3299hP.f30775K = dp.f24412L;
            c3299hP.f30776L = dp.f24413M;
            c3299hP.f30789k = dp.f24428l;
            c3299hP.f30780a = dp.f24418a;
            c3299hP.f30781b = dp.f24419b;
            c3299hP.f30782c = RB.n(dp.f24420c);
            c3299hP.f30783d = dp.f24421d;
            c3299hP.f30784e = dp.f24422e;
            c3299hP.f30785f = dp.f24423f;
            c3299hP.f30772G = integer3;
            c3299hP.f30773H = i;
            c3299hP.f30774I = mediaFormat.getInteger("sample-rate");
            dp = new DP(c3299hP);
            if (this.p1) {
                int i6 = dp.f24409H;
                if (i6 == 3) {
                    rc = AbstractC3651o1.f32833a;
                } else if (i6 == 5) {
                    rc = AbstractC3651o1.f32834b;
                } else if (i6 == 6) {
                    rc = AbstractC3651o1.f32835c;
                } else if (i6 == 7) {
                    rc = AbstractC3651o1.f32836d;
                } else if (i6 != 8) {
                    RC rc2 = AbstractC3651o1.f32833a;
                } else {
                    rc = AbstractC3651o1.f32837e;
                }
            }
        }
        try {
            int i9 = Build.VERSION.SDK_INT;
            boolean z3 = true;
            if (i9 >= 29) {
                if (this.f27225K0) {
                    l();
                }
                AbstractC2772Sd.H(i9 >= 29);
            }
            C3836rP c3836rP = this.f34280m1;
            ME me = new ME(dp);
            me.f26271c = rc;
            AbstractC3604n8 abstractC3604n8 = this.f27221I;
            me.f26272d = abstractC3604n8;
            me.f26273e = this.J;
            if (!abstractC3604n8.g() && (c3676oQ = (C3676oQ) me.f26273e) != null) {
                if (((AbstractC3604n8) me.f26272d).e(c3676oQ.f32905a) == -1) {
                    z3 = false;
                }
                AbstractC2772Sd.i(z3);
            }
            c3836rP.q(new YO(me));
            j0(this.f27271t0);
        } catch (ZO e9) {
            throw n(e9, e9.f28884n, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final void a(C3924t5 c3924t5) {
        C3836rP c3836rP = this.f34280m1;
        c3836rP.getClass();
        float f3 = c3924t5.f34216a;
        String str = AbstractC3159eu.f29993a;
        C3924t5 c3924t52 = new C3924t5(Math.max(0.1f, Math.min(f3, 8.0f)), Math.max(0.1f, Math.min(c3924t5.f34217b, 8.0f)));
        c3836rP.f33633v = c3924t52;
        C3783qP c3783qP = new C3783qP(c3924t52, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b);
        if (c3836rP.l()) {
            c3836rP.f33631t = c3783qP;
        } else {
            c3836rP.f33632u = c3783qP;
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void a0() {
        this.f34280m1.f33592C = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3674oO
    public final void b(int i, Object obj) {
        S0.c cVar;
        C3836rP c3836rP = this.f34280m1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (c3836rP.f33596G != floatValue) {
                c3836rP.f33596G = floatValue;
                if (c3836rP.l()) {
                    c3836rP.f33629r.f31248a.setVolume(c3836rP.f33596G);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C2744Qj c2744Qj = (C2744Qj) obj;
            c2744Qj.getClass();
            if (c3836rP.f33630s.equals(c2744Qj)) {
                return;
            }
            c3836rP.f33630s = c2744Qj;
            c3836rP.j();
            return;
        }
        if (i == 6) {
            C2939ao c2939ao = (C2939ao) obj;
            c2939ao.getClass();
            if (c3836rP.f33605Q.equals(c2939ao)) {
                return;
            }
            if (c3836rP.f33629r != null) {
                c3836rP.f33605Q.getClass();
            }
            c3836rP.f33605Q = c2939ao;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            c3836rP.f33606R = audioDeviceInfo;
            C3405jP c3405jP = c3836rP.f33629r;
            if (c3405jP != null) {
                c3405jP.f31248a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f34289x1 = ((Integer) obj).intValue();
            LP lp = this.f27270s0;
            if (lp == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f34289x1));
            lp.j(bundle);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            int i6 = c3836rP.f33607S;
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (i6 == intValue) {
                return;
            }
            c3836rP.f33607S = intValue;
            c3836rP.j();
            return;
        }
        if (i == 9) {
            obj.getClass();
            c3836rP.f33634w = ((Boolean) obj).booleanValue();
            C3783qP c3783qP = new C3783qP(c3836rP.f33633v, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b);
            if (c3836rP.l()) {
                c3836rP.f33631t = c3783qP;
                return;
            } else {
                c3836rP.f33632u = c3783qP;
                return;
            }
        }
        if (i != 10) {
            if (i != 11) {
                return;
            }
            QN qn = (QN) obj;
            qn.getClass();
            this.f27266o0 = qn;
            return;
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        if (c3836rP.f33604P) {
            if (c3836rP.f33603O == intValue2) {
                c3836rP.f33604P = false;
            }
            if (Build.VERSION.SDK_INT >= 35 || (cVar = this.n1) == null) {
            }
            cVar.s(intValue2);
            return;
        }
        if (c3836rP.f33603O != intValue2) {
            c3836rP.f33603O = intValue2;
            c3836rP.j();
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean b0(long j6, long j9, LP lp, ByteBuffer byteBuffer, int i, int i6, int i9, long j10, boolean z3, boolean z6, DP dp) {
        byteBuffer.getClass();
        this.f34291z1 = com.anythink.basead.exoplayer.b.f6382b;
        if (this.f34283r1 != null && (i6 & 2) != 0) {
            lp.getClass();
            lp.q(i);
            return true;
        }
        C3836rP c3836rP = this.f34280m1;
        if (z3) {
            if (lp != null) {
                lp.q(i);
            }
            this.f27254Z0.f34998f += i9;
            c3836rP.f33592C = true;
            return true;
        }
        try {
            if (!c3836rP.s(j10, byteBuffer, i9)) {
                this.f34291z1 = j10;
                return false;
            }
            if (lp != null) {
                lp.q(i);
            }
            this.f27254Z0.f34997e += i9;
            return true;
        } catch (C2923aP e9) {
            DP dp2 = this.f34282q1;
            if (this.f27225K0) {
                l();
            }
            throw n(e9, dp2, false, 5001);
        } catch (C2977bP e10) {
            if (this.f27225K0) {
                l();
            }
            throw n(e10, dp, e10.f29292u, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void c(long j6, boolean z3, boolean z6) {
        super.c(j6, z3, z6);
        this.f34280m1.a();
        this.f34284s1 = j6;
        this.f34291z1 = com.anythink.basead.exoplayer.b.f6382b;
        this.f34287v1 = false;
        this.f34288w1 = false;
        this.f34285t1 = true;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void c0(C4104wN c4104wN) {
        S0.l lVar = this.f34279l1;
        Handler handler = (Handler) lVar.f2797u;
        if (handler != null) {
            handler.post(new RunnableC3048cq(27, lVar, c4104wN));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void d() {
        this.f34280m1.r();
        this.f34290y1 = true;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void d0() {
        try {
            C3836rP c3836rP = this.f34280m1;
            if (!c3836rP.f33599K && c3836rP.l() && c3836rP.g()) {
                c3836rP.o();
                c3836rP.f33599K = true;
            }
            long j6 = this.f27255a1.f27030f;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                this.f34291z1 = j6;
            }
        } catch (C2977bP e9) {
            throw n(e9, e9.f29293v, e9.f29292u, true != this.f27225K0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void e() {
        w0();
        this.f34290y1 = false;
        C3836rP c3836rP = this.f34280m1;
        c3836rP.f33602N = false;
        if (c3836rP.l()) {
            C3405jP c3405jP = c3836rP.f33629r;
            C3459kP c3459kP = c3405jP.f31252e;
            c3459kP.f31433k = 0L;
            c3459kP.f31442t = 0;
            c3459kP.f31441s = 0;
            c3459kP.f31434l = 0L;
            c3459kP.f31447y = com.anythink.basead.exoplayer.b.f6382b;
            c3459kP.f31448z = com.anythink.basead.exoplayer.b.f6382b;
            if (c3459kP.f31443u == com.anythink.basead.exoplayer.b.f6382b) {
                c3459kP.f31431h.a(0);
            }
            c3459kP.f31445w = c3459kP.d();
            if (!c3405jP.f31256j || c3405jP.b()) {
                c3405jP.f31248a.pause();
            }
        }
        this.f34288w1 = false;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void e0(long j6) {
        this.f34280m1.f33595F = j6;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void f() {
        S0.l lVar = this.f34279l1;
        this.f34286u1 = true;
        this.f34282q1 = null;
        this.f34291z1 = com.anythink.basead.exoplayer.b.f6382b;
        this.f34288w1 = false;
        try {
            try {
                this.f34280m1.a();
                super.f();
                C4158xN c4158xN = this.f27254Z0;
                lVar.getClass();
                synchronized (c4158xN) {
                }
                Handler handler = (Handler) lVar.f2797u;
                if (handler != null) {
                    handler.post(new RunnableC3048cq(28, lVar, c4158xN));
                }
            } catch (Throwable th) {
                super.f();
                C4158xN c4158xN2 = this.f27254Z0;
                lVar.getClass();
                synchronized (c4158xN2) {
                    Handler handler2 = (Handler) lVar.f2797u;
                    if (handler2 != null) {
                        handler2.post(new RunnableC3048cq(28, lVar, c4158xN2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            C4158xN c4158xN3 = this.f27254Z0;
            lVar.getClass();
            synchronized (c4158xN3) {
                Handler handler3 = (Handler) lVar.f2797u;
                if (handler3 != null) {
                    handler3.post(new RunnableC3048cq(28, lVar, c4158xN3));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void f0(C3996uN c3996uN) {
        DP dp;
        if (Build.VERSION.SDK_INT < 29 || (dp = c3996uN.f34526c) == null || !Objects.equals(dp.f24431o, com.anythink.basead.exoplayer.k.o.f8427H) || !this.f27225K0) {
            return;
        }
        ByteBuffer byteBuffer = c3996uN.f34530g;
        byteBuffer.getClass();
        c3996uN.f34526c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            C3405jP c3405jP = this.f34280m1.f33629r;
            if (c3405jP != null) {
                c3405jP.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final boolean g() {
        boolean z3 = this.f34287v1;
        this.f34287v1 = false;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final long h() {
        if (this.f27206A == 2) {
            w0();
        }
        return this.f34284s1;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void i() {
        C3836rP c3836rP = this.f34280m1;
        this.f34287v1 = false;
        this.f34288w1 = false;
        this.f34291z1 = com.anythink.basead.exoplayer.b.f6382b;
        try {
            try {
                this.f27225K0 = false;
                g0();
                x();
                if (this.f34286u1) {
                    this.f34286u1 = false;
                    c3836rP.b();
                }
            } finally {
                this.f27265n0 = null;
            }
        } catch (Throwable th) {
            if (this.f34286u1) {
                this.f34286u1 = false;
                c3836rP.b();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final C3924t5 j() {
        return this.f34280m1.f33633v;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void k() {
        S0.c cVar;
        M m4;
        K k9;
        Handler handler;
        C4300b c4300b = this.f34280m1.f33627p;
        C3530lp c3530lp = (C3530lp) c4300b.f35650c;
        if (c3530lp != null) {
            c3530lp.e();
        }
        C2501Ce c2501Ce = (C2501Ce) c4300b.f35653f;
        if (c2501Ce != null && c2501Ce.f24174u) {
            c2501Ce.f24170B = null;
            Context context = c2501Ce.f24173n;
            AbstractC2639Kg.b(context).unregisterAudioDeviceCallback((LO) c2501Ce.f24177x);
            if (Build.VERSION.SDK_INT >= 32 && (m4 = (M) c2501Ce.f24169A) != null) {
                Spatializer spatializer = m4.f26203a;
                if (spatializer != null && (k9 = m4.f26206d) != null && (handler = m4.f26205c) != null) {
                    spatializer.removeOnSpatializerStateChangedListener(k9);
                    handler.removeCallbacksAndMessages(null);
                }
                c2501Ce.f24169A = null;
            }
            context.unregisterReceiver((Q0.d) c2501Ce.f24178y);
            MO mo = (MO) c2501Ce.f24179z;
            if (mo != null) {
                mo.f26293a.unregisterContentObserver(mo);
            }
            c2501Ce.f24174u = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (cVar = this.n1) == null) {
            return;
        }
        ((HashSet) cVar.f2775u).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) cVar.f2776v;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final String p() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final InterfaceC2976bO s0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void u0(boolean z3, boolean z6) {
        C4158xN c4158xN = new C4158xN();
        this.f27254Z0 = c4158xN;
        S0.l lVar = this.f34279l1;
        Handler handler = (Handler) lVar.f2797u;
        if (handler != null) {
            handler.post(new WO(lVar, c4158xN, 8));
        }
        l();
        IO io = this.f27280y;
        io.getClass();
        C3836rP c3836rP = this.f34280m1;
        c3836rP.f33622k = io;
        V2 v22 = this.f27282z;
        v22.getClass();
        c3836rP.f33627p.f35651d = v22;
        c3836rP.f33623l = new C3534lt(this);
    }

    public final void w0() {
        long j6;
        ArrayDeque arrayDeque;
        long j9;
        J();
        C3836rP c3836rP = this.f34280m1;
        if (!c3836rP.l() || c3836rP.f33593D) {
            j6 = Long.MIN_VALUE;
        } else {
            long min = Math.min(c3836rP.f33629r.f31252e.a(), AbstractC3159eu.v(((VO) c3836rP.f33625n.f32901e).f28192b, c3836rP.m()));
            while (true) {
                arrayDeque = c3836rP.f33619g;
                if (arrayDeque.isEmpty() || min < ((C3783qP) arrayDeque.getFirst()).f33239c) {
                    break;
                } else {
                    c3836rP.f33632u = (C3783qP) arrayDeque.remove();
                }
            }
            C3783qP c3783qP = c3836rP.f33632u;
            long j10 = min - c3783qP.f33239c;
            long y7 = AbstractC3159eu.y(j10, c3783qP.f33237a.f34216a);
            boolean isEmpty = arrayDeque.isEmpty();
            C3481ku c3481ku = c3836rP.f33612X;
            if (isEmpty) {
                C3041cj c3041cj = (C3041cj) c3481ku.f31665w;
                if (c3041cj.i()) {
                    if (c3041cj.f29548n >= 1024) {
                        long j11 = c3041cj.f29547m;
                        c3041cj.f29544j.getClass();
                        long c9 = j11 - (r12.i.c() * (r12.f26313j * r12.f26306b));
                        int i = c3041cj.f29543h.f32749a;
                        int i6 = c3041cj.f29542g.f32749a;
                        j10 = i == i6 ? AbstractC3159eu.w(j10, c9, c3041cj.f29548n, RoundingMode.DOWN) : AbstractC3159eu.w(j10, c9 * i, c3041cj.f29548n * i6, RoundingMode.DOWN);
                    } else {
                        j10 = (long) (c3041cj.f29538c * j10);
                    }
                }
                C3783qP c3783qP2 = c3836rP.f33632u;
                j9 = c3783qP2.f33238b + j10;
                c3783qP2.f33240d = j10 - y7;
            } else {
                C3783qP c3783qP3 = c3836rP.f33632u;
                j9 = c3783qP3.f33238b + y7 + c3783qP3.f33240d;
            }
            long j12 = ((C3998uP) c3481ku.f31664v).f34537l;
            j6 = AbstractC3159eu.v(((VO) c3836rP.f33625n.f32901e).f28192b, j12) + j9;
            long j13 = c3836rP.f33609U;
            if (j12 > j13) {
                long v9 = AbstractC3159eu.v(((VO) c3836rP.f33625n.f32901e).f28192b, j12 - j13);
                c3836rP.f33609U = j12;
                c3836rP.f33610V += v9;
                if (c3836rP.f33611W == null) {
                    c3836rP.f33611W = new Handler(Looper.myLooper());
                }
                c3836rP.f33611W.removeCallbacksAndMessages(null);
                c3836rP.f33611W.postDelayed(new RunnableC3807qw(17, c3836rP), 100L);
            }
        }
        if (j6 != Long.MIN_VALUE) {
            if (!this.f34285t1) {
                j6 = Math.max(this.f34284s1, j6);
            }
            this.f34284s1 = j6;
            this.f34285t1 = false;
        }
    }
}
