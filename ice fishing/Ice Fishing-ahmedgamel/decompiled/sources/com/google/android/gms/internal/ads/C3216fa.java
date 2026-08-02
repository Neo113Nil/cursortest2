package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.anythink.expressad.foundation.d.d;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3216fa implements InterfaceC3765pl, InterfaceC3254gB {

    /* renamed from: n, reason: collision with root package name */
    public final Context f31039n;

    public /* synthetic */ C3216fa(Context context, boolean z6) {
        this.f31039n = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        ((InterfaceC2561Ek) obj).a(this.f31039n);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MP b(C3887s c3887s) {
        String str;
        MediaCodec mediaCodec;
        int i;
        NP hp;
        EP ep;
        Context context;
        int i4 = Build.VERSION.SDK_INT;
        int i6 = 0;
        EP ep2 = null;
        r5 = null;
        MediaCodec mediaCodec2 = null;
        ep2 = null;
        if (i4 >= 31 || ((context = this.f31039n) != null && i4 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int f2 = H4.f(((DP) c3887s.f34556w).f25176o);
            switch (f2) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = com.anythink.core.common.v.m.f17596e;
                    break;
                case 0:
                    str = com.anythink.core.express.b.a.f18317f;
                    break;
                case 1:
                    str = com.anythink.basead.exoplayer.k.o.f9231b;
                    break;
                case 2:
                    str = com.anythink.basead.exoplayer.k.o.f9230a;
                    break;
                case 3:
                    str = com.anythink.basead.exoplayer.k.o.f9232c;
                    break;
                case 4:
                    str = d.c.f19422e;
                    break;
                case 5:
                    str = "metadata";
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            AbstractC2991bG.t("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            PP pp = (PP) c3887s.f34554u;
            String str2 = pp.f27597a;
            try {
                StringBuilder sb = new StringBuilder(str2.length() + 12);
                sb.append("createCodec:");
                sb.append(str2);
                Trace.beginSection(sb.toString());
                mediaCodec = MediaCodec.createByCodecName(str2);
                try {
                    if (i4 >= 36) {
                        hp = new C3557lt(17, mediaCodec);
                        i = 4;
                    } else {
                        i = 0;
                        hp = new HP(mediaCodec, new HandlerThread(EP.c(f2, "ExoPlayer:MediaCodecQueueingThread:")), new C2818Tm());
                    }
                    ep = new EP(mediaCodec, new HandlerThread(EP.c(f2, "ExoPlayer:MediaCodecAsyncAdapter:")), hp, (LP) c3887s.f34558y);
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Exception e10) {
                e = e10;
                mediaCodec = null;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) c3887s.f34557x;
                if (surface == null && pp.f27604h && i4 >= 35) {
                    i |= 8;
                }
                ep.a((MediaFormat) c3887s.f34555v, surface, i);
                return ep;
            } catch (Exception e11) {
                e = e11;
                ep2 = ep;
                if (ep2 != null) {
                    ep2.l();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
        try {
            PP pp2 = (PP) c3887s.f34554u;
            String str3 = pp2.f27597a;
            Trace.beginSection("createCodec:".concat(str3));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str3);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface2 = (Surface) c3887s.f34557x;
                if (surface2 == null && pp2.f27604h && i4 >= 35) {
                    i6 = 8;
                }
                createByCodecName.configure((MediaFormat) c3887s.f34555v, surface2, (MediaCrypto) null, i6);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new S0.l(createByCodecName, (LP) c3887s.f34558y);
            } catch (IOException e12) {
                e = e12;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                throw e;
            } catch (RuntimeException e13) {
                e = e13;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                }
                throw e;
            }
        } catch (IOException e14) {
            e = e14;
        } catch (RuntimeException e15) {
            e = e15;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public /* synthetic */ Object mo14c() {
        int i = EN.f25344A;
        return new C3672o(this.f31039n);
    }

    public boolean d(Intent intent) {
        R2.w.i(intent, "Intent can not be null");
        return !this.f31039n.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public C3216fa(Context context) {
        R2.w.i(context, "Context can not be null");
        this.f31039n = context;
    }
}
