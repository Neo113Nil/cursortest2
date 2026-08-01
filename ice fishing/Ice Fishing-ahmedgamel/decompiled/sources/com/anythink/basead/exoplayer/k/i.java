package com.anythink.basead.exoplayer.k;

import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.anythink.basead.exoplayer.a.b;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.i.e;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class i implements com.anythink.basead.exoplayer.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8399a = "EventLogger";

    /* renamed from: b, reason: collision with root package name */
    private static final int f8400b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final NumberFormat f8401c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.e f8402d;

    /* renamed from: e, reason: collision with root package name */
    private final ae.b f8403e = new ae.b();

    /* renamed from: f, reason: collision with root package name */
    private final ae.a f8404f = new ae.a();

    /* renamed from: g, reason: collision with root package name */
    private final long f8405g = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f8401c = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    private i(com.anythink.basead.exoplayer.i.e eVar) {
        this.f8402d = eVar;
    }

    private String i(b.a aVar) {
        String str = "window=" + aVar.f6304c;
        if (aVar.f6305d != null) {
            StringBuilder c9 = AbstractC5049e.c(str, ", period=");
            c9.append(aVar.f6305d.f7767a);
            str = c9.toString();
            if (aVar.f6305d.a()) {
                StringBuilder c10 = AbstractC5049e.c(str, ", adGroup=");
                c10.append(aVar.f6305d.f7768b);
                StringBuilder c11 = AbstractC5049e.c(c10.toString(), ", ad=");
                c11.append(aVar.f6305d.f7769c);
                str = c11.toString();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(aVar.f6302a - this.f8405g));
        sb.append(", ");
        return D.y.s(sb, a(aVar.f6307f), ", ", str);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b() {
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void c() {
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void d() {
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void e(b.a aVar, int i) {
        a(aVar, "decoderDisabled", f(i));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void f(b.a aVar, int i) {
        a(aVar, "audioSessionId", Integer.toString(i));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void g(b.a aVar, int i) {
        a(aVar, "droppedFrames", Integer.toString(i));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void h(b.a aVar) {
        a(aVar, "drmKeysRemoved");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, boolean z3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z3);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
        a(aVar, com.anythink.core.express.b.a.f17526b, sb.toString());
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar, boolean z3) {
        a(aVar, com.anythink.core.express.b.a.f17529e, Boolean.toString(z3));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void c(b.a aVar) {
        a(aVar, "mediaPeriodCreated");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void d(b.a aVar, int i) {
        a(aVar, "decoderEnabled", f(i));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void e(b.a aVar) {
        a(aVar, "mediaPeriodReadingStarted");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void f(b.a aVar) {
        a(aVar, "drmKeysLoaded");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void g(b.a aVar) {
        a(aVar, "drmKeysRestored");
    }

    private static String c(int i) {
        if (i == 0) {
            return "OFF";
        }
        if (i == 1) {
            return "ONE";
        }
        if (i != 2) {
            return "?";
        }
        return "ALL";
    }

    private static String e(int i) {
        if (i == 0) {
            return "PREPARED";
        }
        if (i == 1) {
            return "RESET";
        }
        if (i != 2) {
            return "?";
        }
        return "DYNAMIC";
    }

    private static String f(int i) {
        if (i == 0) {
            return com.anythink.core.express.b.a.f17530f;
        }
        if (i == 1) {
            return o.f8445b;
        }
        if (i == 2) {
            return o.f8444a;
        }
        if (i == 3) {
            return o.f8446c;
        }
        if (i == 4) {
            return "metadata";
        }
        if (i == 5) {
            return "none";
        }
        if (i >= 10000) {
            return D.y.k(i, "custom (", ")");
        }
        return "?";
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar) {
        a(aVar, "seekProcessed");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void d(b.a aVar) {
        a(aVar, "mediaPeriodReleased");
    }

    private static String d(int i) {
        if (i == 0) {
            return "PERIOD_TRANSITION";
        }
        if (i == 1) {
            return "SEEK";
        }
        if (i == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (i == 3) {
            return "AD_INSERTION";
        }
        if (i != 4) {
            return "?";
        }
        return "INTERNAL";
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar, int i, int i6) {
        a(aVar, "videoSizeChanged", i + ", " + i6);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar, t.c cVar) {
        a(aVar, "upstreamDiscarded", com.anythink.basead.exoplayer.m.c(cVar.f7813c));
    }

    private String b(b.a aVar, String str) {
        return u1.h.g(AbstractC5049e.c(str, " ["), i(aVar), "]");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void c(b.a aVar, int i) {
        String str;
        if (i == 0) {
            str = "OFF";
        } else if (i == 1) {
            str = "ONE";
        } else if (i != 2) {
            str = "?";
        } else {
            str = "ALL";
        }
        a(aVar, "repeatMode", str);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, boolean z3) {
        a(aVar, "shuffleModeEnabled", Boolean.toString(z3));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar) {
        a(aVar, "seekStarted");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.basead.exoplayer.v vVar) {
        a(aVar, "playbackParameters", af.a("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(vVar.f8759b), Float.valueOf(vVar.f8760c), Boolean.valueOf(vVar.f8761d)));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i) {
        String str;
        int c9 = aVar.f6303b.c();
        int b9 = aVar.f6303b.b();
        StringBuilder sb = new StringBuilder("timelineChanged [");
        sb.append(i(aVar));
        sb.append(", periodCount=");
        sb.append(c9);
        sb.append(", windowCount=");
        sb.append(b9);
        sb.append(", reason=");
        if (i == 0) {
            str = "PREPARED";
        } else if (i == 1) {
            str = "RESET";
        } else if (i != 2) {
            str = "?";
        } else {
            str = "DYNAMIC";
        }
        sb.append(str);
        a(sb.toString());
        for (int i6 = 0; i6 < Math.min(c9, 3); i6++) {
            aVar.f6303b.a(i6, this.f8404f, false);
            a(u1.h.g(new StringBuilder("  period ["), a(com.anythink.basead.exoplayer.b.a(this.f8404f.f6345d)), "]"));
        }
        if (c9 > 3) {
            a("  ...");
        }
        for (int i9 = 0; i9 < Math.min(b9, 3); i9++) {
            aVar.f6303b.a(i9, this.f8403e, false);
            a("  window [" + a(com.anythink.basead.exoplayer.b.a(this.f8403e.i)) + ", " + this.f8403e.f6351d + ", " + this.f8403e.f6352e + "]");
        }
        if (b9 > 3) {
            a("  ...");
        }
        a("]");
    }

    private String b(b.a aVar, String str, String str2) {
        return com.anythink.basead.exoplayer.f.f.o(AbstractC5049e.c(str, " ["), i(aVar), ", ", str2, "]");
    }

    private static String b(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i != 4) {
            return "?";
        }
        return "YES";
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar, int i) {
        String str;
        if (i == 0) {
            str = "PERIOD_TRANSITION";
        } else if (i == 1) {
            str = "SEEK";
        } else if (i == 2) {
            str = "SEEK_ADJUSTMENT";
        } else if (i == 3) {
            str = "AD_INSERTION";
        } else if (i != 4) {
            str = "?";
        } else {
            str = "INTERNAL";
        }
        a(aVar, "positionDiscontinuity", str);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.basead.exoplayer.g gVar) {
        a(b(aVar, "playerFailed"), gVar);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.basead.exoplayer.i.g gVar) {
        e.a aVar2;
        int i;
        String str;
        com.anythink.basead.exoplayer.i.e eVar = this.f8402d;
        e.a a9 = eVar != null ? eVar.a() : null;
        if (a9 == null) {
            a(aVar, "tracksChanged", "[]");
            return;
        }
        a(u1.h.g(new StringBuilder("tracksChanged ["), i(aVar), ", "));
        int a10 = a9.a();
        int i6 = 0;
        while (true) {
            String str2 = "  ]";
            String str3 = "    ]";
            if (i6 >= a10) {
                break;
            }
            com.anythink.basead.exoplayer.h.af b9 = a9.b(i6);
            com.anythink.basead.exoplayer.i.f a11 = gVar.a(i6);
            if (b9.f7516b > 0) {
                a(D.y.k(i6, "  Renderer:", " ["));
                int i9 = 0;
                while (i9 < b9.f7516b) {
                    com.anythink.basead.exoplayer.h.ae a12 = b9.a(i9);
                    int i10 = a10;
                    int i11 = a12.f7512a;
                    String str4 = str2;
                    int a13 = a9.a(i6, i9);
                    String str5 = str3;
                    if (i11 < 2) {
                        str = "N/A";
                    } else if (a13 == 0) {
                        str = "NO";
                    } else if (a13 == 8) {
                        str = "YES_NOT_SEAMLESS";
                    } else if (a13 != 16) {
                        str = "?";
                    } else {
                        str = "YES";
                    }
                    a("    Group:" + i9 + ", adaptive_supported=" + str + " [");
                    int i12 = 0;
                    while (i12 < a12.f7512a) {
                        a("      " + a((a11 == null || a11.f() != a12 || a11.c(i12) == -1) ? false : true) + " Track:" + i12 + ", " + com.anythink.basead.exoplayer.m.c(a12.a(i12)) + ", supported=" + b(a9.a(i6, i9, i12)));
                        i12++;
                        a9 = a9;
                    }
                    a(str5);
                    i9++;
                    a10 = i10;
                    str2 = str4;
                    str3 = str5;
                }
                aVar2 = a9;
                i = a10;
                String str6 = str2;
                String str7 = str3;
                if (a11 != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= a11.g()) {
                            break;
                        }
                        com.anythink.basead.exoplayer.g.a aVar3 = a11.a(i13).f8663f;
                        if (aVar3 != null) {
                            a("    Metadata [");
                            a(aVar3, "      ");
                            a(str7);
                            break;
                        }
                        i13++;
                    }
                }
                a(str6);
            } else {
                aVar2 = a9;
                i = a10;
            }
            i6++;
            a10 = i;
            a9 = aVar2;
        }
        com.anythink.basead.exoplayer.h.af b10 = a9.b();
        if (b10.f7516b > 0) {
            a("  Renderer:None [");
            for (int i14 = 0; i14 < b10.f7516b; i14++) {
                a(D.y.k(i14, "    Group:", " ["));
                com.anythink.basead.exoplayer.h.ae a14 = b10.a(i14);
                for (int i15 = 0; i15 < a14.f7512a; i15++) {
                    a("      " + a(false) + " Track:" + i15 + ", " + com.anythink.basead.exoplayer.m.c(a14.a(i15)) + ", supported=" + b(0));
                }
                a("    ]");
            }
            a("  ]");
        }
        a("]");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.basead.exoplayer.g.a aVar2) {
        a(u1.h.g(new StringBuilder("metadata ["), i(aVar), ", "));
        a(aVar2, "  ");
        a("]");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i, String str) {
        a(aVar, "decoderInitialized", D.y.s(new StringBuilder(), f(i), ", ", str));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i, com.anythink.basead.exoplayer.m mVar) {
        a(aVar, "decoderInputFormatChanged", f(i) + ", " + com.anythink.basead.exoplayer.m.c(mVar));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i, long j6, long j9) {
        a(aVar, "audioTrackUnderrun", i + ", " + j6 + ", " + j9 + "]", (Throwable) null);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, Surface surface) {
        a(aVar, "renderedFirstFrame", surface.toString());
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, IOException iOException) {
        a(aVar, "loadError", (Exception) iOException);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i, int i6) {
        a(aVar, "viewportSizeChanged", i + ", " + i6);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, NetworkInfo networkInfo) {
        a(aVar, "networkTypeChanged", networkInfo == null ? "none" : networkInfo.toString());
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, t.c cVar) {
        a(aVar, "downstreamFormatChanged", com.anythink.basead.exoplayer.m.c(cVar.f7813c));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, Exception exc) {
        a(aVar, "drmSessionManagerError", exc);
    }

    private static void a(String str) {
        Log.d(f8399a, str);
    }

    private static void a(String str, Throwable th) {
        Log.e(f8399a, str, th);
    }

    private void a(b.a aVar, String str) {
        a(b(aVar, str));
    }

    private void a(b.a aVar, String str, String str2) {
        a(b(aVar, str, str2));
    }

    private void a(b.a aVar, String str, Throwable th) {
        a(b(aVar, str), th);
    }

    private void a(b.a aVar, String str, String str2, Throwable th) {
        a(b(aVar, str, str2), th);
    }

    private void a(b.a aVar, String str, Exception exc) {
        a(aVar, "internalError", str, exc);
    }

    private static void a(com.anythink.basead.exoplayer.g.a aVar, String str) {
        for (int i = 0; i < aVar.a(); i++) {
            StringBuilder b9 = AbstractC5049e.b(str);
            b9.append(aVar.a(i));
            a(b9.toString());
        }
    }

    private static String a(long j6) {
        return j6 == com.anythink.basead.exoplayer.b.f6382b ? "?" : f8401c.format(j6 / 1000.0f);
    }

    private static String a(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "BUFFERING";
        }
        if (i == 3) {
            return "READY";
        }
        if (i != 4) {
            return "?";
        }
        return "ENDED";
    }

    private static String a(int i, int i6) {
        if (i < 2) {
            return "N/A";
        }
        if (i6 == 0) {
            return "NO";
        }
        if (i6 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i6 != 16) {
            return "?";
        }
        return "YES";
    }

    private static String a(com.anythink.basead.exoplayer.i.f fVar, com.anythink.basead.exoplayer.h.ae aeVar, int i) {
        return a((fVar == null || fVar.f() != aeVar || fVar.c(i) == -1) ? false : true);
    }

    private static String a(boolean z3) {
        return z3 ? "[X]" : "[ ]";
    }
}
