package com.anythink.basead.exoplayer.k;

import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.anythink.basead.exoplayer.a.b;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.i.e;
import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class i implements com.anythink.basead.exoplayer.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9185a = "EventLogger";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9186b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final NumberFormat f9187c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.e f9188d;

    /* renamed from: e, reason: collision with root package name */
    private final ae.b f9189e = new ae.b();

    /* renamed from: f, reason: collision with root package name */
    private final ae.a f9190f = new ae.a();

    /* renamed from: g, reason: collision with root package name */
    private final long f9191g = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f9187c = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    private i(com.anythink.basead.exoplayer.i.e eVar) {
        this.f9188d = eVar;
    }

    private String i(b.a aVar) {
        String str = "window=" + aVar.f7090c;
        if (aVar.f7091d != null) {
            StringBuilder c9 = AbstractC5050e.c(str, ", period=");
            c9.append(aVar.f7091d.f8553a);
            str = c9.toString();
            if (aVar.f7091d.a()) {
                StringBuilder c10 = AbstractC5050e.c(str, ", adGroup=");
                c10.append(aVar.f7091d.f8554b);
                StringBuilder c11 = AbstractC5050e.c(c10.toString(), ", ad=");
                c11.append(aVar.f7091d.f8555c);
                str = c11.toString();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(aVar.f7088a - this.f9191g));
        sb.append(", ");
        return D.x.p(sb, a(aVar.f7093f), ", ", str);
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
    public final void a(b.a aVar, boolean z6, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z6);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
        a(aVar, com.anythink.core.express.b.a.f18313b, sb.toString());
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar, boolean z6) {
        a(aVar, com.anythink.core.express.b.a.f18316e, Boolean.toString(z6));
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
            return com.anythink.core.express.b.a.f18317f;
        }
        if (i == 1) {
            return o.f9231b;
        }
        if (i == 2) {
            return o.f9230a;
        }
        if (i == 3) {
            return o.f9232c;
        }
        if (i == 4) {
            return "metadata";
        }
        if (i == 5) {
            return "none";
        }
        if (i >= 10000) {
            return D.x.j(i, "custom (", ")");
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
    public final void b(b.a aVar, int i, int i4) {
        a(aVar, "videoSizeChanged", i + ", " + i4);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void b(b.a aVar, t.c cVar) {
        a(aVar, "upstreamDiscarded", com.anythink.basead.exoplayer.m.c(cVar.f8599c));
    }

    private String b(b.a aVar, String str) {
        return Wv.i(AbstractC5050e.c(str, " ["), i(aVar), "]");
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
    public final void a(b.a aVar, boolean z6) {
        a(aVar, "shuffleModeEnabled", Boolean.toString(z6));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar) {
        a(aVar, "seekStarted");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.basead.exoplayer.v vVar) {
        a(aVar, "playbackParameters", af.a("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(vVar.f9545b), Float.valueOf(vVar.f9546c), Boolean.valueOf(vVar.f9547d)));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i) {
        String str;
        int c9 = aVar.f7089b.c();
        int b9 = aVar.f7089b.b();
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
        for (int i4 = 0; i4 < Math.min(c9, 3); i4++) {
            aVar.f7089b.a(i4, this.f9190f, false);
            a(Wv.i(new StringBuilder("  period ["), a(com.anythink.basead.exoplayer.b.a(this.f9190f.f7131d)), "]"));
        }
        if (c9 > 3) {
            a("  ...");
        }
        for (int i6 = 0; i6 < Math.min(b9, 3); i6++) {
            aVar.f7089b.a(i6, this.f9189e, false);
            a("  window [" + a(com.anythink.basead.exoplayer.b.a(this.f9189e.i)) + ", " + this.f9189e.f7137d + ", " + this.f9189e.f7138e + "]");
        }
        if (b9 > 3) {
            a("  ...");
        }
        a("]");
    }

    private String b(b.a aVar, String str, String str2) {
        return com.IceFishing.LiveIceFishing.k.r(AbstractC5050e.c(str, " ["), i(aVar), ", ", str2, "]");
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
        com.anythink.basead.exoplayer.i.e eVar = this.f9188d;
        e.a a9 = eVar != null ? eVar.a() : null;
        if (a9 == null) {
            a(aVar, "tracksChanged", "[]");
            return;
        }
        a(Wv.i(new StringBuilder("tracksChanged ["), i(aVar), ", "));
        int a10 = a9.a();
        int i4 = 0;
        while (true) {
            String str2 = "  ]";
            String str3 = "    ]";
            if (i4 >= a10) {
                break;
            }
            com.anythink.basead.exoplayer.h.af b9 = a9.b(i4);
            com.anythink.basead.exoplayer.i.f a11 = gVar.a(i4);
            if (b9.f8302b > 0) {
                a(D.x.j(i4, "  Renderer:", " ["));
                int i6 = 0;
                while (i6 < b9.f8302b) {
                    com.anythink.basead.exoplayer.h.ae a12 = b9.a(i6);
                    int i9 = a10;
                    int i10 = a12.f8298a;
                    String str4 = str2;
                    int a13 = a9.a(i4, i6);
                    String str5 = str3;
                    if (i10 < 2) {
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
                    a("    Group:" + i6 + ", adaptive_supported=" + str + " [");
                    int i11 = 0;
                    while (i11 < a12.f8298a) {
                        a("      " + a((a11 == null || a11.f() != a12 || a11.c(i11) == -1) ? false : true) + " Track:" + i11 + ", " + com.anythink.basead.exoplayer.m.c(a12.a(i11)) + ", supported=" + b(a9.a(i4, i6, i11)));
                        i11++;
                        a9 = a9;
                    }
                    a(str5);
                    i6++;
                    a10 = i9;
                    str2 = str4;
                    str3 = str5;
                }
                aVar2 = a9;
                i = a10;
                String str6 = str2;
                String str7 = str3;
                if (a11 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= a11.g()) {
                            break;
                        }
                        com.anythink.basead.exoplayer.g.a aVar3 = a11.a(i12).f9449f;
                        if (aVar3 != null) {
                            a("    Metadata [");
                            a(aVar3, "      ");
                            a(str7);
                            break;
                        }
                        i12++;
                    }
                }
                a(str6);
            } else {
                aVar2 = a9;
                i = a10;
            }
            i4++;
            a10 = i;
            a9 = aVar2;
        }
        com.anythink.basead.exoplayer.h.af b10 = a9.b();
        if (b10.f8302b > 0) {
            a("  Renderer:None [");
            for (int i13 = 0; i13 < b10.f8302b; i13++) {
                a(D.x.j(i13, "    Group:", " ["));
                com.anythink.basead.exoplayer.h.ae a14 = b10.a(i13);
                for (int i14 = 0; i14 < a14.f8298a; i14++) {
                    a("      " + a(false) + " Track:" + i14 + ", " + com.anythink.basead.exoplayer.m.c(a14.a(i14)) + ", supported=" + b(0));
                }
                a("    ]");
            }
            a("  ]");
        }
        a("]");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.basead.exoplayer.g.a aVar2) {
        a(Wv.i(new StringBuilder("metadata ["), i(aVar), ", "));
        a(aVar2, "  ");
        a("]");
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, int i, String str) {
        a(aVar, "decoderInitialized", D.x.p(new StringBuilder(), f(i), ", ", str));
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
    public final void a(b.a aVar, int i, int i4) {
        a(aVar, "viewportSizeChanged", i + ", " + i4);
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, NetworkInfo networkInfo) {
        a(aVar, "networkTypeChanged", networkInfo == null ? "none" : networkInfo.toString());
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, t.c cVar) {
        a(aVar, "downstreamFormatChanged", com.anythink.basead.exoplayer.m.c(cVar.f8599c));
    }

    @Override // com.anythink.basead.exoplayer.a.b
    public final void a(b.a aVar, Exception exc) {
        a(aVar, "drmSessionManagerError", exc);
    }

    private static void a(String str) {
        Log.d(f9185a, str);
    }

    private static void a(String str, Throwable th) {
        Log.e(f9185a, str, th);
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
            StringBuilder b9 = AbstractC5050e.b(str);
            b9.append(aVar.a(i));
            a(b9.toString());
        }
    }

    private static String a(long j6) {
        return j6 == com.anythink.basead.exoplayer.b.f7168b ? "?" : f9187c.format(j6 / 1000.0f);
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

    private static String a(int i, int i4) {
        if (i < 2) {
            return "N/A";
        }
        if (i4 == 0) {
            return "NO";
        }
        if (i4 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i4 != 16) {
            return "?";
        }
        return "YES";
    }

    private static String a(com.anythink.basead.exoplayer.i.f fVar, com.anythink.basead.exoplayer.h.ae aeVar, int i) {
        return a((fVar == null || fVar.f() != aeVar || fVar.c(i) == -1) ? false : true);
    }

    private static String a(boolean z6) {
        return z6 ? "[X]" : "[ ]";
    }
}
