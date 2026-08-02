package d6;

import A1.C0264f;
import A1.C0265g;
import A1.C0266h;
import A1.C0270l;
import A1.F;
import A1.J;
import A1.r;
import D.x;
import D1.C0296a;
import D1.C0297b;
import D1.C0298c;
import D1.C0301f;
import D1.C0302g;
import D1.D;
import D1.H;
import D1.m;
import D1.p;
import D1.t;
import S6.f;
import S6.g;
import U.n;
import U.o;
import U.q;
import a7.k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.view.ActionMode;
import android.widget.TextView;
import com.bumptech.glide.i;
import com.bumptech.glide.l;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.Wt;
import e7.e;
import i1.C4585b;
import i1.C4586c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.h;
import l.C4659e;
import m.Z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u1.j;
import w2.z;
import x.C5175n;
import x1.InterfaceC5183a;
import z0.C5214c;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final void a(Logger logger, l8.a aVar, l8.c cVar, String str) {
        logger.fine(cVar.f39009b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f39002a);
    }

    public static e b(Map extraHttpHeaders, String appId, String apiBaseUrl, boolean z6) {
        Duration ofSeconds;
        long nanos;
        g gVar;
        SSLContext sSLContext;
        h.e(extraHttpHeaders, "extraHttpHeaders");
        h.e(appId, "appId");
        h.e(apiBaseUrl, "apiBaseUrl");
        String endpoint = apiBaseUrl + "sdk/log?app_id=" + appId;
        h.e(endpoint, "endpoint");
        M6.g gVar2 = new M6.g();
        HashMap hashMap = gVar2.f1892e;
        hashMap.put("User-Agent", "OTel-OTLP-Exporter-Java/1.55.0");
        for (Map.Entry entry : extraHttpHeaders.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            URI uri = new URI(endpoint);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
            }
            gVar2.f1889b = uri.toString();
            ofSeconds = Duration.ofSeconds(10L);
            Objects.requireNonNull(ofSeconds, "timeout");
            nanos = ofSeconds.toNanos();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            Objects.requireNonNull(timeUnit, "unit");
            k6.d.a("timeout must be non-negative", nanos >= 0);
            gVar2.f1890c = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
            M6.d dVar = new M6.d(gVar2);
            boolean startsWith = gVar2.f1889b.startsWith("http://");
            HashMap hashMap2 = new HashMap();
            Iterator it = ServiceLoader.load(g.class, (ClassLoader) gVar2.f1897k.f38688u).iterator();
            while (it.hasNext()) {
                g gVar3 = (g) it.next();
                hashMap2.put(gVar3.getClass().getName(), gVar3);
            }
            if (hashMap2.isEmpty()) {
                throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
            }
            int size = hashMap2.size();
            Logger logger = M6.g.f1887l;
            if (size == 1) {
                gVar = (g) hashMap2.values().stream().findFirst().get();
            } else {
                String b9 = k6.d.b("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
                if (b9.isEmpty()) {
                    logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                    gVar = (g) hashMap2.values().stream().findFirst().get();
                } else {
                    if (!hashMap2.containsKey(b9)) {
                        throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(b9));
                    }
                    gVar = (g) hashMap2.get(b9);
                }
            }
            String str = gVar2.f1889b;
            long j6 = gVar2.f1890c;
            c4.e eVar = gVar2.f1894g;
            if (startsWith) {
                sSLContext = null;
            } else {
                eVar.getClass();
                try {
                    SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                    sSLContext2.init(null, null, null);
                    sSLContext = sSLContext2;
                } catch (KeyManagementException | NoSuchAlgorithmException e9) {
                    throw new IllegalArgumentException(e9);
                }
            }
            if (!startsWith) {
                eVar.getClass();
            }
            if (str == null) {
                throw new NullPointerException("Null endpoint");
            }
            gVar.getClass();
            f fVar = new f(str, j6, gVar2.f1891d, dVar, gVar2.f1895h, sSLContext);
            logger.log(Level.FINE, "Using HttpSender: ".concat(f.class.getName()));
            R6.b bVar = new R6.b(gVar2, new M6.b(new k(gVar2.f1888a), fVar, gVar2.i, gVar2.f1896j, gVar2.f1889b));
            return z6 ? new H5.b(bVar) : bVar;
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(endpoint), e10);
        }
    }

    public static l c(com.bumptech.glide.c cVar, ArrayList arrayList) {
        j c0301f;
        j c0296a;
        int i;
        Resources resources;
        String str;
        String str2;
        InterfaceC5183a interfaceC5183a = cVar.f24159n;
        i iVar = cVar.f24161v;
        Context applicationContext = iVar.getApplicationContext();
        C4585b c4585b = iVar.f24186h;
        l lVar = new l();
        m mVar = new m();
        K1.c cVar2 = lVar.f24199g;
        synchronized (cVar2) {
            cVar2.f1671a.add(mVar);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 27) {
            t tVar = new t();
            K1.c cVar3 = lVar.f24199g;
            synchronized (cVar3) {
                cVar3.f1671a.add(tVar);
            }
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList e9 = lVar.e();
        C2964aq c2964aq = cVar.f24162w;
        H1.b bVar = new H1.b(applicationContext, e9, interfaceC5183a, c2964aq);
        H h3 = new H(interfaceC5183a, new G3.e(4));
        p pVar = new p(lVar.e(), resources2.getDisplayMetrics(), interfaceC5183a, c2964aq);
        if (i4 < 28 || !((Map) c4585b.f38152u).containsKey(com.bumptech.glide.d.class)) {
            c0301f = new C0301f(pVar, 0);
            c0296a = new C0296a(2, pVar, c2964aq);
        } else {
            c0296a = new C0302g(1);
            c0301f = new C0302g(0);
        }
        Class<InputStream> cls = InputStream.class;
        if (i4 >= 28) {
            i = i4;
            resources = resources2;
            int i6 = 1;
            lVar.d("Animation", InputStream.class, Drawable.class, new F1.a(new C3067cm(i6, e9, c2964aq), i6));
            lVar.d("Animation", ByteBuffer.class, Drawable.class, new F1.a(new C3067cm(1, e9, c2964aq), 0));
        } else {
            i = i4;
            resources = resources2;
        }
        F1.c cVar4 = new F1.c(applicationContext);
        C0297b c0297b = new C0297b(c2964aq);
        I1.a aVar = new I1.a((byte) 0, 0);
        I1.e eVar = new I1.e(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        lVar.b(ByteBuffer.class, new A1.H(5));
        lVar.b(InputStream.class, new C4586c(2, c2964aq));
        lVar.d("Bitmap", ByteBuffer.class, Bitmap.class, c0301f);
        lVar.d("Bitmap", InputStream.class, Bitmap.class, c0296a);
        String str3 = Build.FINGERPRINT;
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if ("robolectric".equals(str3)) {
            str = str3;
            str2 = "Animation";
        } else {
            str = str3;
            str2 = "Animation";
            lVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0301f(pVar, 1));
        }
        lVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new H(interfaceC5183a, new G3.e(3)));
        lVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h3);
        A1.H h9 = A1.H.f33u;
        lVar.a(Bitmap.class, Bitmap.class, h9);
        lVar.d("Bitmap", Bitmap.class, Bitmap.class, new D(0));
        lVar.c(Bitmap.class, c0297b);
        Resources resources3 = resources;
        lVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0296a(resources3, c0301f));
        lVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0296a(resources3, c0296a));
        lVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0296a(resources3, h3));
        lVar.c(BitmapDrawable.class, new S0.e(1, interfaceC5183a, c0297b));
        String str4 = str2;
        lVar.d(str4, InputStream.class, H1.c.class, new H1.j(e9, bVar, c2964aq));
        lVar.d(str4, ByteBuffer.class, H1.c.class, bVar);
        lVar.c(H1.c.class, new G3.e(5));
        lVar.a(t1.d.class, t1.d.class, h9);
        lVar.d("Bitmap", t1.d.class, Bitmap.class, new C0298c(interfaceC5183a));
        lVar.d("legacy_append", Uri.class, Drawable.class, cVar4);
        lVar.d("legacy_append", Uri.class, Bitmap.class, new C0296a(1, cVar4, interfaceC5183a));
        lVar.h(new E1.a(0));
        lVar.a(File.class, ByteBuffer.class, new A1.H(6));
        lVar.a(File.class, InputStream.class, new C0270l(0, new A1.H(9)));
        lVar.d("legacy_append", File.class, File.class, new D(2));
        lVar.a(File.class, ParcelFileDescriptor.class, new C0270l(0, new A1.H(8)));
        lVar.a(File.class, File.class, h9);
        lVar.h(new com.bumptech.glide.load.data.k(c2964aq));
        if (!"robolectric".equals(str)) {
            lVar.h(new E1.a(2));
        }
        C0266h c0266h = new C0266h(applicationContext, 0);
        C0264f c0264f = new C0264f(applicationContext, 0);
        C0265g c0265g = new C0265g(applicationContext, 0);
        Class cls3 = Integer.TYPE;
        lVar.a(cls3, InputStream.class, c0266h);
        lVar.a(Integer.class, InputStream.class, c0266h);
        lVar.a(cls3, AssetFileDescriptor.class, c0264f);
        lVar.a(Integer.class, AssetFileDescriptor.class, c0264f);
        lVar.a(cls3, Drawable.class, c0265g);
        lVar.a(Integer.class, Drawable.class, c0265g);
        lVar.a(Uri.class, InputStream.class, new C0266h(applicationContext, 1));
        lVar.a(Uri.class, AssetFileDescriptor.class, new C0265g(applicationContext, 1));
        n4.c cVar5 = new n4.c(2, resources3);
        C4585b c4585b2 = new C4585b(2, resources3);
        F f2 = new F(resources3);
        lVar.a(Integer.class, Uri.class, cVar5);
        lVar.a(cls3, Uri.class, cVar5);
        lVar.a(Integer.class, AssetFileDescriptor.class, c4585b2);
        lVar.a(cls3, AssetFileDescriptor.class, c4585b2);
        lVar.a(Integer.class, InputStream.class, f2);
        lVar.a(cls3, InputStream.class, f2);
        lVar.a(String.class, InputStream.class, new C4586c(1));
        lVar.a(Uri.class, InputStream.class, new C4586c(1));
        lVar.a(String.class, InputStream.class, new A1.H(13));
        lVar.a(String.class, ParcelFileDescriptor.class, new A1.H(12));
        lVar.a(String.class, AssetFileDescriptor.class, new A1.H(11));
        int i9 = 1;
        lVar.a(Uri.class, InputStream.class, new C4585b(i9, applicationContext.getAssets()));
        lVar.a(Uri.class, AssetFileDescriptor.class, new I0.j(i9, applicationContext.getAssets()));
        int i10 = 1;
        lVar.a(Uri.class, InputStream.class, new r(applicationContext, i10));
        lVar.a(Uri.class, InputStream.class, new C0264f(applicationContext, i10));
        if (i >= 29) {
            lVar.a(Uri.class, InputStream.class, new B1.c(0, applicationContext, cls));
            lVar.a(Uri.class, ParcelFileDescriptor.class, new B1.c(0, applicationContext, cls2));
        }
        boolean containsKey = ((Map) c4585b.f38152u).containsKey(com.bumptech.glide.h.class);
        lVar.a(Uri.class, InputStream.class, new J(contentResolver, containsKey, 2));
        lVar.a(Uri.class, ParcelFileDescriptor.class, new J(contentResolver, containsKey, 1));
        lVar.a(Uri.class, AssetFileDescriptor.class, new J(contentResolver, containsKey, 0));
        lVar.a(Uri.class, InputStream.class, new A1.H(14));
        lVar.a(URL.class, InputStream.class, new G3.e(2));
        lVar.a(Uri.class, File.class, new r(applicationContext, 0));
        lVar.a(A1.m.class, InputStream.class, new C4585b(3));
        lVar.a(byte[].class, ByteBuffer.class, new A1.H(2));
        lVar.a(byte[].class, InputStream.class, new A1.H(4));
        lVar.a(Uri.class, Uri.class, h9);
        lVar.a(Drawable.class, Drawable.class, h9);
        lVar.d("legacy_append", Drawable.class, Drawable.class, new D(1));
        lVar.i(Bitmap.class, BitmapDrawable.class, new F(resources3));
        lVar.i(Bitmap.class, byte[].class, aVar);
        lVar.i(Drawable.class, byte[].class, new b3.e(5, interfaceC5183a, aVar, eVar));
        lVar.i(H1.c.class, byte[].class, eVar);
        H h10 = new H(interfaceC5183a, new O2.i(3));
        lVar.d("legacy_append", ByteBuffer.class, Bitmap.class, h10);
        lVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0296a(resources3, h10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw x.i(it);
        }
        return lVar;
    }

    public static final String d(long j6) {
        String str;
        if (j6 <= -999500000) {
            str = ((j6 - 500000000) / 1000000000) + " s ";
        } else if (j6 <= -999500) {
            str = ((j6 - 500000) / 1000000) + " ms";
        } else if (j6 <= 0) {
            str = ((j6 - 500) / 1000) + " µs";
        } else if (j6 < 999500) {
            str = ((j6 + 500) / 1000) + " µs";
        } else if (j6 < 999500000) {
            str = ((j6 + 500000) / 1000000) + " ms";
        } else {
            str = ((j6 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final int e(int i, int i4, int i6) {
        if (i6 > 0) {
            if (i < i4) {
                int i9 = i4 % i6;
                if (i9 < 0) {
                    i9 += i6;
                }
                int i10 = i % i6;
                if (i10 < 0) {
                    i10 += i6;
                }
                int i11 = (i9 - i10) % i6;
                if (i11 < 0) {
                    i11 += i6;
                }
                return i4 - i11;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i4) {
                int i12 = -i6;
                int i13 = i % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i4 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i15 + i4;
            }
        }
        return i4;
    }

    public static M.e f(Z z6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new M.e(o.c(z6));
        }
        TextPaint textPaint = new TextPaint(z6.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a9 = U.m.a(z6);
        int d9 = U.m.d(z6);
        if (z6.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (z6.getInputType() & 15) != 3) {
                boolean z9 = z6.getLayoutDirection() == 1;
                switch (z6.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z9) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(o.b(n.a(z6.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new M.e(textPaint, textDirectionHeuristic, a9, d9);
    }

    public static String g(String tableName, String triggerType) {
        h.e(tableName, "tableName");
        h.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static C5214c h(C4659e refHolder, SQLiteDatabase sQLiteDatabase) {
        h.e(refHolder, "refHolder");
        C5214c c5214c = (C5214c) refHolder.f38688u;
        if (c5214c != null && c5214c.f42198n.equals(sQLiteDatabase)) {
            return c5214c;
        }
        C5214c c5214c2 = new C5214c(sQLiteDatabase);
        refHolder.f38688u = c5214c2;
        return c5214c2;
    }

    public static String i(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        y8.h hVar = y8.h.f41925w;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        h.d(encoded, "getEncoded(...)");
        int i = 0;
        y8.h e9 = C5175n.e(encoded, 0, -1234567890);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(e9.f41926n, 0, e9.a());
        byte[] digest = messageDigest.digest();
        h.b(digest);
        new y8.h(digest);
        byte[] map = y8.a.f41909a;
        h.e(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length = digest.length - (digest.length % 3);
        int i4 = 0;
        while (i < length) {
            byte b9 = digest[i];
            int i6 = i + 2;
            byte b10 = digest[i + 1];
            i += 3;
            byte b11 = digest[i6];
            bArr[i4] = map[(b9 & 255) >> 2];
            bArr[i4 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i9 = i4 + 3;
            bArr[i4 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i4 += 4;
            bArr[i9] = map[b11 & com.anythink.core.common.s.a.c.f17105c];
        }
        int length2 = digest.length - length;
        if (length2 == 1) {
            byte b12 = digest[i];
            bArr[i4] = map[(b12 & 255) >> 2];
            bArr[1 + i4] = map[(b12 & 3) << 4];
            bArr[2 + i4] = 61;
            bArr[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i10 = i + 1;
            byte b13 = digest[i];
            byte b14 = digest[i10];
            bArr[i4] = map[(b13 & 255) >> 2];
            bArr[1 + i4] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr[i4 + 2] = map[(b14 & 15) << 2];
            bArr[i4 + 3] = 61;
        }
        sb.append(new String(bArr, Q7.a.f2701a));
        return sb.toString();
    }

    public static int j(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static void k(TextView textView, int i) {
        A8.b.d(i);
        if (Build.VERSION.SDK_INT >= 28) {
            o.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void l(TextView textView, int i) {
        A8.b.d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i4);
        }
    }

    public static void m(TextView textView, int i) {
        A8.b.d(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback n(ActionMode.Callback callback) {
        return (!(callback instanceof q) || Build.VERSION.SDK_INT < 26) ? callback : ((q) callback).f3245a;
    }

    public static ActionMode.Callback o(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static List p(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static ArrayList q(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONObject r(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, s(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, r(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray s(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(s(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(r(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void t(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    t(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    u(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e9) {
            throw new IOException(e9);
        }
    }

    public static void u(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    t(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    u(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e9) {
            throw new IOException(e9);
        }
    }

    public static JSONObject v(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static Bundle w(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj = null;
                        for (int i4 = 0; obj == null && i4 < length; i4++) {
                            obj = !jSONArray.isNull(i4) ? jSONArray.opt(i4) : null;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            int i6 = z.f41712b;
                            x2.i.f("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? w(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String str = "JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next;
                            int i9 = z.f41712b;
                            x2.i.f(str);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, w((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    int i10 = z.f41712b;
                    x2.i.f("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle;
    }

    public static String x(Wt wt) {
        if (wt == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            y(jsonWriter, wt);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e9) {
            int i = z.f41712b;
            x2.i.d("Error when writing JSON.", e9);
            return null;
        }
    }

    public static void y(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Wt) {
            t(jsonWriter, ((Wt) obj).f29211d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                y(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                y(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static JSONObject z(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }
}
