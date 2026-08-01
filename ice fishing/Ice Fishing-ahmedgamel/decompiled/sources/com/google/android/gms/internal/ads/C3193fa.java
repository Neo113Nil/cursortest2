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
public final class C3193fa implements InterfaceC3742pl, InterfaceC3231gB {

    /* renamed from: n, reason: collision with root package name */
    public final Context f30251n;

    public /* synthetic */ C3193fa(Context context, boolean z3) {
        this.f30251n = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        ((InterfaceC2541Ek) obj).a(this.f30251n);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LP b(C3864s c3864s) {
        String str;
        MediaCodec mediaCodec;
        int i;
        MP hp;
        EP ep;
        Context context;
        int i6 = Build.VERSION.SDK_INT;
        int i9 = 0;
        EP ep2 = null;
        r5 = null;
        MediaCodec mediaCodec2 = null;
        ep2 = null;
        if (i6 >= 31 || ((context = this.f30251n) != null && i6 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int f3 = H4.f(((DP) c3864s.f33788w).f24431o);
            switch (f3) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = com.anythink.core.common.v.m.f16809e;
                    break;
                case 0:
                    str = com.anythink.core.express.b.a.f17530f;
                    break;
                case 1:
                    str = com.anythink.basead.exoplayer.k.o.f8445b;
                    break;
                case 2:
                    str = com.anythink.basead.exoplayer.k.o.f8444a;
                    break;
                case 3:
                    str = com.anythink.basead.exoplayer.k.o.f8446c;
                    break;
                case 4:
                    str = d.c.f18635e;
                    break;
                case 5:
                    str = "metadata";
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            AbstractC2968bG.t("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            OP op = (OP) c3864s.f33786u;
            String str2 = op.f26604a;
            try {
                StringBuilder sb = new StringBuilder(str2.length() + 12);
                sb.append("createCodec:");
                sb.append(str2);
                Trace.beginSection(sb.toString());
                mediaCodec = MediaCodec.createByCodecName(str2);
                try {
                    if (i6 >= 36) {
                        hp = new C3534lt(17, mediaCodec);
                        i = 4;
                    } else {
                        i = 0;
                        hp = new HP(mediaCodec, new HandlerThread(EP.c(f3, "ExoPlayer:MediaCodecQueueingThread:")), new C2781Sm());
                    }
                    ep = new EP(mediaCodec, new HandlerThread(EP.c(f3, "ExoPlayer:MediaCodecAsyncAdapter:")), hp, (S0.c) c3864s.f33790y);
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Exception e10) {
                e = e10;
                mediaCodec = null;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) c3864s.f33789x;
                if (surface == null && op.f26611h && i6 >= 35) {
                    i |= 8;
                }
                ep.a((MediaFormat) c3864s.f33787v, surface, i);
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
            OP op2 = (OP) c3864s.f33786u;
            String str3 = op2.f26604a;
            Trace.beginSection("createCodec:".concat(str3));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str3);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface2 = (Surface) c3864s.f33789x;
                if (surface2 == null && op2.f26611h && i6 >= 35) {
                    i9 = 8;
                }
                createByCodecName.configure((MediaFormat) c3864s.f33787v, surface2, (MediaCrypto) null, i9);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new S0.l(createByCodecName, (S0.c) c3864s.f33790y);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Object mo15c() {
        int i = EN.f24583A;
        return new C3649o(this.f30251n);
    }

    public boolean d(Intent intent) {
        P2.w.i(intent, "Intent can not be null");
        return !this.f30251n.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public C3193fa(Context context) {
        P2.w.i(context, "Context can not be null");
        this.f30251n = context;
    }
}
