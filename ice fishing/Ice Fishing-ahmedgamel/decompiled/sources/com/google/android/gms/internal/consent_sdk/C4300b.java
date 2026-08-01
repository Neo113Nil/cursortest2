package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Pair;
import android.webkit.WebSettings;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2639Kg;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2504Ch;
import com.google.android.gms.internal.ads.C2744Qj;
import com.google.android.gms.internal.ads.C3006c1;
import com.google.android.gms.internal.ads.C3154ep;
import com.google.android.gms.internal.ads.C3405jP;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3623na;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.gms.internal.ads.C3731pa;
import com.google.android.gms.internal.ads.C3856rs;
import com.google.android.gms.internal.ads.C4019ut;
import com.google.android.gms.internal.ads.C4178xq;
import com.google.android.gms.internal.ads.C4180xs;
import com.google.android.gms.internal.ads.DP;
import com.google.android.gms.internal.ads.Fs;
import com.google.android.gms.internal.ads.H4;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.K7;
import com.google.android.gms.internal.ads.KO;
import com.google.android.gms.internal.ads.LO;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.MO;
import com.google.android.gms.internal.ads.OO;
import com.google.android.gms.internal.ads.PN;
import com.google.android.gms.internal.ads.QO;
import com.google.android.gms.internal.ads.RO;
import com.google.android.gms.internal.ads.RunnableC3807qw;
import com.google.android.gms.internal.ads.SO;
import com.google.android.gms.internal.ads.TO;
import com.google.android.gms.internal.ads.UC;
import com.google.android.gms.internal.ads.UO;
import com.google.android.gms.internal.ads.VO;
import com.google.android.gms.internal.ads.Zr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.consent_sdk.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4300b {

    /* renamed from: j, reason: collision with root package name */
    public static C4300b f35647j;

    /* renamed from: a, reason: collision with root package name */
    public Object f35648a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35649b;

    /* renamed from: c, reason: collision with root package name */
    public Object f35650c;

    /* renamed from: d, reason: collision with root package name */
    public Object f35651d;

    /* renamed from: e, reason: collision with root package name */
    public Object f35652e;

    /* renamed from: f, reason: collision with root package name */
    public Object f35653f;

    /* renamed from: g, reason: collision with root package name */
    public Object f35654g;

    /* renamed from: h, reason: collision with root package name */
    public Object f35655h;
    public Object i;

    public C4300b(Application application) {
        this.f35648a = this;
        C4386w2 c4386w2 = new C4386w2(8, application);
        this.f35649b = c4386w2;
        Z2 a9 = Z2.a(new C4312e(c4386w2, 1));
        this.f35650c = a9;
        Z2 a10 = Z2.a(AbstractC4391y.f35795b);
        this.f35651d = a10;
        Z2 a11 = Z2.a(new C4386w2(4, new C4386w2(this)));
        this.f35652e = a11;
        E1 e12 = new E1(c4386w2, a9, 1);
        Z2 a12 = Z2.a(new J1(24));
        this.f35653f = a12;
        C4316f c4316f = new C4316f(c4386w2, a9, Z2.a(new E1(c4386w2, Z2.a(new C4312e(c4386w2, 0)), 0)));
        this.i = c4316f;
        Z2 a13 = Z2.a(new C4316f(a10, c4386w2, Z2.a(new C4312e(c4386w2, 3))));
        this.f35654g = a13;
        this.f35655h = Z2.a(new S0.i(a9, new C2504Ch(c4386w2, a10, a9, a11, e12, new S0.i(a12, c4316f, a9, a13, 4), a12, a13), a11, a13, 5));
    }

    public static C4300b b(Context context) {
        C4300b c4300b;
        synchronized (C4300b.class) {
            try {
                if (f35647j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f35647j = new C4300b(application);
                }
                c4300b = f35647j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4300b;
    }

    public TO a(RO ro) {
        OO oo;
        int i;
        boolean booleanValue;
        int i6;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int directPlaybackSupport;
        h(ro);
        S0.s sVar = (S0.s) this.i;
        sVar.getClass();
        DP dp = (DP) ro.f27199a;
        dp.getClass();
        C2744Qj c2744Qj = (C2744Qj) ro.f27200b;
        c2744Qj.getClass();
        int i9 = Build.VERSION.SDK_INT;
        int i10 = 0;
        String str = dp.f24431o;
        if (i9 < 29 || (i = dp.J) == -1) {
            oo = OO.f26600d;
        } else {
            Boolean bool = (Boolean) sVar.f2841v;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = (Context) sVar.f2840u;
                if (context != null) {
                    String parameters = AbstractC2639Kg.b(context).getParameters("offloadVariableRateSupported");
                    sVar.f2841v = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    sVar.f2841v = Boolean.FALSE;
                }
                booleanValue = ((Boolean) sVar.f2841v).booleanValue();
            }
            str.getClass();
            int g4 = H4.g(str, dp.f24427k);
            if (g4 != 0) {
                switch (g4) {
                    case 2:
                    case 3:
                        i6 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i6 = 21;
                        break;
                    case 7:
                    case 8:
                        i6 = 23;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        i6 = 28;
                        break;
                    case 13:
                    case 19:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    default:
                        i6 = Integer.MAX_VALUE;
                        break;
                    case 14:
                        i6 = 25;
                        break;
                    case 20:
                        i6 = 30;
                        break;
                    case 21:
                    case 22:
                        i6 = 31;
                        break;
                    case 30:
                    case 31:
                        i6 = 34;
                        break;
                }
                if (i9 >= i6) {
                    int i11 = dp.f24410I;
                    if (i11 == -1) {
                        i11 = AbstractC3159eu.e(dp.f24409H);
                    }
                    if (i11 != 0) {
                        try {
                            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i11).setEncoding(g4).build();
                            if (i9 >= 33) {
                                directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, c2744Qj.a());
                                if ((directPlaybackSupport & 1) == 0) {
                                    oo = OO.f26600d;
                                } else {
                                    boolean z3 = (directPlaybackSupport & 3) == 3;
                                    com.google.android.gms.internal.ads.I2 i22 = new com.google.android.gms.internal.ads.I2();
                                    i22.f25433a = true;
                                    i22.f25434b = z3;
                                    i22.f25435c = booleanValue;
                                    oo = i22.b();
                                }
                            } else if (i9 >= 31) {
                                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, c2744Qj.a());
                                if (playbackOffloadSupport == 0) {
                                    oo = OO.f26600d;
                                } else {
                                    com.google.android.gms.internal.ads.I2 i23 = new com.google.android.gms.internal.ads.I2();
                                    boolean z6 = i9 > 32 && playbackOffloadSupport == 2;
                                    i23.f25433a = true;
                                    i23.f25434b = z6;
                                    i23.f25435c = booleanValue;
                                    oo = i23.b();
                                }
                            } else {
                                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, c2744Qj.a());
                                if (isOffloadedPlaybackSupported) {
                                    com.google.android.gms.internal.ads.I2 i24 = new com.google.android.gms.internal.ads.I2();
                                    i24.f25433a = true;
                                    i24.f25435c = booleanValue;
                                    oo = i24.b();
                                } else {
                                    oo = OO.f26600d;
                                }
                            }
                        } catch (IllegalArgumentException unused) {
                            oo = OO.f26600d;
                        }
                    } else {
                        oo = OO.f26600d;
                    }
                }
            }
            oo = OO.f26600d;
        }
        SO so = new SO();
        if (!Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8465w) ? ((KO) this.f35652e).b(dp, c2744Qj) != null : dp.f24411K == 2) {
            i10 = 2;
        }
        so.f27478a = i10;
        so.f27479b = oo.f26601a;
        so.f27480c = oo.f26602b;
        so.f27481d = oo.f26603c;
        return so.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VO c(RO ro) {
        int intValue;
        int intValue2;
        boolean z3;
        int i;
        C2744Qj c2744Qj;
        int max;
        int i6;
        int i9;
        h(ro);
        DP dp = (DP) ro.f27199a;
        String str = dp.f24431o;
        boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8465w);
        C2744Qj c2744Qj2 = (C2744Qj) ro.f27200b;
        if (equals) {
            int i10 = dp.f24411K;
            AbstractC2772Sd.i(AbstractC3159eu.d(i10));
            int i11 = dp.f24409H;
            int i12 = dp.f24410I;
            if (i12 == -1) {
                i12 = AbstractC3159eu.e(i11);
            }
            i = AbstractC3159eu.f(i10) * i11;
            intValue2 = i12;
            z3 = false;
            intValue = i10;
        } else {
            OO oo = OO.f26600d;
            Pair b9 = ((KO) this.f35652e).b(dp, c2744Qj2);
            if (b9 == null) {
                throw new QO("Unable to configure passthrough for: ".concat(String.valueOf(dp)));
            }
            intValue = ((Integer) b9.first).intValue();
            intValue2 = ((Integer) b9.second).intValue();
            z3 = 2;
            i = -1;
        }
        boolean equals2 = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8425F);
        int i13 = dp.f24426j;
        if (equals2 && i13 == -1) {
            i13 = 768000;
        }
        int i14 = dp.J;
        int i15 = ro.f27204f;
        if (i15 != -1) {
            c2744Qj = c2744Qj2;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i14, intValue2, intValue);
            AbstractC2772Sd.H(minBufferSize != -2);
            if (i == -1) {
                i = 1;
            }
            int i16 = 250000;
            if (z3) {
                if (!z3) {
                    if (intValue == 5) {
                        i16 = 500000;
                    } else if (intValue == 8) {
                        i16 = 1000000;
                        i6 = 8;
                        if (i13 == -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            i9 = AbstractC2968bG.p(i13, 8);
                        } else {
                            int Q8 = MA.Q(i6);
                            AbstractC2772Sd.H(Q8 != -2147483647);
                            i9 = Q8;
                        }
                        max = UC.a((i16 * i9) / 1000000);
                    }
                    i6 = intValue;
                    if (i13 == -1) {
                    }
                    max = UC.a((i16 * i9) / 1000000);
                } else {
                    int Q9 = MA.Q(intValue);
                    AbstractC2772Sd.H(Q9 != -2147483647);
                    max = UC.a((Q9 * 50000000) / 1000000);
                }
                c2744Qj = c2744Qj2;
            } else {
                long j6 = i14;
                long j9 = i;
                int a9 = UC.a(((250000 * j6) * j9) / 1000000);
                c2744Qj = c2744Qj2;
                int a10 = UC.a(((750000 * j6) * j9) / 1000000);
                String str2 = AbstractC3159eu.f29993a;
                max = Math.max(a9, Math.min(minBufferSize * 4, a10));
            }
            i15 = (((Math.max(minBufferSize, max) + i) - 1) / i) * i;
        }
        C3006c1 c3006c1 = new C3006c1();
        C2744Qj c2744Qj3 = C2744Qj.f27058b;
        c3006c1.f29409b = i14;
        c3006c1.f29410c = intValue2;
        c3006c1.f29408a = intValue;
        c3006c1.f29411d = i15;
        c3006c1.f29412e = ro.f27202d;
        c3006c1.f29414g = c2744Qj;
        c3006c1.f29413f = ro.f27203e;
        return new VO(c3006c1);
    }

    public LinkedHashMap d(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            C3623na c3623na = (C3623na) ((HashMap) this.f35650c).get(str);
            if (c3623na == null) {
                c3623na = C3623na.f32733b;
            }
            linkedHashMap3.put(str, c3623na.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public C3675oP e(C4300b c4300b) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f35648a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f14404q);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) c4300b.f35648a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    F.d dVar = (F.d) c4300b.f35649b;
                    if (dVar != null) {
                        jsonWriter.name(b.c.f11437d);
                        jsonWriter.beginObject();
                        int i = dVar.f854b;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i6 = i - 1;
                            if (i6 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i6 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) dVar.f855c;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) dVar.f856d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) c4300b.f35650c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) c4300b.f35651d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) c4300b.f35652e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    j4.q qVar = (j4.q) c4300b.f35653f;
                    if (qVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) qVar.f38433n;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) qVar.f38434u;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d2 = (Double) qVar.f38435v;
                        if (d2 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d2);
                        }
                        List<C4375u> list = (List) qVar.f38436w;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (C4375u c4375u : list) {
                                jsonWriter.beginObject();
                                Integer num4 = c4375u.f35764a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = c4375u.f35765b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = c4375u.f35766c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = c4375u.f35767d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    Z2.e eVar = (Z2.e) c4300b.f35654g;
                    if (eVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) eVar.f4170u;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) eVar.f4171v;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) eVar.f4172w;
                        if (str6 != null) {
                            jsonWriter.name(com.anythink.expressad.foundation.g.a.i);
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((J1) c4300b.f35655h) != null) {
                        jsonWriter.name(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO);
                        jsonWriter.beginObject();
                        jsonWriter.name(com.anythink.expressad.foundation.g.a.i);
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) c4300b.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((EnumC4371t) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        C3675oP l9 = C3675oP.l(new JsonReader(new StringReader(headerField)));
                        l9.f32899c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return l9;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            C3675oP l10 = C3675oP.l(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return l10;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e9) {
            throw new C4341l0(4, e9, "The server timed out.");
        } catch (IOException e10) {
            throw new C4341l0(2, e10, "Error making request.");
        }
    }

    public C3405jP f(VO vo) {
        Context context;
        Context createDeviceContext;
        int deviceId;
        try {
            int i = vo.f28196f;
            int i6 = vo.f28197g;
            Context context2 = null;
            if (i6 != -1 && (context = (Context) this.f35648a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = (Context) this.f35655h;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i6) {
                    }
                    context2 = (Context) this.f35655h;
                    i = 0;
                }
                createDeviceContext = context.createDeviceContext(i6);
                this.f35655h = createDeviceContext;
                context2 = (Context) this.f35655h;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(vo.f28195e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(vo.f28192b).setChannelMask(vo.f28193c).setEncoding(vo.f28191a).build()).setTransferMode(1).setBufferSizeInBytes(vo.f28194d).setSessionId(i);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i9 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new C3405jP(build, vo, (C4019ut) this.f35649b, (com.google.android.gms.internal.ads.V2) this.f35651d);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new UO();
        } catch (IllegalArgumentException e9) {
            e = e9;
            throw new UO(e);
        } catch (UnsupportedOperationException e10) {
            e = e10;
            throw new UO(e);
        }
    }

    public void g(LinkedHashMap linkedHashMap, C3731pa c3731pa) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse((String) this.f35651d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (c3731pa != null) {
            StringBuilder sb = new StringBuilder(uri);
            String str = c3731pa.f33071a;
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                sb.append(str);
            }
            String str2 = c3731pa.f33072b;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&blat=");
                sb.append(str2);
            }
            uri = sb.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!((AtomicBoolean) this.f35655h).get()) {
            u2.D d2 = C4835j.f39733C.f39738c;
            new u2.u((Context) this.f35652e, (String) this.f35653f, uri, null).l();
            return;
        }
        File file = (File) this.i;
        try {
            if (file == null) {
                int i = u2.z.f41322b;
                v2.i.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e9) {
                e = e9;
            }
            try {
                fileOutputStream.write(uri.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                } catch (IOException e10) {
                    int i6 = u2.z.f41322b;
                    v2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                int i9 = u2.z.f41322b;
                v2.i.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        v2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        int i10 = u2.z.f41322b;
                        v2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void h(RO ro) {
        Context context;
        KO a9;
        i();
        C2501Ce c2501Ce = (C2501Ce) this.f35653f;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) ro.f27201c;
        C2744Qj c2744Qj = (C2744Qj) ro.f27200b;
        if (c2501Ce == null && (context = (Context) this.f35648a) != null) {
            C2501Ce c2501Ce2 = new C2501Ce(context, new C4178xq(19, this), c2744Qj, audioDeviceInfo);
            this.f35653f = c2501Ce2;
            if (c2501Ce2.f24174u) {
                a9 = (KO) c2501Ce2.f24170B;
                a9.getClass();
            } else {
                c2501Ce2.f24174u = true;
                MO mo = (MO) c2501Ce2.f24179z;
                if (mo != null) {
                    mo.f26293a.registerContentObserver(mo.f26294b, false, mo);
                }
                Handler handler = (Handler) c2501Ce2.f24176w;
                Context context2 = c2501Ce2.f24173n;
                AbstractC2639Kg.b(context2).registerAudioDeviceCallback((LO) c2501Ce2.f24177x, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((com.google.android.gms.internal.ads.M) c2501Ce2.f24169A) == null) {
                    c2501Ce2.f24169A = new com.google.android.gms.internal.ads.M(context2, new RunnableC3807qw(16, c2501Ce2), Boolean.valueOf(AbstractC3159eu.j(context2)));
                }
                a9 = KO.a(context2, context2.registerReceiver((Q0.d) c2501Ce2.f24178y, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C2744Qj) c2501Ce2.f24172D, (AudioDeviceInfo) c2501Ce2.f24171C, c2501Ce2.j());
                c2501Ce2.f24170B = a9;
            }
            this.f35652e = a9;
        } else if (c2501Ce != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) c2501Ce.f24171C)) {
                c2501Ce.f24171C = audioDeviceInfo;
                C2744Qj c2744Qj2 = (C2744Qj) c2501Ce.f24172D;
                List j6 = c2501Ce.j();
                C3500lC c3500lC = KO.f25915e;
                IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context3 = c2501Ce.f24173n;
                c2501Ce.k(KO.a(context3, context3.registerReceiver(null, intentFilter), c2744Qj2, audioDeviceInfo, j6));
            }
            C2501Ce c2501Ce3 = (C2501Ce) this.f35653f;
            if (!Objects.equals(c2744Qj, (C2744Qj) c2501Ce3.f24172D)) {
                c2501Ce3.f24172D = c2744Qj;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) c2501Ce3.f24171C;
                List j9 = c2501Ce3.j();
                C3500lC c3500lC2 = KO.f25915e;
                IntentFilter intentFilter2 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context4 = c2501Ce3.f24173n;
                c2501Ce3.k(KO.a(context4, context4.registerReceiver(null, intentFilter2), c2744Qj, audioDeviceInfo2, j9));
            }
        }
        ((KO) this.f35652e).getClass();
    }

    public void i() {
        if (((Context) this.f35648a) == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = (Looper) this.f35654g;
        boolean z3 = true;
        if (looper != null && looper != myLooper) {
            z3 = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z3) {
            throw new IllegalStateException(AbstractC2639Kg.x("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f35654g = myLooper;
    }

    public C4300b() {
        this.f35648a = new ArrayBlockingQueue(100);
        this.f35649b = new LinkedHashMap();
        this.f35650c = new HashMap();
        this.f35654g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public C4300b(PN pn, HN hn, com.google.android.gms.internal.ads.V2 v22, int i, int i6, int i9, int i10) {
        this.f35648a = pn;
        this.f35650c = hn;
        this.f35651d = new K7();
        this.f35652e = v22.x(pn.f26781L, new C3154ep(1, this));
        this.f35653f = new C3856rs(this, i);
        this.f35654g = new C4180xs(this, i6);
        this.f35655h = new As(this, i9);
        this.i = new Fs(this, i10);
        Zr zr = new Zr(this);
        this.f35649b = zr;
        pn.f26776G.a(zr);
    }
}
