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
import com.google.android.gms.internal.ads.AbstractC2659Kg;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC2991bG;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2524Ch;
import com.google.android.gms.internal.ads.C2764Qj;
import com.google.android.gms.internal.ads.C3029c1;
import com.google.android.gms.internal.ads.C3177ep;
import com.google.android.gms.internal.ads.C3428jP;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3646na;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.C3754pa;
import com.google.android.gms.internal.ads.C3879rs;
import com.google.android.gms.internal.ads.C4042ut;
import com.google.android.gms.internal.ads.C4201xq;
import com.google.android.gms.internal.ads.C4203xs;
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
import com.google.android.gms.internal.ads.RunnableC3830qw;
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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.consent_sdk.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4323b {

    /* renamed from: j, reason: collision with root package name */
    public static C4323b f36416j;

    /* renamed from: a, reason: collision with root package name */
    public Object f36417a;

    /* renamed from: b, reason: collision with root package name */
    public Object f36418b;

    /* renamed from: c, reason: collision with root package name */
    public Object f36419c;

    /* renamed from: d, reason: collision with root package name */
    public Object f36420d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36421e;

    /* renamed from: f, reason: collision with root package name */
    public Object f36422f;

    /* renamed from: g, reason: collision with root package name */
    public Object f36423g;

    /* renamed from: h, reason: collision with root package name */
    public Object f36424h;
    public Object i;

    public C4323b(Application application) {
        this.f36417a = this;
        C4409w2 c4409w2 = new C4409w2(8, application);
        this.f36418b = c4409w2;
        Z2 a9 = Z2.a(new C4335e(c4409w2, 1));
        this.f36419c = a9;
        Z2 a10 = Z2.a(AbstractC4414y.f36564b);
        this.f36420d = a10;
        Z2 a11 = Z2.a(new C4409w2(4, new C4409w2(this)));
        this.f36421e = a11;
        E1 e12 = new E1(c4409w2, a9, 1);
        Z2 a12 = Z2.a(new J1(24));
        this.f36422f = a12;
        C4339f c4339f = new C4339f(c4409w2, a9, Z2.a(new E1(c4409w2, Z2.a(new C4335e(c4409w2, 0)), 0)));
        this.i = c4339f;
        Z2 a13 = Z2.a(new C4339f(a10, c4409w2, Z2.a(new C4335e(c4409w2, 3))));
        this.f36423g = a13;
        this.f36424h = Z2.a(new S0.i(a9, new C2524Ch(c4409w2, a10, a9, a11, e12, new S0.i(a12, c4339f, a9, a13, 4), a12, a13), a11, a13, 5));
    }

    public static C4323b b(Context context) {
        C4323b c4323b;
        synchronized (C4323b.class) {
            try {
                if (f36416j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f36416j = new C4323b(application);
                }
                c4323b = f36416j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4323b;
    }

    public TO a(RO ro) {
        OO oo;
        int i;
        boolean booleanValue;
        int i4;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int directPlaybackSupport;
        h(ro);
        S0.s sVar = (S0.s) this.i;
        sVar.getClass();
        DP dp = (DP) ro.f27955a;
        dp.getClass();
        C2764Qj c2764Qj = (C2764Qj) ro.f27956b;
        c2764Qj.getClass();
        int i6 = Build.VERSION.SDK_INT;
        int i9 = 0;
        String str = dp.f25176o;
        if (i6 < 29 || (i = dp.J) == -1) {
            oo = OO.f27382d;
        } else {
            Boolean bool = (Boolean) sVar.f2970v;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = (Context) sVar.f2969u;
                if (context != null) {
                    String parameters = AbstractC2659Kg.b(context).getParameters("offloadVariableRateSupported");
                    sVar.f2970v = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    sVar.f2970v = Boolean.FALSE;
                }
                booleanValue = ((Boolean) sVar.f2970v).booleanValue();
            }
            str.getClass();
            int g9 = H4.g(str, dp.f25172k);
            if (g9 != 0) {
                switch (g9) {
                    case 2:
                    case 3:
                        i4 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i4 = 21;
                        break;
                    case 7:
                    case 8:
                        i4 = 23;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        i4 = 28;
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
                        i4 = Integer.MAX_VALUE;
                        break;
                    case 14:
                        i4 = 25;
                        break;
                    case 20:
                        i4 = 30;
                        break;
                    case 21:
                    case 22:
                        i4 = 31;
                        break;
                    case 30:
                    case 31:
                        i4 = 34;
                        break;
                }
                if (i6 >= i4) {
                    int i10 = dp.f25155I;
                    if (i10 == -1) {
                        i10 = AbstractC3182eu.e(dp.f25154H);
                    }
                    if (i10 != 0) {
                        try {
                            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i10).setEncoding(g9).build();
                            if (i6 >= 33) {
                                directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, c2764Qj.a());
                                if ((directPlaybackSupport & 1) == 0) {
                                    oo = OO.f27382d;
                                } else {
                                    boolean z6 = (directPlaybackSupport & 3) == 3;
                                    com.google.android.gms.internal.ads.I2 i22 = new com.google.android.gms.internal.ads.I2();
                                    i22.f26176a = true;
                                    i22.f26177b = z6;
                                    i22.f26178c = booleanValue;
                                    oo = i22.b();
                                }
                            } else if (i6 >= 31) {
                                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, c2764Qj.a());
                                if (playbackOffloadSupport == 0) {
                                    oo = OO.f27382d;
                                } else {
                                    com.google.android.gms.internal.ads.I2 i23 = new com.google.android.gms.internal.ads.I2();
                                    boolean z9 = i6 > 32 && playbackOffloadSupport == 2;
                                    i23.f26176a = true;
                                    i23.f26177b = z9;
                                    i23.f26178c = booleanValue;
                                    oo = i23.b();
                                }
                            } else {
                                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, c2764Qj.a());
                                if (isOffloadedPlaybackSupported) {
                                    com.google.android.gms.internal.ads.I2 i24 = new com.google.android.gms.internal.ads.I2();
                                    i24.f26176a = true;
                                    i24.f26178c = booleanValue;
                                    oo = i24.b();
                                } else {
                                    oo = OO.f27382d;
                                }
                            }
                        } catch (IllegalArgumentException unused) {
                            oo = OO.f27382d;
                        }
                    } else {
                        oo = OO.f27382d;
                    }
                }
            }
            oo = OO.f27382d;
        }
        SO so = new SO();
        if (!Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9251w) ? ((KO) this.f36421e).b(dp, c2764Qj) != null : dp.f25156K == 2) {
            i9 = 2;
        }
        so.f28191a = i9;
        so.f28192b = oo.f27383a;
        so.f28193c = oo.f27384b;
        so.f28194d = oo.f27385c;
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
        boolean z6;
        int i;
        C2764Qj c2764Qj;
        int max;
        int i4;
        int i6;
        h(ro);
        DP dp = (DP) ro.f27955a;
        String str = dp.f25176o;
        boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9251w);
        C2764Qj c2764Qj2 = (C2764Qj) ro.f27956b;
        if (equals) {
            int i9 = dp.f25156K;
            AbstractC2792Sd.i(AbstractC3182eu.d(i9));
            int i10 = dp.f25154H;
            int i11 = dp.f25155I;
            if (i11 == -1) {
                i11 = AbstractC3182eu.e(i10);
            }
            i = AbstractC3182eu.f(i9) * i10;
            intValue2 = i11;
            z6 = false;
            intValue = i9;
        } else {
            OO oo = OO.f27382d;
            Pair b9 = ((KO) this.f36421e).b(dp, c2764Qj2);
            if (b9 == null) {
                throw new QO("Unable to configure passthrough for: ".concat(String.valueOf(dp)));
            }
            intValue = ((Integer) b9.first).intValue();
            intValue2 = ((Integer) b9.second).intValue();
            z6 = 2;
            i = -1;
        }
        boolean equals2 = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9211F);
        int i12 = dp.f25171j;
        if (equals2 && i12 == -1) {
            i12 = 768000;
        }
        int i13 = dp.J;
        int i14 = ro.f27960f;
        if (i14 != -1) {
            c2764Qj = c2764Qj2;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue2, intValue);
            AbstractC2792Sd.H(minBufferSize != -2);
            if (i == -1) {
                i = 1;
            }
            int i15 = 250000;
            if (z6) {
                if (!z6) {
                    if (intValue == 5) {
                        i15 = 500000;
                    } else if (intValue == 8) {
                        i15 = 1000000;
                        i4 = 8;
                        if (i12 == -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            i6 = AbstractC2991bG.p(i12, 8);
                        } else {
                            int Q8 = MA.Q(i4);
                            AbstractC2792Sd.H(Q8 != -2147483647);
                            i6 = Q8;
                        }
                        max = UC.a((i15 * i6) / 1000000);
                    }
                    i4 = intValue;
                    if (i12 == -1) {
                    }
                    max = UC.a((i15 * i6) / 1000000);
                } else {
                    int Q9 = MA.Q(intValue);
                    AbstractC2792Sd.H(Q9 != -2147483647);
                    max = UC.a((Q9 * 50000000) / 1000000);
                }
                c2764Qj = c2764Qj2;
            } else {
                long j6 = i13;
                long j9 = i;
                int a9 = UC.a(((250000 * j6) * j9) / 1000000);
                c2764Qj = c2764Qj2;
                int a10 = UC.a(((750000 * j6) * j9) / 1000000);
                String str2 = AbstractC3182eu.f30782a;
                max = Math.max(a9, Math.min(minBufferSize * 4, a10));
            }
            i14 = (((Math.max(minBufferSize, max) + i) - 1) / i) * i;
        }
        C3029c1 c3029c1 = new C3029c1();
        C2764Qj c2764Qj3 = C2764Qj.f27843b;
        c3029c1.f30192b = i13;
        c3029c1.f30193c = intValue2;
        c3029c1.f30191a = intValue;
        c3029c1.f30194d = i14;
        c3029c1.f30195e = ro.f27958d;
        c3029c1.f30197g = c2764Qj;
        c3029c1.f30196f = ro.f27959e;
        return new VO(c3029c1);
    }

    public LinkedHashMap d(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            C3646na c3646na = (C3646na) ((HashMap) this.f36419c).get(str);
            if (c3646na == null) {
                c3646na = C3646na.f33520b;
            }
            linkedHashMap3.put(str, c3646na.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public C3698oP e(C4323b c4323b) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f36417a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f15190q);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) c4323b.f36417a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    F.d dVar = (F.d) c4323b.f36418b;
                    if (dVar != null) {
                        jsonWriter.name(b.c.f12223d);
                        jsonWriter.beginObject();
                        int i = dVar.f917b;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i4 = i - 1;
                            if (i4 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i4 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) dVar.f918c;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) dVar.f919d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) c4323b.f36419c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) c4323b.f36420d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) c4323b.f36421e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    l4.q qVar = (l4.q) c4323b.f36422f;
                    if (qVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) qVar.f38945n;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) qVar.f38946u;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d9 = (Double) qVar.f38947v;
                        if (d9 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d9);
                        }
                        List<C4398u> list = (List) qVar.f38948w;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (C4398u c4398u : list) {
                                jsonWriter.beginObject();
                                Integer num4 = c4398u.f36533a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = c4398u.f36534b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = c4398u.f36535c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = c4398u.f36536d;
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
                    b3.e eVar = (b3.e) c4323b.f36423g;
                    if (eVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) eVar.f5557u;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) eVar.f5558v;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) eVar.f5559w;
                        if (str6 != null) {
                            jsonWriter.name(com.anythink.expressad.foundation.g.a.i);
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((J1) c4323b.f36424h) != null) {
                        jsonWriter.name(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO);
                        jsonWriter.beginObject();
                        jsonWriter.name(com.anythink.expressad.foundation.g.a.i);
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) c4323b.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((EnumC4394t) it.next()).ordinal()) {
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
                        C3698oP l9 = C3698oP.l(new JsonReader(new StringReader(headerField)));
                        l9.f33686c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return l9;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            C3698oP l10 = C3698oP.l(jsonReader);
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
            throw new C4364l0(4, e9, "The server timed out.");
        } catch (IOException e10) {
            throw new C4364l0(2, e10, "Error making request.");
        }
    }

    public C3428jP f(VO vo) {
        Context context;
        Context createDeviceContext;
        int deviceId;
        try {
            int i = vo.f28992f;
            int i4 = vo.f28993g;
            Context context2 = null;
            if (i4 != -1 && (context = (Context) this.f36417a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = (Context) this.f36424h;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i4) {
                    }
                    context2 = (Context) this.f36424h;
                    i = 0;
                }
                createDeviceContext = context.createDeviceContext(i4);
                this.f36424h = createDeviceContext;
                context2 = (Context) this.f36424h;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(vo.f28991e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(vo.f28988b).setChannelMask(vo.f28989c).setEncoding(vo.f28987a).build()).setTransferMode(1).setBufferSizeInBytes(vo.f28990d).setSessionId(i);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i6 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new C3428jP(build, vo, (C4042ut) this.f36418b, (com.google.android.gms.internal.ads.V2) this.f36420d);
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

    public void g(LinkedHashMap linkedHashMap, C3754pa c3754pa) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse((String) this.f36420d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (c3754pa != null) {
            StringBuilder sb = new StringBuilder(uri);
            String str = c3754pa.f33861a;
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                sb.append(str);
            }
            String str2 = c3754pa.f33862b;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&blat=");
                sb.append(str2);
            }
            uri = sb.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!((AtomicBoolean) this.f36424h).get()) {
            w2.D d9 = C4906k.f40186C.f40191c;
            new w2.u((Context) this.f36421e, (String) this.f36422f, uri, null).l();
            return;
        }
        File file = (File) this.i;
        try {
            if (file == null) {
                int i = w2.z.f41712b;
                x2.i.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
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
                    int i4 = w2.z.f41712b;
                    x2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                int i6 = w2.z.f41712b;
                x2.i.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        x2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        int i9 = w2.z.f41712b;
                        x2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
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
        C2521Ce c2521Ce = (C2521Ce) this.f36422f;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) ro.f27957c;
        C2764Qj c2764Qj = (C2764Qj) ro.f27956b;
        if (c2521Ce == null && (context = (Context) this.f36417a) != null) {
            C2521Ce c2521Ce2 = new C2521Ce(context, new C4201xq(19, this), c2764Qj, audioDeviceInfo);
            this.f36422f = c2521Ce2;
            if (c2521Ce2.f24909u) {
                a9 = (KO) c2521Ce2.f24905B;
                a9.getClass();
            } else {
                c2521Ce2.f24909u = true;
                MO mo = (MO) c2521Ce2.f24914z;
                if (mo != null) {
                    mo.f27084a.registerContentObserver(mo.f27085b, false, mo);
                }
                Handler handler = (Handler) c2521Ce2.f24911w;
                Context context2 = c2521Ce2.f24908n;
                AbstractC2659Kg.b(context2).registerAudioDeviceCallback((LO) c2521Ce2.f24912x, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((com.google.android.gms.internal.ads.M) c2521Ce2.f24904A) == null) {
                    c2521Ce2.f24904A = new com.google.android.gms.internal.ads.M(context2, new RunnableC3830qw(16, c2521Ce2), Boolean.valueOf(AbstractC3182eu.j(context2)));
                }
                a9 = KO.a(context2, context2.registerReceiver((Q0.d) c2521Ce2.f24913y, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C2764Qj) c2521Ce2.f24907D, (AudioDeviceInfo) c2521Ce2.f24906C, c2521Ce2.j());
                c2521Ce2.f24905B = a9;
            }
            this.f36421e = a9;
        } else if (c2521Ce != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) c2521Ce.f24906C)) {
                c2521Ce.f24906C = audioDeviceInfo;
                C2764Qj c2764Qj2 = (C2764Qj) c2521Ce.f24907D;
                List j6 = c2521Ce.j();
                C3523lC c3523lC = KO.f26667e;
                IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context3 = c2521Ce.f24908n;
                c2521Ce.k(KO.a(context3, context3.registerReceiver(null, intentFilter), c2764Qj2, audioDeviceInfo, j6));
            }
            C2521Ce c2521Ce3 = (C2521Ce) this.f36422f;
            if (!Objects.equals(c2764Qj, (C2764Qj) c2521Ce3.f24907D)) {
                c2521Ce3.f24907D = c2764Qj;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) c2521Ce3.f24906C;
                List j9 = c2521Ce3.j();
                C3523lC c3523lC2 = KO.f26667e;
                IntentFilter intentFilter2 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context4 = c2521Ce3.f24908n;
                c2521Ce3.k(KO.a(context4, context4.registerReceiver(null, intentFilter2), c2764Qj, audioDeviceInfo2, j9));
            }
        }
        ((KO) this.f36421e).getClass();
    }

    public void i() {
        if (((Context) this.f36417a) == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = (Looper) this.f36423g;
        boolean z6 = true;
        if (looper != null && looper != myLooper) {
            z6 = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z6) {
            throw new IllegalStateException(AbstractC2659Kg.x("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f36423g = myLooper;
    }

    public C4323b() {
        this.f36417a = new ArrayBlockingQueue(100);
        this.f36418b = new LinkedHashMap();
        this.f36419c = new HashMap();
        this.f36423g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public C4323b(PN pn, HN hn, com.google.android.gms.internal.ads.V2 v22, int i, int i4, int i6, int i9) {
        this.f36417a = pn;
        this.f36419c = hn;
        this.f36420d = new K7();
        this.f36421e = v22.x(pn.f27559L, new C3177ep(1, this));
        this.f36422f = new C3879rs(this, i);
        this.f36423g = new C4203xs(this, i4);
        this.f36424h = new As(this, i6);
        this.i = new Fs(this, i9);
        Zr zr = new Zr(this);
        this.f36418b = zr;
        pn.f27555G.a(zr);
    }
}
